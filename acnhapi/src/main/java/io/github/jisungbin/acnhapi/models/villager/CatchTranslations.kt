/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [CatchTranslations.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:16.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.villager

import com.google.gson.annotations.SerializedName

data class CatchTranslations(
    @field:SerializedName("catch-KRko")
    val catchKRko: String,

    @field:SerializedName("catch-EUes")
    val catchEUes: String,

    @field:SerializedName("catch-EUen")
    val catchEUen: String,

    @field:SerializedName("catch-JPja")
    val catchJPja: String,

    @field:SerializedName("catch-EUit")
    val catchEUit: String,

    @field:SerializedName("catch-EUfr")
    val catchEUfr: String,

    @field:SerializedName("catch-EUnl")
    val catchEUnl: String,

    @field:SerializedName("catch-USen")
    val catchUSen: String,

    @field:SerializedName("catch-EUde")
    val catchEUde: String,

    @field:SerializedName("catch-USfr")
    val catchUSfr: String,

    @field:SerializedName("catch-CNzh")
    val catchCNzh: String,

    @field:SerializedName("catch-TWzh")
    val catchTWzh: String,

    @field:SerializedName("catch-EUru")
    val catchEUru: String,

    @field:SerializedName("catch-USes")
    val catchUSes: String
)
