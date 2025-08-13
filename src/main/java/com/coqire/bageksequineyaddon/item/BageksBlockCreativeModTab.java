package com.coqire.bageksequineyaddon.item;

import com.coqire.bageksequineyaddon.block.ModBlocks;
import com.coqire.bageksequineyaddon.registry.BageksBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BageksBlockCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> MAIN;

    public BageksBlockCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "bageksaddon");
        MAIN = REGISTRY.register("bblock_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("creativetab.bblock_tab"))
                .icon(() -> new ItemStack(ModItems.BBLOCK.get()))
                .displayItems((pParameters, pOutput) -> {
                    BageksBlock.BLOCKS.getEntries().forEach((registeredItem) -> {
                        Block block = registeredItem.get();
                        pOutput.accept(block);
                    });

                    pOutput.accept(ModBlocks.BAGEK_WORKBENCH.get());

                })
                .withSearchBar().build());
    }

}
