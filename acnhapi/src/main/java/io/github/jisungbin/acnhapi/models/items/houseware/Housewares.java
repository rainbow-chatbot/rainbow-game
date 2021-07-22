/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Housewares.java] created by Ji Sungbin on 21. 7. 23. 오전 2:52.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.items.houseware;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import io.github.jisungbin.acnhapi.models.items.common.Item;
import io.github.jisungbin.acnhapi.models.items.common.ItemWrapper;

public class Housewares implements ItemWrapper {
    @SerializedName("sleigh")
    private List<Item> sleigh;

    @SerializedName("artisanal_bug_cage")
    private List<Item> artisanalBugCage;

    @SerializedName("drum_set")
    private List<Item> drumSet;

    @SerializedName("electric_kick_scooter")
    private List<Item> electricKickScooter;

    @SerializedName("Papa_panda")
    private List<Item> papaPanda;

    @SerializedName("kitchen_island")
    private List<Item> kitchenIsland;

    @SerializedName("mermaid_closet")
    private List<Item> mermaidCloset;

    @SerializedName("large_Mushroom_Platform")
    private List<Item> largeMushroomPlatform;

    @SerializedName("handcart")
    private List<Item> handcart;

    @SerializedName("anatomical_model")
    private List<Item> anatomicalModel;

    @SerializedName("Bunny_Day_merry_balloons")
    private List<Item> bunnyDayMerryBalloons;

    @SerializedName("rattan_stool")
    private List<Item> rattanStool;

    @SerializedName("tea_table")
    private List<Item> teaTable;

    @SerializedName("imperial_dining_table")
    private List<Item> imperialDiningTable;

    @SerializedName("drinking_fountain")
    private List<Item> drinkingFountain;

    @SerializedName("outdoor_air_conditioner")
    private List<Item> outdoorAirConditioner;

    @SerializedName("spinning_wheel")
    private List<Item> spinningWheel;

    @SerializedName("medium_cardboard_boxes")
    private List<Item> mediumCardboardBoxes;

    @SerializedName("bamboo_shelf")
    private List<Item> bambooShelf;

    @SerializedName("mush_partition")
    private List<Item> mushPartition;

    @SerializedName("pool")
    private List<Item> pool;

    @SerializedName("mermaid_screen")
    private List<Item> mermaidScreen;

    @SerializedName("Stonehenge")
    private List<Item> stonehenge;

    @SerializedName("simple_DIY_workbench")
    private List<Item> simpleDIYWorkbench;

    @SerializedName("box_sofa")
    private List<Item> boxSofa;

    @SerializedName("bamboo_grass")
    private List<Item> bambooGrass;

    @SerializedName("outdoor_generator")
    private List<Item> outdoorGenerator;

    @SerializedName("Toy_Day_sleigh")
    private List<Item> toyDaySleigh;

    @SerializedName("imperial_dining_chair")
    private List<Item> imperialDiningChair;

    @SerializedName("mush_log")
    private List<Item> mushLog;

    @SerializedName("festive_tree")
    private List<Item> festiveTree;

    @SerializedName("zen-style_stone")
    private List<Item> zenStyleStone;

    @SerializedName("tankless_toilet")
    private List<Item> tanklessToilet;

    @SerializedName("loft_bed_with_desk")
    private List<Item> loftBedWithDesk;

    @SerializedName("train_set")
    private List<Item> trainSet;

    @SerializedName("mermaid_lamp")
    private List<Item> mermaidLamp;

    @SerializedName("alto_saxophone")
    private List<Item> altoSaxophone;

    @SerializedName("cypress_plant")
    private List<Item> cypressPlant;

    @SerializedName("ironwood_cart")
    private List<Item> ironwoodCart;

    @SerializedName("tennis_table")
    private List<Item> tennisTable;

    @SerializedName("imperial_chest")
    private List<Item> imperialChest;

    @SerializedName("streetlamp")
    private List<Item> streetlamp;

    @SerializedName("astronaut_suit")
    private List<Item> astronautSuit;

    @SerializedName("wooden_bookshelf")
    private List<Item> woodenBookshelf;

    @SerializedName("yellow-leaf_pile")
    private List<Item> yellowLeafPile;

    @SerializedName("log_extra-long_sofa")
    private List<Item> logExtraLongSofa;

    @SerializedName("simple_well")
    private List<Item> simpleWell;

    @SerializedName("blossom-viewing_lantern")
    private List<Item> blossomViewingLantern;

    @SerializedName("double_sofa")
    private List<Item> doubleSofa;

    @SerializedName("frozen_arch")
    private List<Item> frozenArch;

    @SerializedName("mush_parasol")
    private List<Item> mushParasol;

    @SerializedName("diner_dining_table")
    private List<Item> dinerDiningTable;

    @SerializedName("garbage_pail")
    private List<Item> garbagePail;

    @SerializedName("wooden_waste_bin")
    private List<Item> woodenWasteBin;

    @SerializedName("cute_bed")
    private List<Item> cuteBed;

    @SerializedName("arcade_combat_game")
    private List<Item> arcadeCombatGame;

    @SerializedName("basketball_hoop")
    private List<Item> basketballHoop;

    @SerializedName("wooden-block_bench")
    private List<Item> woodenBlockBench;

    @SerializedName("acoustic_guitar")
    private List<Item> acousticGuitar;

    @SerializedName("den_desk")
    private List<Item> denDesk;

    @SerializedName("large_cardboard_boxes")
    private List<Item> largeCardboardBoxes;

    @SerializedName("clothes_closet")
    private List<Item> clothesCloset;

    @SerializedName("arcade_fighting_game")
    private List<Item> arcadeFightingGame;

    @SerializedName("Pisces_lamp")
    private List<Item> piscesLamp;

    @SerializedName("angled_signpost")
    private List<Item> angledSignpost;

    @SerializedName("pagoda")
    private List<Item> pagoda;

    @SerializedName("round_space_heater")
    private List<Item> roundSpaceHeater;

    @SerializedName("water_pump")
    private List<Item> waterPump;

    @SerializedName("rattan_vanity")
    private List<Item> rattanVanity;

    @SerializedName("rocking_horse")
    private List<Item> rockingHorse;

    @SerializedName("wedding_welcome_board")
    private List<Item> weddingWelcomeBoard;

    @SerializedName("treadmill")
    private List<Item> treadmill;

    @SerializedName("video_camera")
    private List<Item> videoCamera;

    @SerializedName("stone_table")
    private List<Item> stoneTable;

    @SerializedName("cherry-blossom_pond_stone")
    private List<Item> cherryBlossomPondStone;

    @SerializedName("Bunny_Day_stool")
    private List<Item> bunnyDayStool;

    @SerializedName("gong")
    private List<Item> gong;

    @SerializedName("skeleton")
    private List<Item> skeleton;

    @SerializedName("mountain_bike")
    private List<Item> mountainBike;

    @SerializedName("Bunny_Day_wardrobe")
    private List<Item> bunnyDayWardrobe;

    @SerializedName("frozen_counter")
    private List<Item> frozenCounter;

    @SerializedName("shell_table")
    private List<Item> shellTable;

    @SerializedName("stone_arch")
    private List<Item> stoneArch;

    @SerializedName("water_cooler")
    private List<Item> waterCooler;

    @SerializedName("stadiometer")
    private List<Item> stadiometer;

    @SerializedName("tulip_surprise_box")
    private List<Item> tulipSurpriseBox;

    @SerializedName("ironwood_cupboard")
    private List<Item> ironwoodCupboard;

    @SerializedName("bamboo_floor_lamp")
    private List<Item> bambooFloorLamp;

    @SerializedName("clackercart")
    private List<Item> clackercart;

    @SerializedName("sleeping_bag")
    private List<Item> sleepingBag;

    @SerializedName("upright_piano")
    private List<Item> uprightPiano;

    @SerializedName("freezer")
    private List<Item> freezer;

    @SerializedName("solar_panel")
    private List<Item> solarPanel;

    @SerializedName("tire_toy")
    private List<Item> tireToy;

    @SerializedName("bonfire")
    private List<Item> bonfire;

    @SerializedName("pansy_table")
    private List<Item> pansyTable;

    @SerializedName("refrigerator")
    private List<Item> refrigerator;

    @SerializedName("double-door_refrigerator")
    private List<Item> doubleDoorRefrigerator;

    @SerializedName("pond_stone")
    private List<Item> pondStone;

    @SerializedName("Bunny_Day_vanity")
    private List<Item> bunnyDayVanity;

    @SerializedName("grass_standee")
    private List<Item> grassStandee;

    @SerializedName("synthesizer")
    private List<Item> synthesizer;

    @SerializedName("wooden_end_table")
    private List<Item> woodenEndTable;

    @SerializedName("grand_Atlas_moth_model")
    private List<Item> grandAtlasMothModel;

    @SerializedName("marimba")
    private List<Item> marimba;

    @SerializedName("fan_palm")
    private List<Item> fanPalm;

    @SerializedName("harp")
    private List<Item> harp;

    @SerializedName("tiki_torch")
    private List<Item> tikiTorch;

    @SerializedName("frozen_bed")
    private List<Item> frozenBed;

    @SerializedName("antique_chair")
    private List<Item> antiqueChair;

    @SerializedName("imperial_bed")
    private List<Item> imperialBed;

    @SerializedName("baby_chair")
    private List<Item> babyChair;

    @SerializedName("Capricorn_ornament")
    private List<Item> capricornOrnament;

    @SerializedName("utility_pole")
    private List<Item> utilityPole;

    @SerializedName("scarecrow")
    private List<Item> scarecrow;

    @SerializedName("frozen_partition")
    private List<Item> frozenPartition;

    @SerializedName("juicy-apple_TV")
    private List<Item> juicyAppleTV;

    @SerializedName("wedding_arch")
    private List<Item> weddingArch;

    @SerializedName("shower_booth")
    private List<Item> showerBooth;

    @SerializedName("Festivale_garland")
    private List<Item> festivaleGarland;

    @SerializedName("mini_DIY_workbench")
    private List<Item> miniDIYWorkbench;

    @SerializedName("rocking_chair")
    private List<Item> rockingChair;

    @SerializedName("mini_fridge")
    private List<Item> miniFridge;

    @SerializedName("fish-drying_rack")
    private List<Item> fishDryingRack;

    @SerializedName("illuminated_present")
    private List<Item> illuminatedPresent;

    @SerializedName("satellite")
    private List<Item> satellite;

    @SerializedName("cherry-blossom-petal_pile")
    private List<Item> cherryBlossomPetalPile;

    @SerializedName("garden_wagon")
    private List<Item> gardenWagon;

    @SerializedName("anchor_statue")
    private List<Item> anchorStatue;

    @SerializedName("gift_pile")
    private List<Item> giftPile;

    @SerializedName("billiard_table")
    private List<Item> billiardTable;

    @SerializedName("pirate-ship_helm")
    private List<Item> pirateShipHelm;

    @SerializedName("hi-fi_stereo")
    private List<Item> hiFiStereo;

    @SerializedName("diner_mini_table")
    private List<Item> dinerMiniTable;

    @SerializedName("sphinx")
    private List<Item> sphinx;

    @SerializedName("study_desk")
    private List<Item> studyDesk;

    @SerializedName("rodeo-style_springy_ride-on")
    private List<Item> rodeoStyleSpringyRideOn;

    @SerializedName("antique_table")
    private List<Item> antiqueTable;

    @SerializedName("destinations_signpost")
    private List<Item> destinationsSignpost;

    @SerializedName("pyramid")
    private List<Item> pyramid;

    @SerializedName("pear_bed")
    private List<Item> pearBed;

    @SerializedName("velvet_stool")
    private List<Item> velvetStool;

    @SerializedName("fountain")
    private List<Item> fountain;

    @SerializedName("fishing-rod_stand")
    private List<Item> fishingRodStand;

    @SerializedName("cherry-blossom_branches")
    private List<Item> cherryBlossomBranches;

    @SerializedName("bamboo_basket")
    private List<Item> bambooBasket;

    @SerializedName("brick_oven")
    private List<Item> brickOven;

    @SerializedName("brick_well")
    private List<Item> brickWell;

    @SerializedName("wedding_pipe_organ")
    private List<Item> weddingPipeOrgan;

    @SerializedName("giant_teddy_bear")
    private List<Item> giantTeddyBear;

    @SerializedName("tatami_bed")
    private List<Item> tatamiBed;

    @SerializedName("elaborate_kimono_stand")
    private List<Item> elaborateKimonoStand;

    @SerializedName("pants_press")
    private List<Item> pantsPress;

    @SerializedName("rocket_lamp")
    private List<Item> rocketLamp;

    @SerializedName("block")
    private List<Item> block;

