package com.coqire.bageksequineyaddon.item;

import com.coqire.bageksequineyaddon.block.ModBlocks;
import com.coqire.bageksequineyaddon.registry.BagekTack;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BageksAddonCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> MAIN;

    public BageksAddonCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "bageksaddon");
        MAIN = REGISTRY.register("bageks_tab", () -> CreativeModeTab.builder().title(Component.translatable("creativetab.bageks_tab")).icon(() -> new ItemStack(ModItems.BAGUETTE.get()))
                .displayItems((pParameters, pOutput) ->

                        BagekTack.REGISTRY.getEntries().forEach((registeredItem) -> {
                    Item item = registeredItem.get();
                    pOutput.accept(item);

                    pOutput.accept(ModItems.BAGUETTE.get());
                    pOutput.accept(ModItems.BLUE_DONUT_TREAT.get());
                    pOutput.accept(ModItems.PINK_DONUT_TREAT.get());
                    pOutput.accept(ModItems.YELLOW_DONUT_TREAT.get());
                    pOutput.accept(ModItems.SUNBURST.get());
                    pOutput.accept(ModItems.SUNBURST_SHARD.get());
                    pOutput.accept(ModItems.raw_sunburst.get());
                    pOutput.accept(ModItems.equium.get());
                    pOutput.accept(ModItems.equium_shard.get());
                    pOutput.accept(ModItems.raw_equium.get());
                    pOutput.accept(ModItems.coralarite.get());
                    pOutput.accept(ModItems.coralarite_shard.get());
                    pOutput.accept(ModItems.raw_coralarite.get());
                            pOutput.accept(ModBlocks.SUNBURST_BLOCK.get());
                            pOutput.accept(ModBlocks.SUNBURST_ORE.get());
                            pOutput.accept(ModBlocks.DEEPSLATE_SUNBURST_ORE.get());
                            pOutput.accept(ModBlocks.EQUIUM_BLOCK.get());
                            pOutput.accept(ModBlocks.EQUIUM_ORE.get());
                            pOutput.accept(ModBlocks.DEEPSLATE_EQUIUM_ORE.get());
                            pOutput.accept(ModBlocks.CORALARITE_BLOCK.get());
                            pOutput.accept(ModBlocks.CORALARITE_ORE.get());
                            pOutput.accept(ModBlocks.DEEPSLATE_CORALARITE_ORE.get());
                    
                    

                })).withSearchBar().build());
    }

}
