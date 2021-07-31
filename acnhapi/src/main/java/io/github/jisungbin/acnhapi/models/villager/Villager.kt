/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Ant00.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:09.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.villager

import com.beust.klaxon.Json

data class Villager(
    @Json(name = "birthday")
    val birthday: String,

    @Json(name = "gender")
    val gender: String,

    @Json(name = "catch-translations")
    val catchTranslations: CatchTranslations,

    @Json(name = "image_uri")
    val imageUri: String,

    @Json(name = "icon_uri")
    val iconUri: String,

    @Json(name = "birthday-string")
    val birthdayString: String,

    @Json(name = "catch-phrase")
    val catchPhrase: String,

    @Json(name = "personality")
    val personality: String,

    @Json(name = "species")
    val species: String,

    @Json(name = "subtype")
    val subtype: String,

    @Json(name = "name")
    val name: NameTranslations,

    @Json(name = "id")
    val id: Int,

    @Json(name = "file-name")
    val fileName: String,

    @Json(name = "text-color")
    val textColor: String,

    @Json(name = "saying")
    val saying: String,

    @Json(name = "bubble-color")
    val bubbleColor: String,

    @Json(name = "hobby")
    val hobby: String
)