    @SerializedName("iron_frame")
    private List<Item> ironFrame;

    @SerializedName("wedding_chair")
    private List<Item> weddingChair;

    @SerializedName("cacao_tree")
    private List<Item> cacaoTree;

    @SerializedName("DJ's_turntable")
    private List<Item> dJSTurntable;

    @SerializedName("stall")
    private List<Item> stall;

    @SerializedName("den_chair")
    private List<Item> denChair;

    @SerializedName("flat_garden_rock")
    private List<Item> flatGardenRock;

    @SerializedName("ironwood_table")
    private List<Item> ironwoodTable;

    @SerializedName("wooden-block_chest")
    private List<Item> woodenBlockChest;

    @SerializedName("2021_celebratory_arch")
    private List<Item> jsonMember2021CelebratoryArch;

    @SerializedName("spooky_lantern_set")
    private List<Item> spookyLanternSet;

    @SerializedName("cute_vanity")
    private List<Item> cuteVanity;

    @SerializedName("podium")
    private List<Item> podium;

    @SerializedName("rattan_waste_bin")
    private List<Item> rattanWasteBin;

    @SerializedName("iron_shelf")
    private List<Item> ironShelf;

    @SerializedName("throwback_dino_screen")
    private List<Item> throwbackDinoScreen;

    @SerializedName("electric_guitar")
    private List<Item> electricGuitar;

    @SerializedName("soft-serve_lamp")
    private List<Item> softServeLamp;

    @SerializedName("retro_stereo")
    private List<Item> retroStereo;

    @SerializedName("server")
    private List<Item> server;

    @SerializedName("lily_record_player")
    private List<Item> lilyRecordPlayer;

    @SerializedName("Festivale_stall")
    private List<Item> festivaleStall;

    @SerializedName("Bunny_Day_arch")
    private List<Item> bunnyDayArch;

    @SerializedName("signpost")
    private List<Item> signpost;

    @SerializedName("grand_b._dragonfly_model")
    private List<Item> grandBDragonflyModel;

    @SerializedName("antique_vanity")
    private List<Item> antiqueVanity;

    @SerializedName("shaded_floor_lamp")
    private List<Item> shadedFloorLamp;

    @SerializedName("springy_ride-on")
    private List<Item> springyRideOn;

    @SerializedName("mountain_standee")
    private List<Item> mountainStandee;

    @SerializedName("paper_lantern")
    private List<Item> paperLantern;

    @SerializedName("kotatsu")
    private List<Item> kotatsu;

    @SerializedName("barbecue")
    private List<Item> barbecue;

    @SerializedName("Bunny_Day_bed")
    private List<Item> bunnyDayBed;

    @SerializedName("vintage_TV_tray")
    private List<Item> vintageTVTray;

    @SerializedName("sideways_pirate_barrel")
    private List<Item> sidewaysPirateBarrel;

    @SerializedName("bamboo_bench")
    private List<Item> bambooBench;

    @SerializedName("lifeguard_chair")
    private List<Item> lifeguardChair;

    @SerializedName("log_bed")
    private List<Item> logBed;

    @SerializedName("pile_of_zen_cushions")
    private List<Item> pileOfZenCushions;

    @SerializedName("robot_hero")
    private List<Item> robotHero;

    @SerializedName("mush_low_stool")
    private List<Item> mushLowStool;

    @SerializedName("garden_rock")
    private List<Item> gardenRock;

    @SerializedName("foosball_table")
    private List<Item> foosballTable;

    @SerializedName("wooden_wardrobe")
    private List<Item> woodenWardrobe;

    @SerializedName("hedge_standee")
    private List<Item> hedgeStandee;

    @SerializedName("effects_rack")
    private List<Item> effectsRack;

    @SerializedName("Taurus_bathtub")
    private List<Item> taurusBathtub;

    @SerializedName("mermaid_table")
    private List<Item> mermaidTable;

    @SerializedName("chalkboard")
    private List<Item> chalkboard;

    @SerializedName("RC_helicopter")
    private List<Item> rCHelicopter;

    @SerializedName("pull-up-bar_stand")
    private List<Item> pullUpBarStand;

    @SerializedName("OK_Motors_sign")
    private List<Item> oKMotorsSign;

    @SerializedName("automatic_washer")
    private List<Item> automaticWasher;

    @SerializedName("diner_counter_table")
    private List<Item> dinerCounterTable;

    @SerializedName("rose_bed")
    private List<Item> roseBed;

    @SerializedName("mermaid_sofa")
    private List<Item> mermaidSofa;

    @SerializedName("screen")
    private List<Item> screen;

    @SerializedName("three-tiered_snowperson")
    private List<Item> threeTieredSnowperson;

    @SerializedName("diner_sofa")
    private List<Item> dinerSofa;

    @SerializedName("electric_bass")
    private List<Item> electricBass;

    @SerializedName("table_with_cloth")
    private List<Item> tableWithCloth;

    @SerializedName("menu_chalkboard")
    private List<Item> menuChalkboard;

    @SerializedName("iron_garden_chair")
    private List<Item> ironGardenChair;

    @SerializedName("maple-leaf_pond_stone")
    private List<Item> mapleLeafPondStone;

    @SerializedName("red_corner")
    private List<Item> redCorner;

    @SerializedName("pipe")
    private List<Item> pipe;

    @SerializedName("ironwood_kitchenette")
    private List<Item> ironwoodKitchenette;

    @SerializedName("antique_clock")
    private List<Item> antiqueClock;

    @SerializedName("cute_floor_lamp")
    private List<Item> cuteFloorLamp;

    @SerializedName("outdoor_bath")
    private List<Item> outdoorBath;

    @SerializedName("cute_chair")
    private List<Item> cuteChair;

    @SerializedName("outdoor_picnic_set")
    private List<Item> outdoorPicnicSet;

    @SerializedName("natural_garden_chair")
    private List<Item> naturalGardenChair;

    @SerializedName("natural_square_table")
    private List<Item> naturalSquareTable;

    @SerializedName("open-frame_kitchen")
    private List<Item> openFrameKitchen;

    @SerializedName("Festivale_parasol")
    private List<Item> festivaleParasol;

    @SerializedName("throwback_mitt_chair")
    private List<Item> throwbackMittChair;

    @SerializedName("claw-foot_tub")
    private List<Item> clawFootTub;

    @SerializedName("wooden_full-length_mirror")
    private List<Item> woodenFullLengthMirror;

    @SerializedName("wooden_simple_bed")
    private List<Item> woodenSimpleBed;

    @SerializedName("Market_Place_decoration")
    private List<Item> marketPlaceDecoration;

    @SerializedName("South_Pole")
    private List<Item> southPole;

    @SerializedName("yucca")
    private List<Item> yucca;

    @SerializedName("clay_furnace")
    private List<Item> clayFurnace;

    @SerializedName("wooden_mini_table")
    private List<Item> woodenMiniTable;

    @SerializedName("rock_guitar")
    private List<Item> rockGuitar;

    @SerializedName("plastic_pool")
    private List<Item> plasticPool;

    @SerializedName("Aries_rocking_chair")
    private List<Item> ariesRockingChair;

    @SerializedName("sauna_heater")
    private List<Item> saunaHeater;

    @SerializedName("illuminated_snowflakes")
    private List<Item> illuminatedSnowflakes;

    @SerializedName("golden_casket")
    private List<Item> goldenCasket;

    @SerializedName("snack_machine")
    private List<Item> snackMachine;

    @SerializedName("serving_cart")
    private List<Item> servingCart;

    @SerializedName("campfire_cookware")
    private List<Item> campfireCookware;

    @SerializedName("iron_hanger_stand")
    private List<Item> ironHangerStand;

    @SerializedName("parabolic_antenna")
    private List<Item> parabolicAntenna;

    @SerializedName("phone_box")
    private List<Item> phoneBox;

    @SerializedName("floating_block")
    private List<Item> floatingBlock;

    @SerializedName("folding_floor_lamp")
    private List<Item> foldingFloorLamp;

    @SerializedName("spooky_carriage")
    private List<Item> spookyCarriage;

    @SerializedName("piano_bench")
    private List<Item> pianoBench;

    @SerializedName("oil-barrel_bathtub")
    private List<Item> oilBarrelBathtub;

    @SerializedName("deer_scare")
    private List<Item> deerScare;

    @SerializedName("antique_wardrobe")
    private List<Item> antiqueWardrobe;

    @SerializedName("beach_towel")
    private List<Item> beachTowel;

    @SerializedName("tree's_bounty_arch")
    private List<Item> treeSBountyArch;

    @SerializedName("shell_stool")
    private List<Item> shellStool;

    @SerializedName("zen_cushion")
    private List<Item> zenCushion;

    @SerializedName("Festivale_stage")
    private List<Item> festivaleStage;

    @SerializedName("sandbox")
    private List<Item> sandbox;

    @SerializedName("log_chair")
    private List<Item> logChair;

    @SerializedName("spooky_scarecrow")
    private List<Item> spookyScarecrow;

    @SerializedName("log_stakes")
    private List<Item> logStakes;

    @SerializedName("tire_stack")
    private List<Item> tireStack;

    @SerializedName("mush_table")
    private List<Item> mushTable;

    @SerializedName("stone_tablet")
    private List<Item> stoneTablet;

    @SerializedName("wooden-block_chair")
    private List<Item> woodenBlockChair;

    @SerializedName("wooden-block_bookshelf")
    private List<Item> woodenBlockBookshelf;

    @SerializedName("camping_cot")
    private List<Item> campingCot;

    @SerializedName("director's_chair")
    private List<Item> directorSChair;

    @SerializedName("mic_stand")
    private List<Item> micStand;

    @SerializedName("monster_statue")
    private List<Item> monsterStatue;

    @SerializedName("birdbath")
    private List<Item> birdbath;

    @SerializedName("outdoor_bench")
    private List<Item> outdoorBench;

    @SerializedName("frozen_chair")
    private List<Item> frozenChair;

    @SerializedName("rattan_low_table")
    private List<Item> rattanLowTable;

    @SerializedName("mermaid_bed")
    private List<Item> mermaidBed;

    @SerializedName("Turkey_Day_table")
    private List<Item> turkeyDayTable;

    @SerializedName("retro_gas_pump")
    private List<Item> retroGasPump;

    @SerializedName("ironwood_DIY_workbench")
    private List<Item> ironwoodDIYWorkbench;

    @SerializedName("rocket")
    private List<Item> rocket;

    @SerializedName("swinging_bench")
    private List<Item> swingingBench;

    @SerializedName("arcade_seat")
    private List<Item> arcadeSeat;

    @SerializedName("iron_garden_bench")
    private List<Item> ironGardenBench;

    @SerializedName("floor_light")
    private List<Item> floorLight;

    @SerializedName("teacup_ride")
    private List<Item> teacupRide;

    @SerializedName("cute_sofa")
    private List<Item> cuteSofa;

    @SerializedName("kettle_bathtub")
    private List<Item> kettleBathtub;

    @SerializedName("speed_bag")
    private List<Item> speedBag;

    @SerializedName("beekeeper's_hive")
    private List<Item> beekeeperSHive;

    @SerializedName("air_circulator")
    private List<Item> airCirculator;

    @SerializedName("cute_wardrobe")
    private List<Item> cuteWardrobe;

    @SerializedName("diner_neon_sign")
    private List<Item> dinerNeonSign;

    @SerializedName("doghouse")
    private List<Item> doghouse;

    @SerializedName("garden_faucet")
    private List<Item> gardenFaucet;

    @SerializedName("low_screen")
    private List<Item> lowScreen;

    @SerializedName("digital_scale")
    private List<Item> digitalScale;

    @SerializedName("high-end_stereo")
    private List<Item> highEndStereo;

    @SerializedName("bunk_bed")
    private List<Item> bunkBed;

    @SerializedName("plain_wooden_shop_sign")
    private List<Item> plainWoodenShopSign;

    @SerializedName("fortune-cookie_cart")
    private List<Item> fortuneCookieCart;

    @SerializedName("red-leaf_pile")
    private List<Item> redLeafPile;

    @SerializedName("trophy_case")
    private List<Item> trophyCase;

    @SerializedName("birthday_sign")
    private List<Item> birthdaySign;

    @SerializedName("wind_turbine")
    private List<Item> windTurbine;

    @SerializedName("toilet")
    private List<Item> toilet;

    @SerializedName("system_kitchen")
    private List<Item> systemKitchen;

    @SerializedName("ironing_board")
    private List<Item> ironingBoard;

    @SerializedName("telescope")
    private List<Item> telescope;

    @SerializedName("Turkey_Day_chair")
    private List<Item> turkeyDayChair;

