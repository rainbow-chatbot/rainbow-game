/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AcnhApi.kt] created by Ji Sungbin on 21. 7. 23. 오전 12:27.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi

import com.google.gson.Gson
import io.github.jisungbin.acnhapi.DataStore.items
import io.github.jisungbin.acnhapi.DataStore.villagers
import io.github.jisungbin.acnhapi.client.AcnhModule
import io.github.jisungbin.acnhapi.client.AcnhService
import io.github.jisungbin.acnhapi.models.items.houseware.Housewares
import io.github.jisungbin.acnhapi.models.items.misc.Miscs
import io.github.jisungbin.acnhapi.models.items.wallmounted.Wallmounteds
import io.github.jisungbin.acnhapi.models.villager.Villagers
import retrofit2.await

object AcnhApi {
    private val repo = AcnhModule.get().create(AcnhService::class.java)

    suspend fun getVillagers() = runCatching {
        if (villagers == null) {
            repo.getVillagers().await().use {
                val json = it.string()
                villagers = Gson().fromJson(json, Villagers::class.java)
                villagers
            }
        } else villagers!!
    }

    suspend fun getItems() = runCatching {
        if (items.isEmpty()) {
            repo.getHouseWare().await().use {
                val json = it.string()
                val housewares = Gson().fromJson(json, Housewares::class.java)
                items.add(housewares)
            }

            repo.getMiscs().await().use {
                val json = it.string()
                val miscs = Gson().fromJson(json, Miscs::class.java)
                items.add(miscs)
            }

            repo.getWallmounted().await().use {
                val json = it.string()
                val wallmounteds = Gson().fromJson(json, Wallmounteds::class.java)
                items.add(wallmounteds)
            }

            items
        } else items
    }
}