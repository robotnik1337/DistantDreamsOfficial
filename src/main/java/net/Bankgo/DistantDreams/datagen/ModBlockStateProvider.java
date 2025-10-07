package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DistantDreams.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Standard Wood Blocks
        blockWithItem(ModBlocks.EUCALYPTUS_PLANKS);
        blockWithItem(ModBlocks.SEQUOIA_PLANKS);
        blockWithItem(ModBlocks.CHARRED_PLANKS);

        // Standard Stone Blocks
        blockWithItem(ModBlocks.DISTANT_STONE);
        blockWithItem(ModBlocks.POLISHED_DISTANT_STONE);
        blockWithItem(ModBlocks.DISTANT_STONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_DISTANT_STONE_BRICKS);
        blockWithItem(ModBlocks.MOSSY_DISTANT_STONE_BRICKS);
        blockWithItem(ModBlocks.LIMESTONE);
        blockWithItem(ModBlocks.POLISHED_LIMESTONE);
        blockWithItem(ModBlocks.LIMESTONE_BRICKS);
        blockWithItem(ModBlocks.LIMESTONE_POWDER);
        blockWithItem(ModBlocks.CRACKED_LIMESTONE_BRICKS);
        blockWithItem(ModBlocks.MOSSY_LIMESTONE_BRICKS);

        // Wood log blocks
        logBlock(ModBlocks.EUCALYPTUS_LOG.get());
//        axisBlock(ModBlocks.EUCALYPTUS_WOOD.get(), blockTexture(ModBlocks.EUCALYPTUS_WOOD.get()), blockTexture(ModBlocks.EUCALYPTUS_WOOD.get()));
        logBlock(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get());
