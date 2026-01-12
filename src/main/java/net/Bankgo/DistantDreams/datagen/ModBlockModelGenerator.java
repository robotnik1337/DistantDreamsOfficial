package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ModBlockModelGenerator extends BlockModelGenerators {
//    private final TextureSlot SLOT = TextureSlot.create("material");
//    ModelTemplate

    public ModBlockModelGenerator(Consumer<BlockModelDefinitionGenerator> pBlockStateOutput, ItemModelOutput pItemModelOutput, BiConsumer<ResourceLocation, ModelInstance> pModelOutput) {
        super(pBlockStateOutput, pItemModelOutput, pModelOutput);
    }

    @Override
    public void run() {
        for (RegistryObject<Block> entry : ModBlocks.BLOCKS.getEntries()) {
            this.createTrivialCube(entry.get());
        }
        ModBlocks.BLOCKS.getEntries().forEach((block) ->
                blockStateOutput.accept(block.get(), TextureMapping.singleSlot()));
        ModBlocks.BLOCK_ITEMS.getEntries().forEach((item) ->
                itemModelOutput.accept(item.get(), ItemModelUtils.plainModel(ModelLocationUtils.getModelLocation(((BlockItem) item.get()).getBlock()))));


    }
}