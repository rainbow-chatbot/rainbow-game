/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Wallmounteds.java] created by Ji Sungbin on 21. 7. 23. 오전 4:14.
 *
 * Please see project github repository license.
 */

/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Wallmounteds.java] created by Ji Sungbin on 21. 7. 23. 오전 3:09.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.items.wallmounted;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import io.github.jisungbin.acnhapi.models.items.common.Item;
import io.github.jisungbin.acnhapi.models.items.common.ItemWrapper;

public class Wallmounteds implements ItemWrapper {
    @SerializedName("set_of_stockings")
    private List<Item> setOfStockings;

    @SerializedName("gold_HHA_plaque")
    private List<Item> goldHHAPlaque;

    @SerializedName("pennant")
    private List<Item> pennant;

    @SerializedName("Mom's_embroidery")
    private List<Item> momSEmbroidery;

    @SerializedName("ornament_mobile")
    private List<Item> ornamentMobile;

    @SerializedName("pretty_tulip_wreath")
    private List<Item> prettyTulipWreath;

    @SerializedName("Bunny_Day_wall_clock")
    private List<Item> bunnyDayWallClock;

    @SerializedName("wall-mounted_candle")
    private List<Item> wallMountedCandle;

    @SerializedName("fishing-boat_flag")
    private List<Item> fishingBoatFlag;

    @SerializedName("imperial_decorative_shelves")
    private List<Item> imperialDecorativeShelves;

    @SerializedName("timber_doorplate")
    private List<Item> timberDoorplate;

    @SerializedName("fossil_doorplate")
    private List<Item> fossilDoorplate;

    @SerializedName("golden_gears")
    private List<Item> goldenGears;

    @SerializedName("gears")
    private List<Item> gears;

    @SerializedName("hyacinth_wreath")
    private List<Item> hyacinthWreath;

    @SerializedName("party_garland")
    private List<Item> partyGarland;

    @SerializedName("Bunny_Day_wreath")
    private List<Item> bunnyDayWreath;

    @SerializedName("fish_doorplate")
    private List<Item> fishDoorplate;

    @SerializedName("fancy_mum_wreath")
    private List<Item> fancyMumWreath;

    @SerializedName("skull_doorplate")
    private List<Item> skullDoorplate;

    @SerializedName("deer_decoration")
    private List<Item> deerDecoration;

    @SerializedName("mushroom_wreath")
    private List<Item> mushroomWreath;

    @SerializedName("dark_tulip_wreath")
    private List<Item> darkTulipWreath;

    @SerializedName("hanging_scroll")
    private List<Item> hangingScroll;

    @SerializedName("heart_doorplate")
    private List<Item> heartDoorplate;

    @SerializedName("shower_set")
    private List<Item> showerSet;

    @SerializedName("Mom's_art")
    private List<Item> momSArt;

    @SerializedName("bathroom_towel_rack")
    private List<Item> bathroomTowelRack;

    @SerializedName("pot_rack")
    private List<Item> potRack;

    @SerializedName("cuckoo_clock")
    private List<Item> cuckooClock;

    @SerializedName("fossil_plaque")
    private List<Item> fossilPlaque;

    @SerializedName("snazzy_pansy_wreath")
    private List<Item> snazzyPansyWreath;

    @SerializedName("New_Year's_shimekazari")
    private List<Item> newYearSShimekazari;

    @SerializedName("shamrock_doorplate")
    private List<Item> shamrockDoorplate;

    @SerializedName("cute_wall-mounted_clock")
    private List<Item> cuteWallMountedClock;

    @SerializedName("orange_wall-mounted_clock")
    private List<Item> orangeWallMountedClock;

    @SerializedName("cherry_lamp")
    private List<Item> cherryLamp;

    @SerializedName("gold_rose_wreath")
    private List<Item> goldRoseWreath;

    @SerializedName("hanging_terrarium")
    private List<Item> hangingTerrarium;

