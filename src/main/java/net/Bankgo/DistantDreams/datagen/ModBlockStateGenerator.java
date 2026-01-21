package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ModBlockStateGenerator extends BlockModelGenerators {
    public ModBlockStateGenerator(Consumer<BlockModelDefinitionGenerator> blocks,
                                  ModelProvider.ItemInfoCollector items,
                                  BiConsumer<ResourceLocation, ModelInstance> models) {
        super(blocks, items, models);
    }

    @Override
    public void run() {
        // TODO: copy EVERYTHING over from the ModBlockStateProvider.java files

        // Wood, Logs, and Stripped Variants
        woodProvider(ModBlocks.CHARRED_LOG.get()).logWithHorizontal(ModBlocks.CHARRED_LOG.get()).wood(ModBlocks.CHARRED_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_CHARRED_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_CHARRED_LOG.get()).wood(ModBlocks.STRIPPED_CHARRED_WOOD.get());
        woodProvider(ModBlocks.EUCALYPTUS_LOG.get()).logWithHorizontal(ModBlocks.EUCALYPTUS_LOG.get()).wood(ModBlocks.EUCALYPTUS_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()).wood(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        woodProvider(ModBlocks.SEQUOIA_LOG.get()).logWithHorizontal(ModBlocks.SEQUOIA_LOG.get()).wood(ModBlocks.SEQUOIA_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_SEQUOIA_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_SEQUOIA_LOG.get()).wood(ModBlocks.STRIPPED_SEQUOIA_WOOD.get());


        // Charred Woodset
        createTrivialCube(ModBlocks.CHARRED_PLANKS.get());
        createTrapdoor(ModBlocks.CHARRED_TRAPDOOR.get());
        family(ModBlocks.CHARRED_LOG.get())
                .fence(ModBlocks.CHARRED_FENCE.get())
                .fenceGate(ModBlocks.CHARRED_FENCE_GATE.get())
                .stairs(ModBlocks.CHARRED_STAIRS.get())
                .slab(ModBlocks.CHARRED_SLAB.get())
                .button(ModBlocks.CHARRED_BUTTON.get())
                .pressurePlate(ModBlocks.CHARRED_PRESSURE_PLATE.get());
    }
}
