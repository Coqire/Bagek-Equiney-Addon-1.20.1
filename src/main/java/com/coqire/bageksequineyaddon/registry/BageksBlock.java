package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import com.coqire.bageksequineyaddon.BageksEquineyAddon;
import com.coqire.bageksequineyaddon.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class BageksBlock {

    //BLOCKS WIP
    //public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_BAGEK;
   // public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_BAGEK;
    //public static final List<RegistryObject<GrainBinBlock>> GRAIN_BIN_BAGEK;
    //public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_BAGEK;
// later issue>>    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_BAGEK;

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    public static final DeferredRegister<Block> BLOCKS;

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.Keys.BLOCKS, "bageksequineyaddon");







    //    TACK_BOX_BAGEK = new ArrayList();
        //   for (int var1 = 0; var1 < 28; ++var1) {
     //       int counter = var1 + 1;
     //       TACK_BOX_BAGEK.add(BLOCKS("tack_box_bagek_" + counter, () -> {
    //            return new TackBoxBlock(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), 1);
    //        }, (block) -> {
    //            return () -> {
    //                return new TackBoxBlockItem((Block) ;
    //            };
    //        }));

        }
    }

