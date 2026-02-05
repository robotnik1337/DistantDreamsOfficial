package net.Bankgo.DistantDreams.block;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.custom.*;
import net.Bankgo.DistantDreams.item.ModItems;
import net.Bankgo.DistantDreams.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModBlocks {
    // Registry for mod blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DistantDreams.MODID);

    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DistantDreams.MODID);

    // TODO: fix leaf particle colors for ancient oak, eucalyptus, and sequoia leaves

    // ===== START EUCALYPTUS ===== //
    // Eucalyptus Wood
    public static final RegistryObject<RotatedPillarBlock> ANCIENT_OAK_WOOD = registerBlock("ancient_oak_wood",
            () -> new AncientOakBlock(setIdProperty("ancient_oak_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD))
                    .mapColor(MapColor.COLOR_GRAY)));

    // Stripped Eucalyptus Wood
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ANCIENT_OAK_WOOD = registerBlock("stripped_ancient_oak_wood",
            () -> new AncientOakBlock(setIdProperty("stripped_ancient_oak_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD))
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Log
    public static final RegistryObject<RotatedPillarBlock> ANCIENT_OAK_LOG = registerBlock("ancient_oak_log",
            () -> new AncientOakBlock(setIdProperty("ancient_oak_log", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG))
                    .mapColor(pBlockState -> pBlockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_LIGHT_GRAY : MapColor.COLOR_GRAY)));

    // Stripped Eucalyptus Log
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ANCIENT_OAK_LOG = registerBlock("stripped_ancient_oak_log",
            () -> new AncientOakBlock(setIdProperty("stripped_ancient_oak_log", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG))
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Planks
    public static final RegistryObject<Block> ANCIENT_OAK_PLANKS = registerBlock("ancient_oak_planks",
            () -> new Block(setIdProperty("ancient_oak_planks", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Stairs
    public static final RegistryObject<StairBlock> ANCIENT_OAK_STAIRS = registerBlock("ancient_oak_stairs",
            () -> new StairBlock(ModBlocks.ANCIENT_OAK_PLANKS.get().defaultBlockState(),
                    setIdProperty("ancient_oak_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS))
                            .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Slab
    public static final RegistryObject<SlabBlock> ANCIENT_OAK_SLAB = registerBlock("ancient_oak_slab",
            () -> new SlabBlock(setIdProperty("ancient_oak_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB))
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Pressure Plate
    public static final RegistryObject<PressurePlateBlock> ANCIENT_OAK_PRESSURE_PLATE = registerBlock("ancient_oak_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    setIdProperty("ancient_oak_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE))
                            .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Button
    public static final RegistryObject<ButtonBlock> ANCIENT_OAK_BUTTON = registerBlock("ancient_oak_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    15,
                    setIdProperty("ancient_oak_button", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON))
                            .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Fence
    public static final RegistryObject<FenceBlock> ANCIENT_OAK_FENCE = registerBlock("ancient_oak_fence",
            () -> new FenceBlock(setIdProperty("ancient_oak_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE))
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Fence Gate
    public static final RegistryObject<FenceGateBlock> ANCIENT_OAK_FENCE_GATE = registerBlock("ancient_oak_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    setIdProperty("ancient_oak_fence_gate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE))
                            .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Door
    public static final RegistryObject<DoorBlock> ANCIENT_OAK_DOOR = registerBlock("ancient_oak_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    setIdProperty("ancient_oak_door", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR))
                            .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Trapdoor
    public static final RegistryObject<TrapDoorBlock> ANCIENT_OAK_TRAPDOOR = registerBlock("ancient_oak_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    setIdProperty("ancient_oak_trapdoor", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR))
                            .mapColor(MapColor.TERRACOTTA_GRAY)));

    // Eucalyptus Leaves
    public static final RegistryObject<Block> ANCIENT_OAK_LEAVES = registerBlock("ancient_oak_leaves",
            () -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, FoliageColor.FOLIAGE_BIRCH), setIdProperty("ancient_oak_leaves", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    public static final RegistryObject<SaplingBlock> ANCIENT_OAK_SAPLING = registerBlock("ancient_oak_sapling",
            () -> new SaplingBlock(ModTreeGrowers.ANCIENT_OAK, setIdProperty("ancient_oak_sapling", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))));

    public static final RegistryObject<FlowerPotBlock> POTTED_ANCIENT_OAK_SAPLING = registerBlock("potted_ancient_oak_sapling",
            () -> new FlowerPotBlock(ANCIENT_OAK_SAPLING.get(), setIdProperty("potted_ancient_oak_sapling", BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING))));
    // ===== END ANCIENT_OAK ===== //


    // ===== START EUCALYPTUS ===== //
    // Eucalyptus Wood
    public static final RegistryObject<RotatedPillarBlock> EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("eucalyptus_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD))
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)));

    // Stripped Eucalyptus Wood
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("stripped_eucalyptus_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD))
                    .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Log
    public static final RegistryObject<RotatedPillarBlock> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("eucalyptus_log", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG))
                    .mapColor(pBlockState -> pBlockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_WHITE : MapColor.COLOR_LIGHT_GRAY)));

    // Stripped Eucalyptus Log
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("stripped_eucalyptus_log", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG))
                    .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Planks
    public static final RegistryObject<Block> EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            () -> new Block(setIdProperty("eucalyptus_planks", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
                    .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Stairs
    public static final RegistryObject<StairBlock> EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs",
            () -> new StairBlock(ModBlocks.EUCALYPTUS_PLANKS.get().defaultBlockState(),
                    setIdProperty("eucalyptus_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS))
                            .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Slab
    public static final RegistryObject<SlabBlock> EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab",
            () -> new SlabBlock(setIdProperty("eucalyptus_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB))
                    .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Pressure Plate
    public static final RegistryObject<PressurePlateBlock> EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    setIdProperty("eucalyptus_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE))
                            .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Button
    public static final RegistryObject<ButtonBlock> EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    15,
                    setIdProperty("eucalyptus_button", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON))
                            .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Fence
    public static final RegistryObject<FenceBlock> EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence",
            () -> new FenceBlock(setIdProperty("eucalyptus_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE))
                    .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Fence Gate
    public static final RegistryObject<FenceGateBlock> EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    setIdProperty("eucalyptus_fence_gate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE))
                            .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Door
    public static final RegistryObject<DoorBlock> EUCALYPTUS_DOOR = registerBlock("eucalyptus_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    setIdProperty("eucalyptus_door", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR))
                            .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Trapdoor
    public static final RegistryObject<TrapDoorBlock> EUCALYPTUS_TRAPDOOR = registerBlock("eucalyptus_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    setIdProperty("eucalyptus_trapdoor", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR))
                            .mapColor(MapColor.TERRACOTTA_WHITE)));

    // Eucalyptus Leaves
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            () -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, FoliageColor.FOLIAGE_BIRCH), setIdProperty("eucalyptus_leaves", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    public static final RegistryObject<SaplingBlock> EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            () -> new SaplingBlock(ModTreeGrowers.EUCALYPTUS, setIdProperty("eucalyptus_sapling", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))));

    public static final RegistryObject<FlowerPotBlock> POTTED_EUCALYPTUS_SAPLING = registerBlock("potted_eucalyptus_sapling",
            () -> new FlowerPotBlock(EUCALYPTUS_SAPLING.get(), setIdProperty("potted_eucalyptus_sapling", BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING))));
    // ===== END EUCALYPTUS ===== //

    // ===== START SEQUOIA ===== //
    // Sequoia Wood
    public static final RegistryObject<RotatedPillarBlock> SEQUOIA_WOOD = registerBlock("sequoia_wood",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("sequoia_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD))
                    .mapColor(MapColor.TERRACOTTA_ORANGE)));

    // Stripped Sequoia Wood
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_SEQUOIA_WOOD = registerBlock("stripped_sequoia_wood",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("stripped_sequoia_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD))
                    .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Log
    public static final RegistryObject<RotatedPillarBlock> SEQUOIA_LOG = registerBlock("sequoia_log",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("sequoia_log", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG))
                    .mapColor(pBlockState -> pBlockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.COLOR_ORANGE : MapColor.TERRACOTTA_ORANGE)));

    // Stripped Sequoia Log
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_SEQUOIA_LOG = registerBlock("stripped_sequoia_log",
            () -> new ModFlammableRotatedPillarBlock(setIdProperty("stripped_sequoia_log", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG))
                    .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Planks
    public static final RegistryObject<Block> SEQUOIA_PLANKS = registerBlock("sequoia_planks",
            () -> new Block(setIdProperty("sequoia_planks", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
                    .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Stairs
    public static final RegistryObject<StairBlock> SEQUOIA_STAIRS = registerBlock("sequoia_stairs",
            () -> new StairBlock(ModBlocks.SEQUOIA_PLANKS.get().defaultBlockState(),
                    setIdProperty("sequoia_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS))
                            .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Slab
    public static final RegistryObject<SlabBlock> SEQUOIA_SLAB = registerBlock("sequoia_slab",
            () -> new SlabBlock(setIdProperty("sequoia_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB))
                    .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Pressure Plate
    public static final RegistryObject<PressurePlateBlock> SEQUOIA_PRESSURE_PLATE = registerBlock("sequoia_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    setIdProperty("sequoia_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE))
                            .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Button
    public static final RegistryObject<ButtonBlock> SEQUOIA_BUTTON = registerBlock("sequoia_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    15,
                    setIdProperty("sequoia_button", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON))
                            .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Fence
    public static final RegistryObject<FenceBlock> SEQUOIA_FENCE = registerBlock("sequoia_fence",
            () -> new FenceBlock(setIdProperty("sequoia_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE))
                    .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Fence Gate
    public static final RegistryObject<FenceGateBlock> SEQUOIA_FENCE_GATE = registerBlock("sequoia_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    setIdProperty("sequoia_fence_gate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE))
                            .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Door
    public static final RegistryObject<DoorBlock> SEQUOIA_DOOR = registerBlock("sequoia_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    setIdProperty("sequoia_door", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR))
                            .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Trapdoor
    public static final RegistryObject<TrapDoorBlock> SEQUOIA_TRAPDOOR = registerBlock("sequoia_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    setIdProperty("sequoia_trapdoor", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR))
                            .mapColor(MapColor.COLOR_ORANGE)));

    // Sequoia Leaves
    public static final RegistryObject<Block> SEQUOIA_LEAVES = registerBlock("sequoia_leaves",
            () -> new UntintedParticleLeavesBlock(0.1F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 9399763), setIdProperty("sequoia_leaves", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));


        public static final RegistryObject<Block> SEQUOIA_SAPLING = registerBlock("sequoia_sapling",
                () -> new SaplingBlock(ModTreeGrowers.SEQUOIA, setIdProperty("sequoia_sapling", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))));

        public static final RegistryObject<FlowerPotBlock> POTTED_SEQUOIA_SAPLING = registerBlock("potted_sequoia_sapling",
            () -> new FlowerPotBlock(SEQUOIA_SAPLING.get(), setIdProperty("potted_sequoia_sapling", BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING))));
        // ===== END SEQUOIA ===== //

        // ===== START CHARRED ===== //
        // Charred Wood
        public static final RegistryObject<RotatedPillarBlock> CHARRED_WOOD = registerBlock("charred_wood",
                () -> new RotatedPillarBlock(setIdProperty("charred_wood", BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_BLACK)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(1.5F)
                        .sound(SoundType.WOOD)
                        .requiresCorrectToolForDrops())));


        // Stripped Charred Wood
        public static final RegistryObject<RotatedPillarBlock> STRIPPED_CHARRED_WOOD = registerBlock("stripped_charred_wood",
                () -> new RotatedPillarBlock(setIdProperty("stripped_charred_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD))
                        .mapColor(MapColor.COLOR_BLACK)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(1.5F)
                        .sound(SoundType.WOOD)
                        .requiresCorrectToolForDrops()));

        // Charred Log
        public static final RegistryObject<RotatedPillarBlock> CHARRED_LOG = registerBlock("charred_log",
                () -> new RotatedPillarBlock(setIdProperty("charred_log", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG))
                        .mapColor(MapColor.COLOR_BLACK)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(1.5F)
                        .sound(SoundType.WOOD)
                        .requiresCorrectToolForDrops()));

        // Stripped Charred Log
        public static final RegistryObject<RotatedPillarBlock> STRIPPED_CHARRED_LOG = registerBlock("stripped_charred_log",
                () -> new RotatedPillarBlock(setIdProperty("stripped_charred_log", BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG))
                        .mapColor(MapColor.COLOR_BLACK)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(1.5F)
                        .sound(SoundType.WOOD)
                        .requiresCorrectToolForDrops()));

    // Charred Planks
    public static final RegistryObject<Block> CHARRED_PLANKS = registerBlock("charred_planks",
            () -> new Block(setIdProperty("charred_planks", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
                    .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                    .requiresCorrectToolForDrops()));

    // Charred Stairs
    public static final RegistryObject<StairBlock> CHARRED_STAIRS = registerBlock("charred_stairs",
            () -> new StairBlock(ModBlocks.CHARRED_PLANKS.get().defaultBlockState(),
                    setIdProperty("charred_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS))
                            .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                            .requiresCorrectToolForDrops()));

    // Charred Slab
    public static final RegistryObject<SlabBlock> CHARRED_SLAB = registerBlock("charred_slab",
            () -> new SlabBlock(setIdProperty("charred_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB))
                    .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                    .requiresCorrectToolForDrops()));

    // Charred Pressure Plate
    public static final RegistryObject<PressurePlateBlock> CHARRED_PRESSURE_PLATE = registerBlock("charred_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    setIdProperty("charred_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE))
                            .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                            .requiresCorrectToolForDrops()));

    // Charred Button
    public static final RegistryObject<ButtonBlock> CHARRED_BUTTON = registerBlock("charred_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    15,
                    setIdProperty("charred_button", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON))
                            .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                            .requiresCorrectToolForDrops()));

    // Charred Fence
    public static final RegistryObject<FenceBlock> CHARRED_FENCE = registerBlock("charred_fence",
            () -> new FenceBlock(setIdProperty("charred_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE))
                    .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                    .requiresCorrectToolForDrops()));

    // Charred Fence Gate
    public static final RegistryObject<FenceGateBlock> CHARRED_FENCE_GATE = registerBlock("charred_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    setIdProperty("charred_fence_gate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE))
                            .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                            .requiresCorrectToolForDrops()));

    // Charred Door
    public static final RegistryObject<DoorBlock> CHARRED_DOOR = registerBlock("charred_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    setIdProperty("charred_door", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR))
                            .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                            .requiresCorrectToolForDrops()));

    // Charred Trapdoor
    public static final RegistryObject<TrapDoorBlock> CHARRED_TRAPDOOR = registerBlock("charred_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    setIdProperty("charred_trapdoor", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR))
                            .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                            .requiresCorrectToolForDrops()));

    // Charred Crafting Table
    public static final RegistryObject<CraftingTableBlock> CHARRED_CRAFTING_TABLE = registerBlock("charred_crafting_table",
            () -> new ModCraftingTableBlock(setIdProperty("charred_crafting_table", BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE))
                    .mapColor(ModBlocks.CHARRED_LOG.get().defaultMapColor())
                    .requiresCorrectToolForDrops()));

    // ===== END CHARRED ===== //



    // ===== START FERTILE ===== //
    // Fertile Soil Block
    public static final RegistryObject<Block> FERTILE_SOIL = registerBlock("fertile_soil",
            () -> new ModSoilBlock(setIdProperty("fertile_soil", BlockBehaviour.Properties.ofFullCopy(Blocks.PODZOL))));

    // Fertile Plot Block
    public static final RegistryObject<FarmBlock> FERTILE_PLOT = registerBlock("fertile_plot",
            () -> new ModFarmBlock(setIdProperty("fertile_plot", BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND))));
    // ===== END FERTILE ===== //

    // ===== START DISTANT STONE ===== //
    // Distant Stone Block
    public static final RegistryObject<Block> DISTANT_STONE = registerBlock("distant_stone",
            () -> new Block(setIdProperty("distant_stone", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))));

    // Distant Stone Stairs
    public static final RegistryObject<StairBlock> DISTANT_STONE_STAIRS = registerBlock("distant_stone_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE.get().defaultBlockState(),
                    setIdProperty("distant_stone_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS))));

    // Distant Stone Slab
    public static final RegistryObject<SlabBlock> DISTANT_STONE_SLAB = registerBlock("distant_stone_slab",
            () -> new SlabBlock(setIdProperty("distant_stone_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB))));

    // Distant Stone Pressure Plate
    public static final RegistryObject<PressurePlateBlock> DISTANT_STONE_PRESSURE_PLATE = registerBlock("distant_stone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    setIdProperty("distant_stone_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE))));

    // Distant Stone Button
    public static final RegistryObject<ButtonBlock> DISTANT_STONE_BUTTON = registerBlock("distant_stone_button",
            () -> new ButtonBlock(BlockSetType.STONE,
                    10,
                    setIdProperty("distant_stone_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));

    // Distant Stone Wall
    public static final RegistryObject<WallBlock> DISTANT_STONE_WALL = registerBlock("distant_stone_wall",
            () -> new WallBlock(setIdProperty("distant_stone_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL))));

    // Polished Distant Stone
    public static final RegistryObject<Block> POLISHED_DISTANT_STONE = registerBlock("polished_distant_stone",
            () -> new Block(setIdProperty("polished_distant_stone", BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE))));

    // Polished Distant Stone Stairs
    public static final RegistryObject<StairBlock> POLISHED_DISTANT_STONE_STAIRS = registerBlock("polished_distant_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DISTANT_STONE.get().defaultBlockState(),
                    setIdProperty("polished_distant_stone_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_STAIRS))));

    // Polished Distant Stone Slab
    public static final RegistryObject<SlabBlock> POLISHED_DISTANT_STONE_SLAB = registerBlock("polished_distant_stone_slab",
            () -> new SlabBlock(setIdProperty("polished_distant_stone_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_SLAB))));

    // Polished Distant Stone Wall
    public static final RegistryObject<WallBlock> POLISHED_DISTANT_STONE_WALL = registerBlock("polished_distant_stone_wall",
            () -> new WallBlock(setIdProperty("polished_distant_stone_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL))));

    // Distant Stone Bricks
    public static final RegistryObject<Block> DISTANT_STONE_BRICKS = registerBlock("distant_stone_bricks",
            () -> new Block(setIdProperty("distant_stone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS))));

    // Distant Stone Brick Stairs
    public static final RegistryObject<StairBlock> DISTANT_STONE_BRICK_STAIRS = registerBlock("distant_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE_BRICKS.get().defaultBlockState(),
                    setIdProperty("distant_stone_brick_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS))));

    // Distant Stone Brick Slab
    public static final RegistryObject<SlabBlock> DISTANT_STONE_BRICK_SLAB = registerBlock("distant_stone_brick_slab",
            () -> new SlabBlock(setIdProperty("distant_stone_brick_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB))));

    // Distant Stone Brick Wall
    public static final RegistryObject<WallBlock> DISTANT_STONE_BRICK_WALL = registerBlock("distant_stone_brick_wall",
            () -> new WallBlock(setIdProperty("distant_stone_brick_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL))));

    // Cracked Distant Stone Brick
    public static final RegistryObject<Block> CRACKED_DISTANT_STONE_BRICKS = registerBlock("cracked_distant_stone_bricks",
            () -> new Block(setIdProperty("cracked_distant_stone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS))));

    // Mossy Distant Stone Brick
    public static final RegistryObject<Block> MOSSY_DISTANT_STONE_BRICKS = registerBlock("mossy_distant_stone_bricks",
            () -> new Block(setIdProperty("mossy_distant_stone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS))));

    // Distant Stone Brick Stairs
    public static final RegistryObject<StairBlock> MOSSY_DISTANT_STONE_BRICK_STAIRS = registerBlock("mossy_distant_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE_BRICKS.get().defaultBlockState(),
                    setIdProperty("mossy_distant_stone_brick_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_STAIRS))));

    // Distant Stone Brick Slab
    public static final RegistryObject<SlabBlock> MOSSY_DISTANT_STONE_BRICK_SLAB = registerBlock("mossy_distant_stone_brick_slab",
            () -> new SlabBlock(setIdProperty("mossy_distant_stone_brick_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_SLAB))));

    // Distant Stone Brick Wall
    public static final RegistryObject<WallBlock> MOSSY_DISTANT_STONE_BRICK_WALL = registerBlock("mossy_distant_stone_brick_wall",
            () -> new WallBlock(setIdProperty("mossy_distant_stone_brick_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_WALL))));
    // ===== END DISTANT STONE ===== //

    // ===== START LIMESTONE ===== //
    // Limestone Block
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(setIdProperty("limestone", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))));

    // Limestone Stairs
    public static final RegistryObject<StairBlock> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(ModBlocks.LIMESTONE.get().defaultBlockState(),
                    setIdProperty("limestone_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS))));

    // Limestone Slab
    public static final RegistryObject<SlabBlock> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(setIdProperty("limestone_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB))));

    // Limestone Pressure Plate
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_PRESSURE_PLATE = registerBlock("limestone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    setIdProperty("limestone_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE))));

    // Limestone Button
    public static final RegistryObject<ButtonBlock> LIMESTONE_BUTTON = registerBlock("limestone_button",
            () -> new ButtonBlock(BlockSetType.STONE,
                    10,
                    setIdProperty("limestone_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));

    // Limestone Wall
    public static final RegistryObject<WallBlock> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(setIdProperty("limestone_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL))));

    // Polished Limestone
    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock("polished_limestone",
            () -> new Block(setIdProperty("polished_limestone", BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE))));

    // Polished Limestone Stairs
    public static final RegistryObject<StairBlock> POLISHED_LIMESTONE_STAIRS = registerBlock("polished_limestone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    setIdProperty("polished_limestone_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_STAIRS))));

    // Polished Limestone Slab
    public static final RegistryObject<SlabBlock> POLISHED_LIMESTONE_SLAB = registerBlock("polished_limestone_slab",
            () -> new SlabBlock(setIdProperty("polished_limestone_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE_SLAB))));

    // Polished Limestone Wall
    public static final RegistryObject<WallBlock> POLISHED_LIMESTONE_WALL = registerBlock("polished_limestone_wall",
            () -> new WallBlock(setIdProperty("polished_limestone_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL))));

    // Limestone Bricks
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(setIdProperty("limestone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS))));

    // Limestone Brick Stairs
    public static final RegistryObject<StairBlock> LIMESTONE_BRICK_STAIRS = registerBlock("limestone_brick_stairs",
            () -> new StairBlock(ModBlocks.LIMESTONE_BRICKS.get().defaultBlockState(),
                    setIdProperty("limestone_brick_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS))));

    // Limestone Brick Slab
    public static final RegistryObject<SlabBlock> LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab",
            () -> new SlabBlock(setIdProperty("limestone_brick_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB))));

    // Limestone Brick Wall
    public static final RegistryObject<WallBlock> LIMESTONE_BRICK_WALL = registerBlock("limestone_brick_wall",
            () -> new WallBlock(setIdProperty("limestone_brick_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL))));

    // Limestone Pillar
    public static final RegistryObject<Block> LIMESTONE_PILLAR = registerBlock("limestone_pillar",
            () -> new RotatedPillarBlock(setIdProperty("limestone_pillar", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    // Limestone Powder
    public static final RegistryObject<Block> LIMESTONE_POWDER = registerBlock("limestone_powder",
            () -> new ColoredFallingBlock(new ColorRGBA(-8356741), setIdProperty("limestone_powder", BlockBehaviour.Properties.ofFullCopy(Blocks.SAND))));

    // Cracked Limestone Bricks
    public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICKS = registerBlock("cracked_limestone_bricks",
            () -> new Block(setIdProperty("cracked_limestone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_STONE_BRICKS))));

    // Mossy Limestone Bricks
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICKS = registerBlock("mossy_limestone_bricks",
            () -> new Block(setIdProperty("mossy_limestone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICKS))));

    // Mossy Limestone Brick Stairs
    public static final RegistryObject<StairBlock> MOSSY_LIMESTONE_BRICK_STAIRS = registerBlock("mossy_limestone_brick_stairs",
            () -> new StairBlock(ModBlocks.DISTANT_STONE_BRICKS.get().defaultBlockState(),
                    setIdProperty("mossy_limestone_brick_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_STAIRS))));

    // Mossy Limestone Brick Slab
    public static final RegistryObject<SlabBlock> MOSSY_LIMESTONE_BRICK_SLAB = registerBlock("mossy_limestone_brick_slab",
            () -> new SlabBlock(setIdProperty("mossy_limestone_brick_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_SLAB))));

    // Mossy Limestone Brick Wall
    public static final RegistryObject<WallBlock> MOSSY_LIMESTONE_BRICK_WALL = registerBlock("mossy_limestone_brick_wall",
            () -> new WallBlock(setIdProperty("mossy_limestone_brick_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_WALL))));
    // ===== END LIMESTONE ===== //

    private static BlockBehaviour.Properties setIdProperty(String blockName, BlockBehaviour.Properties currentProperties) {
        return currentProperties.setId(BLOCKS.key(blockName));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, name)))));
    }

    public static void register(BusGroup busGroup) {
        BLOCKS.register(busGroup);
    }

    public static Stream<Block> getAllBlocks() {
        var blockRegistries = List.of(BLOCKS);
        Stream<Block> out = Stream.empty();
        for (DeferredRegister<Block> registry : blockRegistries) {
            out = Stream.concat(out, registry.getEntries().stream().map(RegistryObject::get));
        }
        return out;
    }
}
