/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AcnhApi.kt] created by Ji Sungbin on 21. 7. 23. 오전 12:27.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi

import io.github.jisungbin.acnhapi.client.AcnhModule
import io.github.jisungbin.acnhapi.client.AcnhService
import retrofit2.await

class AcnhApi private constructor() {

    companion object {
        val instance by lazy { AcnhApi() }
    }

    private val repo = AcnhModule.get().create(AcnhService::class.java)

    suspend fun getVillagers() = runCatching {
        repo.getVillagers().await().use { it.string() }
    }
}