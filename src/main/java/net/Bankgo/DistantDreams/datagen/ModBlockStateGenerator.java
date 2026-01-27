package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

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

        // Charred Woodset
        woodProvider(ModBlocks.CHARRED_LOG.get()).logWithHorizontal(ModBlocks.CHARRED_LOG.get()).wood(ModBlocks.CHARRED_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_CHARRED_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_CHARRED_LOG.get()).wood(ModBlocks.STRIPPED_CHARRED_WOOD.get());

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
        woodProvider(ModBlocks.EUCALYPTUS_LOG.get()).logWithHorizontal(ModBlocks.EUCALYPTUS_LOG.get()).wood(ModBlocks.EUCALYPTUS_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()).wood(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        createTintedLeaves(ModBlocks.EUCALYPTUS_LEAVES.get(), TexturedModel.LEAVES, 0);
        createCrossBlock(ModBlocks.EUCALYPTUS_SAPLING.get(), PlantType.NOT_TINTED);

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
        woodProvider(ModBlocks.SEQUOIA_LOG.get()).logWithHorizontal(ModBlocks.SEQUOIA_LOG.get()).wood(ModBlocks.SEQUOIA_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_SEQUOIA_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_SEQUOIA_LOG.get()).wood(ModBlocks.STRIPPED_SEQUOIA_WOOD.get());
        createTintedLeaves(ModBlocks.SEQUOIA_LEAVES.get(), TexturedModel.LEAVES, 0);
        createCrossBlock(ModBlocks.SEQUOIA_SAPLING.get(), PlantType.NOT_TINTED);

        family(ModBlocks.SEQUOIA_PLANKS.get())
                .fence(ModBlocks.SEQUOIA_FENCE.get())
                .fenceGate(ModBlocks.SEQUOIA_FENCE_GATE.get())
                .stairs(ModBlocks.SEQUOIA_STAIRS.get())
                .slab(ModBlocks.SEQUOIA_SLAB.get())
                .button(ModBlocks.SEQUOIA_BUTTON.get())
                .pressurePlate(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());
        createDoor(ModBlocks.SEQUOIA_DOOR.get());
        createTrapdoor(ModBlocks.SEQUOIA_TRAPDOOR.get());


        // Limestone
        family(ModBlocks.LIMESTONE.get())
                .wall(ModBlocks.LIMESTONE_WALL.get())
                .stairs(ModBlocks.LIMESTONE_STAIRS.get())
                .slab(ModBlocks.LIMESTONE_SLAB.get())
                .button(ModBlocks.LIMESTONE_BUTTON.get())
                .pressurePlate(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());

        family(ModBlocks.LIMESTONE_BRICKS.get())
                .wall(ModBlocks.LIMESTONE_BRICK_WALL.get())
                .stairs(ModBlocks.LIMESTONE_BRICK_STAIRS.get())
                .slab(ModBlocks.LIMESTONE_BRICK_SLAB.get());

        family(ModBlocks.MOSSY_LIMESTONE_BRICKS.get())
                .wall(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get())
                .stairs(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get())
                .slab(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get());

        family(ModBlocks.POLISHED_LIMESTONE.get())
                .wall(ModBlocks.POLISHED_LIMESTONE_WALL.get())
                .stairs(ModBlocks.POLISHED_LIMESTONE_STAIRS.get())
                .slab(ModBlocks.POLISHED_LIMESTONE_SLAB.get());

        createTrivialCube(ModBlocks.LIMESTONE_POWDER.get());
        createTrivialCube(ModBlocks.CRACKED_LIMESTONE_BRICKS.get());
        createRotatedPillarWithHorizontalVariant(ModBlocks.LIMESTONE_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);


        // Distant Stone
        family(ModBlocks.DISTANT_STONE.get())
                .wall(ModBlocks.DISTANT_STONE_WALL.get())
                .stairs(ModBlocks.DISTANT_STONE_STAIRS.get())
                .slab(ModBlocks.DISTANT_STONE_SLAB.get())
                .button(ModBlocks.DISTANT_STONE_BUTTON.get())
                .pressurePlate(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get());

        family(ModBlocks.DISTANT_STONE_BRICKS.get())
                .wall(ModBlocks.DISTANT_STONE_BRICK_WALL.get())
                .stairs(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get())
                .slab(ModBlocks.DISTANT_STONE_BRICK_SLAB.get());

        family(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get())
                .wall(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get())
                .stairs(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get())
                .slab(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get());

        family(ModBlocks.POLISHED_DISTANT_STONE.get())
                .wall(ModBlocks.POLISHED_DISTANT_STONE_WALL.get())
                .stairs(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get())
                .slab(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get());

        createTrivialCube(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get());


        // Soil & Farmland
        TextureMapping fertileSoilTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.FERTILE_SOIL.get(), "_bottom"))
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.FERTILE_SOIL.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_SOIL.get(), "_side"));
        Variant plainFertileSoilVariant = plainModel(ModelTemplates.CUBE_BOTTOM_TOP.create(ModBlocks.FERTILE_SOIL.get(), fertileSoilTextureMapping, modelOutput));
        blockStateOutput.accept(MultiVariantGenerator.dispatch(ModBlocks.FERTILE_SOIL.get(), createRotatedVariants(plainFertileSoilVariant)));

        TextureMapping fertilePlotTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_bottom"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_side"));
        TextureMapping moistFertilePlotTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_bottom"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top_moist"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_side"));
        MultiVariant dryFertilePlotVariant = plainVariant(ModelTemplates.CUBE_BOTTOM_TOP
                .create(TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top"), fertilePlotTextureMapping, modelOutput));
        MultiVariant moistFertilePlotVariant = plainVariant(ModelTemplates.CUBE_BOTTOM_TOP
                .create(TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top_moist"), moistFertilePlotTextureMapping, modelOutput));
        blockStateOutput.accept(MultiVariantGenerator.dispatch(ModBlocks.FERTILE_PLOT.get()).with(createEmptyOrFullDispatch(BlockStateProperties.MOISTURE, 7, dryFertilePlotVariant, moistFertilePlotVariant)));



        // ########## BLOCK ITEMS ##########

        registerBlockItem(ModBlocks.CHARRED_PLANKS.get());
        registerBlockItem(ModBlocks.CHARRED_CRAFTING_TABLE.get());
        registerBlockItem(ModBlocks.CHARRED_PRESSURE_PLATE.get());
        registerBlockItem(ModBlocks.CHARRED_FENCE_GATE.get());

        registerBlockItem(ModBlocks.EUCALYPTUS_PLANKS.get());
        registerSimpleFlatItemModel(ModBlocks.EUCALYPTUS_SAPLING.get().asItem());
        registerBlockItem(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        registerBlockItem(ModBlocks.EUCALYPTUS_FENCE_GATE.get());

        registerBlockItem(ModBlocks.SEQUOIA_PLANKS.get());
        registerSimpleFlatItemModel(ModBlocks.SEQUOIA_SAPLING.get().asItem());
        registerBlockItem(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());
        registerBlockItem(ModBlocks.SEQUOIA_FENCE_GATE.get());

        registerBlockItem(ModBlocks.LIMESTONE.get());
        registerBlockItem(ModBlocks.LIMESTONE_BRICKS.get());
        registerBlockItem(ModBlocks.MOSSY_LIMESTONE_BRICKS.get());
        registerBlockItem(ModBlocks.POLISHED_LIMESTONE.get());
        registerBlockItem(ModBlocks.LIMESTONE_POWDER.get());
        registerBlockItem(ModBlocks.CRACKED_LIMESTONE_BRICKS.get());
        registerBlockItem(ModBlocks.LIMESTONE_PILLAR.get());
        registerBlockItem(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());

        registerBlockItem(ModBlocks.DISTANT_STONE.get());
        registerBlockItem(ModBlocks.DISTANT_STONE_BRICKS.get());
        registerBlockItem(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());
        registerBlockItem(ModBlocks.POLISHED_DISTANT_STONE.get());
        registerBlockItem(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get());
        registerBlockItem(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get());

        registerBlockItem(ModBlocks.FERTILE_SOIL.get());
        registerBlockItem(ModBlocks.FERTILE_PLOT.get());
    }

    private void registerBlockItem(Block block) {
        registerSimpleItemModel(block, ModelLocationUtils.getModelLocation(block));
    }
}
