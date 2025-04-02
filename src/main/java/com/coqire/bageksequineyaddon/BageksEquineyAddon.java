package com.coqire.bageksequineyaddon;


import com.coqire.bageksequineyaddon.block.ModBlocks;
import com.coqire.bageksequineyaddon.client.ClientBootstrap;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModTab;
import com.coqire.bageksequineyaddon.item.ModItems;
import com.coqire.bageksequineyaddon.registry.BagekTack;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BageksEquineyAddon.MOD_ID)
public class BageksEquineyAddon
{
    public static final String MOD_ID = "bageksequineyaddon";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BageksEquineyAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        BagekTack.init(modEventBus);
        ModBlocks.register(modEventBus);
        BageksAddonCreativeModTab.init(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event){
        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    private void onClientSetup(FMLClientSetupEvent event)
    {
        event.enqueueWork(ClientBootstrap::init);
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
        }
    }

    // An example config class. This is not required, but it's a good idea to have one to keep your config organized.
    // Demonstrates how to use Forge's config APIs
    @Mod.EventBusSubscriber(modid = BageksEquineyAddon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Config
    {
        private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        private static final ForgeConfigSpec.BooleanValue LOG_DIRT_BLOCK = BUILDER
                .comment("Whether to log the dirt block on common setup")
                .define("logDirtBlock", true);

        private static final ForgeConfigSpec.IntValue MAGIC_NUMBER = BUILDER
                .comment("A magic number")
                .defineInRange("magicNumber", 42, 0, Integer.MAX_VALUE);

        public static final ForgeConfigSpec.ConfigValue<String> MAGIC_NUMBER_INTRODUCTION = BUILDER
                .comment("What you want the introduction message to be for the magic number")
                .define("magicNumberIntroduction", "The magic number is... ");

        // a list of strings that are treated as resource locations for items
        private static final ForgeConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
                .comment("A list of items to log on common setup.")
                .defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), Config::validateItemName);

        static final ForgeConfigSpec SPEC = BUILDER.build();

        public static boolean logDirtBlock;
        public static int magicNumber;
        public static String magicNumberIntroduction;
        public static Set<Item> items;

        private static boolean validateItemName(final Object obj)
        {
            return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
        }

        @SubscribeEvent
        static void onLoad(final ModConfigEvent event)
        {
            logDirtBlock = LOG_DIRT_BLOCK.get();
            magicNumber = MAGIC_NUMBER.get();
            magicNumberIntroduction = MAGIC_NUMBER_INTRODUCTION.get();

            // convert the list of strings into a set of items
            items = ITEM_STRINGS.get().stream()
                    .map(itemName -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)))
                    .collect(Collectors.toSet());
        }
    }
}
