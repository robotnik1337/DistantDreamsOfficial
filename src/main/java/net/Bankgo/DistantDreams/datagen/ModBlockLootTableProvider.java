package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        // Eucalyptus Wood Set
        this.dropSelf(ModBlocks.EUCALYPTUS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        this.dropSelf(ModBlocks.EUCALYPTUS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        this.dropSelf(ModBlocks.EUCALYPTUS_SAPLING.get());
        this.dropSelf(ModBlocks.EUCALYPTUS_PLANKS.get());
        this.dropSelf(ModBlocks.EUCALYPTUS_STAIRS.get());
        this.add(ModBlocks.EUCALYPTUS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EUCALYPTUS_SLAB.get()));
        this.dropSelf(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.EUCALYPTUS_BUTTON.get());
        this.dropSelf(ModBlocks.EUCALYPTUS_FENCE.get());
        this.dropSelf(ModBlocks.EUCALYPTUS_FENCE_GATE.get());
        this.add(ModBlocks.EUCALYPTUS_DOOR.get(),
                block -> createDoorTable(ModBlocks.EUCALYPTUS_DOOR.get()));
        this.dropSelf(ModBlocks.EUCALYPTUS_TRAPDOOR.get());
        this.add(ModBlocks.EUCALYPTUS_LEAVES.get(),
                block -> createLeavesDrops(block, ModBlocks.EUCALYPTUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        // Sequoia Wood Set
        this.dropSelf(ModBlocks.SEQUOIA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SEQUOIA_LOG.get());
        this.dropSelf(ModBlocks.SEQUOIA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SEQUOIA_WOOD.get());
        this.dropSelf(ModBlocks.SEQUOIA_PLANKS.get());
        this.dropSelf(ModBlocks.SEQUOIA_STAIRS.get());
        this.add(ModBlocks.SEQUOIA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SEQUOIA_SLAB.get()));
        this.dropSelf(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SEQUOIA_BUTTON.get());
        this.dropSelf(ModBlocks.SEQUOIA_FENCE.get());
        this.dropSelf(ModBlocks.SEQUOIA_FENCE_GATE.get());
        this.add(ModBlocks.SEQUOIA_DOOR.get(),
                block -> createDoorTable(ModBlocks.SEQUOIA_DOOR.get()));
        this.dropSelf(ModBlocks.SEQUOIA_TRAPDOOR.get());
        this.add(ModBlocks.SEQUOIA_LEAVES.get(),
                block -> createLeavesDrops(block, ModBlocks.SEQUOIA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.SEQUOIA_SAPLING.get());

        // Fertile Blocks
        this.add(ModBlocks.FERTILE_SOIL.get(),
                block -> createSingleItemTableWithSilkTouch(block, Blocks.DIRT));
        this.add(ModBlocks.FERTILE_PLOT.get(),
                block -> createSingleItemTable(Blocks.DIRT));
        // Distant Stone Set
        this.dropSelf(ModBlocks.DISTANT_STONE.get());
        this.dropSelf(ModBlocks.DISTANT_STONE_STAIRS.get());
        this.add(ModBlocks.DISTANT_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DISTANT_STONE_SLAB.get()));
        this.dropSelf(ModBlocks.DISTANT_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.DISTANT_STONE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_DISTANT_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get());
        this.add(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_DISTANT_STONE_WALL.get());
        this.dropSelf(ModBlocks.DISTANT_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get());
        this.add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DISTANT_STONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.DISTANT_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get());
        this.add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get());
        // Limestone Set
        this.dropSelf(ModBlocks.LIMESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.add(ModBlocks.LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.LIMESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
        this.add(ModBlocks.POLISHED_LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.LIMESTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIMESTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.LIMESTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_PILLAR.get());
        this.dropSelf(ModBlocks.LIMESTONE_POWDER.get());
        this.dropSelf(ModBlocks.CRACKED_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get());
    }

    @Override
    @Nonnull
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
