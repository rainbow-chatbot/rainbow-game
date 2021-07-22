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

import io.github.jisungbin.acnhapi.models.items.ItemWrapper;

public class Housewares implements ItemWrapper {
    @SerializedName("sleigh")
    private List<Houseware> sleigh;

    @SerializedName("artisanal_bug_cage")
    private List<Houseware> artisanalBugCage;

    @SerializedName("drum_set")
    private List<Houseware> drumSet;

    @SerializedName("electric_kick_scooter")
    private List<Houseware> electricKickScooter;

    @SerializedName("Papa_panda")
    private List<Houseware> papaPanda;

    @SerializedName("kitchen_island")
    private List<Houseware> kitchenIsland;

    @SerializedName("mermaid_closet")
    private List<Houseware> mermaidCloset;

    @SerializedName("large_Mushroom_Platform")
    private List<Houseware> largeMushroomPlatform;

    @SerializedName("handcart")
    private List<Houseware> handcart;

    @SerializedName("anatomical_model")
    private List<Houseware> anatomicalModel;

    @SerializedName("Bunny_Day_merry_balloons")
    private List<Houseware> bunnyDayMerryBalloons;

    @SerializedName("rattan_stool")
    private List<Houseware> rattanStool;

    @SerializedName("tea_table")
    private List<Houseware> teaTable;

    @SerializedName("imperial_dining_table")
    private List<Houseware> imperialDiningTable;

    @SerializedName("drinking_fountain")
    private List<Houseware> drinkingFountain;

    @SerializedName("outdoor_air_conditioner")
    private List<Houseware> outdoorAirConditioner;

    @SerializedName("spinning_wheel")
    private List<Houseware> spinningWheel;

    @SerializedName("medium_cardboard_boxes")
    private List<Houseware> mediumCardboardBoxes;

    @SerializedName("bamboo_shelf")
    private List<Houseware> bambooShelf;

    @SerializedName("mush_partition")
    private List<Houseware> mushPartition;

    @SerializedName("pool")
    private List<Houseware> pool;

    @SerializedName("mermaid_screen")
    private List<Houseware> mermaidScreen;

    @SerializedName("Stonehenge")
    private List<Houseware> stonehenge;

    @SerializedName("simple_DIY_workbench")
    private List<Houseware> simpleDIYWorkbench;

    @SerializedName("box_sofa")
    private List<Houseware> boxSofa;

    @SerializedName("bamboo_grass")
    private List<Houseware> bambooGrass;

    @SerializedName("outdoor_generator")
    private List<Houseware> outdoorGenerator;

    @SerializedName("Toy_Day_sleigh")
    private List<Houseware> toyDaySleigh;

    @SerializedName("imperial_dining_chair")
    private List<Houseware> imperialDiningChair;

    @SerializedName("mush_log")
    private List<Houseware> mushLog;

    @SerializedName("festive_tree")
    private List<Houseware> festiveTree;

    @SerializedName("zen-style_stone")
    private List<Houseware> zenStyleStone;

    @SerializedName("tankless_toilet")
    private List<Houseware> tanklessToilet;

    @SerializedName("loft_bed_with_desk")
    private List<Houseware> loftBedWithDesk;

    @SerializedName("train_set")
    private List<Houseware> trainSet;

    @SerializedName("mermaid_lamp")
    private List<Houseware> mermaidLamp;

    @SerializedName("alto_saxophone")
    private List<Houseware> altoSaxophone;

    @SerializedName("cypress_plant")
    private List<Houseware> cypressPlant;

    @SerializedName("ironwood_cart")
    private List<Houseware> ironwoodCart;

    @SerializedName("tennis_table")
    private List<Houseware> tennisTable;

    @SerializedName("imperial_chest")
    private List<Houseware> imperialChest;

    @SerializedName("streetlamp")
    private List<Houseware> streetlamp;

    @SerializedName("astronaut_suit")
    private List<Houseware> astronautSuit;

    @SerializedName("wooden_bookshelf")
    private List<Houseware> woodenBookshelf;

    @SerializedName("yellow-leaf_pile")
    private List<Houseware> yellowLeafPile;

    @SerializedName("log_extra-long_sofa")
    private List<Houseware> logExtraLongSofa;

    @SerializedName("simple_well")
    private List<Houseware> simpleWell;

    @SerializedName("blossom-viewing_lantern")
    private List<Houseware> blossomViewingLantern;

    @SerializedName("double_sofa")
    private List<Houseware> doubleSofa;

    @SerializedName("frozen_arch")
    private List<Houseware> frozenArch;

    @SerializedName("mush_parasol")
    private List<Houseware> mushParasol;

    @SerializedName("diner_dining_table")
    private List<Houseware> dinerDiningTable;

    @SerializedName("garbage_pail")
    private List<Houseware> garbagePail;

    @SerializedName("wooden_waste_bin")
    private List<Houseware> woodenWasteBin;

    @SerializedName("cute_bed")
    private List<Houseware> cuteBed;

    @SerializedName("arcade_combat_game")
    private List<Houseware> arcadeCombatGame;

    @SerializedName("basketball_hoop")
    private List<Houseware> basketballHoop;

    @SerializedName("wooden-block_bench")
    private List<Houseware> woodenBlockBench;

    @SerializedName("acoustic_guitar")
    private List<Houseware> acousticGuitar;

    @SerializedName("den_desk")
    private List<Houseware> denDesk;

    @SerializedName("large_cardboard_boxes")
    private List<Houseware> largeCardboardBoxes;

    @SerializedName("clothes_closet")
    private List<Houseware> clothesCloset;

    @SerializedName("arcade_fighting_game")
    private List<Houseware> arcadeFightingGame;

    @SerializedName("Pisces_lamp")
    private List<Houseware> piscesLamp;

    @SerializedName("angled_signpost")
    private List<Houseware> angledSignpost;

    @SerializedName("pagoda")
    private List<Houseware> pagoda;

    @SerializedName("round_space_heater")
    private List<Houseware> roundSpaceHeater;

    @SerializedName("water_pump")
    private List<Houseware> waterPump;

    @SerializedName("rattan_vanity")
    private List<Houseware> rattanVanity;

    @SerializedName("rocking_horse")
    private List<Houseware> rockingHorse;

    @SerializedName("wedding_welcome_board")
    private List<Houseware> weddingWelcomeBoard;

    @SerializedName("treadmill")
    private List<Houseware> treadmill;

    @SerializedName("video_camera")
    private List<Houseware> videoCamera;

    @SerializedName("stone_table")
    private List<Houseware> stoneTable;

    @SerializedName("cherry-blossom_pond_stone")
    private List<Houseware> cherryBlossomPondStone;

    @SerializedName("Bunny_Day_stool")
    private List<Houseware> bunnyDayStool;

    @SerializedName("gong")
    private List<Houseware> gong;

    @SerializedName("skeleton")
    private List<Houseware> skeleton;

    @SerializedName("mountain_bike")
    private List<Houseware> mountainBike;

    @SerializedName("Bunny_Day_wardrobe")
    private List<Houseware> bunnyDayWardrobe;

    @SerializedName("frozen_counter")
    private List<Houseware> frozenCounter;

    @SerializedName("shell_table")
    private List<Houseware> shellTable;

    @SerializedName("stone_arch")
    private List<Houseware> stoneArch;

    @SerializedName("water_cooler")
    private List<Houseware> waterCooler;

    @SerializedName("stadiometer")
    private List<Houseware> stadiometer;

    @SerializedName("tulip_surprise_box")
    private List<Houseware> tulipSurpriseBox;

    @SerializedName("ironwood_cupboard")
    private List<Houseware> ironwoodCupboard;

    @SerializedName("bamboo_floor_lamp")
    private List<Houseware> bambooFloorLamp;

    @SerializedName("clackercart")
    private List<Houseware> clackercart;

    @SerializedName("sleeping_bag")
    private List<Houseware> sleepingBag;

    @SerializedName("upright_piano")
    private List<Houseware> uprightPiano;

    @SerializedName("freezer")
    private List<Houseware> freezer;

    @SerializedName("solar_panel")
    private List<Houseware> solarPanel;

    @SerializedName("tire_toy")
    private List<Houseware> tireToy;

    @SerializedName("bonfire")
    private List<Houseware> bonfire;

    @SerializedName("pansy_table")
    private List<Houseware> pansyTable;

    @SerializedName("refrigerator")
    private List<Houseware> refrigerator;

    @SerializedName("double-door_refrigerator")
    private List<Houseware> doubleDoorRefrigerator;

    @SerializedName("pond_stone")
    private List<Houseware> pondStone;

    @SerializedName("Bunny_Day_vanity")
    private List<Houseware> bunnyDayVanity;

    @SerializedName("grass_standee")
    private List<Houseware> grassStandee;

    @SerializedName("synthesizer")
    private List<Houseware> synthesizer;

    @SerializedName("wooden_end_table")
    private List<Houseware> woodenEndTable;

    @SerializedName("grand_Atlas_moth_model")
    private List<Houseware> grandAtlasMothModel;

    @SerializedName("marimba")
    private List<Houseware> marimba;

    @SerializedName("fan_palm")
    private List<Houseware> fanPalm;

    @SerializedName("harp")
    private List<Houseware> harp;

    @SerializedName("tiki_torch")
    private List<Houseware> tikiTorch;

    @SerializedName("frozen_bed")
    private List<Houseware> frozenBed;

    @SerializedName("antique_chair")
    private List<Houseware> antiqueChair;

    @SerializedName("imperial_bed")
    private List<Houseware> imperialBed;

    @SerializedName("baby_chair")
    private List<Houseware> babyChair;

    @SerializedName("Capricorn_ornament")
    private List<Houseware> capricornOrnament;

    @SerializedName("utility_pole")
    private List<Houseware> utilityPole;

    @SerializedName("scarecrow")
    private List<Houseware> scarecrow;

    @SerializedName("frozen_partition")
    private List<Houseware> frozenPartition;

    @SerializedName("juicy-apple_TV")
    private List<Houseware> juicyAppleTV;

    @SerializedName("wedding_arch")
    private List<Houseware> weddingArch;

    @SerializedName("shower_booth")
    private List<Houseware> showerBooth;

    @SerializedName("Festivale_garland")
    private List<Houseware> festivaleGarland;

    @SerializedName("mini_DIY_workbench")
    private List<Houseware> miniDIYWorkbench;

    @SerializedName("rocking_chair")
    private List<Houseware> rockingChair;

    @SerializedName("mini_fridge")
    private List<Houseware> miniFridge;

    @SerializedName("fish-drying_rack")
    private List<Houseware> fishDryingRack;

    @SerializedName("illuminated_present")
    private List<Houseware> illuminatedPresent;

    @SerializedName("satellite")
    private List<Houseware> satellite;

    @SerializedName("cherry-blossom-petal_pile")
    private List<Houseware> cherryBlossomPetalPile;

    @SerializedName("garden_wagon")
    private List<Houseware> gardenWagon;

    @SerializedName("anchor_statue")
    private List<Houseware> anchorStatue;

    @SerializedName("gift_pile")
    private List<Houseware> giftPile;

    @SerializedName("billiard_table")
    private List<Houseware> billiardTable;

    @SerializedName("pirate-ship_helm")
    private List<Houseware> pirateShipHelm;

    @SerializedName("hi-fi_stereo")
    private List<Houseware> hiFiStereo;

    @SerializedName("diner_mini_table")
    private List<Houseware> dinerMiniTable;

    @SerializedName("sphinx")
    private List<Houseware> sphinx;

    @SerializedName("study_desk")
    private List<Houseware> studyDesk;

    @SerializedName("rodeo-style_springy_ride-on")
    private List<Houseware> rodeoStyleSpringyRideOn;

    @SerializedName("antique_table")
    private List<Houseware> antiqueTable;

    @SerializedName("destinations_signpost")
    private List<Houseware> destinationsSignpost;

    @SerializedName("pyramid")
    private List<Houseware> pyramid;

    @SerializedName("pear_bed")
    private List<Houseware> pearBed;

    @SerializedName("velvet_stool")
    private List<Houseware> velvetStool;

    @SerializedName("fountain")
    private List<Houseware> fountain;

    @SerializedName("fishing-rod_stand")
    private List<Houseware> fishingRodStand;

    @SerializedName("cherry-blossom_branches")
    private List<Houseware> cherryBlossomBranches;

    @SerializedName("bamboo_basket")
    private List<Houseware> bambooBasket;

    @SerializedName("brick_oven")
    private List<Houseware> brickOven;

    @SerializedName("brick_well")
    private List<Houseware> brickWell;

    @SerializedName("wedding_pipe_organ")
    private List<Houseware> weddingPipeOrgan;

    @SerializedName("giant_teddy_bear")
    private List<Houseware> giantTeddyBear;

    @SerializedName("tatami_bed")
    private List<Houseware> tatamiBed;

    @SerializedName("elaborate_kimono_stand")
    private List<Houseware> elaborateKimonoStand;

    @SerializedName("pants_press")
    private List<Houseware> pantsPress;

    @SerializedName("rocket_lamp")
    private List<Houseware> rocketLamp;

    @SerializedName("block")
    private List<Houseware> block;

    @SerializedName("iron_frame")
    private List<Houseware> ironFrame;

    @SerializedName("wedding_chair")
    private List<Houseware> weddingChair;

    @SerializedName("cacao_tree")
    private List<Houseware> cacaoTree;

