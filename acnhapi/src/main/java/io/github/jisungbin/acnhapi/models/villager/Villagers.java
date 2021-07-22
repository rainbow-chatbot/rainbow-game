/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Villager.java] created by Ji Sungbin on 21. 7. 23. 오전 2:18.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.villager;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Villagers {
    @SerializedName("duk17")
    private Villager duk17;

    @SerializedName("hip00")
    private Villager hip00;

    @SerializedName("duk16")
    private Villager duk16;

    @SerializedName("duk15")
    private Villager duk15;

    @SerializedName("duk13")
    private Villager duk13;

    @SerializedName("duk12")
    private Villager duk12;

    @SerializedName("duk11")
    private Villager duk11;

    @SerializedName("duk10")
    private Villager duk10;

    @SerializedName("hip09")
    private Villager hip09;

    @SerializedName("duk09")
    private Villager duk09;

    @SerializedName("duk08")
    private Villager duk08;

    @SerializedName("duk07")
    private Villager duk07;

    @SerializedName("duk06")
    private Villager duk06;

    @SerializedName("hip03")
    private Villager hip03;

    @SerializedName("hip04")
    private Villager hip04;

    @SerializedName("hip02")
    private Villager hip02;

    @SerializedName("hip08")
    private Villager hip08;

    @SerializedName("hip05")
    private Villager hip05;

    @SerializedName("mnk08")
    private Villager mnk08;

    @SerializedName("mnk07")
    private Villager mnk07;

    @SerializedName("mnk06")
    private Villager mnk06;

    @SerializedName("kal01")
    private Villager kal01;

    @SerializedName("kal00")
    private Villager kal00;

    @SerializedName("kal03")
    private Villager kal03;

    @SerializedName("kal02")
    private Villager kal02;

    @SerializedName("kal05")
    private Villager kal05;

    @SerializedName("kal04")
    private Villager kal04;

    @SerializedName("kal09")
    private Villager kal09;

    @SerializedName("kal08")
    private Villager kal08;

    @SerializedName("mnk01")
    private Villager mnk01;

    @SerializedName("mnk05")
    private Villager mnk05;

    @SerializedName("mnk04")
    private Villager mnk04;

    @SerializedName("mnk03")
    private Villager mnk03;

    @SerializedName("mnk02")
    private Villager mnk02;

    @SerializedName("der00")
    private Villager der00;

    @SerializedName("der01")
    private Villager der01;

    @SerializedName("der02")
    private Villager der02;

    @SerializedName("der03")
    private Villager der03;

    @SerializedName("kal10")
    private Villager kal10;

    @SerializedName("der04")
    private Villager der04;

    @SerializedName("der05")
    private Villager der05;

    @SerializedName("der06")
    private Villager der06;

    @SerializedName("der07")
    private Villager der07;

    @SerializedName("der08")
    private Villager der08;

    @SerializedName("der09")
    private Villager der09;

    @SerializedName("tig01")
    private Villager tig01;

    @SerializedName("tig00")
    private Villager tig00;

    @SerializedName("tig05")
    private Villager tig05;

    @SerializedName("tig04")
    private Villager tig04;

    @SerializedName("tig03")
    private Villager tig03;

    @SerializedName("tig02")
    private Villager tig02;

    @SerializedName("tig06")
    private Villager tig06;

    @SerializedName("pbr08")
    private Villager pbr08;

    @SerializedName("squ02")
    private Villager squ02;

    @SerializedName("pbr09")
    private Villager pbr09;

    @SerializedName("squ01")
    private Villager squ01;

    @SerializedName("cbr00")
    private Villager cbr00;

    @SerializedName("squ04")
    private Villager squ04;

    @SerializedName("squ03")
    private Villager squ03;

    @SerializedName("cbr02")
    private Villager cbr02;

    @SerializedName("squ06")
    private Villager squ06;

    @SerializedName("cbr01")
    private Villager cbr01;

    @SerializedName("squ05")
    private Villager squ05;

    @SerializedName("cbr04")
    private Villager cbr04;

    @SerializedName("squ08")
    private Villager squ08;

    @SerializedName("cbr03")
    private Villager cbr03;

    @SerializedName("squ07")
    private Villager squ07;

    @SerializedName("cbr06")
    private Villager cbr06;

    @SerializedName("pbr00")
    private Villager pbr00;

    @SerializedName("cbr05")
    private Villager cbr05;

    @SerializedName("pbr01")
    private Villager pbr01;

    @SerializedName("pbr02")
    private Villager pbr02;

    @SerializedName("cbr07")
    private Villager cbr07;

    @SerializedName("pbr03")
    private Villager pbr03;

    @SerializedName("cbr09")
    private Villager cbr09;

    @SerializedName("pbr05")
    private Villager pbr05;

    @SerializedName("pbr06")
    private Villager pbr06;

    @SerializedName("squ00")
    private Villager squ00;

    @SerializedName("pbr07")
    private Villager pbr07;

    @SerializedName("lon04")
    private Villager lon04;

    @SerializedName("squ09")
    private Villager squ09;

    @SerializedName("lon01")
    private Villager lon01;

    @SerializedName("lon02")
    private Villager lon02;

    @SerializedName("lon00")
    private Villager lon00;

    @SerializedName("squ13")
    private Villager squ13;

    @SerializedName("squ15")
    private Villager squ15;

    @SerializedName("squ14")
    private Villager squ14;

    @SerializedName("lon07")
    private Villager lon07;

    @SerializedName("squ17")
    private Villager squ17;

    @SerializedName("lon08")
    private Villager lon08;

    @SerializedName("squ16")
    private Villager squ16;

    @SerializedName("lon06")
    private Villager lon06;

    @SerializedName("squ18")
    private Villager squ18;

    @SerializedName("squ11")
    private Villager squ11;

    @SerializedName("squ10")
    private Villager squ10;

    @SerializedName("duk05")
    private Villager duk05;

    @SerializedName("duk04")
    private Villager duk04;

    @SerializedName("duk03")
    private Villager duk03;

    @SerializedName("duk02")
    private Villager duk02;

    @SerializedName("duk01")
    private Villager duk01;

    @SerializedName("duk00")
    private Villager duk00;

    @SerializedName("cbr10")
    private Villager cbr10;

    @SerializedName("cbr13")
    private Villager cbr13;

    @SerializedName("cbr15")
    private Villager cbr15;

    @SerializedName("cbr14")
    private Villager cbr14;

    @SerializedName("cbr17")
    private Villager cbr17;

    @SerializedName("cbr16")
    private Villager cbr16;

    @SerializedName("cbr19")
    private Villager cbr19;

    @SerializedName("kgr00")
    private Villager kgr00;

    @SerializedName("kgr01")
    private Villager kgr01;

    @SerializedName("mus18")
    private Villager mus18;

    @SerializedName("mus16")
    private Villager mus16;

    @SerializedName("mus17")
    private Villager mus17;

    @SerializedName("kgr06")
    private Villager kgr06;

    @SerializedName("kgr08")
    private Villager kgr08;

    @SerializedName("kgr09")
    private Villager kgr09;

    @SerializedName("kgr02")
    private Villager kgr02;

    @SerializedName("kgr05")
    private Villager kgr05;

    @SerializedName("mus14")
    private Villager mus14;

    @SerializedName("mus15")
    private Villager mus15;

    @SerializedName("mus12")
    private Villager mus12;

    @SerializedName("mus10")
    private Villager mus10;

    @SerializedName("kgr10")
    private Villager kgr10;

    @SerializedName("mus09")
    private Villager mus09;

    @SerializedName("mus08")
    private Villager mus08;

    @SerializedName("mus05")
    private Villager mus05;

    @SerializedName("chn10")
    private Villager chn10;

    @SerializedName("chn11")
    private Villager chn11;

    @SerializedName("chn12")
    private Villager chn12;

    @SerializedName("chn13")
    private Villager chn13;

    @SerializedName("cat20")
    private Villager cat20;

    @SerializedName("cat21")
    private Villager cat21;

    @SerializedName("cat23")
    private Villager cat23;

    @SerializedName("mus03")
    private Villager mus03;

    @SerializedName("mus04")
    private Villager mus04;

    @SerializedName("mus01")
    private Villager mus01;

    @SerializedName("mus02")
    private Villager mus02;

    @SerializedName("mus00")
    private Villager mus00;

    @SerializedName("elp12")
    private Villager elp12;

    @SerializedName("elp10")
    private Villager elp10;

    @SerializedName("hrs16")
    private Villager hrs16;

    @SerializedName("hrs13")
    private Villager hrs13;

    @SerializedName("hrs12")
    private Villager hrs12;

    @SerializedName("hrs11")
    private Villager hrs11;

    @SerializedName("hrs10")
    private Villager hrs10;

    @SerializedName("cow01")
    private Villager cow01;

    @SerializedName("cow00")
    private Villager cow00;

    @SerializedName("cow07")
    private Villager cow07;

    @SerializedName("cow06")
    private Villager cow06;

    @SerializedName("shp02")
    private Villager shp02;

    @SerializedName("shp01")
    private Villager shp01;

    @SerializedName("shp04")
    private Villager shp04;

    @SerializedName("shp03")
    private Villager shp03;

    @SerializedName("shp00")
    private Villager shp00;

    @SerializedName("hrs06")
    private Villager hrs06;

    @SerializedName("hrs05")
    private Villager hrs05;

    @SerializedName("hrs04")
    private Villager hrs04;

    @SerializedName("hrs03")
    private Villager hrs03;

    @SerializedName("hrs02")
    private Villager hrs02;

    @SerializedName("hrs01")
    private Villager hrs01;

    @SerializedName("hrs00")
    private Villager hrs00;

    @SerializedName("dog01")
    private Villager dog01;

    @SerializedName("dog00")
    private Villager dog00;

    @SerializedName("dog03")
    private Villager dog03;

    @SerializedName("dog02")
    private Villager dog02;

    @SerializedName("goa09")
    private Villager goa09;

    @SerializedName("hrs09")
    private Villager hrs09;

    @SerializedName("goa08")
    private Villager goa08;

    @SerializedName("hrs08")
    private Villager hrs08;

    @SerializedName("goa07")
    private Villager goa07;

    @SerializedName("hrs07")
    private Villager hrs07;

    @SerializedName("elp01")
    private Villager elp01;

    @SerializedName("elp02")
    private Villager elp02;

    @SerializedName("elp00")
    private Villager elp00;

    @SerializedName("elp05")
    private Villager elp05;

    @SerializedName("elp06")
    private Villager elp06;

    @SerializedName("elp03")
    private Villager elp03;

    @SerializedName("elp04")
    private Villager elp04;

    @SerializedName("elp09")
    private Villager elp09;

    @SerializedName("elp07")
    private Villager elp07;

    @SerializedName("chn05")
    private Villager chn05;

    @SerializedName("gor09")
    private Villager gor09;

    @SerializedName("chn00")
    private Villager chn00;

    @SerializedName("gor08")
    private Villager gor08;

    @SerializedName("chn01")
    private Villager chn01;

    @SerializedName("gor07")
    private Villager gor07;

    @SerializedName("chn02")
    private Villager chn02;

    @SerializedName("gor05")
    private Villager gor05;

    @SerializedName("gor04")
    private Villager gor04;

    @SerializedName("gor02")
    private Villager gor02;

    @SerializedName("dog16")
    private Villager dog16;

    @SerializedName("gor01")
    private Villager gor01;

    @SerializedName("cat10")
    private Villager cat10;

    @SerializedName("dog15")
    private Villager dog15;

    @SerializedName("gor00")
    private Villager gor00;

    @SerializedName("cat11")
    private Villager cat11;

    @SerializedName("chn09")
    private Villager chn09;

    @SerializedName("dog18")
    private Villager dog18;

    @SerializedName("cat12")
    private Villager cat12;

    @SerializedName("dog17")
    private Villager dog17;

    @SerializedName("cat13")
    private Villager cat13;

    @SerializedName("cat14")
    private Villager cat14;

    @SerializedName("cat15")
    private Villager cat15;

    @SerializedName("cat16")
    private Villager cat16;

    @SerializedName("cat17")
    private Villager cat17;

    @SerializedName("cat18")
    private Villager cat18;

    @SerializedName("cat19")
    private Villager cat19;

    @SerializedName("goa06")
    private Villager goa06;

    @SerializedName("goa04")
    private Villager goa04;

    @SerializedName("goa02")
    private Villager goa02;

    @SerializedName("goa01")
    private Villager goa01;

    @SerializedName("goa00")
    private Villager goa00;

    @SerializedName("dog14")
    private Villager dog14;

    @SerializedName("dog10")
    private Villager dog10;

    @SerializedName("dog09")
    private Villager dog09;

    @SerializedName("dog08")
    private Villager dog08;

    @SerializedName("dog05")
    private Villager dog05;

    @SerializedName("dog04")
    private Villager dog04;

    @SerializedName("cat00")
    private Villager cat00;

    @SerializedName("dog07")
    private Villager dog07;

    @SerializedName("gor10")
    private Villager gor10;

    @SerializedName("cat01")
    private Villager cat01;

    @SerializedName("dog06")
    private Villager dog06;

    @SerializedName("cat02")
    private Villager cat02;

    @SerializedName("cat03")
    private Villager cat03;

    @SerializedName("cat04")
    private Villager cat04;

    @SerializedName("cat05")
    private Villager cat05;

    @SerializedName("cat06")
    private Villager cat06;

    @SerializedName("cat07")
    private Villager cat07;

    @SerializedName("cat08")
    private Villager cat08;

    @SerializedName("cat09")
    private Villager cat09;

    @SerializedName("pig05")
    private Villager pig05;

    @SerializedName("pig04")
    private Villager pig04;

    @SerializedName("pig03")
    private Villager pig03;

    @SerializedName("pig02")
    private Villager pig02;

    @SerializedName("pig09")
    private Villager pig09;

    @SerializedName("pig08")
    private Villager pig08;

    @SerializedName("ocp02")
    private Villager ocp02;

    @SerializedName("pig01")
    private Villager pig01;

    @SerializedName("pig00")
    private Villager pig00;

    @SerializedName("ocp00")
    private Villager ocp00;

    @SerializedName("ocp01")
    private Villager ocp01;

    @SerializedName("pig16")
    private Villager pig16;

    @SerializedName("pig15")
    private Villager pig15;

    @SerializedName("pig14")
    private Villager pig14;

    @SerializedName("pig13")
    private Villager pig13;

    @SerializedName("pig17")
    private Villager pig17;

    @SerializedName("ham03")
    private Villager ham03;

    @SerializedName("ham02")
    private Villager ham02;

    @SerializedName("ham01")
    private Villager ham01;

    @SerializedName("ham00")
    private Villager ham00;

    @SerializedName("pig11")
    private Villager pig11;

    @SerializedName("pig10")
    private Villager pig10;

    @SerializedName("ham07")
    private Villager ham07;

    @SerializedName("ham06")
    private Villager ham06;

    @SerializedName("ham05")
    private Villager ham05;

    @SerializedName("ham04")
    private Villager ham04;

    @SerializedName("brd06")
    private Villager brd06;

    @SerializedName("shp09")
    private Villager shp09;

    @SerializedName("brd04")
    private Villager brd04;

    @SerializedName("brd05")
    private Villager brd05;

    @SerializedName("brd08")
    private Villager brd08;

    @SerializedName("shp08")
    private Villager shp08;

    @SerializedName("shp07")
    private Villager shp07;

    @SerializedName("rhn07")
    private Villager rhn07;

    @SerializedName("bea10")
    private Villager bea10;

    @SerializedName("bea11")
    private Villager bea11;

    @SerializedName("bea12")
    private Villager bea12;

    @SerializedName("rhn04")
    private Villager rhn04;

    @SerializedName("brd02")
    private Villager brd02;

    @SerializedName("brd03")
    private Villager brd03;

    @SerializedName("rhn02")
    private Villager rhn02;

    @SerializedName("brd00")
    private Villager brd00;

    @SerializedName("rhn01")
    private Villager rhn01;

    @SerializedName("brd01")
    private Villager brd01;

    @SerializedName("rhn00")
    private Villager rhn00;

    @SerializedName("bea06")
    private Villager bea06;

    @SerializedName("bea07")
    private Villager bea07;

    @SerializedName("bea08")
    private Villager bea08;

    @SerializedName("bea09")
    private Villager bea09;

    @SerializedName("bea02")
    private Villager bea02;

    @SerializedName("bea03")
    private Villager bea03;

    @SerializedName("bea05")
    private Villager bea05;

    @SerializedName("shp13")
    private Villager shp13;

    @SerializedName("shp12")
    private Villager shp12;

    @SerializedName("shp15")
    private Villager shp15;

    @SerializedName("shp11")
    private Villager shp11;

    @SerializedName("shp10")
    private Villager shp10;

    @SerializedName("brd17")
    private Villager brd17;

    @SerializedName("brd18")
    private Villager brd18;

    @SerializedName("brd15")
    private Villager brd15;

    @SerializedName("brd16")
    private Villager brd16;

    @SerializedName("brd11")
    private Villager brd11;

    @SerializedName("bea13")
    private Villager bea13;

    @SerializedName("bea14")
    private Villager bea14;

    @SerializedName("bea15")
    private Villager bea15;

    @SerializedName("rbt11")
    private Villager rbt11;

    @SerializedName("rbt12")
    private Villager rbt12;

    @SerializedName("rbt13")
    private Villager rbt13;

    @SerializedName("rbt14")
    private Villager rbt14;

    @SerializedName("rbt10")
    private Villager rbt10;

    @SerializedName("rbt19")
    private Villager rbt19;

    @SerializedName("rbt15")
    private Villager rbt15;

    @SerializedName("rbt16")
    private Villager rbt16;

    @SerializedName("rbt17")
    private Villager rbt17;

    @SerializedName("rbt18")
    private Villager rbt18;

    @SerializedName("rbt00")
    private Villager rbt00;

    @SerializedName("crd04")
    private Villager crd04;

    @SerializedName("rbt01")
    private Villager rbt01;

    @SerializedName("rbt02")
    private Villager rbt02;

    @SerializedName("crd06")
    private Villager crd06;

    @SerializedName("rbt03")
    private Villager rbt03;

    @SerializedName("crd07")
    private Villager crd07;

    @SerializedName("crd08")
    private Villager crd08;

    @SerializedName("rbt08")
    private Villager rbt08;

    @SerializedName("rbt09")
    private Villager rbt09;

    @SerializedName("rbt04")
    private Villager rbt04;

    @SerializedName("crd00")
    private Villager crd00;

    @SerializedName("rbt05")
    private Villager rbt05;

    @SerializedName("crd01")
    private Villager crd01;

    @SerializedName("rbt06")
    private Villager rbt06;

    @SerializedName("crd02")
    private Villager crd02;

    @SerializedName("rbt07")
    private Villager rbt07;

    @SerializedName("ost02")
    private Villager ost02;

    @SerializedName("ost03")
    private Villager ost03;

    @SerializedName("ost00")
    private Villager ost00;

    @SerializedName("ost01")
    private Villager ost01;

    @SerializedName("ost06")
    private Villager ost06;

    @SerializedName("ost07")
    private Villager ost07;

    @SerializedName("ost05")
    private Villager ost05;

    @SerializedName("ost08")
    private Villager ost08;

    @SerializedName("ost09")
    private Villager ost09;

    @SerializedName("wol00")
    private Villager wol00;

    @SerializedName("wol01")
    private Villager wol01;

    @SerializedName("wol02")
    private Villager wol02;

    @SerializedName("wol03")
    private Villager wol03;

    @SerializedName("wol04")
    private Villager wol04;

    @SerializedName("wol05")
    private Villager wol05;

    @SerializedName("wol06")
    private Villager wol06;

    @SerializedName("wol08")
    private Villager wol08;

    @SerializedName("wol09")
    private Villager wol09;

    @SerializedName("bea00")
    private Villager bea00;

    @SerializedName("bea01")
    private Villager bea01;

    @SerializedName("wol10")
    private Villager wol10;

    @SerializedName("wol12")
    private Villager wol12;

    @SerializedName("rhn08")
    private Villager rhn08;

    @SerializedName("ost10")
    private Villager ost10;

    @SerializedName("flg19")
    private Villager flg19;

    @SerializedName("flg18")
    private Villager flg18;

    @SerializedName("flg17")
    private Villager flg17;

    @SerializedName("flg16")
    private Villager flg16;

    @SerializedName("flg15")
    private Villager flg15;

    @SerializedName("flg13")
    private Villager flg13;

    @SerializedName("flg12")
    private Villager flg12;

    @SerializedName("flg11")
    private Villager flg11;

    @SerializedName("flg10")
    private Villager flg10;

    @SerializedName("ant03")
    private Villager ant03;

    @SerializedName("bul01")
    private Villager bul01;

    @SerializedName("ant01")
    private Villager ant01;

    @SerializedName("bul00")
    private Villager bul00;

    @SerializedName("ant02")
    private Villager ant02;

    @SerializedName("ant08")
    private Villager ant08;

    @SerializedName("bul05")
    private Villager bul05;

    @SerializedName("ant06")
    private Villager ant06;

    @SerializedName("bul03")
    private Villager bul03;

    @SerializedName("ant00")
    private Villager ant00;

    @SerializedName("ant09")
    private Villager ant09;

    @SerializedName("pgn03")
    private Villager pgn03;

    @SerializedName("pgn04")
    private Villager pgn04;

    @SerializedName("pgn01")
    private Villager pgn01;

    @SerializedName("pgn02")
    private Villager pgn02;

    @SerializedName("pgn05")
    private Villager pgn05;

    @SerializedName("pgn06")
    private Villager pgn06;

    @SerializedName("pgn00")
    private Villager pgn00;

    @SerializedName("bul08")
    private Villager bul08;

    @SerializedName("bul07")
    private Villager bul07;

    @SerializedName("pgn14")
    private Villager pgn14;

    @SerializedName("pgn12")
    private Villager pgn12;

    @SerializedName("pgn13")
    private Villager pgn13;

    @SerializedName("flg09")
    private Villager flg09;

    @SerializedName("flg07")
    private Villager flg07;

    @SerializedName("flg06")
    private Villager flg06;

    @SerializedName("flg05")
    private Villager flg05;

    @SerializedName("flg04")
    private Villager flg04;

    @SerializedName("flg03")
    private Villager flg03;

    @SerializedName("flg02")
    private Villager flg02;

    @SerializedName("pgn10")
    private Villager pgn10;

    @SerializedName("flg01")
    private Villager flg01;

    @SerializedName("pgn11")
    private Villager pgn11;

    @SerializedName("flg00")
    private Villager flg00;

    @SerializedName("pgn09")
    private Villager pgn09;

    public Villager getDuk17() {
        return duk17;
    }

    public Villager getHip00() {
        return hip00;
    }

    public Villager getDuk16() {
        return duk16;
    }

    public Villager getDuk15() {
        return duk15;
    }

    public Villager getDuk13() {
        return duk13;
    }

    public Villager getDuk12() {
        return duk12;
    }

    public Villager getDuk11() {
        return duk11;
    }

    public Villager getDuk10() {
        return duk10;
    }

    public Villager getHip09() {
        return hip09;
    }

    public Villager getDuk09() {
        return duk09;
    }

    public Villager getDuk08() {
        return duk08;
    }

    public Villager getDuk07() {
        return duk07;
    }

    public Villager getDuk06() {
        return duk06;
    }

    public Villager getHip03() {
        return hip03;
    }

    public Villager getHip04() {
        return hip04;
    }

    public Villager getHip02() {
        return hip02;
    }

    public Villager getHip08() {
        return hip08;
    }

    public Villager getHip05() {
        return hip05;
    }

    public Villager getMnk08() {
        return mnk08;
    }

    public Villager getMnk07() {
        return mnk07;
    }

    public Villager getMnk06() {
        return mnk06;
    }

    public Villager getKal01() {
        return kal01;
    }

    public Villager getKal00() {
        return kal00;
    }

    public Villager getKal03() {
        return kal03;
    }

    public Villager getKal02() {
        return kal02;
    }

    public Villager getKal05() {
        return kal05;
    }

    public Villager getKal04() {
        return kal04;
    }

    public Villager getKal09() {
        return kal09;
    }

    public Villager getKal08() {
        return kal08;
    }

    public Villager getMnk01() {
        return mnk01;
    }

    public Villager getMnk05() {
        return mnk05;
    }

    public Villager getMnk04() {
        return mnk04;
    }

    public Villager getMnk03() {
        return mnk03;
    }

    public Villager getMnk02() {
        return mnk02;
    }

    public Villager getDer00() {
        return der00;
    }

    public Villager getDer01() {
        return der01;
    }

    public Villager getDer02() {
        return der02;
    }

    public Villager getDer03() {
        return der03;
    }

    public Villager getKal10() {
        return kal10;
    }

    public Villager getDer04() {
        return der04;
    }

    public Villager getDer05() {
        return der05;
    }

    public Villager getDer06() {
        return der06;
    }

    public Villager getDer07() {
        return der07;
    }

    public Villager getDer08() {
        return der08;
    }

    public Villager getDer09() {
        return der09;
    }

    public Villager getTig01() {
        return tig01;
    }

    public Villager getTig00() {
        return tig00;
    }

    public Villager getTig05() {
        return tig05;
    }

    public Villager getTig04() {
        return tig04;
    }

    public Villager getTig03() {
        return tig03;
    }

    public Villager getTig02() {
        return tig02;
    }

    public Villager getTig06() {
        return tig06;
    }

    public Villager getPbr08() {
        return pbr08;
    }

    public Villager getSqu02() {
        return squ02;
    }

    public Villager getPbr09() {
        return pbr09;
    }

    public Villager getSqu01() {
        return squ01;
    }

    public Villager getCbr00() {
        return cbr00;
    }

    public Villager getSqu04() {
        return squ04;
    }

    public Villager getSqu03() {
        return squ03;
    }

    public Villager getCbr02() {
        return cbr02;
    }

    public Villager getSqu06() {
        return squ06;
    }

    public Villager getCbr01() {
        return cbr01;
    }

    public Villager getSqu05() {
        return squ05;
    }

    public Villager getCbr04() {
        return cbr04;
    }

    public Villager getSqu08() {
        return squ08;
    }

    public Villager getCbr03() {
        return cbr03;
    }

    public Villager getSqu07() {
        return squ07;
    }

    public Villager getCbr06() {
        return cbr06;
    }

    public Villager getPbr00() {
        return pbr00;
    }

    public Villager getCbr05() {
        return cbr05;
    }

    public Villager getPbr01() {
        return pbr01;
    }

    public Villager getPbr02() {
        return pbr02;
    }

    public Villager getCbr07() {
        return cbr07;
    }

    public Villager getPbr03() {
        return pbr03;
    }

    public Villager getCbr09() {
        return cbr09;
    }

    public Villager getPbr05() {
        return pbr05;
    }

    public Villager getPbr06() {
        return pbr06;
    }

    public Villager getSqu00() {
        return squ00;
    }

    public Villager getPbr07() {
        return pbr07;
    }

    public Villager getLon04() {
        return lon04;
    }

    public Villager getSqu09() {
        return squ09;
    }

    public Villager getLon01() {
        return lon01;
    }

    public Villager getLon02() {
        return lon02;
    }

    public Villager getLon00() {
        return lon00;
    }

    public Villager getSqu13() {
        return squ13;
    }

    public Villager getSqu15() {
        return squ15;
    }

    public Villager getSqu14() {
        return squ14;
    }

    public Villager getLon07() {
        return lon07;
    }

    public Villager getSqu17() {
        return squ17;
    }

    public Villager getLon08() {
        return lon08;
    }

    public Villager getSqu16() {
        return squ16;
    }

    public Villager getLon06() {
        return lon06;
    }

    public Villager getSqu18() {
        return squ18;
    }

    public Villager getSqu11() {
        return squ11;
    }

    public Villager getSqu10() {
        return squ10;
    }

    public Villager getDuk05() {
        return duk05;
    }

    public Villager getDuk04() {
        return duk04;
    }

    public Villager getDuk03() {
        return duk03;
    }

    public Villager getDuk02() {
        return duk02;
    }

    public Villager getDuk01() {
        return duk01;
    }

    public Villager getDuk00() {
        return duk00;
    }

    public Villager getCbr10() {
        return cbr10;
    }

    public Villager getCbr13() {
        return cbr13;
    }

    public Villager getCbr15() {
        return cbr15;
    }

    public Villager getCbr14() {
        return cbr14;
    }

    public Villager getCbr17() {
        return cbr17;
    }

    public Villager getCbr16() {
        return cbr16;
    }

    public Villager getCbr19() {
        return cbr19;
    }

    public Villager getKgr00() {
        return kgr00;
    }

    public Villager getKgr01() {
        return kgr01;
    }

    public Villager getMus18() {
        return mus18;
    }

    public Villager getMus16() {
        return mus16;
    }

    public Villager getMus17() {
        return mus17;
    }

    public Villager getKgr06() {
        return kgr06;
    }

    public Villager getKgr08() {
        return kgr08;
    }

    public Villager getKgr09() {
        return kgr09;
    }

    public Villager getKgr02() {
        return kgr02;
    }

    public Villager getKgr05() {
        return kgr05;
    }

    public Villager getMus14() {
        return mus14;
    }

    public Villager getMus15() {
        return mus15;
    }

    public Villager getMus12() {
        return mus12;
    }

    public Villager getMus10() {
        return mus10;
    }

    public Villager getKgr10() {
        return kgr10;
    }

    public Villager getMus09() {
        return mus09;
    }

    public Villager getMus08() {
        return mus08;
    }

    public Villager getMus05() {
        return mus05;
    }

    public Villager getChn10() {
        return chn10;
    }

    public Villager getChn11() {
        return chn11;
    }

    public Villager getChn12() {
        return chn12;
    }

    public Villager getChn13() {
        return chn13;
    }

    public Villager getCat20() {
        return cat20;
    }

    public Villager getCat21() {
        return cat21;
    }

    public Villager getCat23() {
        return cat23;
    }

    public Villager getMus03() {
        return mus03;
    }

    public Villager getMus04() {
        return mus04;
    }

    public Villager getMus01() {
        return mus01;
    }

    public Villager getMus02() {
        return mus02;
    }

    public Villager getMus00() {
        return mus00;
    }

    public Villager getElp12() {
        return elp12;
    }

    public Villager getElp10() {
        return elp10;
    }

    public Villager getHrs16() {
        return hrs16;
    }

    public Villager getHrs13() {
        return hrs13;
    }

    public Villager getHrs12() {
        return hrs12;
    }

    public Villager getHrs11() {
        return hrs11;
    }

    public Villager getHrs10() {
        return hrs10;
    }

    public Villager getCow01() {
        return cow01;
    }

    public Villager getCow00() {
        return cow00;
    }

    public Villager getCow07() {
        return cow07;
    }

    public Villager getCow06() {
        return cow06;
    }

    public Villager getShp02() {
        return shp02;
    }

    public Villager getShp01() {
        return shp01;
    }

    public Villager getShp04() {
        return shp04;
    }

    public Villager getShp03() {
        return shp03;
    }

    public Villager getShp00() {
        return shp00;
    }

    public Villager getHrs06() {
        return hrs06;
    }

    public Villager getHrs05() {
        return hrs05;
    }

    public Villager getHrs04() {
        return hrs04;
    }

    public Villager getHrs03() {
        return hrs03;
    }

    public Villager getHrs02() {
        return hrs02;
    }

    public Villager getHrs01() {
        return hrs01;
    }

    public Villager getHrs00() {
        return hrs00;
    }

    public Villager getDog01() {
        return dog01;
    }

    public Villager getDog00() {
        return dog00;
    }

    public Villager getDog03() {
        return dog03;
    }

    public Villager getDog02() {
        return dog02;
    }

    public Villager getGoa09() {
        return goa09;
    }

    public Villager getHrs09() {
        return hrs09;
    }

    public Villager getGoa08() {
        return goa08;
    }

    public Villager getHrs08() {
        return hrs08;
    }

    public Villager getGoa07() {
        return goa07;
    }

    public Villager getHrs07() {
        return hrs07;
    }

    public Villager getElp01() {
        return elp01;
    }

    public Villager getElp02() {
        return elp02;
    }

    public Villager getElp00() {
        return elp00;
    }

    public Villager getElp05() {
        return elp05;
    }

    public Villager getElp06() {
        return elp06;
    }

    public Villager getElp03() {
        return elp03;
    }

    public Villager getElp04() {
        return elp04;
    }

    public Villager getElp09() {
        return elp09;
    }

    public Villager getElp07() {
        return elp07;
    }

    public Villager getChn05() {
        return chn05;
    }

    public Villager getGor09() {
        return gor09;
    }

    public Villager getChn00() {
        return chn00;
    }

    public Villager getGor08() {
        return gor08;
    }

    public Villager getChn01() {
        return chn01;
    }

    public Villager getGor07() {
        return gor07;
    }

    public Villager getChn02() {
        return chn02;
    }

    public Villager getGor05() {
        return gor05;
    }

    public Villager getGor04() {
        return gor04;
    }

    public Villager getGor02() {
        return gor02;
    }

    public Villager getDog16() {
        return dog16;
    }

    public Villager getGor01() {
        return gor01;
    }

    public Villager getCat10() {
        return cat10;
    }

    public Villager getDog15() {
        return dog15;
    }

    public Villager getGor00() {
        return gor00;
    }

    public Villager getCat11() {
        return cat11;
    }

    public Villager getChn09() {
        return chn09;
    }

    public Villager getDog18() {
        return dog18;
    }

    public Villager getCat12() {
        return cat12;
    }

    public Villager getDog17() {
        return dog17;
    }

    public Villager getCat13() {
        return cat13;
    }

    public Villager getCat14() {
        return cat14;
    }

    public Villager getCat15() {
        return cat15;
    }

    public Villager getCat16() {
        return cat16;
    }

    public Villager getCat17() {
        return cat17;
    }

    public Villager getCat18() {
        return cat18;
    }

    public Villager getCat19() {
        return cat19;
    }

    public Villager getGoa06() {
        return goa06;
    }

    public Villager getGoa04() {
        return goa04;
    }

    public Villager getGoa02() {
        return goa02;
    }

    public Villager getGoa01() {
        return goa01;
    }

    public Villager getGoa00() {
        return goa00;
    }

    public Villager getDog14() {
        return dog14;
    }

    public Villager getDog10() {
        return dog10;
    }

    public Villager getDog09() {
        return dog09;
    }

    public Villager getDog08() {
        return dog08;
    }

    public Villager getDog05() {
        return dog05;
    }

    public Villager getDog04() {
        return dog04;
    }

    public Villager getCat00() {
        return cat00;
    }

    public Villager getDog07() {
        return dog07;
    }

    public Villager getGor10() {
        return gor10;
    }

    public Villager getCat01() {
        return cat01;
    }

    public Villager getDog06() {
        return dog06;
    }

    public Villager getCat02() {
        return cat02;
    }

    public Villager getCat03() {
        return cat03;
    }

    public Villager getCat04() {
        return cat04;
    }

    public Villager getCat05() {
        return cat05;
    }

    public Villager getCat06() {
        return cat06;
    }

    public Villager getCat07() {
        return cat07;
    }

    public Villager getCat08() {
        return cat08;
    }

    public Villager getCat09() {
        return cat09;
    }

    public Villager getPig05() {
        return pig05;
    }

    public Villager getPig04() {
        return pig04;
    }

    public Villager getPig03() {
        return pig03;
    }

    public Villager getPig02() {
        return pig02;
    }

    public Villager getPig09() {
        return pig09;
    }

    public Villager getPig08() {
        return pig08;
    }

    public Villager getOcp02() {
        return ocp02;
    }

    public Villager getPig01() {
        return pig01;
    }

    public Villager getPig00() {
        return pig00;
    }

    public Villager getOcp00() {
        return ocp00;
    }

    public Villager getOcp01() {
        return ocp01;
    }

    public Villager getPig16() {
        return pig16;
    }

    public Villager getPig15() {
        return pig15;
    }

    public Villager getPig14() {
        return pig14;
    }

    public Villager getPig13() {
        return pig13;
    }

    public Villager getPig17() {
        return pig17;
    }

    public Villager getHam03() {
        return ham03;
    }

    public Villager getHam02() {
        return ham02;
    }

    public Villager getHam01() {
        return ham01;
    }

    public Villager getHam00() {
        return ham00;
    }

    public Villager getPig11() {
        return pig11;
    }

    public Villager getPig10() {
        return pig10;
    }

    public Villager getHam07() {
        return ham07;
    }

    public Villager getHam06() {
        return ham06;
    }

    public Villager getHam05() {
        return ham05;
    }

    public Villager getHam04() {
        return ham04;
    }

    public Villager getBrd06() {
        return brd06;
    }

    public Villager getShp09() {
        return shp09;
    }

    public Villager getBrd04() {
        return brd04;
    }

    public Villager getBrd05() {
        return brd05;
    }

    public Villager getBrd08() {
        return brd08;
    }

    public Villager getShp08() {
        return shp08;
    }

    public Villager getShp07() {
        return shp07;
    }

    public Villager getRhn07() {
        return rhn07;
    }

    public Villager getBea10() {
        return bea10;
    }

    public Villager getBea11() {
        return bea11;
    }

    public Villager getBea12() {
        return bea12;
    }

    public Villager getRhn04() {
        return rhn04;
    }

    public Villager getBrd02() {
        return brd02;
    }

    public Villager getBrd03() {
        return brd03;
    }

    public Villager getRhn02() {
        return rhn02;
    }

    public Villager getBrd00() {
        return brd00;
    }

    public Villager getRhn01() {
        return rhn01;
    }

    public Villager getBrd01() {
        return brd01;
    }

    public Villager getRhn00() {
        return rhn00;
    }

    public Villager getBea06() {
        return bea06;
    }

    public Villager getBea07() {
        return bea07;
    }

    public Villager getBea08() {
        return bea08;
    }

    public Villager getBea09() {
        return bea09;
    }

    public Villager getBea02() {
        return bea02;
    }

    public Villager getBea03() {
        return bea03;
    }

    public Villager getBea05() {
        return bea05;
    }

    public Villager getShp13() {
        return shp13;
    }

    public Villager getShp12() {
        return shp12;
    }

    public Villager getShp15() {
        return shp15;
    }

    public Villager getShp11() {
        return shp11;
    }

    public Villager getShp10() {
        return shp10;
    }

    public Villager getBrd17() {
        return brd17;
    }

    public Villager getBrd18() {
        return brd18;
    }

    public Villager getBrd15() {
        return brd15;
    }

    public Villager getBrd16() {
        return brd16;
    }

    public Villager getBrd11() {
        return brd11;
    }

    public Villager getBea13() {
        return bea13;
    }

    public Villager getBea14() {
        return bea14;
    }

    public Villager getBea15() {
        return bea15;
    }

    public Villager getRbt11() {
        return rbt11;
    }

    public Villager getRbt12() {
        return rbt12;
    }

    public Villager getRbt13() {
        return rbt13;
    }

    public Villager getRbt14() {
        return rbt14;
    }

    public Villager getRbt10() {
        return rbt10;
    }

    public Villager getRbt19() {
        return rbt19;
    }

    public Villager getRbt15() {
        return rbt15;
    }

    public Villager getRbt16() {
        return rbt16;
    }

    public Villager getRbt17() {
        return rbt17;
    }

    public Villager getRbt18() {
        return rbt18;
    }

    public Villager getRbt00() {
        return rbt00;
    }

    public Villager getCrd04() {
        return crd04;
    }

    public Villager getRbt01() {
        return rbt01;
    }

    public Villager getRbt02() {
        return rbt02;
    }

    public Villager getCrd06() {
        return crd06;
    }

    public Villager getRbt03() {
        return rbt03;
    }

    public Villager getCrd07() {
        return crd07;
    }

    public Villager getCrd08() {
        return crd08;
    }

    public Villager getRbt08() {
        return rbt08;
    }

    public Villager getRbt09() {
        return rbt09;
    }

    public Villager getRbt04() {
        return rbt04;
    }

    public Villager getCrd00() {
        return crd00;
    }

    public Villager getRbt05() {
        return rbt05;
    }

    public Villager getCrd01() {
        return crd01;
    }

    public Villager getRbt06() {
        return rbt06;
    }

    public Villager getCrd02() {
        return crd02;
    }

    public Villager getRbt07() {
        return rbt07;
    }

    public Villager getOst02() {
        return ost02;
    }

    public Villager getOst03() {
        return ost03;
    }

    public Villager getOst00() {
        return ost00;
    }

    public Villager getOst01() {
        return ost01;
    }

    public Villager getOst06() {
        return ost06;
    }

    public Villager getOst07() {
        return ost07;
    }

    public Villager getOst05() {
        return ost05;
    }

    public Villager getOst08() {
        return ost08;
    }

    public Villager getOst09() {
        return ost09;
    }

    public Villager getWol00() {
        return wol00;
    }

    public Villager getWol01() {
        return wol01;
    }

    public Villager getWol02() {
        return wol02;
    }

    public Villager getWol03() {
        return wol03;
    }

    public Villager getWol04() {
        return wol04;
    }

    public Villager getWol05() {
        return wol05;
    }

    public Villager getWol06() {
        return wol06;
    }

    public Villager getWol08() {
        return wol08;
    }

    public Villager getWol09() {
        return wol09;
    }

    public Villager getBea00() {
        return bea00;
    }

    public Villager getBea01() {
        return bea01;
    }

    public Villager getWol10() {
        return wol10;
    }

    public Villager getWol12() {
        return wol12;
    }

    public Villager getRhn08() {
        return rhn08;
    }

    public Villager getOst10() {
        return ost10;
    }

    public Villager getFlg19() {
        return flg19;
    }

    public Villager getFlg18() {
        return flg18;
    }

    public Villager getFlg17() {
        return flg17;
    }

    public Villager getFlg16() {
        return flg16;
    }

    public Villager getFlg15() {
        return flg15;
    }

    public Villager getFlg13() {
        return flg13;
    }

    public Villager getFlg12() {
        return flg12;
    }

    public Villager getFlg11() {
        return flg11;
    }

    public Villager getFlg10() {
        return flg10;
    }

    public Villager getAnt03() {
        return ant03;
    }

    public Villager getBul01() {
        return bul01;
    }

    public Villager getAnt01() {
        return ant01;
    }

    public Villager getBul00() {
        return bul00;
    }

    public Villager getAnt02() {
        return ant02;
    }

    public Villager getAnt08() {
        return ant08;
    }

    public Villager getBul05() {
        return bul05;
    }

    public Villager getAnt06() {
        return ant06;
    }

    public Villager getBul03() {
        return bul03;
    }

    public Villager getAnt00() {
        return ant00;
    }

    public Villager getAnt09() {
        return ant09;
    }

    public Villager getPgn03() {
        return pgn03;
    }

    public Villager getPgn04() {
        return pgn04;
    }

    public Villager getPgn01() {
        return pgn01;
    }

    public Villager getPgn02() {
        return pgn02;
    }

    public Villager getPgn05() {
        return pgn05;
    }

    public Villager getPgn06() {
        return pgn06;
    }

    public Villager getPgn00() {
        return pgn00;
    }

    public Villager getBul08() {
        return bul08;
    }

    public Villager getBul07() {
        return bul07;
    }

    public Villager getPgn14() {
        return pgn14;
    }

    public Villager getPgn12() {
        return pgn12;
    }

    public Villager getPgn13() {
        return pgn13;
    }

    public Villager getFlg09() {
        return flg09;
    }

    public Villager getFlg07() {
        return flg07;
    }

    public Villager getFlg06() {
        return flg06;
    }

    public Villager getFlg05() {
        return flg05;
    }

    public Villager getFlg04() {
        return flg04;
    }

    public Villager getFlg03() {
        return flg03;
    }

    public Villager getFlg02() {
        return flg02;
    }

    public Villager getPgn10() {
        return pgn10;
    }

    public Villager getFlg01() {
        return flg01;
    }

    public Villager getPgn11() {
        return pgn11;
    }

    public Villager getFlg00() {
        return flg00;
    }

    public Villager getPgn09() {
        return pgn09;
    }

    public Villager getRandom() {
        List<Villager> villagers = Arrays.asList(duk17, hip00, duk16, duk15, duk13, duk12, duk11, duk10, hip09, duk09, duk08, duk07, duk06, hip03, hip04, hip02, hip08, hip05, mnk08, mnk07, mnk06, kal01, kal00, kal03, kal02, kal05, kal04, kal09, kal08, mnk01, mnk05, mnk04, mnk03, mnk02, der00, der01, der02, der03, kal10, der04, der05, der06, der07, der08, der09, tig01, tig00, tig05, tig04, tig03, tig02, tig06, pbr08, squ02, pbr09, squ01, cbr00, squ04, squ03, cbr02, squ06, cbr01, squ05, cbr04, squ08, cbr03, squ07, cbr06, pbr00, cbr05, pbr01, pbr02, cbr07, pbr03, cbr09, pbr05, pbr06, squ00, pbr07, lon04, squ09, lon01, lon02, lon00, squ13, squ15, squ14, lon07, squ17, lon08, squ16, lon06, squ18, squ11, squ10, duk05, duk04, duk03, duk02, duk01, duk00, cbr10, cbr13, cbr15, cbr14, cbr17, cbr16, cbr19, kgr00, kgr01, mus18, mus16, mus17, kgr06, kgr08, kgr09, kgr02, kgr05, mus14, mus15, mus12, mus10, kgr10, mus09, mus08, mus05, chn10, chn11, chn12, chn13, cat20, cat21, cat23, mus03, mus04, mus01, mus02, mus00, elp12, elp10, hrs16, hrs13, hrs12, hrs11, hrs10, cow01, cow00, cow07, cow06, shp02, shp01, shp04, shp03, shp00, hrs06, hrs05, hrs04, hrs03, hrs02, hrs01, hrs00, dog01, dog00, dog03, dog02, goa09, hrs09, goa08, hrs08, goa07, hrs07, elp01, elp02, elp00, elp05, elp06, elp03, elp04, elp09, elp07, chn05, gor09, chn00, gor08, chn01, gor07, chn02, gor05, gor04, gor02, dog16, gor01, cat10, dog15, gor00, cat11, chn09, dog18, cat12, dog17, cat13, cat14, cat15, cat16, cat17, cat18, cat19, goa06, goa04, goa02, goa01, goa00, dog14, dog10, dog09, dog08, dog05, dog04, cat00, dog07, gor10, cat01, dog06, cat02, cat03, cat04, cat05, cat06, cat07, cat08, cat09, pig05, pig04, pig03, pig02, pig09, pig08, ocp02, pig01, pig00, ocp00, ocp01, pig16, pig15, pig14, pig13, pig17, ham03, ham02, ham01, ham00, pig11, pig10, ham07, ham06, ham05, ham04, brd06, shp09, brd04, brd05, brd08, shp08, shp07, rhn07, bea10, bea11, bea12, rhn04, brd02, brd03, rhn02, brd00, rhn01, brd01, rhn00, bea06, bea07, bea08, bea09, bea02, bea03, bea05, shp13, shp12, shp15, shp11, shp10, brd17, brd18, brd15, brd16, brd11, bea13, bea14, bea15, rbt11, rbt12, rbt13, rbt14, rbt10, rbt19, rbt15, rbt16, rbt17, rbt18, rbt00, crd04, rbt01, rbt02, crd06, rbt03, crd07, crd08, rbt08, rbt09, rbt04, crd00, rbt05, crd01, rbt06, crd02, rbt07, ost02, ost03, ost00, ost01, ost06, ost07, ost05, ost08, ost09, wol00, wol01, wol02, wol03, wol04, wol05, wol06, wol08, wol09, bea00, bea01, wol10, wol12, rhn08, ost10, flg19, flg18, flg17, flg16, flg15, flg13, flg12, flg11, flg10, ant03, bul01, ant01, bul00, ant02, ant08, bul05, ant06, bul03, ant00, ant09, pgn03, pgn04, pgn01, pgn02, pgn05, pgn06, pgn00, bul08, bul07, pgn14, pgn12, pgn13, flg09, flg07, flg06, flg05, flg04, flg03, flg02, pgn10, flg01, pgn11, flg00, pgn09);
        return getRandomValue(villagers);
    }

    private Villager getRandomValue(List<Villager> villagers) {
        int index = new Random().nextInt(villagers.size());
        return villagers.get(index);
    }
}