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
import io.github.jisungbin.acnhapi.DataStore.villagers
import io.github.jisungbin.acnhapi.client.AcnhModule
import io.github.jisungbin.acnhapi.client.AcnhService
import io.github.jisungbin.acnhapi.models.villager.Villagers
import retrofit2.await

class AcnhApi {

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
}