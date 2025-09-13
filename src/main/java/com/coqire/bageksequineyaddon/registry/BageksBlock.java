package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.SWEM;
import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.items.GrainFeedItem;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import com.alaharranhonor.swem.forge.registry.BlockEntitySetup;
import com.coqire.bageksequineyaddon.BageksEquineyAddon;
import com.coqire.bageksequineyaddon.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class BageksBlock {
    public static final DeferredRegister<Block> BLOCKS;

    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_BAGEK;
    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_BAGEK;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_BAGEK;
    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_BAGEK;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_BAGEK;



    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        BageksTack.REGISTRY.register(name, (Supplier) itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> item(RegistryObject<? extends Block> block, CreativeModeTab itemGroup) {
        return () -> {
            return new BlockItem((Block) block.get(), (new Item.Properties()));
        };
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.Keys.BLOCKS, "bageksequineyaddon");


        SLOW_FEEDER_BAGEK = new ArrayList();
        for (int var2 = 0; var2 < 28; ++var2) {
            int counter = var2 + 1;
            SLOW_FEEDER_BAGEK.add(register("slow_feeder_bagek_" + counter, () -> {
                return new SlowFeederBlock(BlockBehaviour.Properties.of().noOcclusion()
                        .sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block) block.get());
                };
            }));
        }

        GRAIN_FEEDER_BAGEK = new ArrayList();
        for (int var2 = 0; var2 < 28; ++var2) {
            int counter = var2 + 1;
            GRAIN_FEEDER_BAGEK.add(register("grain_feeder_bagek_" + counter, () -> {
                return new GrainFeederBlock(BlockBehaviour.Properties.of().noOcclusion()
                        .sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block) block.get());
                };
            }));
        }

        HALF_BARREL_BAGEK = new ArrayList();
        for (int var2 = 0; var2 < 28; ++var2) {
            int counter = var2 + 1;
            HALF_BARREL_BAGEK.add(register("half_barrel_bagek_" + counter, () -> {
                return new HalfBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()
                        .sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block) block.get());
                };
            }));
        }

        TACK_BOX_BAGEK = new ArrayList();
        for (int var2 = 0; var2 < 28; ++var2) {
            int counter = var2 + 1;
            TACK_BOX_BAGEK.add(register("tack_box_bagek_" + counter, () -> {
                return new TackBoxBlock(BlockBehaviour.Properties.of().noOcclusion()
                        .sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
        }

        BIN_GRAIN_BAGEK = new ArrayList();
        for (int var2 = 0; var2 < 28; ++var2) {
            int counter = var2 + 1;
            BIN_GRAIN_BAGEK.add(register("bin_grain_bagek_" + counter, () -> {
                return new GrainBinBlock(BlockBehaviour.Properties.of().noOcclusion()
                        .sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block) block.get());
                };
            }));
        }

    }



    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }
}