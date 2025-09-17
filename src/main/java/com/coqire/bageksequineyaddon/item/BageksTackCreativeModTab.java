package com.coqire.bageksequineyaddon.item;

import com.coqire.bageksequineyaddon.block.ModBlocks;
import com.coqire.bageksequineyaddon.registry.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BageksTackCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> MAIN;

    public BageksTackCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "bageksaddon");
        MAIN = REGISTRY.register("btack_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("creativetab.btack_tab")).
                icon(() -> new ItemStack(ModItems.BTACK.get()))
                .displayItems((pParameters, pOutput) ->
                        BageksTack.REGISTRY.getEntries().forEach((registeredItem) -> {
                            Item item = registeredItem.get();
                            pOutput.accept(item);


                            pOutput.accept(ModItems.BAGUETTE.get());
                            pOutput.accept(ModItems.BLUE_DONUT_TREAT.get());
                            pOutput.accept(ModItems.PINK_DONUT_TREAT.get());
                            pOutput.accept(ModItems.YELLOW_DONUT_TREAT.get());
                            pOutput.accept(ModItems.BAGEK_DYE_1.get());
                            pOutput.accept(ModItems.BAGEK_DYE_2.get());
                            pOutput.accept(ModItems.BAGEK_DYE_3.get());
                            pOutput.accept(ModItems.BAGEK_DYE_4.get());
                            pOutput.accept(ModItems.BAGEK_DYE_5.get());
                            pOutput.accept(ModItems.BAGEK_DYE_6.get());
                            pOutput.accept(ModItems.BAGEK_DYE_7.get());
                            pOutput.accept(ModItems.BAGEK_DYE_8.get());
                            pOutput.accept(ModItems.BAGEK_DYE_9.get());
                            pOutput.accept(ModItems.BAGEK_DYE_10.get());
                            pOutput.accept(ModItems.BAGEK_DYE_11.get());
                            pOutput.accept(ModItems.BAGEK_DYE_12.get());
                            pOutput.accept(ModItems.BAGEK_DYE_13.get());
                            pOutput.accept(ModItems.BAGEK_DYE_14.get());
                            pOutput.accept(ModItems.BAGEK_DYE_15.get());
                            pOutput.accept(ModItems.BAGEK_DYE_16.get());
                            pOutput.accept(ModItems.BAGEK_DYE_17.get());
                            pOutput.accept(ModItems.BAGEK_DYE_18.get());
                            pOutput.accept(ModItems.BAGEK_DYE_19.get());
                            pOutput.accept(ModItems.BAGEK_DYE_20.get());
                            pOutput.accept(ModItems.BAGEK_DYE_21.get());
                            pOutput.accept(ModItems.BAGEK_DYE_22.get());
                            pOutput.accept(ModItems.BAGEK_DYE_23.get());
                            pOutput.accept(ModItems.BAGEK_DYE_24.get());
                            pOutput.accept(ModItems.BAGEK_DYE_25.get());
                            pOutput.accept(ModItems.BAGEK_DYE_26.get());
                            pOutput.accept(ModItems.BAGEK_DYE_27.get());
                            pOutput.accept(ModItems.BAGEK_DYE_28.get());


                        })).withSearchBar().build());
    }

}
