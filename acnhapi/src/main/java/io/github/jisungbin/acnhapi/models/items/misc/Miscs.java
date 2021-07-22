/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Miscs.java] created by Ji Sungbin on 21. 7. 23. 오전 3:20.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.items.misc;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import io.github.jisungbin.acnhapi.models.items.common.Item;
import io.github.jisungbin.acnhapi.models.items.common.ItemWrapper;

public class Miscs implements ItemWrapper {
    @SerializedName("magazine_rack")
    private List<Item> magazineRack;

    @SerializedName("beach_ball")
    private List<Item> beachBall;

    @SerializedName("Turkey_Day_casserole")
    private List<Item> turkeyDayCasserole;

    @SerializedName("pro_tape_recorder")
    private List<Item> proTapeRecorder;

    @SerializedName("laptop")
    private List<Item> laptop;

    @SerializedName("kettle")
    private List<Item> kettle;

    @SerializedName("bingo_wheel")
    private List<Item> bingoWheel;

    @SerializedName("cyclommatus_stag_model")
    private List<Item> cyclommatusStagModel;

    @SerializedName("barred_knifejaw_model")
    private List<Item> barredKnifejawModel;

    @SerializedName("great_purple_emperor_model")
    private List<Item> greatPurpleEmperorModel;

    @SerializedName("koi_model")
    private List<Item> koiModel;

    @SerializedName("hourglass")
    private List<Item> hourglass;

    @SerializedName("giant_water_bug_model")
    private List<Item> giantWaterBugModel;

    @SerializedName("robust_cicada_model")
    private List<Item> robustCicadaModel;

    @SerializedName("festive_top_set")
    private List<Item> festiveTopSet;

    @SerializedName("loach_model")
    private List<Item> loachModel;

    @SerializedName("garden_gnome")
    private List<Item> gardenGnome;

    @SerializedName("horse_mackerel_model")
    private List<Item> horseMackerelModel;

    @SerializedName("stovetop_espresso_maker")
    private List<Item> stovetopEspressoMaker;

    @SerializedName("Super_Mushroom")
    private List<Item> superMushroom;

    @SerializedName("cartoonist's_set")
    private List<Item> cartoonistSSet;

    @SerializedName("life_ring")
    private List<Item> lifeRing;

    @SerializedName("Pocket_modern_camper")
    private List<Item> pocketModernCamper;

    @SerializedName("earth-boring_dung_b._model")
    private List<Item> earthBoringDungBModel;

    @SerializedName("globe")
    private List<Item> globe;

    @SerializedName("blossom_lantern")
    private List<Item> blossomLantern;

    @SerializedName("sea_globe")
    private List<Item> seaGlobe;

    @SerializedName("crawfish_model")
    private List<Item> crawfishModel;

    @SerializedName("bamboo-shoot_lamp")
    private List<Item> bambooShootLamp;

    @SerializedName("snow_globe")
    private List<Item> snowGlobe;

    @SerializedName("giant_trevally_model")
    private List<Item> giantTrevallyModel;

    @SerializedName("moss_ball")
    private List<Item> mossBall;

    @SerializedName("migratory_locust_model")
    private List<Item> migratoryLocustModel;

    @SerializedName("gold_fish_trophy")
    private List<Item> goldFishTrophy;

    @SerializedName("bell_cricket_model")
    private List<Item> bellCricketModel;

    @SerializedName("blue_marlin_model")
    private List<Item> blueMarlinModel;

    @SerializedName("tadpole_model")
    private List<Item> tadpoleModel;

    @SerializedName("centipede_model")
    private List<Item> centipedeModel;

    @SerializedName("tiger_beetle_model")
    private List<Item> tigerBeetleModel;

    @SerializedName("cricket_model")
    private List<Item> cricketModel;

    @SerializedName("humidifier")
    private List<Item> humidifier;

    @SerializedName("blowfish_model")
    private List<Item> blowfishModel;

    @SerializedName("red_dragonfly_model")
    private List<Item> redDragonflyModel;

    @SerializedName("coffee_grinder")
    private List<Item> coffeeGrinder;

    @SerializedName("gold_bars")
    private List<Item> goldBars;

    @SerializedName("zebra_turkeyfish_model")
    private List<Item> zebraTurkeyfishModel;

    @SerializedName("New_Year's_noodles")
    private List<Item> newYearSNoodles;

    @SerializedName("terrarium")
    private List<Item> terrarium;

    @SerializedName("trash_bags")
    private List<Item> trashBags;

    @SerializedName("cute_music_player")
    private List<Item> cuteMusicPlayer;

    @SerializedName("tape_deck")
    private List<Item> tapeDeck;

    @SerializedName("drone_beetle_model")
    private List<Item> droneBeetleModel;

    @SerializedName("dinosaur_toy")
    private List<Item> dinosaurToy;

    @SerializedName("berliner")
    private List<Item> berliner;

    @SerializedName("fancy_violin")
    private List<Item> fancyViolin;

    @SerializedName("horned_atlas_model")
    private List<Item> hornedAtlasModel;

    @SerializedName("rainbow_stag_model")
    private List<Item> rainbowStagModel;

    @SerializedName("camp_stove")
    private List<Item> campStove;

    @SerializedName("recycled-can_thumb_piano")
    private List<Item> recycledCanThumbPiano;

    @SerializedName("olive_flounder_model")
    private List<Item> oliveFlounderModel;

    @SerializedName("Super_Star")
    private List<Item> superStar;

    @SerializedName("revolving_spice_rack")
    private List<Item> revolvingSpiceRack;

    @SerializedName("stand_mixer")
    private List<Item> standMixer;

    @SerializedName("sturgeon_model")
    private List<Item> sturgeonModel;

    @SerializedName("Turkey_Day_table_setting")
    private List<Item> turkeyDayTableSetting;

    @SerializedName("Turkey_Day_wheat_decor")
    private List<Item> turkeyDayWheatDecor;

    @SerializedName("espresso_maker")
    private List<Item> espressoMaker;

    @SerializedName("horned_dynastid_model")
    private List<Item> hornedDynastidModel;

    @SerializedName("pop-eyed_goldfish_model")
    private List<Item> popEyedGoldfishModel;

    @SerializedName("Baby_bear")
    private List<Item> babyBear;

    @SerializedName("Festivale_lamp")
    private List<Item> festivaleLamp;

    @SerializedName("fragrance_diffuser")
    private List<Item> fragranceDiffuser;

    @SerializedName("dinnerware")
    private List<Item> dinnerware;

    @SerializedName("paper_tiger")
    private List<Item> paperTiger;

    @SerializedName("typewriter")
    private List<Item> typewriter;

    @SerializedName("thank-you_Mom_mug")
    private List<Item> thankYouMomMug;

    @SerializedName("dung_beetle_model")
    private List<Item> dungBeetleModel;

    @SerializedName("firefly_model")
    private List<Item> fireflyModel;

    @SerializedName("thank-you_Dad_mug")
    private List<Item> thankYouDadMug;

    @SerializedName("modeling_clay")
    private List<Item> modelingClay;

    @SerializedName("pop-up_book")
    private List<Item> popUpBook;

    @SerializedName("silver_bug_trophy")
    private List<Item> silverBugTrophy;

    @SerializedName("rainbowfish_model")
    private List<Item> rainbowfishModel;

    @SerializedName("bluegill_model")
    private List<Item> bluegillModel;

    @SerializedName("lucky_cat")
    private List<Item> luckyCat;

    @SerializedName("plastic_canister")
    private List<Item> plasticCanister;

    @SerializedName("sea_bass_model")
    private List<Item> seaBassModel;

    @SerializedName("sturdy_sewing_box")
    private List<Item> sturdySewingBox;

    @SerializedName("coffee_cup")
    private List<Item> coffeeCup;

    @SerializedName("decoy_duck")
    private List<Item> decoyDuck;

    @SerializedName("fruit_basket")
    private List<Item> fruitBasket;

    @SerializedName("lucky_gold_cat")
    private List<Item> luckyGoldCat;

    @SerializedName("wasp_model")
    private List<Item> waspModel;

    @SerializedName("peach_surprise_box")
    private List<Item> peachSurpriseBox;

    @SerializedName("sewing_project")
    private List<Item> sewingProject;

    @SerializedName("portable_radio")
    private List<Item> portableRadio;

    @SerializedName("football")
    private List<Item> football;

    @SerializedName("nibble_fish_model")
    private List<Item> nibbleFishModel;

    @SerializedName("walker_cicada_model")
    private List<Item> walkerCicadaModel;

    @SerializedName("blue_weevil_beetle_model")
    private List<Item> blueWeevilBeetleModel;

    @SerializedName("surgeonfish_model")
    private List<Item> surgeonfishModel;

    @SerializedName("stack_of_books")
    private List<Item> stackOfBooks;

    @SerializedName("table_setting")
    private List<Item> tableSetting;

    @SerializedName("magazine")
    private List<Item> magazine;

    @SerializedName("aluminum_briefcase")
    private List<Item> aluminumBriefcase;

    @SerializedName("throwback_gothic_mirror")
    private List<Item> throwbackGothicMirror;

    @SerializedName("ACNH_Nintendo_Switch")
    private List<Item> aCNHNintendoSwitch;

    @SerializedName("peacock_butterfly_model")
    private List<Item> peacockButterflyModel;

    @SerializedName("1-Up_Mushroom")
    private List<Item> jsonMember1UpMushroom;

    @SerializedName("cicada_shell_model")
    private List<Item> cicadaShellModel;

