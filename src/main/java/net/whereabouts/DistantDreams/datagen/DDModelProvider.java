package net.whereabouts.DistantDreams.datagen;

import net.minecraft.client.color.item.GrassColorSource;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.dispatch.Variant;
import net.minecraft.client.renderer.item.CuboidItemModelWrapper;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplateBuilder;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.item.DDItems;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.Optional;

public class DDModelProvider extends ModelProvider {
    public DDModelProvider(PackOutput output) {
        super(output, DistantDreams.MOD_ID);
    }

    public static final TextureSlot OVERLAY = TextureSlot.create("overlay");
    public static final ModelTemplate TINTED_GRASS_BLOCK = ExtendedModelTemplateBuilder.builder()
            .parent(Identifier.withDefaultNamespace("block/block"))
//            .requiredTextureSlot(TextureSlot.PARTICLE)
            .requiredTextureSlot(TextureSlot.BOTTOM)
            .requiredTextureSlot(TextureSlot.TOP)
            .requiredTextureSlot(TextureSlot.SIDE)
            .requiredTextureSlot(OVERLAY)

            // dirt bottom, grass top (tinted), dirt-with-grass-edge sides
            .element(e -> e.from(0, 0, 0).to(16, 16, 16)
                    .face(Direction.DOWN, f -> f.texture(TextureSlot.BOTTOM).cullface(Direction.DOWN))
                    .face(Direction.UP,    f -> f.texture(TextureSlot.TOP).cullface(Direction.UP).tintindex(0))
                    .face(Direction.NORTH, f -> f.texture(TextureSlot.SIDE).cullface(Direction.NORTH))
                    .face(Direction.SOUTH, f -> f.texture(TextureSlot.SIDE).cullface(Direction.SOUTH))
                    .face(Direction.WEST,  f -> f.texture(TextureSlot.SIDE).cullface(Direction.WEST))
                    .face(Direction.EAST,  f -> f.texture(TextureSlot.SIDE).cullface(Direction.EAST)))

            // Overlay cube: the grayscale grass fringe on the sides (tinted)
            .element(e -> e.from(0, 0, 0).to(16, 16, 16)
                    .face(Direction.NORTH, f -> f.texture(OVERLAY).cullface(Direction.NORTH).tintindex(0))
                    .face(Direction.SOUTH, f -> f.texture(OVERLAY).cullface(Direction.SOUTH).tintindex(0))
                    .face(Direction.WEST,  f -> f.texture(OVERLAY).cullface(Direction.WEST).tintindex(0))
                    .face(Direction.EAST,  f -> f.texture(OVERLAY).cullface(Direction.EAST).tintindex(0)))
            .build();

