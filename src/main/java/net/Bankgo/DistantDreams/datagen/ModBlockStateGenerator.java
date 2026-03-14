package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
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
import net.minecraftforge.fml.common.Mod;

import java.util.Optional;
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

        // Ancient Oak Woodset
        woodProvider(ModBlocks.ANCIENT_OAK_LOG.get()).logWithHorizontal(ModBlocks.ANCIENT_OAK_LOG.get()).wood(ModBlocks.ANCIENT_OAK_WOOD.get());
        woodProvider(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get()).wood(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get());
        createTrivialBlock(ModBlocks.ANCIENT_OAK_LEAVES.get(), TexturedModel.LEAVES);
        createCutoutSaplingWithItem(ModBlocks.ANCIENT_OAK_SAPLING.get(), ModBlocks.POTTED_ANCIENT_OAK_SAPLING.get());

        family(ModBlocks.ANCIENT_OAK_PLANKS.get())
                .fence(ModBlocks.ANCIENT_OAK_FENCE.get())
                .fenceGate(ModBlocks.ANCIENT_OAK_FENCE_GATE.get())
                .stairs(ModBlocks.ANCIENT_OAK_STAIRS.get())
                .slab(ModBlocks.ANCIENT_OAK_SLAB.get())
                .button(ModBlocks.ANCIENT_OAK_BUTTON.get())
                .pressurePlate(ModBlocks.ANCIENT_OAK_PRESSURE_PLATE.get());
        createDoor(ModBlocks.ANCIENT_OAK_DOOR.get());
        createTrapdoor(ModBlocks.ANCIENT_OAK_TRAPDOOR.get());


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
        createTrivialBlock(ModBlocks.EUCALYPTUS_LEAVES.get(), TexturedModel.LEAVES);
        createCutoutSaplingWithItem(ModBlocks.EUCALYPTUS_SAPLING.get(), ModBlocks.POTTED_EUCALYPTUS_SAPLING.get());

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
        createTrivialBlock(ModBlocks.SEQUOIA_LEAVES.get(), TexturedModel.LEAVES);
        createCutoutSaplingWithItem(ModBlocks.SEQUOIA_SAPLING.get(), ModBlocks.POTTED_SEQUOIA_SAPLING.get());

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

        family(ModBlocks.DISTANT_COBBLESTONE.get())
                .wall(ModBlocks.DISTANT_COBBLESTONE_WALL.get())
                .stairs(ModBlocks.DISTANT_COBBLESTONE_STAIRS.get())
                .slab(ModBlocks.DISTANT_COBBLESTONE_SLAB.get());

        family(ModBlocks.MOSSY_DISTANT_COBBLESTONE.get())
                .wall(ModBlocks.MOSSY_DISTANT_COBBLESTONE_WALL.get())
                .stairs(ModBlocks.MOSSY_DISTANT_COBBLESTONE_STAIRS.get())
                .slab(ModBlocks.MOSSY_DISTANT_COBBLESTONE_SLAB.get());

        createTrivialCube(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get());


        // Soil & Farmland
        TextureMapping fertileSoilTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.FERTILE_SOIL.get(), "_bottom"))
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.FERTILE_SOIL.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_SOIL.get(), "_side"));
        Variant plainFertileSoilVariant = plainModel(ModelTemplates.CUBE_BOTTOM_TOP.create(ModBlocks.FERTILE_SOIL.get(), fertileSoilTextureMapping, modelOutput));
        blockStateOutput.accept(MultiVariantGenerator.dispatch(ModBlocks.FERTILE_SOIL.get(), createRotatedVariants(plainFertileSoilVariant)));


        ModelTemplate CUSTOM_FARMLAND = new ModelTemplate(
                Optional.of(ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, "block/template_custom_farmland")),
                Optional.empty(),
                TextureSlot.TOP,
                TextureSlot.SIDE,
                TextureSlot.BOTTOM
        );
        TextureMapping fertilePlotTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_bottom"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_side"))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top"));
        TextureMapping moistFertilePlotTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_bottom"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top_moist"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_side"))
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top"));
        MultiVariant dryFertilePlotVariant = plainVariant(CUSTOM_FARMLAND.create(ModBlocks.FERTILE_PLOT.get(), fertilePlotTextureMapping, modelOutput));
        MultiVariant moistFertilePlotVariant = plainVariant(CUSTOM_FARMLAND.create(TextureMapping.getBlockTexture(ModBlocks.FERTILE_PLOT.get(), "_top_moist"), moistFertilePlotTextureMapping, modelOutput));
        blockStateOutput.accept(MultiVariantGenerator.dispatch(ModBlocks.FERTILE_PLOT.get()).with(createEmptyOrFullDispatch(BlockStateProperties.MOISTURE, 7, moistFertilePlotVariant, dryFertilePlotVariant)));

        //Xeric Shrublands
        createDoublePlantWithDefaultItem(ModBlocks.WRYE_GRASS.get(), PlantType.NOT_TINTED);
        createDoublePlantWithDefaultItem(ModBlocks.TALL_WRYE_GRASS.get(), PlantType.NOT_TINTED);
        createTrivialCube(ModBlocks.XERIC_MOSS.get());


        // TODO: get rid of sapling items without getting "Missing item model definition" error

        // ########## BLOCK ITEMS ########## //
        registerBlockItem(ModBlocks.ANCIENT_OAK_PLANKS.get());
        registerBlockItem(ModBlocks.ANCIENT_OAK_PRESSURE_PLATE.get());
        registerBlockItem(ModBlocks.ANCIENT_OAK_FENCE_GATE.get());
        registerBlockItem(ModBlocks.ANCIENT_OAK_LEAVES.get());
        registerBlockItem(ModBlocks.POTTED_ANCIENT_OAK_SAPLING.get());

        registerBlockItem(ModBlocks.CHARRED_PLANKS.get());
        registerBlockItem(ModBlocks.CHARRED_CRAFTING_TABLE.get());
        registerBlockItem(ModBlocks.CHARRED_PRESSURE_PLATE.get());
        registerBlockItem(ModBlocks.CHARRED_FENCE_GATE.get());

        registerBlockItem(ModBlocks.EUCALYPTUS_PLANKS.get());
        registerBlockItem(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        registerBlockItem(ModBlocks.EUCALYPTUS_FENCE_GATE.get());
        registerBlockItem(ModBlocks.EUCALYPTUS_LEAVES.get());
        registerBlockItem(ModBlocks.POTTED_EUCALYPTUS_SAPLING.get());

        registerBlockItem(ModBlocks.SEQUOIA_PLANKS.get());
        registerBlockItem(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());
        registerBlockItem(ModBlocks.SEQUOIA_FENCE_GATE.get());
        registerBlockItem(ModBlocks.SEQUOIA_LEAVES.get());
        registerBlockItem(ModBlocks.POTTED_SEQUOIA_SAPLING.get());

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
        registerBlockItem(ModBlocks.DISTANT_COBBLESTONE.get());
        registerBlockItem(ModBlocks.MOSSY_DISTANT_COBBLESTONE.get());

        registerBlockItem(ModBlocks.FERTILE_SOIL.get());
        registerBlockItem(ModBlocks.FERTILE_PLOT.get());

        registerBlockItem(ModBlocks.XERIC_MOSS.get());
    }

    private void registerBlockItem(Block block) {
        registerSimpleItemModel(block, ModelLocationUtils.getModelLocation(block));
    }

    private void createCutoutSaplingWithItem(Block saplingBlock, Block pottedBlock) {
        TextureMapping saplingTextures = PlantType.NOT_TINTED.getTextureMapping(saplingBlock);
        MultiVariant cutoutSaplingVariant = plainVariant(PlantType.NOT_TINTED.getCross().create(saplingBlock, saplingTextures, (name, model) -> {
            var json = model.get().getAsJsonObject();
            json.addProperty("render_type", "minecraft:cutout");
            json.addProperty("render_type_fast", "minecraft:solid");
            this.modelOutput.accept(name, () -> json);
        }));
        MultiVariant cutoutPottedSaplingVariant = plainVariant(ModelTemplates.FLOWER_POT_CROSS.create(pottedBlock, TextureMapping.plant(saplingBlock), (name, model) -> {
            var json = model.get().getAsJsonObject();
            json.addProperty("render_type", "minecraft:cutout");
            json.addProperty("render_type_fast", "minecraft:solid");
            this.modelOutput.accept(name, () -> json);
        }));

        this.blockStateOutput.accept(createSimpleBlock(saplingBlock, cutoutSaplingVariant));
        this.blockStateOutput.accept(createSimpleBlock(pottedBlock, cutoutPottedSaplingVariant));
        this.registerSimpleItemModel(saplingBlock.asItem(), PlantType.NOT_TINTED.createItemModel(this, saplingBlock));
    }
}
