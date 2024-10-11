package com.coqire.bageksequineyaddon.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BAGUETTE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties PINK_DONUT_TREAT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.9F).build();
    public static final FoodProperties BLUE_DONUT_TREAT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.9F).build();
    public static final FoodProperties YELLOW_DONUT_TREAT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.9F).build();

}
