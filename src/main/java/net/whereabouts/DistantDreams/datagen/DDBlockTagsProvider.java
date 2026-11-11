package net.whereabouts.DistantDreams.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.tags.DDTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DDBlockTagsProvider extends BlockTagsProvider {
    public DDBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, DistantDreams.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // *** MODDED BLOCK TAGS ***

        tag(DDTags.Blocks.ANCIENT_ACACIA_LOGS)
                .add(DDBlocks.ANCIENT_ACACIA_LOG.get())
                .add(DDBlocks.ANCIENT_ACACIA_WOOD.get())
                .add(DDBlocks.STRIPPED_ANCIENT_ACACIA_LOG.get())
                .add(DDBlocks.STRIPPED_ANCIENT_ACACIA_WOOD.get());

        tag(DDTags.Blocks.ANCIENT_BIRCH_LOGS)
                .add(DDBlocks.ANCIENT_BIRCH_LOG.get())
                .add(DDBlocks.ANCIENT_BIRCH_WOOD.get())
                .add(DDBlocks.STRIPPED_ANCIENT_BIRCH_LOG.get())
                .add(DDBlocks.STRIPPED_ANCIENT_BIRCH_WOOD.get());

        tag(DDTags.Blocks.ANCIENT_MANGROVE_LOGS)
                .add(DDBlocks.ANCIENT_MANGROVE_LOG.get())
                .add(DDBlocks.ANCIENT_MANGROVE_WOOD.get())
                .add(DDBlocks.STRIPPED_ANCIENT_MANGROVE_LOG.get())
                .add(DDBlocks.STRIPPED_ANCIENT_MANGROVE_WOOD.get());

        tag(DDTags.Blocks.ANCIENT_OAK_LOGS)
                .add(DDBlocks.ANCIENT_OAK_LOG.get())
                .add(DDBlocks.ANCIENT_OAK_WOOD.get())
                .add(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get())
                .add(DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get());

        tag(DDTags.Blocks.CHARRED_LOGS)
                .add(DDBlocks.CHARRED_LOG.get())
                .add(DDBlocks.CHARRED_WOOD.get())
                .add(DDBlocks.STRIPPED_CHARRED_LOG.get())
                .add(DDBlocks.STRIPPED_CHARRED_WOOD.get());

        tag(DDTags.Blocks.DENDRANTHOS_LOGS)
                .add(DDBlocks.DENDRANTHOS_LOG.get())
                .add(DDBlocks.DENDRANTHOS_WOOD.get())
                .add(DDBlocks.STRIPPED_DENDRANTHOS_LOG.get())
                .add(DDBlocks.STRIPPED_DENDRANTHOS_WOOD.get());

        tag(DDTags.Blocks.DENDRYMYCOS_LOGS)
                .add(DDBlocks.DENDRYMYCOS_LOG.get())
                .add(DDBlocks.DENDRYMYCOS_WOOD.get())
                .add(DDBlocks.STRIPPED_DENDRYMYCOS_LOG.get())
                .add(DDBlocks.STRIPPED_DENDRYMYCOS_WOOD.get());

        tag(DDTags.Blocks.EUCALYPTUS_LOGS)
                .add(DDBlocks.EUCALYPTUS_LOG.get())
                .add(DDBlocks.EUCALYPTUS_WOOD.get())
                .add(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get())
                .add(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get());

        tag(DDTags.Blocks.SEQUOIA_LOGS)
                .add(DDBlocks.SEQUOIA_LOG.get())
                .add(DDBlocks.SEQUOIA_WOOD.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_WOOD.get());


        tag(DDTags.Blocks.DD_LOGS)
                .addTag(DDTags.Blocks.ANCIENT_ACACIA_LOGS)
                .addTag(DDTags.Blocks.ANCIENT_BIRCH_LOGS)
                .addTag(DDTags.Blocks.ANCIENT_MANGROVE_LOGS)
                .addTag(DDTags.Blocks.ANCIENT_OAK_LOGS)
                .addTag(DDTags.Blocks.EUCALYPTUS_LOGS)
                .addTag(DDTags.Blocks.SEQUOIA_LOGS)
                .addTag(DDTags.Blocks.DENDRANTHOS_LOGS)
                .addTag(DDTags.Blocks.DENDRYMYCOS_LOGS);


        // *** VANILLA BLOCK TAGS ***
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DDBlocks.CHARRED_LOG.get())
                .add(DDBlocks.CHARRED_WOOD.get())
                .add(DDBlocks.STRIPPED_CHARRED_LOG.get())
                .add(DDBlocks.STRIPPED_CHARRED_WOOD.get())
                .add(DDBlocks.CHARRED_PLANKS.get())
                .add(DDBlocks.CHARRED_STAIRS.get())
                .add(DDBlocks.CHARRED_SLAB.get())
                .add(DDBlocks.CHARRED_PRESSURE_PLATE.get())
                .add(DDBlocks.CHARRED_BUTTON.get())
                .add(DDBlocks.CHARRED_FENCE.get())
                .add(DDBlocks.CHARRED_FENCE_GATE.get())
                .add(DDBlocks.CHARRED_DOOR.get())
                .add(DDBlocks.CHARRED_TRAPDOOR.get())
                .add(DDBlocks.DISTANT_STONE.get())
                .add(DDBlocks.DISTANT_STONE_STAIRS.get())
                .add(DDBlocks.DISTANT_STONE_SLAB.get())
                .add(DDBlocks.DISTANT_STONE_WALL.get())
                .add(DDBlocks.DISTANT_COBBLE.get())
                .add(DDBlocks.DISTANT_COBBLE_STAIRS.get())
                .add(DDBlocks.DISTANT_COBBLE_SLAB.get())
                .add(DDBlocks.DISTANT_COBBLE_WALL.get())
                .add(DDBlocks.DISTANT_STONE_POLISHED.get())
                .add(DDBlocks.DISTANT_STONE_POLISHED_STAIRS.get())
                .add(DDBlocks.DISTANT_STONE_POLISHED_SLAB.get())
                .add(DDBlocks.DISTANT_STONE_POLISHED_WALL.get())
                .add(DDBlocks.DISTANT_STONE_BRICKS.get())
                .add(DDBlocks.DISTANT_STONE_BRICK_STAIRS.get())
                .add(DDBlocks.DISTANT_STONE_BRICK_SLAB.get())
                .add(DDBlocks.DISTANT_STONE_BRICK_WALL.get())
                .add(DDBlocks.ISLATE.get())
                .add(DDBlocks.ISLATE_STAIRS.get())
                .add(DDBlocks.ISLATE_SLAB.get())
                .add(DDBlocks.ISLATE_WALL.get())
                .add(DDBlocks.ISLATE_COBBLED.get())
                .add(DDBlocks.ISLATE_COBBLED_STAIRS.get())
                .add(DDBlocks.ISLATE_COBBLED_SLAB.get())
                .add(DDBlocks.ISLATE_COBBLED_WALL.get())
                .add(DDBlocks.ISLATE_POLISHED.get())
                .add(DDBlocks.ISLATE_POLISHED_STAIRS.get())
                .add(DDBlocks.ISLATE_POLISHED_SLAB.get())
                .add(DDBlocks.ISLATE_POLISHED_WALL.get())
                .add(DDBlocks.ISLATE_BRICKS.get())
                .add(DDBlocks.ISLATE_BRICK_STAIRS.get())
                .add(DDBlocks.ISLATE_BRICK_SLAB.get())
                .add(DDBlocks.ISLATE_BRICK_WALL.get())
                .add(DDBlocks.PEAT.get())
                .add(DDBlocks.PEAT_STAIRS.get())
                .add(DDBlocks.PEAT_SLAB.get())
                .add(DDBlocks.PEAT_WALL.get())
                .add(DDBlocks.PACKED_PEAT.get())
                .add(DDBlocks.PACKED_PEAT_STAIRS.get())
                .add(DDBlocks.PACKED_PEAT_SLAB.get())
                .add(DDBlocks.PACKED_PEAT_WALL.get())
                .add(DDBlocks.PEAT_BRICKS.get())
                .add(DDBlocks.PEAT_BRICK_STAIRS.get())
                .add(DDBlocks.PEAT_BRICK_SLAB.get())
                .add(DDBlocks.PEAT_BRICK_WALL.get())
                .add(DDBlocks.CHISELED_PEAT.get())
                .add(DDBlocks.RHYOLITE.get())
                .add(DDBlocks.RHYOLITE_STAIRS.get())
                .add(DDBlocks.RHYOLITE_SLAB.get())
                .add(DDBlocks.RHYOLITE_WALL.get())
                .add(DDBlocks.RHYOLITE_BRICKS.get())
                .add(DDBlocks.RHYOLITE_BRICK_STAIRS.get())
                .add(DDBlocks.RHYOLITE_BRICK_SLAB.get())
                .add(DDBlocks.RHYOLITE_BRICK_WALL.get())
                .add(DDBlocks.RHYOLITE_TILES.get())
                .add(DDBlocks.RHYOLITE_TILE_STAIRS.get())
                .add(DDBlocks.RHYOLITE_TILE_SLAB.get())
                .add(DDBlocks.RHYOLITE_TILE_WALL.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .remove(DDBlocks.CHARRED_FENCE.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(DDBlocks.FERTILE_SOIL.get())
                .add(DDBlocks.DISTANT_GRASS.get())
                .add(DDBlocks.DISTANT_DIRT.get());

        tag(BlockTags.PLANKS)
                .add(DDBlocks.ANCIENT_ACACIA_PLANKS.get())
                .add(DDBlocks.ANCIENT_BIRCH_PLANKS.get())
                .add(DDBlocks.ANCIENT_OAK_PLANKS.get())
                .add(DDBlocks.ANCIENT_MANGROVE_PLANKS.get())
                .add(DDBlocks.EUCALYPTUS_PLANKS.get())
                .add(DDBlocks.SEQUOIA_PLANKS.get())
                .add(DDBlocks.DENDRANTHOS_PLANKS.get())
                .add(DDBlocks.DENDRYMYCOS_PLANKS.get());

        tag(BlockTags.LOGS_THAT_BURN)
                .add(DDBlocks.DENDRANTHOS_LOG.get())
                .add(DDBlocks.DENDRYMYCOS_LOG.get())
                .add(DDBlocks.EUCALYPTUS_LOG.get())
                .add(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get())
                .add(DDBlocks.SEQUOIA_LOG.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get());

        tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(DDBlocks.EUCALYPTUS_LOG.get())
                .add(DDBlocks.SEQUOIA_LOG.get());

        tag(BlockTags.PREVENTS_NEARBY_LEAF_DECAY).addTag(DDTags.Blocks.DD_LOGS);

        tag(BlockTags.WOODEN_STAIRS)
                .add(DDBlocks.ANCIENT_ACACIA_STAIRS.get())
                .add(DDBlocks.ANCIENT_BIRCH_STAIRS.get())
                .add(DDBlocks.ANCIENT_MANGROVE_STAIRS.get())
                .add(DDBlocks.ANCIENT_OAK_STAIRS.get())
                .add(DDBlocks.EUCALYPTUS_STAIRS.get())
                .add(DDBlocks.SEQUOIA_STAIRS.get())
                .add(DDBlocks.DENDRANTHOS_STAIRS.get())
                .add(DDBlocks.DENDRYMYCOS_STAIRS.get());

        tag(BlockTags.WOODEN_SLABS)
                .add(DDBlocks.ANCIENT_ACACIA_SLAB.get())
                .add(DDBlocks.ANCIENT_BIRCH_SLAB.get())
                .add(DDBlocks.ANCIENT_MANGROVE_SLAB.get())
                .add(DDBlocks.ANCIENT_OAK_SLAB.get())
                .add(DDBlocks.EUCALYPTUS_SLAB.get())
                .add(DDBlocks.SEQUOIA_SLAB.get())
                .add(DDBlocks.DENDRANTHOS_SLAB.get())
                .add(DDBlocks.DENDRYMYCOS_SLAB.get());

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(DDBlocks.ANCIENT_ACACIA_PRESSURE_PLATE.get())
                .add(DDBlocks.ANCIENT_BIRCH_PRESSURE_PLATE.get())
                .add(DDBlocks.ANCIENT_MANGROVE_PRESSURE_PLATE.get())
                .add(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get())
                .add(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get())
                .add(DDBlocks.SEQUOIA_PRESSURE_PLATE.get())
                .add(DDBlocks.DENDRANTHOS_PRESSURE_PLATE.get())
                .add(DDBlocks.DENDRYMYCOS_PRESSURE_PLATE.get());

        tag(BlockTags.WOODEN_BUTTONS)
                .add(DDBlocks.ANCIENT_ACACIA_BUTTON.get())
                .add(DDBlocks.ANCIENT_BIRCH_BUTTON.get())
                .add(DDBlocks.ANCIENT_MANGROVE_BUTTON.get())
                .add(DDBlocks.ANCIENT_OAK_BUTTON.get())
                .add(DDBlocks.EUCALYPTUS_BUTTON.get())
                .add(DDBlocks.SEQUOIA_BUTTON.get())
                .add(DDBlocks.DENDRANTHOS_BUTTON.get())
                .add(DDBlocks.DENDRYMYCOS_BUTTON.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(DDBlocks.ANCIENT_ACACIA_FENCE.get())
                .add(DDBlocks.ANCIENT_BIRCH_FENCE.get())
                .add(DDBlocks.ANCIENT_MANGROVE_FENCE.get())
                .add(DDBlocks.ANCIENT_OAK_FENCE.get())
                .add(DDBlocks.CHARRED_FENCE.get())
                .add(DDBlocks.EUCALYPTUS_FENCE.get())
                .add(DDBlocks.SEQUOIA_FENCE.get())
                .add(DDBlocks.DENDRANTHOS_FENCE.get())
                .add(DDBlocks.DENDRYMYCOS_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(DDBlocks.ANCIENT_ACACIA_FENCE_GATE.get())
                .add(DDBlocks.ANCIENT_BIRCH_FENCE_GATE.get())
                .add(DDBlocks.ANCIENT_MANGROVE_FENCE_GATE.get())
                .add(DDBlocks.ANCIENT_OAK_FENCE_GATE.get())
                .add(DDBlocks.EUCALYPTUS_FENCE_GATE.get())
                .add(DDBlocks.SEQUOIA_FENCE_GATE.get())
                .add(DDBlocks.DENDRANTHOS_FENCE_GATE.get())
                .add(DDBlocks.DENDRYMYCOS_FENCE_GATE.get());

        tag(BlockTags.WOODEN_DOORS)
                .add(DDBlocks.ANCIENT_ACACIA_DOOR.get())
                .add(DDBlocks.ANCIENT_BIRCH_DOOR.get())
                .add(DDBlocks.ANCIENT_MANGROVE_DOOR.get())
                .add(DDBlocks.ANCIENT_OAK_DOOR.get())
                .add(DDBlocks.EUCALYPTUS_DOOR.get())
                .add(DDBlocks.SEQUOIA_DOOR.get())
                .add(DDBlocks.DENDRANTHOS_DOOR.get())
                .add(DDBlocks.DENDRYMYCOS_DOOR.get());

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(DDBlocks.ANCIENT_ACACIA_TRAPDOOR.get())
                .add(DDBlocks.ANCIENT_BIRCH_TRAPDOOR.get())
                .add(DDBlocks.ANCIENT_MANGROVE_TRAPDOOR.get())
                .add(DDBlocks.ANCIENT_OAK_TRAPDOOR.get())
                .add(DDBlocks.EUCALYPTUS_TRAPDOOR.get())
                .add(DDBlocks.SEQUOIA_TRAPDOOR.get())
                .add(DDBlocks.DENDRANTHOS_TRAPDOOR.get())
                .add(DDBlocks.DENDRYMYCOS_TRAPDOOR.get());

        tag(BlockTags.LEAVES)
                .add(DDBlocks.ANCIENT_ACACIA_LEAVES.get())
                .add(DDBlocks.ANCIENT_BIRCH_LEAVES.get())
                .add(DDBlocks.ANCIENT_MANGROVE_LEAVES.get())
                .add(DDBlocks.ANCIENT_OAK_LEAVES.get())
                .add(DDBlocks.EUCALYPTUS_LEAVES.get())
                .add(DDBlocks.SEQUOIA_LEAVES.get())
                .add(DDBlocks.DENDRANTHOS_PETALS.get());

        tag(BlockTags.WART_BLOCKS)
                .add(DDBlocks.DENDRYMYCOS_CAP_BLUE.get())
                .add(DDBlocks.DENDRYMYCOS_CAP_GREEN.get());

        tag(BlockTags.DIRT)
                .add(DDBlocks.FERTILE_SOIL.get())
                .add(DDBlocks.DISTANT_GRASS.get())
                .add(DDBlocks.DISTANT_DIRT.get());

        tag(BlockTags.SAND)
                .add(DDBlocks.DISTANT_SAND.get())
                .add(DDBlocks.LIMESTONE_POWDER.get());

        tag(BlockTags.SUPPORTS_DRY_VEGETATION)
                .add(DDBlocks.DISTANT_SAND.get());

        tag(BlockTags.SAPLINGS)
                .add(DDBlocks.ANCIENT_ACACIA_SAPLING.get())
                .add(DDBlocks.ANCIENT_BIRCH_SAPLING.get())
                .add(DDBlocks.ANCIENT_OAK_SAPLING.get())
                .add(DDBlocks.SEQUOIA_SAPLING.get());

        tag(BlockTags.STAIRS)
                .add(DDBlocks.CHARRED_STAIRS.get())
                .add(DDBlocks.DISTANT_STONE_STAIRS.get())
                .add(DDBlocks.DISTANT_COBBLE_STAIRS.get())
                .add(DDBlocks.DISTANT_STONE_POLISHED_STAIRS.get())
                .add(DDBlocks.DISTANT_STONE_BRICK_STAIRS.get())
                .add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get())
                .add(DDBlocks.SMOOTH_DISTANT_SANDSTONE_STAIRS.get())
                .add(DDBlocks.DISTANT_SANDSTONE_BRICK_STAIRS.get())
                .add(DDBlocks.LIMESTONE_STAIRS.get())
                .add(DDBlocks.POLISHED_LIMESTONE_STAIRS.get())
                .add(DDBlocks.LIMESTONE_BRICK_STAIRS.get())
                .add(DDBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get())
                .add(DDBlocks.PEAT_STAIRS.get())
                .add(DDBlocks.PACKED_PEAT_STAIRS.get())
                .add(DDBlocks.PEAT_BRICK_STAIRS.get())
                .add(DDBlocks.ISLATE_STAIRS.get())
                .add(DDBlocks.ISLATE_COBBLED_STAIRS.get())
                .add(DDBlocks.ISLATE_POLISHED_STAIRS.get())
                .add(DDBlocks.ISLATE_BRICK_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(DDBlocks.CHARRED_SLAB.get())
                .add(DDBlocks.DISTANT_STONE_SLAB.get())
                .add(DDBlocks.DISTANT_COBBLE_SLAB.get())
                .add(DDBlocks.DISTANT_STONE_POLISHED_SLAB.get())
                .add(DDBlocks.DISTANT_STONE_BRICK_SLAB.get())
                .add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get())
                .add(DDBlocks.SMOOTH_DISTANT_SANDSTONE_SLAB.get())
                .add(DDBlocks.DISTANT_SANDSTONE_BRICK_SLAB.get())
                .add(DDBlocks.LIMESTONE_SLAB.get())
                .add(DDBlocks.POLISHED_LIMESTONE_SLAB.get())
                .add(DDBlocks.LIMESTONE_BRICK_SLAB.get())
                .add(DDBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get())
                .add(DDBlocks.PEAT_SLAB.get())
                .add(DDBlocks.PACKED_PEAT_SLAB.get())
                .add(DDBlocks.PEAT_BRICK_SLAB.get())
                .add(DDBlocks.ISLATE_SLAB.get())
                .add(DDBlocks.ISLATE_COBBLED_SLAB.get())
                .add(DDBlocks.ISLATE_POLISHED_SLAB.get())
                .add(DDBlocks.ISLATE_BRICK_SLAB.get());

        tag(BlockTags.PRESSURE_PLATES)
                .add(DDBlocks.CHARRED_PRESSURE_PLATE.get());

        tag(BlockTags.BUTTONS)
                .add(DDBlocks.CHARRED_BUTTON.get());

        tag(BlockTags.FENCES);
//                .add(DDBlocks.CHARRED_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(DDBlocks.CHARRED_FENCE_GATE.get());

        tag(BlockTags.DOORS)
                .add(DDBlocks.CHARRED_DOOR.get());

        tag(BlockTags.TRAPDOORS)
                .add(DDBlocks.CHARRED_TRAPDOOR.get());
        tag(BlockTags.WALLS)
                .add(DDBlocks.DISTANT_STONE_WALL.get())
                .add(DDBlocks.DISTANT_COBBLE_WALL.get())
                .add(DDBlocks.DISTANT_STONE_POLISHED_WALL.get())
                .add(DDBlocks.DISTANT_STONE_BRICK_WALL.get())
                .add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get())
                .add(DDBlocks.SMOOTH_DISTANT_SANDSTONE_WALL.get())
                .add(DDBlocks.DISTANT_SANDSTONE_BRICK_WALL.get())
                .add(DDBlocks.LIMESTONE_WALL.get())
                .add(DDBlocks.POLISHED_LIMESTONE_WALL.get())
                .add(DDBlocks.LIMESTONE_BRICK_WALL.get())
                .add(DDBlocks.MOSSY_LIMESTONE_BRICK_WALL.get())
                .add(DDBlocks.PEAT_WALL.get())
                .add(DDBlocks.PACKED_PEAT_WALL.get())
                .add(DDBlocks.PEAT_BRICK_WALL.get())
                .add(DDBlocks.ISLATE_WALL.get())
                .add(DDBlocks.ISLATE_COBBLED_WALL.get())
                .add(DDBlocks.ISLATE_POLISHED_WALL.get())
                .add(DDBlocks.ISLATE_BRICK_WALL.get());
    }
}
