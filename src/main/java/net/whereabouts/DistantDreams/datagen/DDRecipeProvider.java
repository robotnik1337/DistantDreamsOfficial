package net.whereabouts.DistantDreams.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

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
        // Sequoia
    }
}
