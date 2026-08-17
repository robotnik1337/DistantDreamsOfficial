package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SuspiciousEffectHolder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.Objects;
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
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public @NonNull String getName() {
            return "";
        }
    }

    @Override
    protected void buildRecipes() {
        // Wood Sets
        planksFromLog(ModBlocks.ANCIENT_OAK_PLANKS.get(), ModTags.Items.ANCIENT_OAK_LOGS, 4);
        woodFromLogs(ModBlocks.ANCIENT_OAK_WOOD.get(), ModBlocks.ANCIENT_OAK_LOG.get());
        woodFromLogs(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get(), ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get());
        woodRecipes(
                this.output,
                ModBlocks.ANCIENT_OAK_PLANKS.get(),
                ModBlocks.ANCIENT_OAK_STAIRS.get(),
                ModBlocks.ANCIENT_OAK_SLAB.get(),
                ModBlocks.ANCIENT_OAK_PRESSURE_PLATE.get(),
                ModBlocks.ANCIENT_OAK_BUTTON.get(),
                ModBlocks.ANCIENT_OAK_FENCE.get(),
                ModBlocks.ANCIENT_OAK_FENCE_GATE.get(),
                ModBlocks.ANCIENT_OAK_DOOR.get(),
                ModBlocks.ANCIENT_OAK_TRAPDOOR.get(),
                "ancient_oak"
        );


        planksFromLog(ModBlocks.CHARRED_PLANKS.get(), ModTags.Items.CHARRED_LOGS, 4);
        woodFromLogs(ModBlocks.CHARRED_WOOD.get(), ModBlocks.CHARRED_LOG.get());
        woodFromLogs(ModBlocks.STRIPPED_CHARRED_WOOD.get(), ModBlocks.STRIPPED_CHARRED_LOG.get());
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
                .unlockedBy("has_charred_planks", this.has(ModBlocks.CHARRED_PLANKS.get()))
                .showNotification(false)
                .save(this.output);


        planksFromLog(ModBlocks.EUCALYPTUS_PLANKS.get(), ModTags.Items.EUCALYPTUS_LOGS, 4);
        woodFromLogs(ModBlocks.EUCALYPTUS_WOOD.get(), ModBlocks.EUCALYPTUS_LOG.get());
        woodFromLogs(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), ModBlocks.STRIPPED_EUCALYPTUS_LOG.get());
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


        planksFromLog(ModBlocks.SEQUOIA_PLANKS.get(), ModTags.Items.SEQUOIA_LOGS, 4);
        woodFromLogs(ModBlocks.SEQUOIA_WOOD.get(), ModBlocks.SEQUOIA_LOG.get());
        woodFromLogs(ModBlocks.STRIPPED_SEQUOIA_WOOD.get(), ModBlocks.STRIPPED_SEQUOIA_LOG.get());
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


        // Limestone
        stairBuilder(ModBlocks.LIMESTONE_STAIRS.get(), Ingredient.of(ModBlocks.LIMESTONE.get()))
                .unlockedBy("has_limestone", has(ModBlocks.LIMESTONE.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_SLAB.get(), ModBlocks.LIMESTONE.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_WALL.get(), ModBlocks.LIMESTONE.get());
        pressurePlate(ModBlocks.LIMESTONE_PRESSURE_PLATE.get(), ModBlocks.LIMESTONE.get());
        buttonBuilder(ModBlocks.LIMESTONE_BUTTON.get(), Ingredient.of(ModBlocks.LIMESTONE.get()))
                .unlockedBy("has_limestone", has(ModBlocks.LIMESTONE.get())).save(output);

        polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE.get(), ModBlocks.LIMESTONE.get());
        stairBuilder(ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_LIMESTONE.get()))
                .unlockedBy("has_polished_limestone", has(ModBlocks.POLISHED_LIMESTONE.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_LIMESTONE_SLAB.get(), ModBlocks.POLISHED_LIMESTONE.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_LIMESTONE_WALL.get(), ModBlocks.POLISHED_LIMESTONE.get());

        this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICKS.get())
                .define('#', ModBlocks.LIMESTONE.get())
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_limestone", has(ModBlocks.LIMESTONE.get())).save(output);
        stairBuilder(ModBlocks.LIMESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.LIMESTONE_BRICKS.get()))
                .unlockedBy("has_polished_limestone", has(ModBlocks.LIMESTONE_BRICKS.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_BRICK_SLAB.get(), ModBlocks.LIMESTONE_BRICKS.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_BRICK_WALL.get(), ModBlocks.LIMESTONE_BRICKS.get());

        this.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_LIMESTONE_BRICKS.get())
                .requires(ModBlocks.LIMESTONE_BRICKS.get())
                .requires(Blocks.VINE)
                .unlockedBy("has_limestone_bricks", has(ModBlocks.LIMESTONE_BRICKS.get()))
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(output, getConversionRecipeName(ModBlocks.MOSSY_LIMESTONE_BRICKS.get(), Blocks.VINE));
        this.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_LIMESTONE_BRICKS.get())
                .requires(ModBlocks.LIMESTONE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_limestone_bricks", has(ModBlocks.LIMESTONE_BRICKS.get()))
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(output, getConversionRecipeName(ModBlocks.MOSSY_LIMESTONE_BRICKS.get(), Blocks.MOSS_BLOCK));
        stairBuilder(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.MOSSY_LIMESTONE_BRICKS.get()))
                .unlockedBy("has_polished_limestone", has(ModBlocks.MOSSY_LIMESTONE_BRICKS.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get(), ModBlocks.MOSSY_LIMESTONE_BRICKS.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get(), ModBlocks.MOSSY_LIMESTONE_BRICKS.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_SLAB.get(), ModBlocks.LIMESTONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_STAIRS.get(), ModBlocks.LIMESTONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_WALL.get(), ModBlocks.LIMESTONE.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE.get(), ModBlocks.LIMESTONE.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_SLAB.get(), ModBlocks.LIMESTONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), ModBlocks.LIMESTONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_LIMESTONE_WALL.get(), ModBlocks.LIMESTONE.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_SLAB.get(), ModBlocks.POLISHED_LIMESTONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), ModBlocks.POLISHED_LIMESTONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_LIMESTONE_WALL.get(), ModBlocks.POLISHED_LIMESTONE.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICKS.get(), ModBlocks.LIMESTONE.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICK_SLAB.get(), ModBlocks.LIMESTONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICK_STAIRS.get(), ModBlocks.LIMESTONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.LIMESTONE_BRICK_WALL.get(), ModBlocks.LIMESTONE.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get(), ModBlocks.MOSSY_LIMESTONE_BRICKS.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get(), ModBlocks.MOSSY_LIMESTONE_BRICKS.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get(), ModBlocks.MOSSY_LIMESTONE_BRICKS.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LIMESTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_LIMESTONE_BRICKS.get().asItem(), 0.1F, 200)
                .unlockedBy("has_limestone_bricks", has(ModBlocks.LIMESTONE_BRICKS.get()))
                .save(output);


        // Distant Stone
        stairBuilder(ModBlocks.DISTANT_STONE_STAIRS.get(), Ingredient.of(ModBlocks.DISTANT_STONE.get()))
                .unlockedBy("has_distant_stone", has(ModBlocks.DISTANT_STONE.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.DISTANT_STONE_SLAB.get(), ModBlocks.DISTANT_STONE.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.DISTANT_STONE_WALL.get(), ModBlocks.DISTANT_STONE.get());
        pressurePlate(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get(), ModBlocks.DISTANT_STONE.get());
        buttonBuilder(ModBlocks.DISTANT_STONE_BUTTON.get(), Ingredient.of(ModBlocks.DISTANT_STONE.get()))
                .unlockedBy("has_distant_stone", has(ModBlocks.DISTANT_STONE.get())).save(output);

        polished(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DISTANT_STONE.get(), ModBlocks.DISTANT_STONE.get());
        stairBuilder(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_DISTANT_STONE.get()))
                .unlockedBy("has_polished_distant_stone", has(ModBlocks.POLISHED_DISTANT_STONE.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DISTANT_STONE_SLAB.get(), ModBlocks.POLISHED_DISTANT_STONE.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DISTANT_STONE_WALL.get(), ModBlocks.POLISHED_DISTANT_STONE.get());

        this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DISTANT_STONE_BRICKS.get())
                .define('#', ModBlocks.DISTANT_STONE.get())
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_distant_stone", has(ModBlocks.DISTANT_STONE.get())).save(output);
        stairBuilder(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.DISTANT_STONE_BRICKS.get()))
                .unlockedBy("has_polished_distant_stone", has(ModBlocks.DISTANT_STONE_BRICKS.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.DISTANT_STONE_BRICK_SLAB.get(), ModBlocks.DISTANT_STONE_BRICKS.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.DISTANT_STONE_BRICK_WALL.get(), ModBlocks.DISTANT_STONE_BRICKS.get());

        this.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get())
                .requires(ModBlocks.DISTANT_STONE_BRICKS.get())
                .requires(Blocks.VINE)
                .unlockedBy("has_distant_stone_bricks", has(ModBlocks.DISTANT_STONE_BRICKS.get()))
                .unlockedBy("has_vine", has(Blocks.VINE))
                .save(output, getConversionRecipeName(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get(), Blocks.VINE));
        this.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get())
                .requires(ModBlocks.DISTANT_STONE_BRICKS.get())
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_distant_stone_bricks", has(ModBlocks.DISTANT_STONE_BRICKS.get()))
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(output, getConversionRecipeName(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get(), Blocks.MOSS_BLOCK));
        stairBuilder(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get()))
                .unlockedBy("has_polished_distant_stone", has(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get())).save(output);
        slab(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get(), ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());
        wall(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get(), ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DISTANT_STONE_SLAB.get(), ModBlocks.DISTANT_STONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DISTANT_STONE_STAIRS.get(), ModBlocks.DISTANT_STONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DISTANT_STONE_WALL.get(), ModBlocks.DISTANT_STONE.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DISTANT_STONE.get(), ModBlocks.DISTANT_STONE.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DISTANT_STONE_SLAB.get(), ModBlocks.DISTANT_STONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get(), ModBlocks.DISTANT_STONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DISTANT_STONE_WALL.get(), ModBlocks.DISTANT_STONE.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DISTANT_STONE_SLAB.get(), ModBlocks.POLISHED_DISTANT_STONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get(), ModBlocks.POLISHED_DISTANT_STONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.POLISHED_DISTANT_STONE_WALL.get(), ModBlocks.POLISHED_DISTANT_STONE.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DISTANT_STONE_BRICKS.get(), ModBlocks.DISTANT_STONE.get());
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DISTANT_STONE_BRICK_SLAB.get(), ModBlocks.DISTANT_STONE.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DISTANT_STONE_BRICK_STAIRS.get(), ModBlocks.DISTANT_STONE.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.DISTANT_STONE_BRICK_WALL.get(), ModBlocks.DISTANT_STONE.get());

        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get(), ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get(), 2);
        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get(), ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());
        stonecutterResultFromBase(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get(), ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DISTANT_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get().asItem(), 0.1F, 200)
                .unlockedBy("has_distant_stone_bricks", has(ModBlocks.DISTANT_STONE_BRICKS.get()))
                .save(output);


        oneToOneConversionRecipe(Items.BLUE_DYE, ModBlocks.OPEN_DREAMFLOWER.get(), "blue_dye");
        oneToOneConversionRecipe(Items.BLUE_DYE, ModBlocks.CLOSED_DREAMFLOWER.get(), "blue_dye");
        suspiciousStew(ModBlocks.OPEN_DREAMFLOWER.get().asItem(), Objects.requireNonNull(SuspiciousEffectHolder.tryGet(ModBlocks.OPEN_DREAMFLOWER.get())));
        suspiciousStew(ModBlocks.CLOSED_DREAMFLOWER.get().asItem(), Objects.requireNonNull(SuspiciousEffectHolder.tryGet(ModBlocks.CLOSED_DREAMFLOWER.get())));
    }


    // ########## HELPER METHODS ########## //
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
