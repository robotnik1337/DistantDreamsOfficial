package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.util.ModTags;
import net.minecraft.advancements.critereon.PlayerTrigger;
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
    public ModRecipeProvider(HolderLookup.Provider lookup, RecipeOutput recipeOutput) {
        super(lookup, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
            super(output, providerCompletableFuture);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "";
        }
    }

    @Override
    protected void buildRecipes() {

        // Generate all eucalyptus wood recipes.
        planksFromLog(ModBlocks.EUCALYPTUS_PLANKS.get(), ModTags.Items.EUCALYPTUS_LOGS, 4);
        woodRecipes(
                this.output,
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

        // Generate all sequoia wood recipes.
        planksFromLog(ModBlocks.SEQUOIA_PLANKS.get(), ModTags.Items.SEQUOIA_LOGS, 4);
        woodRecipes(
                this.output,
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

        // Generate all charred wood recipes.
        planksFromLog(ModBlocks.CHARRED_PLANKS.get(), ModTags.Items.CHARRED_LOGS, 4);
        woodRecipes(
                this.output,
                ModBlocks.CHARRED_PLANKS.get(),
                ModBlocks.CHARRED_STAIRS.get(),
                ModBlocks.CHARRED_SLAB.get(),
                ModBlocks.CHARRED_PRESSURE_PLATE.get(),
                ModBlocks.CHARRED_BUTTON.get(),
                ModBlocks.CHARRED_FENCE.get(),
                ModBlocks.CHARRED_FENCE_GATE.get(),
                ModBlocks.CHARRED_DOOR.get(),
                ModBlocks.CHARRED_TRAPDOOR.get(),
                "charred"
        );

        shaped(RecipeCategory.MISC, ModBlocks.CHARRED_CRAFTING_TABLE.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.CHARRED_PLANKS.get())
                .unlockedBy("unlock_right_away", PlayerTrigger.TriggerInstance.tick())
                .showNotification(false)
                .save(this.output);


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
        slab(RecipeCategory.BUILDING_BLOCKS, slab, planks);

        // Button Recipe
        buttonBuilder(button, planksIngredient)
                .group(groupName)
                .unlockedBy(getHasName(planks), has(planks))
                .save(pRecipeOutput);

        // Pressure Plate Recipe
        pressurePlate(pressurePlate, planks);

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
