/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [response.kt] created by Ji Sungbin on 21. 7. 23. 오전 2:34.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.user

import io.github.jisungbin.acnhapi.AcnhApi
import io.github.jisungbin.acnhapi.models.items.ItemWrapper
import io.github.jisungbin.acnhapi.models.items.houseware.Housewares
import io.github.jisungbin.acnhapi.models.items.misc.Miscs
import io.github.jisungbin.acnhapi.models.items.wallmounted.Wallmounteds
import kotlin.random.Random

suspend fun getNewUser() = User(
    villager = AcnhApi.getVillagers().getOrNull()!!.random,
    items = listOf(getStartItem())
)

suspend fun getStartItem(): ItemWrapper {
    val items = AcnhApi.getItems().getOrNull()!!
    return when (Random.nextInt(0, 3)) {
        0 -> (items[0] as Housewares).randomType.random()
        1 -> (items[1] as Miscs).randomType.random()
        2 -> (items[2] as Wallmounteds).randomType.random()
        else -> throw IndexOutOfBoundsException()
    }
}