    @SerializedName("dark_lily_wreath")
    private List<Item> darkLilyWreath;

    @SerializedName("macrame_tapestry")
    private List<Item> macrameTapestry;

    @SerializedName("mum_wreath")
    private List<Item> mumWreath;

    @SerializedName("Bunny_Day_glowy_garland")
    private List<Item> bunnyDayGlowyGarland;

    @SerializedName("Leo_sculpture")
    private List<Item> leoSculpture;

    @SerializedName("tree_branch_wreath")
    private List<Item> treeBranchWreath;

    @SerializedName("bug_plaque")
    private List<Item> bugPlaque;

    @SerializedName("wall_fan")
    private List<Item> wallFan;

    @SerializedName("wall-mounted_phone")
    private List<Item> wallMountedPhone;

    @SerializedName("grasshopper-head_model")
    private List<Item> grasshopperHeadModel;

    @SerializedName("mermaid_wall_clock")
    private List<Item> mermaidWallClock;

    @SerializedName("tulip_wreath")
    private List<Item> tulipWreath;

    @SerializedName("intercom_monitor")
    private List<Item> intercomMonitor;

    @SerializedName("butterfly-fish_model")
    private List<Item> butterflyFishModel;

    @SerializedName("log_wall-mounted_clock")
    private List<Item> logWallMountedClock;

    @SerializedName("cosmos_wreath")
    private List<Item> cosmosWreath;

    @SerializedName("lily_wreath")
    private List<Item> lilyWreath;

    @SerializedName("chic_windflower_wreath")
    private List<Item> chicWindflowerWreath;

    @SerializedName("rose_wreath")
    private List<Item> roseWreath;

    @SerializedName("exit_sign")
    private List<Item> exitSign;

    @SerializedName("antique_phone")
    private List<Item> antiquePhone;

    @SerializedName("HHA_pennant")
    private List<Item> hHAPennant;

    @SerializedName("blue_rose_wreath")
    private List<Item> blueRoseWreath;

    @SerializedName("purple_hyacinth_wreath")
    private List<Item> purpleHyacinthWreath;

    @SerializedName("pendulum_clock")
    private List<Item> pendulumClock;

    @SerializedName("boomerang")
    private List<Item> boomerang;

    @SerializedName("ventilation_fan")
    private List<Item> ventilationFan;

    @SerializedName("autograph_cards")
    private List<Item> autographCards;

    @SerializedName("pansy_wreath")
    private List<Item> pansyWreath;

    @SerializedName("mounted_blue_marlin")
    private List<Item> mountedBlueMarlin;

    @SerializedName("fish_print")
    private List<Item> fishPrint;

    @SerializedName("ironwood_clock")
    private List<Item> ironwoodClock;

    @SerializedName("magnetic_knife_rack")
    private List<Item> magneticKnifeRack;

    @SerializedName("studio_wall_spotlight")
    private List<Item> studioWallSpotlight;

    @SerializedName("iron_doorplate")
    private List<Item> ironDoorplate;

    @SerializedName("breaker")
    private List<Item> breaker;

    @SerializedName("wall-mounted_TV_(20_in.)")
    private List<Item> wallMountedTV20In;

    @SerializedName("study_poster")
    private List<Item> studyPoster;

    @SerializedName("wooden-block_wall_clock")
    private List<Item> woodenBlockWallClock;

    @SerializedName("formal_paper")
    private List<Item> formalPaper;

    @SerializedName("ornament_wreath")
    private List<Item> ornamentWreath;

    @SerializedName("wall-mounted_tool_board")
    private List<Item> wallMountedToolBoard;

    @SerializedName("diner_neon_clock")
    private List<Item> dinerNeonClock;

    @SerializedName("tapestry")
    private List<Item> tapestry;

    @SerializedName("windflower_wreath")
    private List<Item> windflowerWreath;

