/*
 * © 2021 지성빈. all rights reserved.
 * This project license is under the MIT.
 *
 * [Houseware.kt] created by Ji Sungbin on 21. 7. 22. 오후 11:50.
 *
 * Please see project github repository license.
 */

package io.github.jisungbin.acnhapi.models.items.houseware

import com.google.gson.annotations.SerializedName
import io.github.jisungbin.acnhapi.models.AcnhModelWrapper

data class Houseware(
    @field:SerializedName("sleigh")
    val sleigh: List<Response>,

    @field:SerializedName("artisanal_bug_cage")
    val artisanalBugCage: List<Response>,

    @field:SerializedName("drum_set")
    val drumSet: List<Response>,

    @field:SerializedName("electric_kick_scooter")
    val electricKickScooter: List<Response>,

    @field:SerializedName("Papa_panda")
    val papaPanda: List<Response>,

    @field:SerializedName("kitchen_island")
    val kitchenIsland: List<Response>,

    @field:SerializedName("mermaid_closet")
    val mermaidCloset: List<Response>,

    @field:SerializedName("large_Mushroom_Platform")
    val largeMushroomPlatform: List<Response>,

    @field:SerializedName("handcart")
    val handcart: List<Response>,

    @field:SerializedName("anatomical_model")
    val anatomicalModel: List<Response>,

    @field:SerializedName("Bunny_Day_merry_balloons")
    val bunnyDayMerryBalloons: List<Response>,

    @field:SerializedName("rattan_stool")
    val rattanStool: List<Response>,

    @field:SerializedName("tea_table")
    val teaTable: List<Response>,

    @field:SerializedName("imperial_dining_table")
    val imperialDiningTable: List<Response>,

    @field:SerializedName("drinking_fountain")
    val drinkingFountain: List<Response>,

    @field:SerializedName("outdoor_air_conditioner")
    val outdoorAirConditioner: List<Response>,

    @field:SerializedName("spinning_wheel")
    val spinningWheel: List<Response>,

    @field:SerializedName("medium_cardboard_boxes")
    val mediumCardboardBoxes: List<Response>,

    @field:SerializedName("bamboo_shelf")
    val bambooShelf: List<Response>,

    @field:SerializedName("mush_partition")
    val mushPartition: List<Response>,

    @field:SerializedName("pool")
    val pool: List<Response>,

    @field:SerializedName("mermaid_screen")
    val mermaidScreen: List<Response>,

    @field:SerializedName("Stonehenge")
    val stonehenge: List<Response>,

    @field:SerializedName("simple_DIY_workbench")
    val simpleDIYWorkbench: List<Response>,

    @field:SerializedName("box_sofa")
    val boxSofa: List<Response>,

    @field:SerializedName("bamboo_grass")
    val bambooGrass: List<Response>,

    @field:SerializedName("outdoor_generator")
    val outdoorGenerator: List<Response>,

    @field:SerializedName("Toy_Day_sleigh")
    val toyDaySleigh: List<Response>,

    @field:SerializedName("imperial_dining_chair")
    val imperialDiningChair: List<Response>,

    @field:SerializedName("mush_log")
    val mushLog: List<Response>,

    @field:SerializedName("festive_tree")
    val festiveTree: List<Response>,

    @field:SerializedName("zen-style_stone")
    val zenStyleStone: List<Response>,

    @field:SerializedName("tankless_toilet")
    val tanklessToilet: List<Response>,

    @field:SerializedName("loft_bed_with_desk")
    val loftBedWithDesk: List<Response>,

    @field:SerializedName("train_set")
    val trainSet: List<Response>,

    @field:SerializedName("mermaid_lamp")
    val mermaidLamp: List<Response>,

    @field:SerializedName("alto_saxophone")
    val altoSaxophone: List<Response>,

    @field:SerializedName("cypress_plant")
    val cypressPlant: List<Response>,

    @field:SerializedName("ironwood_cart")
    val ironwoodCart: List<Response>,

    @field:SerializedName("tennis_table")
    val tennisTable: List<Response>,

    @field:SerializedName("imperial_chest")
    val imperialChest: List<Response>,

    @field:SerializedName("streetlamp")
    val streetlamp: List<Response>,

    @field:SerializedName("astronaut_suit")
    val astronautSuit: List<Response>,

    @field:SerializedName("wooden_bookshelf")
    val woodenBookshelf: List<Response>,

    @field:SerializedName("yellow-leaf_pile")
    val yellowLeafPile: List<Response>,

    @field:SerializedName("log_extra-long_sofa")
    val logExtraLongSofa: List<Response>,

    @field:SerializedName("simple_well")
    val simpleWell: List<Response>,

    @field:SerializedName("blossom-viewing_lantern")
    val blossomViewingLantern: List<Response>,

    @field:SerializedName("double_sofa")
    val doubleSofa: List<Response>,

    @field:SerializedName("frozen_arch")
    val frozenArch: List<Response>,

    @field:SerializedName("mush_parasol")
    val mushParasol: List<Response>,

    @field:SerializedName("diner_dining_table")
    val dinerDiningTable: List<Response>,

    @field:SerializedName("garbage_pail")
    val garbagePail: List<Response>,

    @field:SerializedName("wooden_waste_bin")
    val woodenWasteBin: List<Response>,

    @field:SerializedName("cute_bed")
    val cuteBed: List<Response>,

    @field:SerializedName("arcade_combat_game")
    val arcadeCombatGame: List<Response>,

    @field:SerializedName("basketball_hoop")
    val basketballHoop: List<Response>,

    @field:SerializedName("wooden-block_bench")
    val woodenBlockBench: List<Response>,

    @field:SerializedName("acoustic_guitar")
    val acousticGuitar: List<Response>,

    @field:SerializedName("den_desk")
    val denDesk: List<Response>,

    @field:SerializedName("large_cardboard_boxes")
    val largeCardboardBoxes: List<Response>,

    @field:SerializedName("clothes_closet")
    val clothesCloset: List<Response>,

    @field:SerializedName("arcade_fighting_game")
    val arcadeFightingGame: List<Response>,

    @field:SerializedName("Pisces_lamp")
    val piscesLamp: List<Response>,

    @field:SerializedName("angled_signpost")
    val angledSignpost: List<Response>,

    @field:SerializedName("pagoda")
    val pagoda: List<Response>,

    @field:SerializedName("round_space_heater")
    val roundSpaceHeater: List<Response>,

    @field:SerializedName("water_pump")
    val waterPump: List<Response>,

    @field:SerializedName("rattan_vanity")
    val rattanVanity: List<Response>,

    @field:SerializedName("rocking_horse")
    val rockingHorse: List<Response>,

    @field:SerializedName("wedding_welcome_board")
    val weddingWelcomeBoard: List<Response>,

    @field:SerializedName("treadmill")
    val treadmill: List<Response>,

    @field:SerializedName("video_camera")
    val videoCamera: List<Response>,

    @field:SerializedName("stone_table")
    val stoneTable: List<Response>,

    @field:SerializedName("cherry-blossom_pond_stone")
    val cherryBlossomPondStone: List<Response>,

    @field:SerializedName("Bunny_Day_stool")
    val bunnyDayStool: List<Response>,

    @field:SerializedName("gong")
    val gong: List<Response>,

    @field:SerializedName("skeleton")
    val skeleton: List<Response>,

    @field:SerializedName("mountain_bike")
    val mountainBike: List<Response>,

    @field:SerializedName("Bunny_Day_wardrobe")
    val bunnyDayWardrobe: List<Response>,

    @field:SerializedName("frozen_counter")
    val frozenCounter: List<Response>,

    @field:SerializedName("shell_table")
    val shellTable: List<Response>,

    @field:SerializedName("stone_arch")
    val stoneArch: List<Response>,

    @field:SerializedName("water_cooler")
    val waterCooler: List<Response>,

    @field:SerializedName("stadiometer")
    val stadiometer: List<Response>,

    @field:SerializedName("tulip_surprise_box")
    val tulipSurpriseBox: List<Response>,

    @field:SerializedName("ironwood_cupboard")
    val ironwoodCupboard: List<Response>,

    @field:SerializedName("bamboo_floor_lamp")
    val bambooFloorLamp: List<Response>,

    @field:SerializedName("clackercart")
    val clackercart: List<Response>,

    @field:SerializedName("sleeping_bag")
    val sleepingBag: List<Response>,

    @field:SerializedName("upright_piano")
    val uprightPiano: List<Response>,

    @field:SerializedName("freezer")
    val freezer: List<Response>,

    @field:SerializedName("solar_panel")
    val solarPanel: List<Response>,

    @field:SerializedName("tire_toy")
    val tireToy: List<Response>,

    @field:SerializedName("bonfire")
    val bonfire: List<Response>,

    @field:SerializedName("pansy_table")
    val pansyTable: List<Response>,

    @field:SerializedName("refrigerator")
    val refrigerator: List<Response>,

    @field:SerializedName("double-door_refrigerator")
    val doubleDoorRefrigerator: List<Response>,

    @field:SerializedName("pond_stone")
    val pondStone: List<Response>,

    @field:SerializedName("Bunny_Day_vanity")
    val bunnyDayVanity: List<Response>,

    @field:SerializedName("grass_standee")
    val grassStandee: List<Response>,

    @field:SerializedName("synthesizer")
    val synthesizer: List<Response>,

    @field:SerializedName("wooden_end_table")
    val woodenEndTable: List<Response>,

    @field:SerializedName("grand_Atlas_moth_model")
    val grandAtlasMothModel: List<Response>,

    @field:SerializedName("marimba")
    val marimba: List<Response>,

    @field:SerializedName("fan_palm")
    val fanPalm: List<Response>,

    @field:SerializedName("harp")
    val harp: List<Response>,

    @field:SerializedName("tiki_torch")
    val tikiTorch: List<Response>,

    @field:SerializedName("frozen_bed")
    val frozenBed: List<Response>,

    @field:SerializedName("antique_chair")
    val antiqueChair: List<Response>,

    @field:SerializedName("imperial_bed")
    val imperialBed: List<Response>,

    @field:SerializedName("baby_chair")
    val babyChair: List<Response>,

    @field:SerializedName("Capricorn_ornament")
    val capricornOrnament: List<Response>,

    @field:SerializedName("utility_pole")
    val utilityPole: List<Response>,

    @field:SerializedName("scarecrow")
    val scarecrow: List<Response>,

    @field:SerializedName("frozen_partition")
    val frozenPartition: List<Response>,

    @field:SerializedName("juicy-apple_TV")
    val juicyAppleTV: List<Response>,

    @field:SerializedName("wedding_arch")
    val weddingArch: List<Response>,

    @field:SerializedName("shower_booth")
    val showerBooth: List<Response>,

    @field:SerializedName("Festivale_garland")
    val festivaleGarland: List<Response>,

    @field:SerializedName("mini_DIY_workbench")
    val miniDIYWorkbench: List<Response>,

    @field:SerializedName("rocking_chair")
    val rockingChair: List<Response>,

    @field:SerializedName("mini_fridge")
    val miniFridge: List<Response>,

    @field:SerializedName("fish-drying_rack")
    val fishDryingRack: List<Response>,

    @field:SerializedName("illuminated_present")
    val illuminatedPresent: List<Response>,

    @field:SerializedName("satellite")
    val satellite: List<Response>,

    @field:SerializedName("cherry-blossom-petal_pile")
    val cherryBlossomPetalPile: List<Response>,

    @field:SerializedName("garden_wagon")
    val gardenWagon: List<Response>,

    @field:SerializedName("anchor_statue")
    val anchorStatue: List<Response>,

    @field:SerializedName("gift_pile")
    val giftPile: List<Response>,

    @field:SerializedName("billiard_table")
    val billiardTable: List<Response>,

    @field:SerializedName("pirate-ship_helm")
    val pirateShipHelm: List<Response>,

    @field:SerializedName("hi-fi_stereo")
    val hiFiStereo: List<Response>,

    @field:SerializedName("diner_mini_table")
    val dinerMiniTable: List<Response>,

    @field:SerializedName("sphinx")
    val sphinx: List<Response>,

    @field:SerializedName("study_desk")
    val studyDesk: List<Response>,

    @field:SerializedName("rodeo-style_springy_ride-on")
    val rodeoStyleSpringyRideOn: List<Response>,

    @field:SerializedName("antique_table")
    val antiqueTable: List<Response>,

    @field:SerializedName("destinations_signpost")
    val destinationsSignpost: List<Response>,

    @field:SerializedName("pyramid")
    val pyramid: List<Response>,

    @field:SerializedName("pear_bed")
    val pearBed: List<Response>,

    @field:SerializedName("velvet_stool")
    val velvetStool: List<Response>,

    @field:SerializedName("fountain")
    val fountain: List<Response>,

    @field:SerializedName("fishing-rod_stand")
    val fishingRodStand: List<Response>,

    @field:SerializedName("cherry-blossom_branches")
    val cherryBlossomBranches: List<Response>,

    @field:SerializedName("bamboo_basket")
    val bambooBasket: List<Response>,

    @field:SerializedName("brick_oven")
    val brickOven: List<Response>,

    @field:SerializedName("brick_well")
    val brickWell: List<Response>,

    @field:SerializedName("wedding_pipe_organ")
    val weddingPipeOrgan: List<Response>,

    @field:SerializedName("giant_teddy_bear")
    val giantTeddyBear: List<Response>,

    @field:SerializedName("tatami_bed")
    val tatamiBed: List<Response>,

    @field:SerializedName("elaborate_kimono_stand")
    val elaborateKimonoStand: List<Response>,

    @field:SerializedName("pants_press")
    val pantsPress: List<Response>,

    @field:SerializedName("rocket_lamp")
    val rocketLamp: List<Response>,

    @field:SerializedName("block")
    val block: List<Response>,

    @field:SerializedName("iron_frame")
    val ironFrame: List<Response>,

    @field:SerializedName("wedding_chair")
    val weddingChair: List<Response>,

    @field:SerializedName("cacao_tree")
    val cacaoTree: List<Response>,

    @field:SerializedName("DJ's_turntable")
    val dJSTurntable: List<Response>,

    @field:SerializedName("stall")
    val stall: List<Response>,

    @field:SerializedName("den_chair")
    val denChair: List<Response>,

    @field:SerializedName("flat_garden_rock")
    val flatGardenRock: List<Response>,

    @field:SerializedName("ironwood_table")
    val ironwoodTable: List<Response>,

    @field:SerializedName("wooden-block_chest")
    val woodenBlockChest: List<Response>,

    @field:SerializedName("2021_celebratory_arch")
    val jsonMember2021CelebratoryArch: List<Response>,

    @field:SerializedName("spooky_lantern_set")
    val spookyLanternSet: List<Response>,

    @field:SerializedName("cute_vanity")
    val cuteVanity: List<Response>,

    @field:SerializedName("podium")
    val podium: List<Response>,

    @field:SerializedName("rattan_waste_bin")
    val rattanWasteBin: List<Response>,

    @field:SerializedName("iron_shelf")
    val ironShelf: List<Response>,

    @field:SerializedName("throwback_dino_screen")
    val throwbackDinoScreen: List<Response>,

    @field:SerializedName("electric_guitar")
    val electricGuitar: List<Response>,

    @field:SerializedName("soft-serve_lamp")
    val softServeLamp: List<Response>,

    @field:SerializedName("retro_stereo")
    val retroStereo: List<Response>,

    @field:SerializedName("server")
    val server: List<Response>,

    @field:SerializedName("lily_record_player")
    val lilyRecordPlayer: List<Response>,

    @field:SerializedName("Festivale_stall")
    val festivaleStall: List<Response>,

    @field:SerializedName("Bunny_Day_arch")
    val bunnyDayArch: List<Response>,

    @field:SerializedName("signpost")
    val signpost: List<Response>,

    @field:SerializedName("grand_b._dragonfly_model")
    val grandBDragonflyModel: List<Response>,

    @field:SerializedName("antique_vanity")
    val antiqueVanity: List<Response>,

    @field:SerializedName("shaded_floor_lamp")
    val shadedFloorLamp: List<Response>,

    @field:SerializedName("springy_ride-on")
    val springyRideOn: List<Response>,

    @field:SerializedName("mountain_standee")
    val mountainStandee: List<Response>,

    @field:SerializedName("paper_lantern")
    val paperLantern: List<Response>,

    @field:SerializedName("kotatsu")
    val kotatsu: List<Response>,

    @field:SerializedName("barbecue")
    val barbecue: List<Response>,

    @field:SerializedName("Bunny_Day_bed")
    val bunnyDayBed: List<Response>,

    @field:SerializedName("vintage_TV_tray")
    val vintageTVTray: List<Response>,

    @field:SerializedName("sideways_pirate_barrel")
    val sidewaysPirateBarrel: List<Response>,

    @field:SerializedName("bamboo_bench")
    val bambooBench: List<Response>,

    @field:SerializedName("lifeguard_chair")
    val lifeguardChair: List<Response>,

    @field:SerializedName("log_bed")
    val logBed: List<Response>,

    @field:SerializedName("pile_of_zen_cushions")
    val pileOfZenCushions: List<Response>,

    @field:SerializedName("robot_hero")
    val robotHero: List<Response>,

    @field:SerializedName("mush_low_stool")
    val mushLowStool: List<Response>,

    @field:SerializedName("garden_rock")
    val gardenRock: List<Response>,

    @field:SerializedName("foosball_table")
    val foosballTable: List<Response>,

    @field:SerializedName("wooden_wardrobe")
    val woodenWardrobe: List<Response>,

    @field:SerializedName("hedge_standee")
    val hedgeStandee: List<Response>,

    @field:SerializedName("effects_rack")
    val effectsRack: List<Response>,

    @field:SerializedName("Taurus_bathtub")
    val taurusBathtub: List<Response>,

    @field:SerializedName("mermaid_table")
    val mermaidTable: List<Response>,

    @field:SerializedName("chalkboard")
    val chalkboard: List<Response>,

    @field:SerializedName("RC_helicopter")
    val rCHelicopter: List<Response>,

    @field:SerializedName("pull-up-bar_stand")
    val pullUpBarStand: List<Response>,

    @field:SerializedName("OK_Motors_sign")
    val oKMotorsSign: List<Response>,

    @field:SerializedName("automatic_washer")
    val automaticWasher: List<Response>,

    @field:SerializedName("diner_counter_table")
    val dinerCounterTable: List<Response>,

    @field:SerializedName("rose_bed")
    val roseBed: List<Response>,

    @field:SerializedName("mermaid_sofa")
    val mermaidSofa: List<Response>,

    @field:SerializedName("screen")
    val screen: List<Response>,

    @field:SerializedName("three-tiered_snowperson")
    val threeTieredSnowperson: List<Response>,

    @field:SerializedName("diner_sofa")
    val dinerSofa: List<Response>,

    @field:SerializedName("electric_bass")
    val electricBass: List<Response>,

    @field:SerializedName("table_with_cloth")
    val tableWithCloth: List<Response>,

    @field:SerializedName("menu_chalkboard")
    val menuChalkboard: List<Response>,

    @field:SerializedName("iron_garden_chair")
    val ironGardenChair: List<Response>,

    @field:SerializedName("maple-leaf_pond_stone")
    val mapleLeafPondStone: List<Response>,

    @field:SerializedName("red_corner")
    val redCorner: List<Response>,

    @field:SerializedName("pipe")
    val pipe: List<Response>,

    @field:SerializedName("ironwood_kitchenette")
    val ironwoodKitchenette: List<Response>,

    @field:SerializedName("antique_clock")
    val antiqueClock: List<Response>,

    @field:SerializedName("cute_floor_lamp")
    val cuteFloorLamp: List<Response>,

    @field:SerializedName("outdoor_bath")
    val outdoorBath: List<Response>,

    @field:SerializedName("cute_chair")
    val cuteChair: List<Response>,

    @field:SerializedName("outdoor_picnic_set")
    val outdoorPicnicSet: List<Response>,

    @field:SerializedName("natural_garden_chair")
    val naturalGardenChair: List<Response>,

    @field:SerializedName("natural_square_table")
    val naturalSquareTable: List<Response>,

    @field:SerializedName("open-frame_kitchen")
    val openFrameKitchen: List<Response>,

    @field:SerializedName("Festivale_parasol")
    val festivaleParasol: List<Response>,

    @field:SerializedName("throwback_mitt_chair")
    val throwbackMittChair: List<Response>,

    @field:SerializedName("claw-foot_tub")
    val clawFootTub: List<Response>,

    @field:SerializedName("wooden_full-length_mirror")
    val woodenFullLengthMirror: List<Response>,

    @field:SerializedName("wooden_simple_bed")
    val woodenSimpleBed: List<Response>,

    @field:SerializedName("Market_Place_decoration")
    val marketPlaceDecoration: List<Response>,

    @field:SerializedName("South_Pole")
    val southPole: List<Response>,

    @field:SerializedName("yucca")
    val yucca: List<Response>,

    @field:SerializedName("clay_furnace")
    val clayFurnace: List<Response>,

    @field:SerializedName("wooden_mini_table")
    val woodenMiniTable: List<Response>,

    @field:SerializedName("rock_guitar")
    val rockGuitar: List<Response>,

    @field:SerializedName("plastic_pool")
    val plasticPool: List<Response>,

    @field:SerializedName("Aries_rocking_chair")
    val ariesRockingChair: List<Response>,

    @field:SerializedName("sauna_heater")
    val saunaHeater: List<Response>,

    @field:SerializedName("illuminated_snowflakes")
    val illuminatedSnowflakes: List<Response>,

    @field:SerializedName("golden_casket")
    val goldenCasket: List<Response>,

    @field:SerializedName("snack_machine")
    val snackMachine: List<Response>,

    @field:SerializedName("serving_cart")
    val servingCart: List<Response>,

    @field:SerializedName("campfire_cookware")
    val campfireCookware: List<Response>,

    @field:SerializedName("iron_hanger_stand")
    val ironHangerStand: List<Response>,

    @field:SerializedName("parabolic_antenna")
    val parabolicAntenna: List<Response>,

    @field:SerializedName("phone_box")
    val phoneBox: List<Response>,

    @field:SerializedName("floating_block")
    val floatingBlock: List<Response>,

    @field:SerializedName("folding_floor_lamp")
    val foldingFloorLamp: List<Response>,

    @field:SerializedName("spooky_carriage")
    val spookyCarriage: List<Response>,

    @field:SerializedName("piano_bench")
    val pianoBench: List<Response>,

    @field:SerializedName("oil-barrel_bathtub")
    val oilBarrelBathtub: List<Response>,

    @field:SerializedName("deer_scare")
    val deerScare: List<Response>,

    @field:SerializedName("antique_wardrobe")
    val antiqueWardrobe: List<Response>,

    @field:SerializedName("beach_towel")
    val beachTowel: List<Response>,

    @field:SerializedName("tree's_bounty_arch")
    val treeSBountyArch: List<Response>,

    @field:SerializedName("shell_stool")
    val shellStool: List<Response>,

    @field:SerializedName("zen_cushion")
    val zenCushion: List<Response>,

    @field:SerializedName("Festivale_stage")
    val festivaleStage: List<Response>,

    @field:SerializedName("sandbox")
    val sandbox: List<Response>,

    @field:SerializedName("log_chair")
    val logChair: List<Response>,

    @field:SerializedName("spooky_scarecrow")
    val spookyScarecrow: List<Response>,

    @field:SerializedName("log_stakes")
    val logStakes: List<Response>,

    @field:SerializedName("tire_stack")
    val tireStack: List<Response>,

    @field:SerializedName("mush_table")
    val mushTable: List<Response>,

    @field:SerializedName("stone_tablet")
    val stoneTablet: List<Response>,

    @field:SerializedName("wooden-block_chair")
    val woodenBlockChair: List<Response>,

    @field:SerializedName("wooden-block_bookshelf")
    val woodenBlockBookshelf: List<Response>,

    @field:SerializedName("camping_cot")
    val campingCot: List<Response>,

    @field:SerializedName("director's_chair")
    val directorSChair: List<Response>,

    @field:SerializedName("mic_stand")
    val micStand: List<Response>,

    @field:SerializedName("monster_statue")
    val monsterStatue: List<Response>,

    @field:SerializedName("birdbath")
    val birdbath: List<Response>,

    @field:SerializedName("outdoor_bench")
    val outdoorBench: List<Response>,

    @field:SerializedName("frozen_chair")
    val frozenChair: List<Response>,

    @field:SerializedName("rattan_low_table")
    val rattanLowTable: List<Response>,

    @field:SerializedName("mermaid_bed")
    val mermaidBed: List<Response>,

    @field:SerializedName("Turkey_Day_table")
    val turkeyDayTable: List<Response>,

    @field:SerializedName("retro_gas_pump")
    val retroGasPump: List<Response>,

    @field:SerializedName("ironwood_DIY_workbench")
    val ironwoodDIYWorkbench: List<Response>,

    @field:SerializedName("rocket")
    val rocket: List<Response>,

    @field:SerializedName("swinging_bench")
    val swingingBench: List<Response>,

    @field:SerializedName("arcade_seat")
    val arcadeSeat: List<Response>,

    @field:SerializedName("iron_garden_bench")
    val ironGardenBench: List<Response>,

    @field:SerializedName("floor_light")
    val floorLight: List<Response>,

    @field:SerializedName("teacup_ride")
    val teacupRide: List<Response>,

    @field:SerializedName("cute_sofa")
    val cuteSofa: List<Response>,

    @field:SerializedName("kettle_bathtub")
    val kettleBathtub: List<Response>,

    @field:SerializedName("speed_bag")
    val speedBag: List<Response>,

    @field:SerializedName("beekeeper's_hive")
    val beekeeperSHive: List<Response>,

    @field:SerializedName("air_circulator")
    val airCirculator: List<Response>,

    @field:SerializedName("cute_wardrobe")
    val cuteWardrobe: List<Response>,

    @field:SerializedName("diner_neon_sign")
    val dinerNeonSign: List<Response>,

    @field:SerializedName("doghouse")
    val doghouse: List<Response>,

    @field:SerializedName("garden_faucet")
    val gardenFaucet: List<Response>,

    @field:SerializedName("low_screen")
    val lowScreen: List<Response>,

    @field:SerializedName("digital_scale")
    val digitalScale: List<Response>,

    @field:SerializedName("high-end_stereo")
    val highEndStereo: List<Response>,

    @field:SerializedName("bunk_bed")
    val bunkBed: List<Response>,

    @field:SerializedName("plain_wooden_shop_sign")
    val plainWoodenShopSign: List<Response>,

    @field:SerializedName("fortune-cookie_cart")
    val fortuneCookieCart: List<Response>,

    @field:SerializedName("red-leaf_pile")
    val redLeafPile: List<Response>,

    @field:SerializedName("trophy_case")
    val trophyCase: List<Response>,

    @field:SerializedName("birthday_sign")
    val birthdaySign: List<Response>,

    @field:SerializedName("wind_turbine")
    val windTurbine: List<Response>,

    @field:SerializedName("toilet")
    val toilet: List<Response>,

    @field:SerializedName("system_kitchen")
    val systemKitchen: List<Response>,

    @field:SerializedName("ironing_board")
    val ironingBoard: List<Response>,

    @field:SerializedName("telescope")
    val telescope: List<Response>,

    @field:SerializedName("Turkey_Day_chair")
    val turkeyDayChair: List<Response>,

    @field:SerializedName("cosmos_shower")
    val cosmosShower: List<Response>,

    @field:SerializedName("illuminated_tree")
    val illuminatedTree: List<Response>,

    @field:SerializedName("mum_cushion")
    val mumCushion: List<Response>,

    @field:SerializedName("space_shuttle")
    val spaceShuttle: List<Response>,

    @field:SerializedName("vacuum_cleaner")
    val vacuumCleaner: List<Response>,

    @field:SerializedName("raccoon_figurine")
    val raccoonFigurine: List<Response>,

    @field:SerializedName("surfboard")
    val surfboard: List<Response>,

    @field:SerializedName("ironwood_dresser")
    val ironwoodDresser: List<Response>,

    @field:SerializedName("Thwomp")
    val thwomp: List<Response>,

    @field:SerializedName("arcade_mahjong_game")
    val arcadeMahjongGame: List<Response>,

    @field:SerializedName("tool_cart")
    val toolCart: List<Response>,

    @field:SerializedName("wedding_flower_stand")
    val weddingFlowerStand: List<Response>,

    @field:SerializedName("wooden_chest")
    val woodenChest: List<Response>,

    @field:SerializedName("birthday_table")
    val birthdayTable: List<Response>,

    @field:SerializedName("scattered_papers")
    val scatteredPapers: List<Response>,

    @field:SerializedName("Brake_Tapper")
    val brakeTapper: List<Response>,

    @field:SerializedName("green-leaf_pile")
    val greenLeafPile: List<Response>,

    @field:SerializedName("Cancer_table")
    val cancerTable: List<Response>,

    @field:SerializedName("Festivale_float")
    val festivaleFloat: List<Response>,

    @field:SerializedName("portable_toilet")
    val portableToilet: List<Response>,

    @field:SerializedName("lawn_mower")
    val lawnMower: List<Response>,

    @field:SerializedName("Mrs._Flamingo")
    val mrsFlamingo: List<Response>,

    @field:SerializedName("rattan_wardrobe")
    val rattanWardrobe: List<Response>,

    @field:SerializedName("drying_rack")
    val dryingRack: List<Response>,

    @field:SerializedName("kimono_stand")
    val kimonoStand: List<Response>,

    @field:SerializedName("ironwood_low_table")
    val ironwoodLowTable: List<Response>,

    @field:SerializedName("candy_machine")
    val candyMachine: List<Response>,

    @field:SerializedName("wooden-block_stereo")
    val woodenBlockStereo: List<Response>,

    @field:SerializedName("frozen_pillar")
    val frozenPillar: List<Response>,

    @field:SerializedName("silo")
    val silo: List<Response>,

    @field:SerializedName("street_organ")
    val streetOrgan: List<Response>,

    @field:SerializedName("kadomatsu")
    val kadomatsu: List<Response>,

    @field:SerializedName("shell_arch")
    val shellArch: List<Response>,

    @field:SerializedName("wild_log_bench")
    val wildLogBench: List<Response>,

    @field:SerializedName("fire_pit")
    val firePit: List<Response>,

    @field:SerializedName("school_chair")
    val schoolChair: List<Response>,

    @field:SerializedName("ocean_sunfish_model")
    val oceanSunfishModel: List<Response>,

    @field:SerializedName("punching_bag")
    val punchingBag: List<Response>,

    @field:SerializedName("shell_bed")
    val shellBed: List<Response>,

    @field:SerializedName("retro_fan")
    val retroFan: List<Response>,

    @field:SerializedName("wooden_chair")
    val woodenChair: List<Response>,

    @field:SerializedName("log_dining_table")
    val logDiningTable: List<Response>,

    @field:SerializedName("basic_teacher's_desk")
    val basicTeacherSDesk: List<Response>,

    @field:SerializedName("lawn_chair")
    val lawnChair: List<Response>,

    @field:SerializedName("smoker")
    val smoker: List<Response>,

    @field:SerializedName("Gemini_closet")
    val geminiCloset: List<Response>,

    @field:SerializedName("loom")
    val loom: List<Response>,

    @field:SerializedName("long_bathtub")
    val longBathtub: List<Response>,

    @field:SerializedName("Mama_bear")
    val mamaBear: List<Response>,

    @field:SerializedName("pinball_machine")
    val pinballMachine: List<Response>,

    @field:SerializedName("Mr._Flamingo")
    val mrFlamingo: List<Response>,

    @field:SerializedName("tree_standee")
    val treeStandee: List<Response>,

    @field:SerializedName("wedding_head_table")
    val weddingHeadTable: List<Response>,

    @field:SerializedName("box_corner_sofa")
    val boxCornerSofa: List<Response>,

    @field:SerializedName("garden_bench")
    val gardenBench: List<Response>,

    @field:SerializedName("leaf_campfire")
    val leafCampfire: List<Response>,

    @field:SerializedName("lecture-hall_bench")
    val lectureHallBench: List<Response>,

    @field:SerializedName("Tower_of_Pisa")
    val towerOfPisa: List<Response>,

    @field:SerializedName("birdhouse")
    val birdhouse: List<Response>,

    @field:SerializedName("log_bench")
    val logBench: List<Response>,

    @field:SerializedName("old_sewing_machine")
    val oldSewingMachine: List<Response>,

    @field:SerializedName("pear_wardrobe")
    val pearWardrobe: List<Response>,

    @field:SerializedName("wooden_table")
    val woodenTable: List<Response>,

    @field:SerializedName("hose_reel")
    val hoseReel: List<Response>,

    @field:SerializedName("floor_lamp")
    val floorLamp: List<Response>,

    @field:SerializedName("wave_breaker")
    val waveBreaker: List<Response>,

    @field:SerializedName("bamboo_speaker")
    val bambooSpeaker: List<Response>,

    @field:SerializedName("wedding_bench")
    val weddingBench: List<Response>,

    @field:SerializedName("cat_tower")
    val catTower: List<Response>,

    @field:SerializedName("popcorn_machine")
    val popcornMachine: List<Response>,

    @field:SerializedName("upright_locker")
    val uprightLocker: List<Response>,

    @field:SerializedName("small_cardboard_boxes")
    val smallCardboardBoxes: List<Response>,

    @field:SerializedName("wooden-block_stool")
    val woodenBlockStool: List<Response>,

    @field:SerializedName("bamboo_stool")
    val bambooStool: List<Response>,

    @field:SerializedName("spooky_chair")
    val spookyChair: List<Response>,

    @field:SerializedName("wheelchair")
    val wheelchair: List<Response>,

    @field:SerializedName("garbage_bin")
    val garbageBin: List<Response>,

    @field:SerializedName("pet_bed")
    val petBed: List<Response>,

    @field:SerializedName("diner_chair")
    val dinerChair: List<Response>,

    @field:SerializedName("moai_statue")
    val moaiStatue: List<Response>,

    @field:SerializedName("jukebox")
    val jukebox: List<Response>,

    @field:SerializedName("floor_seat")
    val floorSeat: List<Response>,

    @field:SerializedName("sand_castle")
    val sandCastle: List<Response>,

    @field:SerializedName("playground_gym")
    val playgroundGym: List<Response>,

    @field:SerializedName("Turkey_Day_hearth")
    val turkeyDayHearth: List<Response>,

    @field:SerializedName("street_piano")
    val streetPiano: List<Response>,

    @field:SerializedName("log_round_table")
    val logRoundTable: List<Response>,

    @field:SerializedName("tiny_library")
    val tinyLibrary: List<Response>,

    @field:SerializedName("leaf_stool")
    val leafStool: List<Response>,

    @field:SerializedName("modern_office_chair")
    val modernOfficeChair: List<Response>,

    @field:SerializedName("studio_spotlight")
    val studioSpotlight: List<Response>,

    @field:SerializedName("tall_garden_rock")
    val tallGardenRock: List<Response>,

    @field:SerializedName("deluxe_washer")
    val deluxeWasher: List<Response>,

    @field:SerializedName("antique_bureau")
    val antiqueBureau: List<Response>,

    @field:SerializedName("exercise_ball")
    val exerciseBall: List<Response>,

    @field:SerializedName("Statue_of_Liberty")
    val statueOfLiberty: List<Response>,

    @field:SerializedName("log_decorative_shelves")
    val logDecorativeShelves: List<Response>,

    @field:SerializedName("campsite_sign")
    val campsiteSign: List<Response>,

    @field:SerializedName("shell_fountain")
    val shellFountain: List<Response>,

    @field:SerializedName("bamboo_doll")
    val bambooDoll: List<Response>,

    @field:SerializedName("antique_console_table")
    val antiqueConsoleTable: List<Response>,

    @field:SerializedName("mermaid_vanity")
    val mermaidVanity: List<Response>,

    @field:SerializedName("small_Mushroom_Platform")
    val smallMushroomPlatform: List<Response>,

    @field:SerializedName("cello")
    val cello: List<Response>,

    @field:SerializedName("neutral_corner")
    val neutralCorner: List<Response>,

    @field:SerializedName("silver_mic")
    val silverMic: List<Response>,

    @field:SerializedName("cardboard_table")
    val cardboardTable: List<Response>,

    @field:SerializedName("cardboard_chair")
    val cardboardChair: List<Response>,

    @field:SerializedName("?_Block")
    val unknownBlock: List<Response>,

    @field:SerializedName("lecture-hall_desk")
    val lectureHallDesk: List<Response>,

    @field:SerializedName("bonsai_shelf")
    val bonsaiShelf: List<Response>,

    @field:SerializedName("pirate-ship_cannon")
    val pirateShipCannon: List<Response>,

    @field:SerializedName("butter_churn")
    val butterChurn: List<Response>,

    @field:SerializedName("stone_lion-dog")
    val stoneLionDog: List<Response>,

    @field:SerializedName("orange_end_table")
    val orangeEndTable: List<Response>,

    @field:SerializedName("wedding_table")
    val weddingTable: List<Response>,

    @field:SerializedName("bamboo_noodle_slide")
    val bambooNoodleSlide: List<Response>,

    @field:SerializedName("clothesline_pole")
    val clotheslinePole: List<Response>,

    @field:SerializedName("cone")
    val cone: List<Response>,

    @field:SerializedName("plain_sink")
    val plainSink: List<Response>,

    @field:SerializedName("exercise_bike")
    val exerciseBike: List<Response>,

    @field:SerializedName("fan")
    val fan: List<Response>,

    @field:SerializedName("inflatable_sofa")
    val inflatableSofa: List<Response>,

    @field:SerializedName("bamboo_stopblock")
    val bambooStopblock: List<Response>,

    @field:SerializedName("log_garden_lounge")
    val logGardenLounge: List<Response>,

    @field:SerializedName("frozen_tree")
    val frozenTree: List<Response>,

    @field:SerializedName("outdoor_table")
    val outdoorTable: List<Response>,

    @field:SerializedName("log_stool")
    val logStool: List<Response>,

    @field:SerializedName("big_festive_tree")
    val bigFestiveTree: List<Response>,

    @field:SerializedName("flower_stand")
    val flowerStand: List<Response>,

    @field:SerializedName("study_chair")
    val studyChair: List<Response>,

    @field:SerializedName("throwback_rocket")
    val throwbackRocket: List<Response>,

    @field:SerializedName("Festivale_balloon_lamp")
    val festivaleBalloonLamp: List<Response>,

    @field:SerializedName("upright_vacuum")
    val uprightVacuum: List<Response>,

    @field:SerializedName("flying_saucer")
    val flyingSaucer: List<Response>,

    @field:SerializedName("mermaid_shelf")
    val mermaidShelf: List<Response>,

    @field:SerializedName("wooden_low_table")
    val woodenLowTable: List<Response>,

    @field:SerializedName("peach_chair")
    val peachChair: List<Response>,

    @field:SerializedName("standard_umbrella_stand")
    val standardUmbrellaStand: List<Response>,

    @field:SerializedName("cotton-candy_stall")
    val cottonCandyStall: List<Response>,

    @field:SerializedName("golf_bag")
    val golfBag: List<Response>,

    @field:SerializedName("Luna's_bed")
    val lunaSBed: List<Response>,

    @field:SerializedName("manhole_cover")
    val manholeCover: List<Response>,

    @field:SerializedName("park_clock")
    val parkClock: List<Response>,

    @field:SerializedName("birdcage")
    val birdcage: List<Response>,

    @field:SerializedName("simple_panel")
    val simplePanel: List<Response>,

    @field:SerializedName("Turkey_Day_garden_stand")
    val turkeyDayGardenStand: List<Response>,

    @field:SerializedName("spooky_standing_lamp")
    val spookyStandingLamp: List<Response>,

    @field:SerializedName("moon")
    val moon: List<Response>,

    @field:SerializedName("palm-tree_lamp")
    val palmTreeLamp: List<Response>,

    @field:SerializedName("monstera")
    val monstera: List<Response>,

    @field:SerializedName("imperial_partition")
    val imperialPartition: List<Response>,

    @field:SerializedName("Festivale_flag")
    val festivaleFlag: List<Response>,

    @field:SerializedName("pile_of_leaves")
    val pileOfLeaves: List<Response>,

    @field:SerializedName("beach_chair")
    val beachChair: List<Response>,

    @field:SerializedName("poolside_bed")
    val poolsideBed: List<Response>,

    @field:SerializedName("ironwood_bed")
    val ironwoodBed: List<Response>,

    @field:SerializedName("illuminated_reindeer")
    val illuminatedReindeer: List<Response>,

    @field:SerializedName("lunar_lander")
    val lunarLander: List<Response>,

    @field:SerializedName("spooky_table")
    val spookyTable: List<Response>,

    @field:SerializedName("Aquarius_urn")
    val aquariusUrn: List<Response>,

    @field:SerializedName("toilet-cleaning_set")
    val toiletCleaningSet: List<Response>,

    @field:SerializedName("wooden-block_bed")
    val woodenBlockBed: List<Response>,

    @field:SerializedName("antique_mini_table")
    val antiqueMiniTable: List<Response>,

    @field:SerializedName("Papa_bear")
    val papaBear: List<Response>,

    @field:SerializedName("fireplace")
    val fireplace: List<Response>,

    @field:SerializedName("crescent-moon_chair")
    val crescentMoonChair: List<Response>,

    @field:SerializedName("standing_toilet")
    val standingToilet: List<Response>,

    @field:SerializedName("cardboard_bed")
    val cardboardBed: List<Response>,

    @field:SerializedName("garden_lantern")
    val gardenLantern: List<Response>,

    @field:SerializedName("imperial_low_table")
    val imperialLowTable: List<Response>,

    @field:SerializedName("squat_toilet")
    val squatToilet: List<Response>,

    @field:SerializedName("Bunny_Day_table")
    val bunnyDayTable: List<Response>,

    @field:SerializedName("mermaid_dresser")
    val mermaidDresser: List<Response>,

    @field:SerializedName("shell_partition")
    val shellPartition: List<Response>,

    @field:SerializedName("golden_toilet")
    val goldenToilet: List<Response>,

    @field:SerializedName("iron_worktable")
    val ironWorktable: List<Response>,

    @field:SerializedName("pirate-treasure_chest")
    val pirateTreasureChest: List<Response>,

    @field:SerializedName("weight_bench")
    val weightBench: List<Response>,

    @field:SerializedName("lunar_rover")
    val lunarRover: List<Response>,

    @field:SerializedName("hammock")
    val hammock: List<Response>,

    @field:SerializedName("cute_tea_table")
    val cuteTeaTable: List<Response>,

    @field:SerializedName("barrel")
    val barrel: List<Response>,

    @field:SerializedName("elephant_slide")
    val elephantSlide: List<Response>,

    @field:SerializedName("fresh_cooler")
    val freshCooler: List<Response>,

    @field:SerializedName("Bunny_Day_festive_balloons")
    val bunnyDayFestiveBalloons: List<Response>,

    @field:SerializedName("champion's_pennant")
    val championSPennant: List<Response>,

    @field:SerializedName("rattan_end_table")
    val rattanEndTable: List<Response>,

    @field:SerializedName("cardboard_sofa")
    val cardboardSofa: List<Response>,

    @field:SerializedName("throwback_race-car_bed")
    val throwbackRaceCarBed: List<Response>,

    @field:SerializedName("Virgo_harp")
    val virgoHarp: List<Response>,

    @field:SerializedName("mermaid_chair")
    val mermaidChair: List<Response>,

    @field:SerializedName("changing_room")
    val changingRoom: List<Response>,

    @field:SerializedName("tricycle")
    val tricycle: List<Response>,

    @field:SerializedName("Festivale_drum")
    val festivaleDrum: List<Response>,

    @field:SerializedName("gas_range")
    val gasRange: List<Response>,

    @field:SerializedName("western-style_stone")
    val westernStyleStone: List<Response>,

    @field:SerializedName("hay_bed")
    val hayBed: List<Response>,

    @field:SerializedName("TV_camera")
    val tVCamera: List<Response>,

    @field:SerializedName("mush_lamp")
    val mushLamp: List<Response>,

    @field:SerializedName("music_stand")
    val musicStand: List<Response>,

    @field:SerializedName("tall_lantern")
    val tallLantern: List<Response>,

    @field:SerializedName("barbell")
    val barbell: List<Response>,

    @field:SerializedName("wooden_double_bed")
    val woodenDoubleBed: List<Response>,

    @field:SerializedName("blue_corner")
    val blueCorner: List<Response>,

    @field:SerializedName("jail_bars")
    val jailBars: List<Response>,

    @field:SerializedName("public_bench")
    val publicBench: List<Response>,

    @field:SerializedName("grand_piano")
    val grandPiano: List<Response>,

    @field:SerializedName("whirlpool_bath")
    val whirlpoolBath: List<Response>,

    @field:SerializedName("colorful_wheel")
    val colorfulWheel: List<Response>,

    @field:SerializedName("tool_shelf")
    val toolShelf: List<Response>,

    @field:SerializedName("tourist_telescope")
    val touristTelescope: List<Response>,

    @field:SerializedName("campfire")
    val campfire: List<Response>,

    @field:SerializedName("wooden_stool")
    val woodenStool: List<Response>,

    @field:SerializedName("kids'_tent")
    val kidsTent: List<Response>,

    @field:SerializedName("school_desk")
    val schoolDesk: List<Response>,

    @field:SerializedName("rattan_bed")
    val rattanBed: List<Response>,

    @field:SerializedName("spooky_arch")
    val spookyArch: List<Response>,

    @field:SerializedName("drink_machine")
    val drinkMachine: List<Response>,

    @field:SerializedName("cypress_bathtub")
    val cypressBathtub: List<Response>,

    @field:SerializedName("iron_closet")
    val ironCloset: List<Response>,

    @field:SerializedName("pirate_barrel")
    val pirateBarrel: List<Response>,

    @field:SerializedName("throwback_hat_table")
    val throwbackHatTable: List<Response>,

    @field:SerializedName("bathroom_sink")
    val bathroomSink: List<Response>,

    @field:SerializedName("hinaningyo")
    val hinaningyo: List<Response>,

    @field:SerializedName("oil_barrel")
    val oilBarrel: List<Response>,

    @field:SerializedName("Mama_panda")
    val mamaPanda: List<Response>,

    @field:SerializedName("clothesline")
    val clothesline: List<Response>,

    @field:SerializedName("safe")
    val safe: List<Response>,

    @field:SerializedName("natural_garden_table")
    val naturalGardenTable: List<Response>,

    @field:SerializedName("frozen_sculpture")
    val frozenSculpture: List<Response>,

    @field:SerializedName("soccer_goal")
    val soccerGoal: List<Response>,

    @field:SerializedName("lighthouse")
    val lighthouse: List<Response>,

    @field:SerializedName("kitty_litter_box")
    val kittyLitterBox: List<Response>,

    @field:SerializedName("ironwood_chair")
    val ironwoodChair: List<Response>,

    @field:SerializedName("wooden-block_table")
    val woodenBlockTable: List<Response>,

    @field:SerializedName("mossy_garden_rock")
    val mossyGardenRock: List<Response>,

    @field:SerializedName("whiteboard")
    val whiteboard: List<Response>,

    @field:SerializedName("asteroid")
    val asteroid: List<Response>,

    @field:SerializedName("golden_seat")
    val goldenSeat: List<Response>,

    @field:SerializedName("hearth")
    val hearth: List<Response>,

    @field:SerializedName("rattan_armchair")
    val rattanArmchair: List<Response>,

    @field:SerializedName("dartboard")
    val dartboard: List<Response>,

    @field:SerializedName("climbing_wall")
    val climbingWall: List<Response>,

    @field:SerializedName("cute_DIY_table")
    val cuteDIYTable: List<Response>,

    @field:SerializedName("folding_chair")
    val foldingChair: List<Response>,

    @field:SerializedName("stone_stool")
    val stoneStool: List<Response>,

    @field:SerializedName("grand_Q._A._birdwing_model")
    val grandQABirdwingModel: List<Response>,

    @field:SerializedName("wooden_bucket")
    val woodenBucket: List<Response>,

    @field:SerializedName("Goal_Pole")
    val goalPole: List<Response>,

    @field:SerializedName("bamboo_partition")
    val bambooPartition: List<Response>,

    @field:SerializedName("office_desk")
    val officeDesk: List<Response>,

    @field:SerializedName("crewed_spaceship")
    val crewedSpaceship: List<Response>,

    @field:SerializedName("DIY_workbench")
    val dIYWorkbench: List<Response>,

    @field:SerializedName("termite_mound")
    val termiteMound: List<Response>,

    @field:SerializedName("frozen_table")
    val frozenTable: List<Response>,

    @field:SerializedName("iron_garden_table")
    val ironGardenTable: List<Response>,

    @field:SerializedName("go_board")
    val goBoard: List<Response>,

    @field:SerializedName("apple_chair")
    val appleChair: List<Response>,

    @field:SerializedName("diner_counter_chair")
    val dinerCounterChair: List<Response>,

    @field:SerializedName("utility_sink")
    val utilitySink: List<Response>,

    @field:SerializedName("futon")
    val futon: List<Response>,

    @field:SerializedName("wood-burning_stove")
    val woodBurningStove: List<Response>,

    @field:SerializedName("antique_bed")
    val antiqueBed: List<Response>,

    @field:SerializedName("spooky_tower")
    val spookyTower: List<Response>,

    @field:SerializedName("tree's_bounty_big_tree")
    val treeSBountyBigTree: List<Response>,

    @field:SerializedName("garbage_can")
    val garbageCan: List<Response>,

    @field:SerializedName("bidet")
    val bidet: List<Response>,

    @field:SerializedName("construction_sign")
    val constructionSign: List<Response>,

    @field:SerializedName("flashy-flower_sign")
    val flashyFlowerSign: List<Response>
) : AcnhModelWrapper