    @SerializedName("cosmos_shower")
    private List<Item> cosmosShower;

    @SerializedName("illuminated_tree")
    private List<Item> illuminatedTree;

    @SerializedName("mum_cushion")
    private List<Item> mumCushion;

    @SerializedName("space_shuttle")
    private List<Item> spaceShuttle;

    @SerializedName("vacuum_cleaner")
    private List<Item> vacuumCleaner;

    @SerializedName("raccoon_figurine")
    private List<Item> raccoonFigurine;

    @SerializedName("surfboard")
    private List<Item> surfboard;

    @SerializedName("ironwood_dresser")
    private List<Item> ironwoodDresser;

    @SerializedName("Thwomp")
    private List<Item> thwomp;

    @SerializedName("arcade_mahjong_game")
    private List<Item> arcadeMahjongGame;

    @SerializedName("tool_cart")
    private List<Item> toolCart;

    @SerializedName("wedding_flower_stand")
    private List<Item> weddingFlowerStand;

    @SerializedName("wooden_chest")
    private List<Item> woodenChest;

    @SerializedName("birthday_table")
    private List<Item> birthdayTable;

    @SerializedName("scattered_papers")
    private List<Item> scatteredPapers;

    @SerializedName("Brake_Tapper")
    private List<Item> brakeTapper;

    @SerializedName("green-leaf_pile")
    private List<Item> greenLeafPile;

    @SerializedName("Cancer_table")
    private List<Item> cancerTable;

    @SerializedName("Festivale_float")
    private List<Item> festivaleFloat;

    @SerializedName("portable_toilet")
    private List<Item> portableToilet;

    @SerializedName("lawn_mower")
    private List<Item> lawnMower;

    @SerializedName("Mrs._Flamingo")
    private List<Item> mrsFlamingo;

    @SerializedName("rattan_wardrobe")
    private List<Item> rattanWardrobe;

    @SerializedName("drying_rack")
    private List<Item> dryingRack;

    @SerializedName("kimono_stand")
    private List<Item> kimonoStand;

    @SerializedName("ironwood_low_table")
    private List<Item> ironwoodLowTable;

    @SerializedName("candy_machine")
    private List<Item> candyMachine;

    @SerializedName("wooden-block_stereo")
    private List<Item> woodenBlockStereo;

    @SerializedName("frozen_pillar")
    private List<Item> frozenPillar;

    @SerializedName("silo")
    private List<Item> silo;

    @SerializedName("street_organ")
    private List<Item> streetOrgan;

    @SerializedName("kadomatsu")
    private List<Item> kadomatsu;

    @SerializedName("shell_arch")
    private List<Item> shellArch;

    @SerializedName("wild_log_bench")
    private List<Item> wildLogBench;

    @SerializedName("fire_pit")
    private List<Item> firePit;

    @SerializedName("school_chair")
    private List<Item> schoolChair;

    @SerializedName("ocean_sunfish_model")
    private List<Item> oceanSunfishModel;

    @SerializedName("punching_bag")
    private List<Item> punchingBag;

    @SerializedName("shell_bed")
    private List<Item> shellBed;

    @SerializedName("retro_fan")
    private List<Item> retroFan;

    @SerializedName("wooden_chair")
    private List<Item> woodenChair;

    @SerializedName("log_dining_table")
    private List<Item> logDiningTable;

    @SerializedName("basic_teacher's_desk")
    private List<Item> basicTeacherSDesk;

    @SerializedName("lawn_chair")
    private List<Item> lawnChair;

    @SerializedName("smoker")
    private List<Item> smoker;

    @SerializedName("Gemini_closet")
    private List<Item> geminiCloset;

    @SerializedName("loom")
    private List<Item> loom;

    @SerializedName("long_bathtub")
    private List<Item> longBathtub;

    @SerializedName("Mama_bear")
    private List<Item> mamaBear;

    @SerializedName("pinball_machine")
    private List<Item> pinballMachine;

    @SerializedName("Mr._Flamingo")
    private List<Item> mrFlamingo;

    @SerializedName("tree_standee")
    private List<Item> treeStandee;

    @SerializedName("wedding_head_table")
    private List<Item> weddingHeadTable;

    @SerializedName("box_corner_sofa")
    private List<Item> boxCornerSofa;

    @SerializedName("garden_bench")
    private List<Item> gardenBench;

    @SerializedName("leaf_campfire")
    private List<Item> leafCampfire;

    @SerializedName("lecture-hall_bench")
    private List<Item> lectureHallBench;

    @SerializedName("Tower_of_Pisa")
    private List<Item> towerOfPisa;

    @SerializedName("birdhouse")
    private List<Item> birdhouse;

    @SerializedName("log_bench")
    private List<Item> logBench;

    @SerializedName("old_sewing_machine")
    private List<Item> oldSewingMachine;

    @SerializedName("pear_wardrobe")
    private List<Item> pearWardrobe;

    @SerializedName("wooden_table")
    private List<Item> woodenTable;

    @SerializedName("hose_reel")
    private List<Item> hoseReel;

    @SerializedName("floor_lamp")
    private List<Item> floorLamp;

    @SerializedName("wave_breaker")
    private List<Item> waveBreaker;

    @SerializedName("bamboo_speaker")
    private List<Item> bambooSpeaker;

    @SerializedName("wedding_bench")
    private List<Item> weddingBench;

    @SerializedName("cat_tower")
    private List<Item> catTower;

    @SerializedName("popcorn_machine")
    private List<Item> popcornMachine;

    @SerializedName("upright_locker")
    private List<Item> uprightLocker;

    @SerializedName("small_cardboard_boxes")
    private List<Item> smallCardboardBoxes;

    @SerializedName("wooden-block_stool")
    private List<Item> woodenBlockStool;

    @SerializedName("bamboo_stool")
    private List<Item> bambooStool;

    @SerializedName("spooky_chair")
    private List<Item> spookyChair;

    @SerializedName("wheelchair")
    private List<Item> wheelchair;

    @SerializedName("garbage_bin")
    private List<Item> garbageBin;

    @SerializedName("pet_bed")
    private List<Item> petBed;

    @SerializedName("diner_chair")
    private List<Item> dinerChair;

    @SerializedName("moai_statue")
    private List<Item> moaiStatue;

    @SerializedName("jukebox")
    private List<Item> jukebox;

    @SerializedName("floor_seat")
    private List<Item> floorSeat;

    @SerializedName("sand_castle")
    private List<Item> sandCastle;

    @SerializedName("playground_gym")
    private List<Item> playgroundGym;

    @SerializedName("Turkey_Day_hearth")
    private List<Item> turkeyDayHearth;

    @SerializedName("street_piano")
    private List<Item> streetPiano;

    @SerializedName("log_round_table")
    private List<Item> logRoundTable;

    @SerializedName("tiny_library")
    private List<Item> tinyLibrary;

    @SerializedName("leaf_stool")
    private List<Item> leafStool;

    @SerializedName("modern_office_chair")
    private List<Item> modernOfficeChair;

    @SerializedName("studio_spotlight")
    private List<Item> studioSpotlight;

    @SerializedName("tall_garden_rock")
    private List<Item> tallGardenRock;

    @SerializedName("deluxe_washer")
    private List<Item> deluxeWasher;

    @SerializedName("antique_bureau")
    private List<Item> antiqueBureau;

    @SerializedName("exercise_ball")
    private List<Item> exerciseBall;

    @SerializedName("Statue_of_Liberty")
    private List<Item> statueOfLiberty;

    @SerializedName("log_decorative_shelves")
    private List<Item> logDecorativeShelves;

    @SerializedName("campsite_sign")
    private List<Item> campsiteSign;

    @SerializedName("shell_fountain")
    private List<Item> shellFountain;

    @SerializedName("bamboo_doll")
    private List<Item> bambooDoll;

    @SerializedName("antique_console_table")
    private List<Item> antiqueConsoleTable;

    @SerializedName("mermaid_vanity")
    private List<Item> mermaidVanity;

    @SerializedName("small_Mushroom_Platform")
    private List<Item> smallMushroomPlatform;

    @SerializedName("cello")
    private List<Item> cello;

    @SerializedName("neutral_corner")
    private List<Item> neutralCorner;

    @SerializedName("silver_mic")
    private List<Item> silverMic;

    @SerializedName("cardboard_table")
    private List<Item> cardboardTable;

    @SerializedName("cardboard_chair")
    private List<Item> cardboardChair;

    @SerializedName("?_Block")
    private List<Item> unknownBlock;

    @SerializedName("lecture-hall_desk")
    private List<Item> lectureHallDesk;

    @SerializedName("bonsai_shelf")
    private List<Item> bonsaiShelf;

    @SerializedName("pirate-ship_cannon")
    private List<Item> pirateShipCannon;

    @SerializedName("butter_churn")
    private List<Item> butterChurn;

    @SerializedName("stone_lion-dog")
    private List<Item> stoneLionDog;

    @SerializedName("orange_end_table")
    private List<Item> orangeEndTable;

    @SerializedName("wedding_table")
    private List<Item> weddingTable;

    @SerializedName("bamboo_noodle_slide")
    private List<Item> bambooNoodleSlide;

    @SerializedName("clothesline_pole")
    private List<Item> clotheslinePole;

    @SerializedName("cone")
    private List<Item> cone;

    @SerializedName("plain_sink")
    private List<Item> plainSink;

    @SerializedName("exercise_bike")
    private List<Item> exerciseBike;

    @SerializedName("fan")
    private List<Item> fan;

    @SerializedName("inflatable_sofa")
    private List<Item> inflatableSofa;

    @SerializedName("bamboo_stopblock")
    private List<Item> bambooStopblock;

    @SerializedName("log_garden_lounge")
    private List<Item> logGardenLounge;

    @SerializedName("frozen_tree")
    private List<Item> frozenTree;

    @SerializedName("outdoor_table")
    private List<Item> outdoorTable;

    @SerializedName("log_stool")
    private List<Item> logStool;

    @SerializedName("big_festive_tree")
    private List<Item> bigFestiveTree;

    @SerializedName("flower_stand")
    private List<Item> flowerStand;

    @SerializedName("study_chair")
    private List<Item> studyChair;

    @SerializedName("throwback_rocket")
    private List<Item> throwbackRocket;

    @SerializedName("Festivale_balloon_lamp")
    private List<Item> festivaleBalloonLamp;

    @SerializedName("upright_vacuum")
    private List<Item> uprightVacuum;

    @SerializedName("flying_saucer")
    private List<Item> flyingSaucer;

    @SerializedName("mermaid_shelf")
    private List<Item> mermaidShelf;

    @SerializedName("wooden_low_table")
    private List<Item> woodenLowTable;

    @SerializedName("peach_chair")
    private List<Item> peachChair;

    @SerializedName("standard_umbrella_stand")
    private List<Item> standardUmbrellaStand;

    @SerializedName("cotton-candy_stall")
    private List<Item> cottonCandyStall;

    @SerializedName("golf_bag")
    private List<Item> golfBag;

    @SerializedName("Luna's_bed")
    private List<Item> lunaSBed;

    @SerializedName("manhole_cover")
    private List<Item> manholeCover;

    @SerializedName("park_clock")
    private List<Item> parkClock;

    @SerializedName("birdcage")
    private List<Item> birdcage;

    @SerializedName("simple_panel")
    private List<Item> simplePanel;

    @SerializedName("Turkey_Day_garden_stand")
    private List<Item> turkeyDayGardenStand;

    @SerializedName("spooky_standing_lamp")
    private List<Item> spookyStandingLamp;

    @SerializedName("moon")
    private List<Item> moon;

    @SerializedName("palm-tree_lamp")
    private List<Item> palmTreeLamp;

    @SerializedName("monstera")
    private List<Item> monstera;

    @SerializedName("imperial_partition")
    private List<Item> imperialPartition;

    @SerializedName("Festivale_flag")
    private List<Item> festivaleFlag;

    @SerializedName("pile_of_leaves")
    private List<Item> pileOfLeaves;

    @SerializedName("beach_chair")
    private List<Item> beachChair;

    @SerializedName("poolside_bed")
    private List<Item> poolsideBed;

    @SerializedName("ironwood_bed")
    private List<Item> ironwoodBed;

    @SerializedName("illuminated_reindeer")
    private List<Item> illuminatedReindeer;

    @SerializedName("lunar_lander")
    private List<Item> lunarLander;

    @SerializedName("spooky_table")
    private List<Item> spookyTable;

    @SerializedName("Aquarius_urn")
    private List<Item> aquariusUrn;

    @SerializedName("toilet-cleaning_set")
    private List<Item> toiletCleaningSet;

    @SerializedName("wooden-block_bed")
    private List<Item> woodenBlockBed;