    @SerializedName("fish_plaque")
    private List<Item> fishPlaque;

    @SerializedName("snowflake_wreath")
    private List<Item> snowflakeWreath;

    @SerializedName("wall_clock")
    private List<Item> wallClock;

    @SerializedName("bronze_HHA_plaque")
    private List<Item> bronzeHHAPlaque;

    @SerializedName("cherry-blossom_clock")
    private List<Item> cherryBlossomClock;

    @SerializedName("corkboard")
    private List<Item> corkboard;

    @SerializedName("imperial_dining_lantern")
    private List<Item> imperialDiningLantern;

    @SerializedName("iron_wall_lamp")
    private List<Item> ironWallLamp;

    @SerializedName("iron_wall_rack")
    private List<Item> ironWallRack;

    @SerializedName("fancy_lily_wreath")
    private List<Item> fancyLilyWreath;

    @SerializedName("crest_doorplate")
    private List<Item> crestDoorplate;

    @SerializedName("throwback_wall_clock")
    private List<Item> throwbackWallClock;

    @SerializedName("wedding_decoration")
    private List<Item> weddingDecoration;

    @SerializedName("fruit_wreath")
    private List<Item> fruitWreath;

    @SerializedName("silver_HHA_plaque")
    private List<Item> silverHHAPlaque;

    @SerializedName("Toy_Day_stockings")
    private List<Item> toyDayStockings;

    @SerializedName("wall-mounted_TV_(50_in.)")
    private List<Item> wallMountedTV50In;

    @SerializedName("spider_doorplate")
    private List<Item> spiderDoorplate;

    @SerializedName("chic_cosmos_wreath")
    private List<Item> chicCosmosWreath;

    @SerializedName("mounted_black_bass")
    private List<Item> mountedBlackBass;

    @SerializedName("wasp-head_model")
    private List<Item> waspHeadModel;

    @SerializedName("cool_pansy_wreath")
    private List<Item> coolPansyWreath;

    @SerializedName("tree's_bounty_mobile")
    private List<Item> treeSBountyMobile;

    @SerializedName("surveillance_camera")
    private List<Item> surveillanceCamera;

    @SerializedName("cool_windflower_wreath")
    private List<Item> coolWindflowerWreath;

    @SerializedName("floral_swag")
    private List<Item> floralSwag;

    @SerializedName("Sagittarius_arrow")
    private List<Item> sagittariusArrow;

    @SerializedName("paw-print_doorplate")
    private List<Item> pawPrintDoorplate;

    @SerializedName("shell_wreath")
    private List<Item> shellWreath;

    @SerializedName("pretty_cosmos_wreath")
    private List<Item> prettyCosmosWreath;

    @SerializedName("key_holder")
    private List<Item> keyHolder;

    @SerializedName("dark_rose_wreath")
    private List<Item> darkRoseWreath;

    @SerializedName("world_map")
    private List<Item> worldMap;

    @SerializedName("broom_and_dustpan")
    private List<Item> broomAndDustpan;

    @SerializedName("bamboo_wall_decoration")
    private List<Item> bambooWallDecoration;

    @SerializedName("festive_wreath")
    private List<Item> festiveWreath;

    @SerializedName("mobile")
    private List<Item> mobile;

    @SerializedName("cool_hyacinth_wreath")
    private List<Item> coolHyacinthWreath;

    @SerializedName("wooden-plank_sign")
    private List<Item> woodenPlankSign;

    @SerializedName("retro_radiator")
    private List<Item> retroRadiator;

    @SerializedName("fancy_rose_wreath")
    private List<Item> fancyRoseWreath;

    @SerializedName("spooky_garland")
    private List<Item> spookyGarland;

    @SerializedName("air_conditioner")
    private List<Item> airConditioner;

    @SerializedName("light_switch")
    private List<Item> lightSwitch;

    @SerializedName("bone_doorplate")
    private List<Item> boneDoorplate;

