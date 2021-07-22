package io.github.jisungbin.acnhapi.models.items.houseware

import com.google.gson.annotations.SerializedName

data class Name(

    @field:SerializedName("name-EUru")
    val nameEUru: String,

    @field:SerializedName("name-EUnl")
    val nameEUnl: String,

    @field:SerializedName("name-EUde")
    val nameEUde: String,

    @field:SerializedName("name-EUit")
    val nameEUit: String,

    @field:SerializedName("name-JPja")
    val nameJPja: String,

    @field:SerializedName("name-EUfr")
    val nameEUfr: String,

    @field:SerializedName("name-EUen")
    val nameEUen: String,

    @field:SerializedName("name-CNzh")
    val nameCNzh: String,

    @field:SerializedName("name-TWzh")
    val nameTWzh: String,

    @field:SerializedName("name-USfr")
    val nameUSfr: String,

    @field:SerializedName("name-USes")
    val nameUSes: String,

    @field:SerializedName("name-USen")
    val nameUSen: String,

    @field:SerializedName("name-EUes")
    val nameEUes: String,

    @field:SerializedName("name-KRko")
    val nameKRko: String
)