    @SerializedName("giant_cicada_model")
    private List<Item> giantCicadaModel;

    @SerializedName("flea_model")
    private List<Item> fleaModel;

    @SerializedName("portable_record_player")
    private List<Item> portableRecordPlayer;

    @SerializedName("arowana_model")
    private List<Item> arowanaModel;

    @SerializedName("honeybee_model")
    private List<Item> honeybeeModel;

    @SerializedName("Scorpio_lamp")
    private List<Item> scorpioLamp;

    @SerializedName("ant_farm")
    private List<Item> antFarm;

    @SerializedName("rice_grasshopper_model")
    private List<Item> riceGrasshopperModel;

    @SerializedName("arapaima_model")
    private List<Item> arapaimaModel;

    @SerializedName("infused-water_dispenser")
    private List<Item> infusedWaterDispenser;

    @SerializedName("board_game")
    private List<Item> boardGame;

    @SerializedName("book_stands")
    private List<Item> bookStands;

    @SerializedName("bottled_ship")
    private List<Item> bottledShip;

    @SerializedName("digital_alarm_clock")
    private List<Item> digitalAlarmClock;

    @SerializedName("grand_giraffe_stag_model")
    private List<Item> grandGiraffeStagModel;

    @SerializedName("hyacinth_lamp")
    private List<Item> hyacinthLamp;

    @SerializedName("windflower_fan")
    private List<Item> windflowerFan;

    @SerializedName("damselfly_model")
    private List<Item> damselflyModel;

    @SerializedName("catfish_model")
    private List<Item> catfishModel;

    @SerializedName("mitten_crab_model")
    private List<Item> mittenCrabModel;

    @SerializedName("Newton's_cradle")
    private List<Item> newtonSCradle;

    @SerializedName("puffer_fish_model")
    private List<Item> pufferFishModel;

    @SerializedName("nail-art_set")
    private List<Item> nailArtSet;

    @SerializedName("spider_model")
    private List<Item> spiderModel;

    @SerializedName("coelacanth_model")
    private List<Item> coelacanthModel;

    @SerializedName("Yule_log")
    private List<Item> yuleLog;

    @SerializedName("bamboo_sphere")
    private List<Item> bambooSphere;

    @SerializedName("cassette_player")
    private List<Item> cassettePlayer;

    @SerializedName("butterfly_fish_model")
    private List<Item> butterflyFishModel;

    @SerializedName("toolbox")
    private List<Item> toolbox;

    @SerializedName("ray_model")
    private List<Item> rayModel;

    @SerializedName("Mom's_tissue_box")
    private List<Item> momSTissueBox;

    @SerializedName("Olivier_salad")
    private List<Item> olivierSalad;

    @SerializedName("old-fashioned_washtub")
    private List<Item> oldFashionedWashtub;

    @SerializedName("spooky_candy_set")
    private List<Item> spookyCandySet;

    @SerializedName("silver_fish_trophy")
    private List<Item> silverFishTrophy;

    @SerializedName("cherry_salmon_model")
    private List<Item> cherrySalmonModel;

    @SerializedName("neon_tetra_model")
    private List<Item> neonTetraModel;

    @SerializedName("Reese_&_Cyrus_photo_plate")
    private List<Item> reeseCyrusPhotoPlate;

    @SerializedName("holiday_candle")
    private List<Item> holidayCandle;

    @SerializedName("wooden_toolbox")
    private List<Item> woodenToolbox;

    @SerializedName("giant_stag_model")
    private List<Item> giantStagModel;

    @SerializedName("bamboo_drum")
    private List<Item> bambooDrum;

    @SerializedName("essay_set")
    private List<Item> essaySet;

    @SerializedName("dace_model")
    private List<Item> daceModel;

    @SerializedName("moray_eel_model")
    private List<Item> morayEelModel;

    @SerializedName("ranchu_goldfish_model")
    private List<Item> ranchuGoldfishModel;

    @SerializedName("common_butterfly_model")
    private List<Item> commonButterflyModel;

    @SerializedName("soft-shelled_turtle_model")
    private List<Item> softShelledTurtleModel;

    @SerializedName("Festivale_confetti_machine")
    private List<Item> festivaleConfettiMachine;

    @SerializedName("lab-experiments_set")
    private List<Item> labExperimentsSet;

    @SerializedName("lantern")
    private List<Item> lantern;

    @SerializedName("old-fashioned_alarm_clock")
    private List<Item> oldFashionedAlarmClock;

    @SerializedName("bronze_HHA_trophy")
    private List<Item> bronzeHHATrophy;

    @SerializedName("pop-up_toaster")
    private List<Item> popUpToaster;

    @SerializedName("stringfish_model")
    private List<Item> stringfishModel;

    @SerializedName("wharf_roach_model")
    private List<Item> wharfRoachModel;

    @SerializedName("bronze_fish_trophy")
    private List<Item> bronzeFishTrophy;

    @SerializedName("snail_model")
    private List<Item> snailModel;

    @SerializedName("candle")
    private List<Item> candle;

    @SerializedName("classic_pitcher")
    private List<Item> classicPitcher;

    @SerializedName("throwback_wrestling_figure")
    private List<Item> throwbackWrestlingFigure;

    @SerializedName("star_clock")
    private List<Item> starClock;

    @SerializedName("long_locust_model")
    private List<Item> longLocustModel;

    @SerializedName("sea_horse_model")
    private List<Item> seaHorseModel;

    @SerializedName("agrias_butterfly_model")
    private List<Item> agriasButterflyModel;

    @SerializedName("Resetti_model")
    private List<Item> resettiModel;

    @SerializedName("tea_set")
    private List<Item> teaSet;

    @SerializedName("incense_burner")
    private List<Item> incenseBurner;

    @SerializedName("succulent_plant")
    private List<Item> succulentPlant;

    @SerializedName("π_pie")
    private List<Item> pie;

    @SerializedName("killifish_model")
    private List<Item> killifishModel;

    @SerializedName("mole_cricket_model")
    private List<Item> moleCricketModel;

    @SerializedName("painting_set")
    private List<Item> paintingSet;

    @SerializedName("spooky_table_setting")
    private List<Item> spookyTableSetting;

    @SerializedName("moth_model")
    private List<Item> mothModel;

    @SerializedName("metronome")
    private List<Item> metronome;

    @SerializedName("heart-shaped_bouquet")
    private List<Item> heartShapedBouquet;

    @SerializedName("film_projector")
    private List<Item> filmProjector;

    @SerializedName("coconut_juice")
    private List<Item> coconutJuice;

    @SerializedName("shaved-ice_maker")
    private List<Item> shavedIceMaker;

    @SerializedName("frog_model")
    private List<Item> frogModel;

    @SerializedName("monarch_butterfly_model")
    private List<Item> monarchButterflyModel;

    @SerializedName("suckerfish_model")
    private List<Item> suckerfishModel;

    @SerializedName("king_salmon_model")
    private List<Item> kingSalmonModel;

    @SerializedName("soup_kettle")
    private List<Item> soupKettle;

    @SerializedName("gar_model")
    private List<Item> garModel;

    @SerializedName("mosquito_model")
    private List<Item> mosquitoModel;

    @SerializedName("desk_mirror")
    private List<Item> deskMirror;

    @SerializedName("evening_cicada_model")
    private List<Item> eveningCicadaModel;

    @SerializedName("nova_light")
    private List<Item> novaLight;

    @SerializedName("tuna_model")
    private List<Item> tunaModel;

    @SerializedName("kettlebell")
    private List<Item> kettlebell;

    @SerializedName("amp")
    private List<Item> amp;

    @SerializedName("toy_cockroach")
    private List<Item> toyCockroach;

    @SerializedName("jewel_beetle_model")
    private List<Item> jewelBeetleModel;

    @SerializedName("ball")
    private List<Item> ball;

    @SerializedName("darner_dragonfly_model")
    private List<Item> darnerDragonflyModel;

    @SerializedName("squid_model")
    private List<Item> squidModel;

    @SerializedName("frying_pan")
    private List<Item> fryingPan;

    @SerializedName("cream_and_sugar")
    private List<Item> creamAndSugar;

    @SerializedName("spooky_lantern")
    private List<Item> spookyLantern;

    @SerializedName("hamster_cage")
    private List<Item> hamsterCage;

    @SerializedName("microwave")
    private List<Item> microwave;

    @SerializedName("diving_beetle_model")
    private List<Item> divingBeetleModel;

    @SerializedName("carp_model")
    private List<Item> carpModel;

    @SerializedName("handy_water_cooler")
    private List<Item> handyWaterCooler;

    @SerializedName("judge's_bell")
    private List<Item> judgeSBell;

    @SerializedName("whale_shark_model")
    private List<Item> whaleSharkModel;

    @SerializedName("sewing_machine")
    private List<Item> sewingMachine;

    @SerializedName("Nintendo_Switch")
    private List<Item> nintendoSwitch;

    @SerializedName("bagworm_model")
    private List<Item> bagwormModel;

    @SerializedName("walking_leaf_model")
    private List<Item> walkingLeafModel;

    @SerializedName("fax_machine")
    private List<Item> faxMachine;

    @SerializedName("barreleye_model")
    private List<Item> barreleyeModel;

    @SerializedName("table_lamp")
    private List<Item> tableLamp;

    @SerializedName("shell_lamp")
    private List<Item> shellLamp;

    @SerializedName("tiger_butterfly_model")
    private List<Item> tigerButterflyModel;

    @SerializedName("ringtoss")
    private List<Item> ringtoss;

    @SerializedName("stacked_magazines")
    private List<Item> stackedMagazines;