    @SerializedName("DJ's_turntable")
    private List<Houseware> dJSTurntable;

    @SerializedName("stall")
    private List<Houseware> stall;

    @SerializedName("den_chair")
    private List<Houseware> denChair;

    @SerializedName("flat_garden_rock")
    private List<Houseware> flatGardenRock;

    @SerializedName("ironwood_table")
    private List<Houseware> ironwoodTable;

    @SerializedName("wooden-block_chest")
    private List<Houseware> woodenBlockChest;

    @SerializedName("2021_celebratory_arch")
    private List<Houseware> jsonMember2021CelebratoryArch;

    @SerializedName("spooky_lantern_set")
    private List<Houseware> spookyLanternSet;

    @SerializedName("cute_vanity")
    private List<Houseware> cuteVanity;

    @SerializedName("podium")
    private List<Houseware> podium;

    @SerializedName("rattan_waste_bin")
    private List<Houseware> rattanWasteBin;

    @SerializedName("iron_shelf")
    private List<Houseware> ironShelf;

    @SerializedName("throwback_dino_screen")
    private List<Houseware> throwbackDinoScreen;

    @SerializedName("electric_guitar")
    private List<Houseware> electricGuitar;

    @SerializedName("soft-serve_lamp")
    private List<Houseware> softServeLamp;

    @SerializedName("retro_stereo")
    private List<Houseware> retroStereo;

    @SerializedName("server")
    private List<Houseware> server;

    @SerializedName("lily_record_player")
    private List<Houseware> lilyRecordPlayer;

    @SerializedName("Festivale_stall")
    private List<Houseware> festivaleStall;

    @SerializedName("Bunny_Day_arch")
    private List<Houseware> bunnyDayArch;

    @SerializedName("signpost")
    private List<Houseware> signpost;

    @SerializedName("grand_b._dragonfly_model")
    private List<Houseware> grandBDragonflyModel;

    @SerializedName("antique_vanity")
    private List<Houseware> antiqueVanity;

    @SerializedName("shaded_floor_lamp")
    private List<Houseware> shadedFloorLamp;

    @SerializedName("springy_ride-on")
    private List<Houseware> springyRideOn;

    @SerializedName("mountain_standee")
    private List<Houseware> mountainStandee;

    @SerializedName("paper_lantern")
    private List<Houseware> paperLantern;

    @SerializedName("kotatsu")
    private List<Houseware> kotatsu;

    @SerializedName("barbecue")
    private List<Houseware> barbecue;

    @SerializedName("Bunny_Day_bed")
    private List<Houseware> bunnyDayBed;

    @SerializedName("vintage_TV_tray")
    private List<Houseware> vintageTVTray;

    @SerializedName("sideways_pirate_barrel")
    private List<Houseware> sidewaysPirateBarrel;

    @SerializedName("bamboo_bench")
    private List<Houseware> bambooBench;

    @SerializedName("lifeguard_chair")
    private List<Houseware> lifeguardChair;

    @SerializedName("log_bed")
    private List<Houseware> logBed;

    @SerializedName("pile_of_zen_cushions")
    private List<Houseware> pileOfZenCushions;

    @SerializedName("robot_hero")
    private List<Houseware> robotHero;

    @SerializedName("mush_low_stool")
    private List<Houseware> mushLowStool;

    @SerializedName("garden_rock")
    private List<Houseware> gardenRock;

    @SerializedName("foosball_table")
    private List<Houseware> foosballTable;

    @SerializedName("wooden_wardrobe")
    private List<Houseware> woodenWardrobe;

    @SerializedName("hedge_standee")
    private List<Houseware> hedgeStandee;

    @SerializedName("effects_rack")
    private List<Houseware> effectsRack;

    @SerializedName("Taurus_bathtub")
    private List<Houseware> taurusBathtub;

    @SerializedName("mermaid_table")
    private List<Houseware> mermaidTable;

    @SerializedName("chalkboard")
    private List<Houseware> chalkboard;

    @SerializedName("RC_helicopter")
    private List<Houseware> rCHelicopter;

    @SerializedName("pull-up-bar_stand")
    private List<Houseware> pullUpBarStand;

    @SerializedName("OK_Motors_sign")
    private List<Houseware> oKMotorsSign;

    @SerializedName("automatic_washer")
    private List<Houseware> automaticWasher;

    @SerializedName("diner_counter_table")
    private List<Houseware> dinerCounterTable;

    @SerializedName("rose_bed")
    private List<Houseware> roseBed;

    @SerializedName("mermaid_sofa")
    private List<Houseware> mermaidSofa;

    @SerializedName("screen")
    private List<Houseware> screen;

    @SerializedName("three-tiered_snowperson")
    private List<Houseware> threeTieredSnowperson;

    @SerializedName("diner_sofa")
    private List<Houseware> dinerSofa;

    @SerializedName("electric_bass")
    private List<Houseware> electricBass;

    @SerializedName("table_with_cloth")
    private List<Houseware> tableWithCloth;

    @SerializedName("menu_chalkboard")
    private List<Houseware> menuChalkboard;

    @SerializedName("iron_garden_chair")
    private List<Houseware> ironGardenChair;

    @SerializedName("maple-leaf_pond_stone")
    private List<Houseware> mapleLeafPondStone;

    @SerializedName("red_corner")
    private List<Houseware> redCorner;

    @SerializedName("pipe")
    private List<Houseware> pipe;

    @SerializedName("ironwood_kitchenette")
    private List<Houseware> ironwoodKitchenette;

    @SerializedName("antique_clock")
    private List<Houseware> antiqueClock;

    @SerializedName("cute_floor_lamp")
    private List<Houseware> cuteFloorLamp;

    @SerializedName("outdoor_bath")
    private List<Houseware> outdoorBath;

    @SerializedName("cute_chair")
    private List<Houseware> cuteChair;

    @SerializedName("outdoor_picnic_set")
    private List<Houseware> outdoorPicnicSet;

    @SerializedName("natural_garden_chair")
    private List<Houseware> naturalGardenChair;

    @SerializedName("natural_square_table")
    private List<Houseware> naturalSquareTable;

    @SerializedName("open-frame_kitchen")
    private List<Houseware> openFrameKitchen;

    @SerializedName("Festivale_parasol")
    private List<Houseware> festivaleParasol;

    @SerializedName("throwback_mitt_chair")
    private List<Houseware> throwbackMittChair;

    @SerializedName("claw-foot_tub")
    private List<Houseware> clawFootTub;

    @SerializedName("wooden_full-length_mirror")
    private List<Houseware> woodenFullLengthMirror;

    @SerializedName("wooden_simple_bed")
    private List<Houseware> woodenSimpleBed;

    @SerializedName("Market_Place_decoration")
    private List<Houseware> marketPlaceDecoration;

    @SerializedName("South_Pole")
    private List<Houseware> southPole;

    @SerializedName("yucca")
    private List<Houseware> yucca;

    @SerializedName("clay_furnace")
    private List<Houseware> clayFurnace;

    @SerializedName("wooden_mini_table")
    private List<Houseware> woodenMiniTable;

    @SerializedName("rock_guitar")
    private List<Houseware> rockGuitar;

    @SerializedName("plastic_pool")
    private List<Houseware> plasticPool;

    @SerializedName("Aries_rocking_chair")
    private List<Houseware> ariesRockingChair;

    @SerializedName("sauna_heater")
    private List<Houseware> saunaHeater;

    @SerializedName("illuminated_snowflakes")
    private List<Houseware> illuminatedSnowflakes;

    @SerializedName("golden_casket")
    private List<Houseware> goldenCasket;

    @SerializedName("snack_machine")
    private List<Houseware> snackMachine;

    @SerializedName("serving_cart")
    private List<Houseware> servingCart;

    @SerializedName("campfire_cookware")
    private List<Houseware> campfireCookware;

    @SerializedName("iron_hanger_stand")
    private List<Houseware> ironHangerStand;

    @SerializedName("parabolic_antenna")
    private List<Houseware> parabolicAntenna;

    @SerializedName("phone_box")
    private List<Houseware> phoneBox;

    @SerializedName("floating_block")
    private List<Houseware> floatingBlock;

    @SerializedName("folding_floor_lamp")
    private List<Houseware> foldingFloorLamp;

    @SerializedName("spooky_carriage")
    private List<Houseware> spookyCarriage;

    @SerializedName("piano_bench")
    private List<Houseware> pianoBench;

    @SerializedName("oil-barrel_bathtub")
    private List<Houseware> oilBarrelBathtub;

    @SerializedName("deer_scare")
    private List<Houseware> deerScare;

    @SerializedName("antique_wardrobe")
    private List<Houseware> antiqueWardrobe;

    @SerializedName("beach_towel")
    private List<Houseware> beachTowel;

    @SerializedName("tree's_bounty_arch")
    private List<Houseware> treeSBountyArch;

    @SerializedName("shell_stool")
    private List<Houseware> shellStool;

    @SerializedName("zen_cushion")
    private List<Houseware> zenCushion;

    @SerializedName("Festivale_stage")
    private List<Houseware> festivaleStage;

    @SerializedName("sandbox")
    private List<Houseware> sandbox;

    @SerializedName("log_chair")
    private List<Houseware> logChair;

    @SerializedName("spooky_scarecrow")
    private List<Houseware> spookyScarecrow;

    @SerializedName("log_stakes")
    private List<Houseware> logStakes;

    @SerializedName("tire_stack")
    private List<Houseware> tireStack;

    @SerializedName("mush_table")
    private List<Houseware> mushTable;

    @SerializedName("stone_tablet")
    private List<Houseware> stoneTablet;

    @SerializedName("wooden-block_chair")
    private List<Houseware> woodenBlockChair;

    @SerializedName("wooden-block_bookshelf")
    private List<Houseware> woodenBlockBookshelf;

    @SerializedName("camping_cot")
    private List<Houseware> campingCot;

    @SerializedName("director's_chair")
    private List<Houseware> directorSChair;

    @SerializedName("mic_stand")
    private List<Houseware> micStand;

    @SerializedName("monster_statue")
    private List<Houseware> monsterStatue;

    @SerializedName("birdbath")
    private List<Houseware> birdbath;

    @SerializedName("outdoor_bench")
    private List<Houseware> outdoorBench;

    @SerializedName("frozen_chair")
    private List<Houseware> frozenChair;

    @SerializedName("rattan_low_table")
    private List<Houseware> rattanLowTable;

    @SerializedName("mermaid_bed")
    private List<Houseware> mermaidBed;

    @SerializedName("Turkey_Day_table")
    private List<Houseware> turkeyDayTable;

    @SerializedName("retro_gas_pump")
    private List<Houseware> retroGasPump;

    @SerializedName("ironwood_DIY_workbench")
    private List<Houseware> ironwoodDIYWorkbench;

    @SerializedName("rocket")
    private List<Houseware> rocket;

    @SerializedName("swinging_bench")
    private List<Houseware> swingingBench;

    @SerializedName("arcade_seat")
    private List<Houseware> arcadeSeat;

    @SerializedName("iron_garden_bench")
    private List<Houseware> ironGardenBench;

    @SerializedName("floor_light")
    private List<Houseware> floorLight;

    @SerializedName("teacup_ride")
    private List<Houseware> teacupRide;

    @SerializedName("cute_sofa")
    private List<Houseware> cuteSofa;

    @SerializedName("kettle_bathtub")
    private List<Houseware> kettleBathtub;

    @SerializedName("speed_bag")
    private List<Houseware> speedBag;

    @SerializedName("beekeeper's_hive")
    private List<Houseware> beekeeperSHive;

    @SerializedName("air_circulator")
    private List<Houseware> airCirculator;

    @SerializedName("cute_wardrobe")
    private List<Houseware> cuteWardrobe;

    @SerializedName("diner_neon_sign")
    private List<Houseware> dinerNeonSign;

    @SerializedName("doghouse")
    private List<Houseware> doghouse;

    @SerializedName("garden_faucet")
    private List<Houseware> gardenFaucet;

    @SerializedName("low_screen")
    private List<Houseware> lowScreen;

    @SerializedName("digital_scale")
    private List<Houseware> digitalScale;

    @SerializedName("high-end_stereo")
    private List<Houseware> highEndStereo;

    @SerializedName("bunk_bed")
    private List<Houseware> bunkBed;

    @SerializedName("plain_wooden_shop_sign")
    private List<Houseware> plainWoodenShopSign;

    @SerializedName("fortune-cookie_cart")
    private List<Houseware> fortuneCookieCart;

    @SerializedName("red-leaf_pile")
    private List<Houseware> redLeafPile;

    @SerializedName("trophy_case")
    private List<Houseware> trophyCase;

    @SerializedName("birthday_sign")
    private List<Houseware> birthdaySign;

    @SerializedName("wind_turbine")
    private List<Houseware> windTurbine;

    @SerializedName("toilet")
    private List<Houseware> toilet;

    @SerializedName("system_kitchen")
    private List<Houseware> systemKitchen;

    @SerializedName("ironing_board")
    private List<Houseware> ironingBoard;

    @SerializedName("telescope")
    private List<Houseware> telescope;

    @SerializedName("Turkey_Day_chair")
    private List<Houseware> turkeyDayChair;

    @SerializedName("cosmos_shower")
    private List<Houseware> cosmosShower;

    @SerializedName("illuminated_tree")
    private List<Houseware> illuminatedTree;

