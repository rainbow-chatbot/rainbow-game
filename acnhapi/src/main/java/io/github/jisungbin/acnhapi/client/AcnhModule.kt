/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AcnhModule.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:58.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.client

import retrofit2.Retrofit

internal object AcnhModule {
    private const val BaseUrl = "https://acnhapi.com"

    fun get(): Retrofit = Retrofit.Builder()
        .baseUrl(BaseUrl)
        .build()
}