    @SerializedName("dollhouse")
    private List<Item> dollhouse;

    @SerializedName("golden_dishes")
    private List<Item> goldenDishes;

    @SerializedName("red_snapper_model")
    private List<Item> redSnapperModel;

    @SerializedName("floating-biotope_planter")
    private List<Item> floatingBiotopePlanter;

    @SerializedName("ring")
    private List<Item> ring;

    @SerializedName("freshwater_goby_model")
    private List<Item> freshwaterGobyModel;

    @SerializedName("LCD_TV_(50_in.)")
    private List<Item> lCDTV50In;

    @SerializedName("sweetfish_model")
    private List<Item> sweetfishModel;

    @SerializedName("ribbon_eel_model")
    private List<Item> ribbonEelModel;

    @SerializedName("brine-shrimp_aquarium")
    private List<Item> brineShrimpAquarium;

    @SerializedName("phonograph")
    private List<Item> phonograph;

    @SerializedName("black_bass_model")
    private List<Item> blackBassModel;

    @SerializedName("wooden_table_mirror")
    private List<Item> woodenTableMirror;

    @SerializedName("wooden-block_toy")
    private List<Item> woodenBlockToy;

    @SerializedName("cardboard_box")
    private List<Item> cardboardBox;

    @SerializedName("tilapia_model")
    private List<Item> tilapiaModel;

    @SerializedName("grand_h._hercules_model")
    private List<Item> grandHHerculesModel;

    @SerializedName("frozen-treat_set")
    private List<Item> frozenTreatSet;

    @SerializedName("mixer")
    private List<Item> mixer;

    @SerializedName("DAL_model_plane")
    private List<Item> dALModelPlane;

    @SerializedName("Mom's_plushie")
    private List<Item> momSPlushie;

    @SerializedName("pale_chub_model")
    private List<Item> paleChubModel;

    @SerializedName("common_bluebottle_model")
    private List<Item> commonBluebottleModel;

    @SerializedName("crucian_carp_model")
    private List<Item> crucianCarpModel;

    @SerializedName("goldfish_model")
    private List<Item> goldfishModel;

    @SerializedName("angelfish_model")
    private List<Item> angelfishModel;

    @SerializedName("nutcracker")
    private List<Item> nutcracker;

    @SerializedName("pot")
    private List<Item> pot;

    @SerializedName("ironing_set")
    private List<Item> ironingSet;

    @SerializedName("kagamimochi")
    private List<Item> kagamimochi;

    @SerializedName("char_model")
    private List<Item> charModel;

    @SerializedName("Ring-Con")
    private List<Item> ringCon;

    @SerializedName("metal_can")
    private List<Item> metalCan;

    @SerializedName("dab_model")
    private List<Item> dabModel;

    @SerializedName("unfinished_puzzle")
    private List<Item> unfinishedPuzzle;

    @SerializedName("giant_snakehead_model")
    private List<Item> giantSnakeheadModel;

    @SerializedName("M._sunset_moth_model")
    private List<Item> mSunsetMothModel;

    @SerializedName("pine_bonsai_tree")
    private List<Item> pineBonsaiTree;

    @SerializedName("throwback_container")
    private List<Item> throwbackContainer;

    @SerializedName("DAL_mug")
    private List<Item> dALMug;

    @SerializedName("floor_sign")
    private List<Item> floorSign;

    @SerializedName("wobbling_Zipper_toy")
    private List<Item> wobblingZipperToy;

    @SerializedName("aroma_pot")
    private List<Item> aromaPot;

    @SerializedName("Fire_Flower")
    private List<Item> fireFlower;

    @SerializedName("Napoleonfish_model")
    private List<Item> napoleonfishModel;

    @SerializedName("bronze_bug_trophy")
    private List<Item> bronzeBugTrophy;

    @SerializedName("pike_model")
    private List<Item> pikeModel;

    @SerializedName("emperor_butterfly_model")
    private List<Item> emperorButterflyModel;

    @SerializedName("rattan_table_lamp")
    private List<Item> rattanTableLamp;

    @SerializedName("Mom's_homemade_cake")
    private List<Item> momSHomemadeCake;

    @SerializedName("pill_bug_model")
    private List<Item> pillBugModel;

    @SerializedName("matryoshka")
    private List<Item> matryoshka;

    @SerializedName("scarab_beetle_model")
    private List<Item> scarabBeetleModel;

    @SerializedName("piranha_model")
    private List<Item> piranhaModel;

    @SerializedName("ladybug_model")
    private List<Item> ladybugModel;

    @SerializedName("tin_robot")
    private List<Item> tinRobot;

    @SerializedName("horned_elephant_model")
    private List<Item> hornedElephantModel;

    @SerializedName("chessboard")
    private List<Item> chessboard;

    @SerializedName("twelve-grape_dish")
    private List<Item> twelveGrapeDish;

    @SerializedName("bamboo_candleholder")
    private List<Item> bambooCandleholder;

    @SerializedName("desktop_computer")
    private List<Item> desktopComputer;

    @SerializedName("miyama_stag_model")
    private List<Item> miyamaStagModel;

    @SerializedName("saw_stag_model")
    private List<Item> sawStagModel;

    @SerializedName("stinkbug_model")
    private List<Item> stinkbugModel;

    @SerializedName("birthday_cake")
    private List<Item> birthdayCake;

    @SerializedName("celebratory_candles")
    private List<Item> celebratoryCandles;

    @SerializedName("coin")
    private List<Item> coin;

    @SerializedName("football_fish_model")
    private List<Item> footballFishModel;

    @SerializedName("analog_kitchen_scale")
    private List<Item> analogKitchenScale;

    @SerializedName("book")
    private List<Item> book;

    @SerializedName("Libra_scale")
    private List<Item> libraScale;

    @SerializedName("plasma_ball")
    private List<Item> plasmaBall;

    @SerializedName("violin_beetle_model")
    private List<Item> violinBeetleModel;

    @SerializedName("rattan_towel_basket")
    private List<Item> rattanTowelBasket;

    @SerializedName("steamer-basket_set")
    private List<Item> steamerBasketSet;

    @SerializedName("Shell")
    private List<Item> shell;

    @SerializedName("mantis_model")
    private List<Item> mantisModel;

    @SerializedName("throwback_skull_radio")
    private List<Item> throwbackSkullRadio;

    @SerializedName("hermit_crab_model")
    private List<Item> hermitCrabModel;

    @SerializedName("silver_HHA_trophy")
    private List<Item> silverHHATrophy;

    @SerializedName("oil_lamp")
    private List<Item> oilLamp;

    @SerializedName("wedding_cake")
    private List<Item> weddingCake;

    @SerializedName("rice_cooker")
    private List<Item> riceCooker;

    @SerializedName("bitterling_model")
    private List<Item> bitterlingModel;

    @SerializedName("puppy_plushie")
    private List<Item> puppyPlushie;

    @SerializedName("cutting_board")
    private List<Item> cuttingBoard;

    @SerializedName("shell_speaker")
    private List<Item> shellSpeaker;

    @SerializedName("Bunny_Day_basket")
    private List<Item> bunnyDayBasket;

    @SerializedName("paper_kite_butterfly_model")
    private List<Item> paperKiteButterflyModel;

    @SerializedName("Baby_panda")
    private List<Item> babyPanda;

    @SerializedName("pedal_board")
    private List<Item> pedalBoard;

    @SerializedName("knife_block")
    private List<Item> knifeBlock;

    @SerializedName("scorpion_model")
    private List<Item> scorpionModel;

    @SerializedName("hammerhead_shark_model")
    private List<Item> hammerheadSharkModel;

    @SerializedName("tarantula_model")
    private List<Item> tarantulaModel;

    @SerializedName("yellow_butterfly_model")
    private List<Item> yellowButterflyModel;

    @SerializedName("record_box")
    private List<Item> recordBox;

    @SerializedName("pet_food_bowl")
    private List<Item> petFoodBowl;

    @SerializedName("traditional_balancing_toy")
    private List<Item> traditionalBalancingToy;

    @SerializedName("Mom's_pen_stand")
    private List<Item> momSPenStand;

    @SerializedName("cat_grass")
    private List<Item> catGrass;

    @SerializedName("katana")
    private List<Item> katana;

    @SerializedName("grasshopper_model")
    private List<Item> grasshopperModel;

    @SerializedName("clown_fish_model")
    private List<Item> clownFishModel;

    @SerializedName("mahi-mahi_model")
    private List<Item> mahiMahiModel;

    @SerializedName("R._Brooke's_birdwing_model")
    private List<Item> rBrookeSBirdwingModel;

    @SerializedName("mini-cactus_set")
    private List<Item> miniCactusSet;

    @SerializedName("bamboo_lunch_box")
    private List<Item> bambooLunchBox;

    @SerializedName("dorado_model")
    private List<Item> doradoModel;

    @SerializedName("electronics_kit")
    private List<Item> electronicsKit;

    @SerializedName("oarfish_model")
    private List<Item> oarfishModel;

    @SerializedName("Yut_Nori")
    private List<Item> yutNori;

    @SerializedName("great_white_shark_model")
    private List<Item> greatWhiteSharkModel;

    @SerializedName("tin_bucket")
    private List<Item> tinBucket;

    @SerializedName("fly_model")
    private List<Item> flyModel;

    @SerializedName("Mom's_candle_set")
    private List<Item> momSCandleSet;

    @SerializedName("dolly")
    private List<Item> dolly;

    @SerializedName("Pocket_vintage_camper")
    private List<Item> pocketVintageCamper;

