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
        // *** MODDED BLOCK TAGS ***
        tag(DDTags.Items.EUCALYPTUS_LOGS)
                .add(DDBlocks.EUCALYPTUS_LOG.get().asItem())
                .add(DDBlocks.EUCALYPTUS_WOOD.get().asItem())
                .add(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get().asItem())
                .add(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get().asItem());

        tag(DDTags.Items.SEQUOIA_LOGS)
                .add(DDBlocks.SEQUOIA_LOG.get().asItem())
                .add(DDBlocks.SEQUOIA_WOOD.get().asItem())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get().asItem())
                .add(DDBlocks.STRIPPED_SEQUOIA_WOOD.get().asItem());


        // *** VANILLA BLOCK TAGS ***
        tag(ItemTags.PLANKS)
                .add(DDBlocks.ANCIENT_OAK_PLANKS.get().asItem())
                .add(DDBlocks.EUCALYPTUS_PLANKS.get().asItem())
                .add(DDBlocks.SEQUOIA_PLANKS.get().asItem());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(DDBlocks.EUCALYPTUS_LOG.get().asItem())
                .add(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get().asItem())
                .add(DDBlocks.SEQUOIA_LOG.get().asItem())
                .add(DDBlocks.STRIPPED_SEQUOIA_LOG.get().asItem());

        tag(ItemTags.WOODEN_STAIRS)
//                .add(DDBlocks.ANCIENT_OAK_STAIRS.get().asItem())
                .add(DDBlocks.EUCALYPTUS_STAIRS.get().asItem())
                .add(DDBlocks.SEQUOIA_STAIRS.get().asItem());

        tag(ItemTags.WOODEN_SLABS)
//                .add(DDBlocks.ANCIENT_OAK_SLAB.get().asItem())
                .add(DDBlocks.EUCALYPTUS_SLAB.get().asItem())
                .add(DDBlocks.SEQUOIA_SLAB.get().asItem());

        tag(ItemTags.WOODEN_PRESSURE_PLATES)
//                .add(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get().asItem())
                .add(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get().asItem())
                .add(DDBlocks.SEQUOIA_PRESSURE_PLATE.get().asItem());

        tag(ItemTags.WOODEN_BUTTONS)
//                .add(DDBlocks.ANCIENT_OAK_BUTTON.get().asItem())
                .add(DDBlocks.EUCALYPTUS_BUTTON.get().asItem())
                .add(DDBlocks.SEQUOIA_BUTTON.get().asItem());

        tag(ItemTags.WOODEN_FENCES)
//                .add(DDBlocks.ANCIENT_OAK_FENCE.get().asItem())
                .add(DDBlocks.EUCALYPTUS_FENCE.get().asItem())
                .add(DDBlocks.SEQUOIA_FENCE.get().asItem());

        tag(ItemTags.FENCE_GATES)
//                .add(DDBlocks.ANCIENT_OAK_FENCE_GATE.get().asItem())
                .add(DDBlocks.EUCALYPTUS_FENCE_GATE.get().asItem())
                .add(DDBlocks.SEQUOIA_FENCE_GATE.get().asItem());

        tag(ItemTags.WOODEN_DOORS)
//                .add(DDBlocks.ANCIENT_OAK_DOOR.get().asItem())
                .add(DDBlocks.EUCALYPTUS_DOOR.get().asItem())
                .add(DDBlocks.SEQUOIA_DOOR.get().asItem());

        tag(ItemTags.WOODEN_TRAPDOORS)
//                .add(DDBlocks.ANCIENT_OAK_TRAPDOOR.get().asItem())
                .add(DDBlocks.EUCALYPTUS_TRAPDOOR.get().asItem())
                .add(DDBlocks.SEQUOIA_TRAPDOOR.get().asItem());

        tag(ItemTags.LEAVES)
                .add(DDBlocks.EUCALYPTUS_LEAVES.get().asItem())
                .add(DDBlocks.SEQUOIA_LEAVES.get().asItem());
    }
}