    @SerializedName("mum_cushion")
    private List<Houseware> mumCushion;

    @SerializedName("space_shuttle")
    private List<Houseware> spaceShuttle;

    @SerializedName("vacuum_cleaner")
    private List<Houseware> vacuumCleaner;

    @SerializedName("raccoon_figurine")
    private List<Houseware> raccoonFigurine;

    @SerializedName("surfboard")
    private List<Houseware> surfboard;

    @SerializedName("ironwood_dresser")
    private List<Houseware> ironwoodDresser;

    @SerializedName("Thwomp")
    private List<Houseware> thwomp;

    @SerializedName("arcade_mahjong_game")
    private List<Houseware> arcadeMahjongGame;

    @SerializedName("tool_cart")
    private List<Houseware> toolCart;

    @SerializedName("wedding_flower_stand")
    private List<Houseware> weddingFlowerStand;

    @SerializedName("wooden_chest")
    private List<Houseware> woodenChest;

    @SerializedName("birthday_table")
    private List<Houseware> birthdayTable;

    @SerializedName("scattered_papers")
    private List<Houseware> scatteredPapers;

    @SerializedName("Brake_Tapper")
    private List<Houseware> brakeTapper;

    @SerializedName("green-leaf_pile")
    private List<Houseware> greenLeafPile;

    @SerializedName("Cancer_table")
    private List<Houseware> cancerTable;

    @SerializedName("Festivale_float")
    private List<Houseware> festivaleFloat;

    @SerializedName("portable_toilet")
    private List<Houseware> portableToilet;

    @SerializedName("lawn_mower")
    private List<Houseware> lawnMower;

    @SerializedName("Mrs._Flamingo")
    private List<Houseware> mrsFlamingo;

    @SerializedName("rattan_wardrobe")
    private List<Houseware> rattanWardrobe;

    @SerializedName("drying_rack")
    private List<Houseware> dryingRack;

    @SerializedName("kimono_stand")
    private List<Houseware> kimonoStand;

    @SerializedName("ironwood_low_table")
    private List<Houseware> ironwoodLowTable;

    @SerializedName("candy_machine")
    private List<Houseware> candyMachine;

    @SerializedName("wooden-block_stereo")
    private List<Houseware> woodenBlockStereo;

    @SerializedName("frozen_pillar")
    private List<Houseware> frozenPillar;

    @SerializedName("silo")
    private List<Houseware> silo;

    @SerializedName("street_organ")
    private List<Houseware> streetOrgan;

    @SerializedName("kadomatsu")
    private List<Houseware> kadomatsu;

    @SerializedName("shell_arch")
    private List<Houseware> shellArch;

    @SerializedName("wild_log_bench")
    private List<Houseware> wildLogBench;

    @SerializedName("fire_pit")
    private List<Houseware> firePit;

    @SerializedName("school_chair")
    private List<Houseware> schoolChair;

    @SerializedName("ocean_sunfish_model")
    private List<Houseware> oceanSunfishModel;

    @SerializedName("punching_bag")
    private List<Houseware> punchingBag;

    @SerializedName("shell_bed")
    private List<Houseware> shellBed;

    @SerializedName("retro_fan")
    private List<Houseware> retroFan;

    @SerializedName("wooden_chair")
    private List<Houseware> woodenChair;

    @SerializedName("log_dining_table")
    private List<Houseware> logDiningTable;

    @SerializedName("basic_teacher's_desk")
    private List<Houseware> basicTeacherSDesk;

    @SerializedName("lawn_chair")
    private List<Houseware> lawnChair;

    @SerializedName("smoker")
    private List<Houseware> smoker;

    @SerializedName("Gemini_closet")
    private List<Houseware> geminiCloset;

    @SerializedName("loom")
    private List<Houseware> loom;

    @SerializedName("long_bathtub")
    private List<Houseware> longBathtub;

    @SerializedName("Mama_bear")
    private List<Houseware> mamaBear;

    @SerializedName("pinball_machine")
    private List<Houseware> pinballMachine;

    @SerializedName("Mr._Flamingo")
    private List<Houseware> mrFlamingo;

    @SerializedName("tree_standee")
    private List<Houseware> treeStandee;

    @SerializedName("wedding_head_table")
    private List<Houseware> weddingHeadTable;

    @SerializedName("box_corner_sofa")
    private List<Houseware> boxCornerSofa;

    @SerializedName("garden_bench")
    private List<Houseware> gardenBench;

    @SerializedName("leaf_campfire")
    private List<Houseware> leafCampfire;

    @SerializedName("lecture-hall_bench")
    private List<Houseware> lectureHallBench;

    @SerializedName("Tower_of_Pisa")
    private List<Houseware> towerOfPisa;

    @SerializedName("birdhouse")
    private List<Houseware> birdhouse;

    @SerializedName("log_bench")
    private List<Houseware> logBench;

    @SerializedName("old_sewing_machine")
    private List<Houseware> oldSewingMachine;

    @SerializedName("pear_wardrobe")
    private List<Houseware> pearWardrobe;

    @SerializedName("wooden_table")
    private List<Houseware> woodenTable;

    @SerializedName("hose_reel")
    private List<Houseware> hoseReel;

    @SerializedName("floor_lamp")
    private List<Houseware> floorLamp;

    @SerializedName("wave_breaker")
    private List<Houseware> waveBreaker;

    @SerializedName("bamboo_speaker")
    private List<Houseware> bambooSpeaker;

    @SerializedName("wedding_bench")
    private List<Houseware> weddingBench;

    @SerializedName("cat_tower")
    private List<Houseware> catTower;

    @SerializedName("popcorn_machine")
    private List<Houseware> popcornMachine;

    @SerializedName("upright_locker")
    private List<Houseware> uprightLocker;

    @SerializedName("small_cardboard_boxes")
    private List<Houseware> smallCardboardBoxes;

    @SerializedName("wooden-block_stool")
    private List<Houseware> woodenBlockStool;

    @SerializedName("bamboo_stool")
    private List<Houseware> bambooStool;

    @SerializedName("spooky_chair")
    private List<Houseware> spookyChair;

    @SerializedName("wheelchair")
    private List<Houseware> wheelchair;

    @SerializedName("garbage_bin")
    private List<Houseware> garbageBin;

    @SerializedName("pet_bed")
    private List<Houseware> petBed;

    @SerializedName("diner_chair")
    private List<Houseware> dinerChair;

    @SerializedName("moai_statue")
    private List<Houseware> moaiStatue;

    @SerializedName("jukebox")
    private List<Houseware> jukebox;

    @SerializedName("floor_seat")
    private List<Houseware> floorSeat;

    @SerializedName("sand_castle")
    private List<Houseware> sandCastle;

    @SerializedName("playground_gym")
    private List<Houseware> playgroundGym;

    @SerializedName("Turkey_Day_hearth")
    private List<Houseware> turkeyDayHearth;

    @SerializedName("street_piano")
    private List<Houseware> streetPiano;

    @SerializedName("log_round_table")
    private List<Houseware> logRoundTable;

    @SerializedName("tiny_library")
    private List<Houseware> tinyLibrary;

    @SerializedName("leaf_stool")
    private List<Houseware> leafStool;

    @SerializedName("modern_office_chair")
    private List<Houseware> modernOfficeChair;

    @SerializedName("studio_spotlight")
    private List<Houseware> studioSpotlight;

    @SerializedName("tall_garden_rock")
    private List<Houseware> tallGardenRock;

    @SerializedName("deluxe_washer")
    private List<Houseware> deluxeWasher;

    @SerializedName("antique_bureau")
    private List<Houseware> antiqueBureau;

    @SerializedName("exercise_ball")
    private List<Houseware> exerciseBall;

    @SerializedName("Statue_of_Liberty")
    private List<Houseware> statueOfLiberty;

    @SerializedName("log_decorative_shelves")
    private List<Houseware> logDecorativeShelves;

    @SerializedName("campsite_sign")
    private List<Houseware> campsiteSign;

    @SerializedName("shell_fountain")
    private List<Houseware> shellFountain;

    @SerializedName("bamboo_doll")
    private List<Houseware> bambooDoll;

    @SerializedName("antique_console_table")
    private List<Houseware> antiqueConsoleTable;

    @SerializedName("mermaid_vanity")
    private List<Houseware> mermaidVanity;

    @SerializedName("small_Mushroom_Platform")
    private List<Houseware> smallMushroomPlatform;

    @SerializedName("cello")
    private List<Houseware> cello;

    @SerializedName("neutral_corner")
    private List<Houseware> neutralCorner;

    @SerializedName("silver_mic")
    private List<Houseware> silverMic;

    @SerializedName("cardboard_table")
    private List<Houseware> cardboardTable;

    @SerializedName("cardboard_chair")
    private List<Houseware> cardboardChair;

    @SerializedName("?_Block")
    private List<Houseware> unknownBlock;

    @SerializedName("lecture-hall_desk")
    private List<Houseware> lectureHallDesk;

    @SerializedName("bonsai_shelf")
    private List<Houseware> bonsaiShelf;

    @SerializedName("pirate-ship_cannon")
    private List<Houseware> pirateShipCannon;

    @SerializedName("butter_churn")
    private List<Houseware> butterChurn;

    @SerializedName("stone_lion-dog")
    private List<Houseware> stoneLionDog;

    @SerializedName("orange_end_table")
    private List<Houseware> orangeEndTable;

    @SerializedName("wedding_table")
    private List<Houseware> weddingTable;

    @SerializedName("bamboo_noodle_slide")
    private List<Houseware> bambooNoodleSlide;

    @SerializedName("clothesline_pole")
    private List<Houseware> clotheslinePole;

    @SerializedName("cone")
    private List<Houseware> cone;

    @SerializedName("plain_sink")
    private List<Houseware> plainSink;

    @SerializedName("exercise_bike")
    private List<Houseware> exerciseBike;

    @SerializedName("fan")
    private List<Houseware> fan;

    @SerializedName("inflatable_sofa")
    private List<Houseware> inflatableSofa;

    @SerializedName("bamboo_stopblock")
    private List<Houseware> bambooStopblock;

    @SerializedName("log_garden_lounge")
    private List<Houseware> logGardenLounge;

    @SerializedName("frozen_tree")
    private List<Houseware> frozenTree;

    @SerializedName("outdoor_table")
    private List<Houseware> outdoorTable;

    @SerializedName("log_stool")
    private List<Houseware> logStool;

    @SerializedName("big_festive_tree")
    private List<Houseware> bigFestiveTree;

    @SerializedName("flower_stand")
    private List<Houseware> flowerStand;

    @SerializedName("study_chair")
    private List<Houseware> studyChair;

    @SerializedName("throwback_rocket")
    private List<Houseware> throwbackRocket;

    @SerializedName("Festivale_balloon_lamp")
    private List<Houseware> festivaleBalloonLamp;

    @SerializedName("upright_vacuum")
    private List<Houseware> uprightVacuum;

    @SerializedName("flying_saucer")
    private List<Houseware> flyingSaucer;

    @SerializedName("mermaid_shelf")
    private List<Houseware> mermaidShelf;

    @SerializedName("wooden_low_table")
    private List<Houseware> woodenLowTable;

    @SerializedName("peach_chair")
    private List<Houseware> peachChair;

    @SerializedName("standard_umbrella_stand")
    private List<Houseware> standardUmbrellaStand;

    @SerializedName("cotton-candy_stall")
    private List<Houseware> cottonCandyStall;

    @SerializedName("golf_bag")
    private List<Houseware> golfBag;

    @SerializedName("Luna's_bed")
    private List<Houseware> lunaSBed;

    @SerializedName("manhole_cover")
    private List<Houseware> manholeCover;

    @SerializedName("park_clock")
    private List<Houseware> parkClock;

    @SerializedName("birdcage")
    private List<Houseware> birdcage;

    @SerializedName("simple_panel")
    private List<Houseware> simplePanel;

    @SerializedName("Turkey_Day_garden_stand")
    private List<Houseware> turkeyDayGardenStand;

    @SerializedName("spooky_standing_lamp")
    private List<Houseware> spookyStandingLamp;

    @SerializedName("moon")
    private List<Houseware> moon;

    @SerializedName("palm-tree_lamp")
    private List<Houseware> palmTreeLamp;

    @SerializedName("monstera")
    private List<Houseware> monstera;

    @SerializedName("imperial_partition")
    private List<Houseware> imperialPartition;

    @SerializedName("Festivale_flag")
    private List<Houseware> festivaleFlag;

    @SerializedName("pile_of_leaves")
    private List<Houseware> pileOfLeaves;

    @SerializedName("beach_chair")
    private List<Houseware> beachChair;

    @SerializedName("poolside_bed")
    private List<Houseware> poolsideBed;

    @SerializedName("ironwood_bed")
    private List<Houseware> ironwoodBed;

    @SerializedName("illuminated_reindeer")
    private List<Houseware> illuminatedReindeer;

    @SerializedName("lunar_lander")
    private List<Houseware> lunarLander;

    @SerializedName("spooky_table")
    private List<Houseware> spookyTable;

    @SerializedName("Aquarius_urn")
    private List<Houseware> aquariusUrn;

    @SerializedName("toilet-cleaning_set")
    private List<Houseware> toiletCleaningSet;

    @SerializedName("wooden-block_bed")
    private List<Houseware> woodenBlockBed;

