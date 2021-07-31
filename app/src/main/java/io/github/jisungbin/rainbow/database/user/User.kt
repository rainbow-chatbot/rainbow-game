/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [User.kt] created by Ji Sungbin on 21. 7. 26. 오전 11:07.
 *
 * Please see project github repository license.
 */

/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [User.kt] created by Ji Sungbin on 21. 7. 23. 오전 2:33.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.database.user

import androidx.room.Entity
import androidx.room.PrimaryKey
import io.github.jisungbin.acnhapi.models.items.Item
import io.github.jisungbin.acnhapi.models.villager.Villager

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val name: String,
    var villager: Villager,
    // var pocketmons: List<> = listOf(),
    var items: List<Item> = listOf(),
    var money: Int = 0,
    var takePicture: Boolean = false
)