    @Override
    protected void registerModels(@NonNull BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // *** BLOCKS ***

        // Ancient Oak
        blockModels.woodProvider(DDBlocks.ANCIENT_OAK_LOG.get()).logWithHorizontal(DDBlocks.ANCIENT_OAK_LOG.get()).wood(DDBlocks.ANCIENT_OAK_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get()).wood(DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get());
        blockModels.family(DDBlocks.ANCIENT_OAK_PLANKS.get())
                .fence(DDBlocks.ANCIENT_OAK_FENCE.get())
                .fenceGate(DDBlocks.ANCIENT_OAK_FENCE_GATE.get())
                .stairs(DDBlocks.ANCIENT_OAK_STAIRS.get())
                .slab(DDBlocks.ANCIENT_OAK_SLAB.get())
                .button(DDBlocks.ANCIENT_OAK_BUTTON.get())
                .pressurePlate(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.ANCIENT_OAK_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.ANCIENT_OAK_TRAPDOOR.get());
        blockModels.createTrivialBlock(DDBlocks.ANCIENT_OAK_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createPlantWithDefaultItem(DDBlocks.ANCIENT_OAK_SAPLING.get(), DDBlocks.POTTED_ANCIENT_OAK_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        // Charred
        blockModels.woodProvider(DDBlocks.CHARRED_LOG.get()).logWithHorizontal(DDBlocks.CHARRED_LOG.get()).wood(DDBlocks.CHARRED_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_CHARRED_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_CHARRED_LOG.get()).wood(DDBlocks.STRIPPED_CHARRED_WOOD.get());
        blockModels.family(DDBlocks.CHARRED_PLANKS.get())
                .fence(DDBlocks.CHARRED_FENCE.get())
                .fenceGate(DDBlocks.CHARRED_FENCE_GATE.get())
                .stairs(DDBlocks.CHARRED_STAIRS.get())
                .slab(DDBlocks.CHARRED_SLAB.get())
                .button(DDBlocks.CHARRED_BUTTON.get())
                .pressurePlate(DDBlocks.CHARRED_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.CHARRED_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.CHARRED_TRAPDOOR.get());

        // Eucalyptus
        blockModels.woodProvider(DDBlocks.EUCALYPTUS_LOG.get()).logWithHorizontal(DDBlocks.EUCALYPTUS_LOG.get()).wood(DDBlocks.EUCALYPTUS_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get()).wood(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        blockModels.family(DDBlocks.EUCALYPTUS_PLANKS.get())
                .fence(DDBlocks.EUCALYPTUS_FENCE.get())
                .fenceGate(DDBlocks.EUCALYPTUS_FENCE_GATE.get())
                .stairs(DDBlocks.EUCALYPTUS_STAIRS.get())
                .slab(DDBlocks.EUCALYPTUS_SLAB.get())
                .button(DDBlocks.EUCALYPTUS_BUTTON.get())
                .pressurePlate(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.EUCALYPTUS_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.EUCALYPTUS_TRAPDOOR.get());
        blockModels.createTrivialBlock(DDBlocks.EUCALYPTUS_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createPlantWithDefaultItem(DDBlocks.EUCALYPTUS_SAPLING.get(), DDBlocks.POTTED_EUCALYPTUS_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        // Sequoia
        blockModels.woodProvider(DDBlocks.SEQUOIA_LOG.get()).logWithHorizontal(DDBlocks.SEQUOIA_LOG.get()).wood(DDBlocks.SEQUOIA_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_SEQUOIA_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_SEQUOIA_LOG.get()).wood(DDBlocks.STRIPPED_SEQUOIA_WOOD.get());
        blockModels.family(DDBlocks.SEQUOIA_PLANKS.get())
                .fence(DDBlocks.SEQUOIA_FENCE.get())
                .fenceGate(DDBlocks.SEQUOIA_FENCE_GATE.get())
                .stairs(DDBlocks.SEQUOIA_STAIRS.get())
                .slab(DDBlocks.SEQUOIA_SLAB.get())
                .button(DDBlocks.SEQUOIA_BUTTON.get())
                .pressurePlate(DDBlocks.SEQUOIA_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.SEQUOIA_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.SEQUOIA_TRAPDOOR.get());
        blockModels.createTrivialBlock(DDBlocks.SEQUOIA_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createPlantWithDefaultItem(DDBlocks.SEQUOIA_SAPLING.get(), DDBlocks.POTTED_SEQUOIA_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        // Dendranthos
        blockModels.woodProvider(DDBlocks.DENDRANTHOS_LOG.get()).logWithHorizontal(DDBlocks.DENDRANTHOS_LOG.get()).wood(DDBlocks.DENDRANTHOS_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_DENDRANTHOS_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_DENDRANTHOS_LOG.get()).wood(DDBlocks.STRIPPED_DENDRANTHOS_WOOD.get());
        blockModels.family(DDBlocks.DENDRANTHOS_PLANKS.get())
                .fence(DDBlocks.DENDRANTHOS_FENCE.get())
                .fenceGate(DDBlocks.DENDRANTHOS_FENCE_GATE.get())
                .stairs(DDBlocks.DENDRANTHOS_STAIRS.get())
                .slab(DDBlocks.DENDRANTHOS_SLAB.get())
                .button(DDBlocks.DENDRANTHOS_BUTTON.get())
                .pressurePlate(DDBlocks.DENDRANTHOS_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.DENDRANTHOS_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.DENDRANTHOS_TRAPDOOR.get());
        blockModels.family(DDBlocks.DENDRANTHOS_ANTHER.get());
        blockModels.createTrivialBlock(DDBlocks.DENDRANTHOS_PETALS.get(), TexturedModel.LEAVES);

        // Dendrymycos
        blockModels.woodProvider(DDBlocks.DENDRYMYCOS_LOG.get()).logWithHorizontal(DDBlocks.DENDRYMYCOS_LOG.get()).wood(DDBlocks.DENDRYMYCOS_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_DENDRYMYCOS_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_DENDRYMYCOS_LOG.get()).wood(DDBlocks.STRIPPED_DENDRYMYCOS_WOOD.get());
        blockModels.family(DDBlocks.DENDRYMYCOS_PLANKS.get())
                .fence(DDBlocks.DENDRYMYCOS_FENCE.get())
                .fenceGate(DDBlocks.DENDRYMYCOS_FENCE_GATE.get())
                .stairs(DDBlocks.DENDRYMYCOS_STAIRS.get())
                .slab(DDBlocks.DENDRYMYCOS_SLAB.get())
                .button(DDBlocks.DENDRYMYCOS_BUTTON.get())
                .pressurePlate(DDBlocks.DENDRYMYCOS_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.DENDRYMYCOS_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.DENDRYMYCOS_TRAPDOOR.get());
        blockModels.createTrivialBlock(DDBlocks.DENDRYMYCOS_CAP_BLUE.get(), TexturedModel.LEAVES);
        blockModels.createTrivialBlock(DDBlocks.DENDRYMYCOS_CAP_GREEN.get(), TexturedModel.LEAVES);

        // Fertile
        TextureMapping fertileSoilTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(DDBlocks.FERTILE_SOIL.get(), "_bottom"))
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(DDBlocks.FERTILE_SOIL.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(DDBlocks.FERTILE_SOIL.get(), "_side"));
        Variant plainFertileSoilVariant = BlockModelGenerators.plainModel(ModelTemplates.CUBE_BOTTOM_TOP.create(DDBlocks.FERTILE_SOIL.get(), fertileSoilTextureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(DDBlocks.FERTILE_SOIL.get(), BlockModelGenerators.createRotatedVariants(plainFertileSoilVariant)));


        // Distant
        TextureMapping distantGrassTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(DDBlocks.DISTANT_DIRT.get()))
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(DDBlocks.DISTANT_GRASS.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(DDBlocks.DISTANT_GRASS.get(), "_side"))
                .put(OVERLAY, TextureMapping.getBlockTexture(DDBlocks.DISTANT_GRASS.get(), "_side_overlay"));
        Variant plainDistantGrassVariant = BlockModelGenerators.plainModel(TINTED_GRASS_BLOCK.create(DDBlocks.DISTANT_GRASS.get(), distantGrassTextureMapping, blockModels.modelOutput));
        Identifier plainDistantGrassModel = ModelLocationUtils.getModelLocation(DDBlocks.DISTANT_GRASS.get());
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(DDBlocks.DISTANT_GRASS.get(), BlockModelGenerators.createRotatedVariants(plainDistantGrassVariant)));
        blockModels.registerSimpleTintedItemModel(DDBlocks.DISTANT_GRASS.get(), plainDistantGrassModel, new GrassColorSource());
        blockModels.createTrivialCube(DDBlocks.DISTANT_DIRT.get());

        // Distant Stone
        blockModels.family(DDBlocks.DISTANT_STONE.get())
                .stairs(DDBlocks.DISTANT_STONE_STAIRS.get())
                .slab(DDBlocks.DISTANT_STONE_SLAB.get())
                .wall(DDBlocks.DISTANT_STONE_WALL.get());

        blockModels.family(DDBlocks.DISTANT_COBBLE.get())
                .stairs(DDBlocks.DISTANT_COBBLE_STAIRS.get())
                .slab(DDBlocks.DISTANT_COBBLE_SLAB.get())
                .wall(DDBlocks.DISTANT_COBBLE_WALL.get());

        blockModels.family(DDBlocks.DISTANT_STONE_POLISHED.get())
                .stairs(DDBlocks.DISTANT_STONE_POLISHED_STAIRS.get())
                .slab(DDBlocks.DISTANT_STONE_POLISHED_SLAB.get())
                .wall(DDBlocks.DISTANT_STONE_POLISHED_WALL.get());

        blockModels.family(DDBlocks.DISTANT_STONE_BRICKS.get())
                .stairs(DDBlocks.DISTANT_STONE_BRICK_STAIRS.get())
                .slab(DDBlocks.DISTANT_STONE_BRICK_SLAB.get())
                .wall(DDBlocks.DISTANT_STONE_BRICK_WALL.get());

        // Limestone

        // Islate
        blockModels.family(DDBlocks.ISLATE.get())
                .stairs(DDBlocks.ISLATE_STAIRS.get())
                .slab(DDBlocks.ISLATE_SLAB.get())
                .wall(DDBlocks.ISLATE_WALL.get());

        blockModels.family(DDBlocks.ISLATE_COBBLED.get())
                .stairs(DDBlocks.ISLATE_COBBLED_STAIRS.get())
                .slab(DDBlocks.ISLATE_COBBLED_SLAB.get())
                .wall(DDBlocks.ISLATE_COBBLED_WALL.get());

        blockModels.family(DDBlocks.ISLATE_POLISHED.get())
                .stairs(DDBlocks.ISLATE_POLISHED_STAIRS.get())
                .slab(DDBlocks.ISLATE_POLISHED_SLAB.get())
                .wall(DDBlocks.ISLATE_POLISHED_WALL.get());

        blockModels.family(DDBlocks.ISLATE_BRICKS.get())
                .stairs(DDBlocks.ISLATE_BRICK_STAIRS.get())
                .slab(DDBlocks.ISLATE_BRICK_SLAB.get())
                .wall(DDBlocks.ISLATE_BRICK_WALL.get());

        // Rhyolite
        blockModels.family(DDBlocks.RHYOLITE.get())
                .stairs(DDBlocks.RHYOLITE_STAIRS.get())
                .slab(DDBlocks.RHYOLITE_SLAB.get())
                .wall(DDBlocks.RHYOLITE_WALL.get());

        blockModels.family(DDBlocks.RHYOLITE_BRICKS.get())
                .stairs(DDBlocks.RHYOLITE_BRICK_STAIRS.get())
                .slab(DDBlocks.RHYOLITE_BRICK_SLAB.get())
                .wall(DDBlocks.RHYOLITE_BRICK_WALL.get());

        blockModels.family(DDBlocks.RHYOLITE_TILES.get())
                .stairs(DDBlocks.RHYOLITE_TILE_STAIRS.get())
                .slab(DDBlocks.RHYOLITE_TILE_SLAB.get())
                .wall(DDBlocks.RHYOLITE_TILE_WALL.get());


        // *** ITEMS ***
        itemModels.generateFlatItem(DDItems.MUSIC_DISC_HYPNAGOGIA.get(), ModelTemplates.FLAT_ITEM);


    }

    // *** HELPERS ***
    private void createTintedGrassBlockWithItem(@NonNull BlockModelGenerators blockModels, ItemModelGenerators itemModels, Block grassBlock) {
        String grassBlockName = BuiltInRegistries.BLOCK.getKey(grassBlock).getPath();
        Identifier modelLoc = TINTED_GRASS_BLOCK.create(
                grassBlock,
                new TextureMapping()
                        .put(TextureSlot.PARTICLE, new Material(modLocation("block/" + grassBlockName + "_bottom")))
                        .put(TextureSlot.BOTTOM,   new Material(modLocation("block/" + grassBlockName + "_bottom")))
                        .put(TextureSlot.TOP,      new Material(modLocation("block/" + grassBlockName + "_top")))
                        .put(TextureSlot.SIDE,     new Material(modLocation("block/" + grassBlockName + "_side")))
                        .put(OVERLAY,              new Material(modLocation("block/" + grassBlockName + "_side_overlay"))),
                blockModels.modelOutput);

        // Blockstate pointing at that model
        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(grassBlock,
                        BlockModelGenerators.variant(new Variant(modelLoc))));

        itemModels.itemModelOutput.accept(
                DDBlocks.DISTANT_GRASS.asItem(),
                new CuboidItemModelWrapper.Unbaked(
                        modelLoc,                       // the block model from step 1
                        Optional.empty(),
                        List.of(/* vanilla grass ItemTintSource, e.g. new GrassColorSource(0.5F, 1.0F) */)
                )
        );

    }
}
