package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DistantDreams.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        // MODDED BLOCK TAGS //


        // Block tags for eucalyptus logs (ensures that they function as wood)
        tag(ModTags.Blocks.ANCIENT_OAK_LOGS)
                .add(ModBlocks.ANCIENT_OAK_LOG.get())
                .add(ModBlocks.ANCIENT_OAK_WOOD.get())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get());

        // Block tags for eucalyptus logs (ensures that they function as wood)
        tag(ModTags.Blocks.EUCALYPTUS_LOGS)
                .add(ModBlocks.EUCALYPTUS_LOG.get())
                .add(ModBlocks.EUCALYPTUS_WOOD.get())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get());

        // Block tags for sequoia logs (ensures that they function as wood)
        tag(ModTags.Blocks.SEQUOIA_LOGS)
                .add(ModBlocks.SEQUOIA_LOG.get())
                .add(ModBlocks.SEQUOIA_WOOD.get())
                .add(ModBlocks.STRIPPED_SEQUOIA_LOG.get())
                .add(ModBlocks.STRIPPED_SEQUOIA_WOOD.get());

        // Block tags for charred logs (ensures that they function as wood)
        tag(ModTags.Blocks.CHARRED_LOGS)
                .add(ModBlocks.CHARRED_LOG.get())
                .add(ModBlocks.CHARRED_WOOD.get())
                .add(ModBlocks.STRIPPED_CHARRED_LOG.get())
                .add(ModBlocks.STRIPPED_CHARRED_WOOD.get());

        // Block tags for petrified logs (ensures that they function as wood)
        tag(ModTags.Blocks.PETRIFIED_LOGS)
                .add(ModBlocks.PETRIFIED_LOG.get())
                .add(ModBlocks.PETRIFIED_WOOD.get());


        // Special tags for charred blocks that need to be mineable by pickaxe only.
        tag(ModTags.Blocks.CHARRED_PLANKS).add(ModBlocks.CHARRED_PLANKS.get());
        tag(ModTags.Blocks.CHARRED_STAIRS).add(ModBlocks.CHARRED_STAIRS.get());
        tag(ModTags.Blocks.CHARRED_SLAB).add(ModBlocks.CHARRED_SLAB.get());
        tag(ModTags.Blocks.CHARRED_PRESSURE_PLATE).add(ModBlocks.CHARRED_PRESSURE_PLATE.get());
        tag(ModTags.Blocks.CHARRED_BUTTON).add(ModBlocks.CHARRED_BUTTON.get());
        tag(ModTags.Blocks.CHARRED_FENCE).add(ModBlocks.CHARRED_FENCE.get());
        tag(ModTags.Blocks.CHARRED_FENCE_GATE).add(ModBlocks.CHARRED_FENCE_GATE.get());
        tag(ModTags.Blocks.CHARRED_DOOR).add(ModBlocks.CHARRED_DOOR.get());
        tag(ModTags.Blocks.CHARRED_TRAPDOOR).add(ModBlocks.CHARRED_TRAPDOOR.get());
        tag(ModTags.Blocks.PETRIFIED_PLANKS).add(ModBlocks.PETRIFIED_PLANKS.get());
        tag(ModTags.Blocks.PETRIFIED_STAIRS).add(ModBlocks.PETRIFIED_STAIRS.get());
        tag(ModTags.Blocks.PETRIFIED_SLAB).add(ModBlocks.PETRIFIED_SLAB.get());
        tag(ModTags.Blocks.PETRIFIED_PRESSURE_PLATE).add(ModBlocks.PETRIFIED_PRESSURE_PLATE.get());
        tag(ModTags.Blocks.PETRIFIED_BUTTON).add(ModBlocks.PETRIFIED_BUTTON.get());
        tag(ModTags.Blocks.PETRIFIED_FENCE).add(ModBlocks.PETRIFIED_FENCE.get());
        tag(ModTags.Blocks.PETRIFIED_FENCE_GATE).add(ModBlocks.PETRIFIED_FENCE_GATE.get());

        // END MODDED BLOCK TAGS


        // Block tags for mining
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CHARRED_LOG.get())
                .add(ModBlocks.CHARRED_WOOD.get())
                .add(ModBlocks.STRIPPED_CHARRED_LOG.get())
                .add(ModBlocks.STRIPPED_CHARRED_WOOD.get())
                .add(ModBlocks.CHARRED_PLANKS.get())
                .add(ModBlocks.CHARRED_STAIRS.get())
                .add(ModBlocks.CHARRED_SLAB.get())
                .add(ModBlocks.CHARRED_PRESSURE_PLATE.get())
                .add(ModBlocks.CHARRED_BUTTON.get())
                .add(ModBlocks.CHARRED_FENCE.get())
                .add(ModBlocks.CHARRED_FENCE_GATE.get())
                .add(ModBlocks.CHARRED_DOOR.get())
                .add(ModBlocks.CHARRED_TRAPDOOR.get())
                .add(ModBlocks.CHARRED_CRAFTING_TABLE.get())
                .add(ModBlocks.PETRIFIED_LOG.get())
                .add(ModBlocks.PETRIFIED_WOOD.get())
                .add(ModBlocks.PETRIFIED_PLANKS.get())
                .add(ModBlocks.PETRIFIED_STAIRS.get())
                .add(ModBlocks.PETRIFIED_SLAB.get())
                .add(ModBlocks.PETRIFIED_PRESSURE_PLATE.get())
                .add(ModBlocks.PETRIFIED_BUTTON.get())
                .add(ModBlocks.PETRIFIED_FENCE.get())
                .add(ModBlocks.PETRIFIED_FENCE_GATE.get())
                .add(ModBlocks.DISTANT_STONE.get())
                .add(ModBlocks.DISTANT_STONE_STAIRS.get())
                .add(ModBlocks.DISTANT_STONE_SLAB.get())
                .add(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get())
                .add(ModBlocks.DISTANT_STONE_BUTTON.get())
                .add(ModBlocks.DISTANT_STONE_WALL.get())
                .add(ModBlocks.POLISHED_DISTANT_STONE.get())
                .add(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_DISTANT_STONE_WALL.get())
                .add(ModBlocks.DISTANT_STONE_BRICKS.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_WALL.get())
                .add(ModBlocks.LIMESTONE.get())
                .add(ModBlocks.LIMESTONE_STAIRS.get())
                .add(ModBlocks.LIMESTONE_SLAB.get())
                .add(ModBlocks.LIMESTONE_PRESSURE_PLATE.get())
                .add(ModBlocks.LIMESTONE_BUTTON.get())
                .add(ModBlocks.LIMESTONE_WALL.get())
                .add(ModBlocks.POLISHED_LIMESTONE.get())
                .add(ModBlocks.POLISHED_LIMESTONE_STAIRS.get())
                .add(ModBlocks.POLISHED_LIMESTONE_SLAB.get())
                .add(ModBlocks.POLISHED_LIMESTONE_WALL.get())
                .add(ModBlocks.LIMESTONE_BRICKS.get())
                .add(ModBlocks.LIMESTONE_BRICK_STAIRS.get())
                .add(ModBlocks.LIMESTONE_BRICK_SLAB.get())
                .add(ModBlocks.LIMESTONE_BRICK_WALL.get())
                .add(ModBlocks.LIMESTONE_PILLAR.get())
                .add(ModBlocks.LIMESTONE_POWDER.get())
                .add(ModBlocks.RHYOLITE.get())
                .add(ModBlocks.RHYOLITE_STAIRS.get())
                .add(ModBlocks.RHYOLITE_SLAB.get())
                .add(ModBlocks.RHYOLITE_WALL.get())
                .add(ModBlocks.RHYOLITE_BUTTON.get())
                .add(ModBlocks.RHYOLITE_PRESSURE_PLATE.get())
                .add(ModBlocks.RHYOLITE_BRICKS.get())
                .add(ModBlocks.RHYOLITE_BRICK_STAIRS.get())
                .add(ModBlocks.RHYOLITE_BRICK_SLAB.get())
                .add(ModBlocks.RHYOLITE_BRICK_WALL.get())
                .add(ModBlocks.RHYOLITE_TILES.get())
                .add(ModBlocks.RHYOLITE_TILE_STAIRS.get())
                .add(ModBlocks.RHYOLITE_TILE_SLAB.get())
                .add(ModBlocks.RHYOLITE_TILE_WALL.get())
                .add(ModBlocks.PACKED_PEAT.get())
                .add(ModBlocks.PACKED_PEAT_SLAB.get())
                .add(ModBlocks.PACKED_PEAT_STAIRS.get())
                .add(ModBlocks.PACKED_PEAT_WALL.get())
                .add(ModBlocks.PEAT_BRICKS.get())
                .add(ModBlocks.PEAT_BRICK_SLAB.get())
                .add(ModBlocks.PEAT_BRICK_STAIRS.get())
                .add(ModBlocks.PEAT_BRICK_WALL.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.FERTILE_SOIL.get())
                .add(ModBlocks.FERTILE_PLOT.get())
                .add(ModBlocks.PEAT.get())
                .add(ModBlocks.PEAT_SLAB.get())
                .add(ModBlocks.PEAT_STAIRS.get())
                .add(ModBlocks.PEAT_WALL.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHARRED_LOG.get())
                .add(ModBlocks.CHARRED_WOOD.get())
                .add(ModBlocks.STRIPPED_CHARRED_LOG.get())
                .add(ModBlocks.STRIPPED_CHARRED_WOOD.get())
                .add(ModBlocks.CHARRED_PLANKS.get())
                .add(ModBlocks.CHARRED_STAIRS.get())
                .add(ModBlocks.CHARRED_SLAB.get())
                .add(ModBlocks.CHARRED_PRESSURE_PLATE.get())
                .add(ModBlocks.CHARRED_BUTTON.get())
                .add(ModBlocks.CHARRED_FENCE.get())
                .add(ModBlocks.CHARRED_FENCE_GATE.get())
                .add(ModBlocks.CHARRED_DOOR.get())
                .add(ModBlocks.CHARRED_TRAPDOOR.get())
                .add(ModBlocks.CHARRED_CRAFTING_TABLE.get())
                .add(ModBlocks.PETRIFIED_LOG.get())
                .add(ModBlocks.PETRIFIED_WOOD.get())
                .add(ModBlocks.PETRIFIED_PLANKS.get())
                .add(ModBlocks.PETRIFIED_STAIRS.get())
                .add(ModBlocks.PETRIFIED_SLAB.get())
                .add(ModBlocks.PETRIFIED_PRESSURE_PLATE.get())
                .add(ModBlocks.PETRIFIED_BUTTON.get())
                .add(ModBlocks.PETRIFIED_FENCE.get())
                .add(ModBlocks.PETRIFIED_FENCE_GATE.get());


        tag(BlockTags.NEEDS_IRON_TOOL);
        tag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(BlockTags.LOGS);


        tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ANCIENT_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get())
                .add(ModBlocks.ANCIENT_OAK_WOOD.get())
                .add(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get())
                .add(ModBlocks.EUCALYPTUS_LOG.get())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get())
                .add(ModBlocks.EUCALYPTUS_WOOD.get())
                .add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get())
                .add(ModBlocks.SEQUOIA_LOG.get())
                .add(ModBlocks.STRIPPED_SEQUOIA_LOG.get())
                .add(ModBlocks.SEQUOIA_WOOD.get())
                .add(ModBlocks.STRIPPED_SEQUOIA_WOOD.get());


        tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(ModBlocks.ANCIENT_OAK_LOG.get())
                .add(ModBlocks.EUCALYPTUS_LOG.get())
                .add(ModBlocks.SEQUOIA_LOG.get());

        tag(BlockTags.PLANKS)
                .add(ModBlocks.ANCIENT_OAK_PLANKS.get())
                .add(ModBlocks.EUCALYPTUS_PLANKS.get())
                .add(ModBlocks.SEQUOIA_PLANKS.get())
                .add(ModBlocks.CHARRED_PLANKS.get())
                .add(ModBlocks.PETRIFIED_PLANKS.get());

        tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.ANCIENT_OAK_STAIRS.get())
                .add(ModBlocks.EUCALYPTUS_STAIRS.get())
                .add(ModBlocks.SEQUOIA_STAIRS.get());

        tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.ANCIENT_OAK_SLAB.get())
                .add(ModBlocks.EUCALYPTUS_SLAB.get())
                .add(ModBlocks.SEQUOIA_SLAB.get());

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.ANCIENT_OAK_PRESSURE_PLATE.get())
                .add(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get())
                .add(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());

        tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.ANCIENT_OAK_BUTTON.get())
                .add(ModBlocks.EUCALYPTUS_BUTTON.get())
                .add(ModBlocks.SEQUOIA_BUTTON.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ANCIENT_OAK_FENCE.get())
                .add(ModBlocks.EUCALYPTUS_FENCE.get())
                .add(ModBlocks.SEQUOIA_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ANCIENT_OAK_FENCE_GATE.get())
                .add(ModBlocks.EUCALYPTUS_FENCE_GATE.get())
                .add(ModBlocks.SEQUOIA_FENCE_GATE.get());

        tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.ANCIENT_OAK_DOOR.get())
                .add(ModBlocks.EUCALYPTUS_DOOR.get())
                .add(ModBlocks.SEQUOIA_DOOR.get());

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.ANCIENT_OAK_TRAPDOOR.get())
                .add(ModBlocks.EUCALYPTUS_TRAPDOOR.get())
                .add(ModBlocks.SEQUOIA_TRAPDOOR.get());

        tag(BlockTags.LEAVES)
                .add(ModBlocks.ANCIENT_OAK_LEAVES.get())
                .add(ModBlocks.EUCALYPTUS_LEAVES.get())
                .add(ModBlocks.SEQUOIA_LEAVES.get());

        tag(BlockTags.DIRT)
                .add(ModBlocks.FERTILE_SOIL.get())
                .add(ModBlocks.FERTILE_PLOT.get())
                .add((ModBlocks.DISTANT_DIRT.get()))
                .add((ModBlocks.DISTANT_GRASS.get()));

        tag(BlockTags.STAIRS)
                .add(ModBlocks.DISTANT_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.LIMESTONE_STAIRS.get())
                .add(ModBlocks.POLISHED_LIMESTONE_STAIRS.get())
                .add(ModBlocks.LIMESTONE_BRICK_STAIRS.get())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get())
                .add(ModBlocks.RHYOLITE_STAIRS.get())
                .add(ModBlocks.RHYOLITE_BRICK_STAIRS.get())
                .add(ModBlocks.RHYOLITE_TILE_STAIRS.get())
                .add(ModBlocks.CHARRED_STAIRS.get())
                .add(ModBlocks.PETRIFIED_STAIRS.get())
                .add(ModBlocks.PEAT_STAIRS.get())
                .add(ModBlocks.PACKED_PEAT_STAIRS.get())
                .add(ModBlocks.PEAT_BRICK_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(ModBlocks.DISTANT_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get())
                .add(ModBlocks.LIMESTONE_SLAB.get())
                .add(ModBlocks.POLISHED_LIMESTONE_SLAB.get())
                .add(ModBlocks.LIMESTONE_BRICK_SLAB.get())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get())
                .add(ModBlocks.RHYOLITE_SLAB.get())
                .add(ModBlocks.RHYOLITE_BRICK_SLAB.get())
                .add(ModBlocks.RHYOLITE_TILE_SLAB.get())
                .add(ModBlocks.CHARRED_SLAB.get())
                .add(ModBlocks.PETRIFIED_SLAB.get())
                .add(ModBlocks.PEAT_SLAB.get())
                .add(ModBlocks.PACKED_PEAT_SLAB.get())
                .add(ModBlocks.PEAT_BRICK_SLAB.get());

        tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get())
                .add(ModBlocks.LIMESTONE_PRESSURE_PLATE.get())
                .add(ModBlocks.RHYOLITE_PRESSURE_PLATE.get())
                .add(ModBlocks.CHARRED_PRESSURE_PLATE.get())
                .add(ModBlocks.PETRIFIED_PRESSURE_PLATE.get());

        tag(BlockTags.BUTTONS)
                .add(ModBlocks.CHARRED_BUTTON.get())
                .add(ModBlocks.PETRIFIED_BUTTON.get());

        tag(BlockTags.FENCES)
                .add(ModBlocks.CHARRED_FENCE.get())
                .add(ModBlocks.PETRIFIED_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.CHARRED_FENCE_GATE.get())
                .add(ModBlocks.PETRIFIED_FENCE_GATE.get());

        tag(BlockTags.DOORS)
                .add(ModBlocks.CHARRED_DOOR.get())
                .add(ModBlocks.PETRIFIED_DOOR.get());

        tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.CHARRED_TRAPDOOR.get())
                .add(ModBlocks.PETRIFIED_TRAPDOOR.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.DISTANT_STONE_WALL.get())
                .add(ModBlocks.POLISHED_DISTANT_STONE_WALL.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_WALL.get())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get())
                .add(ModBlocks.LIMESTONE_WALL.get())
                .add(ModBlocks.POLISHED_LIMESTONE_WALL.get())
                .add(ModBlocks.LIMESTONE_BRICK_WALL.get())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get())
                .add(ModBlocks.RHYOLITE_WALL.get())
                .add(ModBlocks.RHYOLITE_BRICK_WALL.get())
                .add(ModBlocks.RHYOLITE_TILE_WALL.get())
                .add((ModBlocks.PEAT_WALL.get()))
                .add(ModBlocks.PACKED_PEAT_WALL.get())
                .add(ModBlocks.PEAT_BRICK_WALL.get());

        tag(BlockTags.STONE_BRICKS)
                .add(ModBlocks.DISTANT_STONE_BRICKS.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get())
                .add(ModBlocks.DISTANT_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get())
                .add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get())
                .add(ModBlocks.LIMESTONE_BRICKS.get())
                .add(ModBlocks.LIMESTONE_BRICK_STAIRS.get())
                .add(ModBlocks.LIMESTONE_BRICK_SLAB.get())
                .add(ModBlocks.LIMESTONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_LIMESTONE_BRICKS.get())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICKS.get())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get())
                .add(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get())
                .add(ModBlocks.RHYOLITE_BRICKS.get())
                .add(ModBlocks.RHYOLITE_BRICK_STAIRS.get())
                .add(ModBlocks.RHYOLITE_BRICK_SLAB.get())
                .add(ModBlocks.RHYOLITE_BRICK_WALL.get())
                .add(ModBlocks.PEAT_BRICKS.get())
                .add(ModBlocks.PEAT_BRICK_SLAB.get())
                .add(ModBlocks.PEAT_BRICK_STAIRS.get())
                .add(ModBlocks.PEAT_BRICK_WALL.get());

        tag(BlockTags.STONE_BUTTONS)
                .add(ModBlocks.DISTANT_STONE_BUTTON.get())
                .add(ModBlocks.LIMESTONE_BUTTON.get())
                .add(ModBlocks.RHYOLITE_BUTTON.get());

        tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.OPEN_DREAMFLOWER.get())
                .add(ModBlocks.CLOSED_DREAMFLOWER.get());

    }

}
