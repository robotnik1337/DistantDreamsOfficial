package net.whereabouts.DistantDreams.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.custom.AncientOakBlock;
import net.whereabouts.DistantDreams.block.custom.DDWoodLogBlock;
import net.whereabouts.DistantDreams.block.custom.FertileSoilBlock;
import net.whereabouts.DistantDreams.block.wood.DDWoods;
import net.whereabouts.DistantDreams.item.DDItems;
import net.whereabouts.DistantDreams.worldgen.tree.DDTreeGrowers;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;
import java.util.function.Supplier;

public class DDBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DistantDreams.MOD_ID);

    // Ancient Oak
    public static final DeferredBlock<@NotNull AncientOakBlock> ANCIENT_OAK_LOG = registerBlockItem("ancient_oak_log", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<@NotNull AncientOakBlock> STRIPPED_ANCIENT_OAK_LOG = registerBlockItem("stripped_ancient_oak_log", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<@NotNull AncientOakBlock> ANCIENT_OAK_WOOD = registerBlockItem("ancient_oak_wood", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<@NotNull AncientOakBlock> STRIPPED_ANCIENT_OAK_WOOD = registerBlockItem("stripped_ancient_oak_wood", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<@NotNull Block> ANCIENT_OAK_PLANKS = registerBlockItem("ancient_oak_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<@NotNull StairBlock> ANCIENT_OAK_STAIRS = registerBlockItem("ancient_oak_stairs",
            properties -> new StairBlock(ANCIENT_OAK_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_OAK_PLANKS.get()));

    public static final DeferredBlock<@NotNull SlabBlock> ANCIENT_OAK_SLAB = registerBlockItem("ancient_oak_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<@NotNull PressurePlateBlock> ANCIENT_OAK_PRESSURE_PLATE = registerBlockItem("ancient_oak_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.ANCIENT_OAK_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<@NotNull ButtonBlock> ANCIENT_OAK_BUTTON = registerBlockItem("ancient_oak_button",
            properties -> new ButtonBlock(DDWoods.ANCIENT_OAK_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<@NotNull FenceBlock> ANCIENT_OAK_FENCE = registerBlockItem("ancient_oak_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<@NotNull FenceGateBlock> ANCIENT_OAK_FENCE_GATE = registerBlockItem("ancient_oak_fence_gate",
            properties -> new FenceGateBlock(DDWoods.ANCIENT_OAK_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<@NotNull DoorBlock> ANCIENT_OAK_DOOR = registerBlockItem("ancient_oak_door",
            properties -> new DoorBlock(DDWoods.ANCIENT_OAK_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<@NotNull TrapDoorBlock> ANCIENT_OAK_TRAPDOOR = registerBlockItem("ancient_oak_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.ANCIENT_OAK_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    public static final DeferredBlock<@NotNull UntintedParticleLeavesBlock> ANCIENT_OAK_LEAVES = registerBlockItem("ancient_oak_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x2e5d38), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<@NotNull SaplingBlock> ANCIENT_OAK_SAPLING = registerBlockItem("ancient_oak_sapling",
            properties -> new SaplingBlock(DDTreeGrowers.ANCIENT_OAK, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final DeferredBlock<@NotNull FlowerPotBlock> POTTED_ANCIENT_OAK_SAPLING = registerBlockItem("potted_ancient_oak_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ANCIENT_OAK_SAPLING, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));



    // Charred
    public static final DeferredBlock<@NotNull DDWoodLogBlock> CHARRED_LOG = registerBlockItem("charred_log",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> STRIPPED_CHARRED_LOG = registerBlockItem("stripped_charred_log",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> CHARRED_WOOD = registerBlockItem("charred_wood",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> STRIPPED_CHARRED_WOOD = registerBlockItem("stripped_charred_wood",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<@NotNull Block> CHARRED_PLANKS = registerBlockItem("charred_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<@NotNull StairBlock> CHARRED_STAIRS = registerBlockItem("charred_stairs",
            properties -> new StairBlock(CHARRED_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CHARRED_PLANKS.get()));

    public static final DeferredBlock<@NotNull SlabBlock> CHARRED_SLAB = registerBlockItem("charred_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<@NotNull PressurePlateBlock> CHARRED_PRESSURE_PLATE = registerBlockItem("charred_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.CHARRED_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<@NotNull ButtonBlock> CHARRED_BUTTON = registerBlockItem("charred_button",
            properties -> new ButtonBlock(DDWoods.CHARRED_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<@NotNull FenceBlock> CHARRED_FENCE = registerBlockItem("charred_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<@NotNull FenceGateBlock> CHARRED_FENCE_GATE = registerBlockItem("charred_fence_gate",
            properties -> new FenceGateBlock(DDWoods.CHARRED_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<@NotNull DoorBlock> CHARRED_DOOR = registerBlockItem("charred_door",
            properties -> new DoorBlock(DDWoods.CHARRED_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<@NotNull TrapDoorBlock> CHARRED_TRAPDOOR = registerBlockItem("charred_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.CHARRED_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));



    // Eucalyptus
    public static final DeferredBlock<@NotNull DDWoodLogBlock> EUCALYPTUS_LOG = registerBlockItem("eucalyptus_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> STRIPPED_EUCALYPTUS_LOG = registerBlockItem("stripped_eucalyptus_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> EUCALYPTUS_WOOD = registerBlockItem("eucalyptus_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> STRIPPED_EUCALYPTUS_WOOD = registerBlockItem("stripped_eucalyptus_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<@NotNull Block> EUCALYPTUS_PLANKS = registerBlockItem("eucalyptus_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<@NotNull StairBlock> EUCALYPTUS_STAIRS = registerBlockItem("eucalyptus_stairs",
            properties -> new StairBlock(EUCALYPTUS_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EUCALYPTUS_PLANKS.get()));

    public static final DeferredBlock<@NotNull SlabBlock> EUCALYPTUS_SLAB = registerBlockItem("eucalyptus_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<@NotNull PressurePlateBlock> EUCALYPTUS_PRESSURE_PLATE = registerBlockItem("eucalyptus_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.EUCALYPTUS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<@NotNull ButtonBlock> EUCALYPTUS_BUTTON = registerBlockItem("eucalyptus_button",
            properties -> new ButtonBlock(DDWoods.EUCALYPTUS_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<@NotNull FenceBlock> EUCALYPTUS_FENCE = registerBlockItem("eucalyptus_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<@NotNull FenceGateBlock> EUCALYPTUS_FENCE_GATE = registerBlockItem("eucalyptus_fence_gate",
            properties -> new FenceGateBlock(DDWoods.EUCALYPTUS_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<@NotNull DoorBlock> EUCALYPTUS_DOOR = registerBlockItem("eucalyptus_door",
            properties -> new DoorBlock(DDWoods.EUCALYPTUS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<@NotNull TrapDoorBlock> EUCALYPTUS_TRAPDOOR = registerBlockItem("eucalyptus_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.EUCALYPTUS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    public static final DeferredBlock<@NotNull UntintedParticleLeavesBlock> EUCALYPTUS_LEAVES = registerBlockItem("eucalyptus_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x2e5d38), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<@NotNull SaplingBlock> EUCALYPTUS_SAPLING = registerBlockItem("eucalyptus_sapling",
            properties -> new SaplingBlock(DDTreeGrowers.EUCALYPTUS, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final DeferredBlock<@NotNull FlowerPotBlock> POTTED_EUCALYPTUS_SAPLING = registerBlockItem("potted_eucalyptus_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, EUCALYPTUS_SAPLING, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));



    // Sequoia
    public static final DeferredBlock<@NotNull DDWoodLogBlock> SEQUOIA_LOG = registerBlockItem("sequoia_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> STRIPPED_SEQUOIA_LOG = registerBlockItem("stripped_sequoia_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> SEQUOIA_WOOD = registerBlockItem("sequoia_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<@NotNull DDWoodLogBlock> STRIPPED_SEQUOIA_WOOD = registerBlockItem("stripped_sequoia_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<@NotNull Block> SEQUOIA_PLANKS = registerBlockItem("sequoia_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<@NotNull StairBlock> SEQUOIA_STAIRS = registerBlockItem("sequoia_stairs",
            properties -> new StairBlock(SEQUOIA_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(SEQUOIA_PLANKS.get()));

    public static final DeferredBlock<@NotNull SlabBlock> SEQUOIA_SLAB = registerBlockItem("sequoia_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<@NotNull PressurePlateBlock> SEQUOIA_PRESSURE_PLATE = registerBlockItem("sequoia_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.SEQUOIA_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<@NotNull ButtonBlock> SEQUOIA_BUTTON = registerBlockItem("sequoia_button",
            properties -> new ButtonBlock(DDWoods.SEQUOIA_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<@NotNull FenceBlock> SEQUOIA_FENCE = registerBlockItem("sequoia_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<@NotNull FenceGateBlock> SEQUOIA_FENCE_GATE = registerBlockItem("sequoia_fence_gate",
            properties -> new FenceGateBlock(DDWoods.SEQUOIA_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<@NotNull DoorBlock> SEQUOIA_DOOR = registerBlockItem("sequoia_door",
            properties -> new DoorBlock(DDWoods.SEQUOIA_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<@NotNull TrapDoorBlock> SEQUOIA_TRAPDOOR = registerBlockItem("sequoia_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.SEQUOIA_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    public static final DeferredBlock<@NotNull UntintedParticleLeavesBlock> SEQUOIA_LEAVES = registerBlockItem("sequoia_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x2e5d38), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<@NotNull SaplingBlock> SEQUOIA_SAPLING = registerBlockItem("sequoia_sapling",
            properties -> new SaplingBlock(DDTreeGrowers.SEQUOIA, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final DeferredBlock<@NotNull FlowerPotBlock> POTTED_SEQUOIA_SAPLING = registerBlockItem("potted_sequoia_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, SEQUOIA_SAPLING, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));

    // Dendranthos
    public static final DeferredBlock<DDWoodLogBlock> DENDRANTHOS_LOG = registerBlockItem("dendranthos_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> DENDRANTHOS_WOOD = registerBlockItem("dendranthos_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<Block> DENDRANTHOS_PLANKS = registerBlockItem("dendranthos_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<StairBlock> DENDRANTHOS_STAIRS = registerBlockItem("dendranthos_stairs",
            properties -> new StairBlock(DENDRANTHOS_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DENDRANTHOS_PLANKS.get()));

    public static final DeferredBlock<SlabBlock> DENDRANTHOS_SLAB = registerBlockItem("dendranthos_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<PressurePlateBlock> DENDRANTHOS_PRESSURE_PLATE = registerBlockItem("dendranthos_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.DENDRANTHOS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<ButtonBlock> DENDRANTHOS_BUTTON = registerBlockItem("dendranthos_button",
            properties -> new ButtonBlock(DDWoods.DENDRANTHOS_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<FenceBlock> DENDRANTHOS_FENCE = registerBlockItem("dendranthos_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<FenceGateBlock> DENDRANTHOS_FENCE_GATE = registerBlockItem("dendranthos_fence_gate",
            properties -> new FenceGateBlock(DDWoods.DENDRANTHOS_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    // Dendrymycos
    public static final DeferredBlock<DDWoodLogBlock> DENDRYMYCOS_LOG = registerBlockItem("dendrymycos_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> DENDRYMYCOS_WOOD = registerBlockItem("dendrymycos_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<Block> DENDRYMYCOS_PLANKS = registerBlockItem("dendrymycos_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<StairBlock> DENDRYMYCOS_STAIRS = registerBlockItem("dendrymycos_stairs",
            properties -> new StairBlock(DENDRYMYCOS_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DENDRYMYCOS_PLANKS.get()));

    public static final DeferredBlock<SlabBlock> DENDRYMYCOS_SLAB = registerBlockItem("dendrymycos_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<PressurePlateBlock> DENDRYMYCOS_PRESSURE_PLATE = registerBlockItem("dendrymycos_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.DENDRYMYCOS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<ButtonBlock> DENDRYMYCOS_BUTTON = registerBlockItem("dendrymycos_button",
            properties -> new ButtonBlock(DDWoods.DENDRYMYCOS_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<FenceBlock> DENDRYMYCOS_FENCE = registerBlockItem("dendrymycos_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<FenceGateBlock> DENDRYMYCOS_FENCE_GATE = registerBlockItem("dendrymycos_fence_gate",
            properties -> new FenceGateBlock(DDWoods.DENDRYMYCOS_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<Block> DENDRYMYCOS_CAP_BLUE = registerBlockItem("dendrymycos_cap_blue", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK));

    public static final DeferredBlock<Block> DENDRYMYCOS_CAP_GREEN = registerBlockItem("dendrymycos_cap_green", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK));

    // Fertile
    public static final DeferredBlock<@NotNull FertileSoilBlock> FERTILE_SOIL = registerBlockItem("fertile_soil", FertileSoilBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK));


    // Distant Grasses
    public static final DeferredBlock<@NotNull GrassBlock> DISTANT_GRASS = registerBlockItem("distant_grass",
            properties -> new GrassBlock(properties) {
                private boolean canSurvive(ServerLevel level, BlockPos pos) {
                    BlockPos abovePos = pos.above();
                    BlockState aboveState = level.getBlockState(abovePos);
                    return !aboveState.isSolidRender();
                }

                // TODO: fix distant dirt not turning back into distant grass when left for long enough (possibly create DDGrass class for all grasses we will create)
                @Override
                protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
                    if (!canSurvive(level, pos)) {
                        level.setBlockAndUpdate(pos, DISTANT_DIRT.get().defaultBlockState());
                        return;
                    }

                    if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
                        for (int i = 0; i < 4; i++) {
                            BlockPos targetPos = pos.offset(
                                    random.nextInt(3) - 1,
                                    random.nextInt(5) - 3,
                                    random.nextInt(3) - 1
                            );
                            if (level.getBlockState(targetPos).is(DDBlocks.DISTANT_DIRT.get())) {
                                if (canSurvive(level, targetPos)) {
                                    level.setBlockAndUpdate(pos, DISTANT_GRASS.get().defaultBlockState());
                                }
                            }
                        }
                    }
                }
            },
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK));

    public static final DeferredBlock<@NotNull Block> DISTANT_DIRT = registerBlockItem("distant_dirt", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT));


    // Distant Stone
    public static final DeferredBlock<@NotNull Block> DISTANT_STONE = registerBlockItem("distant_stone",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));

    public static final DeferredBlock<@NotNull StairBlock> DISTANT_STONE_STAIRS = registerBlockItem("distant_stone_stairs",
            properties -> new StairBlock(DISTANT_STONE.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DISTANT_STONE.get()));

    public static final DeferredBlock<@NotNull SlabBlock> DISTANT_STONE_SLAB = registerBlockItem("distant_stone_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> DISTANT_STONE_WALL = registerBlockItem("distant_stone_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL));

    public static final DeferredBlock<@NotNull Block> DISTANT_COBBLE = registerBlockItem("distant_cobble",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE));

    public static final DeferredBlock<@NotNull StairBlock> DISTANT_COBBLE_STAIRS = registerBlockItem("distant_cobble_stairs",
            properties -> new StairBlock(DISTANT_COBBLE.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DISTANT_COBBLE.get()));

    public static final DeferredBlock<@NotNull SlabBlock> DISTANT_COBBLE_SLAB = registerBlockItem("distant_cobble_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> DISTANT_COBBLE_WALL = registerBlockItem("distant_cobble_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL));

    public static final DeferredBlock<@NotNull Block> DISTANT_STONE_POLISHED = registerBlockItem("distant_stone_polished",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE));

    public static final DeferredBlock<@NotNull StairBlock> DISTANT_STONE_POLISHED_STAIRS = registerBlockItem("distant_stone_polished_stairs",
            properties -> new StairBlock(DISTANT_STONE_POLISHED.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DISTANT_STONE_POLISHED.get()));

    public static final DeferredBlock<@NotNull SlabBlock> DISTANT_STONE_POLISHED_SLAB = registerBlockItem("distant_stone_polished_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> DISTANT_STONE_POLISHED_WALL = registerBlockItem("distant_stone_polished_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE_WALL));

    public static final DeferredBlock<@NotNull Block> DISTANT_STONE_BRICKS = registerBlockItem("distant_stone_bricks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS));

    public static final DeferredBlock<@NotNull StairBlock> DISTANT_STONE_BRICK_STAIRS = registerBlockItem("distant_stone_brick_stairs",
            properties -> new StairBlock(DISTANT_STONE_BRICKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(DISTANT_STONE_BRICKS.get()));

    public static final DeferredBlock<@NotNull SlabBlock> DISTANT_STONE_BRICK_SLAB = registerBlockItem("distant_stone_brick_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> DISTANT_STONE_BRICK_WALL = registerBlockItem("distant_stone_brick_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL));

    // Limestone

    // Islate
    public static final DeferredBlock<@NotNull Block> ISLATE = registerBlockItem("islate",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE));

    public static final DeferredBlock<@NotNull StairBlock> ISLATE_STAIRS = registerBlockItem("islate_stairs",
            properties -> new StairBlock(ISLATE.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ISLATE.get()));

    public static final DeferredBlock<@NotNull SlabBlock> ISLATE_SLAB = registerBlockItem("islate_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> ISLATE_WALL = registerBlockItem("islate_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE_WALL));

    public static final DeferredBlock<@NotNull Block> ISLATE_COBBLED = registerBlockItem("islate_cobbled",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE));

    public static final DeferredBlock<@NotNull StairBlock> ISLATE_COBBLED_STAIRS = registerBlockItem("islate_cobbled_stairs",
            properties -> new StairBlock(ISLATE_COBBLED.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ISLATE_COBBLED.get()));

    public static final DeferredBlock<@NotNull SlabBlock> ISLATE_COBBLED_SLAB = registerBlockItem("islate_cobbled_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> ISLATE_COBBLED_WALL = registerBlockItem("islate_cobbled_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE_WALL));

    public static final DeferredBlock<@NotNull Block> ISLATE_POLISHED = registerBlockItem("islate_polished",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE));

    public static final DeferredBlock<@NotNull StairBlock> ISLATE_POLISHED_STAIRS = registerBlockItem("islate_polished_stairs",
            properties -> new StairBlock(ISLATE_POLISHED.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ISLATE_POLISHED.get()));

    public static final DeferredBlock<@NotNull SlabBlock> ISLATE_POLISHED_SLAB = registerBlockItem("islate_polished_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> ISLATE_POLISHED_WALL = registerBlockItem("islate_polished_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE_WALL));

    public static final DeferredBlock<@NotNull Block> ISLATE_BRICKS = registerBlockItem("islate_bricks",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS));

    public static final DeferredBlock<@NotNull StairBlock> ISLATE_BRICK_STAIRS = registerBlockItem("islate_brick_stairs",
            properties -> new StairBlock(ISLATE_BRICKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ISLATE_BRICKS.get()));

    public static final DeferredBlock<@NotNull SlabBlock> ISLATE_BRICK_SLAB = registerBlockItem("islate_brick_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICK_SLAB));

    public static final DeferredBlock<@NotNull WallBlock> ISLATE_BRICK_WALL = registerBlockItem("islate_brick_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICK_WALL));


    // Rhyolite
    public static final DeferredBlock<Block> RHYOLITE = registerBlockItem("rhyolite",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE));

    public static final DeferredBlock<StairBlock> RHYOLITE_STAIRS = registerBlockItem("rhyolite_stairs",
            properties -> new StairBlock(RHYOLITE.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(RHYOLITE.get()));

    public static final DeferredBlock<SlabBlock> RHYOLITE_SLAB = registerBlockItem("rhyolite_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE_SLAB));

    public static final DeferredBlock<WallBlock> RHYOLITE_WALL = registerBlockItem("rhyolite_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE_WALL));

    public static final DeferredBlock<Block> RHYOLITE_BRICKS = registerBlockItem("rhyolite_bricks",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE));

    public static final DeferredBlock<StairBlock> RHYOLITE_BRICK_STAIRS = registerBlockItem("rhyolite_brick_stairs",
            properties -> new StairBlock(RHYOLITE_BRICKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(RHYOLITE_BRICKS.get()));

    public static final DeferredBlock<SlabBlock> RHYOLITE_BRICK_SLAB = registerBlockItem("rhyolite_brick_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE_SLAB));

    public static final DeferredBlock<WallBlock> RHYOLITE_BRICK_WALL = registerBlockItem("rhyolite_brick_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE_WALL));

    public static final DeferredBlock<Block> RHYOLITE_TILES = registerBlockItem("rhyolite_tiles",Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILES));

    public static final DeferredBlock<StairBlock> RHYOLITE_TILE_STAIRS = registerBlockItem("rhyolite_tile_stairs",
            properties -> new StairBlock(RHYOLITE_TILES.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(RHYOLITE_TILES.get()));

    public static final DeferredBlock<SlabBlock> RHYOLITE_TILE_SLAB = registerBlockItem("rhyolite_tile_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILE_SLAB));

    public static final DeferredBlock<WallBlock> RHYOLITE_TILE_WALL = registerBlockItem("rhyolite_tile_wall", WallBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_TILE_WALL));

    // *** HELPER METHODS ***
    private static <T extends Block> DeferredBlock<@NotNull T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block,
                                                                             Supplier<BlockBehaviour.Properties> properties) {
        return BLOCKS.register(name, () -> block.apply(properties.get().setId(ResourceKey.create(Registries.BLOCK, DistantDreams.prefix(name)))));
    }

    public static <T extends Block> DeferredBlock<@NotNull T> registerBlockItem(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return registerBlockItem(name, block, properties, Item.Properties::new);
    }

    public static <T extends Block> DeferredBlock<@NotNull T> registerBlockItem(String name, Function<BlockBehaviour.Properties, T> block,
                                                                                Supplier<BlockBehaviour.Properties> properties, Supplier<Item.Properties> itemProperties) {
        DeferredBlock<@NotNull T> toReturn = registerBlock(name, block, properties);
        DDItems.register(name, itemProps -> new BlockItem(toReturn.get(), itemProps.useBlockDescriptionPrefix()), itemProperties);
        return toReturn;
    }
    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