    @SerializedName("simple_kettle")
    private List<Item> simpleKettle;

    @SerializedName("tissue_box")
    private List<Item> tissueBox;

    @SerializedName("toy_centipede")
    private List<Item> toyCentipede;

    @SerializedName("pondskater_model")
    private List<Item> pondskaterModel;

    @SerializedName("cherry_speakers")
    private List<Item> cherrySpeakers;

    @SerializedName("snapping_turtle_model")
    private List<Item> snappingTurtleModel;

    @SerializedName("birthday_candles")
    private List<Item> birthdayCandles;

    @SerializedName("saw_shark_model")
    private List<Item> sawSharkModel;

    @SerializedName("tree's_bounty_little_tree")
    private List<Item> treeSBountyLittleTree;

    @SerializedName("sea_butterfly_model")
    private List<Item> seaButterflyModel;

    @SerializedName("mini_circuit")
    private List<Item> miniCircuit;

    @SerializedName("walking_stick_model")
    private List<Item> walkingStickModel;

    @SerializedName("pond_smelt_model")
    private List<Item> pondSmeltModel;

    @SerializedName("gold_bug_trophy")
    private List<Item> goldBugTrophy;

    @SerializedName("Turkey_Day_decorations")
    private List<Item> turkeyDayDecorations;

    @SerializedName("Mom's_tea_cozy")
    private List<Item> momSTeaCozy;

    @SerializedName("cushion")
    private List<Item> cushion;

    @SerializedName("wooden_fish")
    private List<Item> woodenFish;

    @SerializedName("cooler_box")
    private List<Item> coolerBox;

    @SerializedName("tree's_bounty_lamp")
    private List<Item> treeSBountyLamp;

    @SerializedName("fragrance_sticks")
    private List<Item> fragranceSticks;

    @SerializedName("traditional_tea_set")
    private List<Item> traditionalTeaSet;

    @SerializedName("golden_dung_beetle")
    private List<Item> goldenDungBeetle;

    @SerializedName("brown_cicada_model")
    private List<Item> brownCicadaModel;

    @SerializedName("picnic_basket")
    private List<Item> picnicBasket;

    @SerializedName("cordless_phone")
    private List<Item> cordlessPhone;

    @SerializedName("salmon_model")
    private List<Item> salmonModel;

    @SerializedName("betta_model")
    private List<Item> bettaModel;

    @SerializedName("protein_shaker_bottle")
    private List<Item> proteinShakerBottle;

    @SerializedName("cherry-blossom_bonsai")
    private List<Item> cherryBlossomBonsai;

    @SerializedName("rosalia_batesi_beetle_model")
    private List<Item> rosaliaBatesiBeetleModel;

    @SerializedName("cornucopia")
    private List<Item> cornucopia;

    @SerializedName("ant_model")
    private List<Item> antModel;

    @SerializedName("Dala_horse")
    private List<Item> dalaHorse;

    @SerializedName("golden_candlestick")
    private List<Item> goldenCandlestick;

    @SerializedName("firewood")
    private List<Item> firewood;

    @SerializedName("glass_holder_with_candle")
    private List<Item> glassHolderWithCandle;

    @SerializedName("guppy_model")
    private List<Item> guppyModel;

    @SerializedName("homework_set")
    private List<Item> homeworkSet;

    @SerializedName("ukulele")
    private List<Item> ukulele;

    @SerializedName("accessories_stand")
    private List<Item> accessoriesStand;

    @SerializedName("magic_kit")
    private List<Item> magicKit;

    @SerializedName("saddled_bichir_model")
    private List<Item> saddledBichirModel;

    @SerializedName("citrus_long-horned_b._model")
    private List<Item> citrusLongHornedBModel;

    @SerializedName("orchid_mantis_model")
    private List<Item> orchidMantisModel;

    @SerializedName("mug")
    private List<Item> mug;

    @SerializedName("anthurium_plant")
    private List<Item> anthuriumPlant;

    @SerializedName("zodiac_ox_figurine")
    private List<Item> zodiacOxFigurine;

    @SerializedName("gold_HHA_trophy")
    private List<Item> goldHHATrophy;

    @SerializedName("Rover's_briefcase")
    private List<Item> roverSBriefcase;

    @SerializedName("unglazed_dish_set")
    private List<Item> unglazedDishSet;

    @SerializedName("Bunny_Day_lamp")
    private List<Item> bunnyDayLamp;

    @SerializedName("man-faced_stink_bug_model")
    private List<Item> manFacedStinkBugModel;

    @SerializedName("microscope")
    private List<Item> microscope;

    @SerializedName("document_stack")
    private List<Item> documentStack;

    @SerializedName("anchovy_model")
    private List<Item> anchovyModel;

    @SerializedName("golden_stag_model")
    private List<Item> goldenStagModel;

    @SerializedName("wedding_candle_set")
    private List<Item> weddingCandleSet;

    @SerializedName("yellow_perch_model")
    private List<Item> yellowPerchModel;

    @SerializedName("golden_arowana_model")
    private List<Item> goldenArowanaModel;

    @SerializedName("dish-drying_rack")
    private List<Item> dishDryingRack;

    @SerializedName("grand_goliath_beetle_model")
    private List<Item> grandGoliathBeetleModel;

    @SerializedName("golden_trout_model")
    private List<Item> goldenTroutModel;

    @SerializedName("LCD_TV_(20_in.)")
    private List<Item> lCDTV20In;

    @SerializedName("tabletop_festive_tree")
    private List<Item> tabletopFestiveTree;

    @SerializedName("rotary_phone")
    private List<Item> rotaryPhone;

    @SerializedName("chocolate_heart")
    private List<Item> chocolateHeart;

    @SerializedName("hula_doll")
    private List<Item> hulaDoll;

    @SerializedName("toy_box")
    private List<Item> toyBox;

    @SerializedName("Mom's_cushion")
    private List<Item> momSCushion;

    @SerializedName("fortune-telling_set")
    private List<Item> fortuneTellingSet;

    public List<Item> getMagazineRack() {
        return magazineRack;
    }

    public List<Item> getBeachBall() {
        return beachBall;
    }

    public List<Item> getTurkeyDayCasserole() {
        return turkeyDayCasserole;
    }

    public List<Item> getProTapeRecorder() {
        return proTapeRecorder;
    }

    public List<Item> getLaptop() {
        return laptop;
    }

    public List<Item> getKettle() {
        return kettle;
    }

    public List<Item> getBingoWheel() {
        return bingoWheel;
    }

    public List<Item> getCyclommatusStagModel() {
        return cyclommatusStagModel;
    }

    public List<Item> getBarredKnifejawModel() {
        return barredKnifejawModel;
    }

    public List<Item> getGreatPurpleEmperorModel() {
        return greatPurpleEmperorModel;
    }

    public List<Item> getKoiModel() {
        return koiModel;
    }

    public List<Item> getHourglass() {
        return hourglass;
    }

    public List<Item> getGiantWaterBugModel() {
        return giantWaterBugModel;
    }

    public List<Item> getRobustCicadaModel() {
        return robustCicadaModel;
    }

    public List<Item> getFestiveTopSet() {
        return festiveTopSet;
    }

    public List<Item> getLoachModel() {
        return loachModel;
    }

    public List<Item> getGardenGnome() {
        return gardenGnome;
    }

    public List<Item> getHorseMackerelModel() {
        return horseMackerelModel;
    }

    public List<Item> getStovetopEspressoMaker() {
        return stovetopEspressoMaker;
    }

    public List<Item> getSuperMushroom() {
        return superMushroom;
    }

    public List<Item> getCartoonistSSet() {
        return cartoonistSSet;
    }

    public List<Item> getLifeRing() {
        return lifeRing;
    }

    public List<Item> getPocketModernCamper() {
        return pocketModernCamper;
    }

    public List<Item> getEarthBoringDungBModel() {
        return earthBoringDungBModel;
    }

    public List<Item> getGlobe() {
        return globe;
    }

    public List<Item> getBlossomLantern() {
        return blossomLantern;
    }

    public List<Item> getSeaGlobe() {
        return seaGlobe;
    }

    public List<Item> getCrawfishModel() {
        return crawfishModel;
    }

    public List<Item> getBambooShootLamp() {
        return bambooShootLamp;
    }

    public List<Item> getSnowGlobe() {
        return snowGlobe;
    }

    public List<Item> getGiantTrevallyModel() {
        return giantTrevallyModel;
    }

    public List<Item> getMossBall() {
        return mossBall;
    }

    public List<Item> getMigratoryLocustModel() {
        return migratoryLocustModel;
    }

    public List<Item> getGoldFishTrophy() {
        return goldFishTrophy;
    }

    public List<Item> getBellCricketModel() {
        return bellCricketModel;
    }

    public List<Item> getBlueMarlinModel() {
        return blueMarlinModel;
    }

    public List<Item> getTadpoleModel() {
        return tadpoleModel;
    }

    public List<Item> getCentipedeModel() {
        return centipedeModel;
    }

    public List<Item> getTigerBeetleModel() {
        return tigerBeetleModel;
    }

    public List<Item> getCricketModel() {
        return cricketModel;
    }

    public List<Item> getHumidifier() {
        return humidifier;
    }

    public List<Item> getBlowfishModel() {
        return blowfishModel;
    }

    public List<Item> getRedDragonflyModel() {
        return redDragonflyModel;
    }

    public List<Item> getCoffeeGrinder() {
        return coffeeGrinder;
    }

    public List<Item> getGoldBars() {
        return goldBars;
    }

