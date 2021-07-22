/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Item.kt] created by Ji Sungbin on 21. 7. 23. 오전 4:13.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.items.common

import com.google.gson.annotations.SerializedName
import io.github.jisungbin.acnhapi.models.common.NameTranslations

data class Item(
    @field:SerializedName("body-title")
    val bodyTitle: String,

    @field:SerializedName("kit-cost")
    val kitCost: String,

    @field:SerializedName("pattern-title")
    val patternTitle: Any?,

    @field:SerializedName("isInteractive")
    val isInteractive: Boolean,

    @field:SerializedName("pattern")
    val pattern: Any?,

    @field:SerializedName("sell-price")
    val sellPrice: Int,

    @field:SerializedName("source")
    val source: String,

    @field:SerializedName("hha-series")
    val hhaSeries: Any?,

    @field:SerializedName("source-detail")
    val sourceDetail: String,

    @field:SerializedName("isOutdoor")
    val isOutdoor: Boolean,

    @field:SerializedName("color-2")
    val color2: String,

    @field:SerializedName("hha-concept-1")
    val hhaConcept1: String,

    @field:SerializedName("hha-concept-2")
    val hhaConcept2: Any?,

    @field:SerializedName("internal-id")
    val internalId: Int,

    @field:SerializedName("canCustomizePattern")
    val canCustomizePattern: Boolean,

    @field:SerializedName("buy-price")
    val buyPrice: Any?,

    @field:SerializedName("variant")
    val variant: String,

    @field:SerializedName("hha-set")
    val hhaSet: Any?,

    @field:SerializedName("tag")
    val tag: String,

    @field:SerializedName("color-1")
    val color1: String,

    @field:SerializedName("isCatalog")
    val isCatalog: Boolean,

    @field:SerializedName("canCustomizeBody")
    val canCustomizeBody: Boolean,

    @field:SerializedName("variant-id")
    val variantId: String,

    @field:SerializedName("image_uri")
    val imageUri: String,

    @field:SerializedName("speaker-type")
    val speakerType: Any?,

    @field:SerializedName("lighting-type")
    val lightingType: Any?,

    @field:SerializedName("version")
    val version: String,

    @field:SerializedName("size")
    val size: String,

    @field:SerializedName("isDIY")
    val isDIY: Boolean,

    @field:SerializedName("name")
    val name: NameTranslations,

    @field:SerializedName("file-name")
    val fileName: String
)
