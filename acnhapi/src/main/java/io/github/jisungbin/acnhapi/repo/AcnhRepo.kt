/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AnchApi.kt] created by Ji Sungbin on 21. 7. 23. 오전 12:05.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.repo

import io.github.jisungbin.acnhapi.AcnhResult
import kotlinx.coroutines.flow.Flow

internal interface AcnhRepo {
    fun getHouseWare(): Flow<AcnhResult>
    fun getVillagers(): Flow<AcnhResult>
}