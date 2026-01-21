package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput pOutput) {
        super(pOutput);
    }

    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        // ********** BLOCK MODEL GENERATORS ********** //


        // Woods

    }

    @Override
    protected Stream<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> DistantDreams.MODID.equals(BuiltInRegistries.BLOCK.getKey(block).getNamespace()));
    }

    @Override
    protected Stream<Item> getKnownItems() {
        return BuiltInRegistries.ITEM.stream()
                .filter(item -> DistantDreams.MODID.equals(BuiltInRegistries.ITEM.getKey(item).getNamespace()));
    }

    @Override
    protected BlockModelGenerators getBlockModelGenerators(BlockStateGeneratorCollector blocks, ItemInfoCollector items, SimpleModelCollector models) {
        // Return your custom Block Generator
        return new ModBlockStateGenerator(blocks, items, models);
    }

    @Override
    protected ItemModelGenerators getItemModelGenerators(ItemInfoCollector items, SimpleModelCollector models) {
        // Return your custom Item Generator
        return new ModItemModelGenerator(items, models);
    }
}