    public List<Item> getZebraTurkeyfishModel() {
        return zebraTurkeyfishModel;
    }

    public List<Item> getNewYearSNoodles() {
        return newYearSNoodles;
    }

    public List<Item> getTerrarium() {
        return terrarium;
    }

    public List<Item> getTrashBags() {
        return trashBags;
    }

    public List<Item> getCuteMusicPlayer() {
        return cuteMusicPlayer;
    }

    public List<Item> getTapeDeck() {
        return tapeDeck;
    }

    public List<Item> getDroneBeetleModel() {
        return droneBeetleModel;
    }

    public List<Item> getDinosaurToy() {
        return dinosaurToy;
    }

    public List<Item> getBerliner() {
        return berliner;
    }

    public List<Item> getFancyViolin() {
        return fancyViolin;
    }

    public List<Item> getHornedAtlasModel() {
        return hornedAtlasModel;
    }

    public List<Item> getRainbowStagModel() {
        return rainbowStagModel;
    }

    public List<Item> getCampStove() {
        return campStove;
    }

    public List<Item> getRecycledCanThumbPiano() {
        return recycledCanThumbPiano;
    }

    public List<Item> getOliveFlounderModel() {
        return oliveFlounderModel;
    }

    public List<Item> getSuperStar() {
        return superStar;
    }

    public List<Item> getRevolvingSpiceRack() {
        return revolvingSpiceRack;
    }

    public List<Item> getStandMixer() {
        return standMixer;
    }

    public List<Item> getSturgeonModel() {
        return sturgeonModel;
    }

    public List<Item> getTurkeyDayTableSetting() {
        return turkeyDayTableSetting;
    }

    public List<Item> getTurkeyDayWheatDecor() {
        return turkeyDayWheatDecor;
    }

    public List<Item> getEspressoMaker() {
        return espressoMaker;
    }

    public List<Item> getHornedDynastidModel() {
        return hornedDynastidModel;
    }

    public List<Item> getPopEyedGoldfishModel() {
        return popEyedGoldfishModel;
    }

    public List<Item> getBabyBear() {
        return babyBear;
    }

    public List<Item> getFestivaleLamp() {
        return festivaleLamp;
    }

    public List<Item> getFragranceDiffuser() {
        return fragranceDiffuser;
    }

    public List<Item> getDinnerware() {
        return dinnerware;
    }

    public List<Item> getPaperTiger() {
        return paperTiger;
    }

    public List<Item> getTypewriter() {
        return typewriter;
    }

    public List<Item> getThankYouMomMug() {
        return thankYouMomMug;
    }

    public List<Item> getDungBeetleModel() {
        return dungBeetleModel;
    }

    public List<Item> getFireflyModel() {
        return fireflyModel;
    }

    public List<Item> getThankYouDadMug() {
        return thankYouDadMug;
    }

    public List<Item> getModelingClay() {
        return modelingClay;
    }

    public List<Item> getPopUpBook() {
        return popUpBook;
    }

    public List<Item> getSilverBugTrophy() {
        return silverBugTrophy;
    }

    public List<Item> getRainbowfishModel() {
        return rainbowfishModel;
    }

    public List<Item> getBluegillModel() {
        return bluegillModel;
    }

    public List<Item> getLuckyCat() {
        return luckyCat;
    }

    public List<Item> getPlasticCanister() {
        return plasticCanister;
    }

    public List<Item> getSeaBassModel() {
        return seaBassModel;
    }

    public List<Item> getSturdySewingBox() {
        return sturdySewingBox;
    }

    public List<Item> getCoffeeCup() {
        return coffeeCup;
    }

    public List<Item> getDecoyDuck() {
        return decoyDuck;
    }

    public List<Item> getFruitBasket() {
        return fruitBasket;
    }

    public List<Item> getLuckyGoldCat() {
        return luckyGoldCat;
    }

    public List<Item> getWaspModel() {
        return waspModel;
    }

    public List<Item> getPeachSurpriseBox() {
        return peachSurpriseBox;
    }

    public List<Item> getSewingProject() {
        return sewingProject;
    }

    public List<Item> getPortableRadio() {
        return portableRadio;
    }

    public List<Item> getFootball() {
        return football;
    }

    public List<Item> getNibbleFishModel() {
        return nibbleFishModel;
    }

    public List<Item> getWalkerCicadaModel() {
        return walkerCicadaModel;
    }

    public List<Item> getBlueWeevilBeetleModel() {
        return blueWeevilBeetleModel;
    }

    public List<Item> getSurgeonfishModel() {
        return surgeonfishModel;
    }

    public List<Item> getStackOfBooks() {
        return stackOfBooks;
    }

    public List<Item> getTableSetting() {
        return tableSetting;
    }

    public List<Item> getMagazine() {
        return magazine;
    }

    public List<Item> getAluminumBriefcase() {
        return aluminumBriefcase;
    }

    public List<Item> getThrowbackGothicMirror() {
        return throwbackGothicMirror;
    }

    public List<Item> getACNHNintendoSwitch() {
        return aCNHNintendoSwitch;
    }

    public List<Item> getPeacockButterflyModel() {
        return peacockButterflyModel;
    }

    public List<Item> getJsonMember1UpMushroom() {
        return jsonMember1UpMushroom;
    }

    public List<Item> getCicadaShellModel() {
        return cicadaShellModel;
    }

    public List<Item> getGiantCicadaModel() {
        return giantCicadaModel;
    }

    public List<Item> getFleaModel() {
        return fleaModel;
    }

    public List<Item> getPortableRecordPlayer() {
        return portableRecordPlayer;
    }

    public List<Item> getArowanaModel() {
        return arowanaModel;
    }

    public List<Item> getHoneybeeModel() {
        return honeybeeModel;
    }

    public List<Item> getScorpioLamp() {
        return scorpioLamp;
    }

    public List<Item> getAntFarm() {
        return antFarm;
    }

    public List<Item> getRiceGrasshopperModel() {
        return riceGrasshopperModel;
    }

    public List<Item> getArapaimaModel() {
        return arapaimaModel;
    }

    public List<Item> getInfusedWaterDispenser() {
        return infusedWaterDispenser;
    }

    public List<Item> getBoardGame() {
        return boardGame;
    }

    public List<Item> getBookStands() {
        return bookStands;
    }

    public List<Item> getBottledShip() {
        return bottledShip;
    }

    public List<Item> getDigitalAlarmClock() {
        return digitalAlarmClock;
    }

    public List<Item> getGrandGiraffeStagModel() {
        return grandGiraffeStagModel;
    }

    public List<Item> getHyacinthLamp() {
        return hyacinthLamp;
    }

    public List<Item> getWindflowerFan() {
        return windflowerFan;
    }

    public List<Item> getDamselflyModel() {
        return damselflyModel;
    }

    public List<Item> getCatfishModel() {
        return catfishModel;
    }

    public List<Item> getMittenCrabModel() {
        return mittenCrabModel;
    }

    public List<Item> getNewtonSCradle() {
        return newtonSCradle;
    }

    public List<Item> getPufferFishModel() {
        return pufferFishModel;
    }

    public List<Item> getNailArtSet() {
        return nailArtSet;
    }

    public List<Item> getSpiderModel() {
        return spiderModel;
    }

    public List<Item> getCoelacanthModel() {
        return coelacanthModel;
    }

    public List<Item> getYuleLog() {
        return yuleLog;
    }

    public List<Item> getBambooSphere() {
        return bambooSphere;
    }

    public List<Item> getCassettePlayer() {
        return cassettePlayer;
    }

    public List<Item> getButterflyFishModel() {
        return butterflyFishModel;
    }

    public List<Item> getToolbox() {
        return toolbox;
    }

    public List<Item> getRayModel() {
        return rayModel;
    }

    public List<Item> getMomSTissueBox() {
        return momSTissueBox;
    }

    public List<Item> getOlivierSalad() {
        return olivierSalad;
    }

    public List<Item> getOldFashionedWashtub() {
        return oldFashionedWashtub;
    }

    public List<Item> getSpookyCandySet() {
        return spookyCandySet;
    }

    public List<Item> getSilverFishTrophy() {
        return silverFishTrophy;
    }

    public List<Item> getCherrySalmonModel() {
        return cherrySalmonModel;
    }

    public List<Item> getNeonTetraModel() {
        return neonTetraModel;
    }

    public List<Item> getReeseCyrusPhotoPlate() {
        return reeseCyrusPhotoPlate;
    }

    public List<Item> getHolidayCandle() {
        return holidayCandle;
    }

    public List<Item> getWoodenToolbox() {
        return woodenToolbox;
    }

    public List<Item> getGiantStagModel() {
        return giantStagModel;
    }

    public List<Item> getBambooDrum() {
        return bambooDrum;
    }

    public List<Item> getEssaySet() {
        return essaySet;
    }

    public List<Item> getDaceModel() {
        return daceModel;
    }

    public List<Item> getMorayEelModel() {
        return morayEelModel;
    }

    public List<Item> getRanchuGoldfishModel() {
        return ranchuGoldfishModel;
    }

    public List<Item> getCommonButterflyModel() {
        return commonButterflyModel;
    }

    public List<Item> getSoftShelledTurtleModel() {
        return softShelledTurtleModel;
    }

    public List<Item> getFestivaleConfettiMachine() {
        return festivaleConfettiMachine;
    }

    public List<Item> getLabExperimentsSet() {
        return labExperimentsSet;
    }

    public List<Item> getLantern() {
        return lantern;
    }

    public List<Item> getOldFashionedAlarmClock() {
        return oldFashionedAlarmClock;
    }

