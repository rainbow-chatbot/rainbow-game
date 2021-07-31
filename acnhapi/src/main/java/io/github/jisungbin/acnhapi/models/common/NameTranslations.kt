/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [NameTranslations.kt] created by Ji Sungbin on 21. 7. 23. 오전 2:42.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.common

import com.beust.klaxon.Json

data class NameTranslations(
    @Json(name = "name-EUru")
    val nameEUru: String,

    @Json(name = "name-EUnl")
    val nameEUnl: String,

    @Json(name = "name-EUde")
    val nameEUde: String,

    @Json(name = "name-EUit")
    val nameEUit: String,

    @Json(name = "name-JPja")
    val nameJPja: String,

    @Json(name = "name-EUfr")
    val nameEUfr: String,

    @Json(name = "name-EUen")
    val nameEUen: String,

    @Json(name = "name-CNzh")
    val nameCNzh: String,

    @Json(name = "name-TWzh")
    val nameTWzh: String,

    @Json(name = "name-USfr")
    val nameUSfr: String,

    @Json(name = "name-USes")
    val nameUSes: String,

    @Json(name = "name-USen")
    val nameUSen: String,

    @Json(name = "name-EUes")
    val nameEUes: String,

    @Json(name = "name-KRko")
    val nameKRko: String
)
