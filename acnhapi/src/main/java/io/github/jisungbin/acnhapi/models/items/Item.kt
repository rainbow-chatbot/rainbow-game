/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Item.kt] created by Ji Sungbin on 21. 7. 23. 오전 4:13.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.items

import com.beust.klaxon.Json
import io.github.jisungbin.acnhapi.models.common.NameTranslations

data class Item(
    @Json(name = "body-title")
    val bodyTitle: String,

    @Json(name = "kit-cost")
    val kitCost: String,

    @Json(name = "pattern-title")
    val patternTitle: Any?,

    @Json(name = "isInteractive")
    val isInteractive: Boolean,

    @Json(name = "pattern")
    val pattern: Any?,

    @Json(name = "sell-price")
    val sellPrice: Int,

    @Json(name = "source")
    val source: String,

    @Json(name = "hha-series")
    val hhaSeries: Any?,

    @Json(name = "source-detail")
    val sourceDetail: String,

    @Json(name = "isOutdoor")
    val isOutdoor: Boolean,

    @Json(name = "color-2")
    val color2: String,

    @Json(name = "hha-concept-1")
    val hhaConcept1: String,

    @Json(name = "hha-concept-2")
    val hhaConcept2: Any?,

    @Json(name = "internal-id")
    val internalId: Int,

    @Json(name = "canCustomizePattern")
    val canCustomizePattern: Boolean,

    @Json(name = "buy-price")
    val buyPrice: Any?,

    @Json(name = "variant")
    val variant: String,

    @Json(name = "hha-set")
    val hhaSet: Any?,

    @Json(name = "tag")
    val tag: String,

    @Json(name = "color-1")
    val color1: String,

    @Json(name = "isCatalog")
    val isCatalog: Boolean,

    @Json(name = "canCustomizeBody")
    val canCustomizeBody: Boolean,

    @Json(name = "variant-id")
    val variantId: String,

    @Json(name = "image_uri")
    val imageUri: String,

    @Json(name = "speaker-type")
    val speakerType: Any?,

    @Json(name = "lighting-type")
    val lightingType: Any?,

    @Json(name = "version")
    val version: String,

    @Json(name = "size")
    val size: String,

    @Json(name = "isDIY")
    val isDIY: Boolean,

    @Json(name = "name")
    val name: NameTranslations,

    @Json(name = "file-name")
    val fileName: String
)
