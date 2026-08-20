package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.item.ModItems;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;

public class ModItemModelGenerator extends ItemModelGenerators {
    public ModItemModelGenerator(ModelProvider.ItemInfoCollector items,
                                 BiConsumer<ResourceLocation, ModelInstance> models) {
        super(items, models);
    }

    @Override
    public void run() {
        generateFlatItem(ModItems.MUSIC_DISC_HYPNAGOGIA.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.COPPER_BEETROOT_1.get(), ModelTemplates.FLAT_ITEM);
        generateFlatItem(ModItems.BROTH_OF_STYX.get(), ModelTemplates.FLAT_ITEM);
    }
}