    @SerializedName("antique_mini_table")
    private List<Item> antiqueMiniTable;

    @SerializedName("Papa_bear")
    private List<Item> papaBear;

    @SerializedName("fireplace")
    private List<Item> fireplace;

    @SerializedName("crescent-moon_chair")
    private List<Item> crescentMoonChair;

    @SerializedName("standing_toilet")
    private List<Item> standingToilet;

    @SerializedName("cardboard_bed")
    private List<Item> cardboardBed;

    @SerializedName("garden_lantern")
    private List<Item> gardenLantern;

    @SerializedName("imperial_low_table")
    private List<Item> imperialLowTable;

    @SerializedName("squat_toilet")
    private List<Item> squatToilet;

    @SerializedName("Bunny_Day_table")
    private List<Item> bunnyDayTable;

    @SerializedName("mermaid_dresser")
    private List<Item> mermaidDresser;

    @SerializedName("shell_partition")
    private List<Item> shellPartition;

    @SerializedName("golden_toilet")
    private List<Item> goldenToilet;

    @SerializedName("iron_worktable")
    private List<Item> ironWorktable;

    @SerializedName("pirate-treasure_chest")
    private List<Item> pirateTreasureChest;

    @SerializedName("weight_bench")
    private List<Item> weightBench;

    @SerializedName("lunar_rover")
    private List<Item> lunarRover;

    @SerializedName("hammock")
    private List<Item> hammock;

    @SerializedName("cute_tea_table")
    private List<Item> cuteTeaTable;

    @SerializedName("barrel")
    private List<Item> barrel;

    @SerializedName("elephant_slide")
    private List<Item> elephantSlide;

    @SerializedName("fresh_cooler")
    private List<Item> freshCooler;

    @SerializedName("Bunny_Day_festive_balloons")
    private List<Item> bunnyDayFestiveBalloons;

    @SerializedName("champion's_pennant")
    private List<Item> championSPennant;

    @SerializedName("rattan_end_table")
    private List<Item> rattanEndTable;

    @SerializedName("cardboard_sofa")
    private List<Item> cardboardSofa;

    @SerializedName("throwback_race-car_bed")
    private List<Item> throwbackRaceCarBed;

    @SerializedName("Virgo_harp")
    private List<Item> virgoHarp;

    @SerializedName("mermaid_chair")
    private List<Item> mermaidChair;

    @SerializedName("changing_room")
    private List<Item> changingRoom;

    @SerializedName("tricycle")
    private List<Item> tricycle;

    @SerializedName("Festivale_drum")
    private List<Item> festivaleDrum;

    @SerializedName("gas_range")
    private List<Item> gasRange;

    @SerializedName("western-style_stone")
    private List<Item> westernStyleStone;

    @SerializedName("hay_bed")
    private List<Item> hayBed;

    @SerializedName("TV_camera")
    private List<Item> tVCamera;

    @SerializedName("mush_lamp")
    private List<Item> mushLamp;

    @SerializedName("music_stand")
    private List<Item> musicStand;

    @SerializedName("tall_lantern")
    private List<Item> tallLantern;

    @SerializedName("barbell")
    private List<Item> barbell;

    @SerializedName("wooden_double_bed")
    private List<Item> woodenDoubleBed;

    @SerializedName("blue_corner")
    private List<Item> blueCorner;

    @SerializedName("jail_bars")
    private List<Item> jailBars;

    @SerializedName("public_bench")
    private List<Item> publicBench;

    @SerializedName("grand_piano")
    private List<Item> grandPiano;

    @SerializedName("whirlpool_bath")
    private List<Item> whirlpoolBath;

    @SerializedName("colorful_wheel")
    private List<Item> colorfulWheel;

    @SerializedName("tool_shelf")
    private List<Item> toolShelf;

    @SerializedName("tourist_telescope")
    private List<Item> touristTelescope;

    @SerializedName("campfire")
    private List<Item> campfire;

    @SerializedName("wooden_stool")
    private List<Item> woodenStool;

    @SerializedName("kids'_tent")
    private List<Item> kidsTent;

    @SerializedName("school_desk")
    private List<Item> schoolDesk;

    @SerializedName("rattan_bed")
    private List<Item> rattanBed;

    @SerializedName("spooky_arch")
    private List<Item> spookyArch;

    @SerializedName("drink_machine")
    private List<Item> drinkMachine;

    @SerializedName("cypress_bathtub")
    private List<Item> cypressBathtub;

    @SerializedName("iron_closet")
    private List<Item> ironCloset;

    @SerializedName("pirate_barrel")
    private List<Item> pirateBarrel;

    @SerializedName("throwback_hat_table")
    private List<Item> throwbackHatTable;

    @SerializedName("bathroom_sink")
    private List<Item> bathroomSink;

    @SerializedName("hinaningyo")
    private List<Item> hinaningyo;

    @SerializedName("oil_barrel")
    private List<Item> oilBarrel;

    @SerializedName("Mama_panda")
    private List<Item> mamaPanda;

    @SerializedName("clothesline")
    private List<Item> clothesline;

    @SerializedName("safe")
    private List<Item> safe;

    @SerializedName("natural_garden_table")
    private List<Item> naturalGardenTable;

    @SerializedName("frozen_sculpture")
    private List<Item> frozenSculpture;

    @SerializedName("soccer_goal")
    private List<Item> soccerGoal;

    @SerializedName("lighthouse")
    private List<Item> lighthouse;

    @SerializedName("kitty_litter_box")
    private List<Item> kittyLitterBox;

    @SerializedName("ironwood_chair")
    private List<Item> ironwoodChair;

    @SerializedName("wooden-block_table")
    private List<Item> woodenBlockTable;

    @SerializedName("mossy_garden_rock")
    private List<Item> mossyGardenRock;

    @SerializedName("whiteboard")
    private List<Item> whiteboard;

    @SerializedName("asteroid")
    private List<Item> asteroid;

    @SerializedName("golden_seat")
    private List<Item> goldenSeat;

    @SerializedName("hearth")
    private List<Item> hearth;

    @SerializedName("rattan_armchair")
    private List<Item> rattanArmchair;

    @SerializedName("dartboard")
    private List<Item> dartboard;

    @SerializedName("climbing_wall")
    private List<Item> climbingWall;

    @SerializedName("cute_DIY_table")
    private List<Item> cuteDIYTable;

    @SerializedName("folding_chair")
    private List<Item> foldingChair;

    @SerializedName("stone_stool")
    private List<Item> stoneStool;

    @SerializedName("grand_Q._A._birdwing_model")
    private List<Item> grandQABirdwingModel;

    @SerializedName("wooden_bucket")
    private List<Item> woodenBucket;

    @SerializedName("Goal_Pole")
    private List<Item> goalPole;

    @SerializedName("bamboo_partition")
    private List<Item> bambooPartition;

    @SerializedName("office_desk")
    private List<Item> officeDesk;

    @SerializedName("crewed_spaceship")
    private List<Item> crewedSpaceship;

    @SerializedName("DIY_workbench")
    private List<Item> dIYWorkbench;

    @SerializedName("termite_mound")
    private List<Item> termiteMound;

    @SerializedName("frozen_table")
    private List<Item> frozenTable;

    @SerializedName("iron_garden_table")
    private List<Item> ironGardenTable;

    @SerializedName("go_board")
    private List<Item> goBoard;

    @SerializedName("apple_chair")
    private List<Item> appleChair;

    @SerializedName("diner_counter_chair")
    private List<Item> dinerCounterChair;

    @SerializedName("utility_sink")
    private List<Item> utilitySink;

    @SerializedName("futon")
    private List<Item> futon;

    @SerializedName("wood-burning_stove")
    private List<Item> woodBurningStove;

    @SerializedName("antique_bed")
    private List<Item> antiqueBed;

    @SerializedName("spooky_tower")
    private List<Item> spookyTower;

    @SerializedName("tree's_bounty_big_tree")
    private List<Item> treeSBountyBigTree;

    @SerializedName("garbage_can")
    private List<Item> garbageCan;

    @SerializedName("bidet")
    private List<Item> bidet;

    @SerializedName("construction_sign")
    private List<Item> constructionSign;

    @SerializedName("flashy-flower_sign")
    private List<Item> flashyFlowerSign;

    public List<Item> getSleigh() {
        return sleigh;
    }

    public List<Item> getArtisanalBugCage() {
        return artisanalBugCage;
    }

    public List<Item> getDrumSet() {
        return drumSet;
    }

    public List<Item> getElectricKickScooter() {
        return electricKickScooter;
    }

    public List<Item> getPapaPanda() {
        return papaPanda;
    }

    public List<Item> getKitchenIsland() {
        return kitchenIsland;
    }

    public List<Item> getMermaidCloset() {
        return mermaidCloset;
    }

    public List<Item> getLargeMushroomPlatform() {
        return largeMushroomPlatform;
    }

    public List<Item> getHandcart() {
        return handcart;
    }

    public List<Item> getAnatomicalModel() {
        return anatomicalModel;
    }

    public List<Item> getBunnyDayMerryBalloons() {
        return bunnyDayMerryBalloons;
    }

    public List<Item> getRattanStool() {
        return rattanStool;
    }

    public List<Item> getTeaTable() {
        return teaTable;
    }

    public List<Item> getImperialDiningTable() {
        return imperialDiningTable;
    }

    public List<Item> getDrinkingFountain() {
        return drinkingFountain;
    }

    public List<Item> getOutdoorAirConditioner() {
        return outdoorAirConditioner;
    }

    public List<Item> getSpinningWheel() {
        return spinningWheel;
    }

    public List<Item> getMediumCardboardBoxes() {
        return mediumCardboardBoxes;
    }

    public List<Item> getBambooShelf() {
        return bambooShelf;
    }

    public List<Item> getMushPartition() {
        return mushPartition;
    }

    public List<Item> getPool() {
        return pool;
    }

    public List<Item> getMermaidScreen() {
        return mermaidScreen;
    }

    public List<Item> getStonehenge() {
        return stonehenge;
    }

    public List<Item> getSimpleDIYWorkbench() {
        return simpleDIYWorkbench;
    }

    public List<Item> getBoxSofa() {
        return boxSofa;
    }

    public List<Item> getBambooGrass() {
        return bambooGrass;
    }

    public List<Item> getOutdoorGenerator() {
        return outdoorGenerator;
    }

    public List<Item> getToyDaySleigh() {
        return toyDaySleigh;
    }

    public List<Item> getImperialDiningChair() {
        return imperialDiningChair;
    }

    public List<Item> getMushLog() {
        return mushLog;
    }

    public List<Item> getFestiveTree() {
        return festiveTree;
    }

    public List<Item> getZenStyleStone() {
        return zenStyleStone;
    }

    public List<Item> getTanklessToilet() {
        return tanklessToilet;
    }

    public List<Item> getLoftBedWithDesk() {
        return loftBedWithDesk;
    }

    public List<Item> getTrainSet() {
        return trainSet;
    }

    public List<Item> getMermaidLamp() {
        return mermaidLamp;
    }

    public List<Item> getAltoSaxophone() {
        return altoSaxophone;
    }

    public List<Item> getCypressPlant() {
        return cypressPlant;
    }

    public List<Item> getIronwoodCart() {
        return ironwoodCart;
    }

    public List<Item> getTennisTable() {
        return tennisTable;
    }

    public List<Item> getImperialChest() {
        return imperialChest;
    }

    public List<Item> getStreetlamp() {
        return streetlamp;
    }

    public List<Item> getAstronautSuit() {
        return astronautSuit;
    }

    public List<Item> getWoodenBookshelf() {
        return woodenBookshelf;
    }

    public List<Item> getYellowLeafPile() {
        return yellowLeafPile;
    }

    public List<Item> getLogExtraLongSofa() {
        return logExtraLongSofa;
    }

    public List<Item> getSimpleWell() {
        return simpleWell;
    }

    public List<Item> getBlossomViewingLantern() {
        return blossomViewingLantern;
    }

    public List<Item> getDoubleSofa() {
        return doubleSofa;
    }

    public List<Item> getFrozenArch() {
        return frozenArch;
    }

    public List<Item> getMushParasol() {
        return mushParasol;
    }

    public List<Item> getDinerDiningTable() {
        return dinerDiningTable;
    }

    public List<Item> getGarbagePail() {
        return garbagePail;
    }

    public List<Item> getWoodenWasteBin() {
        return woodenWasteBin;
    }

    public List<Item> getCuteBed() {
        return cuteBed;
    }

    public List<Item> getArcadeCombatGame() {
        return arcadeCombatGame;
    }

    public List<Item> getBasketballHoop() {
        return basketballHoop;
    }

    public List<Item> getWoodenBlockBench() {
        return woodenBlockBench;
    }

