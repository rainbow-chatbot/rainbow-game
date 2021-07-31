/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [MainActivity.kt] created by Ji Sungbin on 21. 7. 22. 오후 10:34.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow

import android.app.Notification
import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import io.github.jisungbin.rainbow.database.DatabaseStore
import io.github.jisungbin.rainbow.database.RainbowDatabase
import io.github.jisungbin.rainbow.databinding.ActivityMainBinding
import io.github.jisungbin.rainbow.function.createNewUser
import io.github.jisungbin.rainbow.util.config.Command
import me.sungbin.kakaotalkbotbasemodule.library.KakaoBot
import me.sungbin.kakaotalkbotbasemodule.library.NotificationListener
import me.sungbin.kakaotalkbotbasemodule.library.util.BatteryUtil
import me.sungbin.kakaotalkbotbasemodule.library.util.NotificationUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = RainbowDatabase.instance(applicationContext).userDao()
        BatteryUtil.requestIgnoreBatteryOptimization(applicationContext)
        NotificationUtil.requestListenerPermission(applicationContext)

        KakaoBot().setBotListener(object : NotificationListener {
            override fun onMessageReceive(
                sender: String,
                _message: String,
                room: String,
                isGroupChat: Boolean,
                action: Notification.Action,
                profileImage: Bitmap,
                notificationImage: Bitmap?,
                bot: KakaoBot,
            ) {
                fun reply(message: String) {
                    bot.reply(action, message)
                }

                println(listOf(sender, _message, room))

                if (_message == Command.CheckBotRunning) {
                    reply(listOf("살았다!", "죽었다!").random())
                }

                if (_message.startsWith(Command.Prefix)) {
                    val message = _message.substring(1)
                    lifecycleScope.launchWhenCreated {
                        if (message == Command.Login) {
                            var user = DatabaseStore.getUserByNameOrNull(sender)
                            if (user == null) {
                                user = database.getUserFromNameOrNull(sender)
                                if (user == null) {
                                    user = createNewUser(sender)
                                    reply(
                                        """
                                        $sender 님의 기존 캐릭터가 없어서 새로 생성했어요!
                                        "${Command.ServiceName}" 에 오신걸 환영합니다!! :)
                                        
                                        [시작 캐릭터 정보]
                                        이름: ${user.villager.name.nameKRko}
                                        아이콘: ${user.villager.iconUri}
                                        성별: ${if (user.villager.gender == "Female") "여성" else "남성"}
                                        """.trimIndent()
                                    )
                                    database.update(user)
                                }
                            }
                        }

                        if (message == Command.MyCharacter) {
                            val user = createNewUser(sender)
                            val character = user.villager

                            val header = "[${sender}님 캐릭터 정보]"

                            val characterInfo = """
                                캐릭터 이름: ${character.name.nameKRko}
                                캐릭터 아이콘: ${character.iconUri}
                                캐릭터 전신샷: ${if (user.takePicture) character.imageUri else "먼저 사진관에서 사진을 찍어주세요."}
                                캐릭터 성별: ${if (character.gender == "Female") "여성" else "남성"}
                                캐릭터 말버릇: ${character.catchTranslations.catchKRko}
                                캐릭터 성격: ${character.personality}
                                캐릭터 생일: ${character.birthday}
                                캐릭터 종: ${character.species}
                                캐릭터 취미: ${character.hobby}
                                캐릭터 명언: ${character.saying}
                            """.trimIndent()

                            val content = header + "\n\n\n" + characterInfo
                            reply(content)
                        }
                    }
                }
            }

            override fun onBotCreate(bot: KakaoBot) {
                bot.enableBackgroundService()
            }

            override fun onBotDestroy(bot: KakaoBot) {
                bot.disableBackgroundService()
            }
        })
    }
}
