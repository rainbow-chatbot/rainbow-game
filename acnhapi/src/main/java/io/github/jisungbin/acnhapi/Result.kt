/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Result.kt] created by Ji Sungbin on 21. 7. 22. 오후 10:35.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi

sealed class Result<out T> {
    data class Success<out T>(val response: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}
