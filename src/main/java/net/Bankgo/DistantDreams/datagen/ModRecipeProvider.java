package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pRecipeOutput) {
        // Generate all eucalyptus wood recipes
        woodRecipes(
                pRecipeOutput,
                ModBlocks.EUCALYPTUS_PLANKS.get(),
                ModBlocks.EUCALYPTUS_STAIRS.get(),
                ModBlocks.EUCALYPTUS_SLAB.get(),
                ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get(),
                ModBlocks.EUCALYPTUS_BUTTON.get(),
                ModBlocks.EUCALYPTUS_FENCE.get(),
                ModBlocks.EUCALYPTUS_FENCE_GATE.get(),
                ModBlocks.EUCALYPTUS_DOOR.get(),
                ModBlocks.EUCALYPTUS_TRAPDOOR.get(),
                "eucalyptus"
        );

        // Generate all sequoia wood recipes
        woodRecipes(
                pRecipeOutput,
                ModBlocks.SEQUOIA_PLANKS.get(),
                ModBlocks.SEQUOIA_STAIRS.get(),
                ModBlocks.SEQUOIA_SLAB.get(),
                ModBlocks.SEQUOIA_PRESSURE_PLATE.get(),
                ModBlocks.SEQUOIA_BUTTON.get(),
                ModBlocks.SEQUOIA_FENCE.get(),
                ModBlocks.SEQUOIA_FENCE_GATE.get(),
                ModBlocks.SEQUOIA_DOOR.get(),
                ModBlocks.SEQUOIA_TRAPDOOR.get(),
                "sequoia"
        );
    }

    private void woodRecipes(RecipeOutput pRecipeOutput,
                             Block planks,
                             Block stairs,
                             Block slab,
                             Block pressurePlate,
                             Block button,
                             Block fence,
                             Block fenceGate,
                             Block door,
                             Block trapdoor,
                             String groupName) {

        // Ingredient for the planks
        Ingredient planksIngredient = Ingredient.of(planks);

        // Stairs Recipe
        stairBuilder(stairs, planksIngredient)
                .group(groupName)
                .unlockedBy(getHasName(planks), has(planks))
                .save(pRecipeOutput);

        // Slab Recipe
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, slab, planks);

        // Button Recipe
        buttonBuilder(button, planksIngredient)
                .group(groupName)
                .unlockedBy(getHasName(planks), has(planks))
                .save(pRecipeOutput);

        // Pressure Plate Recipe
        pressurePlate(pRecipeOutput, pressurePlate, planks);

        // Fence Recipe
        fenceBuilder(fence, planksIngredient)
                .group(groupName)
                .unlockedBy(getHasName(planks), has(planks))
                .save(pRecipeOutput);

        // Fence Gate Recipe
        fenceGateBuilder(fenceGate, planksIngredient)
                .group(groupName)
                .unlockedBy(getHasName(planks), has(planks))
                .save(pRecipeOutput);

        // Door Recipe
        doorBuilder(door, planksIngredient)
                .group(groupName)
                .unlockedBy(getHasName(planks), has(planks))
                .save(pRecipeOutput);

        // Trapdoor Recipe
        trapdoorBuilder(trapdoor, planksIngredient)
                .group(groupName)
                .unlockedBy(getHasName(planks), has(planks))
                .save(pRecipeOutput);
    }
}