    public List<Item> getAcousticGuitar() {
        return acousticGuitar;
    }

    public List<Item> getDenDesk() {
        return denDesk;
    }

    public List<Item> getLargeCardboardBoxes() {
        return largeCardboardBoxes;
    }

    public List<Item> getClothesCloset() {
        return clothesCloset;
    }

    public List<Item> getArcadeFightingGame() {
        return arcadeFightingGame;
    }

    public List<Item> getPiscesLamp() {
        return piscesLamp;
    }

    public List<Item> getAngledSignpost() {
        return angledSignpost;
    }

    public List<Item> getPagoda() {
        return pagoda;
    }

    public List<Item> getRoundSpaceHeater() {
        return roundSpaceHeater;
    }

    public List<Item> getWaterPump() {
        return waterPump;
    }

    public List<Item> getRattanVanity() {
        return rattanVanity;
    }

    public List<Item> getRockingHorse() {
        return rockingHorse;
    }

    public List<Item> getWeddingWelcomeBoard() {
        return weddingWelcomeBoard;
    }

    public List<Item> getTreadmill() {
        return treadmill;
    }

    public List<Item> getVideoCamera() {
        return videoCamera;
    }

    public List<Item> getStoneTable() {
        return stoneTable;
    }

    public List<Item> getCherryBlossomPondStone() {
        return cherryBlossomPondStone;
    }

    public List<Item> getBunnyDayStool() {
        return bunnyDayStool;
    }

    public List<Item> getGong() {
        return gong;
    }

    public List<Item> getSkeleton() {
        return skeleton;
    }

    public List<Item> getMountainBike() {
        return mountainBike;
    }

    public List<Item> getBunnyDayWardrobe() {
        return bunnyDayWardrobe;
    }

    public List<Item> getFrozenCounter() {
        return frozenCounter;
    }

    public List<Item> getShellTable() {
        return shellTable;
    }

    public List<Item> getStoneArch() {
        return stoneArch;
    }

    public List<Item> getWaterCooler() {
        return waterCooler;
    }

    public List<Item> getStadiometer() {
        return stadiometer;
    }

    public List<Item> getTulipSurpriseBox() {
        return tulipSurpriseBox;
    }

    public List<Item> getIronwoodCupboard() {
        return ironwoodCupboard;
    }

    public List<Item> getBambooFloorLamp() {
        return bambooFloorLamp;
    }

    public List<Item> getClackercart() {
        return clackercart;
    }

    public List<Item> getSleepingBag() {
        return sleepingBag;
    }

    public List<Item> getUprightPiano() {
        return uprightPiano;
    }

    public List<Item> getFreezer() {
        return freezer;
    }

    public List<Item> getSolarPanel() {
        return solarPanel;
    }

    public List<Item> getTireToy() {
        return tireToy;
    }

    public List<Item> getBonfire() {
        return bonfire;
    }

    public List<Item> getPansyTable() {
        return pansyTable;
    }

    public List<Item> getRefrigerator() {
        return refrigerator;
    }

    public List<Item> getDoubleDoorRefrigerator() {
        return doubleDoorRefrigerator;
    }

    public List<Item> getPondStone() {
        return pondStone;
    }

    public List<Item> getBunnyDayVanity() {
        return bunnyDayVanity;
    }

    public List<Item> getGrassStandee() {
        return grassStandee;
    }

    public List<Item> getSynthesizer() {
        return synthesizer;
    }

    public List<Item> getWoodenEndTable() {
        return woodenEndTable;
    }

    public List<Item> getGrandAtlasMothModel() {
        return grandAtlasMothModel;
    }

    public List<Item> getMarimba() {
        return marimba;
    }

    public List<Item> getFanPalm() {
        return fanPalm;
    }

    public List<Item> getHarp() {
        return harp;
    }

    public List<Item> getTikiTorch() {
        return tikiTorch;
    }

    public List<Item> getFrozenBed() {
        return frozenBed;
    }

    public List<Item> getAntiqueChair() {
        return antiqueChair;
    }

    public List<Item> getImperialBed() {
        return imperialBed;
    }

    public List<Item> getBabyChair() {
        return babyChair;
    }

    public List<Item> getCapricornOrnament() {
        return capricornOrnament;
    }

    public List<Item> getUtilityPole() {
        return utilityPole;
    }

    public List<Item> getScarecrow() {
        return scarecrow;
    }

    public List<Item> getFrozenPartition() {
        return frozenPartition;
    }

    public List<Item> getJuicyAppleTV() {
        return juicyAppleTV;
    }

    public List<Item> getWeddingArch() {
        return weddingArch;
    }

    public List<Item> getShowerBooth() {
        return showerBooth;
    }

    public List<Item> getFestivaleGarland() {
        return festivaleGarland;
    }

    public List<Item> getMiniDIYWorkbench() {
        return miniDIYWorkbench;
    }

    public List<Item> getRockingChair() {
        return rockingChair;
    }

    public List<Item> getMiniFridge() {
        return miniFridge;
    }

    public List<Item> getFishDryingRack() {
        return fishDryingRack;
    }

    public List<Item> getIlluminatedPresent() {
        return illuminatedPresent;
    }

    public List<Item> getSatellite() {
        return satellite;
    }

    public List<Item> getCherryBlossomPetalPile() {
        return cherryBlossomPetalPile;
    }

    public List<Item> getGardenWagon() {
        return gardenWagon;
    }

    public List<Item> getAnchorStatue() {
        return anchorStatue;
    }

    public List<Item> getGiftPile() {
        return giftPile;
    }

    public List<Item> getBilliardTable() {
        return billiardTable;
    }

    public List<Item> getPirateShipHelm() {
        return pirateShipHelm;
    }

    public List<Item> getHiFiStereo() {
        return hiFiStereo;
    }

    public List<Item> getDinerMiniTable() {
        return dinerMiniTable;
    }

    public List<Item> getSphinx() {
        return sphinx;
    }

    public List<Item> getStudyDesk() {
        return studyDesk;
    }

    public List<Item> getRodeoStyleSpringyRideOn() {
        return rodeoStyleSpringyRideOn;
    }

    public List<Item> getAntiqueTable() {
        return antiqueTable;
    }

    public List<Item> getDestinationsSignpost() {
        return destinationsSignpost;
    }

    public List<Item> getPyramid() {
        return pyramid;
    }

    public List<Item> getPearBed() {
        return pearBed;
    }

    public List<Item> getVelvetStool() {
        return velvetStool;
    }

    public List<Item> getFountain() {
        return fountain;
    }

    public List<Item> getFishingRodStand() {
        return fishingRodStand;
    }

    public List<Item> getCherryBlossomBranches() {
        return cherryBlossomBranches;
    }

    public List<Item> getBambooBasket() {
        return bambooBasket;
    }

    public List<Item> getBrickOven() {
        return brickOven;
    }

    public List<Item> getBrickWell() {
        return brickWell;
    }

    public List<Item> getWeddingPipeOrgan() {
        return weddingPipeOrgan;
    }

    public List<Item> getGiantTeddyBear() {
        return giantTeddyBear;
    }

    public List<Item> getTatamiBed() {
        return tatamiBed;
    }

    public List<Item> getElaborateKimonoStand() {
        return elaborateKimonoStand;
    }

    public List<Item> getPantsPress() {
        return pantsPress;
    }

    public List<Item> getRocketLamp() {
        return rocketLamp;
    }

    public List<Item> getBlock() {
        return block;
    }

    public List<Item> getIronFrame() {
        return ironFrame;
    }

    public List<Item> getWeddingChair() {
        return weddingChair;
    }

    public List<Item> getCacaoTree() {
        return cacaoTree;
    }

    public List<Item> getDJSTurntable() {
        return dJSTurntable;
    }

    public List<Item> getStall() {
        return stall;
    }

    public List<Item> getDenChair() {
        return denChair;
    }

    public List<Item> getFlatGardenRock() {
        return flatGardenRock;
    }

    public List<Item> getIronwoodTable() {
        return ironwoodTable;
    }

    public List<Item> getWoodenBlockChest() {
        return woodenBlockChest;
    }

    public List<Item> getJsonMember2021CelebratoryArch() {
        return jsonMember2021CelebratoryArch;
    }

    public List<Item> getSpookyLanternSet() {
        return spookyLanternSet;
    }

    public List<Item> getCuteVanity() {
        return cuteVanity;
    }

    public List<Item> getPodium() {
        return podium;
    }

    public List<Item> getRattanWasteBin() {
        return rattanWasteBin;
    }

    public List<Item> getIronShelf() {
        return ironShelf;
    }

    public List<Item> getThrowbackDinoScreen() {
        return throwbackDinoScreen;
    }

    public List<Item> getElectricGuitar() {
        return electricGuitar;
    }

    public List<Item> getSoftServeLamp() {
        return softServeLamp;
    }

    public List<Item> getRetroStereo() {
        return retroStereo;
    }

    public List<Item> getServer() {
        return server;
    }

    public List<Item> getLilyRecordPlayer() {
        return lilyRecordPlayer;
    }

    public List<Item> getFestivaleStall() {
        return festivaleStall;
    }

    public List<Item> getBunnyDayArch() {
        return bunnyDayArch;
    }

    public List<Item> getSignpost() {
        return signpost;
    }

    public List<Item> getGrandBDragonflyModel() {
        return grandBDragonflyModel;
    }

    public List<Item> getAntiqueVanity() {
        return antiqueVanity;
    }

    public List<Item> getShadedFloorLamp() {
        return shadedFloorLamp;
    }

    public List<Item> getSpringyRideOn() {
        return springyRideOn;
    }

    public List<Item> getMountainStandee() {
        return mountainStandee;
    }

    public List<Item> getPaperLantern() {
        return paperLantern;
    }

    public List<Item> getKotatsu() {
        return kotatsu;
    }

    public List<Item> getBarbecue() {
        return barbecue;
    }

    public List<Item> getBunnyDayBed() {
        return bunnyDayBed;
    }

    public List<Item> getVintageTVTray() {
        return vintageTVTray;
    }

    public List<Item> getSidewaysPirateBarrel() {
        return sidewaysPirateBarrel;
    }

    public List<Item> getBambooBench() {
        return bambooBench;
    }

    public List<Item> getLifeguardChair() {
        return lifeguardChair;
    }

    public List<Item> getLogBed() {
        return logBed;
    }

    public List<Item> getPileOfZenCushions() {
        return pileOfZenCushions;
    }

    public List<Item> getRobotHero() {
        return robotHero;
    }

    public List<Item> getMushLowStool() {
        return mushLowStool;
    }

    public List<Item> getGardenRock() {
        return gardenRock;
    }

    public List<Item> getFoosballTable() {
        return foosballTable;
    }

    public List<Item> getWoodenWardrobe() {
        return woodenWardrobe;
    }

    public List<Item> getHedgeStandee() {
        return hedgeStandee;
    }

    public List<Item> getEffectsRack() {
        return effectsRack;
    }

    public List<Item> getTaurusBathtub() {
        return taurusBathtub;
    }

    public List<Item> getMermaidTable() {
        return mermaidTable;
    }

    public List<Item> getChalkboard() {
        return chalkboard;
    }

    public List<Item> getRCHelicopter() {
        return rCHelicopter;
    }

    public List<Item> getPullUpBarStand() {
        return pullUpBarStand;
    }

    public List<Item> getOKMotorsSign() {
        return oKMotorsSign;
    }

    public List<Item> getAutomaticWasher() {
        return automaticWasher;
    }

    public List<Item> getDinerCounterTable() {
        return dinerCounterTable;
    }

    public List<Item> getRoseBed() {
        return roseBed;
    }

    public List<Item> getMermaidSofa() {
        return mermaidSofa;
    }

    public List<Item> getScreen() {
        return screen;
    }

    public List<Item> getThreeTieredSnowperson() {
        return threeTieredSnowperson;
    }

    public List<Item> getDinerSofa() {
        return dinerSofa;
    }

    public List<Item> getElectricBass() {
        return electricBass;
    }

    public List<Item> getTableWithCloth() {
        return tableWithCloth;
    }

    public List<Item> getMenuChalkboard() {
        return menuChalkboard;
    }

    public List<Item> getIronGardenChair() {
        return ironGardenChair;
    }

    public List<Item> getMapleLeafPondStone() {
        return mapleLeafPondStone;
    }

    public List<Item> getRedCorner() {
        return redCorner;
    }

    public List<Item> getPipe() {
        return pipe;
    }

    public List<Item> getIronwoodKitchenette() {
        return ironwoodKitchenette;
    }

    public List<Item> getAntiqueClock() {
        return antiqueClock;
    }

    public List<Item> getCuteFloorLamp() {
        return cuteFloorLamp;
    }