    @SerializedName("antique_mini_table")
    private List<Houseware> antiqueMiniTable;

    @SerializedName("Papa_bear")
    private List<Houseware> papaBear;

    @SerializedName("fireplace")
    private List<Houseware> fireplace;

    @SerializedName("crescent-moon_chair")
    private List<Houseware> crescentMoonChair;

    @SerializedName("standing_toilet")
    private List<Houseware> standingToilet;

    @SerializedName("cardboard_bed")
    private List<Houseware> cardboardBed;

    @SerializedName("garden_lantern")
    private List<Houseware> gardenLantern;

    @SerializedName("imperial_low_table")
    private List<Houseware> imperialLowTable;

    @SerializedName("squat_toilet")
    private List<Houseware> squatToilet;

    @SerializedName("Bunny_Day_table")
    private List<Houseware> bunnyDayTable;

    @SerializedName("mermaid_dresser")
    private List<Houseware> mermaidDresser;

    @SerializedName("shell_partition")
    private List<Houseware> shellPartition;

    @SerializedName("golden_toilet")
    private List<Houseware> goldenToilet;

    @SerializedName("iron_worktable")
    private List<Houseware> ironWorktable;

    @SerializedName("pirate-treasure_chest")
    private List<Houseware> pirateTreasureChest;

    @SerializedName("weight_bench")
    private List<Houseware> weightBench;

    @SerializedName("lunar_rover")
    private List<Houseware> lunarRover;

    @SerializedName("hammock")
    private List<Houseware> hammock;

    @SerializedName("cute_tea_table")
    private List<Houseware> cuteTeaTable;

    @SerializedName("barrel")
    private List<Houseware> barrel;

    @SerializedName("elephant_slide")
    private List<Houseware> elephantSlide;

    @SerializedName("fresh_cooler")
    private List<Houseware> freshCooler;

    @SerializedName("Bunny_Day_festive_balloons")
    private List<Houseware> bunnyDayFestiveBalloons;

    @SerializedName("champion's_pennant")
    private List<Houseware> championSPennant;

    @SerializedName("rattan_end_table")
    private List<Houseware> rattanEndTable;

    @SerializedName("cardboard_sofa")
    private List<Houseware> cardboardSofa;

    @SerializedName("throwback_race-car_bed")
    private List<Houseware> throwbackRaceCarBed;

    @SerializedName("Virgo_harp")
    private List<Houseware> virgoHarp;

    @SerializedName("mermaid_chair")
    private List<Houseware> mermaidChair;

    @SerializedName("changing_room")
    private List<Houseware> changingRoom;

    @SerializedName("tricycle")
    private List<Houseware> tricycle;

    @SerializedName("Festivale_drum")
    private List<Houseware> festivaleDrum;

    @SerializedName("gas_range")
    private List<Houseware> gasRange;

    @SerializedName("western-style_stone")
    private List<Houseware> westernStyleStone;

    @SerializedName("hay_bed")
    private List<Houseware> hayBed;

    @SerializedName("TV_camera")
    private List<Houseware> tVCamera;

    @SerializedName("mush_lamp")
    private List<Houseware> mushLamp;

    @SerializedName("music_stand")
    private List<Houseware> musicStand;

    @SerializedName("tall_lantern")
    private List<Houseware> tallLantern;

    @SerializedName("barbell")
    private List<Houseware> barbell;

    @SerializedName("wooden_double_bed")
    private List<Houseware> woodenDoubleBed;

    @SerializedName("blue_corner")
    private List<Houseware> blueCorner;

    @SerializedName("jail_bars")
    private List<Houseware> jailBars;

    @SerializedName("public_bench")
    private List<Houseware> publicBench;

    @SerializedName("grand_piano")
    private List<Houseware> grandPiano;

    @SerializedName("whirlpool_bath")
    private List<Houseware> whirlpoolBath;

    @SerializedName("colorful_wheel")
    private List<Houseware> colorfulWheel;

    @SerializedName("tool_shelf")
    private List<Houseware> toolShelf;

    @SerializedName("tourist_telescope")
    private List<Houseware> touristTelescope;

    @SerializedName("campfire")
    private List<Houseware> campfire;

    @SerializedName("wooden_stool")
    private List<Houseware> woodenStool;

    @SerializedName("kids'_tent")
    private List<Houseware> kidsTent;

    @SerializedName("school_desk")
    private List<Houseware> schoolDesk;

    @SerializedName("rattan_bed")
    private List<Houseware> rattanBed;

    @SerializedName("spooky_arch")
    private List<Houseware> spookyArch;

    @SerializedName("drink_machine")
    private List<Houseware> drinkMachine;

    @SerializedName("cypress_bathtub")
    private List<Houseware> cypressBathtub;

    @SerializedName("iron_closet")
    private List<Houseware> ironCloset;

    @SerializedName("pirate_barrel")
    private List<Houseware> pirateBarrel;

    @SerializedName("throwback_hat_table")
    private List<Houseware> throwbackHatTable;

    @SerializedName("bathroom_sink")
    private List<Houseware> bathroomSink;

    @SerializedName("hinaningyo")
    private List<Houseware> hinaningyo;

    @SerializedName("oil_barrel")
    private List<Houseware> oilBarrel;

    @SerializedName("Mama_panda")
    private List<Houseware> mamaPanda;

    @SerializedName("clothesline")
    private List<Houseware> clothesline;

    @SerializedName("safe")
    private List<Houseware> safe;

    @SerializedName("natural_garden_table")
    private List<Houseware> naturalGardenTable;

    @SerializedName("frozen_sculpture")
    private List<Houseware> frozenSculpture;

    @SerializedName("soccer_goal")
    private List<Houseware> soccerGoal;

    @SerializedName("lighthouse")
    private List<Houseware> lighthouse;

    @SerializedName("kitty_litter_box")
    private List<Houseware> kittyLitterBox;

    @SerializedName("ironwood_chair")
    private List<Houseware> ironwoodChair;

    @SerializedName("wooden-block_table")
    private List<Houseware> woodenBlockTable;

    @SerializedName("mossy_garden_rock")
    private List<Houseware> mossyGardenRock;

    @SerializedName("whiteboard")
    private List<Houseware> whiteboard;

    @SerializedName("asteroid")
    private List<Houseware> asteroid;

    @SerializedName("golden_seat")
    private List<Houseware> goldenSeat;

    @SerializedName("hearth")
    private List<Houseware> hearth;

    @SerializedName("rattan_armchair")
    private List<Houseware> rattanArmchair;

    @SerializedName("dartboard")
    private List<Houseware> dartboard;

    @SerializedName("climbing_wall")
    private List<Houseware> climbingWall;

    @SerializedName("cute_DIY_table")
    private List<Houseware> cuteDIYTable;

    @SerializedName("folding_chair")
    private List<Houseware> foldingChair;

    @SerializedName("stone_stool")
    private List<Houseware> stoneStool;

    @SerializedName("grand_Q._A._birdwing_model")
    private List<Houseware> grandQABirdwingModel;

    @SerializedName("wooden_bucket")
    private List<Houseware> woodenBucket;

    @SerializedName("Goal_Pole")
    private List<Houseware> goalPole;

    @SerializedName("bamboo_partition")
    private List<Houseware> bambooPartition;

    @SerializedName("office_desk")
    private List<Houseware> officeDesk;

    @SerializedName("crewed_spaceship")
    private List<Houseware> crewedSpaceship;

    @SerializedName("DIY_workbench")
    private List<Houseware> dIYWorkbench;

    @SerializedName("termite_mound")
    private List<Houseware> termiteMound;

    @SerializedName("frozen_table")
    private List<Houseware> frozenTable;

    @SerializedName("iron_garden_table")
    private List<Houseware> ironGardenTable;

    @SerializedName("go_board")
    private List<Houseware> goBoard;

    @SerializedName("apple_chair")
    private List<Houseware> appleChair;

    @SerializedName("diner_counter_chair")
    private List<Houseware> dinerCounterChair;

    @SerializedName("utility_sink")
    private List<Houseware> utilitySink;

    @SerializedName("futon")
    private List<Houseware> futon;

    @SerializedName("wood-burning_stove")
    private List<Houseware> woodBurningStove;

    @SerializedName("antique_bed")
    private List<Houseware> antiqueBed;

    @SerializedName("spooky_tower")
    private List<Houseware> spookyTower;

    @SerializedName("tree's_bounty_big_tree")
    private List<Houseware> treeSBountyBigTree;

    @SerializedName("garbage_can")
    private List<Houseware> garbageCan;

    @SerializedName("bidet")
    private List<Houseware> bidet;

    @SerializedName("construction_sign")
    private List<Houseware> constructionSign;

    @SerializedName("flashy-flower_sign")
    private List<Houseware> flashyFlowerSign;

    public List<Houseware> getSleigh() {
        return sleigh;
    }

    public List<Houseware> getArtisanalBugCage() {
        return artisanalBugCage;
    }

    public List<Houseware> getDrumSet() {
        return drumSet;
    }

    public List<Houseware> getElectricKickScooter() {
        return electricKickScooter;
    }

    public List<Houseware> getPapaPanda() {
        return papaPanda;
    }

    public List<Houseware> getKitchenIsland() {
        return kitchenIsland;
    }

    public List<Houseware> getMermaidCloset() {
        return mermaidCloset;
    }

    public List<Houseware> getLargeMushroomPlatform() {
        return largeMushroomPlatform;
    }

    public List<Houseware> getHandcart() {
        return handcart;
    }

    public List<Houseware> getAnatomicalModel() {
        return anatomicalModel;
    }

    public List<Houseware> getBunnyDayMerryBalloons() {
        return bunnyDayMerryBalloons;
    }

    public List<Houseware> getRattanStool() {
        return rattanStool;
    }

    public List<Houseware> getTeaTable() {
        return teaTable;
    }

    public List<Houseware> getImperialDiningTable() {
        return imperialDiningTable;
    }

    public List<Houseware> getDrinkingFountain() {
        return drinkingFountain;
    }

    public List<Houseware> getOutdoorAirConditioner() {
        return outdoorAirConditioner;
    }

    public List<Houseware> getSpinningWheel() {
        return spinningWheel;
    }

    public List<Houseware> getMediumCardboardBoxes() {
        return mediumCardboardBoxes;
    }

    public List<Houseware> getBambooShelf() {
        return bambooShelf;
    }

    public List<Houseware> getMushPartition() {
        return mushPartition;
    }

    public List<Houseware> getPool() {
        return pool;
    }

    public List<Houseware> getMermaidScreen() {
        return mermaidScreen;
    }

    public List<Houseware> getStonehenge() {
        return stonehenge;
    }

    public List<Houseware> getSimpleDIYWorkbench() {
        return simpleDIYWorkbench;
    }

    public List<Houseware> getBoxSofa() {
        return boxSofa;
    }

    public List<Houseware> getBambooGrass() {
        return bambooGrass;
    }

    public List<Houseware> getOutdoorGenerator() {
        return outdoorGenerator;
    }

    public List<Houseware> getToyDaySleigh() {
        return toyDaySleigh;
    }

    public List<Houseware> getImperialDiningChair() {
        return imperialDiningChair;
    }

    public List<Houseware> getMushLog() {
        return mushLog;
    }

    public List<Houseware> getFestiveTree() {
        return festiveTree;
    }

    public List<Houseware> getZenStyleStone() {
        return zenStyleStone;
    }

    public List<Houseware> getTanklessToilet() {
        return tanklessToilet;
    }

    public List<Houseware> getLoftBedWithDesk() {
        return loftBedWithDesk;
    }

    public List<Houseware> getTrainSet() {
        return trainSet;
    }

    public List<Houseware> getMermaidLamp() {
        return mermaidLamp;
    }

    public List<Houseware> getAltoSaxophone() {
        return altoSaxophone;
    }

    public List<Houseware> getCypressPlant() {
        return cypressPlant;
    }

    public List<Houseware> getIronwoodCart() {
        return ironwoodCart;
    }

    public List<Houseware> getTennisTable() {
        return tennisTable;
    }

    public List<Houseware> getImperialChest() {
        return imperialChest;
    }

    public List<Houseware> getStreetlamp() {
        return streetlamp;
    }

    public List<Houseware> getAstronautSuit() {
        return astronautSuit;
    }

    public List<Houseware> getWoodenBookshelf() {
        return woodenBookshelf;
    }

    public List<Houseware> getYellowLeafPile() {
        return yellowLeafPile;
    }

    public List<Houseware> getLogExtraLongSofa() {
        return logExtraLongSofa;
    }

    public List<Houseware> getSimpleWell() {
        return simpleWell;
    }

    public List<Houseware> getBlossomViewingLantern() {
        return blossomViewingLantern;
    }

    public List<Houseware> getDoubleSofa() {
        return doubleSofa;
    }

    public List<Houseware> getFrozenArch() {
        return frozenArch;
    }

    public List<Houseware> getMushParasol() {
        return mushParasol;
    }

    public List<Houseware> getDinerDiningTable() {
        return dinerDiningTable;
    }

    public List<Houseware> getGarbagePail() {
        return garbagePail;
    }

    public List<Houseware> getWoodenWasteBin() {
        return woodenWasteBin;
    }

    public List<Houseware> getCuteBed() {
        return cuteBed;
    }

    public List<Houseware> getArcadeCombatGame() {
        return arcadeCombatGame;
    }

