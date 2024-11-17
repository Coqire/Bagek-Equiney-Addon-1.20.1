package com.coqire.bageksequineyaddon.worldgen;

import com.coqire.bageksequineyaddon.BageksEquineyAddon;
import com.coqire.bageksequineyaddon.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SUNBURST_ORE_KEY = registerKey("sunburst_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EQUIUM_ORE_KEY = registerKey("equium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CORALARITE_ORE_KEY = registerKey("coralarite_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldSunburstOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.SUNBURST_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SUNBURST_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEquiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.EQUIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_EQUIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCoralariteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.CORALARITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CORALARITE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SUNBURST_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSunburstOres, 5));
        register(context, OVERWORLD_EQUIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEquiumOres, 5));
        register(context, OVERWORLD_CORALARITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCoralariteOres, 5));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(BageksEquineyAddon.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
