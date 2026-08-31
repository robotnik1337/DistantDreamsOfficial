package net.whereabouts.DistantDreams.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.tags.DDTags;

import java.util.concurrent.CompletableFuture;

public class DDRecipeProvider extends RecipeProvider {
    protected DDRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) { super(packOutput, registries); }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new DDRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Distant Dreams Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        // Eucalyptus
        woodFromLogs(DDBlocks.EUCALYPTUS_WOOD.get(), DDBlocks.EUCALYPTUS_LOG);
        woodFromLogs(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), DDBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        planksFromLog(DDBlocks.EUCALYPTUS_PLANKS, DDTags.Items.EUCALYPTUS_LOGS, 4);
        woodRecipes(
                this.output,
                DDBlocks.EUCALYPTUS_PLANKS.get(),
                DDBlocks.EUCALYPTUS_STAIRS.get(),
                DDBlocks.EUCALYPTUS_SLAB.get(),
                DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get(),
                DDBlocks.EUCALYPTUS_BUTTON.get(),
                DDBlocks.EUCALYPTUS_FENCE.get(),
                DDBlocks.EUCALYPTUS_FENCE_GATE.get(),
                DDBlocks.EUCALYPTUS_DOOR.get(),
                DDBlocks.EUCALYPTUS_TRAPDOOR.get(),
                "eucalyptus"
        );

        // Sequoia
        woodFromLogs(DDBlocks.SEQUOIA_WOOD.get(), DDBlocks.SEQUOIA_LOG);
        woodFromLogs(DDBlocks.STRIPPED_SEQUOIA_WOOD.get(), DDBlocks.STRIPPED_SEQUOIA_LOG.get());
        planksFromLog(DDBlocks.SEQUOIA_PLANKS, DDTags.Items.SEQUOIA_LOGS, 4);
        woodRecipes(
                this.output,
                DDBlocks.SEQUOIA_PLANKS.get(),
                DDBlocks.SEQUOIA_STAIRS.get(),
                DDBlocks.SEQUOIA_SLAB.get(),
                DDBlocks.SEQUOIA_PRESSURE_PLATE.get(),
                DDBlocks.SEQUOIA_BUTTON.get(),
                DDBlocks.SEQUOIA_FENCE.get(),
                DDBlocks.SEQUOIA_FENCE_GATE.get(),
                DDBlocks.SEQUOIA_DOOR.get(),
                DDBlocks.SEQUOIA_TRAPDOOR.get(),
                "sequoia"
        );

    }


    // *** HELPER METHODS ***
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

