/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [response.kt] created by Ji Sungbin on 21. 7. 23. 오전 2:34.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.rainbow.user

import io.github.jisungbin.acnhapi.AcnhApi

suspend fun getNewUser() = User(AcnhApi().getVillagers().getOrNull()!!.random)