    @SerializedName("Lunar_New_Year_decoration")
    private List<Item> lunarNewYearDecoration;

    @SerializedName("natural_mum_wreath")
    private List<Item> naturalMumWreath;

    @SerializedName("double-sided_wall_clock")
    private List<Item> doubleSidedWallClock;

    @SerializedName("mantis-head_model")
    private List<Item> mantisHeadModel;

    @SerializedName("starry_garland")
    private List<Item> starryGarland;

    @SerializedName("potted_ivy")
    private List<Item> pottedIvy;

    @SerializedName("coconut_wall_planter")
    private List<Item> coconutWallPlanter;

    @SerializedName("Jack's_portrait")
    private List<Item> jackSPortrait;

    @SerializedName("spider_web")
    private List<Item> spiderWeb;

    public List<Item> getSetOfStockings() {
        return setOfStockings;
    }

    public List<Item> getGoldHHAPlaque() {
        return goldHHAPlaque;
    }

    public List<Item> getPennant() {
        return pennant;
    }

    public List<Item> getMomSEmbroidery() {
        return momSEmbroidery;
    }

    public List<Item> getOrnamentMobile() {
        return ornamentMobile;
    }

    public List<Item> getPrettyTulipWreath() {
        return prettyTulipWreath;
    }

    public List<Item> getBunnyDayWallClock() {
        return bunnyDayWallClock;
    }

    public List<Item> getWallMountedCandle() {
        return wallMountedCandle;
    }

    public List<Item> getFishingBoatFlag() {
        return fishingBoatFlag;
    }

    public List<Item> getImperialDecorativeShelves() {
        return imperialDecorativeShelves;
    }

    public List<Item> getTimberDoorplate() {
        return timberDoorplate;
    }

    public List<Item> getFossilDoorplate() {
        return fossilDoorplate;
    }

    public List<Item> getGoldenGears() {
        return goldenGears;
    }

    public List<Item> getGears() {
        return gears;
    }

    public List<Item> getHyacinthWreath() {
        return hyacinthWreath;
    }

    public List<Item> getPartyGarland() {
        return partyGarland;
    }

    public List<Item> getBunnyDayWreath() {
        return bunnyDayWreath;
    }

    public List<Item> getFishDoorplate() {
        return fishDoorplate;
    }

    public List<Item> getFancyMumWreath() {
        return fancyMumWreath;
    }

    public List<Item> getSkullDoorplate() {
        return skullDoorplate;
    }

    public List<Item> getDeerDecoration() {
        return deerDecoration;
    }

    public List<Item> getMushroomWreath() {
        return mushroomWreath;
    }

    public List<Item> getDarkTulipWreath() {
        return darkTulipWreath;
    }

    public List<Item> getHangingScroll() {
        return hangingScroll;
    }

    public List<Item> getHeartDoorplate() {
        return heartDoorplate;
    }

    public List<Item> getShowerSet() {
        return showerSet;
    }

    public List<Item> getMomSArt() {
        return momSArt;
    }

    public List<Item> getBathroomTowelRack() {
        return bathroomTowelRack;
    }

    public List<Item> getPotRack() {
        return potRack;
    }

    public List<Item> getCuckooClock() {
        return cuckooClock;
    }

    public List<Item> getFossilPlaque() {
        return fossilPlaque;
    }

    public List<Item> getSnazzyPansyWreath() {
        return snazzyPansyWreath;
    }

    public List<Item> getNewYearSShimekazari() {
        return newYearSShimekazari;
    }

    public List<Item> getShamrockDoorplate() {
        return shamrockDoorplate;
    }

    public List<Item> getCuteWallMountedClock() {
        return cuteWallMountedClock;
    }

    public List<Item> getOrangeWallMountedClock() {
        return orangeWallMountedClock;
    }

    public List<Item> getCherryLamp() {
        return cherryLamp;
    }

