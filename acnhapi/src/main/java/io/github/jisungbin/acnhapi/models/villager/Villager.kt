/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Villager.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:09.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.villager

import com.google.gson.annotations.SerializedName
import io.github.jisungbin.acnhapi.models.AcnhModelWrapper

data class Villager(
    @field:SerializedName("duk17")
    val duk17: Response,

    @field:SerializedName("hip00")
    val hip00: Response,

    @field:SerializedName("duk16")
    val duk16: Response,

    @field:SerializedName("duk15")
    val duk15: Response,

    @field:SerializedName("duk13")
    val duk13: Response,

    @field:SerializedName("duk12")
    val duk12: Response,

    @field:SerializedName("duk11")
    val duk11: Response,

    @field:SerializedName("duk10")
    val duk10: Response,

    @field:SerializedName("hip09")
    val hip09: Response,

    @field:SerializedName("duk09")
    val duk09: Response,

    @field:SerializedName("duk08")
    val duk08: Response,

    @field:SerializedName("duk07")
    val duk07: Response,

    @field:SerializedName("duk06")
    val duk06: Response,

    @field:SerializedName("hip03")
    val hip03: Response,

    @field:SerializedName("hip04")
    val hip04: Response,

    @field:SerializedName("hip02")
    val hip02: Response,

    @field:SerializedName("hip08")
    val hip08: Response,

    @field:SerializedName("hip05")
    val hip05: Response,

    @field:SerializedName("mnk08")
    val mnk08: Response,

    @field:SerializedName("mnk07")
    val mnk07: Response,

    @field:SerializedName("mnk06")
    val mnk06: Response,

    @field:SerializedName("kal01")
    val kal01: Response,

    @field:SerializedName("kal00")
    val kal00: Response,

    @field:SerializedName("kal03")
    val kal03: Response,

    @field:SerializedName("kal02")
    val kal02: Response,

    @field:SerializedName("kal05")
    val kal05: Response,

    @field:SerializedName("kal04")
    val kal04: Response,

    @field:SerializedName("kal09")
    val kal09: Response,

    @field:SerializedName("kal08")
    val kal08: Response,

    @field:SerializedName("mnk01")
    val mnk01: Response,

    @field:SerializedName("mnk05")
    val mnk05: Response,

    @field:SerializedName("mnk04")
    val mnk04: Response,

    @field:SerializedName("mnk03")
    val mnk03: Response,

    @field:SerializedName("mnk02")
    val mnk02: Response,

    @field:SerializedName("der00")
    val der00: Response,

    @field:SerializedName("der01")
    val der01: Response,

    @field:SerializedName("der02")
    val der02: Response,

    @field:SerializedName("der03")
    val der03: Response,

    @field:SerializedName("kal10")
    val kal10: Response,

    @field:SerializedName("der04")
    val der04: Response,

    @field:SerializedName("der05")
    val der05: Response,

    @field:SerializedName("der06")
    val der06: Response,

    @field:SerializedName("der07")
    val der07: Response,

    @field:SerializedName("der08")
    val der08: Response,

    @field:SerializedName("der09")
    val der09: Response,

    @field:SerializedName("tig01")
    val tig01: Response,

    @field:SerializedName("tig00")
    val tig00: Response,

    @field:SerializedName("tig05")
    val tig05: Response,

    @field:SerializedName("tig04")
    val tig04: Response,

    @field:SerializedName("tig03")
    val tig03: Response,

    @field:SerializedName("tig02")
    val tig02: Response,

    @field:SerializedName("tig06")
    val tig06: Response,

    @field:SerializedName("pbr08")
    val pbr08: Response,

    @field:SerializedName("squ02")
    val squ02: Response,

    @field:SerializedName("pbr09")
    val pbr09: Response,

    @field:SerializedName("squ01")
    val squ01: Response,

    @field:SerializedName("cbr00")
    val cbr00: Response,

    @field:SerializedName("squ04")
    val squ04: Response,

    @field:SerializedName("squ03")
    val squ03: Response,

    @field:SerializedName("cbr02")
    val cbr02: Response,

    @field:SerializedName("squ06")
    val squ06: Response,

    @field:SerializedName("cbr01")
    val cbr01: Response,

    @field:SerializedName("squ05")
    val squ05: Response,

    @field:SerializedName("cbr04")
    val cbr04: Response,

    @field:SerializedName("squ08")
    val squ08: Response,

    @field:SerializedName("cbr03")
    val cbr03: Response,

    @field:SerializedName("squ07")
    val squ07: Response,

    @field:SerializedName("cbr06")
    val cbr06: Response,

    @field:SerializedName("pbr00")
    val pbr00: Response,

    @field:SerializedName("cbr05")
    val cbr05: Response,

    @field:SerializedName("pbr01")
    val pbr01: Response,

    @field:SerializedName("pbr02")
    val pbr02: Response,

    @field:SerializedName("cbr07")
    val cbr07: Response,

    @field:SerializedName("pbr03")
    val pbr03: Response,

    @field:SerializedName("cbr09")
    val cbr09: Response,

    @field:SerializedName("pbr05")
    val pbr05: Response,

    @field:SerializedName("pbr06")
    val pbr06: Response,

    @field:SerializedName("squ00")
    val squ00: Response,

    @field:SerializedName("pbr07")
    val pbr07: Response,

    @field:SerializedName("lon04")
    val lon04: Response,

    @field:SerializedName("squ09")
    val squ09: Response,

    @field:SerializedName("lon01")
    val lon01: Response,

    @field:SerializedName("lon02")
    val lon02: Response,

    @field:SerializedName("lon00")
    val lon00: Response,

    @field:SerializedName("squ13")
    val squ13: Response,

    @field:SerializedName("squ15")
    val squ15: Response,

    @field:SerializedName("squ14")
    val squ14: Response,

    @field:SerializedName("lon07")
    val lon07: Response,

    @field:SerializedName("squ17")
    val squ17: Response,

    @field:SerializedName("lon08")
    val lon08: Response,

    @field:SerializedName("squ16")
    val squ16: Response,

    @field:SerializedName("lon06")
    val lon06: Response,

    @field:SerializedName("squ18")
    val squ18: Response,

    @field:SerializedName("squ11")
    val squ11: Response,

    @field:SerializedName("squ10")
    val squ10: Response,

    @field:SerializedName("duk05")
    val duk05: Response,

    @field:SerializedName("duk04")
    val duk04: Response,

    @field:SerializedName("duk03")
    val duk03: Response,

    @field:SerializedName("duk02")
    val duk02: Response,

    @field:SerializedName("duk01")
    val duk01: Response,

    @field:SerializedName("duk00")
    val duk00: Response,

    @field:SerializedName("cbr10")
    val cbr10: Response,

    @field:SerializedName("cbr13")
    val cbr13: Response,

    @field:SerializedName("cbr15")
    val cbr15: Response,

    @field:SerializedName("cbr14")
    val cbr14: Response,

    @field:SerializedName("cbr17")
    val cbr17: Response,

    @field:SerializedName("cbr16")
    val cbr16: Response,

    @field:SerializedName("cbr19")
    val cbr19: Response,

    @field:SerializedName("kgr00")
    val kgr00: Response,

    @field:SerializedName("kgr01")
    val kgr01: Response,

    @field:SerializedName("mus18")
    val mus18: Response,

    @field:SerializedName("mus16")
    val mus16: Response,

    @field:SerializedName("mus17")
    val mus17: Response,

    @field:SerializedName("kgr06")
    val kgr06: Response,

    @field:SerializedName("kgr08")
    val kgr08: Response,

    @field:SerializedName("kgr09")
    val kgr09: Response,

    @field:SerializedName("kgr02")
    val kgr02: Response,

    @field:SerializedName("kgr05")
    val kgr05: Response,

    @field:SerializedName("mus14")
    val mus14: Response,

    @field:SerializedName("mus15")
    val mus15: Response,

    @field:SerializedName("mus12")
    val mus12: Response,

    @field:SerializedName("mus10")
    val mus10: Response,

    @field:SerializedName("kgr10")
    val kgr10: Response,

    @field:SerializedName("mus09")
    val mus09: Response,

    @field:SerializedName("mus08")
    val mus08: Response,

    @field:SerializedName("mus05")
    val mus05: Response,

    @field:SerializedName("chn10")
    val chn10: Response,

    @field:SerializedName("chn11")
    val chn11: Response,

    @field:SerializedName("chn12")
    val chn12: Response,

    @field:SerializedName("chn13")
    val chn13: Response,

    @field:SerializedName("cat20")
    val cat20: Response,

    @field:SerializedName("cat21")
    val cat21: Response,

    @field:SerializedName("cat23")
    val cat23: Response,

    @field:SerializedName("mus03")
    val mus03: Response,

    @field:SerializedName("mus04")
    val mus04: Response,

    @field:SerializedName("mus01")
    val mus01: Response,

    @field:SerializedName("mus02")
    val mus02: Response,

    @field:SerializedName("mus00")
    val mus00: Response,

    @field:SerializedName("elp12")
    val elp12: Response,

    @field:SerializedName("elp10")
    val elp10: Response,

    @field:SerializedName("hrs16")
    val hrs16: Response,

    @field:SerializedName("hrs13")
    val hrs13: Response,

    @field:SerializedName("hrs12")
    val hrs12: Response,

    @field:SerializedName("hrs11")
    val hrs11: Response,

    @field:SerializedName("hrs10")
    val hrs10: Response,

    @field:SerializedName("cow01")
    val cow01: Response,

    @field:SerializedName("cow00")
    val cow00: Response,

    @field:SerializedName("cow07")
    val cow07: Response,

    @field:SerializedName("cow06")
    val cow06: Response,

    @field:SerializedName("shp02")
    val shp02: Response,

    @field:SerializedName("shp01")
    val shp01: Response,

    @field:SerializedName("shp04")
    val shp04: Response,

    @field:SerializedName("shp03")
    val shp03: Response,

    @field:SerializedName("shp00")
    val shp00: Response,

    @field:SerializedName("hrs06")
    val hrs06: Response,

    @field:SerializedName("hrs05")
    val hrs05: Response,

    @field:SerializedName("hrs04")
    val hrs04: Response,

    @field:SerializedName("hrs03")
    val hrs03: Response,

    @field:SerializedName("hrs02")
    val hrs02: Response,

    @field:SerializedName("hrs01")
    val hrs01: Response,

    @field:SerializedName("hrs00")
    val hrs00: Response,

    @field:SerializedName("dog01")
    val dog01: Response,

    @field:SerializedName("dog00")
    val dog00: Response,

    @field:SerializedName("dog03")
    val dog03: Response,

    @field:SerializedName("dog02")
    val dog02: Response,

    @field:SerializedName("goa09")
    val goa09: Response,

    @field:SerializedName("hrs09")
    val hrs09: Response,

    @field:SerializedName("goa08")
    val goa08: Response,

    @field:SerializedName("hrs08")
    val hrs08: Response,

    @field:SerializedName("goa07")
    val goa07: Response,

    @field:SerializedName("hrs07")
    val hrs07: Response,

    @field:SerializedName("elp01")
    val elp01: Response,

    @field:SerializedName("elp02")
    val elp02: Response,

    @field:SerializedName("elp00")
    val elp00: Response,

    @field:SerializedName("elp05")
    val elp05: Response,

    @field:SerializedName("elp06")
    val elp06: Response,

    @field:SerializedName("elp03")
    val elp03: Response,

    @field:SerializedName("elp04")
    val elp04: Response,

    @field:SerializedName("elp09")
    val elp09: Response,

    @field:SerializedName("elp07")
    val elp07: Response,

    @field:SerializedName("chn05")
    val chn05: Response,

    @field:SerializedName("gor09")
    val gor09: Response,

    @field:SerializedName("chn00")
    val chn00: Response,

    @field:SerializedName("gor08")
    val gor08: Response,

    @field:SerializedName("chn01")
    val chn01: Response,

    @field:SerializedName("gor07")
    val gor07: Response,

    @field:SerializedName("chn02")
    val chn02: Response,

    @field:SerializedName("gor05")
    val gor05: Response,

    @field:SerializedName("gor04")
    val gor04: Response,

    @field:SerializedName("gor02")
    val gor02: Response,

    @field:SerializedName("dog16")
    val dog16: Response,

    @field:SerializedName("gor01")
    val gor01: Response,

    @field:SerializedName("cat10")
    val cat10: Response,

    @field:SerializedName("dog15")
    val dog15: Response,

    @field:SerializedName("gor00")
    val gor00: Response,

    @field:SerializedName("cat11")
    val cat11: Response,

    @field:SerializedName("chn09")
    val chn09: Response,

    @field:SerializedName("dog18")
    val dog18: Response,

    @field:SerializedName("cat12")
    val cat12: Response,

    @field:SerializedName("dog17")
    val dog17: Response,

    @field:SerializedName("cat13")
    val cat13: Response,

    @field:SerializedName("cat14")
    val cat14: Response,

    @field:SerializedName("cat15")
    val cat15: Response,

    @field:SerializedName("cat16")
    val cat16: Response,

    @field:SerializedName("cat17")
    val cat17: Response,

    @field:SerializedName("cat18")
    val cat18: Response,

    @field:SerializedName("cat19")
    val cat19: Response,

    @field:SerializedName("goa06")
    val goa06: Response,

    @field:SerializedName("goa04")
    val goa04: Response,

    @field:SerializedName("goa02")
    val goa02: Response,

    @field:SerializedName("goa01")
    val goa01: Response,

    @field:SerializedName("goa00")
    val goa00: Response,

    @field:SerializedName("dog14")
    val dog14: Response,

    @field:SerializedName("dog10")
    val dog10: Response,

    @field:SerializedName("dog09")
    val dog09: Response,

    @field:SerializedName("dog08")
    val dog08: Response,

    @field:SerializedName("dog05")
    val dog05: Response,

    @field:SerializedName("dog04")
    val dog04: Response,

    @field:SerializedName("cat00")
    val cat00: Response,

    @field:SerializedName("dog07")
    val dog07: Response,

    @field:SerializedName("gor10")
    val gor10: Response,

    @field:SerializedName("cat01")
    val cat01: Response,

    @field:SerializedName("dog06")
    val dog06: Response,

    @field:SerializedName("cat02")
    val cat02: Response,

    @field:SerializedName("cat03")
    val cat03: Response,

    @field:SerializedName("cat04")
    val cat04: Response,

    @field:SerializedName("cat05")
    val cat05: Response,

    @field:SerializedName("cat06")
    val cat06: Response,

    @field:SerializedName("cat07")
    val cat07: Response,

    @field:SerializedName("cat08")
    val cat08: Response,

    @field:SerializedName("cat09")
    val cat09: Response,

    @field:SerializedName("pig05")
    val pig05: Response,

    @field:SerializedName("pig04")
    val pig04: Response,

    @field:SerializedName("pig03")
    val pig03: Response,

    @field:SerializedName("pig02")
    val pig02: Response,

    @field:SerializedName("pig09")
    val pig09: Response,

    @field:SerializedName("pig08")
    val pig08: Response,

    @field:SerializedName("ocp02")
    val ocp02: Response,

    @field:SerializedName("pig01")
    val pig01: Response,

    @field:SerializedName("pig00")
    val pig00: Response,

    @field:SerializedName("ocp00")
    val ocp00: Response,

    @field:SerializedName("ocp01")
    val ocp01: Response,

    @field:SerializedName("pig16")
    val pig16: Response,

    @field:SerializedName("pig15")
    val pig15: Response,

    @field:SerializedName("pig14")
    val pig14: Response,

    @field:SerializedName("pig13")
    val pig13: Response,

    @field:SerializedName("pig17")
    val pig17: Response,

    @field:SerializedName("ham03")
    val ham03: Response,

    @field:SerializedName("ham02")
    val ham02: Response,

    @field:SerializedName("ham01")
    val ham01: Response,

    @field:SerializedName("ham00")
    val ham00: Response,

    @field:SerializedName("pig11")
    val pig11: Response,

    @field:SerializedName("pig10")
    val pig10: Response,

    @field:SerializedName("ham07")
    val ham07: Response,

    @field:SerializedName("ham06")
    val ham06: Response,

    @field:SerializedName("ham05")
    val ham05: Response,

    @field:SerializedName("ham04")
    val ham04: Response,

    @field:SerializedName("brd06")
    val brd06: Response,

    @field:SerializedName("shp09")
    val shp09: Response,

    @field:SerializedName("brd04")
    val brd04: Response,

    @field:SerializedName("brd05")
    val brd05: Response,

    @field:SerializedName("brd08")
    val brd08: Response,

    @field:SerializedName("shp08")
    val shp08: Response,

    @field:SerializedName("shp07")
    val shp07: Response,

    @field:SerializedName("rhn07")
    val rhn07: Response,

    @field:SerializedName("bea10")
    val bea10: Response,

    @field:SerializedName("bea11")
    val bea11: Response,

    @field:SerializedName("bea12")
    val bea12: Response,

    @field:SerializedName("rhn04")
    val rhn04: Response,

    @field:SerializedName("brd02")
    val brd02: Response,

    @field:SerializedName("brd03")
    val brd03: Response,

    @field:SerializedName("rhn02")
    val rhn02: Response,

    @field:SerializedName("brd00")
    val brd00: Response,

    @field:SerializedName("rhn01")
    val rhn01: Response,

    @field:SerializedName("brd01")
    val brd01: Response,

    @field:SerializedName("rhn00")
    val rhn00: Response,

    @field:SerializedName("bea06")
    val bea06: Response,

    @field:SerializedName("bea07")
    val bea07: Response,

    @field:SerializedName("bea08")
    val bea08: Response,

    @field:SerializedName("bea09")
    val bea09: Response,

    @field:SerializedName("bea02")
    val bea02: Response,

    @field:SerializedName("bea03")
    val bea03: Response,

    @field:SerializedName("bea05")
    val bea05: Response,

    @field:SerializedName("shp13")
    val shp13: Response,

    @field:SerializedName("shp12")
    val shp12: Response,

    @field:SerializedName("shp15")
    val shp15: Response,

    @field:SerializedName("shp11")
    val shp11: Response,

    @field:SerializedName("shp10")
    val shp10: Response,

    @field:SerializedName("brd17")
    val brd17: Response,

    @field:SerializedName("brd18")
    val brd18: Response,

    @field:SerializedName("brd15")
    val brd15: Response,

    @field:SerializedName("brd16")
    val brd16: Response,

    @field:SerializedName("brd11")
    val brd11: Response,

    @field:SerializedName("bea13")
    val bea13: Response,

    @field:SerializedName("bea14")
    val bea14: Response,

    @field:SerializedName("bea15")
    val bea15: Response,

    @field:SerializedName("rbt11")
    val rbt11: Response,

    @field:SerializedName("rbt12")
    val rbt12: Response,

    @field:SerializedName("rbt13")
    val rbt13: Response,

    @field:SerializedName("rbt14")
    val rbt14: Response,

    @field:SerializedName("rbt10")
    val rbt10: Response,

    @field:SerializedName("rbt19")
    val rbt19: Response,

    @field:SerializedName("rbt15")
    val rbt15: Response,

    @field:SerializedName("rbt16")
    val rbt16: Response,

    @field:SerializedName("rbt17")
    val rbt17: Response,

    @field:SerializedName("rbt18")
    val rbt18: Response,

    @field:SerializedName("rbt00")
    val rbt00: Response,

    @field:SerializedName("crd04")
    val crd04: Response,

    @field:SerializedName("rbt01")
    val rbt01: Response,

    @field:SerializedName("rbt02")
    val rbt02: Response,

    @field:SerializedName("crd06")
    val crd06: Response,

    @field:SerializedName("rbt03")
    val rbt03: Response,

    @field:SerializedName("crd07")
    val crd07: Response,

    @field:SerializedName("crd08")
    val crd08: Response,

    @field:SerializedName("rbt08")
    val rbt08: Response,

    @field:SerializedName("rbt09")
    val rbt09: Response,

    @field:SerializedName("rbt04")
    val rbt04: Response,

    @field:SerializedName("crd00")
    val crd00: Response,

    @field:SerializedName("rbt05")
    val rbt05: Response,

    @field:SerializedName("crd01")
    val crd01: Response,

    @field:SerializedName("rbt06")
    val rbt06: Response,

    @field:SerializedName("crd02")
    val crd02: Response,

    @field:SerializedName("rbt07")
    val rbt07: Response,

    @field:SerializedName("ost02")
    val ost02: Response,

    @field:SerializedName("ost03")
    val ost03: Response,

    @field:SerializedName("ost00")
    val ost00: Response,

    @field:SerializedName("ost01")
    val ost01: Response,

    @field:SerializedName("ost06")
    val ost06: Response,

    @field:SerializedName("ost07")
    val ost07: Response,

    @field:SerializedName("ost05")
    val ost05: Response,

    @field:SerializedName("ost08")
    val ost08: Response,

    @field:SerializedName("ost09")
    val ost09: Response,

    @field:SerializedName("wol00")
    val wol00: Response,

    @field:SerializedName("wol01")
    val wol01: Response,

    @field:SerializedName("wol02")
    val wol02: Response,

    @field:SerializedName("wol03")
    val wol03: Response,

    @field:SerializedName("wol04")
    val wol04: Response,

    @field:SerializedName("wol05")
    val wol05: Response,

    @field:SerializedName("wol06")
    val wol06: Response,

    @field:SerializedName("wol08")
    val wol08: Response,

    @field:SerializedName("wol09")
    val wol09: Response,

    @field:SerializedName("bea00")
    val bea00: Response,

    @field:SerializedName("bea01")
    val bea01: Response,

    @field:SerializedName("wol10")
    val wol10: Response,

    @field:SerializedName("wol12")
    val wol12: Response,

    @field:SerializedName("rhn08")
    val rhn08: Response,

    @field:SerializedName("ost10")
    val ost10: Response,

    @field:SerializedName("flg19")
    val flg19: Response,

    @field:SerializedName("flg18")
    val flg18: Response,

    @field:SerializedName("flg17")
    val flg17: Response,

    @field:SerializedName("flg16")
    val flg16: Response,

    @field:SerializedName("flg15")
    val flg15: Response,

    @field:SerializedName("flg13")
    val flg13: Response,

    @field:SerializedName("flg12")
    val flg12: Response,

    @field:SerializedName("flg11")
    val flg11: Response,

    @field:SerializedName("flg10")
    val flg10: Response,

    @field:SerializedName("ant03")
    val ant03: Response,

    @field:SerializedName("bul01")
    val bul01: Response,

    @field:SerializedName("ant01")
    val ant01: Response,

    @field:SerializedName("bul00")
    val bul00: Response,

    @field:SerializedName("ant02")
    val ant02: Response,

    @field:SerializedName("ant08")
    val ant08: Response,

    @field:SerializedName("bul05")
    val bul05: Response,

    @field:SerializedName("ant06")
    val ant06: Response,

    @field:SerializedName("bul03")
    val bul03: Response,

    @field:SerializedName("ant00")
    val ant00: Response,

    @field:SerializedName("ant09")
    val ant09: Response,

    @field:SerializedName("pgn03")
    val pgn03: Response,

    @field:SerializedName("pgn04")
    val pgn04: Response,

    @field:SerializedName("pgn01")
    val pgn01: Response,

    @field:SerializedName("pgn02")
    val pgn02: Response,

    @field:SerializedName("pgn05")
    val pgn05: Response,

    @field:SerializedName("pgn06")
    val pgn06: Response,

    @field:SerializedName("pgn00")
    val pgn00: Response,

    @field:SerializedName("bul08")
    val bul08: Response,

    @field:SerializedName("bul07")
    val bul07: Response,

    @field:SerializedName("pgn14")
    val pgn14: Response,

    @field:SerializedName("pgn12")
    val pgn12: Response,

    @field:SerializedName("pgn13")
    val pgn13: Response,

    @field:SerializedName("flg09")
    val flg09: Response,

    @field:SerializedName("flg07")
    val flg07: Response,

    @field:SerializedName("flg06")
    val flg06: Response,

    @field:SerializedName("flg05")
    val flg05: Response,

    @field:SerializedName("flg04")
    val flg04: Response,

    @field:SerializedName("flg03")
    val flg03: Response,

    @field:SerializedName("flg02")
    val flg02: Response,

    @field:SerializedName("pgn10")
    val pgn10: Response,

    @field:SerializedName("flg01")
    val flg01: Response,

    @field:SerializedName("pgn11")
    val pgn11: Response,

    @field:SerializedName("flg00")
    val flg00: Response,

    @field:SerializedName("pgn09")
    val pgn09: Response
) : AcnhModelWrapper {
    fun random() = this::class.constructors.random()
}