    public List<Item> getOutdoorBath() {
        return outdoorBath;
    }

    public List<Item> getCuteChair() {
        return cuteChair;
    }

    public List<Item> getOutdoorPicnicSet() {
        return outdoorPicnicSet;
    }

    public List<Item> getNaturalGardenChair() {
        return naturalGardenChair;
    }

    public List<Item> getNaturalSquareTable() {
        return naturalSquareTable;
    }

    public List<Item> getOpenFrameKitchen() {
        return openFrameKitchen;
    }

    public List<Item> getFestivaleParasol() {
        return festivaleParasol;
    }

    public List<Item> getThrowbackMittChair() {
        return throwbackMittChair;
    }

    public List<Item> getClawFootTub() {
        return clawFootTub;
    }

    public List<Item> getWoodenFullLengthMirror() {
        return woodenFullLengthMirror;
    }

    public List<Item> getWoodenSimpleBed() {
        return woodenSimpleBed;
    }

    public List<Item> getMarketPlaceDecoration() {
        return marketPlaceDecoration;
    }

    public List<Item> getSouthPole() {
        return southPole;
    }

    public List<Item> getYucca() {
        return yucca;
    }

    public List<Item> getClayFurnace() {
        return clayFurnace;
    }

    public List<Item> getWoodenMiniTable() {
        return woodenMiniTable;
    }

    public List<Item> getRockGuitar() {
        return rockGuitar;
    }

    public List<Item> getPlasticPool() {
        return plasticPool;
    }

    public List<Item> getAriesRockingChair() {
        return ariesRockingChair;
    }

    public List<Item> getSaunaHeater() {
        return saunaHeater;
    }

    public List<Item> getIlluminatedSnowflakes() {
        return illuminatedSnowflakes;
    }

    public List<Item> getGoldenCasket() {
        return goldenCasket;
    }

    public List<Item> getSnackMachine() {
        return snackMachine;
    }

    public List<Item> getServingCart() {
        return servingCart;
    }

    public List<Item> getCampfireCookware() {
        return campfireCookware;
    }

    public List<Item> getIronHangerStand() {
        return ironHangerStand;
    }

    public List<Item> getParabolicAntenna() {
        return parabolicAntenna;
    }

    public List<Item> getPhoneBox() {
        return phoneBox;
    }

    public List<Item> getFloatingBlock() {
        return floatingBlock;
    }

    public List<Item> getFoldingFloorLamp() {
        return foldingFloorLamp;
    }

    public List<Item> getSpookyCarriage() {
        return spookyCarriage;
    }

    public List<Item> getPianoBench() {
        return pianoBench;
    }

    public List<Item> getOilBarrelBathtub() {
        return oilBarrelBathtub;
    }

    public List<Item> getDeerScare() {
        return deerScare;
    }

    public List<Item> getAntiqueWardrobe() {
        return antiqueWardrobe;
    }

    public List<Item> getBeachTowel() {
        return beachTowel;
    }

    public List<Item> getTreeSBountyArch() {
        return treeSBountyArch;
    }

    public List<Item> getShellStool() {
        return shellStool;
    }

    public List<Item> getZenCushion() {
        return zenCushion;
    }

    public List<Item> getFestivaleStage() {
        return festivaleStage;
    }

    public List<Item> getSandbox() {
        return sandbox;
    }

    public List<Item> getLogChair() {
        return logChair;
    }

    public List<Item> getSpookyScarecrow() {
        return spookyScarecrow;
    }

    public List<Item> getLogStakes() {
        return logStakes;
    }

    public List<Item> getTireStack() {
        return tireStack;
    }

    public List<Item> getMushTable() {
        return mushTable;
    }

    public List<Item> getStoneTablet() {
        return stoneTablet;
    }

    public List<Item> getWoodenBlockChair() {
        return woodenBlockChair;
    }

    public List<Item> getWoodenBlockBookshelf() {
        return woodenBlockBookshelf;
    }

    public List<Item> getCampingCot() {
        return campingCot;
    }

    public List<Item> getDirectorSChair() {
        return directorSChair;
    }

    public List<Item> getMicStand() {
        return micStand;
    }

    public List<Item> getMonsterStatue() {
        return monsterStatue;
    }

    public List<Item> getBirdbath() {
        return birdbath;
    }

    public List<Item> getOutdoorBench() {
        return outdoorBench;
    }

    public List<Item> getFrozenChair() {
        return frozenChair;
    }

    public List<Item> getRattanLowTable() {
        return rattanLowTable;
    }

    public List<Item> getMermaidBed() {
        return mermaidBed;
    }

    public List<Item> getTurkeyDayTable() {
        return turkeyDayTable;
    }

    public List<Item> getRetroGasPump() {
        return retroGasPump;
    }

    public List<Item> getIronwoodDIYWorkbench() {
        return ironwoodDIYWorkbench;
    }

    public List<Item> getRocket() {
        return rocket;
    }

    public List<Item> getSwingingBench() {
        return swingingBench;
    }

    public List<Item> getArcadeSeat() {
        return arcadeSeat;
    }

    public List<Item> getIronGardenBench() {
        return ironGardenBench;
    }

    public List<Item> getFloorLight() {
        return floorLight;
    }

    public List<Item> getTeacupRide() {
        return teacupRide;
    }

    public List<Item> getCuteSofa() {
        return cuteSofa;
    }

    public List<Item> getKettleBathtub() {
        return kettleBathtub;
    }

    public List<Item> getSpeedBag() {
        return speedBag;
    }

    public List<Item> getBeekeeperSHive() {
        return beekeeperSHive;
    }

    public List<Item> getAirCirculator() {
        return airCirculator;
    }

    public List<Item> getCuteWardrobe() {
        return cuteWardrobe;
    }

    public List<Item> getDinerNeonSign() {
        return dinerNeonSign;
    }

    public List<Item> getDoghouse() {
        return doghouse;
    }

    public List<Item> getGardenFaucet() {
        return gardenFaucet;
    }

    public List<Item> getLowScreen() {
        return lowScreen;
    }

    public List<Item> getDigitalScale() {
        return digitalScale;
    }

    public List<Item> getHighEndStereo() {
        return highEndStereo;
    }

    public List<Item> getBunkBed() {
        return bunkBed;
    }

    public List<Item> getPlainWoodenShopSign() {
        return plainWoodenShopSign;
    }

    public List<Item> getFortuneCookieCart() {
        return fortuneCookieCart;
    }

    public List<Item> getRedLeafPile() {
        return redLeafPile;
    }

    public List<Item> getTrophyCase() {
        return trophyCase;
    }

    public List<Item> getBirthdaySign() {
        return birthdaySign;
    }

    public List<Item> getWindTurbine() {
        return windTurbine;
    }

    public List<Item> getToilet() {
        return toilet;
    }

    public List<Item> getSystemKitchen() {
        return systemKitchen;
    }

    public List<Item> getIroningBoard() {
        return ironingBoard;
    }

    public List<Item> getTelescope() {
        return telescope;
    }

    public List<Item> getTurkeyDayChair() {
        return turkeyDayChair;
    }

    public List<Item> getCosmosShower() {
        return cosmosShower;
    }

    public List<Item> getIlluminatedTree() {
        return illuminatedTree;
    }

    public List<Item> getMumCushion() {
        return mumCushion;
    }

    public List<Item> getSpaceShuttle() {
        return spaceShuttle;
    }

    public List<Item> getVacuumCleaner() {
        return vacuumCleaner;
    }

    public List<Item> getRaccoonFigurine() {
        return raccoonFigurine;
    }

    public List<Item> getSurfboard() {
        return surfboard;
    }

    public List<Item> getIronwoodDresser() {
        return ironwoodDresser;
    }

    public List<Item> getThwomp() {
        return thwomp;
    }

    public List<Item> getArcadeMahjongGame() {
        return arcadeMahjongGame;
    }

    public List<Item> getToolCart() {
        return toolCart;
    }

    public List<Item> getWeddingFlowerStand() {
        return weddingFlowerStand;
    }

    public List<Item> getWoodenChest() {
        return woodenChest;
    }

    public List<Item> getBirthdayTable() {
        return birthdayTable;
    }

    public List<Item> getScatteredPapers() {
        return scatteredPapers;
    }

    public List<Item> getBrakeTapper() {
        return brakeTapper;
    }

    public List<Item> getGreenLeafPile() {
        return greenLeafPile;
    }

    public List<Item> getCancerTable() {
        return cancerTable;
    }

    public List<Item> getFestivaleFloat() {
        return festivaleFloat;
    }

    public List<Item> getPortableToilet() {
        return portableToilet;
    }

    public List<Item> getLawnMower() {
        return lawnMower;
    }

    public List<Item> getMrsFlamingo() {
        return mrsFlamingo;
    }

    public List<Item> getRattanWardrobe() {
        return rattanWardrobe;
    }

    public List<Item> getDryingRack() {
        return dryingRack;
    }

    public List<Item> getKimonoStand() {
        return kimonoStand;
    }

    public List<Item> getIronwoodLowTable() {
        return ironwoodLowTable;
    }

    public List<Item> getCandyMachine() {
        return candyMachine;
    }

    public List<Item> getWoodenBlockStereo() {
        return woodenBlockStereo;
    }

    public List<Item> getFrozenPillar() {
        return frozenPillar;
    }

    public List<Item> getSilo() {
        return silo;
    }

    public List<Item> getStreetOrgan() {
        return streetOrgan;
    }

    public List<Item> getKadomatsu() {
        return kadomatsu;
    }

    public List<Item> getShellArch() {
        return shellArch;
    }

    public List<Item> getWildLogBench() {
        return wildLogBench;
    }

    public List<Item> getFirePit() {
        return firePit;
    }

    public List<Item> getSchoolChair() {
        return schoolChair;
    }

    public List<Item> getOceanSunfishModel() {
        return oceanSunfishModel;
    }

    public List<Item> getPunchingBag() {
        return punchingBag;
    }

    public List<Item> getShellBed() {
        return shellBed;
    }

    public List<Item> getRetroFan() {
        return retroFan;
    }

    public List<Item> getWoodenChair() {
        return woodenChair;
    }

    public List<Item> getLogDiningTable() {
        return logDiningTable;
    }

    public List<Item> getBasicTeacherSDesk() {
        return basicTeacherSDesk;
    }

    public List<Item> getLawnChair() {
        return lawnChair;
    }

    public List<Item> getSmoker() {
        return smoker;
    }

    public List<Item> getGeminiCloset() {
        return geminiCloset;
    }

    public List<Item> getLoom() {
        return loom;
    }

    public List<Item> getLongBathtub() {
        return longBathtub;
    }

    public List<Item> getMamaBear() {
        return mamaBear;
    }

    public List<Item> getPinballMachine() {
        return pinballMachine;
    }

    public List<Item> getMrFlamingo() {
        return mrFlamingo;
    }

    public List<Item> getTreeStandee() {
        return treeStandee;
    }

    public List<Item> getWeddingHeadTable() {
        return weddingHeadTable;
    }

    public List<Item> getBoxCornerSofa() {
        return boxCornerSofa;
    }

    public List<Item> getGardenBench() {
        return gardenBench;
    }

    public List<Item> getLeafCampfire() {
        return leafCampfire;
    }

    public List<Item> getLectureHallBench() {
        return lectureHallBench;
    }

    public List<Item> getTowerOfPisa() {
        return towerOfPisa;
    }

    public List<Item> getBirdhouse() {
        return birdhouse;
    }

    public List<Item> getLogBench() {
        return logBench;
    }

    public List<Item> getOldSewingMachine() {
        return oldSewingMachine;
    }

    public List<Item> getPearWardrobe() {
        return pearWardrobe;
    }

    public List<Item> getWoodenTable() {
        return woodenTable;
    }

    public List<Item> getHoseReel() {
        return hoseReel;
    }

    public List<Item> getFloorLamp() {
        return floorLamp;
    }

    public List<Item> getWaveBreaker() {
        return waveBreaker;
    }

    public List<Item> getBambooSpeaker() {
        return bambooSpeaker;
    }

    public List<Item> getWeddingBench() {
        return weddingBench;
    }

    public List<Item> getCatTower() {
        return catTower;
    }

    public List<Item> getPopcornMachine() {
        return popcornMachine;
    }

    public List<Item> getUprightLocker() {
        return uprightLocker;
    }

    public List<Item> getSmallCardboardBoxes() {
        return smallCardboardBoxes;
    }

    public List<Item> getWoodenBlockStool() {
        return woodenBlockStool;
    }

    public List<Item> getBambooStool() {
        return bambooStool;
    }

    public List<Item> getSpookyChair() {
        return spookyChair;
    }

