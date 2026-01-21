package net.Bankgo.DistantDreams.datagen;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;

public class ModItemModelGenerator extends ItemModelGenerators {
    public ModItemModelGenerator(ModelProvider.ItemInfoCollector items,
                                 BiConsumer<ResourceLocation, ModelInstance> models) {
        super(items, models);
    }

    @Override
    public void run() {
        // TODO: copy EVERYTHING over from the ModItemModelProvider.java file

    }
}
