/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [DataStore.kt] created by Ji Sungbin on 21. 7. 23. 오전 2:38.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi

import io.github.jisungbin.acnhapi.models.items.common.ItemWrapper
import io.github.jisungbin.acnhapi.models.villager.Villagers

internal object DataStore {
    var villagers: Villagers? = null
    var items = mutableListOf<ItemWrapper>()
}