    public List<Item> getWheelchair() {
        return wheelchair;
    }

    public List<Item> getGarbageBin() {
        return garbageBin;
    }

    public List<Item> getPetBed() {
        return petBed;
    }

    public List<Item> getDinerChair() {
        return dinerChair;
    }

    public List<Item> getMoaiStatue() {
        return moaiStatue;
    }

    public List<Item> getJukebox() {
        return jukebox;
    }

    public List<Item> getFloorSeat() {
        return floorSeat;
    }

    public List<Item> getSandCastle() {
        return sandCastle;
    }

    public List<Item> getPlaygroundGym() {
        return playgroundGym;
    }

    public List<Item> getTurkeyDayHearth() {
        return turkeyDayHearth;
    }

    public List<Item> getStreetPiano() {
        return streetPiano;
    }

    public List<Item> getLogRoundTable() {
        return logRoundTable;
    }

    public List<Item> getTinyLibrary() {
        return tinyLibrary;
    }

    public List<Item> getLeafStool() {
        return leafStool;
    }

    public List<Item> getModernOfficeChair() {
        return modernOfficeChair;
    }

    public List<Item> getStudioSpotlight() {
        return studioSpotlight;
    }

    public List<Item> getTallGardenRock() {
        return tallGardenRock;
    }

    public List<Item> getDeluxeWasher() {
        return deluxeWasher;
    }

    public List<Item> getAntiqueBureau() {
        return antiqueBureau;
    }

    public List<Item> getExerciseBall() {
        return exerciseBall;
    }

    public List<Item> getStatueOfLiberty() {
        return statueOfLiberty;
    }

    public List<Item> getLogDecorativeShelves() {
        return logDecorativeShelves;
    }

    public List<Item> getCampsiteSign() {
        return campsiteSign;
    }

    public List<Item> getShellFountain() {
        return shellFountain;
    }

    public List<Item> getBambooDoll() {
        return bambooDoll;
    }

    public List<Item> getAntiqueConsoleTable() {
        return antiqueConsoleTable;
    }

    public List<Item> getMermaidVanity() {
        return mermaidVanity;
    }

    public List<Item> getSmallMushroomPlatform() {
        return smallMushroomPlatform;
    }

    public List<Item> getCello() {
        return cello;
    }

    public List<Item> getNeutralCorner() {
        return neutralCorner;
    }

    public List<Item> getSilverMic() {
        return silverMic;
    }

    public List<Item> getCardboardTable() {
        return cardboardTable;
    }

    public List<Item> getCardboardChair() {
        return cardboardChair;
    }

    public List<Item> getUnknownBlock() {
        return unknownBlock;
    }

    public List<Item> getLectureHallDesk() {
        return lectureHallDesk;
    }

    public List<Item> getBonsaiShelf() {
        return bonsaiShelf;
    }

    public List<Item> getPirateShipCannon() {
        return pirateShipCannon;
    }

    public List<Item> getButterChurn() {
        return butterChurn;
    }

    public List<Item> getStoneLionDog() {
        return stoneLionDog;
    }

    public List<Item> getOrangeEndTable() {
        return orangeEndTable;
    }

    public List<Item> getWeddingTable() {
        return weddingTable;
    }

    public List<Item> getBambooNoodleSlide() {
        return bambooNoodleSlide;
    }

    public List<Item> getClotheslinePole() {
        return clotheslinePole;
    }

    public List<Item> getCone() {
        return cone;
    }

    public List<Item> getPlainSink() {
        return plainSink;
    }

    public List<Item> getExerciseBike() {
        return exerciseBike;
    }

    public List<Item> getFan() {
        return fan;
    }

    public List<Item> getInflatableSofa() {
        return inflatableSofa;
    }

    public List<Item> getBambooStopblock() {
        return bambooStopblock;
    }

    public List<Item> getLogGardenLounge() {
        return logGardenLounge;
    }

    public List<Item> getFrozenTree() {
        return frozenTree;
    }

    public List<Item> getOutdoorTable() {
        return outdoorTable;
    }

    public List<Item> getLogStool() {
        return logStool;
    }

    public List<Item> getBigFestiveTree() {
        return bigFestiveTree;
    }

    public List<Item> getFlowerStand() {
        return flowerStand;
    }

    public List<Item> getStudyChair() {
        return studyChair;
    }

    public List<Item> getThrowbackRocket() {
        return throwbackRocket;
    }

    public List<Item> getFestivaleBalloonLamp() {
        return festivaleBalloonLamp;
    }

    public List<Item> getUprightVacuum() {
        return uprightVacuum;
    }

    public List<Item> getFlyingSaucer() {
        return flyingSaucer;
    }

    public List<Item> getMermaidShelf() {
        return mermaidShelf;
    }

    public List<Item> getWoodenLowTable() {
        return woodenLowTable;
    }

    public List<Item> getPeachChair() {
        return peachChair;
    }

    public List<Item> getStandardUmbrellaStand() {
        return standardUmbrellaStand;
    }

    public List<Item> getCottonCandyStall() {
        return cottonCandyStall;
    }

    public List<Item> getGolfBag() {
        return golfBag;
    }

    public List<Item> getLunaSBed() {
        return lunaSBed;
    }

    public List<Item> getManholeCover() {
        return manholeCover;
    }

    public List<Item> getParkClock() {
        return parkClock;
    }

    public List<Item> getBirdcage() {
        return birdcage;
    }

    public List<Item> getSimplePanel() {
        return simplePanel;
    }

    public List<Item> getTurkeyDayGardenStand() {
        return turkeyDayGardenStand;
    }

    public List<Item> getSpookyStandingLamp() {
        return spookyStandingLamp;
    }

    public List<Item> getMoon() {
        return moon;
    }

    public List<Item> getPalmTreeLamp() {
        return palmTreeLamp;
    }

    public List<Item> getMonstera() {
        return monstera;
    }

    public List<Item> getImperialPartition() {
        return imperialPartition;
    }

    public List<Item> getFestivaleFlag() {
        return festivaleFlag;
    }

    public List<Item> getPileOfLeaves() {
        return pileOfLeaves;
    }

    public List<Item> getBeachChair() {
        return beachChair;
    }

    public List<Item> getPoolsideBed() {
        return poolsideBed;
    }

    public List<Item> getIronwoodBed() {
        return ironwoodBed;
    }

    public List<Item> getIlluminatedReindeer() {
        return illuminatedReindeer;
    }

    public List<Item> getLunarLander() {
        return lunarLander;
    }

    public List<Item> getSpookyTable() {
        return spookyTable;
    }

    public List<Item> getAquariusUrn() {
        return aquariusUrn;
    }

    public List<Item> getToiletCleaningSet() {
        return toiletCleaningSet;
    }

    public List<Item> getWoodenBlockBed() {
        return woodenBlockBed;
    }

    public List<Item> getAntiqueMiniTable() {
        return antiqueMiniTable;
    }

    public List<Item> getPapaBear() {
        return papaBear;
    }

    public List<Item> getFireplace() {
        return fireplace;
    }

    public List<Item> getCrescentMoonChair() {
        return crescentMoonChair;
    }

    public List<Item> getStandingToilet() {
        return standingToilet;
    }

    public List<Item> getCardboardBed() {
        return cardboardBed;
    }

    public List<Item> getGardenLantern() {
        return gardenLantern;
    }

    public List<Item> getImperialLowTable() {
        return imperialLowTable;
    }

    public List<Item> getSquatToilet() {
        return squatToilet;
    }

    public List<Item> getBunnyDayTable() {
        return bunnyDayTable;
    }

    public List<Item> getMermaidDresser() {
        return mermaidDresser;
    }

    public List<Item> getShellPartition() {
        return shellPartition;
    }

    public List<Item> getGoldenToilet() {
        return goldenToilet;
    }

    public List<Item> getIronWorktable() {
        return ironWorktable;
    }

    public List<Item> getPirateTreasureChest() {
        return pirateTreasureChest;
    }

    public List<Item> getWeightBench() {
        return weightBench;
    }

    public List<Item> getLunarRover() {
        return lunarRover;
    }

    public List<Item> getHammock() {
        return hammock;
    }

    public List<Item> getCuteTeaTable() {
        return cuteTeaTable;
    }

    public List<Item> getBarrel() {
        return barrel;
    }

    public List<Item> getElephantSlide() {
        return elephantSlide;
    }

    public List<Item> getFreshCooler() {
        return freshCooler;
    }

    public List<Item> getBunnyDayFestiveBalloons() {
        return bunnyDayFestiveBalloons;
    }

    public List<Item> getChampionSPennant() {
        return championSPennant;
    }

    public List<Item> getRattanEndTable() {
        return rattanEndTable;
    }

    public List<Item> getCardboardSofa() {
        return cardboardSofa;
    }

    public List<Item> getThrowbackRaceCarBed() {
        return throwbackRaceCarBed;
    }

    public List<Item> getVirgoHarp() {
        return virgoHarp;
    }

    public List<Item> getMermaidChair() {
        return mermaidChair;
    }

    public List<Item> getChangingRoom() {
        return changingRoom;
    }

    public List<Item> getTricycle() {
        return tricycle;
    }

    public List<Item> getFestivaleDrum() {
        return festivaleDrum;
    }

    public List<Item> getGasRange() {
        return gasRange;
    }

    public List<Item> getWesternStyleStone() {
        return westernStyleStone;
    }

    public List<Item> getHayBed() {
        return hayBed;
    }

    public List<Item> getTVCamera() {
        return tVCamera;
    }

    public List<Item> getMushLamp() {
        return mushLamp;
    }

    public List<Item> getMusicStand() {
        return musicStand;
    }

    public List<Item> getTallLantern() {
        return tallLantern;
    }

    public List<Item> getBarbell() {
        return barbell;
    }

    public List<Item> getWoodenDoubleBed() {
        return woodenDoubleBed;
    }

    public List<Item> getBlueCorner() {
        return blueCorner;
    }

    public List<Item> getJailBars() {
        return jailBars;
    }

    public List<Item> getPublicBench() {
        return publicBench;
    }

    public List<Item> getGrandPiano() {
        return grandPiano;
    }

    public List<Item> getWhirlpoolBath() {
        return whirlpoolBath;
    }

    public List<Item> getColorfulWheel() {
        return colorfulWheel;
    }

    public List<Item> getToolShelf() {
        return toolShelf;
    }

    public List<Item> getTouristTelescope() {
        return touristTelescope;
    }

    public List<Item> getCampfire() {
        return campfire;
    }

    public List<Item> getWoodenStool() {
        return woodenStool;
    }

    public List<Item> getKidsTent() {
        return kidsTent;
    }

    public List<Item> getSchoolDesk() {
        return schoolDesk;
    }

    public List<Item> getRattanBed() {
        return rattanBed;
    }

    public List<Item> getSpookyArch() {
        return spookyArch;
    }

    public List<Item> getDrinkMachine() {
        return drinkMachine;
    }

    public List<Item> getCypressBathtub() {
        return cypressBathtub;
    }

    public List<Item> getIronCloset() {
        return ironCloset;
    }

    public List<Item> getPirateBarrel() {
        return pirateBarrel;
    }

    public List<Item> getThrowbackHatTable() {
        return throwbackHatTable;
    }

    public List<Item> getBathroomSink() {
        return bathroomSink;
    }

    public List<Item> getHinaningyo() {
        return hinaningyo;
    }

    public List<Item> getOilBarrel() {
        return oilBarrel;
    }

    public List<Item> getMamaPanda() {
        return mamaPanda;
    }

    public List<Item> getClothesline() {
        return clothesline;
    }

    public List<Item> getSafe() {
        return safe;
    }

    public List<Item> getNaturalGardenTable() {
        return naturalGardenTable;
    }

    public List<Item> getFrozenSculpture() {
        return frozenSculpture;
    }

    public List<Item> getSoccerGoal() {
        return soccerGoal;
    }

    public List<Item> getLighthouse() {
        return lighthouse;
    }

    public List<Item> getKittyLitterBox() {
        return kittyLitterBox;
    }

    public List<Item> getIronwoodChair() {
        return ironwoodChair;
    }

    public List<Item> getWoodenBlockTable() {
        return woodenBlockTable;
    }

    public List<Item> getMossyGardenRock() {
        return mossyGardenRock;
    }

    public List<Item> getWhiteboard() {
        return whiteboard;
    }

    public List<Item> getAsteroid() {
        return asteroid;
    }

    public List<Item> getGoldenSeat() {
        return goldenSeat;
    }

    public List<Item> getHearth() {
        return hearth;
    }

    public List<Item> getRattanArmchair() {
        return rattanArmchair;
    }

    public List<Item> getDartboard() {
        return dartboard;
    }

