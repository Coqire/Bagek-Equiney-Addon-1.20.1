package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.ModRef;
import com.alaharranhonor.swem.forge.community.RackType;
import com.alaharranhonor.swem.forge.community.TackType;
import com.alaharranhonor.swem.forge.community.content.tack.type.TackTypeData;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.alaharranhonor.swem.forge.tack.TackItemDefinition;
import com.alaharranhonor.swem.forge.util.ColorUtil;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BagekTack {
    // INDIVIDUAL ITEMS
    public static final RegistryObject<TackItem> HALTER_FLUFFY_RED;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_ORANGE;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_YELLOW;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_LIME;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_GREEN;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_LIGHT_BLUE;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_CYAN;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_BLUE;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_PURPLE;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_MAGENTA;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_PINK;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_WHITE;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_LIGHT_GRAY;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_GRAY;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_BLACK;
    public static final RegistryObject<TackItem> HALTER_FLUFFY_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DROPBAND_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_FLASH_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_SPLITEAR_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_XC_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_XC_FLUFFY_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DROPBAND_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_FLASH_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_SPLITEAR_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_XC_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_XC_FLUFFY_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_C1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_C2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_C3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_C4;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_C1;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_C2;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_C3;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_C4;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_ENGLISH_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FREEMOTION_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_XC_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_XC_FLUFFY_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_ENGLISH_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FREEMOTION_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_XC_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_XC_FLUFFY_BROWN;
    public static final RegistryObject<TackItem> BAGEK_LUNGEGEAR;
    //PLAID + ZEBRA RUG
    public static final RegistryObject<TackItem> PASTURE_BLANKET_PATTERNED1;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_PATTERNED2;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_PATTERNED3;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_PATTERNED4;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_PATTERNED5;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_PATTERNED6;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_ZEBRA_BAGEK;
    //SADDLES
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_XC_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_XC_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_C1;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_C2;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_C3;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_C4;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_BAGEK_BROWN;
    //GIRTH STRAPS
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_ANATOMIC_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_FLUFFY_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_XC_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_XC_FLUFFY_BLACK;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_ANATOMIC_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_FLUFFY_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_XC_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_XC_FLUFFY_BROWN;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_C1;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_C2;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_C3;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_C4;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FC1;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FC2;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FC3;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FC4;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_BROWN;
    //COLOUR SETS
    public static final List<RegistryObject<TackItem>> HALTER_BAGEK;
    public static final List<RegistryObject<TackItem>> HALTER_FLUFFY_BAGEK;
    public static final List<RegistryObject<TackItem>> FLYMASK_BAGEK;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_BAGEK_FLYSHEET;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLE_XC_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLE_XC_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKET_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKET_ENGLISH_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_ENGLISH_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK;
    public static final List<RegistryObject<TackItem>> WESTERN_BLANKET_BAGEK;
    public static final List<RegistryObject<TackItem>> WESTERN_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<TackItem>> WESTERN_BREAST_COLLAR_BAGEK;
    public static final List<RegistryObject<TackItem>> QUARTERSHEET_BAGEK;
    public static final List<RegistryObject<TackItem>> QUARTERSHEET_BREASTCOLLAR_BAGEK;
    public static final List<RegistryObject<TackItem>> TRAVEL_BOOTS_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_WOOD_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_WOOD_FLUFFY_BAGEK;
    //PASTELS
    public static final List<RegistryObject<TackItem>> HALTER_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> HALTER_FLUFFY_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> FLYMASK_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_BAGEK_FLYSHEET_PASTEL;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLE_XC_BAGEK_PASTEL;
    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLE_XC_BAGEK_PASTEL;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKET_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKET_ENGLISH_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_ENGLISH_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_BAGEK_PASTEL;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK_PASTEL;
    public static final List<RegistryObject<TackItem>> QUARTERSHEET_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> QUARTERSHEET_BREASTCOLLAR_BAGEK_PASTEL;
    public static final List<RegistryObject<TackItem>> WESTERN_BLANKET_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> WESTERN_LEG_WRAPS_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> WESTERN_BREAST_COLLAR_PASTEL_BAGEK;
    public static final List<RegistryObject<TackItem>> TRAVEL_BOOTS_PASTEL_BAGEK;
    public static DeferredRegister<Item> REGISTRY;

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        //INDIVIDUAL ITEMS

        //FLUFFY MC HALTERS
        HALTER_FLUFFY_RED = REGISTRY.register("halter_fluffy_red", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_ORANGE = REGISTRY.register("halter_fluffy_orange", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_YELLOW = REGISTRY.register("halter_fluffy_yellow", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_LIME = REGISTRY.register("halter_fluffy_lime", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_GREEN = REGISTRY.register("halter_fluffy_green", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_CYAN = REGISTRY.register("halter_fluffy_cyan", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_LIGHT_BLUE = REGISTRY.register("halter_fluffy_light_blue", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_BLUE = REGISTRY.register("halter_fluffy_blue", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_PURPLE = REGISTRY.register("halter_fluffy_purple", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_MAGENTA = REGISTRY.register("halter_fluffy_magenta", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_PINK = REGISTRY.register("halter_fluffy_pink", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_WHITE = REGISTRY.register("halter_fluffy_white", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_LIGHT_GRAY = REGISTRY.register("halter_fluffy_light_gray", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_GRAY = REGISTRY.register("halter_fluffy_gray", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_BLACK = REGISTRY.register("halter_fluffy_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        HALTER_FLUFFY_BROWN = REGISTRY.register("halter_fluffy_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.HALTER).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        //BRIDLES
        ENGLISH_BRIDLE_BAGEK_BLACK = REGISTRY.register("english_bridle_bagek_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C1 = REGISTRY.register("english_bridle_bagek_c1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C2 = REGISTRY.register("english_bridle_bagek_c2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C3 = REGISTRY.register("english_bridle_bagek_c3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_C4 = REGISTRY.register("english_bridle_bagek_c4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DROPBAND_BLACK = REGISTRY.register("english_bridle_bagek_dropband_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_SPLITEAR_BLACK = REGISTRY.register("english_bridle_bagek_splitear_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BLACK = REGISTRY.register("english_bridle_bagek_doubleband_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BLACK = REGISTRY.register("english_bridle_bagek_leather_war_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_FLASH_BLACK = REGISTRY.register("english_bridle_bagek_flash_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_BLACK = REGISTRY.register("english_bridle_xc_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_FLUFFY_BLACK = REGISTRY.register("english_bridle_xc_fluffy_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DROPBAND_BROWN = REGISTRY.register("english_bridle_bagek_dropband_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_SPLITEAR_BROWN = REGISTRY.register("english_bridle_bagek_splitear_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DOUBLEBAND_BROWN = REGISTRY.register("english_bridle_bagek_doubleband_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_LEATHER_WAR_BROWN = REGISTRY.register("english_bridle_bagek_leather_war_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_FLASH_BROWN = REGISTRY.register("english_bridle_bagek_flash_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_BROWN = REGISTRY.register("english_bridle_xc_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_XC_FLUFFY_BROWN = REGISTRY.register("english_bridle_xc_fluffy_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_BROWN = REGISTRY.register("western_bridle_bagek_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_BREAST_COLLAR_BAGEK_C1 = REGISTRY.register("english_breast_collar_bagek_c1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_C2 = REGISTRY.register("english_breast_collar_bagek_c2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_C3 = REGISTRY.register("english_breast_collar_bagek_c3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_C4 = REGISTRY.register("english_breast_collar_bagek_c4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_BLACK = REGISTRY.register("english_breast_collar_bagek_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_ENGLISH_BLACK = REGISTRY.register("english_breast_collar_english_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FREEMOTION_BLACK = REGISTRY.register("english_breast_collar_freemotion_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BLACK = REGISTRY.register("english_breast_collar_fivepoint_bagek_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_BLACK = REGISTRY.register("english_breast_collar_xc_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_FLUFFY_BLACK = REGISTRY.register("english_breast_collar_xc_fluffy_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_ENGLISH_BROWN = REGISTRY.register("english_breast_collar_english_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FREEMOTION_BROWN = REGISTRY.register("english_breast_collar_freemotion_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_BROWN = REGISTRY.register("english_breast_collar_fivepoint_bagek_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_BROWN = REGISTRY.register("english_breast_collar_xc_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_XC_FLUFFY_BROWN = REGISTRY.register("english_breast_collar_xc_fluffy_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        BAGEK_LUNGEGEAR = REGISTRY.register("bagek_lungegear", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        //Plaid + zebra rug
         PASTURE_BLANKET_ZEBRA_BAGEK = REGISTRY.register("pasture_blanket_zebra_bagek", () ->
                        new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(),
                                (new Item.Properties().stacksTo(64))
                        ));
                PASTURE_BLANKET_PATTERNED1 = REGISTRY.register("pasture_blanket_patterned1", () ->
                        new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(),
                                (new Item.Properties().stacksTo(64))
                        ));
                PASTURE_BLANKET_PATTERNED2 = REGISTRY.register("pasture_blanket_patterned2", () ->
                        new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(),
                                (new Item.Properties().stacksTo(64))
                        ));
                PASTURE_BLANKET_PATTERNED3 = REGISTRY.register("pasture_blanket_patterned3", () ->
                        new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(),
                                (new Item.Properties().stacksTo(64))
                        ));
                PASTURE_BLANKET_PATTERNED4 = REGISTRY.register("pasture_blanket_patterned4", () ->
                        new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(),
                                (new Item.Properties().stacksTo(64))
                        ));
                PASTURE_BLANKET_PATTERNED5 = REGISTRY.register("pasture_blanket_patterned5", () ->
                        new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(),
                                (new Item.Properties().stacksTo(64))
                        ));
                PASTURE_BLANKET_PATTERNED6 = REGISTRY.register("pasture_blanket_patterned6", () ->
                        new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(),
                                (new Item.Properties().stacksTo(64))
                        ));

        //SADDLES
        ENGLISH_SADDLE_XC_BLACK = REGISTRY.register("english_saddle_xc_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_XC_BROWN = REGISTRY.register("english_saddle_xc_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_BLACK = REGISTRY.register("english_saddle_bagek_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_SADDLE_BAGEK_BROWN = REGISTRY.register("western_saddle_bagek_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C1 = REGISTRY.register("english_saddle_bagek_c1", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C2 = REGISTRY.register("english_saddle_bagek_c2", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C3 = REGISTRY.register("english_saddle_bagek_c3", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_C4 = REGISTRY.register("english_saddle_bagek_c4", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(),
                        (new Item.Properties().stacksTo(64))
                ));

//GIRTH STRAPS
        ENGLISH_GIRTH_STRAP_ANATOMIC_BLACK = REGISTRY.register("english_girth_strap_anatomic_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BLACK = REGISTRY.register("english_girth_strap_anatomic_fluffy_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_FLUFFY_BLACK = REGISTRY.register("english_girth_strap_fluffy_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_BLACK = REGISTRY.register("english_girth_strap_xc_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_FLUFFY_BLACK = REGISTRY.register("english_girth_strap_xc_fluffy_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_ANATOMIC_BROWN = REGISTRY.register("english_girth_strap_anatomic_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_ANATOMIC_FLUFFY_BROWN = REGISTRY.register("english_girth_strap_anatomic_fluffy_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_FLUFFY_BROWN = REGISTRY.register("english_girth_strap_fluffy_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_BROWN = REGISTRY.register("english_girth_strap_xc_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_XC_FLUFFY_BROWN = REGISTRY.register("english_girth_strap_xc_fluffy_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_BLACK = REGISTRY.register("english_girth_strap_bagek_black", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_BROWN = REGISTRY.register("western_girth_strap_bagek_brown", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C1 = REGISTRY.register("english_girth_strap_bagek_c1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C2 = REGISTRY.register("english_girth_strap_bagek_c2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C3 = REGISTRY.register("english_girth_strap_bagek_c3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_C4 = REGISTRY.register("english_girth_strap_bagek_c4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC1 = REGISTRY.register("english_girth_strap_bagek_fc1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC2 = REGISTRY.register("english_girth_strap_bagek_fc2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC3 = REGISTRY.register("english_girth_strap_bagek_fc3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FC4 = REGISTRY.register("english_girth_strap_bagek_fc4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(),
                        (new Item.Properties().stacksTo(64))
                ));

//ARRAY LISTS

        //NORMAL COLOURS
        HALTER_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            HALTER_BAGEK.add(REGISTRY.register("halter_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        HALTER_FLUFFY_BAGEK = new ArrayList<>();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            HALTER_FLUFFY_BAGEK.add(REGISTRY.register("halter_fluffy_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        FLYMASK_BAGEK = new ArrayList<>();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            FLYMASK_BAGEK.add(REGISTRY.register("flymask_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_FLYSHEET = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK_FLYSHEET.add(REGISTRY.register("pasture_blanket_bagek_flysheet_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK.add(REGISTRY.register("pasture_blanket_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_SADDLE_XC_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SADDLE_XC_BAGEK.add(REGISTRY.register("english_saddle_xc_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BRIDLE_XC_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BRIDLE_XC_BAGEK.add(REGISTRY.register("english_bridle_xc_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_BAGEK.add(REGISTRY.register("english_blanket_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_ENGLISH_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_ENGLISH_BAGEK.add(REGISTRY.register("english_blanket_english_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/english/english_blanket_english_bagek_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/english/english_blanket_english_bagek_" + counter + ".png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE)))
                            .build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_BLANKET_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            WESTERN_BLANKET_BAGEK.add(REGISTRY.register("western_blanket_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_LEG_WRAPS_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            WESTERN_LEG_WRAPS_BAGEK.add(REGISTRY.register("western_leg_wraps_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_BAGEK.add(REGISTRY.register("english_leg_wraps_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_ENGLISH_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_ENGLISH_BAGEK.add(REGISTRY.register("english_leg_wraps_english_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_f" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        TRAVEL_BOOTS_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            TRAVEL_BOOTS_BAGEK.add(REGISTRY.register("english_leg_wraps_travel_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_BAGEK = new ArrayList<>();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_BAGEK.add(REGISTRY.register("quartersheet_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_BREASTCOLLAR_BAGEK = new ArrayList<>();
        for (int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_BREASTCOLLAR_BAGEK.add(REGISTRY.register("quartersheet_breastcollar_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_BREAST_COLLAR_BAGEK = new ArrayList();
        for(int var1 = 0; var1 < 19; ++var1) {
            int counter = var1 + 1;
            WESTERN_BREAST_COLLAR_BAGEK.add(REGISTRY.register("western_breast_collar_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }


        //PASTEL COLOURS
        HALTER_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            HALTER_PASTEL_BAGEK.add(REGISTRY.register("halter_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        HALTER_FLUFFY_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            HALTER_FLUFFY_PASTEL_BAGEK.add(REGISTRY.register("halter_fluffy_bagek_p" + counter, () -> {
                return new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                        .stacksTo(64));
            }));
        }

        FLYMASK_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            FLYMASK_PASTEL_BAGEK.add(REGISTRY.register("flymask_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_FLYSHEET_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK_FLYSHEET_PASTEL.add(REGISTRY.register("pasture_blanket_bagek_flysheet_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_PASTEL_BAGEK.add(REGISTRY.register("pasture_blanket_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_SADDLE_XC_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_SADDLE_XC_BAGEK_PASTEL.add(REGISTRY.register("english_saddle_xc_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BRIDLE_XC_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BRIDLE_XC_BAGEK_PASTEL.add(REGISTRY.register("english_bridle_xc_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BRIDLE).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_PASTEL_BAGEK.add(REGISTRY.register("english_blanket_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_ENGLISH_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_ENGLISH_PASTEL_BAGEK.add(REGISTRY.register("english_blanket_english_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/english/english_blanket_english_bagek_p" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/english/english_blanket_english_bagek_p" + counter + ".png"))
                            .build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_PASTEL_BAGEK.add(REGISTRY.register("english_leg_wraps_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_ENGLISH_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_ENGLISH_PASTEL_BAGEK.add(REGISTRY.register("english_leg_wraps_english_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }


        ENGLISH_LEG_WRAPS_TENDON_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_BAGEK_PASTEL.add(REGISTRY.register("english_leg_wraps_tendon_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK_PASTEL = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK_PASTEL.add(REGISTRY.register("english_leg_wraps_tendon_bagek_fp" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        TRAVEL_BOOTS_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            TRAVEL_BOOTS_PASTEL_BAGEK.add(REGISTRY.register("english_leg_wraps_travel_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_BLANKET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            WESTERN_BLANKET_PASTEL_BAGEK.add(REGISTRY.register("western_blanket_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_LEG_WRAPS_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            WESTERN_LEG_WRAPS_PASTEL_BAGEK.add(REGISTRY.register("western_leg_wraps_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }


        WESTERN_BREAST_COLLAR_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            WESTERN_BREAST_COLLAR_PASTEL_BAGEK.add(REGISTRY.register("western_breast_collar_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_PASTEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_PASTEL_BAGEK.add(REGISTRY.register("quartersheet_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_BREASTCOLLAR_BAGEK_PASTEL = new ArrayList<>();
        for (int var1 = 0; var1 < 7; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_BREASTCOLLAR_BAGEK_PASTEL.add(REGISTRY.register("quartersheet_breastcollar_bagek_p" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }


        //WOOD TENDON BOOTS
        ENGLISH_LEG_WRAPS_TENDON_WOOD_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 4; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_WOOD_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_c" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties()
                            .stacksTo(64)))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_WOOD_FLUFFY_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 4; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_WOOD_FLUFFY_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_fc" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties()
                            .stacksTo(64)))
            ));
        }

    }

    public BagekTack() {
    }

    public static void init(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
};

