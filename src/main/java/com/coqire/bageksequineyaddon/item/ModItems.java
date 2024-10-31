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
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAGUETTE)));
    public static final RegistryObject<Item> PINK_DONUT_TREAT = ITEMS.register("pink_donut_treat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PINK_DONUT_TREAT)));
    public static final RegistryObject<Item> BLUE_DONUT_TREAT = ITEMS.register("blue_donut_treat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLUE_DONUT_TREAT)));
    public static final RegistryObject<Item> YELLOW_DONUT_TREAT = ITEMS.register("yellow_donut_treat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.YELLOW_DONUT_TREAT)));

    public static final RegistryObject<Item> SUNBURST = ITEMS.register("sunburst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_sunburst = ITEMS.register("raw_sunburst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUNBURST_SHARD = ITEMS.register("sunburst_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> equium = ITEMS.register("equium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_equium = ITEMS.register("raw_equium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> equium_shard = ITEMS.register("equium_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> coralarite = ITEMS.register("coralarite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_coralarite = ITEMS.register("raw_coralarite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> coralarite_shard = ITEMS.register("coralarite_shard",
            () -> new Item(new Item.Properties()));


}
