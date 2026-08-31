package net.whereabouts.DistantDreams.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.tags.DDTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DDItemTagsProvider extends ItemTagsProvider {
    public DDItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, DistantDreams.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // *** MODDED ITEM TAGS ***
        tag(DDTags.Items.SEQUOIA_LOGS)
                .add(DDBlocks.SEQUOIA_LOG.get().asItem())
                .add(DDBlocks.SEQUOIA_WOOD.get().asItem())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get().asItem())
                .add(DDBlocks.STRIPPED_SEQUOIA_WOOD.get().asItem());


        // *** VANILLA ITEM TAGS ***
        tag(ItemTags.PLANKS)
                .add(DDBlocks.ANCIENT_OAK_PLANKS.get().asItem());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(DDBlocks.SEQUOIA_LOG.get().asItem())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get().asItem());
    }
}
