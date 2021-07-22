/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Ant00.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:09.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.villager

import com.google.gson.annotations.SerializedName

data class Response(
    @field:SerializedName("birthday")
    val birthday: String,

    @field:SerializedName("gender")
    val gender: String,

    @field:SerializedName("catch-translations")
    val catchTranslations: CatchTranslations,

    @field:SerializedName("image_uri")
    val imageUri: String,

    @field:SerializedName("icon_uri")
    val iconUri: String,

    @field:SerializedName("birthday-string")
    val birthdayString: String,

    @field:SerializedName("catch-phrase")
    val catchPhrase: String,

    @field:SerializedName("personality")
    val personality: String,

    @field:SerializedName("species")
    val species: String,

    @field:SerializedName("subtype")
    val subtype: String,

    @field:SerializedName("name")
    val name: NameTranslations,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("file-name")
    val fileName: String,

    @field:SerializedName("text-color")
    val textColor: String,

    @field:SerializedName("saying")
    val saying: String,

    @field:SerializedName("bubble-color")
    val bubbleColor: String,

    @field:SerializedName("hobby")
    val hobby: String
)
