/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AnchApiImpl.kt] created by Ji Sungbin on 21. 7. 23. 오전 12:07.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.repo

import io.github.jisungbin.acnhapi.AcnhResult
import io.github.jisungbin.acnhapi.client.AcnhService
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.callbackFlow
import retrofit2.Retrofit
import retrofit2.await

@OptIn(ExperimentalCoroutinesApi::class)
internal class AcnhRepoImpl(private val retrofit: Retrofit) : AcnhRepo {
    override fun getHouseWare() = callbackFlow {
        try {
            trySend(
                AcnhResult.Success(
                    retrofit.create(AcnhService::class.java).getHouseWare().await()
                )
            )
        } catch (exception: Exception) {
            trySend(AcnhResult.Error(exception))
        }
    }

    override fun getVillagers() = callbackFlow {
        try {
            trySend(
                AcnhResult.Success(
                    retrofit.create(AcnhService::class.java).getVillagers().await()
                )
            )
        } catch (exception: Exception) {
            trySend(AcnhResult.Error(exception))
        }
    }
}