package net.Bankgo.DistantDreams.block;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.custom.ModFlammableRotatedPillarBlock;
import net.Bankgo.DistantDreams.block.custom.ModFarmBlock;
import net.Bankgo.DistantDreams.block.custom.ModSoilBlock;
import net.Bankgo.DistantDreams.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    // Registry for mod blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DistantDreams.MODID);

    // Eucalyptus Wood
    public static final RegistryObject<Block> EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));

    // Stripped Eucalyptus Wood
    public static final RegistryObject<Block> STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    // Eucalyptus Log
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    // Stripped Eucalyptus Log
    public static final RegistryObject<Block> STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    // Eucalyptus Planks
    public static final RegistryObject<Block> EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    // Eucalyptus Stairs
    public static final RegistryObject<StairBlock> EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs",
            () -> new StairBlock(ModBlocks.EUCALYPTUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    // Eucalyptus Slab
    public static final RegistryObject<SlabBlock> EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    // Eucalyptus Pressure Plate
    public static final RegistryObject<PressurePlateBlock> EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

    // Eucalyptus Button
    public static final RegistryObject<ButtonBlock> EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    15,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    // Eucalyptus Fence
    public static final RegistryObject<FenceBlock> EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    // Eucalyptus Fence Gate
    public static final RegistryObject<FenceGateBlock> EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    // Eucalyptus Door
    public static final RegistryObject<DoorBlock> EUCALYPTUS_DOOR = registerBlock("eucalyptus_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));

    // Eucalyptus Trapdoor
    public static final RegistryObject<TrapDoorBlock> EUCALYPTUS_TRAPDOOR = registerBlock("eucalyptus_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    // Eucalyptus Leaves
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    // Sequoia Wood
    public static final RegistryObject<Block> SEQUOIA_WOOD = registerBlock("sequoia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));

    // Stripped Sequoia Wood
    public static final RegistryObject<Block> STRIPPED_SEQUOIA_WOOD = registerBlock("stripped_sequoia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    // Sequoia Log
    public static final RegistryObject<Block> SEQUOIA_LOG = registerBlock("sequoia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    // Stripped Sequoia Log
    public static final RegistryObject<Block> STRIPPED_SEQUOIA_LOG = registerBlock("stripped_sequoia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    // Sequoia Planks
    public static final RegistryObject<Block> SEQUOIA_PLANKS = registerBlock("sequoia_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    // Sequoia Stairs
    public static final RegistryObject<StairBlock> SEQUOIA_STAIRS = registerBlock("sequoia_stairs",
            () -> new StairBlock(ModBlocks.SEQUOIA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    // Sequoia Slab
    public static final RegistryObject<SlabBlock> SEQUOIA_SLAB = registerBlock("sequoia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    // Sequoia Pressure Plate
    public static final RegistryObject<PressurePlateBlock> SEQUOIA_PRESSURE_PLATE = registerBlock("sequoia_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

    // Sequoia Button
    public static final RegistryObject<ButtonBlock> SEQUOIA_BUTTON = registerBlock("sequoia_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    15,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    // Sequoia Fence
    public static final RegistryObject<FenceBlock> SEQUOIA_FENCE = registerBlock("sequoia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    // Sequoia Fence Gate
    public static final RegistryObject<FenceGateBlock> SEQUOIA_FENCE_GATE = registerBlock("sequoia_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    // Sequoia Door
    public static final RegistryObject<DoorBlock> SEQUOIA_DOOR = registerBlock("sequoia_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));

    // Sequoia Trapdoor
    public static final RegistryObject<TrapDoorBlock> SEQUOIA_TRAPDOOR = registerBlock("sequoia_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    // Sequoia Leaves
    public static final RegistryObject<Block> SEQUOIA_LEAVES = registerBlock("sequoia_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    // Fertile Soil Block
    public static final RegistryObject<Block> FERTILE_SOIL = registerBlock("fertile_soil",
            () -> new ModSoilBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PODZOL)));

    // Fertile Plot Block
    public static final RegistryObject<Block> FERTILE_PLOT = registerBlock("fertile_plot",
            () -> new ModFarmBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND)));

    // Distant Stone Block
    public static final RegistryObject<Block> DISTANT_STONE = registerBlock("distant_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // Distant Stone Stairs
    public static final RegistryObject<StairBlock> DISTANT_STONE_STAIRS = registerBlock("distant_stone_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS)));

    // Distant Stone Slab
    public static final RegistryObject<SlabBlock> DISTANT_STONE_SLAB = registerBlock("distant_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB)));

    // Distant Stone Pressure Plate
    public static final RegistryObject<PressurePlateBlock> DISTANT_STONE_PRESSURE_PLATE = registerBlock("distant_stone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE)));

    // Distant Stone Button
    public static final RegistryObject<ButtonBlock> DISTANT_STONE_BUTTON = registerBlock("distant_stone_button",
            () -> new ButtonBlock(BlockSetType.STONE,
                    10,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));

    // Distant Stone Wall
    public static final RegistryObject<WallBlock> DISTANT_STONE_WALL = registerBlock("distant_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL)));

    // Polished Distant Stone
    public static final RegistryObject<Block> POLISHED_DISTANT_STONE = registerBlock("polished_distant_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    // Polished Distant Stone Stairs
    public static final RegistryObject<StairBlock> POLISHED_DISTANT_STONE_STAIRS = registerBlock("polished_distant_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DISTANT_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_STAIRS)));

    // Polished Distant Stone Slab
    public static final RegistryObject<SlabBlock> POLISHED_DISTANT_STONE_SLAB = registerBlock("polished_distant_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_SLAB)));

    // Polished Distant Stone Wall
    public static final RegistryObject<WallBlock> POLISHED_DISTANT_STONE_WALL = registerBlock("polished_distant_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL)));

    // Distant Stone Bricks
    public static final RegistryObject<Block> DISTANT_STONE_BRICKS = registerBlock("distant_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    // Distant Stone Brick Stairs
    public static final RegistryObject<StairBlock> DISTANT_STONE_BRICK_STAIRS = registerBlock("distant_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));

    // Distant Stone Brick Slab
    public static final RegistryObject<SlabBlock> DISTANT_STONE_BRICK_SLAB = registerBlock("distant_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));

    // Distant Stone Brick Wall
    public static final RegistryObject<WallBlock> DISTANT_STONE_BRICK_WALL = registerBlock("distant_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    // Cracked Distant Stone Brick
    public static final RegistryObject<Block> CRACKED_DISTANT_STONE_BRICKS = registerBlock("cracked_distant_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS)));

    // Mossy Distant Stone Brick
    public static final RegistryObject<Block> MOSSY_DISTANT_STONE_BRICKS = registerBlock("mossy_distant_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS)));

    // Distant Stone Brick Stairs
    public static final RegistryObject<StairBlock> MOSSY_DISTANT_STONE_BRICK_STAIRS = registerBlock("mossy_distant_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    // Distant Stone Brick Slab
    public static final RegistryObject<SlabBlock> MOSSY_DISTANT_STONE_BRICK_SLAB = registerBlock("mossy_distant_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_SLAB)));

    // Distant Stone Brick Wall
    public static final RegistryObject<WallBlock> MOSSY_DISTANT_STONE_BRICK_WALL = registerBlock("mossy_distant_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_WALL)));

    // Limestone Block
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    // Limestone Stairs
    public static final RegistryObject<StairBlock> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(ModBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS)));

    // Limestone Slab
    public static final RegistryObject<SlabBlock> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB)));

    // Limestone Pressure Plate
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_PRESSURE_PLATE = registerBlock("limestone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE)));

    // Limestone Button
    public static final RegistryObject<ButtonBlock> LIMESTONE_BUTTON = registerBlock("limestone_button",
            () -> new ButtonBlock(BlockSetType.STONE,
                    10,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));

    // Limestone Wall
    public static final RegistryObject<WallBlock> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL)));

    // Polished Limestone
    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock("polished_limestone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    // Polished Limestone Stairs
    public static final RegistryObject<StairBlock> POLISHED_LIMESTONE_STAIRS = registerBlock("polished_limestone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_STAIRS)));

    // Polished Limestone Slab
    public static final RegistryObject<SlabBlock> POLISHED_LIMESTONE_SLAB = registerBlock("polished_limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_SLAB)));

    // Polished Limestone Wall
    public static final RegistryObject<WallBlock> POLISHED_LIMESTONE_WALL = registerBlock("polished_limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL)));

    // Limestone Bricks
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    // Limestone Brick Stairs
    public static final RegistryObject<StairBlock> LIMESTONE_BRICK_STAIRS = registerBlock("limestone_brick_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));

    // Limestone Brick Slab
    public static final RegistryObject<SlabBlock> LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));

    // Limestone Brick Wall
    public static final RegistryObject<WallBlock> LIMESTONE_BRICK_WALL = registerBlock("limestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    // Limestone Pillar
    public static final RegistryObject<Block> LIMESTONE_PILLAR = registerBlock("limestone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR)));

    // Limestone Powder
    public static final RegistryObject<Block> LIMESTONE_POWDER = registerBlock("limestone_powder",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND)));

    // Cracked Limestone Bricks
    public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICKS = registerBlock("cracked_limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS)));

    // Mossy Limestone Bricks
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICKS = registerBlock("mossy_limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS)));

    // Mossy Limestone Brick Stairs
    public static final RegistryObject<StairBlock> MOSSY_LIMESTONE_BRICK_STAIRS = registerBlock("mossy_limestone_brick_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_STAIRS)));

    // Mossy Limestone Brick Slab
    public static final RegistryObject<SlabBlock> MOSSY_LIMESTONE_BRICK_SLAB = registerBlock("mossy_limestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_SLAB)));

    // Mossy Limestone Brick Wall
    public static final RegistryObject<WallBlock> MOSSY_LIMESTONE_BRICK_WALL = registerBlock("mossy_limestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_WALL)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