    public List<Item> getBronzeHHATrophy() {
        return bronzeHHATrophy;
    }

    public List<Item> getPopUpToaster() {
        return popUpToaster;
    }

    public List<Item> getStringfishModel() {
        return stringfishModel;
    }

    public List<Item> getWharfRoachModel() {
        return wharfRoachModel;
    }

    public List<Item> getBronzeFishTrophy() {
        return bronzeFishTrophy;
    }

    public List<Item> getSnailModel() {
        return snailModel;
    }

    public List<Item> getCandle() {
        return candle;
    }

    public List<Item> getClassicPitcher() {
        return classicPitcher;
    }

    public List<Item> getThrowbackWrestlingFigure() {
        return throwbackWrestlingFigure;
    }

    public List<Item> getStarClock() {
        return starClock;
    }

    public List<Item> getLongLocustModel() {
        return longLocustModel;
    }

    public List<Item> getSeaHorseModel() {
        return seaHorseModel;
    }

    public List<Item> getAgriasButterflyModel() {
        return agriasButterflyModel;
    }

    public List<Item> getResettiModel() {
        return resettiModel;
    }

    public List<Item> getTeaSet() {
        return teaSet;
    }

    public List<Item> getIncenseBurner() {
        return incenseBurner;
    }

    public List<Item> getSucculentPlant() {
        return succulentPlant;
    }

    public List<Item> getPie() {
        return pie;
    }

    public List<Item> getKillifishModel() {
        return killifishModel;
    }

    public List<Item> getMoleCricketModel() {
        return moleCricketModel;
    }

    public List<Item> getPaintingSet() {
        return paintingSet;
    }

    public List<Item> getSpookyTableSetting() {
        return spookyTableSetting;
    }

    public List<Item> getMothModel() {
        return mothModel;
    }

    public List<Item> getMetronome() {
        return metronome;
    }

    public List<Item> getHeartShapedBouquet() {
        return heartShapedBouquet;
    }

    public List<Item> getFilmProjector() {
        return filmProjector;
    }

    public List<Item> getCoconutJuice() {
        return coconutJuice;
    }

    public List<Item> getShavedIceMaker() {
        return shavedIceMaker;
    }

    public List<Item> getFrogModel() {
        return frogModel;
    }

    public List<Item> getMonarchButterflyModel() {
        return monarchButterflyModel;
    }

    public List<Item> getSuckerfishModel() {
        return suckerfishModel;
    }

    public List<Item> getKingSalmonModel() {
        return kingSalmonModel;
    }

    public List<Item> getSoupKettle() {
        return soupKettle;
    }

    public List<Item> getGarModel() {
        return garModel;
    }

    public List<Item> getMosquitoModel() {
        return mosquitoModel;
    }

    public List<Item> getDeskMirror() {
        return deskMirror;
    }

    public List<Item> getEveningCicadaModel() {
        return eveningCicadaModel;
    }

    public List<Item> getNovaLight() {
        return novaLight;
    }

    public List<Item> getTunaModel() {
        return tunaModel;
    }

    public List<Item> getKettlebell() {
        return kettlebell;
    }

    public List<Item> getAmp() {
        return amp;
    }

    public List<Item> getToyCockroach() {
        return toyCockroach;
    }

    public List<Item> getJewelBeetleModel() {
        return jewelBeetleModel;
    }

    public List<Item> getBall() {
        return ball;
    }

    public List<Item> getDarnerDragonflyModel() {
        return darnerDragonflyModel;
    }

    public List<Item> getSquidModel() {
        return squidModel;
    }

    public List<Item> getFryingPan() {
        return fryingPan;
    }

    public List<Item> getCreamAndSugar() {
        return creamAndSugar;
    }

    public List<Item> getSpookyLantern() {
        return spookyLantern;
    }

    public List<Item> getHamsterCage() {
        return hamsterCage;
    }

    public List<Item> getMicrowave() {
        return microwave;
    }

    public List<Item> getDivingBeetleModel() {
        return divingBeetleModel;
    }

    public List<Item> getCarpModel() {
        return carpModel;
    }

    public List<Item> getHandyWaterCooler() {
        return handyWaterCooler;
    }

    public List<Item> getJudgeSBell() {
        return judgeSBell;
    }

    public List<Item> getWhaleSharkModel() {
        return whaleSharkModel;
    }

    public List<Item> getSewingMachine() {
        return sewingMachine;
    }

    public List<Item> getNintendoSwitch() {
        return nintendoSwitch;
    }

    public List<Item> getBagwormModel() {
        return bagwormModel;
    }

    public List<Item> getWalkingLeafModel() {
        return walkingLeafModel;
    }

    public List<Item> getFaxMachine() {
        return faxMachine;
    }

    public List<Item> getBarreleyeModel() {
        return barreleyeModel;
    }

    public List<Item> getTableLamp() {
        return tableLamp;
    }

    public List<Item> getShellLamp() {
        return shellLamp;
    }

    public List<Item> getTigerButterflyModel() {
        return tigerButterflyModel;
    }

    public List<Item> getRingtoss() {
        return ringtoss;
    }

    public List<Item> getStackedMagazines() {
        return stackedMagazines;
    }

    public List<Item> getDollhouse() {
        return dollhouse;
    }

    public List<Item> getGoldenDishes() {
        return goldenDishes;
    }

    public List<Item> getRedSnapperModel() {
        return redSnapperModel;
    }

    public List<Item> getFloatingBiotopePlanter() {
        return floatingBiotopePlanter;
    }

    public List<Item> getRing() {
        return ring;
    }

    public List<Item> getFreshwaterGobyModel() {
        return freshwaterGobyModel;
    }

    public List<Item> getLCDTV50In() {
        return lCDTV50In;
    }

    public List<Item> getSweetfishModel() {
        return sweetfishModel;
    }

    public List<Item> getRibbonEelModel() {
        return ribbonEelModel;
    }

    public List<Item> getBrineShrimpAquarium() {
        return brineShrimpAquarium;
    }

    public List<Item> getPhonograph() {
        return phonograph;
    }

    public List<Item> getBlackBassModel() {
        return blackBassModel;
    }

    public List<Item> getWoodenTableMirror() {
        return woodenTableMirror;
    }

    public List<Item> getWoodenBlockToy() {
        return woodenBlockToy;
    }

    public List<Item> getCardboardBox() {
        return cardboardBox;
    }

    public List<Item> getTilapiaModel() {
        return tilapiaModel;
    }

    public List<Item> getGrandHHerculesModel() {
        return grandHHerculesModel;
    }

    public List<Item> getFrozenTreatSet() {
        return frozenTreatSet;
    }

    public List<Item> getMixer() {
        return mixer;
    }

    public List<Item> getDALModelPlane() {
        return dALModelPlane;
    }

    public List<Item> getMomSPlushie() {
        return momSPlushie;
    }

    public List<Item> getPaleChubModel() {
        return paleChubModel;
    }

    public List<Item> getCommonBluebottleModel() {
        return commonBluebottleModel;
    }

    public List<Item> getCrucianCarpModel() {
        return crucianCarpModel;
    }

    public List<Item> getGoldfishModel() {
        return goldfishModel;
    }

    public List<Item> getAngelfishModel() {
        return angelfishModel;
    }

    public List<Item> getNutcracker() {
        return nutcracker;
    }

    public List<Item> getPot() {
        return pot;
    }

    public List<Item> getIroningSet() {
        return ironingSet;
    }

    public List<Item> getKagamimochi() {
        return kagamimochi;
    }

    public List<Item> getCharModel() {
        return charModel;
    }

    public List<Item> getRingCon() {
        return ringCon;
    }

    public List<Item> getMetalCan() {
        return metalCan;
    }

    public List<Item> getDabModel() {
        return dabModel;
    }

    public List<Item> getUnfinishedPuzzle() {
        return unfinishedPuzzle;
    }

    public List<Item> getGiantSnakeheadModel() {
        return giantSnakeheadModel;
    }

    public List<Item> getMSunsetMothModel() {
        return mSunsetMothModel;
    }

    public List<Item> getPineBonsaiTree() {
        return pineBonsaiTree;
    }

    public List<Item> getThrowbackContainer() {
        return throwbackContainer;
    }

    public List<Item> getDALMug() {
        return dALMug;
    }

    public List<Item> getFloorSign() {
        return floorSign;
    }

    public List<Item> getWobblingZipperToy() {
        return wobblingZipperToy;
    }

    public List<Item> getAromaPot() {
        return aromaPot;
    }

    public List<Item> getFireFlower() {
        return fireFlower;
    }

    public List<Item> getNapoleonfishModel() {
        return napoleonfishModel;
    }

    public List<Item> getBronzeBugTrophy() {
        return bronzeBugTrophy;
    }

    public List<Item> getPikeModel() {
        return pikeModel;
    }

    public List<Item> getEmperorButterflyModel() {
        return emperorButterflyModel;
    }

    public List<Item> getRattanTableLamp() {
        return rattanTableLamp;
    }

    public List<Item> getMomSHomemadeCake() {
        return momSHomemadeCake;
    }

    public List<Item> getPillBugModel() {
        return pillBugModel;
    }

    public List<Item> getMatryoshka() {
        return matryoshka;
    }

    public List<Item> getScarabBeetleModel() {
        return scarabBeetleModel;
    }

    public List<Item> getPiranhaModel() {
        return piranhaModel;
    }

    public List<Item> getLadybugModel() {
        return ladybugModel;
    }

    public List<Item> getTinRobot() {
        return tinRobot;
    }

