/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [user.kt] created by Ji Sungbin on 21. 7. 23. 오전 2:34.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.function

import io.github.jisungbin.acnhapi.AcnhApi
import io.github.jisungbin.rainbow.database.user.User

suspend fun createNewUser(sender: String) = User(
    villager = AcnhApi.getVillagers().random(),
    items = listOf(getRandomItem()),
    name = sender
)

suspend fun getRandomItem() = AcnhApi.getItems().random()