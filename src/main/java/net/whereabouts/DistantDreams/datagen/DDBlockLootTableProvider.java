package net.whereabouts.DistantDreams.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.whereabouts.DistantDreams.block.DDBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class DDBlockLootTableProvider extends BlockLootSubProvider {

    public DDBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(DDBlocks.ANCIENT_OAK_PLANKS.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return DDBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
