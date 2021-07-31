/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [TypeConverters.kt] created by Ji Sungbin on 21. 7. 31. 오후 5:04.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.database

import androidx.room.TypeConverter
import com.beust.klaxon.Klaxon
import io.github.jisungbin.acnhapi.models.items.Item
import io.github.jisungbin.acnhapi.models.villager.Villager

class TypeConverters {
    private companion object {
        val klaxon by lazy { Klaxon() }
    }

    @TypeConverter
    fun villagerToJson(villager: Villager) = klaxon.toJsonString(villager)

    @TypeConverter
    fun jsonToVillager(json: String) = klaxon.parse<Villager>(json)!!

    @TypeConverter
    fun itemsToJson(items: List<Item>) = klaxon.toJsonString(items)

    @TypeConverter
    fun jsonToItems(json: String) = klaxon.parse<List<Item>>(json)!!
}