    public List<Item> getGoldRoseWreath() {
        return goldRoseWreath;
    }

    public List<Item> getHangingTerrarium() {
        return hangingTerrarium;
    }

    public List<Item> getDarkLilyWreath() {
        return darkLilyWreath;
    }

    public List<Item> getMacrameTapestry() {
        return macrameTapestry;
    }

    public List<Item> getMumWreath() {
        return mumWreath;
    }

    public List<Item> getBunnyDayGlowyGarland() {
        return bunnyDayGlowyGarland;
    }

    public List<Item> getLeoSculpture() {
        return leoSculpture;
    }

    public List<Item> getTreeBranchWreath() {
        return treeBranchWreath;
    }

    public List<Item> getBugPlaque() {
        return bugPlaque;
    }

    public List<Item> getWallFan() {
        return wallFan;
    }

    public List<Item> getWallMountedPhone() {
        return wallMountedPhone;
    }

    public List<Item> getGrasshopperHeadModel() {
        return grasshopperHeadModel;
    }

    public List<Item> getMermaidWallClock() {
        return mermaidWallClock;
    }

    public List<Item> getTulipWreath() {
        return tulipWreath;
    }

    public List<Item> getIntercomMonitor() {
        return intercomMonitor;
    }

    public List<Item> getButterflyFishModel() {
        return butterflyFishModel;
    }

    public List<Item> getLogWallMountedClock() {
        return logWallMountedClock;
    }

    public List<Item> getCosmosWreath() {
        return cosmosWreath;
    }

    public List<Item> getLilyWreath() {
        return lilyWreath;
    }

    public List<Item> getChicWindflowerWreath() {
        return chicWindflowerWreath;
    }

    public List<Item> getRoseWreath() {
        return roseWreath;
    }

    public List<Item> getExitSign() {
        return exitSign;
    }

    public List<Item> getAntiquePhone() {
        return antiquePhone;
    }

    public List<Item> getHHAPennant() {
        return hHAPennant;
    }

    public List<Item> getBlueRoseWreath() {
        return blueRoseWreath;
    }

    public List<Item> getPurpleHyacinthWreath() {
        return purpleHyacinthWreath;
    }

    public List<Item> getPendulumClock() {
        return pendulumClock;
    }

    public List<Item> getBoomerang() {
        return boomerang;
    }

    public List<Item> getVentilationFan() {
        return ventilationFan;
    }

    public List<Item> getAutographCards() {
        return autographCards;
    }

    public List<Item> getPansyWreath() {
        return pansyWreath;
    }

    public List<Item> getMountedBlueMarlin() {
        return mountedBlueMarlin;
    }

    public List<Item> getFishPrint() {
        return fishPrint;
    }

    public List<Item> getIronwoodClock() {
        return ironwoodClock;
    }

    public List<Item> getMagneticKnifeRack() {
        return magneticKnifeRack;
    }

    public List<Item> getStudioWallSpotlight() {
        return studioWallSpotlight;
    }

    public List<Item> getIronDoorplate() {
        return ironDoorplate;
    }

    public List<Item> getBreaker() {
        return breaker;
    }

    public List<Item> getWallMountedTV20In() {
        return wallMountedTV20In;
    }

    public List<Item> getStudyPoster() {
        return studyPoster;
    }

    public List<Item> getWoodenBlockWallClock() {
        return woodenBlockWallClock;
    }

    public List<Item> getFormalPaper() {
        return formalPaper;
    }

    public List<Item> getOrnamentWreath() {
        return ornamentWreath;
    }

    public List<Item> getWallMountedToolBoard() {
        return wallMountedToolBoard;
    }

    public List<Item> getDinerNeonClock() {
        return dinerNeonClock;
    }

    public List<Item> getTapestry() {
        return tapestry;
    }

    public List<Item> getWindflowerWreath() {
        return windflowerWreath;
    }

