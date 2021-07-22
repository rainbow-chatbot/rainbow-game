/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [User.kt] created by Ji Sungbin on 21. 7. 23. 오전 2:33.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.user

import io.github.jisungbin.acnhapi.models.items.ItemWrapper
import io.github.jisungbin.acnhapi.models.villager.Villager

data class User(
    var villager: Villager,
    var items: List<ItemWrapper>
)
