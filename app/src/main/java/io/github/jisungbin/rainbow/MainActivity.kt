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
import io.github.jisungbin.rainbow.databinding.ActivityMainBinding
import io.github.jisungbin.rainbow.user.getNewUser
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
                if (_message.startsWith(Command.Prefix)) {
                    fun reply(message: String) {
                        bot.reply(action, message)
                    }

                    val message = _message.substring(1)
                    lifecycleScope.launchWhenCreated {
                        if (message == Command.GetNewCharacter) {
                            val user = getNewUser()
                            val character = user.villager
                            val item = user.items.first()

                            val header = "[${sender}님 시작 캐릭터 정보]"

                            val characterInfo = """
                                캐릭터 이름: ${character.name.nameKRko}
                                캐릭터 아이콘: ${character.iconUri}
                                캐릭터 전신샷: ${character.imageUri}
                                캐릭터 성별: ${if (character.gender == "Female") "여성" else "남성"}
                                캐릭터 말버릇: ${character.catchTranslations.catchKRko}
                                캐릭터 성격: ${character.personality}
                                캐릭터 생일: ${character.birthday}
                                캐릭터 종: ${character.species}
                                캐릭터 취미: ${character.hobby}
                                캐릭터 명언: ${character.saying}
                            """.trimIndent()

                            val itemInfo = """
                                시작 아이템 이름: ${item.name.nameKRko}
                                시작 아이템 사진: ${item.imageUri}
                                시작 아이템 구매가: ${item.buyPrice ?: "구매할수 없는 아이템"}
                                시작 아이템 판매가: ${item.sellPrice}
                            """.trimIndent()

                            val content = header + "\n\n\n" + characterInfo + "\n\n" + itemInfo
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