    public List<Houseware> getBasketballHoop() {
        return basketballHoop;
    }

    public List<Houseware> getWoodenBlockBench() {
        return woodenBlockBench;
    }

    public List<Houseware> getAcousticGuitar() {
        return acousticGuitar;
    }

    public List<Houseware> getDenDesk() {
        return denDesk;
    }

    public List<Houseware> getLargeCardboardBoxes() {
        return largeCardboardBoxes;
    }

    public List<Houseware> getClothesCloset() {
        return clothesCloset;
    }

    public List<Houseware> getArcadeFightingGame() {
        return arcadeFightingGame;
    }

    public List<Houseware> getPiscesLamp() {
        return piscesLamp;
    }

    public List<Houseware> getAngledSignpost() {
        return angledSignpost;
    }

    public List<Houseware> getPagoda() {
        return pagoda;
    }

    public List<Houseware> getRoundSpaceHeater() {
        return roundSpaceHeater;
    }

    public List<Houseware> getWaterPump() {
        return waterPump;
    }

    public List<Houseware> getRattanVanity() {
        return rattanVanity;
    }

    public List<Houseware> getRockingHorse() {
        return rockingHorse;
    }

    public List<Houseware> getWeddingWelcomeBoard() {
        return weddingWelcomeBoard;
    }

    public List<Houseware> getTreadmill() {
        return treadmill;
    }

    public List<Houseware> getVideoCamera() {
        return videoCamera;
    }

    public List<Houseware> getStoneTable() {
        return stoneTable;
    }

    public List<Houseware> getCherryBlossomPondStone() {
        return cherryBlossomPondStone;
    }

    public List<Houseware> getBunnyDayStool() {
        return bunnyDayStool;
    }

    public List<Houseware> getGong() {
        return gong;
    }

    public List<Houseware> getSkeleton() {
        return skeleton;
    }

    public List<Houseware> getMountainBike() {
        return mountainBike;
    }

    public List<Houseware> getBunnyDayWardrobe() {
        return bunnyDayWardrobe;
    }

    public List<Houseware> getFrozenCounter() {
        return frozenCounter;
    }

    public List<Houseware> getShellTable() {
        return shellTable;
    }

    public List<Houseware> getStoneArch() {
        return stoneArch;
    }

    public List<Houseware> getWaterCooler() {
        return waterCooler;
    }

    public List<Houseware> getStadiometer() {
        return stadiometer;
    }

    public List<Houseware> getTulipSurpriseBox() {
        return tulipSurpriseBox;
    }

    public List<Houseware> getIronwoodCupboard() {
        return ironwoodCupboard;
    }

    public List<Houseware> getBambooFloorLamp() {
        return bambooFloorLamp;
    }

    public List<Houseware> getClackercart() {
        return clackercart;
    }

    public List<Houseware> getSleepingBag() {
        return sleepingBag;
    }

    public List<Houseware> getUprightPiano() {
        return uprightPiano;
    }

    public List<Houseware> getFreezer() {
        return freezer;
    }

    public List<Houseware> getSolarPanel() {
        return solarPanel;
    }

    public List<Houseware> getTireToy() {
        return tireToy;
    }

    public List<Houseware> getBonfire() {
        return bonfire;
    }

    public List<Houseware> getPansyTable() {
        return pansyTable;
    }

    public List<Houseware> getRefrigerator() {
        return refrigerator;
    }

    public List<Houseware> getDoubleDoorRefrigerator() {
        return doubleDoorRefrigerator;
    }

    public List<Houseware> getPondStone() {
        return pondStone;
    }

    public List<Houseware> getBunnyDayVanity() {
        return bunnyDayVanity;
    }

    public List<Houseware> getGrassStandee() {
        return grassStandee;
    }

    public List<Houseware> getSynthesizer() {
        return synthesizer;
    }

    public List<Houseware> getWoodenEndTable() {
        return woodenEndTable;
    }

    public List<Houseware> getGrandAtlasMothModel() {
        return grandAtlasMothModel;
    }

    public List<Houseware> getMarimba() {
        return marimba;
    }

    public List<Houseware> getFanPalm() {
        return fanPalm;
    }

    public List<Houseware> getHarp() {
        return harp;
    }

    public List<Houseware> getTikiTorch() {
        return tikiTorch;
    }

    public List<Houseware> getFrozenBed() {
        return frozenBed;
    }

    public List<Houseware> getAntiqueChair() {
        return antiqueChair;
    }

    public List<Houseware> getImperialBed() {
        return imperialBed;
    }

    public List<Houseware> getBabyChair() {
        return babyChair;
    }

    public List<Houseware> getCapricornOrnament() {
        return capricornOrnament;
    }

    public List<Houseware> getUtilityPole() {
        return utilityPole;
    }

    public List<Houseware> getScarecrow() {
        return scarecrow;
    }

    public List<Houseware> getFrozenPartition() {
        return frozenPartition;
    }

    public List<Houseware> getJuicyAppleTV() {
        return juicyAppleTV;
    }

    public List<Houseware> getWeddingArch() {
        return weddingArch;
    }

    public List<Houseware> getShowerBooth() {
        return showerBooth;
    }

    public List<Houseware> getFestivaleGarland() {
        return festivaleGarland;
    }

    public List<Houseware> getMiniDIYWorkbench() {
        return miniDIYWorkbench;
    }

    public List<Houseware> getRockingChair() {
        return rockingChair;
    }

    public List<Houseware> getMiniFridge() {
        return miniFridge;
    }

    public List<Houseware> getFishDryingRack() {
        return fishDryingRack;
    }

    public List<Houseware> getIlluminatedPresent() {
        return illuminatedPresent;
    }

    public List<Houseware> getSatellite() {
        return satellite;
    }

    public List<Houseware> getCherryBlossomPetalPile() {
        return cherryBlossomPetalPile;
    }

    public List<Houseware> getGardenWagon() {
        return gardenWagon;
    }

    public List<Houseware> getAnchorStatue() {
        return anchorStatue;
    }

    public List<Houseware> getGiftPile() {
        return giftPile;
    }

    public List<Houseware> getBilliardTable() {
        return billiardTable;
    }

    public List<Houseware> getPirateShipHelm() {
        return pirateShipHelm;
    }

    public List<Houseware> getHiFiStereo() {
        return hiFiStereo;
    }

    public List<Houseware> getDinerMiniTable() {
        return dinerMiniTable;
    }

    public List<Houseware> getSphinx() {
        return sphinx;
    }

    public List<Houseware> getStudyDesk() {
        return studyDesk;
    }

    public List<Houseware> getRodeoStyleSpringyRideOn() {
        return rodeoStyleSpringyRideOn;
    }

    public List<Houseware> getAntiqueTable() {
        return antiqueTable;
    }

    public List<Houseware> getDestinationsSignpost() {
        return destinationsSignpost;
    }

    public List<Houseware> getPyramid() {
        return pyramid;
    }

    public List<Houseware> getPearBed() {
        return pearBed;
    }

    public List<Houseware> getVelvetStool() {
        return velvetStool;
    }

    public List<Houseware> getFountain() {
        return fountain;
    }

    public List<Houseware> getFishingRodStand() {
        return fishingRodStand;
    }

    public List<Houseware> getCherryBlossomBranches() {
        return cherryBlossomBranches;
    }

    public List<Houseware> getBambooBasket() {
        return bambooBasket;
    }

    public List<Houseware> getBrickOven() {
        return brickOven;
    }

    public List<Houseware> getBrickWell() {
        return brickWell;
    }

    public List<Houseware> getWeddingPipeOrgan() {
        return weddingPipeOrgan;
    }

    public List<Houseware> getGiantTeddyBear() {
        return giantTeddyBear;
    }

    public List<Houseware> getTatamiBed() {
        return tatamiBed;
    }

    public List<Houseware> getElaborateKimonoStand() {
        return elaborateKimonoStand;
    }

    public List<Houseware> getPantsPress() {
        return pantsPress;
    }

    public List<Houseware> getRocketLamp() {
        return rocketLamp;
    }

    public List<Houseware> getBlock() {
        return block;
    }

    public List<Houseware> getIronFrame() {
        return ironFrame;
    }

    public List<Houseware> getWeddingChair() {
        return weddingChair;
    }

    public List<Houseware> getCacaoTree() {
        return cacaoTree;
    }

    public List<Houseware> getDJSTurntable() {
        return dJSTurntable;
    }

    public List<Houseware> getStall() {
        return stall;
    }

    public List<Houseware> getDenChair() {
        return denChair;
    }

    public List<Houseware> getFlatGardenRock() {
        return flatGardenRock;
    }

    public List<Houseware> getIronwoodTable() {
        return ironwoodTable;
    }

    public List<Houseware> getWoodenBlockChest() {
        return woodenBlockChest;
    }

    public List<Houseware> getJsonMember2021CelebratoryArch() {
        return jsonMember2021CelebratoryArch;
    }

    public List<Houseware> getSpookyLanternSet() {
        return spookyLanternSet;
    }

    public List<Houseware> getCuteVanity() {
        return cuteVanity;
    }

    public List<Houseware> getPodium() {
        return podium;
    }

    public List<Houseware> getRattanWasteBin() {
        return rattanWasteBin;
    }

    public List<Houseware> getIronShelf() {
        return ironShelf;
    }

    public List<Houseware> getThrowbackDinoScreen() {
        return throwbackDinoScreen;
    }

    public List<Houseware> getElectricGuitar() {
        return electricGuitar;
    }

    public List<Houseware> getSoftServeLamp() {
        return softServeLamp;
    }

    public List<Houseware> getRetroStereo() {
        return retroStereo;
    }

    public List<Houseware> getServer() {
        return server;
    }

    public List<Houseware> getLilyRecordPlayer() {
        return lilyRecordPlayer;
    }

    public List<Houseware> getFestivaleStall() {
        return festivaleStall;
    }

    public List<Houseware> getBunnyDayArch() {
        return bunnyDayArch;
    }

    public List<Houseware> getSignpost() {
        return signpost;
    }

    public List<Houseware> getGrandBDragonflyModel() {
        return grandBDragonflyModel;
    }

    public List<Houseware> getAntiqueVanity() {
        return antiqueVanity;
    }

    public List<Houseware> getShadedFloorLamp() {
        return shadedFloorLamp;
    }

    public List<Houseware> getSpringyRideOn() {
        return springyRideOn;
    }

    public List<Houseware> getMountainStandee() {
        return mountainStandee;
    }

    public List<Houseware> getPaperLantern() {
        return paperLantern;
    }

    public List<Houseware> getKotatsu() {
        return kotatsu;
    }

    public List<Houseware> getBarbecue() {
        return barbecue;
    }

    public List<Houseware> getBunnyDayBed() {
        return bunnyDayBed;
    }

    public List<Houseware> getVintageTVTray() {
        return vintageTVTray;
    }

    public List<Houseware> getSidewaysPirateBarrel() {
        return sidewaysPirateBarrel;
    }

    public List<Houseware> getBambooBench() {
        return bambooBench;
    }

    public List<Houseware> getLifeguardChair() {
        return lifeguardChair;
    }

    public List<Houseware> getLogBed() {
        return logBed;
    }

    public List<Houseware> getPileOfZenCushions() {
        return pileOfZenCushions;
    }

    public List<Houseware> getRobotHero() {
        return robotHero;
    }

    public List<Houseware> getMushLowStool() {
        return mushLowStool;
    }

    public List<Houseware> getGardenRock() {
        return gardenRock;
    }

    public List<Houseware> getFoosballTable() {
        return foosballTable;
    }

    public List<Houseware> getWoodenWardrobe() {
        return woodenWardrobe;
    }

    public List<Houseware> getHedgeStandee() {
        return hedgeStandee;
    }

    public List<Houseware> getEffectsRack() {
        return effectsRack;
    }

    public List<Houseware> getTaurusBathtub() {
        return taurusBathtub;
    }

    public List<Houseware> getMermaidTable() {
        return mermaidTable;
    }

    public List<Houseware> getChalkboard() {
        return chalkboard;
    }

    public List<Houseware> getRCHelicopter() {
        return rCHelicopter;
    }

    public List<Houseware> getPullUpBarStand() {
        return pullUpBarStand;
    }

    public List<Houseware> getOKMotorsSign() {
        return oKMotorsSign;
    }

    public List<Houseware> getAutomaticWasher() {
        return automaticWasher;
    }

    public List<Houseware> getDinerCounterTable() {
        return dinerCounterTable;
    }

    public List<Houseware> getRoseBed() {
        return roseBed;
    }

    public List<Houseware> getMermaidSofa() {
        return mermaidSofa;
    }

    public List<Houseware> getScreen() {
        return screen;
    }

    public List<Houseware> getThreeTieredSnowperson() {
        return threeTieredSnowperson;
    }

    public List<Houseware> getDinerSofa() {
        return dinerSofa;
    }

    public List<Houseware> getElectricBass() {
        return electricBass;
    }

    public List<Houseware> getTableWithCloth() {
        return tableWithCloth;
    }

    public List<Houseware> getMenuChalkboard() {
        return menuChalkboard;
    }

    public List<Houseware> getIronGardenChair() {
        return ironGardenChair;
    }

    public List<Houseware> getMapleLeafPondStone() {
        return mapleLeafPondStone;
    }

    public List<Houseware> getRedCorner() {
        return redCorner;
    }

    public List<Houseware> getPipe() {
        return pipe;
    }

