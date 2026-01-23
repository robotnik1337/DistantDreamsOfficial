package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TexturedModel;
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

        // Wood, Logs, and Stripped Variants
        woodProvider(ModBlocks.CHARRED_LOG.get()).logWithHorizontal(ModBlocks.CHARRED_LOG.get()).wood(ModBlocks.CHARRED_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_CHARRED_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_CHARRED_LOG.get()).wood(ModBlocks.STRIPPED_CHARRED_WOOD.get());
        woodProvider(ModBlocks.EUCALYPTUS_LOG.get()).logWithHorizontal(ModBlocks.EUCALYPTUS_LOG.get()).wood(ModBlocks.EUCALYPTUS_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()).wood(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        woodProvider(ModBlocks.SEQUOIA_LOG.get()).logWithHorizontal(ModBlocks.SEQUOIA_LOG.get()).wood(ModBlocks.SEQUOIA_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_SEQUOIA_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_SEQUOIA_LOG.get()).wood(ModBlocks.STRIPPED_SEQUOIA_WOOD.get());


        // Charred Woodset
        family(ModBlocks.CHARRED_PLANKS.get())
                .fence(ModBlocks.CHARRED_FENCE.get())
                .fenceGate(ModBlocks.CHARRED_FENCE_GATE.get())
                .stairs(ModBlocks.CHARRED_STAIRS.get())
                .slab(ModBlocks.CHARRED_SLAB.get())
                .button(ModBlocks.CHARRED_BUTTON.get())
                .pressurePlate(ModBlocks.CHARRED_PRESSURE_PLATE.get());
        createDoor(ModBlocks.CHARRED_DOOR.get());
        createTrapdoor(ModBlocks.CHARRED_TRAPDOOR.get());
        createCraftingTableLike(ModBlocks.CHARRED_CRAFTING_TABLE.get(), ModBlocks.CHARRED_PLANKS.get(), TextureMapping::craftingTable);

        // Eucalyptus Woodset
        family(ModBlocks.EUCALYPTUS_PLANKS.get())
                .fence(ModBlocks.EUCALYPTUS_FENCE.get())
                .fenceGate(ModBlocks.EUCALYPTUS_FENCE_GATE.get())
                .stairs(ModBlocks.EUCALYPTUS_STAIRS.get())
                .slab(ModBlocks.EUCALYPTUS_SLAB.get())
                .button(ModBlocks.EUCALYPTUS_BUTTON.get())
                .pressurePlate(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        createDoor(ModBlocks.EUCALYPTUS_DOOR.get());
        createTrapdoor(ModBlocks.EUCALYPTUS_TRAPDOOR.get());

        // Sequoia Woodset
        family(ModBlocks.SEQUOIA_PLANKS.get())
                .fence(ModBlocks.SEQUOIA_FENCE.get())
                .fenceGate(ModBlocks.SEQUOIA_FENCE_GATE.get())
                .stairs(ModBlocks.SEQUOIA_STAIRS.get())
                .slab(ModBlocks.SEQUOIA_SLAB.get())
                .button(ModBlocks.SEQUOIA_BUTTON.get())
                .pressurePlate(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());
        createDoor(ModBlocks.SEQUOIA_DOOR.get());
        createTrapdoor(ModBlocks.SEQUOIA_TRAPDOOR.get());


        // Standard Blocks
        createTrivialCube(ModBlocks.DISTANT_STONE.get());
        createTrivialCube(ModBlocks.POLISHED_DISTANT_STONE.get());
        createTrivialCube(ModBlocks.DISTANT_STONE_BRICKS.get());
        createTrivialCube(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get());
        createTrivialCube(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());
        createTrivialCube(ModBlocks.LIMESTONE.get());
        createTrivialCube(ModBlocks.POLISHED_LIMESTONE.get());
        createTrivialCube(ModBlocks.LIMESTONE_BRICKS.get());
        createTrivialCube(ModBlocks.LIMESTONE_POWDER.get());
        createTrivialCube(ModBlocks.CRACKED_LIMESTONE_BRICKS.get());
        createTrivialCube(ModBlocks.MOSSY_LIMESTONE_BRICKS.get());


        // Pillar Blocks
//        createRotatedPillarWithHorizontalVariant(ModBlocks.LIMESTONE_PILLAR.get());

        /* TODO: complete the block model generator for the rest of the blocks. should be provided in the
            ModBlockStateProvider.java file below */

    }
}