//        axisBlock(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), blockTexture(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()), blockTexture(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get()));
        logBlock(ModBlocks.SEQUOIA_LOG.get());
        axisBlock(ModBlocks.STRIPPED_SEQUOIA_LOG.get(),
                modLoc("block/stripped_sequoia_log"),
                modLoc("block/stripped_sequoia_log_top"));
        logBlock(ModBlocks.CHARRED_LOG.get());
        axisBlock(ModBlocks.STRIPPED_CHARRED_LOG.get(),
                modLoc("block/stripped_charred_log"),
                modLoc("block/stripped_charred_log_top"));


        // Pillar Blocks
        axisBlock((RotatedPillarBlock) ModBlocks.LIMESTONE_PILLAR.get(),
                modLoc("block/limestone_pillar"),
                modLoc("block/limestone_pillar_top"));


        // Wood blocks
        axisBlock(ModBlocks.EUCALYPTUS_WOOD.get(),
                modLoc("block/eucalyptus_log"),
                modLoc("block/eucalyptus_log"));
        axisBlock(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get(),
                modLoc("block/stripped_eucalyptus_log"),
                modLoc("block/stripped_eucalyptus_log"));
        axisBlock(ModBlocks.SEQUOIA_WOOD.get(),
                modLoc("block/sequoia_log"),
                modLoc("block/sequoia_log"));
        axisBlock(ModBlocks.STRIPPED_SEQUOIA_WOOD.get(),
                modLoc("block/stripped_sequoia_log"),
                modLoc("block/stripped_sequoia_log"));
        axisBlock(ModBlocks.CHARRED_WOOD.get(),
                modLoc("block/charred_log"),
                modLoc("block/charred_log"));
        axisBlock(ModBlocks.STRIPPED_CHARRED_WOOD.get(),
                modLoc("block/stripped_charred_log"),
                modLoc("block/stripped_charred_log"));





        // TODO: PUT IN THE REST OF THE SPECIAL WOOD BLOCKS FOR CHARRED
        // Stair Blocks
        stairsBlock(ModBlocks.EUCALYPTUS_STAIRS.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        stairsBlock(ModBlocks.SEQUOIA_STAIRS.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));
        stairsBlock(ModBlocks.CHARRED_STAIRS.get(), blockTexture(ModBlocks.CHARRED_PLANKS.get()));
        stairsBlock(ModBlocks.DISTANT_STONE_STAIRS.get(), blockTexture(ModBlocks.DISTANT_STONE.get()));
        stairsBlock(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_DISTANT_STONE.get()));
        stairsBlock(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DISTANT_STONE_BRICKS.get()));
        stairsBlock(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get()));
        stairsBlock(ModBlocks.LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.LIMESTONE.get()));
        stairsBlock(ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));
        stairsBlock(ModBlocks.LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        stairsBlock(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_LIMESTONE_BRICKS.get()));

        // Slab Blocks
        slabBlock(ModBlocks.EUCALYPTUS_SLAB.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        slabBlock(ModBlocks.SEQUOIA_SLAB.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));
        slabBlock(ModBlocks.CHARRED_SLAB.get(), blockTexture(ModBlocks.CHARRED_PLANKS.get()), blockTexture(ModBlocks.CHARRED_PLANKS.get()));
        slabBlock(ModBlocks.DISTANT_STONE_SLAB.get(), blockTexture(ModBlocks.DISTANT_STONE.get()), blockTexture(ModBlocks.DISTANT_STONE.get()));
        slabBlock(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get(), blockTexture(ModBlocks.POLISHED_DISTANT_STONE.get()), blockTexture(ModBlocks.POLISHED_DISTANT_STONE.get()));
        slabBlock(ModBlocks.DISTANT_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.DISTANT_STONE_BRICKS.get()), blockTexture(ModBlocks.DISTANT_STONE_BRICKS.get()));
        slabBlock(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get()), blockTexture(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get()));
        slabBlock(ModBlocks.LIMESTONE_SLAB.get(), blockTexture(ModBlocks.LIMESTONE.get()), blockTexture(ModBlocks.LIMESTONE.get()));
        slabBlock(ModBlocks.POLISHED_LIMESTONE_SLAB.get(), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));
        slabBlock(ModBlocks.LIMESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        slabBlock(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.MOSSY_LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.MOSSY_LIMESTONE_BRICKS.get()));

        // Button Blocks
        buttonBlock(ModBlocks.EUCALYPTUS_BUTTON.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        buttonBlock(ModBlocks.SEQUOIA_BUTTON.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));
        buttonBlock(ModBlocks.CHARRED_BUTTON.get(), blockTexture(ModBlocks.CHARRED_PLANKS.get()));
        buttonBlock(ModBlocks.DISTANT_STONE_BUTTON.get(), blockTexture(ModBlocks.DISTANT_STONE.get()));
        buttonBlock(ModBlocks.LIMESTONE_BUTTON.get(), blockTexture(ModBlocks.LIMESTONE.get()));

        // Pressure Plate Blocks
        pressurePlateBlock(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        pressurePlateBlock(ModBlocks.SEQUOIA_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));
        pressurePlateBlock(ModBlocks.CHARRED_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CHARRED_PLANKS.get()));
        pressurePlateBlock(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DISTANT_STONE.get()));
        pressurePlateBlock(ModBlocks.LIMESTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LIMESTONE.get()));

        // Fence Blocks
        fenceBlock(ModBlocks.EUCALYPTUS_FENCE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        fenceBlock(ModBlocks.SEQUOIA_FENCE.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));
        fenceBlock(ModBlocks.CHARRED_FENCE.get(), blockTexture(ModBlocks.CHARRED_PLANKS.get()));

        // Fence Gate Blocks
        fenceGateBlock(ModBlocks.EUCALYPTUS_FENCE_GATE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        fenceGateBlock(ModBlocks.SEQUOIA_FENCE_GATE.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));
        fenceGateBlock(ModBlocks.CHARRED_FENCE_GATE.get(), blockTexture(ModBlocks.CHARRED_PLANKS.get()));

        // Door Blocks
        doorBlockWithRenderType(ModBlocks.EUCALYPTUS_DOOR.get(), modLoc("block/eucalyptus_door_bottom"), modLoc("block/eucalyptus_door_top"), "cutout");
        doorBlockWithRenderType(ModBlocks.SEQUOIA_DOOR.get(), modLoc("block/sequoia_door_bottom"), modLoc("block/sequoia_door_top"), "cutout");
        doorBlockWithRenderType(ModBlocks.CHARRED_DOOR.get(), modLoc("block/charred_door_bottom"), modLoc("block/charred_door_top"), "cutout");

        // Trapdoor Blocks
        trapdoorBlockWithRenderType(ModBlocks.EUCALYPTUS_TRAPDOOR.get(), modLoc("block/eucalyptus_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(ModBlocks.SEQUOIA_TRAPDOOR.get(), modLoc("block/sequoia_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(ModBlocks.CHARRED_TRAPDOOR.get(), modLoc("block/charred_trapdoor"), true, "cutout");

        // Wall Blocks
        wallBlock(ModBlocks.DISTANT_STONE_WALL.get(), blockTexture(ModBlocks.DISTANT_STONE.get()));
        wallBlock(ModBlocks.POLISHED_DISTANT_STONE_WALL.get(), blockTexture(ModBlocks.POLISHED_DISTANT_STONE.get()));
        wallBlock(ModBlocks.DISTANT_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.DISTANT_STONE_BRICKS.get()));
        wallBlock(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get()));
        wallBlock(ModBlocks.LIMESTONE_WALL.get(), blockTexture(ModBlocks.LIMESTONE.get()));
        wallBlock(ModBlocks.POLISHED_LIMESTONE_WALL.get(), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));
        wallBlock(ModBlocks.LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        wallBlock(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_LIMESTONE_BRICKS.get()));

        // Eucalyptus Blocks -> Wood Items
        blockItem(ModBlocks.EUCALYPTUS_LOG);
        blockItem(ModBlocks.STRIPPED_EUCALYPTUS_LOG);
        blockItem(ModBlocks.EUCALYPTUS_WOOD);
        blockItem(ModBlocks.STRIPPED_EUCALYPTUS_WOOD);
        blockItem(ModBlocks.EUCALYPTUS_STAIRS);
        blockItem(ModBlocks.EUCALYPTUS_SLAB);
        blockItem(ModBlocks.EUCALYPTUS_PRESSURE_PLATE);
        blockItem(ModBlocks.EUCALYPTUS_FENCE_GATE);
        blockItem(ModBlocks.EUCALYPTUS_TRAPDOOR, "_bottom");

        // Sequoia Blocks -> Wood Items
        blockItem(ModBlocks.SEQUOIA_LOG);
        blockItem(ModBlocks.STRIPPED_SEQUOIA_LOG);
        blockItem(ModBlocks.SEQUOIA_WOOD);
        blockItem(ModBlocks.STRIPPED_SEQUOIA_WOOD);
        blockItem(ModBlocks.SEQUOIA_STAIRS);
        blockItem(ModBlocks.SEQUOIA_SLAB);
        blockItem(ModBlocks.SEQUOIA_PRESSURE_PLATE);
        blockItem(ModBlocks.SEQUOIA_FENCE_GATE);
        blockItem(ModBlocks.SEQUOIA_TRAPDOOR, "_bottom");

        // Charred Blocks -> Wood Items
        blockItem(ModBlocks.CHARRED_LOG);
        blockItem(ModBlocks.STRIPPED_CHARRED_LOG);
        blockItem(ModBlocks.CHARRED_WOOD);
        blockItem(ModBlocks.STRIPPED_CHARRED_WOOD);
        blockItem(ModBlocks.CHARRED_STAIRS);
        blockItem(ModBlocks.CHARRED_SLAB);
        blockItem(ModBlocks.CHARRED_PRESSURE_PLATE);
        blockItem(ModBlocks.CHARRED_FENCE_GATE);
        blockItem(ModBlocks.CHARRED_TRAPDOOR, "_bottom");

        // Distant Blocks -> Stone Items
        blockItem(ModBlocks.DISTANT_STONE_STAIRS);
        blockItem(ModBlocks.DISTANT_STONE_SLAB);
        blockItem(ModBlocks.DISTANT_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.DISTANT_STONE_WALL);
        blockItem(ModBlocks.POLISHED_DISTANT_STONE_STAIRS);
        blockItem(ModBlocks.POLISHED_DISTANT_STONE_SLAB);
        blockItem(ModBlocks.POLISHED_DISTANT_STONE_WALL);
        blockItem(ModBlocks.DISTANT_STONE_BRICK_STAIRS);
        blockItem(ModBlocks.DISTANT_STONE_BRICK_SLAB);
        blockItem(ModBlocks.DISTANT_STONE_BRICK_WALL);
        blockItem(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS);
        blockItem(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB);
        blockItem(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL);

        // Limestone Blocks -> Items
        blockItem(ModBlocks.LIMESTONE_STAIRS);
        blockItem(ModBlocks.LIMESTONE_SLAB);
        blockItem(ModBlocks.LIMESTONE_PRESSURE_PLATE);
        blockItem(ModBlocks.LIMESTONE_WALL);
        blockItem(ModBlocks.POLISHED_LIMESTONE_STAIRS);
        blockItem(ModBlocks.POLISHED_LIMESTONE_SLAB);
        blockItem(ModBlocks.POLISHED_LIMESTONE_WALL);
        blockItem(ModBlocks.LIMESTONE_BRICK_STAIRS);
        blockItem(ModBlocks.LIMESTONE_BRICK_SLAB);
        blockItem(ModBlocks.LIMESTONE_BRICK_WALL);
        blockItem(ModBlocks.LIMESTONE_PILLAR);
        blockItem(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS);
        blockItem(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB);
        blockItem(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL);

        // Soil Blocks
        grassBlock(ModBlocks.FERTILE_SOIL);
        farmlandBlock(ModBlocks.FERTILE_PLOT);

        // Leaves Blocks
        leavesBlock(ModBlocks.EUCALYPTUS_LEAVES);
        leavesBlock(ModBlocks.SEQUOIA_LEAVES);

        // Sapling Blocks
        saplingBlock(ModBlocks.EUCALYPTUS_SAPLING);
        saplingBlock(ModBlocks.SEQUOIA_SAPLING);

        // Custom Crafting Table Blocks
        craftingTableBlock(ModBlocks.CHARRED_CRAFTING_TABLE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("distantdreams:block/" +
                Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("distantdreams:block/" +
                Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath() + appendix));
    }

    private void grassBlock(RegistryObject<? extends Block> blockRegistryObject) {
        assert blockRegistryObject.getId() != null;
        String basePath = blockRegistryObject.getId().getPath();
        ResourceLocation topTexture = modLoc("block/" + basePath + "_top");
        ResourceLocation sideTexture = modLoc("block/" + basePath + "_side");
        ResourceLocation bottomTexture = modLoc("block/" + basePath + "_bottom");

        ModelFile grassModel = models().cubeBottomTop(
                basePath,
                sideTexture,
                bottomTexture,
                topTexture
                );
        simpleBlock(blockRegistryObject.get(), grassModel);
        simpleBlockItem(blockRegistryObject.get(), grassModel);
    }

    private void farmlandBlock(RegistryObject<? extends Block> blockRegistryObject) {
        assert blockRegistryObject.getId() != null;
        String basePath = blockRegistryObject.getId().getPath();
        ResourceLocation topWetTexture = modLoc("block/" + basePath + "_top_wet");
        ResourceLocation topTexture = modLoc("block/" + basePath + "_top");
        ResourceLocation sideTexture = modLoc("block/" + basePath + "_side");
        ResourceLocation bottomTexture = modLoc("block/" + basePath + "_bottom");

        ModelFile farmlandDryModel = models().withExistingParent(
                basePath + "_dry",
                mcLoc("block/farmland")).texture("side", sideTexture)
                .texture("bottom", bottomTexture)
                .texture("top", topTexture);

        ModelFile farmlandWetModel = models().withExistingParent(
                basePath + "_wet",
                mcLoc("block/farmland")
        ).texture(
                "side", sideTexture
        ).texture(
                "bottom", bottomTexture
        ).texture(
                "top", topWetTexture
        );

        getVariantBuilder(blockRegistryObject.get())
                .forAllStates(state -> ConfiguredModel.builder()
                        .modelFile(state.getValue(BlockStateProperties.MOISTURE) == 0
                                ? farmlandDryModel : farmlandWetModel)
                        .build());

        simpleBlockItem(blockRegistryObject.get(), farmlandWetModel);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath(),
                        blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath(),
                        ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void craftingTableBlock(RegistryObject<CraftingTableBlock> blockRegistryObject) {
        assert blockRegistryObject.getId() != null;
        String basePath = blockRegistryObject.getId().getPath();
        String craftingTableMaterial = basePath.substring(0, basePath.length() - 15);
        ResourceLocation topTexture = modLoc("block/" + basePath + "_top");
        ResourceLocation frontTexture = modLoc("block/" + basePath + "_front");
        ResourceLocation sideTexture = modLoc("block/" + basePath + "_side");
        ResourceLocation bottomTexture = modLoc("block/" + craftingTableMaterial + "_planks");

        ModelFile craftingTableModel = models().withExistingParent(
                basePath,
                mcLoc("block/crafting_table"))
                .texture("down", bottomTexture)
                .texture("east", sideTexture)
                .texture("south", sideTexture)
                .texture("north", frontTexture)
                .texture("west", frontTexture)
                .texture("particle", frontTexture)
                .texture("up", topTexture);

        simpleBlockWithItem(blockRegistryObject.get(), craftingTableModel);
    }
}
