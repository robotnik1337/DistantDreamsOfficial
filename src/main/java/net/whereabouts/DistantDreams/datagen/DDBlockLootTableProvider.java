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

        add(DDBlocks.FERTILE_SOIL.get(),
                block -> createSingleItemTableWithSilkTouch(block, Blocks.DIRT));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return DDBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
