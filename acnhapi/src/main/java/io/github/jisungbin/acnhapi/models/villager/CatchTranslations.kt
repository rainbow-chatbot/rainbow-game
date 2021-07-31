/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [CatchTranslations.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:16.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.villager

import com.beust.klaxon.Json

data class CatchTranslations(
    @Json(name = "catch-KRko")
    val catchKRko: String,

    @Json(name = "catch-EUes")
    val catchEUes: String,

    @Json(name = "catch-EUen")
    val catchEUen: String,

    @Json(name = "catch-JPja")
    val catchJPja: String,

    @Json(name = "catch-EUit")
    val catchEUit: String,

    @Json(name = "catch-EUfr")
    val catchEUfr: String,

    @Json(name = "catch-EUnl")
    val catchEUnl: String,

    @Json(name = "catch-USen")
    val catchUSen: String,

    @Json(name = "catch-EUde")
    val catchEUde: String,

    @Json(name = "catch-USfr")
    val catchUSfr: String,

    @Json(name = "catch-CNzh")
    val catchCNzh: String,

    @Json(name = "catch-TWzh")
    val catchTWzh: String,

    @Json(name = "catch-EUru")
    val catchEUru: String,

    @Json(name = "catch-USes")
    val catchUSes: String
)
