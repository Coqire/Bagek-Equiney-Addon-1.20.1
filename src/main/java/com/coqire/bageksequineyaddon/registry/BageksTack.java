package com.coqire.bageksequineyaddon.registry;


import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class BageksTack {

    // INDIVIDUAL ITEMS
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_RED;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_ORANGE;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_YELLOW;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_LIME;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_GREEN;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_LIGHT_BLUE;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_CYAN;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_BLUE;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_PURPLE;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_MAGENTA;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_PINK;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_WHITE;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_LIGHT_GRAY;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_GRAY;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_BLACK;
    public static final RegistryObject<HalterItem> HALTER_FLUFFY_BROWN;
    
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_BLACK;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_C1;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_C2;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_C3;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_C4;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_ENGLISH_BLACK;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BLACK;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_FREEMOTION_BLACK;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_XC_BLACK;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_XC_FLUFFY_BLACK;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_ENGLISH_BROWN;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BROWN;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_FREEMOTION_BROWN;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_XC_BROWN;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_XC_FLUFFY_BROWN;
    public static final RegistryObject<WesternBreastCollarItem> BAGEK_LUNGEGEAR;

    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DROPBAND_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_FLASH_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_SPLITEAR_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_XC_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_XC_FLUFFY_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BROWN;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DROPBAND_BROWN;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_FLASH_BROWN;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BROWN;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_SPLITEAR_BROWN;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_XC_BROWN;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_XC_FLUFFY_BROWN;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_BLACK;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_C1;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_C2;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_C3;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_C4;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_BROWN;

    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_ANATOMIC_BLACK;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BLACK;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_BLACK;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_FLUFFY_BLACK;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_XC_BLACK;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_XC_FLUFFY_BLACK;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_ANATOMIC_BROWN;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BROWN;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_FLUFFY_BROWN;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_XC_BROWN;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_XC_FLUFFY_BROWN;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_C1;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_C2;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_C3;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_C4;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FC1;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FC2;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FC3;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FC4;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_BROWN;

    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_PATTERNED1;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_PATTERNED2;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_PATTERNED3;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_PATTERNED4;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_PATTERNED5;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_PATTERNED6;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_ZEBRA_BAGEK;

    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_BLACK;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_XC_BLACK;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_XC_BROWN;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_C1;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_C2;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_C3;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_C4;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_BAGEK_BROWN;

    // COLOUR SETS
    public static DeferredRegister<Item> REGISTRY;
    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<HalterItem>> FLYMASK_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> QUARTERSHEET_BAGEK;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKET_BAGEK;
    public static final List<RegistryObject<WesternLegWraps>> WESTERN_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_BREAST_COLLAR_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> TRAVEL_BOOTS_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_ENGLISH_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_ENGLISH_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_FLYSHEET;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_BAGEK;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_XC_BAGEK;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_XC_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK;
    public static final List<RegistryObject<WesternBreastCollarItem>> QUARTERSHEET_BREASTCOLLAR_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_WOOD_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_WOOD_FLUFFY_BAGEK;

    // PASTEL COLOURS
    public static final List<RegistryObject<HalterItem>> HALTER_PASTEL_BAGEK;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_PASTEL_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_PASTEL_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_PASTEL_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_PASTEL_BAGEK;
    public static final List<RegistryObject<HalterItem>> FLYMASK_PASTEL_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> QUARTERSHEET_PASTEL_BAGEK;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKET_PASTEL_BAGEK;
    public static final List<RegistryObject<WesternLegWraps>> WESTERN_LEG_WRAPS_PASTEL_BAGEK;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_BREAST_COLLAR_PASTEL_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> TRAVEL_BOOTS_PASTEL_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_ENGLISH_PASTEL_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_ENGLISH_PASTEL_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_FLYSHEET_PASTEL;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_BAGEK_PASTEL;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLE_XC_BAGEK_PASTEL;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_XC_BAGEK_PASTEL;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK_PASTEL;
    public static final List<RegistryObject<WesternBreastCollarItem>> QUARTERSHEET_BREASTCOLLAR_BAGEK_PASTEL;


    public BageksTack() {
    }

    public static void init(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        //INDIVIDUAL ITEMS

        HALTER_FLUFFY_RED = REGISTRY.register("halter_fluffy_red", () ->
                new HalterItem("halter_fluffy_bagek_red",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_ORANGE = REGISTRY.register("halter_fluffy_orange", () ->
                new HalterItem("halter_fluffy_bagek_orange",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_YELLOW = REGISTRY.register("halter_fluffy_yellow", () ->
                new HalterItem("halter_fluffy_bagek_yellow",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_LIME = REGISTRY.register("halter_fluffy_lime", () ->
                new HalterItem("halter_fluffy_bagek_lime",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_GREEN = REGISTRY.register("halter_fluffy_green", () ->
                new HalterItem("halter_fluffy_bagek_green",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_CYAN = REGISTRY.register("halter_fluffy_cyan", () ->
                new HalterItem("halter_fluffy_bagek_cyan",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_LIGHT_BLUE = REGISTRY.register("halter_fluffy_light_blue", () ->
                new HalterItem("halter_fluffy_bagek_light_blue",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_BLUE = REGISTRY.register("halter_fluffy_blue", () ->
                new HalterItem("halter_fluffy_bagek_blue",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_PURPLE = REGISTRY.register("halter_fluffy_purple", () ->
                new HalterItem("halter_fluffy_bagek_purple",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_MAGENTA = REGISTRY.register("halter_fluffy_magenta", () ->
                new HalterItem("halter_fluffy_bagek_magenta",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_PINK = REGISTRY.register("halter_fluffy_pink", () ->
                new HalterItem("halter_fluffy_bagek_pink",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_WHITE = REGISTRY.register("halter_fluffy_white", () ->
                new HalterItem("halter_fluffy_bagek_white",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_LIGHT_GRAY = REGISTRY.register("halter_fluffy_light_gray", () ->
                new HalterItem("halter_fluffy_bagek_light_gray",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_GRAY = REGISTRY.register("halter_fluffy_gray", () ->
                new HalterItem("halter_fluffy_bagek_gray",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_BLACK = REGISTRY.register("halter_fluffy_black", () ->
                new HalterItem("halter_fluffy_black",
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_BROWN = REGISTRY.register("halter_fluffy_brown", () ->
                new HalterItem("halter_fluffy_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        //ENGLISH_BREAST_COLLAR_ = REGISTRY.register("english_breast_collar_", () ->
       //         new EnglishBreastCollar("english_breast_collar_",
       //                 (new Item.Properties().stacksTo(64))
        //        ));
        ENGLISH_BREAST_COLLAR_BAGEK_C1 = REGISTRY.register("english_breast_collar_bagek_c1", () ->
                new EnglishBreastCollar("english_breast_collar_bagek_c1",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_C2 = REGISTRY.register("english_breast_collar_bagek_c2", () ->
                new EnglishBreastCollar("english_breast_collar_bagek_c2",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_C3 = REGISTRY.register("english_breast_collar_bagek_c3", () ->
                new EnglishBreastCollar("english_breast_collar_bagek_c3",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_C4 = REGISTRY.register("english_breast_collar_bagek_c4", () ->
                new EnglishBreastCollar("english_breast_collar_bagek_c4",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_BLACK = REGISTRY.register("english_breast_collar_bagek_black", () ->
                new EnglishBreastCollar("english_breast_collar_bagek_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_ENGLISH_BLACK = REGISTRY.register("english_breast_collar_english_black", () ->
                new EnglishBreastCollar("english_breast_collar_english_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FREEMOTION_BLACK = REGISTRY.register("english_breast_collar_freemotion_black", () ->
                new EnglishBreastCollar("english_breast_collar_freemotion_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BLACK = REGISTRY.register("english_breast_collar_fivepoint_bagek_black", () ->
                new EnglishBreastCollar("english_breast_collar_bagek_fivepoint_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_BLACK = REGISTRY.register("english_breast_collar_xc_black", () ->
                new EnglishBreastCollar("english_breast_collar_xc_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_FLUFFY_BLACK = REGISTRY.register("english_breast_collar_xc_fluffy_black", () ->
                new EnglishBreastCollar("english_breast_collar_xc_fluffy_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_ENGLISH_BROWN = REGISTRY.register("english_breast_collar_english_brown", () ->
                new EnglishBreastCollar("english_breast_collar_english_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FREEMOTION_BROWN = REGISTRY.register("english_breast_collar_freemotion_brown", () ->
                new EnglishBreastCollar("english_breast_collar_freemotion_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BROWN = REGISTRY.register("english_breast_collar_fivepoint_bagek_brown", () ->
                new EnglishBreastCollar("english_breast_collar_bagek_fivepoint_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_BROWN = REGISTRY.register("english_breast_collar_xc_brown", () ->
                new EnglishBreastCollar("english_breast_collar_xc_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_FLUFFY_BROWN = REGISTRY.register("english_breast_collar_xc_fluffy_brown", () ->
                new EnglishBreastCollar("english_breast_collar_xc_fluffy_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        BAGEK_LUNGEGEAR = REGISTRY.register("bagek_lungegear", () ->
                new WesternBreastCollarItem("bagek_lungegear",
                        (new Item.Properties().stacksTo(64))
                ));


        ENGLISH_BRIDLE_BAGEK_BLACK = REGISTRY.register("english_bridle_bagek_black", () ->
                new EnglishBridleItem("english_bridle_bagek_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C1 = REGISTRY.register("english_bridle_bagek_c1", () ->
                new EnglishBridleItem("english_bridle_bagek_c1",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C2 = REGISTRY.register("english_bridle_bagek_c2", () ->
                new EnglishBridleItem("english_bridle_bagek_c2",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C3 = REGISTRY.register("english_bridle_bagek_c3", () ->
                new EnglishBridleItem("english_bridle_bagek_c3",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C4 = REGISTRY.register("english_bridle_bagek_c4", () ->
                new EnglishBridleItem("english_bridle_bagek_c4",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DROPBAND_BLACK = REGISTRY.register("english_bridle_bagek_dropband_black", () ->
                new EnglishBridleItem("english_bridle_bagek_dropband_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_SPLITEAR_BLACK = REGISTRY.register("english_bridle_bagek_splitear_black", () ->
                new EnglishBridleItem("english_bridle_bagek_splitear_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BLACK = REGISTRY.register("english_bridle_bagek_doubleband_black", () ->
                new EnglishBridleItem("english_bridle_bagek_doubleband_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BLACK = REGISTRY.register("english_bridle_bagek_leather_war_black", () ->
                new EnglishBridleItem("english_bridle_bagek_leather_war_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_FLASH_BLACK = REGISTRY.register("english_bridle_bagek_flash_black", () ->
                new EnglishBridleItem("english_bridle_bagek_flash_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_BLACK = REGISTRY.register("english_bridle_xc_black", () ->
                new EnglishBridleItem("english_bridle_xc_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_FLUFFY_BLACK = REGISTRY.register("english_bridle_xc_fluffy_black", () ->
                new EnglishBridleItem("english_bridle_xc_fluffy_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DROPBAND_BROWN = REGISTRY.register("english_bridle_bagek_dropband_brown", () ->
                new EnglishBridleItem("english_bridle_bagek_dropband_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_SPLITEAR_BROWN = REGISTRY.register("english_bridle_bagek_splitear_brown", () ->
                new EnglishBridleItem("english_bridle_bagek_splitear_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BROWN = REGISTRY.register("english_bridle_bagek_doubleband_brown", () ->
                new EnglishBridleItem("english_bridle_bagek_doubleband_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BROWN = REGISTRY.register("english_bridle_bagek_leather_war_brown", () ->
                new EnglishBridleItem("english_bridle_bagek_leather_war_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_FLASH_BROWN = REGISTRY.register("english_bridle_bagek_flash_brown", () ->
                new EnglishBridleItem("english_bridle_bagek_flash_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_BROWN = REGISTRY.register("english_bridle_xc_brown", () ->
                new EnglishBridleItem("english_bridle_xc_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_FLUFFY_BROWN = REGISTRY.register("english_bridle_xc_fluffy_brown", () ->
                new EnglishBridleItem("english_bridle_xc_fluffy_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_BROWN = REGISTRY.register("western_bridle_bagek_brown", () ->
                new WesternBridleItem("western_bridle_bagek_brown",
                        (new Item.Properties().stacksTo(64))
                ));


        ENGLISH_GIRTH_STRAP_ANATOMIC_BLACK = REGISTRY.register("english_girth_strap_anatomic_black", () ->
                new EnglishGirthStrap("english_girth_strap_anatomic_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BLACK = REGISTRY.register("english_girth_strap_anatomic_fluffy_black", () ->
                new EnglishGirthStrap("english_girth_strap_anatomic_fluffy_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_FLUFFY_BLACK = REGISTRY.register("english_girth_strap_fluffy_black", () ->
                new EnglishGirthStrap("english_girth_strap_fluffy_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_BLACK = REGISTRY.register("english_girth_strap_xc_black", () ->
                new EnglishGirthStrap("english_girth_strap_xc_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_FLUFFY_BLACK = REGISTRY.register("english_girth_strap_xc_fluffy_black", () ->
                new EnglishGirthStrap("english_girth_strap_xc_fluffy_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_ANATOMIC_BROWN = REGISTRY.register("english_girth_strap_anatomic_brown", () ->
                new EnglishGirthStrap("english_girth_strap_anatomic_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BROWN = REGISTRY.register("english_girth_strap_anatomic_fluffy_brown", () ->
                new EnglishGirthStrap("english_girth_strap_anatomic_fluffy_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_FLUFFY_BROWN = REGISTRY.register("english_girth_strap_fluffy_brown", () ->
                new EnglishGirthStrap("english_girth_strap_fluffy_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_BROWN = REGISTRY.register("english_girth_strap_xc_brown", () ->
                new EnglishGirthStrap("english_girth_strap_xc_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_FLUFFY_BROWN = REGISTRY.register("english_girth_strap_xc_fluffy_brown", () ->
                new EnglishGirthStrap("english_girth_strap_xc_fluffy_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_BLACK = REGISTRY.register("english_girth_strap_bagek_black", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_black",
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_BROWN = REGISTRY.register("western_girth_strap_bagek_brown", () ->
                new WesternGirthStrapItem("western_girth_strap_bagek_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C1 = REGISTRY.register("english_girth_strap_bagek_c1", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_c1",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C2 = REGISTRY.register("english_girth_strap_bagek_c2", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_c2",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C3 = REGISTRY.register("english_girth_strap_bagek_c3", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_c3",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C4 = REGISTRY.register("english_girth_strap_bagek_c4", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_c4",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC1 = REGISTRY.register("english_girth_strap_bagek_fc1", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_fc1",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC2 = REGISTRY.register("english_girth_strap_bagek_fc2", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_fc2",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC3 = REGISTRY.register("english_girth_strap_bagek_fc3", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_fc3",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC4 = REGISTRY.register("english_girth_strap_bagek_fc4", () ->
                new EnglishGirthStrap("english_girth_strap_bagek_fc4",
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_SADDLE_XC_BLACK = REGISTRY.register("english_saddle_xc_black", () ->
                new EnglishSaddleItem("english_saddle_xc_black",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_XC_BROWN = REGISTRY.register("english_saddle_xc_brown", () ->
                new EnglishSaddleItem("english_saddle_xc_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_BLACK = REGISTRY.register("english_saddle_bagek_black", () ->
                new EnglishSaddleItem("english_saddle_bagek_black",
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_SADDLE_BAGEK_BROWN = REGISTRY.register("western_saddle_bagek_brown", () ->
                new WesternSaddleItem("western_saddle_bagek_brown",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C1 = REGISTRY.register("english_saddle_bagek_c1", () ->
                new EnglishSaddleItem("english_saddle_bagek_c1",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C2 = REGISTRY.register("english_saddle_bagek_c2", () ->
                new EnglishSaddleItem("english_saddle_bagek_c2",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C3 = REGISTRY.register("english_saddle_bagek_c3", () ->
                new EnglishSaddleItem("english_saddle_bagek_c3",
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C4 = REGISTRY.register("english_saddle_bagek_c4", () ->
                new EnglishSaddleItem("english_saddle_bagek_c4",
                        (new Item.Properties().stacksTo(64))
                ));

        PASTURE_BLANKET_ZEBRA_BAGEK = REGISTRY.register("pasture_blanket_zebra_bagek", () ->
                new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_zebra_bagek",
                        (new Item.Properties().stacksTo(64))
                ));
        PASTURE_BLANKET_PATTERNED1 = REGISTRY.register("pasture_blanket_patterned1", () ->
                new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_patterned1",
                        (new Item.Properties().stacksTo(64))
                ));
        PASTURE_BLANKET_PATTERNED2 = REGISTRY.register("pasture_blanket_patterned2", () ->
                new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_patterned2",
                        (new Item.Properties().stacksTo(64))
                ));
        PASTURE_BLANKET_PATTERNED3 = REGISTRY.register("pasture_blanket_patterned3", () ->
                new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_patterned3",
                        (new Item.Properties().stacksTo(64))
                ));
        PASTURE_BLANKET_PATTERNED4 = REGISTRY.register("pasture_blanket_patterned4", () ->
                new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_patterned4",
                        (new Item.Properties().stacksTo(64))
                ));
        PASTURE_BLANKET_PATTERNED5 = REGISTRY.register("pasture_blanket_patterned5", () ->
                new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_patterned5",
                        (new Item.Properties().stacksTo(64))
                ));
        PASTURE_BLANKET_PATTERNED6 = REGISTRY.register("pasture_blanket_patterned6", () ->
                new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_patterned6",
                        (new Item.Properties().stacksTo(64))
                ));
        
        
        HALTER_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            HALTER_BAGEK.add(REGISTRY.register("halter_bagek_" + counter, () ->
                    new HalterItem("halter_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        FLYMASK_BAGEK = new ArrayList<>();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            FLYMASK_BAGEK.add(REGISTRY.register("flymask_bagek_" + counter, () ->
                    new HalterItem("flymask_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

            ENGLISH_BLANKET_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                ENGLISH_BLANKET_BAGEK.add(REGISTRY.register("english_blanket_bagek_" + counter, () ->
                        new EnglishBlanketItem("english_blanket_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        ENGLISH_LEG_WRAPS_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                ENGLISH_LEG_WRAPS_BAGEK.add(REGISTRY.register("english_leg_wraps_bagek_" + counter, () ->
                        new EnglishLegWraps("english_leg_wraps_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        PASTURE_BLANKET_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                PASTURE_BLANKET_BAGEK.add(REGISTRY.register("pasture_blanket_bagek_" + counter, () ->
                        new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                                "pasture_blanket_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        QUARTERSHEET_BAGEK = new ArrayList<>();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                QUARTERSHEET_BAGEK.add(REGISTRY.register("quartersheet_bagek_" + counter, () ->
                        new EnglishBreastCollar("quartersheet_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        HALTER_FLUFFY_BAGEK = new ArrayList<>();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                HALTER_FLUFFY_BAGEK.add(REGISTRY.register("halter_fluffy_bagek_" + counter, () ->
                        new HalterItem("halter_fluffy_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        WESTERN_LEG_WRAPS_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                WESTERN_LEG_WRAPS_BAGEK.add(REGISTRY.register("western_leg_wraps_bagek_" + counter, () ->
                        new WesternLegWraps("western_leg_wraps_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        WESTERN_BLANKET_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                WESTERN_BLANKET_BAGEK.add(REGISTRY.register("western_blanket_bagek_" + counter, () ->
                        new WesternBlanketItem("western_blanket_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        WESTERN_BREAST_COLLAR_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                WESTERN_BREAST_COLLAR_BAGEK.add(REGISTRY.register("western_breast_collar_bagek_" + counter, () ->
                        new WesternBreastCollarItem("western_breast_collar_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        TRAVEL_BOOTS_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                TRAVEL_BOOTS_BAGEK.add(REGISTRY.register("english_leg_wraps_travel_bagek_" + counter, () ->
                        new EnglishLegWraps("english_leg_wraps_travel_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        ENGLISH_LEG_WRAPS_ENGLISH_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                ENGLISH_LEG_WRAPS_ENGLISH_BAGEK.add(REGISTRY.register("english_leg_wraps_english_bagek_" + counter, () ->
                        new EnglishLegWraps("english_leg_wraps_english_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        ENGLISH_BLANKET_ENGLISH_BAGEK = new ArrayList();
            for(int var1 = 0; var1 < 19; ++var1) {
                int counter = var1 + 1;
                ENGLISH_BLANKET_ENGLISH_BAGEK.add(REGISTRY.register("english_blanket_english_bagek_" + counter, () ->
                        new EnglishBlanketItem("english_blanket_english_bagek_" + counter, (new Item.Properties())
                                .stacksTo(64))
                ));
            }

        ENGLISH_LEG_WRAPS_TENDON_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_f" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_f" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_SADDLE_XC_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SADDLE_XC_BAGEK.add(REGISTRY.register("english_saddle_xc_bagek_" + counter, () ->
                    new EnglishSaddleItem("english_saddle_xc_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BRIDLE_XC_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BRIDLE_XC_BAGEK.add(REGISTRY.register("english_bridle_xc_bagek_" + counter, () ->
                    new EnglishBridleItem("english_bridle_xc_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_BREASTCOLLAR_BAGEK = new ArrayList<>();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_BREASTCOLLAR_BAGEK.add(REGISTRY.register("quartersheet_breastcollar_bagek_" + counter, () ->
                    new WesternBreastCollarItem("quartersheet_breastcollar_bagek_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_FLYSHEET = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK_FLYSHEET.add(REGISTRY.register("pasture_blanket_bagek_flysheet_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_flysheet_" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        //PASTEL
        HALTER_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            HALTER_PASTEL_BAGEK.add(REGISTRY.register("halter_bagek_p" + counter, () ->
                    new HalterItem("halter_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        FLYMASK_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            FLYMASK_PASTEL_BAGEK.add(REGISTRY.register("flymask_bagek_p" + counter, () ->
                    new HalterItem("flymask_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_PASTEL_BAGEK.add(REGISTRY.register("english_blanket_bagek_p" + counter, () ->
                    new EnglishBlanketItem("english_blanket_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_PASTEL_BAGEK.add(REGISTRY.register("english_leg_wraps_bagek_p" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_PASTEL_BAGEK.add(REGISTRY.register("pasture_blanket_bagek_p" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_PASTEL_BAGEK.add(REGISTRY.register("quartersheet_bagek_p" + counter, () ->
                    new EnglishBreastCollar("quartersheet_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        HALTER_FLUFFY_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            HALTER_FLUFFY_PASTEL_BAGEK.add(REGISTRY.register("halter_fluffy_bagek_p" + counter, () -> {
                return new HalterItem("halter_fluffy_bagek_p" + counter, (new Item.Properties())
                        .stacksTo(64));
            }));
        }

        WESTERN_LEG_WRAPS_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            WESTERN_LEG_WRAPS_PASTEL_BAGEK.add(REGISTRY.register("western_leg_wraps_bagek_p" + counter, () ->
                    new WesternLegWraps("western_leg_wraps_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_BLANKET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            WESTERN_BLANKET_PASTEL_BAGEK.add(REGISTRY.register("western_blanket_bagek_p" + counter, () ->
                    new WesternBlanketItem("western_blanket_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_BREAST_COLLAR_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            WESTERN_BREAST_COLLAR_PASTEL_BAGEK.add(REGISTRY.register("western_breast_collar_bagek_p" + counter, () ->
                    new WesternBreastCollarItem("western_breast_collar_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        TRAVEL_BOOTS_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            TRAVEL_BOOTS_PASTEL_BAGEK.add(REGISTRY.register("english_leg_wraps_travel_bagek_p" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_travel_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_ENGLISH_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_ENGLISH_PASTEL_BAGEK.add(REGISTRY.register("english_leg_wraps_english_bagek_p" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_english_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_ENGLISH_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_ENGLISH_PASTEL_BAGEK.add(REGISTRY.register("english_blanket_english_bagek_p" + counter, () ->
                    new EnglishBlanketItem("english_blanket_english_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_BAGEK_PASTEL.add(REGISTRY.register("english_leg_wraps_tendon_bagek_p" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK_PASTEL.add(REGISTRY.register("english_leg_wraps_tendon_bagek_fp" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_fp" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_SADDLE_XC_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SADDLE_XC_BAGEK_PASTEL.add(REGISTRY.register("english_saddle_xc_bagek_p" + counter, () ->
                    new EnglishSaddleItem("english_saddle_xc_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BRIDLE_XC_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BRIDLE_XC_BAGEK_PASTEL.add(REGISTRY.register("english_bridle_xc_bagek_p" + counter, () ->
                    new EnglishBridleItem("english_bridle_xc_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_BREASTCOLLAR_BAGEK_PASTEL = new ArrayList<>();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_BREASTCOLLAR_BAGEK_PASTEL.add(REGISTRY.register("quartersheet_breastcollar_bagek_p" + counter, () ->
                    new WesternBreastCollarItem("quartersheet_breastcollar_bagek_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_FLYSHEET_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK_FLYSHEET_PASTEL.add(REGISTRY.register("pasture_blanket_bagek_flysheet_p" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_flysheet_p" + counter, (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_WOOD_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 4; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_WOOD_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_c" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_c" + counter, (new Item.Properties()
                            .stacksTo(64)))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_WOOD_FLUFFY_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 4; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_WOOD_FLUFFY_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_fc" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_fc" + counter, (new Item.Properties()
                            .stacksTo(64)))
            ));
        }

        }

    }