    public List<Item> getFishPlaque() {
        return fishPlaque;
    }

    public List<Item> getSnowflakeWreath() {
        return snowflakeWreath;
    }

    public List<Item> getWallClock() {
        return wallClock;
    }

    public List<Item> getBronzeHHAPlaque() {
        return bronzeHHAPlaque;
    }

    public List<Item> getCherryBlossomClock() {
        return cherryBlossomClock;
    }

    public List<Item> getCorkboard() {
        return corkboard;
    }

    public List<Item> getImperialDiningLantern() {
        return imperialDiningLantern;
    }

    public List<Item> getIronWallLamp() {
        return ironWallLamp;
    }

    public List<Item> getIronWallRack() {
        return ironWallRack;
    }

    public List<Item> getFancyLilyWreath() {
        return fancyLilyWreath;
    }

    public List<Item> getCrestDoorplate() {
        return crestDoorplate;
    }

    public List<Item> getThrowbackWallClock() {
        return throwbackWallClock;
    }

    public List<Item> getWeddingDecoration() {
        return weddingDecoration;
    }

    public List<Item> getFruitWreath() {
        return fruitWreath;
    }

    public List<Item> getSilverHHAPlaque() {
        return silverHHAPlaque;
    }

    public List<Item> getToyDayStockings() {
        return toyDayStockings;
    }

    public List<Item> getWallMountedTV50In() {
        return wallMountedTV50In;
    }

    public List<Item> getSpiderDoorplate() {
        return spiderDoorplate;
    }

    public List<Item> getChicCosmosWreath() {
        return chicCosmosWreath;
    }

    public List<Item> getMountedBlackBass() {
        return mountedBlackBass;
    }

    public List<Item> getWaspHeadModel() {
        return waspHeadModel;
    }

    public List<Item> getCoolPansyWreath() {
        return coolPansyWreath;
    }

    public List<Item> getTreeSBountyMobile() {
        return treeSBountyMobile;
    }

    public List<Item> getSurveillanceCamera() {
        return surveillanceCamera;
    }

    public List<Item> getCoolWindflowerWreath() {
        return coolWindflowerWreath;
    }

    public List<Item> getFloralSwag() {
        return floralSwag;
    }

    public List<Item> getSagittariusArrow() {
        return sagittariusArrow;
    }

    public List<Item> getPawPrintDoorplate() {
        return pawPrintDoorplate;
    }

    public List<Item> getShellWreath() {
        return shellWreath;
    }

    public List<Item> getPrettyCosmosWreath() {
        return prettyCosmosWreath;
    }

    public List<Item> getKeyHolder() {
        return keyHolder;
    }

    public List<Item> getDarkRoseWreath() {
        return darkRoseWreath;
    }

    public List<Item> getWorldMap() {
        return worldMap;
    }

    public List<Item> getBroomAndDustpan() {
        return broomAndDustpan;
    }

    public List<Item> getBambooWallDecoration() {
        return bambooWallDecoration;
    }

    public List<Item> getFestiveWreath() {
        return festiveWreath;
    }

    public List<Item> getMobile() {
        return mobile;
    }

    public List<Item> getCoolHyacinthWreath() {
        return coolHyacinthWreath;
    }

    public List<Item> getWoodenPlankSign() {
        return woodenPlankSign;
    }

    public List<Item> getRetroRadiator() {
        return retroRadiator;
    }

    public List<Item> getFancyRoseWreath() {
        return fancyRoseWreath;
    }

    public List<Item> getSpookyGarland() {
        return spookyGarland;
    }

    public List<Item> getAirConditioner() {
        return airConditioner;
    }

    public List<Item> getLightSwitch() {
        return lightSwitch;
    }

    public List<Item> getBoneDoorplate() {
        return boneDoorplate;
    }

    public List<Item> getLunarNewYearDecoration() {
        return lunarNewYearDecoration;
    }

