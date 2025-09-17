package com.coqire.bageksequineyaddon.item;

import com.coqire.bageksequineyaddon.BageksEquineyAddon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BageksEquineyAddon.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAGUETTE).stacksTo(64)));
    public static final RegistryObject<Item> PINK_DONUT_TREAT = ITEMS.register("pink_donut_treat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PINK_DONUT_TREAT).stacksTo(64)));
    public static final RegistryObject<Item> BLUE_DONUT_TREAT = ITEMS.register("blue_donut_treat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLUE_DONUT_TREAT).stacksTo(64)));
    public static final RegistryObject<Item> YELLOW_DONUT_TREAT = ITEMS.register("yellow_donut_treat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.YELLOW_DONUT_TREAT).stacksTo(64)));
    public static final RegistryObject<Item> BTACK = ITEMS.register("btack",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BBLOCK = ITEMS.register("bblock",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAGEK_DYE_1 = ITEMS.register("bagek_dye_1",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_2 = ITEMS.register("bagek_dye_2",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_3 = ITEMS.register("bagek_dye_3",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_4 = ITEMS.register("bagek_dye_4",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_5 = ITEMS.register("bagek_dye_5",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_6 = ITEMS.register("bagek_dye_6",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_7 = ITEMS.register("bagek_dye_7",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_8 = ITEMS.register("bagek_dye_8",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_9 = ITEMS.register("bagek_dye_9",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_10 = ITEMS.register("bagek_dye_10",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_11 = ITEMS.register("bagek_dye_11",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_12 = ITEMS.register("bagek_dye_12",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_13 = ITEMS.register("bagek_dye_13",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_14 = ITEMS.register("bagek_dye_14",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_15 = ITEMS.register("bagek_dye_15",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_16 = ITEMS.register("bagek_dye_16",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_17 = ITEMS.register("bagek_dye_17",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_18 = ITEMS.register("bagek_dye_18",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_19 = ITEMS.register("bagek_dye_19",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_20 = ITEMS.register("bagek_dye_20",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_21 = ITEMS.register("bagek_dye_21",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_22 = ITEMS.register("bagek_dye_22",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_23 = ITEMS.register("bagek_dye_23",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_24 = ITEMS.register("bagek_dye_24",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_25 = ITEMS.register("bagek_dye_25",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_26 = ITEMS.register("bagek_dye_26",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_27 = ITEMS.register("bagek_dye_27",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BAGEK_DYE_28 = ITEMS.register("bagek_dye_28",
            () -> new Item(new Item.Properties().stacksTo(64)));

}
