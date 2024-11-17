package com.coqire.bageksequineyaddon.block;

import com.coqire.bageksequineyaddon.BageksEquineyAddon;
import com.coqire.bageksequineyaddon.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BageksEquineyAddon.MOD_ID);

    public static final RegistryObject<Block> SUNBURST_ORE = registerBlock("sunburst_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SUNBURST_ORE = registerBlock("deepslate_sunburst_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SUNBURST_BLOCK = registerBlock("sunburst_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EQUIUM_ORE = registerBlock("equium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_EQUIUM_ORE = registerBlock("deepslate_equium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EQUIUM_BLOCK = registerBlock("equium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CORALARITE_ORE = registerBlock("coralarite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_CORALARITE_ORE = registerBlock("deepslate_coralarite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CORALARITE_BLOCK = registerBlock("coralarite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(7f).requiresCorrectToolForDrops()));








    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