    public List<Item> getHornedElephantModel() {
        return hornedElephantModel;
    }

    public List<Item> getChessboard() {
        return chessboard;
    }

    public List<Item> getTwelveGrapeDish() {
        return twelveGrapeDish;
    }

    public List<Item> getBambooCandleholder() {
        return bambooCandleholder;
    }

    public List<Item> getDesktopComputer() {
        return desktopComputer;
    }

    public List<Item> getMiyamaStagModel() {
        return miyamaStagModel;
    }

    public List<Item> getSawStagModel() {
        return sawStagModel;
    }

    public List<Item> getStinkbugModel() {
        return stinkbugModel;
    }

    public List<Item> getBirthdayCake() {
        return birthdayCake;
    }

    public List<Item> getCelebratoryCandles() {
        return celebratoryCandles;
    }

    public List<Item> getCoin() {
        return coin;
    }

    public List<Item> getFootballFishModel() {
        return footballFishModel;
    }

    public List<Item> getAnalogKitchenScale() {
        return analogKitchenScale;
    }

    public List<Item> getBook() {
        return book;
    }

    public List<Item> getLibraScale() {
        return libraScale;
    }

    public List<Item> getPlasmaBall() {
        return plasmaBall;
    }

    public List<Item> getViolinBeetleModel() {
        return violinBeetleModel;
    }

    public List<Item> getRattanTowelBasket() {
        return rattanTowelBasket;
    }

    public List<Item> getSteamerBasketSet() {
        return steamerBasketSet;
    }

    public List<Item> getShell() {
        return shell;
    }

    public List<Item> getMantisModel() {
        return mantisModel;
    }

    public List<Item> getThrowbackSkullRadio() {
        return throwbackSkullRadio;
    }

    public List<Item> getHermitCrabModel() {
        return hermitCrabModel;
    }

    public List<Item> getSilverHHATrophy() {
        return silverHHATrophy;
    }

    public List<Item> getOilLamp() {
        return oilLamp;
    }

    public List<Item> getWeddingCake() {
        return weddingCake;
    }

    public List<Item> getRiceCooker() {
        return riceCooker;
    }

    public List<Item> getBitterlingModel() {
        return bitterlingModel;
    }

    public List<Item> getPuppyPlushie() {
        return puppyPlushie;
    }

    public List<Item> getCuttingBoard() {
        return cuttingBoard;
    }

    public List<Item> getShellSpeaker() {
        return shellSpeaker;
    }

    public List<Item> getBunnyDayBasket() {
        return bunnyDayBasket;
    }

    public List<Item> getPaperKiteButterflyModel() {
        return paperKiteButterflyModel;
    }

    public List<Item> getBabyPanda() {
        return babyPanda;
    }

    public List<Item> getPedalBoard() {
        return pedalBoard;
    }

    public List<Item> getKnifeBlock() {
        return knifeBlock;
    }

    public List<Item> getScorpionModel() {
        return scorpionModel;
    }

    public List<Item> getHammerheadSharkModel() {
        return hammerheadSharkModel;
    }

    public List<Item> getTarantulaModel() {
        return tarantulaModel;
    }

    public List<Item> getYellowButterflyModel() {
        return yellowButterflyModel;
    }

    public List<Item> getRecordBox() {
        return recordBox;
    }

    public List<Item> getPetFoodBowl() {
        return petFoodBowl;
    }

    public List<Item> getTraditionalBalancingToy() {
        return traditionalBalancingToy;
    }

    public List<Item> getMomSPenStand() {
        return momSPenStand;
    }

    public List<Item> getCatGrass() {
        return catGrass;
    }

    public List<Item> getKatana() {
        return katana;
    }

    public List<Item> getGrasshopperModel() {
        return grasshopperModel;
    }

    public List<Item> getClownFishModel() {
        return clownFishModel;
    }

    public List<Item> getMahiMahiModel() {
        return mahiMahiModel;
    }

    public List<Item> getRBrookeSBirdwingModel() {
        return rBrookeSBirdwingModel;
    }

    public List<Item> getMiniCactusSet() {
        return miniCactusSet;
    }

    public List<Item> getBambooLunchBox() {
        return bambooLunchBox;
    }

    public List<Item> getDoradoModel() {
        return doradoModel;
    }

    public List<Item> getElectronicsKit() {
        return electronicsKit;
    }

    public List<Item> getOarfishModel() {
        return oarfishModel;
    }

    public List<Item> getYutNori() {
        return yutNori;
    }

    public List<Item> getGreatWhiteSharkModel() {
        return greatWhiteSharkModel;
    }

    public List<Item> getTinBucket() {
        return tinBucket;
    }

    public List<Item> getFlyModel() {
        return flyModel;
    }

    public List<Item> getMomSCandleSet() {
        return momSCandleSet;
    }

    public List<Item> getDolly() {
        return dolly;
    }

    public List<Item> getPocketVintageCamper() {
        return pocketVintageCamper;
    }

    public List<Item> getSimpleKettle() {
        return simpleKettle;
    }

    public List<Item> getTissueBox() {
        return tissueBox;
    }

    public List<Item> getToyCentipede() {
        return toyCentipede;
    }

    public List<Item> getPondskaterModel() {
        return pondskaterModel;
    }

    public List<Item> getCherrySpeakers() {
        return cherrySpeakers;
    }

    public List<Item> getSnappingTurtleModel() {
        return snappingTurtleModel;
    }

    public List<Item> getBirthdayCandles() {
        return birthdayCandles;
    }

    public List<Item> getSawSharkModel() {
        return sawSharkModel;
    }

    public List<Item> getTreeSBountyLittleTree() {
        return treeSBountyLittleTree;
    }

    public List<Item> getSeaButterflyModel() {
        return seaButterflyModel;
    }

    public List<Item> getMiniCircuit() {
        return miniCircuit;
    }

    public List<Item> getWalkingStickModel() {
        return walkingStickModel;
    }

    public List<Item> getPondSmeltModel() {
        return pondSmeltModel;
    }

    public List<Item> getGoldBugTrophy() {
        return goldBugTrophy;
    }

    public List<Item> getTurkeyDayDecorations() {
        return turkeyDayDecorations;
    }

    public List<Item> getMomSTeaCozy() {
        return momSTeaCozy;
    }

    public List<Item> getCushion() {
        return cushion;
    }

    public List<Item> getWoodenFish() {
        return woodenFish;
    }

    public List<Item> getCoolerBox() {
        return coolerBox;
    }

    public List<Item> getTreeSBountyLamp() {
        return treeSBountyLamp;
    }

    public List<Item> getFragranceSticks() {
        return fragranceSticks;
    }

    public List<Item> getTraditionalTeaSet() {
        return traditionalTeaSet;
    }

    public List<Item> getGoldenDungBeetle() {
        return goldenDungBeetle;
    }

    public List<Item> getBrownCicadaModel() {
        return brownCicadaModel;
    }

    public List<Item> getPicnicBasket() {
        return picnicBasket;
    }

    public List<Item> getCordlessPhone() {
        return cordlessPhone;
    }

    public List<Item> getSalmonModel() {
        return salmonModel;
    }

    public List<Item> getBettaModel() {
        return bettaModel;
    }

    public List<Item> getProteinShakerBottle() {
        return proteinShakerBottle;
    }

    public List<Item> getCherryBlossomBonsai() {
        return cherryBlossomBonsai;
    }

    public List<Item> getRosaliaBatesiBeetleModel() {
        return rosaliaBatesiBeetleModel;
    }

    public List<Item> getCornucopia() {
        return cornucopia;
    }

    public List<Item> getAntModel() {
        return antModel;
    }

    public List<Item> getDalaHorse() {
        return dalaHorse;
    }

    public List<Item> getGoldenCandlestick() {
        return goldenCandlestick;
    }

    public List<Item> getFirewood() {
        return firewood;
    }

    public List<Item> getGlassHolderWithCandle() {
        return glassHolderWithCandle;
    }

    public List<Item> getGuppyModel() {
        return guppyModel;
    }

    public List<Item> getHomeworkSet() {
        return homeworkSet;
    }

    public List<Item> getUkulele() {
        return ukulele;
    }

    public List<Item> getAccessoriesStand() {
        return accessoriesStand;
    }

    public List<Item> getMagicKit() {
        return magicKit;
    }

    public List<Item> getSaddledBichirModel() {
        return saddledBichirModel;
    }

    public List<Item> getCitrusLongHornedBModel() {
        return citrusLongHornedBModel;
    }

    public List<Item> getOrchidMantisModel() {
        return orchidMantisModel;
    }

    public List<Item> getMug() {
        return mug;
    }

    public List<Item> getAnthuriumPlant() {
        return anthuriumPlant;
    }

    public List<Item> getZodiacOxFigurine() {
        return zodiacOxFigurine;
    }

    public List<Item> getGoldHHATrophy() {
        return goldHHATrophy;
    }

    public List<Item> getRoverSBriefcase() {
        return roverSBriefcase;
    }

    public List<Item> getUnglazedDishSet() {
        return unglazedDishSet;
    }

    public List<Item> getBunnyDayLamp() {
        return bunnyDayLamp;
    }

    public List<Item> getManFacedStinkBugModel() {
        return manFacedStinkBugModel;
    }

    public List<Item> getMicroscope() {
        return microscope;
    }

    public List<Item> getDocumentStack() {
        return documentStack;
    }

    public List<Item> getAnchovyModel() {
        return anchovyModel;
    }

    public List<Item> getGoldenStagModel() {
        return goldenStagModel;
    }

