package net.whereabouts.DistantDreams.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.item.DDItems;
import org.jspecify.annotations.NonNull;

public class DDModelProvider extends ModelProvider {
    public DDModelProvider(PackOutput output) {
        super(output, DistantDreams.MOD_ID);
    }

    @Override
    protected void registerModels(@NonNull BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // *** BLOCKS ***

        // Ancient Oak
        blockModels.createTrivialCube(DDBlocks.ANCIENT_OAK_PLANKS.get());

        // Sequoia
        blockModels.woodProvider(DDBlocks.SEQUOIA_LOG.get()).logWithHorizontal(DDBlocks.SEQUOIA_LOG.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_SEQUOIA_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_SEQUOIA_LOG.get());



        // *** ITEMS ***
        itemModels.generateFlatItem(DDItems.MUSIC_DISC_HYPNAGOGIA.get(), ModelTemplates.FLAT_ITEM);
    }
}
