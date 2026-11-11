package net.whereabouts.DistantDreams.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.whereabouts.DistantDreams.block.DDBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class DDBlockLootTableProvider extends BlockLootSubProvider {

    public DDBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        dropSelf(DDBlocks.ANCIENT_OAK_LOG.get());
        dropSelf(DDBlocks.ANCIENT_OAK_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get());
        dropSelf(DDBlocks.ANCIENT_OAK_PLANKS.get());
        dropSelf(DDBlocks.ANCIENT_OAK_STAIRS.get());
        add(DDBlocks.ANCIENT_OAK_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ANCIENT_OAK_SLAB.get()));
        dropSelf(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.ANCIENT_OAK_BUTTON.get());
        dropSelf(DDBlocks.ANCIENT_OAK_FENCE.get());
        dropSelf(DDBlocks.ANCIENT_OAK_FENCE_GATE.get());
        add(DDBlocks.ANCIENT_OAK_DOOR.get(),
                _ -> createDoorTable(DDBlocks.ANCIENT_OAK_DOOR.get()));
        dropSelf(DDBlocks.ANCIENT_OAK_TRAPDOOR.get());
        add(DDBlocks.ANCIENT_OAK_LEAVES.get(),
                block -> createLeavesDrops(block, DDBlocks.ANCIENT_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(DDBlocks.ANCIENT_OAK_SAPLING.get());
        dropPottedContents(DDBlocks.POTTED_ANCIENT_OAK_SAPLING.get());

        dropSelf(DDBlocks.ANCIENT_BIRCH_LOG.get());
        dropSelf(DDBlocks.ANCIENT_BIRCH_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_BIRCH_LOG.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_BIRCH_WOOD.get());
        dropSelf(DDBlocks.ANCIENT_BIRCH_PLANKS.get());
        dropSelf(DDBlocks.ANCIENT_BIRCH_STAIRS.get());
        add(DDBlocks.ANCIENT_BIRCH_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ANCIENT_BIRCH_SLAB.get()));
        dropSelf(DDBlocks.ANCIENT_BIRCH_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.ANCIENT_BIRCH_BUTTON.get());
        dropSelf(DDBlocks.ANCIENT_BIRCH_FENCE.get());
        dropSelf(DDBlocks.ANCIENT_BIRCH_FENCE_GATE.get());
        add(DDBlocks.ANCIENT_BIRCH_DOOR.get(),
                _ -> createDoorTable(DDBlocks.ANCIENT_BIRCH_DOOR.get()));
        dropSelf(DDBlocks.ANCIENT_BIRCH_TRAPDOOR.get());
        add(DDBlocks.ANCIENT_BIRCH_LEAVES.get(),
                block -> createLeavesDrops(block, DDBlocks.ANCIENT_BIRCH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(DDBlocks.ANCIENT_BIRCH_SAPLING.get());
        dropPottedContents(DDBlocks.POTTED_ANCIENT_BIRCH_SAPLING.get());

        dropSelf(DDBlocks.ANCIENT_ACACIA_LOG.get());
        dropSelf(DDBlocks.ANCIENT_ACACIA_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_ACACIA_LOG.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_ACACIA_WOOD.get());
        dropSelf(DDBlocks.ANCIENT_ACACIA_PLANKS.get());
        dropSelf(DDBlocks.ANCIENT_ACACIA_STAIRS.get());
        add(DDBlocks.ANCIENT_ACACIA_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ANCIENT_ACACIA_SLAB.get()));
        dropSelf(DDBlocks.ANCIENT_ACACIA_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.ANCIENT_ACACIA_BUTTON.get());
        dropSelf(DDBlocks.ANCIENT_ACACIA_FENCE.get());
        dropSelf(DDBlocks.ANCIENT_ACACIA_FENCE_GATE.get());
        add(DDBlocks.ANCIENT_ACACIA_DOOR.get(),
                _ -> createDoorTable(DDBlocks.ANCIENT_ACACIA_DOOR.get()));
        dropSelf(DDBlocks.ANCIENT_ACACIA_TRAPDOOR.get());
        add(DDBlocks.ANCIENT_ACACIA_LEAVES.get(),
                block -> createLeavesDrops(block, DDBlocks.ANCIENT_ACACIA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(DDBlocks.ANCIENT_ACACIA_SAPLING.get());
        dropPottedContents(DDBlocks.POTTED_ANCIENT_ACACIA_SAPLING.get());

        dropSelf(DDBlocks.ANCIENT_MANGROVE_LOG.get());
        dropSelf(DDBlocks.ANCIENT_MANGROVE_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_MANGROVE_LOG.get());
        dropSelf(DDBlocks.STRIPPED_ANCIENT_MANGROVE_WOOD.get());
        dropSelf(DDBlocks.ANCIENT_MANGROVE_PLANKS.get());
        dropSelf(DDBlocks.ANCIENT_MANGROVE_STAIRS.get());
        add(DDBlocks.ANCIENT_MANGROVE_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ANCIENT_MANGROVE_SLAB.get()));
        dropSelf(DDBlocks.ANCIENT_MANGROVE_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.ANCIENT_MANGROVE_BUTTON.get());
        dropSelf(DDBlocks.ANCIENT_MANGROVE_FENCE.get());
        dropSelf(DDBlocks.ANCIENT_MANGROVE_FENCE_GATE.get());
        add(DDBlocks.ANCIENT_MANGROVE_DOOR.get(),
                _ -> createDoorTable(DDBlocks.ANCIENT_MANGROVE_DOOR.get()));
        dropSelf(DDBlocks.ANCIENT_MANGROVE_TRAPDOOR.get());
        add(DDBlocks.ANCIENT_MANGROVE_LEAVES.get(),
                block -> createLeavesDrops(block, DDBlocks.ANCIENT_BIRCH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        // Charred logs and wood will drop 4 pieces of charcoal if they are not broken with silk touch.
        add(DDBlocks.CHARRED_LOG.get(),
                block -> createSingleItemTableWithSilkTouch(block, Items.CHARCOAL, ConstantValue.exactly(4)));
        add(DDBlocks.STRIPPED_CHARRED_LOG.get(),
                block -> createSingleItemTableWithSilkTouch(block, Items.CHARCOAL, ConstantValue.exactly(4)));
        add(DDBlocks.CHARRED_WOOD.get(),
                block -> createSingleItemTableWithSilkTouch(block, Items.CHARCOAL, ConstantValue.exactly(4)));
        add(DDBlocks.STRIPPED_CHARRED_WOOD.get(),
                block -> createSingleItemTableWithSilkTouch(block, Items.CHARCOAL, ConstantValue.exactly(4)));
        dropSelf(DDBlocks.CHARRED_PLANKS.get());
        dropSelf(DDBlocks.CHARRED_STAIRS.get());
        add(DDBlocks.CHARRED_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.CHARRED_SLAB.get()));
        dropSelf(DDBlocks.CHARRED_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.CHARRED_BUTTON.get());
        dropSelf(DDBlocks.CHARRED_FENCE.get());
        dropSelf(DDBlocks.CHARRED_FENCE_GATE.get());
        add(DDBlocks.CHARRED_DOOR.get(),
                _ -> createDoorTable(DDBlocks.CHARRED_DOOR.get()));
        dropSelf(DDBlocks.CHARRED_TRAPDOOR.get());


        dropSelf(DDBlocks.EUCALYPTUS_LOG.get());
        dropSelf(DDBlocks.EUCALYPTUS_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        dropSelf(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        dropSelf(DDBlocks.EUCALYPTUS_PLANKS.get());
        dropSelf(DDBlocks.EUCALYPTUS_STAIRS.get());
        add(DDBlocks.EUCALYPTUS_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.EUCALYPTUS_SLAB.get()));
        dropSelf(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.EUCALYPTUS_BUTTON.get());
        dropSelf(DDBlocks.EUCALYPTUS_FENCE.get());
        dropSelf(DDBlocks.EUCALYPTUS_FENCE_GATE.get());
        add(DDBlocks.EUCALYPTUS_DOOR.get(),
                _ -> createDoorTable(DDBlocks.EUCALYPTUS_DOOR.get()));
        dropSelf(DDBlocks.EUCALYPTUS_TRAPDOOR.get());
        add(DDBlocks.EUCALYPTUS_LEAVES.get(),
                block -> createLeavesDrops(block, DDBlocks.EUCALYPTUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(DDBlocks.EUCALYPTUS_SAPLING.get());
        dropPottedContents(DDBlocks.POTTED_EUCALYPTUS_SAPLING.get());


        dropSelf(DDBlocks.SEQUOIA_LOG.get());
        dropSelf(DDBlocks.SEQUOIA_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_SEQUOIA_LOG.get());
        dropSelf(DDBlocks.STRIPPED_SEQUOIA_WOOD.get());
        dropSelf(DDBlocks.SEQUOIA_PLANKS.get());
        dropSelf(DDBlocks.SEQUOIA_STAIRS.get());
        add(DDBlocks.SEQUOIA_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.SEQUOIA_SLAB.get()));
        dropSelf(DDBlocks.SEQUOIA_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.SEQUOIA_BUTTON.get());
        dropSelf(DDBlocks.SEQUOIA_FENCE.get());
        dropSelf(DDBlocks.SEQUOIA_FENCE_GATE.get());
        add(DDBlocks.SEQUOIA_DOOR.get(),
                _ -> createDoorTable(DDBlocks.SEQUOIA_DOOR.get()));
        dropSelf(DDBlocks.SEQUOIA_TRAPDOOR.get());
        add(DDBlocks.SEQUOIA_LEAVES.get(),
                block -> createLeavesDrops(block, DDBlocks.SEQUOIA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(DDBlocks.SEQUOIA_SAPLING.get());
        dropPottedContents(DDBlocks.POTTED_SEQUOIA_SAPLING.get());

        dropSelf(DDBlocks.DENDRANTHOS_LOG.get());
        dropSelf(DDBlocks.DENDRANTHOS_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_DENDRANTHOS_LOG.get());
        dropSelf(DDBlocks.STRIPPED_DENDRANTHOS_WOOD.get());
        dropSelf(DDBlocks.DENDRANTHOS_PLANKS.get());
        dropSelf(DDBlocks.DENDRANTHOS_STAIRS.get());
        add(DDBlocks.DENDRANTHOS_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.DENDRANTHOS_SLAB.get()));
        dropSelf(DDBlocks.DENDRANTHOS_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.DENDRANTHOS_BUTTON.get());
        dropSelf(DDBlocks.DENDRANTHOS_FENCE.get());
        dropSelf(DDBlocks.DENDRANTHOS_FENCE_GATE.get());
        add(DDBlocks.DENDRANTHOS_DOOR.get(),
                _ -> createDoorTable(DDBlocks.DENDRANTHOS_DOOR.get()));
        dropSelf(DDBlocks.DENDRANTHOS_TRAPDOOR.get());
        dropSelf(DDBlocks.DENDRANTHOS_ANTHER.get());
        add(DDBlocks.DENDRANTHOS_PETALS.get(),
                block -> createLeavesDrops(block, DDBlocks.SEQUOIA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(DDBlocks.DENDRYMYCOS_LOG.get());
        dropSelf(DDBlocks.DENDRYMYCOS_WOOD.get());
        dropSelf(DDBlocks.STRIPPED_DENDRYMYCOS_LOG.get());
        dropSelf(DDBlocks.STRIPPED_DENDRYMYCOS_WOOD.get());
        dropSelf(DDBlocks.DENDRYMYCOS_PLANKS.get());
        dropSelf(DDBlocks.DENDRYMYCOS_STAIRS.get());
        add(DDBlocks.DENDRYMYCOS_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.DENDRYMYCOS_SLAB.get()));
        dropSelf(DDBlocks.DENDRYMYCOS_PRESSURE_PLATE.get());
        dropSelf(DDBlocks.DENDRYMYCOS_BUTTON.get());
        dropSelf(DDBlocks.DENDRYMYCOS_FENCE.get());
        dropSelf(DDBlocks.DENDRYMYCOS_FENCE_GATE.get());
        add(DDBlocks.DENDRYMYCOS_DOOR.get(),
                _ -> createDoorTable(DDBlocks.DENDRYMYCOS_DOOR.get()));
        dropSelf(DDBlocks.DENDRYMYCOS_TRAPDOOR.get());
        dropSelf(DDBlocks.DENDRYMYCOS_CAP_BLUE.get());
        dropSelf(DDBlocks.DENDRYMYCOS_CAP_GREEN.get());


        add(DDBlocks.FERTILE_SOIL.get(),
                block -> createSingleItemTableWithSilkTouch(block, Blocks.DIRT));

        add(DDBlocks.DISTANT_GRASS.get(),
                block -> createSingleItemTableWithSilkTouch(block, Blocks.DIRT));
        dropSelf(DDBlocks.DISTANT_DIRT.get());

        dropSelf(DDBlocks.DISTANT_STONE.get());
        dropSelf(DDBlocks.DISTANT_STONE_STAIRS.get());
        add(DDBlocks.DISTANT_STONE_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.DISTANT_STONE_SLAB.get()));
        dropSelf(DDBlocks.DISTANT_STONE_WALL.get());
        dropSelf(DDBlocks.DISTANT_COBBLE.get());
        dropSelf(DDBlocks.DISTANT_COBBLE_STAIRS.get());
        add(DDBlocks.DISTANT_COBBLE_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.DISTANT_COBBLE_SLAB.get()));
        dropSelf(DDBlocks.DISTANT_COBBLE_WALL.get());
        dropSelf(DDBlocks.DISTANT_STONE_POLISHED.get());
        dropSelf(DDBlocks.DISTANT_STONE_POLISHED_STAIRS.get());
        add(DDBlocks.DISTANT_STONE_POLISHED_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.DISTANT_STONE_POLISHED_SLAB.get()));
        dropSelf(DDBlocks.DISTANT_STONE_POLISHED_WALL.get());
        dropSelf(DDBlocks.DISTANT_STONE_BRICKS.get());
        dropSelf(DDBlocks.DISTANT_STONE_BRICK_STAIRS.get());
        add(DDBlocks.DISTANT_STONE_BRICK_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.DISTANT_STONE_BRICK_SLAB.get()));
        dropSelf(DDBlocks.DISTANT_STONE_BRICK_WALL.get());

        dropSelf(DDBlocks.DISTANT_SAND.get());
        dropSelf(DDBlocks.DISTANT_SANDSTONE.get());
        dropSelf(DDBlocks.SMOOTH_DISTANT_SANDSTONE.get());
        dropSelf(DDBlocks.SMOOTH_DISTANT_SANDSTONE_STAIRS.get());
        add(DDBlocks.SMOOTH_DISTANT_SANDSTONE_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.SMOOTH_DISTANT_SANDSTONE_SLAB.get()));
        dropSelf(DDBlocks.SMOOTH_DISTANT_SANDSTONE_WALL.get());
        dropSelf(DDBlocks.DISTANT_SANDSTONE_BRICKS.get());
        dropSelf(DDBlocks.DISTANT_SANDSTONE_BRICK_STAIRS.get());
        add(DDBlocks.DISTANT_SANDSTONE_BRICK_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.DISTANT_SANDSTONE_BRICK_SLAB.get()));
        dropSelf(DDBlocks.DISTANT_SANDSTONE_BRICK_WALL.get());

        dropSelf(DDBlocks.ISLATE.get());
        dropSelf(DDBlocks.ISLATE_STAIRS.get());
        add(DDBlocks.ISLATE_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ISLATE_SLAB.get()));
        dropSelf(DDBlocks.ISLATE_WALL.get());
        dropSelf(DDBlocks.ISLATE_COBBLED.get());
        dropSelf(DDBlocks.ISLATE_COBBLED_STAIRS.get());
        add(DDBlocks.ISLATE_COBBLED_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ISLATE_COBBLED_SLAB.get()));
        dropSelf(DDBlocks.ISLATE_COBBLED_WALL.get());
        dropSelf(DDBlocks.ISLATE_POLISHED.get());
        dropSelf(DDBlocks.ISLATE_POLISHED_STAIRS.get());
        add(DDBlocks.ISLATE_POLISHED_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ISLATE_POLISHED_SLAB.get()));
        dropSelf(DDBlocks.ISLATE_POLISHED_WALL.get());
        dropSelf(DDBlocks.ISLATE_BRICKS.get());
        dropSelf(DDBlocks.ISLATE_BRICK_STAIRS.get());
        add(DDBlocks.ISLATE_BRICK_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.ISLATE_BRICK_SLAB.get()));
        dropSelf(DDBlocks.ISLATE_BRICK_WALL.get());

        dropSelf(DDBlocks.PEAT.get());
        dropSelf(DDBlocks.PEAT_STAIRS.get());
        add(DDBlocks.PEAT_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.PEAT_SLAB.get()));
        dropSelf(DDBlocks.PEAT_WALL.get());
        dropSelf(DDBlocks.PACKED_PEAT.get());
        dropSelf(DDBlocks.PACKED_PEAT_STAIRS.get());
        add(DDBlocks.PACKED_PEAT_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.PACKED_PEAT_SLAB.get()));
        dropSelf(DDBlocks.PACKED_PEAT_WALL.get());
        dropSelf(DDBlocks.PEAT_BRICKS.get());
        dropSelf(DDBlocks.PEAT_BRICK_STAIRS.get());
        add(DDBlocks.PEAT_BRICK_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.PEAT_BRICK_SLAB.get()));
        dropSelf(DDBlocks.PEAT_BRICK_WALL.get());
        dropSelf(DDBlocks.CHISELED_PEAT.get());

        dropSelf(DDBlocks.RHYOLITE.get());
        dropSelf(DDBlocks.RHYOLITE_STAIRS.get());
        add(DDBlocks.RHYOLITE_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.RHYOLITE_SLAB.get()));
        dropSelf(DDBlocks.RHYOLITE_WALL.get());
        dropSelf(DDBlocks.RHYOLITE_BRICKS.get());
        dropSelf(DDBlocks.RHYOLITE_BRICK_STAIRS.get());
        add(DDBlocks.RHYOLITE_BRICK_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.RHYOLITE_BRICK_SLAB.get()));
        dropSelf(DDBlocks.RHYOLITE_BRICK_WALL.get());
        dropSelf(DDBlocks.RHYOLITE_TILES.get());
        dropSelf(DDBlocks.RHYOLITE_TILE_STAIRS.get());
        add(DDBlocks.RHYOLITE_TILE_SLAB.get(),
                _ -> createSlabItemTable(DDBlocks.RHYOLITE_TILE_SLAB.get()));
        dropSelf(DDBlocks.RHYOLITE_TILE_WALL.get());

    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return DDBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