    public List<Houseware> getIronwoodKitchenette() {
        return ironwoodKitchenette;
    }

    public List<Houseware> getAntiqueClock() {
        return antiqueClock;
    }

    public List<Houseware> getCuteFloorLamp() {
        return cuteFloorLamp;
    }

    public List<Houseware> getOutdoorBath() {
        return outdoorBath;
    }

    public List<Houseware> getCuteChair() {
        return cuteChair;
    }

    public List<Houseware> getOutdoorPicnicSet() {
        return outdoorPicnicSet;
    }

    public List<Houseware> getNaturalGardenChair() {
        return naturalGardenChair;
    }

    public List<Houseware> getNaturalSquareTable() {
        return naturalSquareTable;
    }

    public List<Houseware> getOpenFrameKitchen() {
        return openFrameKitchen;
    }

    public List<Houseware> getFestivaleParasol() {
        return festivaleParasol;
    }

    public List<Houseware> getThrowbackMittChair() {
        return throwbackMittChair;
    }

    public List<Houseware> getClawFootTub() {
        return clawFootTub;
    }

    public List<Houseware> getWoodenFullLengthMirror() {
        return woodenFullLengthMirror;
    }

    public List<Houseware> getWoodenSimpleBed() {
        return woodenSimpleBed;
    }

    public List<Houseware> getMarketPlaceDecoration() {
        return marketPlaceDecoration;
    }

    public List<Houseware> getSouthPole() {
        return southPole;
    }

    public List<Houseware> getYucca() {
        return yucca;
    }

    public List<Houseware> getClayFurnace() {
        return clayFurnace;
    }

    public List<Houseware> getWoodenMiniTable() {
        return woodenMiniTable;
    }

    public List<Houseware> getRockGuitar() {
        return rockGuitar;
    }

    public List<Houseware> getPlasticPool() {
        return plasticPool;
    }

    public List<Houseware> getAriesRockingChair() {
        return ariesRockingChair;
    }

    public List<Houseware> getSaunaHeater() {
        return saunaHeater;
    }

    public List<Houseware> getIlluminatedSnowflakes() {
        return illuminatedSnowflakes;
    }

    public List<Houseware> getGoldenCasket() {
        return goldenCasket;
    }

    public List<Houseware> getSnackMachine() {
        return snackMachine;
    }

    public List<Houseware> getServingCart() {
        return servingCart;
    }

    public List<Houseware> getCampfireCookware() {
        return campfireCookware;
    }

    public List<Houseware> getIronHangerStand() {
        return ironHangerStand;
    }

    public List<Houseware> getParabolicAntenna() {
        return parabolicAntenna;
    }

    public List<Houseware> getPhoneBox() {
        return phoneBox;
    }

    public List<Houseware> getFloatingBlock() {
        return floatingBlock;
    }

    public List<Houseware> getFoldingFloorLamp() {
        return foldingFloorLamp;
    }

    public List<Houseware> getSpookyCarriage() {
        return spookyCarriage;
    }

    public List<Houseware> getPianoBench() {
        return pianoBench;
    }

    public List<Houseware> getOilBarrelBathtub() {
        return oilBarrelBathtub;
    }

    public List<Houseware> getDeerScare() {
        return deerScare;
    }

    public List<Houseware> getAntiqueWardrobe() {
        return antiqueWardrobe;
    }

    public List<Houseware> getBeachTowel() {
        return beachTowel;
    }

    public List<Houseware> getTreeSBountyArch() {
        return treeSBountyArch;
    }

    public List<Houseware> getShellStool() {
        return shellStool;
    }

    public List<Houseware> getZenCushion() {
        return zenCushion;
    }

    public List<Houseware> getFestivaleStage() {
        return festivaleStage;
    }

    public List<Houseware> getSandbox() {
        return sandbox;
    }

    public List<Houseware> getLogChair() {
        return logChair;
    }

    public List<Houseware> getSpookyScarecrow() {
        return spookyScarecrow;
    }

    public List<Houseware> getLogStakes() {
        return logStakes;
    }

    public List<Houseware> getTireStack() {
        return tireStack;
    }

    public List<Houseware> getMushTable() {
        return mushTable;
    }

    public List<Houseware> getStoneTablet() {
        return stoneTablet;
    }

    public List<Houseware> getWoodenBlockChair() {
        return woodenBlockChair;
    }

    public List<Houseware> getWoodenBlockBookshelf() {
        return woodenBlockBookshelf;
    }

    public List<Houseware> getCampingCot() {
        return campingCot;
    }

    public List<Houseware> getDirectorSChair() {
        return directorSChair;
    }

    public List<Houseware> getMicStand() {
        return micStand;
    }

    public List<Houseware> getMonsterStatue() {
        return monsterStatue;
    }

    public List<Houseware> getBirdbath() {
        return birdbath;
    }

    public List<Houseware> getOutdoorBench() {
        return outdoorBench;
    }

    public List<Houseware> getFrozenChair() {
        return frozenChair;
    }

    public List<Houseware> getRattanLowTable() {
        return rattanLowTable;
    }

    public List<Houseware> getMermaidBed() {
        return mermaidBed;
    }

    public List<Houseware> getTurkeyDayTable() {
        return turkeyDayTable;
    }

    public List<Houseware> getRetroGasPump() {
        return retroGasPump;
    }

    public List<Houseware> getIronwoodDIYWorkbench() {
        return ironwoodDIYWorkbench;
    }

    public List<Houseware> getRocket() {
        return rocket;
    }

    public List<Houseware> getSwingingBench() {
        return swingingBench;
    }

    public List<Houseware> getArcadeSeat() {
        return arcadeSeat;
    }

    public List<Houseware> getIronGardenBench() {
        return ironGardenBench;
    }

    public List<Houseware> getFloorLight() {
        return floorLight;
    }

    public List<Houseware> getTeacupRide() {
        return teacupRide;
    }

    public List<Houseware> getCuteSofa() {
        return cuteSofa;
    }

    public List<Houseware> getKettleBathtub() {
        return kettleBathtub;
    }

    public List<Houseware> getSpeedBag() {
        return speedBag;
    }

    public List<Houseware> getBeekeeperSHive() {
        return beekeeperSHive;
    }

    public List<Houseware> getAirCirculator() {
        return airCirculator;
    }

    public List<Houseware> getCuteWardrobe() {
        return cuteWardrobe;
    }

    public List<Houseware> getDinerNeonSign() {
        return dinerNeonSign;
    }

    public List<Houseware> getDoghouse() {
        return doghouse;
    }

    public List<Houseware> getGardenFaucet() {
        return gardenFaucet;
    }

    public List<Houseware> getLowScreen() {
        return lowScreen;
    }

    public List<Houseware> getDigitalScale() {
        return digitalScale;
    }

    public List<Houseware> getHighEndStereo() {
        return highEndStereo;
    }

    public List<Houseware> getBunkBed() {
        return bunkBed;
    }

    public List<Houseware> getPlainWoodenShopSign() {
        return plainWoodenShopSign;
    }

    public List<Houseware> getFortuneCookieCart() {
        return fortuneCookieCart;
    }

    public List<Houseware> getRedLeafPile() {
        return redLeafPile;
    }

    public List<Houseware> getTrophyCase() {
        return trophyCase;
    }

    public List<Houseware> getBirthdaySign() {
        return birthdaySign;
    }

    public List<Houseware> getWindTurbine() {
        return windTurbine;
    }

    public List<Houseware> getToilet() {
        return toilet;
    }

    public List<Houseware> getSystemKitchen() {
        return systemKitchen;
    }

    public List<Houseware> getIroningBoard() {
        return ironingBoard;
    }

    public List<Houseware> getTelescope() {
        return telescope;
    }

    public List<Houseware> getTurkeyDayChair() {
        return turkeyDayChair;
    }

    public List<Houseware> getCosmosShower() {
        return cosmosShower;
    }

    public List<Houseware> getIlluminatedTree() {
        return illuminatedTree;
    }

    public List<Houseware> getMumCushion() {
        return mumCushion;
    }

    public List<Houseware> getSpaceShuttle() {
        return spaceShuttle;
    }

    public List<Houseware> getVacuumCleaner() {
        return vacuumCleaner;
    }

    public List<Houseware> getRaccoonFigurine() {
        return raccoonFigurine;
    }

    public List<Houseware> getSurfboard() {
        return surfboard;
    }

    public List<Houseware> getIronwoodDresser() {
        return ironwoodDresser;
    }

    public List<Houseware> getThwomp() {
        return thwomp;
    }

    public List<Houseware> getArcadeMahjongGame() {
        return arcadeMahjongGame;
    }

    public List<Houseware> getToolCart() {
        return toolCart;
    }

    public List<Houseware> getWeddingFlowerStand() {
        return weddingFlowerStand;
    }

    public List<Houseware> getWoodenChest() {
        return woodenChest;
    }

    public List<Houseware> getBirthdayTable() {
        return birthdayTable;
    }

    public List<Houseware> getScatteredPapers() {
        return scatteredPapers;
    }

    public List<Houseware> getBrakeTapper() {
        return brakeTapper;
    }

    public List<Houseware> getGreenLeafPile() {
        return greenLeafPile;
    }

    public List<Houseware> getCancerTable() {
        return cancerTable;
    }

    public List<Houseware> getFestivaleFloat() {
        return festivaleFloat;
    }

    public List<Houseware> getPortableToilet() {
        return portableToilet;
    }

    public List<Houseware> getLawnMower() {
        return lawnMower;
    }

    public List<Houseware> getMrsFlamingo() {
        return mrsFlamingo;
    }

    public List<Houseware> getRattanWardrobe() {
        return rattanWardrobe;
    }

    public List<Houseware> getDryingRack() {
        return dryingRack;
    }

    public List<Houseware> getKimonoStand() {
        return kimonoStand;
    }

    public List<Houseware> getIronwoodLowTable() {
        return ironwoodLowTable;
    }

    public List<Houseware> getCandyMachine() {
        return candyMachine;
    }

    public List<Houseware> getWoodenBlockStereo() {
        return woodenBlockStereo;
    }

    public List<Houseware> getFrozenPillar() {
        return frozenPillar;
    }

    public List<Houseware> getSilo() {
        return silo;
    }

    public List<Houseware> getStreetOrgan() {
        return streetOrgan;
    }

    public List<Houseware> getKadomatsu() {
        return kadomatsu;
    }

    public List<Houseware> getShellArch() {
        return shellArch;
    }

    public List<Houseware> getWildLogBench() {
        return wildLogBench;
    }

    public List<Houseware> getFirePit() {
        return firePit;
    }

    public List<Houseware> getSchoolChair() {
        return schoolChair;
    }

    public List<Houseware> getOceanSunfishModel() {
        return oceanSunfishModel;
    }

    public List<Houseware> getPunchingBag() {
        return punchingBag;
    }

    public List<Houseware> getShellBed() {
        return shellBed;
    }

    public List<Houseware> getRetroFan() {
        return retroFan;
    }

    public List<Houseware> getWoodenChair() {
        return woodenChair;
    }

    public List<Houseware> getLogDiningTable() {
        return logDiningTable;
    }

    public List<Houseware> getBasicTeacherSDesk() {
        return basicTeacherSDesk;
    }

    public List<Houseware> getLawnChair() {
        return lawnChair;
    }

    public List<Houseware> getSmoker() {
        return smoker;
    }

    public List<Houseware> getGeminiCloset() {
        return geminiCloset;
    }

    public List<Houseware> getLoom() {
        return loom;
    }

    public List<Houseware> getLongBathtub() {
        return longBathtub;
    }

    public List<Houseware> getMamaBear() {
        return mamaBear;
    }

    public List<Houseware> getPinballMachine() {
        return pinballMachine;
    }

    public List<Houseware> getMrFlamingo() {
        return mrFlamingo;
    }

    public List<Houseware> getTreeStandee() {
        return treeStandee;
    }

    public List<Houseware> getWeddingHeadTable() {
        return weddingHeadTable;
    }

    public List<Houseware> getBoxCornerSofa() {
        return boxCornerSofa;
    }

    public List<Houseware> getGardenBench() {
        return gardenBench;
    }

    public List<Houseware> getLeafCampfire() {
        return leafCampfire;
    }

    public List<Houseware> getLectureHallBench() {
        return lectureHallBench;
    }

    public List<Houseware> getTowerOfPisa() {
        return towerOfPisa;
    }

    public List<Houseware> getBirdhouse() {
        return birdhouse;
    }

    public List<Houseware> getLogBench() {
        return logBench;
    }

    public List<Houseware> getOldSewingMachine() {
        return oldSewingMachine;
    }

    public List<Houseware> getPearWardrobe() {
        return pearWardrobe;
    }

    public List<Houseware> getWoodenTable() {
        return woodenTable;
    }

    public List<Houseware> getHoseReel() {
        return hoseReel;
    }

    public List<Houseware> getFloorLamp() {
        return floorLamp;
    }

    public List<Houseware> getWaveBreaker() {
        return waveBreaker;
    }

    public List<Houseware> getBambooSpeaker() {
        return bambooSpeaker;
    }

    public List<Houseware> getWeddingBench() {
        return weddingBench;
    }

    public List<Houseware> getCatTower() {
        return catTower;
    }

    public List<Houseware> getPopcornMachine() {
        return popcornMachine;
    }

