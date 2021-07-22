/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [AcnhService.kt] created by Ji Sungbin on 21. 7. 23. 오전 12:02.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.client

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

internal interface AcnhService {
    @GET("/v1/villagers")
    fun getVillagers(): Call<ResponseBody>

    @GET("/v1/houseware")
    fun getHouseWare(): Call<ResponseBody>
}