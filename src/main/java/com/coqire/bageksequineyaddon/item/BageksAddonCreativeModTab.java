package com.coqire.bageksequineyaddon.item;

import com.coqire.bageksequineyaddon.registry.BageksTack;
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

                        BageksTack.REGISTRY.getEntries().forEach((registeredItem) -> {
                    Item item = registeredItem.get();
                    pOutput.accept(item);

                    pOutput.accept(ModItems.BAGUETTE.get());
                    pOutput.accept(ModItems.BLUE_DONUT_TREAT.get());
                    pOutput.accept(ModItems.PINK_DONUT_TREAT.get());
                    pOutput.accept(ModItems.YELLOW_DONUT_TREAT.get());

                })).withSearchBar().build());
    }

}