    public List<Houseware> getUprightLocker() {
        return uprightLocker;
    }

    public List<Houseware> getSmallCardboardBoxes() {
        return smallCardboardBoxes;
    }

    public List<Houseware> getWoodenBlockStool() {
        return woodenBlockStool;
    }

    public List<Houseware> getBambooStool() {
        return bambooStool;
    }

    public List<Houseware> getSpookyChair() {
        return spookyChair;
    }

    public List<Houseware> getWheelchair() {
        return wheelchair;
    }

    public List<Houseware> getGarbageBin() {
        return garbageBin;
    }

    public List<Houseware> getPetBed() {
        return petBed;
    }

    public List<Houseware> getDinerChair() {
        return dinerChair;
    }

    public List<Houseware> getMoaiStatue() {
        return moaiStatue;
    }

    public List<Houseware> getJukebox() {
        return jukebox;
    }

    public List<Houseware> getFloorSeat() {
        return floorSeat;
    }

    public List<Houseware> getSandCastle() {
        return sandCastle;
    }

    public List<Houseware> getPlaygroundGym() {
        return playgroundGym;
    }

    public List<Houseware> getTurkeyDayHearth() {
        return turkeyDayHearth;
    }

    public List<Houseware> getStreetPiano() {
        return streetPiano;
    }

    public List<Houseware> getLogRoundTable() {
        return logRoundTable;
    }

    public List<Houseware> getTinyLibrary() {
        return tinyLibrary;
    }

    public List<Houseware> getLeafStool() {
        return leafStool;
    }

    public List<Houseware> getModernOfficeChair() {
        return modernOfficeChair;
    }

    public List<Houseware> getStudioSpotlight() {
        return studioSpotlight;
    }

    public List<Houseware> getTallGardenRock() {
        return tallGardenRock;
    }

    public List<Houseware> getDeluxeWasher() {
        return deluxeWasher;
    }

    public List<Houseware> getAntiqueBureau() {
        return antiqueBureau;
    }

    public List<Houseware> getExerciseBall() {
        return exerciseBall;
    }

    public List<Houseware> getStatueOfLiberty() {
        return statueOfLiberty;
    }

    public List<Houseware> getLogDecorativeShelves() {
        return logDecorativeShelves;
    }

    public List<Houseware> getCampsiteSign() {
        return campsiteSign;
    }

    public List<Houseware> getShellFountain() {
        return shellFountain;
    }

    public List<Houseware> getBambooDoll() {
        return bambooDoll;
    }

    public List<Houseware> getAntiqueConsoleTable() {
        return antiqueConsoleTable;
    }

    public List<Houseware> getMermaidVanity() {
        return mermaidVanity;
    }

    public List<Houseware> getSmallMushroomPlatform() {
        return smallMushroomPlatform;
    }

    public List<Houseware> getCello() {
        return cello;
    }

    public List<Houseware> getNeutralCorner() {
        return neutralCorner;
    }

    public List<Houseware> getSilverMic() {
        return silverMic;
    }

    public List<Houseware> getCardboardTable() {
        return cardboardTable;
    }

    public List<Houseware> getCardboardChair() {
        return cardboardChair;
    }

    public List<Houseware> getUnknownBlock() {
        return unknownBlock;
    }

    public List<Houseware> getLectureHallDesk() {
        return lectureHallDesk;
    }

    public List<Houseware> getBonsaiShelf() {
        return bonsaiShelf;
    }

    public List<Houseware> getPirateShipCannon() {
        return pirateShipCannon;
    }

    public List<Houseware> getButterChurn() {
        return butterChurn;
    }

    public List<Houseware> getStoneLionDog() {
        return stoneLionDog;
    }

    public List<Houseware> getOrangeEndTable() {
        return orangeEndTable;
    }

    public List<Houseware> getWeddingTable() {
        return weddingTable;
    }

    public List<Houseware> getBambooNoodleSlide() {
        return bambooNoodleSlide;
    }

    public List<Houseware> getClotheslinePole() {
        return clotheslinePole;
    }

    public List<Houseware> getCone() {
        return cone;
    }

    public List<Houseware> getPlainSink() {
        return plainSink;
    }

    public List<Houseware> getExerciseBike() {
        return exerciseBike;
    }

    public List<Houseware> getFan() {
        return fan;
    }

    public List<Houseware> getInflatableSofa() {
        return inflatableSofa;
    }

    public List<Houseware> getBambooStopblock() {
        return bambooStopblock;
    }

    public List<Houseware> getLogGardenLounge() {
        return logGardenLounge;
    }

    public List<Houseware> getFrozenTree() {
        return frozenTree;
    }

    public List<Houseware> getOutdoorTable() {
        return outdoorTable;
    }

    public List<Houseware> getLogStool() {
        return logStool;
    }

    public List<Houseware> getBigFestiveTree() {
        return bigFestiveTree;
    }

    public List<Houseware> getFlowerStand() {
        return flowerStand;
    }

    public List<Houseware> getStudyChair() {
        return studyChair;
    }

    public List<Houseware> getThrowbackRocket() {
        return throwbackRocket;
    }

    public List<Houseware> getFestivaleBalloonLamp() {
        return festivaleBalloonLamp;
    }

    public List<Houseware> getUprightVacuum() {
        return uprightVacuum;
    }

    public List<Houseware> getFlyingSaucer() {
        return flyingSaucer;
    }

    public List<Houseware> getMermaidShelf() {
        return mermaidShelf;
    }

    public List<Houseware> getWoodenLowTable() {
        return woodenLowTable;
    }

    public List<Houseware> getPeachChair() {
        return peachChair;
    }

    public List<Houseware> getStandardUmbrellaStand() {
        return standardUmbrellaStand;
    }

    public List<Houseware> getCottonCandyStall() {
        return cottonCandyStall;
    }

    public List<Houseware> getGolfBag() {
        return golfBag;
    }

    public List<Houseware> getLunaSBed() {
        return lunaSBed;
    }

    public List<Houseware> getManholeCover() {
        return manholeCover;
    }

    public List<Houseware> getParkClock() {
        return parkClock;
    }

    public List<Houseware> getBirdcage() {
        return birdcage;
    }

    public List<Houseware> getSimplePanel() {
        return simplePanel;
    }

    public List<Houseware> getTurkeyDayGardenStand() {
        return turkeyDayGardenStand;
    }

    public List<Houseware> getSpookyStandingLamp() {
        return spookyStandingLamp;
    }

    public List<Houseware> getMoon() {
        return moon;
    }

    public List<Houseware> getPalmTreeLamp() {
        return palmTreeLamp;
    }

    public List<Houseware> getMonstera() {
        return monstera;
    }

    public List<Houseware> getImperialPartition() {
        return imperialPartition;
    }

    public List<Houseware> getFestivaleFlag() {
        return festivaleFlag;
    }

    public List<Houseware> getPileOfLeaves() {
        return pileOfLeaves;
    }

    public List<Houseware> getBeachChair() {
        return beachChair;
    }

    public List<Houseware> getPoolsideBed() {
        return poolsideBed;
    }

    public List<Houseware> getIronwoodBed() {
        return ironwoodBed;
    }

    public List<Houseware> getIlluminatedReindeer() {
        return illuminatedReindeer;
    }

    public List<Houseware> getLunarLander() {
        return lunarLander;
    }

    public List<Houseware> getSpookyTable() {
        return spookyTable;
    }

    public List<Houseware> getAquariusUrn() {
        return aquariusUrn;
    }

    public List<Houseware> getToiletCleaningSet() {
        return toiletCleaningSet;
    }

    public List<Houseware> getWoodenBlockBed() {
        return woodenBlockBed;
    }

    public List<Houseware> getAntiqueMiniTable() {
        return antiqueMiniTable;
    }

    public List<Houseware> getPapaBear() {
        return papaBear;
    }

    public List<Houseware> getFireplace() {
        return fireplace;
    }

    public List<Houseware> getCrescentMoonChair() {
        return crescentMoonChair;
    }

    public List<Houseware> getStandingToilet() {
        return standingToilet;
    }

    public List<Houseware> getCardboardBed() {
        return cardboardBed;
    }

    public List<Houseware> getGardenLantern() {
        return gardenLantern;
    }

    public List<Houseware> getImperialLowTable() {
        return imperialLowTable;
    }

    public List<Houseware> getSquatToilet() {
        return squatToilet;
    }

    public List<Houseware> getBunnyDayTable() {
        return bunnyDayTable;
    }

    public List<Houseware> getMermaidDresser() {
        return mermaidDresser;
    }

    public List<Houseware> getShellPartition() {
        return shellPartition;
    }

    public List<Houseware> getGoldenToilet() {
        return goldenToilet;
    }

    public List<Houseware> getIronWorktable() {
        return ironWorktable;
    }

    public List<Houseware> getPirateTreasureChest() {
        return pirateTreasureChest;
    }

    public List<Houseware> getWeightBench() {
        return weightBench;
    }

    public List<Houseware> getLunarRover() {
        return lunarRover;
    }

    public List<Houseware> getHammock() {
        return hammock;
    }

    public List<Houseware> getCuteTeaTable() {
        return cuteTeaTable;
    }

    public List<Houseware> getBarrel() {
        return barrel;
    }

    public List<Houseware> getElephantSlide() {
        return elephantSlide;
    }

    public List<Houseware> getFreshCooler() {
        return freshCooler;
    }

    public List<Houseware> getBunnyDayFestiveBalloons() {
        return bunnyDayFestiveBalloons;
    }

    public List<Houseware> getChampionSPennant() {
        return championSPennant;
    }

    public List<Houseware> getRattanEndTable() {
        return rattanEndTable;
    }

    public List<Houseware> getCardboardSofa() {
        return cardboardSofa;
    }

    public List<Houseware> getThrowbackRaceCarBed() {
        return throwbackRaceCarBed;
    }

    public List<Houseware> getVirgoHarp() {
        return virgoHarp;
    }

    public List<Houseware> getMermaidChair() {
        return mermaidChair;
    }

    public List<Houseware> getChangingRoom() {
        return changingRoom;
    }

    public List<Houseware> getTricycle() {
        return tricycle;
    }

    public List<Houseware> getFestivaleDrum() {
        return festivaleDrum;
    }

    public List<Houseware> getGasRange() {
        return gasRange;
    }

    public List<Houseware> getWesternStyleStone() {
        return westernStyleStone;
    }

    public List<Houseware> getHayBed() {
        return hayBed;
    }

    public List<Houseware> getTVCamera() {
        return tVCamera;
    }

    public List<Houseware> getMushLamp() {
        return mushLamp;
    }

    public List<Houseware> getMusicStand() {
        return musicStand;
    }

    public List<Houseware> getTallLantern() {
        return tallLantern;
    }

    public List<Houseware> getBarbell() {
        return barbell;
    }

    public List<Houseware> getWoodenDoubleBed() {
        return woodenDoubleBed;
    }

    public List<Houseware> getBlueCorner() {
        return blueCorner;
    }

    public List<Houseware> getJailBars() {
        return jailBars;
    }

    public List<Houseware> getPublicBench() {
        return publicBench;
    }

    public List<Houseware> getGrandPiano() {
        return grandPiano;
    }

    public List<Houseware> getWhirlpoolBath() {
        return whirlpoolBath;
    }

    public List<Houseware> getColorfulWheel() {
        return colorfulWheel;
    }

    public List<Houseware> getToolShelf() {
        return toolShelf;
    }

    public List<Houseware> getTouristTelescope() {
        return touristTelescope;
    }

    public List<Houseware> getCampfire() {
        return campfire;
    }

    public List<Houseware> getWoodenStool() {
        return woodenStool;
    }

    public List<Houseware> getKidsTent() {
        return kidsTent;
    }

    public List<Houseware> getSchoolDesk() {
        return schoolDesk;
    }

    public List<Houseware> getRattanBed() {
        return rattanBed;
    }

    public List<Houseware> getSpookyArch() {
        return spookyArch;
    }

    public List<Houseware> getDrinkMachine() {
        return drinkMachine;
    }

    public List<Houseware> getCypressBathtub() {
        return cypressBathtub;
    }

    public List<Houseware> getIronCloset() {
        return ironCloset;
    }

    public List<Houseware> getPirateBarrel() {
        return pirateBarrel;
    }

    public List<Houseware> getThrowbackHatTable() {
        return throwbackHatTable;
    }

    public List<Houseware> getBathroomSink() {
        return bathroomSink;
    }

    public List<Houseware> getHinaningyo() {
        return hinaningyo;
    }

    public List<Houseware> getOilBarrel() {
        return oilBarrel;
    }

    public List<Houseware> getMamaPanda() {
        return mamaPanda;
    }

    public List<Houseware> getClothesline() {
        return clothesline;
    }

    public List<Houseware> getSafe() {
        return safe;
    }

    public List<Houseware> getNaturalGardenTable() {
        return naturalGardenTable;
    }

    public List<Houseware> getFrozenSculpture() {
        return frozenSculpture;
    }

    public List<Houseware> getSoccerGoal() {
        return soccerGoal;
    }

    public List<Houseware> getLighthouse() {
        return lighthouse;
    }

    public List<Houseware> getKittyLitterBox() {
        return kittyLitterBox;
    }

    public List<Houseware> getIronwoodChair() {
        return ironwoodChair;
    }

    public List<Houseware> getWoodenBlockTable() {
        return woodenBlockTable;
    }

