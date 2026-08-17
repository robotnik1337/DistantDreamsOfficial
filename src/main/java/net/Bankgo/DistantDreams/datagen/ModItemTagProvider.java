package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends VanillaItemTagsProvider {

    public ModItemTagProvider (PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider) {
        super(pOutput, pLookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        // MODDED ITEM TAGS //

        // Item tags for wood types to ensure they function as wood

        tag(ModTags.Items.ANCIENT_OAK_LOGS)
                .add(ModBlocks.ANCIENT_OAK_LOG.get().asItem().asItem())
                .add(ModBlocks.ANCIENT_OAK_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get().asItem());

        tag(ModTags.Items.EUCALYPTUS_LOGS)
                .add(ModBlocks.EUCALYPTUS_LOG.get().asItem().asItem())
                .add(ModBlocks.EUCALYPTUS_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get().asItem());

        tag(ModTags.Items.SEQUOIA_LOGS)
                .add(ModBlocks.SEQUOIA_LOG.get().asItem())
                .add(ModBlocks.SEQUOIA_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_SEQUOIA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SEQUOIA_WOOD.get().asItem());

        tag(ModTags.Items.CHARRED_LOGS)
                .add(ModBlocks.CHARRED_LOG.get().asItem())
                .add(ModBlocks.CHARRED_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CHARRED_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CHARRED_WOOD.get().asItem());


        // Special tags for charred blocks that need to be mineable by pickaxe only.
        tag(ModTags.Items.CHARRED_PLANKS).add(ModBlocks.CHARRED_PLANKS.get().asItem());
        tag(ModTags.Items.CHARRED_STAIRS).add(ModBlocks.CHARRED_STAIRS.get().asItem());
        tag(ModTags.Items.CHARRED_SLAB).add(ModBlocks.CHARRED_SLAB.get().asItem());
        tag(ModTags.Items.CHARRED_PRESSURE_PLATE).add(ModBlocks.CHARRED_PRESSURE_PLATE.get().asItem());
        tag(ModTags.Items.CHARRED_BUTTON).add(ModBlocks.CHARRED_BUTTON.get().asItem());
        tag(ModTags.Items.CHARRED_FENCE).add(ModBlocks.CHARRED_FENCE.get().asItem());
        tag(ModTags.Items.CHARRED_FENCE_GATE).add(ModBlocks.CHARRED_FENCE_GATE.get().asItem());
        tag(ModTags.Items.CHARRED_DOOR).add(ModBlocks.CHARRED_DOOR.get().asItem());
        tag(ModTags.Items.CHARRED_TRAPDOOR).add(ModBlocks.CHARRED_TRAPDOOR.get().asItem());

        // END MODDED ITEM TAGS //


        // START VANILLA ITEM TAGS //

        tag(ItemTags.LOGS);

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ANCIENT_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get().asItem())
                .add(ModBlocks.ANCIENT_OAK_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get().asItem())
                .add(ModBlocks.EUCALYPTUS_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get().asItem())
                .add(ModBlocks.EUCALYPTUS_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get().asItem())
                .add(ModBlocks.SEQUOIA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SEQUOIA_LOG.get().asItem())
                .add(ModBlocks.SEQUOIA_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_SEQUOIA_WOOD.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.ANCIENT_OAK_PLANKS.get().asItem())
                .add(ModBlocks.CHARRED_PLANKS.get().asItem())
                .add(ModBlocks.EUCALYPTUS_PLANKS.get().asItem())
                .add(ModBlocks.SEQUOIA_PLANKS.get().asItem());

        tag(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.ANCIENT_OAK_STAIRS.get().asItem())
                .add(ModBlocks.EUCALYPTUS_STAIRS.get().asItem())
                .add(ModBlocks.SEQUOIA_STAIRS.get().asItem());

        tag(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.ANCIENT_OAK_SLAB.get().asItem())
                .add(ModBlocks.EUCALYPTUS_SLAB.get().asItem())
                .add(ModBlocks.SEQUOIA_SLAB.get().asItem());

        tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.ANCIENT_OAK_PRESSURE_PLATE.get().asItem())
                .add(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get().asItem())
                .add(ModBlocks.SEQUOIA_PRESSURE_PLATE.get().asItem());

        tag(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.ANCIENT_OAK_BUTTON.get().asItem())
                .add(ModBlocks.EUCALYPTUS_BUTTON.get().asItem())
                .add(ModBlocks.SEQUOIA_BUTTON.get().asItem());

        tag(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.ANCIENT_OAK_FENCE.get().asItem())
                .add(ModBlocks.EUCALYPTUS_FENCE.get().asItem())
                .add(ModBlocks.SEQUOIA_FENCE.get().asItem());

        tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.ANCIENT_OAK_FENCE_GATE.get().asItem())
                .add(ModBlocks.EUCALYPTUS_FENCE_GATE.get().asItem())
                .add(ModBlocks.SEQUOIA_FENCE_GATE.get().asItem());

        tag(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.ANCIENT_OAK_DOOR.get().asItem())
                .add(ModBlocks.EUCALYPTUS_DOOR.get().asItem())
                .add(ModBlocks.SEQUOIA_DOOR.get().asItem());

        tag(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.ANCIENT_OAK_TRAPDOOR.get().asItem())
                .add(ModBlocks.EUCALYPTUS_TRAPDOOR.get().asItem())
                .add(ModBlocks.SEQUOIA_TRAPDOOR.get().asItem());

        tag(ItemTags.LEAVES)
                .add(ModBlocks.ANCIENT_OAK_LEAVES.get().asItem())
                .add(ModBlocks.EUCALYPTUS_LEAVES.get().asItem())
                .add(ModBlocks.SEQUOIA_LEAVES.get().asItem());

        tag(ItemTags.DIRT)
                .add(ModBlocks.FERTILE_SOIL.get().asItem())
                .add(ModBlocks.FERTILE_PLOT.get().asItem());

        tag(ItemTags.STAIRS)
                .add(ModBlocks.DISTANT_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get().asItem())
                .add(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.LIMESTONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_LIMESTONE_STAIRS.get().asItem())
                .add(ModBlocks.LIMESTONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHARRED_STAIRS.get().asItem());

        tag(ItemTags.SLABS)
                .add(ModBlocks.DISTANT_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get().asItem())
                .add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.LIMESTONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_LIMESTONE_SLAB.get().asItem())
                .add(ModBlocks.LIMESTONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHARRED_SLAB.get().asItem());

        tag(ItemTags.BUTTONS)
                .add(ModBlocks.CHARRED_BUTTON.get().asItem());

        tag(ItemTags.FENCES)
                .add(ModBlocks.CHARRED_FENCE.get().asItem());

        tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.CHARRED_FENCE_GATE.get().asItem());

        tag(ItemTags.DOORS)
                .add(ModBlocks.CHARRED_DOOR.get().asItem());

        tag(ItemTags.TRAPDOORS)
                .add(ModBlocks.CHARRED_TRAPDOOR.get().asItem());

        tag(ItemTags.WALLS)
                .add(ModBlocks.DISTANT_STONE_WALL.get().asItem())
                .add(ModBlocks.POLISHED_DISTANT_STONE_WALL.get().asItem())
                .add(ModBlocks.DISTANT_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.LIMESTONE_WALL.get().asItem())
                .add(ModBlocks.POLISHED_LIMESTONE_WALL.get().asItem())
                .add(ModBlocks.LIMESTONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get().asItem());

        tag(ItemTags.STONE_BRICKS)
                .add(ModBlocks.DISTANT_STONE_BRICKS.get().asItem())
                .add(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.DISTANT_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get().asItem())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get().asItem())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.LIMESTONE_BRICKS.get().asItem())
                .add(ModBlocks.LIMESTONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.LIMESTONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.LIMESTONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.CRACKED_LIMESTONE_BRICKS.get().asItem())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICKS.get().asItem())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get().asItem());

        tag(ItemTags.STONE_BUTTONS)
                .add(ModBlocks.DISTANT_STONE_BUTTON.get().asItem())
                .add(ModBlocks.LIMESTONE_BUTTON.get().asItem());

        tag(ItemTags.SMALL_FLOWERS)
                .add(ModBlocks.OPEN_DREAMFLOWER.get().asItem())
                .add(ModBlocks.CLOSED_DREAMFLOWER.get().asItem());


        // END VANILLA ITEM TAGS //
    }
}