    public List<Item> getClimbingWall() {
        return climbingWall;
    }

    public List<Item> getCuteDIYTable() {
        return cuteDIYTable;
    }

    public List<Item> getFoldingChair() {
        return foldingChair;
    }

    public List<Item> getStoneStool() {
        return stoneStool;
    }

    public List<Item> getGrandQABirdwingModel() {
        return grandQABirdwingModel;
    }

    public List<Item> getWoodenBucket() {
        return woodenBucket;
    }

    public List<Item> getGoalPole() {
        return goalPole;
    }

    public List<Item> getBambooPartition() {
        return bambooPartition;
    }

    public List<Item> getOfficeDesk() {
        return officeDesk;
    }

    public List<Item> getCrewedSpaceship() {
        return crewedSpaceship;
    }

    public List<Item> getDIYWorkbench() {
        return dIYWorkbench;
    }

    public List<Item> getTermiteMound() {
        return termiteMound;
    }

    public List<Item> getFrozenTable() {
        return frozenTable;
    }

    public List<Item> getIronGardenTable() {
        return ironGardenTable;
    }

    public List<Item> getGoBoard() {
        return goBoard;
    }

    public List<Item> getAppleChair() {
        return appleChair;
    }

    public List<Item> getDinerCounterChair() {
        return dinerCounterChair;
    }

    public List<Item> getUtilitySink() {
        return utilitySink;
    }

    public List<Item> getFuton() {
        return futon;
    }

    public List<Item> getWoodBurningStove() {
        return woodBurningStove;
    }

    public List<Item> getAntiqueBed() {
        return antiqueBed;
    }

    public List<Item> getSpookyTower() {
        return spookyTower;
    }

    public List<Item> getTreeSBountyBigTree() {
        return treeSBountyBigTree;
    }

    public List<Item> getGarbageCan() {
        return garbageCan;
    }

    public List<Item> getBidet() {
        return bidet;
    }

    public List<Item> getConstructionSign() {
        return constructionSign;
    }

    public List<Item> getFlashyFlowerSign() {
        return flashyFlowerSign;
    }

    public List<Item> getRandomType() {
        List<List<Item>> housewares = Arrays.asList(sleigh, artisanalBugCage, drumSet, electricKickScooter, papaPanda, kitchenIsland, mermaidCloset, largeMushroomPlatform, handcart, anatomicalModel, bunnyDayMerryBalloons, rattanStool, teaTable, imperialDiningTable, drinkingFountain, outdoorAirConditioner, spinningWheel, mediumCardboardBoxes, bambooShelf, mushPartition, pool, mermaidScreen, stonehenge, simpleDIYWorkbench, boxSofa, bambooGrass, outdoorGenerator, toyDaySleigh, imperialDiningChair, mushLog, festiveTree, zenStyleStone, tanklessToilet, loftBedWithDesk, trainSet, mermaidLamp, altoSaxophone, cypressPlant, ironwoodCart, tennisTable, imperialChest, streetlamp, astronautSuit, woodenBookshelf, yellowLeafPile, logExtraLongSofa, simpleWell, blossomViewingLantern, doubleSofa, frozenArch, mushParasol, dinerDiningTable, garbagePail, woodenWasteBin, cuteBed, arcadeCombatGame, basketballHoop, woodenBlockBench, acousticGuitar, denDesk, largeCardboardBoxes, clothesCloset, arcadeFightingGame, piscesLamp, angledSignpost, pagoda, roundSpaceHeater, waterPump, rattanVanity, rockingHorse, weddingWelcomeBoard, treadmill, videoCamera, stoneTable, cherryBlossomPondStone, bunnyDayStool, gong, skeleton, mountainBike, bunnyDayWardrobe, frozenCounter, shellTable, stoneArch, waterCooler, stadiometer, tulipSurpriseBox, ironwoodCupboard, bambooFloorLamp, clackercart, sleepingBag, uprightPiano, freezer, solarPanel, tireToy, bonfire, pansyTable, refrigerator, doubleDoorRefrigerator, pondStone, bunnyDayVanity, grassStandee, synthesizer, woodenEndTable, grandAtlasMothModel, marimba, fanPalm, harp, tikiTorch, frozenBed, antiqueChair, imperialBed, babyChair, capricornOrnament, utilityPole, scarecrow, frozenPartition, juicyAppleTV, weddingArch, showerBooth, festivaleGarland, miniDIYWorkbench, rockingChair, miniFridge, fishDryingRack, illuminatedPresent, satellite, cherryBlossomPetalPile, gardenWagon, anchorStatue, giftPile, billiardTable, pirateShipHelm, hiFiStereo, dinerMiniTable, sphinx, studyDesk, rodeoStyleSpringyRideOn, antiqueTable, destinationsSignpost, pyramid, pearBed, velvetStool, fountain, fishingRodStand, cherryBlossomBranches, bambooBasket, brickOven, brickWell, weddingPipeOrgan, giantTeddyBear, tatamiBed, elaborateKimonoStand, pantsPress, rocketLamp, block, ironFrame, weddingChair, cacaoTree, dJSTurntable, stall, denChair, flatGardenRock, ironwoodTable, woodenBlockChest, jsonMember2021CelebratoryArch, spookyLanternSet, cuteVanity, podium, rattanWasteBin, ironShelf, throwbackDinoScreen, electricGuitar, softServeLamp, retroStereo, server, lilyRecordPlayer, festivaleStall, bunnyDayArch, signpost, grandBDragonflyModel, antiqueVanity, shadedFloorLamp, springyRideOn, mountainStandee, paperLantern, kotatsu, barbecue, bunnyDayBed, vintageTVTray, sidewaysPirateBarrel, bambooBench, lifeguardChair, logBed, pileOfZenCushions, robotHero, mushLowStool, gardenRock, foosballTable, woodenWardrobe, hedgeStandee, effectsRack, taurusBathtub, mermaidTable, chalkboard, rCHelicopter, pullUpBarStand, oKMotorsSign, automaticWasher, dinerCounterTable, roseBed, mermaidSofa, screen, threeTieredSnowperson, dinerSofa, electricBass, tableWithCloth, menuChalkboard, ironGardenChair, mapleLeafPondStone, redCorner, pipe, ironwoodKitchenette, antiqueClock, cuteFloorLamp, outdoorBath, cuteChair, outdoorPicnicSet, naturalGardenChair, naturalSquareTable, openFrameKitchen, festivaleParasol, throwbackMittChair, clawFootTub, woodenFullLengthMirror, woodenSimpleBed, marketPlaceDecoration, southPole, yucca, clayFurnace, woodenMiniTable, rockGuitar, plasticPool, ariesRockingChair, saunaHeater, illuminatedSnowflakes, goldenCasket, snackMachine, servingCart, campfireCookware, ironHangerStand, parabolicAntenna, phoneBox, floatingBlock, foldingFloorLamp, spookyCarriage, pianoBench, oilBarrelBathtub, deerScare, antiqueWardrobe, beachTowel, treeSBountyArch, shellStool, zenCushion, festivaleStage, sandbox, logChair, spookyScarecrow, logStakes, tireStack, mushTable, stoneTablet, woodenBlockChair, woodenBlockBookshelf, campingCot, directorSChair, micStand, monsterStatue, birdbath, outdoorBench, frozenChair, rattanLowTable, mermaidBed, turkeyDayTable, retroGasPump, ironwoodDIYWorkbench, rocket, swingingBench, arcadeSeat, ironGardenBench, floorLight, teacupRide, cuteSofa, kettleBathtub, speedBag, beekeeperSHive, airCirculator, cuteWardrobe, dinerNeonSign, doghouse, gardenFaucet, lowScreen, digitalScale, highEndStereo, bunkBed, plainWoodenShopSign, fortuneCookieCart, redLeafPile, trophyCase, birthdaySign, windTurbine, toilet, systemKitchen, ironingBoard, telescope, turkeyDayChair, cosmosShower, illuminatedTree, mumCushion, spaceShuttle, vacuumCleaner, raccoonFigurine, surfboard, ironwoodDresser, thwomp, arcadeMahjongGame, toolCart, weddingFlowerStand, woodenChest, birthdayTable, scatteredPapers, brakeTapper, greenLeafPile, cancerTable, festivaleFloat, portableToilet, lawnMower, mrsFlamingo, rattanWardrobe, dryingRack, kimonoStand, ironwoodLowTable, candyMachine, woodenBlockStereo, frozenPillar, silo, streetOrgan, kadomatsu, shellArch, wildLogBench, firePit, schoolChair, oceanSunfishModel, punchingBag, shellBed, retroFan, woodenChair, logDiningTable, basicTeacherSDesk, lawnChair, smoker, geminiCloset, loom, longBathtub, mamaBear, pinballMachine, mrFlamingo, treeStandee, weddingHeadTable, boxCornerSofa, gardenBench, leafCampfire, lectureHallBench, towerOfPisa, birdhouse, logBench, oldSewingMachine, pearWardrobe, woodenTable, hoseReel, floorLamp, waveBreaker, bambooSpeaker, weddingBench, catTower, popcornMachine, uprightLocker, smallCardboardBoxes, woodenBlockStool, bambooStool, spookyChair, wheelchair, garbageBin, petBed, dinerChair, moaiStatue, jukebox, floorSeat, sandCastle, playgroundGym, turkeyDayHearth, streetPiano, logRoundTable, tinyLibrary, leafStool, modernOfficeChair, studioSpotlight, tallGardenRock, deluxeWasher, antiqueBureau, exerciseBall, statueOfLiberty, logDecorativeShelves, campsiteSign, shellFountain, bambooDoll, antiqueConsoleTable, mermaidVanity, smallMushroomPlatform, cello, neutralCorner, silverMic, cardboardTable, cardboardChair, block, lectureHallDesk, bonsaiShelf, pirateShipCannon, butterChurn, stoneLionDog, orangeEndTable, weddingTable, bambooNoodleSlide, clotheslinePole, cone, plainSink, exerciseBike, fan, inflatableSofa, bambooStopblock, logGardenLounge, frozenTree, outdoorTable, logStool, bigFestiveTree, flowerStand, studyChair, throwbackRocket, festivaleBalloonLamp, uprightVacuum, flyingSaucer, mermaidShelf, woodenLowTable, peachChair, standardUmbrellaStand, cottonCandyStall, golfBag, lunaSBed, manholeCover, parkClock, birdcage, simplePanel, turkeyDayGardenStand, spookyStandingLamp, moon, palmTreeLamp, monstera, imperialPartition, festivaleFlag, pileOfLeaves, beachChair, poolsideBed, ironwoodBed, illuminatedReindeer, lunarLander, spookyTable, aquariusUrn, toiletCleaningSet, woodenBlockBed, antiqueMiniTable, papaBear, fireplace, crescentMoonChair, standingToilet, cardboardBed, gardenLantern, imperialLowTable, squatToilet, bunnyDayTable, mermaidDresser, shellPartition, goldenToilet, ironWorktable, pirateTreasureChest, weightBench, lunarRover, hammock, cuteTeaTable, barrel, elephantSlide, freshCooler, bunnyDayFestiveBalloons, championSPennant, rattanEndTable, cardboardSofa, throwbackRaceCarBed, virgoHarp, mermaidChair, changingRoom, tricycle, festivaleDrum, gasRange, westernStyleStone, hayBed, tVCamera, mushLamp, musicStand, tallLantern, barbell, woodenDoubleBed, blueCorner, jailBars, publicBench, grandPiano, whirlpoolBath, colorfulWheel, toolShelf, touristTelescope, campfire, woodenStool, kidsTent, schoolDesk, rattanBed, spookyArch, drinkMachine, cypressBathtub, ironCloset, pirateBarrel, throwbackHatTable, bathroomSink, hinaningyo, oilBarrel, mamaPanda, clothesline, safe, naturalGardenTable, frozenSculpture, soccerGoal, lighthouse, kittyLitterBox, ironwoodChair, woodenBlockTable, mossyGardenRock, whiteboard, asteroid, goldenSeat, hearth, rattanArmchair, dartboard, climbingWall, cuteDIYTable, foldingChair, stoneStool, grandQABirdwingModel, woodenBucket, goalPole, bambooPartition, officeDesk, crewedSpaceship, dIYWorkbench, termiteMound, frozenTable, ironGardenTable, goBoard, appleChair, dinerCounterChair, utilitySink, futon, woodBurningStove, antiqueBed, spookyTower, treeSBountyBigTree, garbageCan, bidet, constructionSign, flashyFlowerSign);
        return getRandomValue(housewares);
    }

    private List<Item> getRandomValue(List<List<Item>> housewares) {
        int index = new Random().nextInt(housewares.size());
        return housewares.get(index);
    }
}