    public List<Item> getWeddingCandleSet() {
        return weddingCandleSet;
    }

    public List<Item> getYellowPerchModel() {
        return yellowPerchModel;
    }

    public List<Item> getGoldenArowanaModel() {
        return goldenArowanaModel;
    }

    public List<Item> getDishDryingRack() {
        return dishDryingRack;
    }

    public List<Item> getGrandGoliathBeetleModel() {
        return grandGoliathBeetleModel;
    }

    public List<Item> getGoldenTroutModel() {
        return goldenTroutModel;
    }

    public List<Item> getLCDTV20In() {
        return lCDTV20In;
    }

    public List<Item> getTabletopFestiveTree() {
        return tabletopFestiveTree;
    }

    public List<Item> getRotaryPhone() {
        return rotaryPhone;
    }

    public List<Item> getChocolateHeart() {
        return chocolateHeart;
    }

    public List<Item> getHulaDoll() {
        return hulaDoll;
    }

    public List<Item> getToyBox() {
        return toyBox;
    }

    public List<Item> getMomSCushion() {
        return momSCushion;
    }

    public List<Item> getFortuneTellingSet() {
        return fortuneTellingSet;
    }

    public List<Item> getRandomType() {
        List<List<Item>> miscs = Arrays.asList(magazineRack, beachBall, turkeyDayCasserole, proTapeRecorder, laptop, kettle, bingoWheel, cyclommatusStagModel, barredKnifejawModel, greatPurpleEmperorModel, koiModel, hourglass, giantWaterBugModel, robustCicadaModel, festiveTopSet, loachModel, gardenGnome, horseMackerelModel, stovetopEspressoMaker, superMushroom, cartoonistSSet, lifeRing, pocketModernCamper, earthBoringDungBModel, globe, blossomLantern, seaGlobe, crawfishModel, bambooShootLamp, snowGlobe, giantTrevallyModel, mossBall, migratoryLocustModel, goldFishTrophy, bellCricketModel, blueMarlinModel, tadpoleModel, centipedeModel, tigerBeetleModel, cricketModel, humidifier, blowfishModel, redDragonflyModel, coffeeGrinder, goldBars, zebraTurkeyfishModel, newYearSNoodles, terrarium, trashBags, cuteMusicPlayer, tapeDeck, droneBeetleModel, dinosaurToy, berliner, fancyViolin, hornedAtlasModel, rainbowStagModel, campStove, recycledCanThumbPiano, oliveFlounderModel, superStar, revolvingSpiceRack, standMixer, sturgeonModel, turkeyDayTableSetting, turkeyDayWheatDecor, espressoMaker, hornedDynastidModel, popEyedGoldfishModel, babyBear, festivaleLamp, fragranceDiffuser, dinnerware, paperTiger, typewriter, thankYouMomMug, dungBeetleModel, fireflyModel, thankYouDadMug, modelingClay, popUpBook, silverBugTrophy, rainbowfishModel, bluegillModel, luckyCat, plasticCanister, seaBassModel, sturdySewingBox, coffeeCup, decoyDuck, fruitBasket, luckyGoldCat, waspModel, peachSurpriseBox, sewingProject, portableRadio, football, nibbleFishModel, walkerCicadaModel, blueWeevilBeetleModel, surgeonfishModel, stackOfBooks, tableSetting, magazine, aluminumBriefcase, throwbackGothicMirror, aCNHNintendoSwitch, peacockButterflyModel, jsonMember1UpMushroom, cicadaShellModel, giantCicadaModel, fleaModel, portableRecordPlayer, arowanaModel, honeybeeModel, scorpioLamp, antFarm, riceGrasshopperModel, arapaimaModel, infusedWaterDispenser, boardGame, bookStands, bottledShip, digitalAlarmClock, grandGiraffeStagModel, hyacinthLamp, windflowerFan, damselflyModel, catfishModel, mittenCrabModel, newtonSCradle, pufferFishModel, nailArtSet, spiderModel, coelacanthModel, yuleLog, bambooSphere, cassettePlayer, butterflyFishModel, toolbox, rayModel, momSTissueBox, olivierSalad, oldFashionedWashtub, spookyCandySet, silverFishTrophy, cherrySalmonModel, neonTetraModel, reeseCyrusPhotoPlate, holidayCandle, woodenToolbox, giantStagModel, bambooDrum, essaySet, daceModel, morayEelModel, ranchuGoldfishModel, commonButterflyModel, softShelledTurtleModel, festivaleConfettiMachine, labExperimentsSet, lantern, oldFashionedAlarmClock, bronzeHHATrophy, popUpToaster, stringfishModel, wharfRoachModel, bronzeFishTrophy, snailModel, candle, classicPitcher, throwbackWrestlingFigure, starClock, longLocustModel, seaHorseModel, agriasButterflyModel, resettiModel, teaSet, incenseBurner, succulentPlant, pie, killifishModel, moleCricketModel, paintingSet, spookyTableSetting, mothModel, metronome, heartShapedBouquet, filmProjector, coconutJuice, shavedIceMaker, frogModel, monarchButterflyModel, suckerfishModel, kingSalmonModel, soupKettle, garModel, mosquitoModel, deskMirror, eveningCicadaModel, novaLight, tunaModel, kettlebell, amp, toyCockroach, jewelBeetleModel, ball, darnerDragonflyModel, squidModel, fryingPan, creamAndSugar, spookyLantern, hamsterCage, microwave, divingBeetleModel, carpModel, handyWaterCooler, judgeSBell, whaleSharkModel, sewingMachine, nintendoSwitch, bagwormModel, walkingLeafModel, faxMachine, barreleyeModel, tableLamp, shellLamp, tigerButterflyModel, ringtoss, stackedMagazines, dollhouse, goldenDishes, redSnapperModel, floatingBiotopePlanter, ring, freshwaterGobyModel, lCDTV50In, sweetfishModel, ribbonEelModel, brineShrimpAquarium, phonograph, blackBassModel, woodenTableMirror, woodenBlockToy, cardboardBox, tilapiaModel, grandHHerculesModel, frozenTreatSet, mixer, dALModelPlane, momSPlushie, paleChubModel, commonBluebottleModel, crucianCarpModel, goldfishModel, angelfishModel, nutcracker, pot, ironingSet, kagamimochi, charModel, ringCon, metalCan, dabModel, unfinishedPuzzle, giantSnakeheadModel, mSunsetMothModel, pineBonsaiTree, throwbackContainer, dALMug, floorSign, wobblingZipperToy, aromaPot, fireFlower, napoleonfishModel, bronzeBugTrophy, pikeModel, emperorButterflyModel, rattanTableLamp, momSHomemadeCake, pillBugModel, matryoshka, scarabBeetleModel, piranhaModel, ladybugModel, tinRobot, hornedElephantModel, chessboard, twelveGrapeDish, bambooCandleholder, desktopComputer, miyamaStagModel, sawStagModel, stinkbugModel, birthdayCake, celebratoryCandles, coin, footballFishModel, analogKitchenScale, book, libraScale, plasmaBall, violinBeetleModel, rattanTowelBasket, steamerBasketSet, shell, mantisModel, throwbackSkullRadio, hermitCrabModel, silverHHATrophy, oilLamp, weddingCake, riceCooker, bitterlingModel, puppyPlushie, cuttingBoard, shellSpeaker, bunnyDayBasket, paperKiteButterflyModel, babyPanda, pedalBoard, knifeBlock, scorpionModel, hammerheadSharkModel, tarantulaModel, yellowButterflyModel, recordBox, petFoodBowl, traditionalBalancingToy, momSPenStand, catGrass, katana, grasshopperModel, clownFishModel, mahiMahiModel, rBrookeSBirdwingModel, miniCactusSet, bambooLunchBox, doradoModel, electronicsKit, oarfishModel, yutNori, greatWhiteSharkModel, tinBucket, flyModel, momSCandleSet, dolly, pocketVintageCamper, simpleKettle, tissueBox, toyCentipede, pondskaterModel, cherrySpeakers, snappingTurtleModel, birthdayCandles, sawSharkModel, treeSBountyLittleTree, seaButterflyModel, miniCircuit, walkingStickModel, pondSmeltModel, goldBugTrophy, turkeyDayDecorations, momSTeaCozy, cushion, woodenFish, coolerBox, treeSBountyLamp, fragranceSticks, traditionalTeaSet, goldenDungBeetle, brownCicadaModel, picnicBasket, cordlessPhone, salmonModel, bettaModel, proteinShakerBottle, cherryBlossomBonsai, rosaliaBatesiBeetleModel, cornucopia, antModel, dalaHorse, goldenCandlestick, firewood, glassHolderWithCandle, guppyModel, homeworkSet, ukulele, accessoriesStand, magicKit, saddledBichirModel, citrusLongHornedBModel, orchidMantisModel, mug, anthuriumPlant, zodiacOxFigurine, goldHHATrophy, roverSBriefcase, unglazedDishSet, bunnyDayLamp, manFacedStinkBugModel, microscope, documentStack, anchovyModel, goldenStagModel, weddingCandleSet, yellowPerchModel, goldenArowanaModel, dishDryingRack, grandGoliathBeetleModel, goldenTroutModel, lCDTV20In, tabletopFestiveTree, rotaryPhone, chocolateHeart, hulaDoll, toyBox, momSCushion, fortuneTellingSet);
        return getRandomValue(miscs);
    }

    private List<Item> getRandomValue(List<List<Item>> miscs) {
        int index = new Random().nextInt(miscs.size());
        return miscs.get(index);
    }
}