    public List<Houseware> getMossyGardenRock() {
        return mossyGardenRock;
    }

    public List<Houseware> getWhiteboard() {
        return whiteboard;
    }

    public List<Houseware> getAsteroid() {
        return asteroid;
    }

    public List<Houseware> getGoldenSeat() {
        return goldenSeat;
    }

    public List<Houseware> getHearth() {
        return hearth;
    }

    public List<Houseware> getRattanArmchair() {
        return rattanArmchair;
    }

    public List<Houseware> getDartboard() {
        return dartboard;
    }

    public List<Houseware> getClimbingWall() {
        return climbingWall;
    }

    public List<Houseware> getCuteDIYTable() {
        return cuteDIYTable;
    }

    public List<Houseware> getFoldingChair() {
        return foldingChair;
    }

    public List<Houseware> getStoneStool() {
        return stoneStool;
    }

    public List<Houseware> getGrandQABirdwingModel() {
        return grandQABirdwingModel;
    }

    public List<Houseware> getWoodenBucket() {
        return woodenBucket;
    }

    public List<Houseware> getGoalPole() {
        return goalPole;
    }

    public List<Houseware> getBambooPartition() {
        return bambooPartition;
    }

    public List<Houseware> getOfficeDesk() {
        return officeDesk;
    }

    public List<Houseware> getCrewedSpaceship() {
        return crewedSpaceship;
    }

    public List<Houseware> getDIYWorkbench() {
        return dIYWorkbench;
    }

    public List<Houseware> getTermiteMound() {
        return termiteMound;
    }

    public List<Houseware> getFrozenTable() {
        return frozenTable;
    }

    public List<Houseware> getIronGardenTable() {
        return ironGardenTable;
    }

    public List<Houseware> getGoBoard() {
        return goBoard;
    }

    public List<Houseware> getAppleChair() {
        return appleChair;
    }

    public List<Houseware> getDinerCounterChair() {
        return dinerCounterChair;
    }

    public List<Houseware> getUtilitySink() {
        return utilitySink;
    }

    public List<Houseware> getFuton() {
        return futon;
    }

    public List<Houseware> getWoodBurningStove() {
        return woodBurningStove;
    }

    public List<Houseware> getAntiqueBed() {
        return antiqueBed;
    }

    public List<Houseware> getSpookyTower() {
        return spookyTower;
    }

    public List<Houseware> getTreeSBountyBigTree() {
        return treeSBountyBigTree;
    }

    public List<Houseware> getGarbageCan() {
        return garbageCan;
    }

    public List<Houseware> getBidet() {
        return bidet;
    }

    public List<Houseware> getConstructionSign() {
        return constructionSign;
    }

    public List<Houseware> getFlashyFlowerSign() {
        return flashyFlowerSign;
    }

    public List<Houseware> getRandomType() {
        List<List<Houseware>> housewares = Arrays.asList(sleigh, artisanalBugCage, drumSet, electricKickScooter, papaPanda, kitchenIsland, mermaidCloset, largeMushroomPlatform, handcart, anatomicalModel, bunnyDayMerryBalloons, rattanStool, teaTable, imperialDiningTable, drinkingFountain, outdoorAirConditioner, spinningWheel, mediumCardboardBoxes, bambooShelf, mushPartition, pool, mermaidScreen, stonehenge, simpleDIYWorkbench, boxSofa, bambooGrass, outdoorGenerator, toyDaySleigh, imperialDiningChair, mushLog, festiveTree, zenStyleStone, tanklessToilet, loftBedWithDesk, trainSet, mermaidLamp, altoSaxophone, cypressPlant, ironwoodCart, tennisTable, imperialChest, streetlamp, astronautSuit, woodenBookshelf, yellowLeafPile, logExtraLongSofa, simpleWell, blossomViewingLantern, doubleSofa, frozenArch, mushParasol, dinerDiningTable, garbagePail, woodenWasteBin, cuteBed, arcadeCombatGame, basketballHoop, woodenBlockBench, acousticGuitar, denDesk, largeCardboardBoxes, clothesCloset, arcadeFightingGame, piscesLamp, angledSignpost, pagoda, roundSpaceHeater, waterPump, rattanVanity, rockingHorse, weddingWelcomeBoard, treadmill, videoCamera, stoneTable, cherryBlossomPondStone, bunnyDayStool, gong, skeleton, mountainBike, bunnyDayWardrobe, frozenCounter, shellTable, stoneArch, waterCooler, stadiometer, tulipSurpriseBox, ironwoodCupboard, bambooFloorLamp, clackercart, sleepingBag, uprightPiano, freezer, solarPanel, tireToy, bonfire, pansyTable, refrigerator, doubleDoorRefrigerator, pondStone, bunnyDayVanity, grassStandee, synthesizer, woodenEndTable, grandAtlasMothModel, marimba, fanPalm, harp, tikiTorch, frozenBed, antiqueChair, imperialBed, babyChair, capricornOrnament, utilityPole, scarecrow, frozenPartition, juicyAppleTV, weddingArch, showerBooth, festivaleGarland, miniDIYWorkbench, rockingChair, miniFridge, fishDryingRack, illuminatedPresent, satellite, cherryBlossomPetalPile, gardenWagon, anchorStatue, giftPile, billiardTable, pirateShipHelm, hiFiStereo, dinerMiniTable, sphinx, studyDesk, rodeoStyleSpringyRideOn, antiqueTable, destinationsSignpost, pyramid, pearBed, velvetStool, fountain, fishingRodStand, cherryBlossomBranches, bambooBasket, brickOven, brickWell, weddingPipeOrgan, giantTeddyBear, tatamiBed, elaborateKimonoStand, pantsPress, rocketLamp, block, ironFrame, weddingChair, cacaoTree, dJSTurntable, stall, denChair, flatGardenRock, ironwoodTable, woodenBlockChest, jsonMember2021CelebratoryArch, spookyLanternSet, cuteVanity, podium, rattanWasteBin, ironShelf, throwbackDinoScreen, electricGuitar, softServeLamp, retroStereo, server, lilyRecordPlayer, festivaleStall, bunnyDayArch, signpost, grandBDragonflyModel, antiqueVanity, shadedFloorLamp, springyRideOn, mountainStandee, paperLantern, kotatsu, barbecue, bunnyDayBed, vintageTVTray, sidewaysPirateBarrel, bambooBench, lifeguardChair, logBed, pileOfZenCushions, robotHero, mushLowStool, gardenRock, foosballTable, woodenWardrobe, hedgeStandee, effectsRack, taurusBathtub, mermaidTable, chalkboard, rCHelicopter, pullUpBarStand, oKMotorsSign, automaticWasher, dinerCounterTable, roseBed, mermaidSofa, screen, threeTieredSnowperson, dinerSofa, electricBass, tableWithCloth, menuChalkboard, ironGardenChair, mapleLeafPondStone, redCorner, pipe, ironwoodKitchenette, antiqueClock, cuteFloorLamp, outdoorBath, cuteChair, outdoorPicnicSet, naturalGardenChair, naturalSquareTable, openFrameKitchen, festivaleParasol, throwbackMittChair, clawFootTub, woodenFullLengthMirror, woodenSimpleBed, marketPlaceDecoration, southPole, yucca, clayFurnace, woodenMiniTable, rockGuitar, plasticPool, ariesRockingChair, saunaHeater, illuminatedSnowflakes, goldenCasket, snackMachine, servingCart, campfireCookware, ironHangerStand, parabolicAntenna, phoneBox, floatingBlock, foldingFloorLamp, spookyCarriage, pianoBench, oilBarrelBathtub, deerScare, antiqueWardrobe, beachTowel, treeSBountyArch, shellStool, zenCushion, festivaleStage, sandbox, logChair, spookyScarecrow, logStakes, tireStack, mushTable, stoneTablet, woodenBlockChair, woodenBlockBookshelf, campingCot, directorSChair, micStand, monsterStatue, birdbath, outdoorBench, frozenChair, rattanLowTable, mermaidBed, turkeyDayTable, retroGasPump, ironwoodDIYWorkbench, rocket, swingingBench, arcadeSeat, ironGardenBench, floorLight, teacupRide, cuteSofa, kettleBathtub, speedBag, beekeeperSHive, airCirculator, cuteWardrobe, dinerNeonSign, doghouse, gardenFaucet, lowScreen, digitalScale, highEndStereo, bunkBed, plainWoodenShopSign, fortuneCookieCart, redLeafPile, trophyCase, birthdaySign, windTurbine, toilet, systemKitchen, ironingBoard, telescope, turkeyDayChair, cosmosShower, illuminatedTree, mumCushion, spaceShuttle, vacuumCleaner, raccoonFigurine, surfboard, ironwoodDresser, thwomp, arcadeMahjongGame, toolCart, weddingFlowerStand, woodenChest, birthdayTable, scatteredPapers, brakeTapper, greenLeafPile, cancerTable, festivaleFloat, portableToilet, lawnMower, mrsFlamingo, rattanWardrobe, dryingRack, kimonoStand, ironwoodLowTable, candyMachine, woodenBlockStereo, frozenPillar, silo, streetOrgan, kadomatsu, shellArch, wildLogBench, firePit, schoolChair, oceanSunfishModel, punchingBag, shellBed, retroFan, woodenChair, logDiningTable, basicTeacherSDesk, lawnChair, smoker, geminiCloset, loom, longBathtub, mamaBear, pinballMachine, mrFlamingo, treeStandee, weddingHeadTable, boxCornerSofa, gardenBench, leafCampfire, lectureHallBench, towerOfPisa, birdhouse, logBench, oldSewingMachine, pearWardrobe, woodenTable, hoseReel, floorLamp, waveBreaker, bambooSpeaker, weddingBench, catTower, popcornMachine, uprightLocker, smallCardboardBoxes, woodenBlockStool, bambooStool, spookyChair, wheelchair, garbageBin, petBed, dinerChair, moaiStatue, jukebox, floorSeat, sandCastle, playgroundGym, turkeyDayHearth, streetPiano, logRoundTable, tinyLibrary, leafStool, modernOfficeChair, studioSpotlight, tallGardenRock, deluxeWasher, antiqueBureau, exerciseBall, statueOfLiberty, logDecorativeShelves, campsiteSign, shellFountain, bambooDoll, antiqueConsoleTable, mermaidVanity, smallMushroomPlatform, cello, neutralCorner, silverMic, cardboardTable, cardboardChair, block, lectureHallDesk, bonsaiShelf, pirateShipCannon, butterChurn, stoneLionDog, orangeEndTable, weddingTable, bambooNoodleSlide, clotheslinePole, cone, plainSink, exerciseBike, fan, inflatableSofa, bambooStopblock, logGardenLounge, frozenTree, outdoorTable, logStool, bigFestiveTree, flowerStand, studyChair, throwbackRocket, festivaleBalloonLamp, uprightVacuum, flyingSaucer, mermaidShelf, woodenLowTable, peachChair, standardUmbrellaStand, cottonCandyStall, golfBag, lunaSBed, manholeCover, parkClock, birdcage, simplePanel, turkeyDayGardenStand, spookyStandingLamp, moon, palmTreeLamp, monstera, imperialPartition, festivaleFlag, pileOfLeaves, beachChair, poolsideBed, ironwoodBed, illuminatedReindeer, lunarLander, spookyTable, aquariusUrn, toiletCleaningSet, woodenBlockBed, antiqueMiniTable, papaBear, fireplace, crescentMoonChair, standingToilet, cardboardBed, gardenLantern, imperialLowTable, squatToilet, bunnyDayTable, mermaidDresser, shellPartition, goldenToilet, ironWorktable, pirateTreasureChest, weightBench, lunarRover, hammock, cuteTeaTable, barrel, elephantSlide, freshCooler, bunnyDayFestiveBalloons, championSPennant, rattanEndTable, cardboardSofa, throwbackRaceCarBed, virgoHarp, mermaidChair, changingRoom, tricycle, festivaleDrum, gasRange, westernStyleStone, hayBed, tVCamera, mushLamp, musicStand, tallLantern, barbell, woodenDoubleBed, blueCorner, jailBars, publicBench, grandPiano, whirlpoolBath, colorfulWheel, toolShelf, touristTelescope, campfire, woodenStool, kidsTent, schoolDesk, rattanBed, spookyArch, drinkMachine, cypressBathtub, ironCloset, pirateBarrel, throwbackHatTable, bathroomSink, hinaningyo, oilBarrel, mamaPanda, clothesline, safe, naturalGardenTable, frozenSculpture, soccerGoal, lighthouse, kittyLitterBox, ironwoodChair, woodenBlockTable, mossyGardenRock, whiteboard, asteroid, goldenSeat, hearth, rattanArmchair, dartboard, climbingWall, cuteDIYTable, foldingChair, stoneStool, grandQABirdwingModel, woodenBucket, goalPole, bambooPartition, officeDesk, crewedSpaceship, dIYWorkbench, termiteMound, frozenTable, ironGardenTable, goBoard, appleChair, dinerCounterChair, utilitySink, futon, woodBurningStove, antiqueBed, spookyTower, treeSBountyBigTree, garbageCan, bidet, constructionSign, flashyFlowerSign);
        return getRandomValue(housewares);
    }

    private List<Houseware> getRandomValue(List<List<Houseware>> housewares) {
        int index = new Random().nextInt(housewares.size());
        return housewares.get(index);
    }
}
