package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.ModRef;
import com.alaharranhonor.swem.forge.community.RackType;
import com.alaharranhonor.swem.forge.community.TackType;
import com.alaharranhonor.swem.forge.community.content.tack.type.*;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.tack.TackItemDefinition;
import com.alaharranhonor.swem.forge.util.ColorUtil;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class BageksTack {

    public static void init (IEventBus eventBus){
        REGISTRY.register(eventBus);
    }

    //TACK
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_1;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_2;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_3;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_BAGEK_4;

    public static final RegistryObject<TackItem> WESTERN_SADDLE_BAGEK_RACING_1;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_BAGEK_RACING_2;

    public static final RegistryObject<TackItem> WESTERN_SADDLE_BAGEK_1;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_BAGEK_2;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_BAGEK_3;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_BAGEK_4;

    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_4;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_4;

    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_FSH_1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_FSH_2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_FSH_3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_FSH_4;

    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_SPLITR_1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_SPLITR_2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_SPLITR_3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_SPLITR_4;

    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DROP_1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DROP_2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DROP_3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_DROP_4;

    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_4;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_1;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_2;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_3;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_4;

    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_1;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_2;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_3;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_4;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_FLUFFY_1;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_FLUFFY_2;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_FLUFFY_3;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_BAGEK_FLUFFY_4;

    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_1;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_2;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_3;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_4;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_1;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_2;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_3;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_4;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_RACING_1;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_RACING_2;

    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_1;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_2;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_3;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_4;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_1;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_2;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_3;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_4;

    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_1;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_2;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_3;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_4;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_1;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_2;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_3;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_4;

    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_1;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_2;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_3;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_4;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_1;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_2;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_3;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_4;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_1;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_2;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_3;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_4;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_1;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_2;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_3;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_4;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_FREE_1;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_FREE_2;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_FREE_3;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_BAGEK_FREE_4;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_BAGEK_1;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_BAGEK_2;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_BAGEK_3;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_BAGEK_4;

    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_1;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_2;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_3;


    //SETS

    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLE_RACING_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLE_RACING_BAGEK_B;

    public static final List<RegistryObject<TackItem>> HALTER_BAGEK;
    public static final List<RegistryObject<TackItem>> HALTER_FLUFFY_BAGEK;
    public static final List<RegistryObject<TackItem>> FLYMASK_BAGEK;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_BAGEK_FLYSHEET;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_BAGEK_PLAID;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKET_BAGEK_RAINSHEET;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKET_XC_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKET_ENGLISH_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKET_BAGEK_PLAID;
    public static final List<RegistryObject<TackItem>> WESTERN_BLANKET_BAGEK_RACING;
    public static final List<RegistryObject<TackItem>> WESTERN_BLANKET_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_BAGEK_XC;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_ENGLISH_BAGEK;
    public static final List<RegistryObject<TackItem>> WESTERN_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_TRAVEL_BAGEK;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS_BAGEK_EARBONNET;
    public static final List<RegistryObject<TackItem>> QUARTERSHEET_BAGEK;
    public static final List<RegistryObject<TackItem>> QUARTERSHEET_PLAID_BAGEK;



    public static DeferredRegister<Item> REGISTRY;

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "bageksequineyaddon");

        ENGLISH_SADDLE_BAGEK_1 = REGISTRY.register("english_saddle_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_2 = REGISTRY.register("english_saddle_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_3 = REGISTRY.register("english_saddle_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_SADDLE_BAGEK_4 = REGISTRY.register("english_saddle_bagek_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));


        WESTERN_SADDLE_BAGEK_RACING_1 = REGISTRY.register("western_saddle_bagek_racing_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_SADDLE_BAGEK_RACING_2 = REGISTRY.register("western_saddle_bagek_racing_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        WESTERN_SADDLE_BAGEK_1 = REGISTRY.register("western_saddle_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_SADDLE_BAGEK_2 = REGISTRY.register("western_saddle_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_SADDLE_BAGEK_3 = REGISTRY.register("western_saddle_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_SADDLE_BAGEK_4 = REGISTRY.register("western_saddle_bagek_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.SADDLE)
                        .withData(new SaddleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_BRIDLE_BAGEK_DB_1 = REGISTRY.register("english_bridle_bagek_db_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DB_2 = REGISTRY.register("english_bridle_bagek_db_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DB_3 = REGISTRY.register("english_bridle_bagek_db_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DB_4 = REGISTRY.register("english_bridle_bagek_db_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_1 = REGISTRY.register("english_bridle_bagek_db_fluffy_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_2 = REGISTRY.register("english_bridle_bagek_db_fluffy_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_3 = REGISTRY.register("english_bridle_bagek_db_fluffy_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_4 = REGISTRY.register("english_bridle_bagek_db_fluffy_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_BRIDLE_BAGEK_XC_1 = REGISTRY.register("english_bridle_bagek_xc_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_XC_2 = REGISTRY.register("english_bridle_bagek_xc_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_XC_3 = REGISTRY.register("english_bridle_bagek_xc_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_XC_4 = REGISTRY.register("english_bridle_bagek_xc_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_1 = REGISTRY.register("english_bridle_bagek_xc_fluffy_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_2 = REGISTRY.register("english_bridle_bagek_xc_fluffy_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_3 = REGISTRY.register("english_bridle_bagek_xc_fluffy_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_4 = REGISTRY.register("english_bridle_bagek_xc_fluffy_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_BRIDLE_BAGEK_DROP_1 = REGISTRY.register("english_bridle_bagek_drop_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DROP_2 = REGISTRY.register("english_bridle_bagek_drop_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DROP_3 = REGISTRY.register("english_bridle_bagek_drop_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_DROP_4 = REGISTRY.register("english_bridle_bagek_drop_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_BRIDLE_BAGEK_SPLITR_1 = REGISTRY.register("english_bridle_bagek_splitr_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_SPLITR_2 = REGISTRY.register("english_bridle_bagek_splitr_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_SPLITR_3 = REGISTRY.register("english_bridle_bagek_splitr_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_SPLITR_4 = REGISTRY.register("english_bridle_bagek_splitr_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_BRIDLE_BAGEK_FSH_1 = REGISTRY.register("english_bridle_bagek_fsh_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_FSH_2 = REGISTRY.register("english_bridle_bagek_fsh_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_FSH_3 = REGISTRY.register("english_bridle_bagek_fsh_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BRIDLE_BAGEK_FSH_4 = REGISTRY.register("english_bridle_bagek_fsh_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_1 = REGISTRY.register("english_leg_wraps_horseshoe_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS)
                        .build(),(new Item.Properties().stacksTo(64))));
        ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_2 = REGISTRY.register("english_leg_wraps_horseshoe_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS)
                        .build(),(new Item.Properties().stacksTo(64))));
        ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_3 = REGISTRY.register("english_leg_wraps_horseshoe_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS)
                        .build(),(new Item.Properties().stacksTo(64))));

        ENGLISH_BRIDLE_RACING_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BRIDLE_RACING_BAGEK.add(REGISTRY.register("english_bridle_racing_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                            .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }
        ENGLISH_BRIDLE_RACING_BAGEK_B = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BRIDLE_RACING_BAGEK_B.add(REGISTRY.register("english_bridle_racing_bagek_b" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                            .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "english")).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_GIRTH_STRAP_BAGEK_1 = REGISTRY.register("english_girth_strap_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_1.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_2 = REGISTRY.register("english_girth_strap_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_2.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_3 = REGISTRY.register("english_girth_strap_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_3.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_4 = REGISTRY.register("english_girth_strap_bagek_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_4.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_1 = REGISTRY.register("english_girth_strap_bagek_fluffy_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_fluffy_1.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_2 = REGISTRY.register("english_girth_strap_bagek_fluffy_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_fluffy_2.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_3 = REGISTRY.register("english_girth_strap_bagek_fluffy_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_fluffy_3.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_4 = REGISTRY.register("english_girth_strap_bagek_fluffy_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_fluffy_4.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_1 = REGISTRY.register("english_girth_strap_bagek_jumping_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_1.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_2 = REGISTRY.register("english_girth_strap_bagek_jumping_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_2.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_3 = REGISTRY.register("english_girth_strap_bagek_jumping_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_3.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_4 = REGISTRY.register("english_girth_strap_bagek_jumping_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_4.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_1 = REGISTRY.register("english_girth_strap_bagek_jumping_fluffy_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_fluffy_1.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_2 = REGISTRY.register("english_girth_strap_bagek_jumping_fluffy_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_fluffy_2.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_3 = REGISTRY.register("english_girth_strap_bagek_jumping_fluffy_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_fluffy_3.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_4 = REGISTRY.register("english_girth_strap_bagek_jumping_fluffy_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_jumping_fluffy_4.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        WESTERN_GIRTH_STRAP_BAGEK_1 = REGISTRY.register("western_girth_strap_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_1.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_2 = REGISTRY.register("western_girth_strap_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_2.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_3 = REGISTRY.register("western_girth_strap_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_3.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_4 = REGISTRY.register("western_girth_strap_bagek_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_4.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_1 = REGISTRY.register("western_girth_strap_bagek_fluffy_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_fluffy_1.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_2 = REGISTRY.register("western_girth_strap_bagek_fluffy_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_fluffy_2.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_3 = REGISTRY.register("western_girth_strap_bagek_fluffy_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_fluffy_3.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_4 = REGISTRY.register("western_girth_strap_bagek_fluffy_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/western_girth_strap_bagek_fluffy_4.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));

        ENGLISH_GIRTH_STRAP_BAGEK_RACING_1 = REGISTRY.register("english_girth_strap_bagek_racing_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_racing_1.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_GIRTH_STRAP_BAGEK_RACING_2 = REGISTRY.register("english_girth_strap_bagek_racing_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP)
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/girth/english_girth_strap_bagek_racing_2.png"))
                        .withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties().stacksTo(64))
                ));


        ENGLISH_BREAST_COLLAR_BAGEK_1 = REGISTRY.register("english_breast_collar_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_2 = REGISTRY.register("english_breast_collar_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_3 = REGISTRY.register("english_breast_collar_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_4 = REGISTRY.register("english_breast_collar_bagek_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_1 = REGISTRY.register("english_breast_collar_bagek_fivepoint_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_2 = REGISTRY.register("english_breast_collar_bagek_fivepoint_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_3 = REGISTRY.register("english_breast_collar_bagek_fivepoint_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_FIVEPOINT_BAGEK_4 = REGISTRY.register("english_breast_collar_bagek_fivepoint_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_FREE_1 = REGISTRY.register("english_breast_collar_bagek_free_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_FREE_2 = REGISTRY.register("english_breast_collar_bagek_free_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_FREE_3 = REGISTRY.register("english_breast_collar_bagek_free_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_FREE_4 = REGISTRY.register("english_breast_collar_bagek_free_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_1 = REGISTRY.register("english_breast_collar_bagek_xc_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_2 = REGISTRY.register("english_breast_collar_bagek_xc_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_3 = REGISTRY.register("english_breast_collar_bagek_xc_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_4 = REGISTRY.register("english_breast_collar_bagek_xc_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_1 = REGISTRY.register("english_breast_collar_bagek_xc_fluffy_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_2 = REGISTRY.register("english_breast_collar_bagek_xc_fluffy_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_3 = REGISTRY.register("english_breast_collar_bagek_xc_fluffy_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_4 = REGISTRY.register("english_breast_collar_bagek_xc_fluffy_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BREAST_COLLAR_BAGEK_1 = REGISTRY.register("western_breast_collar_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BREAST_COLLAR_BAGEK_2 = REGISTRY.register("western_breast_collar_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BREAST_COLLAR_BAGEK_3 = REGISTRY.register("western_breast_collar_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BREAST_COLLAR_BAGEK_4 = REGISTRY.register("western_breast_collar_bagek_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(),
                        (new Item.Properties().stacksTo(64))
                ));


        WESTERN_BRIDLE_BAGEK_1 = REGISTRY.register("western_bridle_bagek_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_2 = REGISTRY.register("western_bridle_bagek_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_3 = REGISTRY.register("western_bridle_bagek_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_4 = REGISTRY.register("western_bridle_bagek_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_FLUFFY_1 = REGISTRY.register("western_bridle_bagek_fluffy_1", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_FLUFFY_2 = REGISTRY.register("western_bridle_bagek_fluffy_2", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_FLUFFY_3 = REGISTRY.register("western_bridle_bagek_fluffy_3", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));
        WESTERN_BRIDLE_BAGEK_FLUFFY_4 = REGISTRY.register("western_bridle_bagek_fluffy_4", () ->
                new TackItem(TackItemDefinition.builder(TackType.BRIDLE)
                        .withData(new BridleTypeData(true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE), "western")).build(),
                        (new Item.Properties().stacksTo(64))
                ));


        HALTER_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            HALTER_BAGEK.add(REGISTRY.register("halter_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        HALTER_FLUFFY_BAGEK = new ArrayList<>();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            HALTER_FLUFFY_BAGEK.add(REGISTRY.register("halter_fluffy_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        FLYMASK_BAGEK = new ArrayList<>();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            FLYMASK_BAGEK.add(REGISTRY.register("flymask_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_FLYSHEET = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK_FLYSHEET.add(REGISTRY.register("pasture_blanket_bagek_flysheet_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_3_short_bagek_flysheet_" + counter + ".png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_5_long_bagek_flysheet_" + counter + ".png"))
                            .withData(
                                    new PastureBlanketTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE), false)).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK.add(REGISTRY.register("pasture_blanket_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_3_short_bagek_" + counter + ".png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_5_long_bagek_" + counter + ".png"))
                            .withData(
                                    new PastureBlanketTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE), false)).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_RAINSHEET = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK_RAINSHEET.add(REGISTRY.register("pasture_blanket_bagek_rainsheet_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_3_short_bagek_rainsheet_" + counter + ".png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_5_long_bagek_rainsheet_" + counter + ".png"))
                            .withData(
                                    new PastureBlanketTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE), false)).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        PASTURE_BLANKET_BAGEK_PLAID = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            PASTURE_BLANKET_BAGEK.add(REGISTRY.register("pasture_blanket_bagek_plaid_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_3_short_bagek_plaid_" + counter + ".png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_5_long_bagek_plaid_" + counter + ".png"))
                            .withData(
                                    new PastureBlanketTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE), false)).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_XC_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_XC_BAGEK.add(REGISTRY.register("english_blanket_xc_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/xc/english_blanket_xc_bagek_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/xc/english_blanket_xc_bagek_" + counter + ".png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE)))
                            .build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_BLANKET_ENGLISH_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
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

        ENGLISH_BLANKET_BAGEK_PLAID = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_BLANKET_BAGEK_PLAID.add(REGISTRY.register("english_blanket_bagek_plaid_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/plaid/english_blanket_plaid_bagek_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/plaid/english_blanket_plaid_bagek_" + counter + ".png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE)))
                            .build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_BLANKET_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            WESTERN_BLANKET_BAGEK.add(REGISTRY.register("western_blanket_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/western/western_blanket_bagek_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/western/western_blanket_bagek_" + counter + ".png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE))).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_BLANKET_BAGEK_RACING = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            WESTERN_BLANKET_BAGEK_RACING.add(REGISTRY.register("western_blanket_bagek_racing_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/racing/western_blanket_racing_bagek_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/racing/western_blanket_racing_bagek_" + counter + ".png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE))).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        WESTERN_LEG_WRAPS_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            WESTERN_LEG_WRAPS_BAGEK.add(REGISTRY.register("western_leg_wraps_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_BAGEK_XC = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_BAGEK_XC.add(REGISTRY.register("english_leg_wraps_bagek_xc_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_ENGLISH_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_ENGLISH_BAGEK.add(REGISTRY.register("english_leg_wraps_english_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK.add(REGISTRY.register("english_leg_wraps_tendon_bagek_f" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_TRAVEL_BAGEK = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_TRAVEL_BAGEK.add(REGISTRY.register("english_leg_wraps_travel_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        ENGLISH_LEG_WRAPS_BAGEK_EARBONNET = new ArrayList();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            ENGLISH_LEG_WRAPS_BAGEK_EARBONNET.add(REGISTRY.register("english_leg_wraps_bagek_earbonnet_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_BAGEK = new ArrayList<>();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_BAGEK.add(REGISTRY.register("quartersheet_bagek_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

        QUARTERSHEET_PLAID_BAGEK = new ArrayList<>();
        for (int var1 = 0; var1 < 28; ++var1) {
            int counter = var1 + 1;
            QUARTERSHEET_PLAID_BAGEK.add(REGISTRY.register("quartersheet_bagek_plaid_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
        }

    }
}