    public List<Item> getNaturalMumWreath() {
        return naturalMumWreath;
    }

    public List<Item> getDoubleSidedWallClock() {
        return doubleSidedWallClock;
    }

    public List<Item> getMantisHeadModel() {
        return mantisHeadModel;
    }

    public List<Item> getStarryGarland() {
        return starryGarland;
    }

    public List<Item> getPottedIvy() {
        return pottedIvy;
    }

    public List<Item> getCoconutWallPlanter() {
        return coconutWallPlanter;
    }

    public List<Item> getJackSPortrait() {
        return jackSPortrait;
    }

    public List<Item> getSpiderWeb() {
        return spiderWeb;
    }

    public List<Item> getRandomType() {
        List<List<Item>> wallmounteds = Arrays.asList(setOfStockings, goldHHAPlaque, pennant, momSEmbroidery, ornamentMobile, prettyTulipWreath, bunnyDayWallClock, wallMountedCandle, fishingBoatFlag, imperialDecorativeShelves, timberDoorplate, fossilDoorplate, goldenGears, gears, hyacinthWreath, partyGarland, bunnyDayWreath, fishDoorplate, fancyMumWreath, skullDoorplate, deerDecoration, mushroomWreath, darkTulipWreath, hangingScroll, heartDoorplate, showerSet, momSArt, bathroomTowelRack, potRack, cuckooClock, fossilPlaque, snazzyPansyWreath, newYearSShimekazari, shamrockDoorplate, cuteWallMountedClock, orangeWallMountedClock, cherryLamp, goldRoseWreath, hangingTerrarium, darkLilyWreath, macrameTapestry, mumWreath, bunnyDayGlowyGarland, leoSculpture, treeBranchWreath, bugPlaque, wallFan, wallMountedPhone, grasshopperHeadModel, mermaidWallClock, tulipWreath, intercomMonitor, butterflyFishModel, logWallMountedClock, cosmosWreath, lilyWreath, chicWindflowerWreath, roseWreath, exitSign, antiquePhone, hHAPennant, blueRoseWreath, purpleHyacinthWreath, pendulumClock, boomerang, ventilationFan, autographCards, pansyWreath, mountedBlueMarlin, fishPrint, ironwoodClock, magneticKnifeRack, studioWallSpotlight, ironDoorplate, breaker, wallMountedTV20In, studyPoster, woodenBlockWallClock, formalPaper, ornamentWreath, wallMountedToolBoard, dinerNeonClock, tapestry, windflowerWreath, fishPlaque, snowflakeWreath, wallClock, bronzeHHAPlaque, cherryBlossomClock, corkboard, imperialDiningLantern, ironWallLamp, ironWallRack, fancyLilyWreath, crestDoorplate, throwbackWallClock, weddingDecoration, fruitWreath, silverHHAPlaque, toyDayStockings, wallMountedTV50In, spiderDoorplate, chicCosmosWreath, mountedBlackBass, waspHeadModel, coolPansyWreath, treeSBountyMobile, surveillanceCamera, coolWindflowerWreath, floralSwag, sagittariusArrow, pawPrintDoorplate, shellWreath, prettyCosmosWreath, keyHolder, darkRoseWreath, worldMap, broomAndDustpan, bambooWallDecoration, festiveWreath, mobile, coolHyacinthWreath, woodenPlankSign, retroRadiator, fancyRoseWreath, spookyGarland, airConditioner, lightSwitch, boneDoorplate, lunarNewYearDecoration, naturalMumWreath, doubleSidedWallClock, mantisHeadModel, starryGarland, pottedIvy, coconutWallPlanter, jackSPortrait, spiderWeb);
        return getRandomValue(wallmounteds);
    }

    private List<Item> getRandomValue(List<List<Item>> wallmounteds) {
        int index = new Random().nextInt(wallmounteds.size());
        return wallmounteds.get(index);
    }
}
