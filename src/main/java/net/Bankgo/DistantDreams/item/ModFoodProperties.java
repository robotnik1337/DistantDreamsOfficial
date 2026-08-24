package net.Bankgo.DistantDreams.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties COPPER_BEETROOT_1 = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.1f).build();

    public static final FoodProperties BROTH_OF_STYX = new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0F)
            .alwaysEdible().build();
}
