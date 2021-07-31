/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AcnhApi.kt] created by Ji Sungbin on 21. 7. 23. 오전 12:27.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi

import com.beust.klaxon.JsonReader
import com.beust.klaxon.Klaxon
import com.google.gson.Gson
import io.github.jisungbin.acnhapi.DataStore.items
import io.github.jisungbin.acnhapi.DataStore.villagers
import io.github.jisungbin.acnhapi.client.AcnhModule
import io.github.jisungbin.acnhapi.client.AcnhService
import io.github.jisungbin.acnhapi.models.villager.Villager
import java.io.StringReader
import org.json.JSONObject
import retrofit2.await

object AcnhApi {
    private val client = AcnhModule.get().create(AcnhService::class.java)

    suspend fun getVillagers() = runCatching {
        if (villagers.isEmpty()) {
            client.getVillagers().await().use { json ->
                val jsonObject = JSONObject(json.string())
                jsonObject.keys().forEach { key -> // 이런식으로 하면 작동 함
                    val element = Gson().fromJson(
                        jsonObject.getJSONObject(key).toString(),
                        Villager::class.java
                    )
                    villagers.add(element)
                }
                villagers.toList()
            }
        } else villagers
    }

    suspend fun getItems() = runCatching {
        val klaxon = Klaxon()

        if (items.isEmpty()) {
            client.getHouseWare().await().use { json ->
                JsonReader(StringReader(json.string())).use { reader ->
                    reader.beginObject {
                        while (reader.hasNext()) {
                            items.add(klaxon.parse(reader)!!)
                        }
                    }
                }
            }

            client.getMiscs().await().use { json ->
                JsonReader(StringReader(json.string())).use { reader ->
                    reader.beginObject {
                        while (reader.hasNext()) {
                            items.add(klaxon.parse(reader)!!)
                        }
                    }
                }
            }

            client.getWallmounted().await().use { json ->
                JsonReader(StringReader(json.string())).use { reader ->
                    reader.beginObject {
                        while (reader.hasNext()) {
                            items.add(klaxon.parse(reader)!!)
                        }
                    }
                }
            }

            items
        } else items
    }
}