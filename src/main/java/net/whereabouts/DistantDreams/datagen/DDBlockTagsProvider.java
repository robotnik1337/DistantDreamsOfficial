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
                .add(DDBlocks.SEQUOIA_WOOD.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_WOOD.get());


        // *** VANILLA BLOCK TAGS ***
        tag(BlockTags.PLANKS)
                .add(DDBlocks.ANCIENT_OAK_PLANKS.get())
                .add(DDBlocks.SEQUOIA_PLANKS.get());

        tag(BlockTags.LOGS_THAT_BURN)
                .add(DDBlocks.SEQUOIA_LOG.get())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get());

        tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(DDBlocks.SEQUOIA_LOG.get());

        tag(BlockTags.WOODEN_STAIRS)
//                .add(DDBlocks.ANCIENT_OAK_STAIRS.get())
//                .add(DDBlocks.EUCALYPTUS_STAIRS.get())
                .add(DDBlocks.SEQUOIA_STAIRS.get());

        tag(BlockTags.WOODEN_SLABS)
//                .add(DDBlocks.ANCIENT_OAK_SLAB.get())
//                .add(DDBlocks.EUCALYPTUS_SLAB.get())
                .add(DDBlocks.SEQUOIA_SLAB.get());

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
//                .add(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get())
//                .add(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get())
                .add(DDBlocks.SEQUOIA_PRESSURE_PLATE.get());

        tag(BlockTags.WOODEN_BUTTONS)
//                .add(DDBlocks.ANCIENT_OAK_BUTTON.get())
//                .add(DDBlocks.EUCALYPTUS_BUTTON.get())
                .add(DDBlocks.SEQUOIA_BUTTON.get());

        tag(BlockTags.WOODEN_FENCES)
//                .add(DDBlocks.ANCIENT_OAK_FENCE.get())
//                .add(DDBlocks.EUCALYPTUS_FENCE.get())
                .add(DDBlocks.SEQUOIA_FENCE.get());

        tag(BlockTags.FENCE_GATES)
//                .add(DDBlocks.ANCIENT_OAK_FENCE_GATE.get())
//                .add(DDBlocks.EUCALYPTUS_FENCE_GATE.get())
                .add(DDBlocks.SEQUOIA_FENCE_GATE.get());

        tag(BlockTags.WOODEN_DOORS)
//                .add(DDBlocks.ANCIENT_OAK_DOOR.get())
//                .add(DDBlocks.EUCALYPTUS_DOOR.get())
                .add(DDBlocks.SEQUOIA_DOOR.get());

        tag(BlockTags.WOODEN_TRAPDOORS)
//                .add(DDBlocks.ANCIENT_OAK_TRAPDOOR.get())
//                .add(DDBlocks.EUCALYPTUS_TRAPDOOR.get())
                .add(DDBlocks.SEQUOIA_TRAPDOOR.get());

        tag(BlockTags.LEAVES)
                .add(DDBlocks.SEQUOIA_LEAVES.get());
    }
}
