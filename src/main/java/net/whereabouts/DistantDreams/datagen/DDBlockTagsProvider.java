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
        tag(DDTags.Blocks.SEQUOIA_LOGS)
                .add(DDBlocks.SEQUOIA_LOG.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get());


        // *** VANILLA BLOCK TAGS ***
        tag(BlockTags.PLANKS)
                .add(DDBlocks.ANCIENT_OAK_PLANKS.get());

        tag(BlockTags.LOGS_THAT_BURN)
                .add(DDBlocks.SEQUOIA_LOG.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get());

        tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(DDBlocks.SEQUOIA_LOG.get());
    }
}
