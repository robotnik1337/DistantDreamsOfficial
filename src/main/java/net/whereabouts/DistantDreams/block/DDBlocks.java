package net.whereabouts.DistantDreams.block;

import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
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

import java.util.function.Function;
import java.util.function.Supplier;

public class DDBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DistantDreams.MOD_ID);

    // Ancient Oak
    public static final DeferredBlock<AncientOakBlock> ANCIENT_OAK_LOG = registerBlockItem("ancient_oak_log", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<AncientOakBlock> STRIPPED_ANCIENT_OAK_LOG = registerBlockItem("stripped_ancient_oak_log", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<AncientOakBlock> ANCIENT_OAK_WOOD = registerBlockItem("ancient_oak_wood", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<AncientOakBlock> STRIPPED_ANCIENT_OAK_WOOD = registerBlockItem("stripped_ancient_oak_wood", AncientOakBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<Block> ANCIENT_OAK_PLANKS = registerBlockItem("ancient_oak_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<StairBlock> ANCIENT_OAK_STAIRS = registerBlockItem("ancient_oak_stairs",
            properties -> new StairBlock(ANCIENT_OAK_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(ANCIENT_OAK_PLANKS.get()));

    public static final DeferredBlock<SlabBlock> ANCIENT_OAK_SLAB = registerBlockItem("ancient_oak_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<PressurePlateBlock> ANCIENT_OAK_PRESSURE_PLATE = registerBlockItem("ancient_oak_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.ANCIENT_OAK_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<ButtonBlock> ANCIENT_OAK_BUTTON = registerBlockItem("ancient_oak_button",
            properties -> new ButtonBlock(DDWoods.ANCIENT_OAK_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<FenceBlock> ANCIENT_OAK_FENCE = registerBlockItem("ancient_oak_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<FenceGateBlock> ANCIENT_OAK_FENCE_GATE = registerBlockItem("ancient_oak_fence_gate",
            properties -> new FenceGateBlock(DDWoods.ANCIENT_OAK_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<DoorBlock> ANCIENT_OAK_DOOR = registerBlockItem("ancient_oak_door",
            properties -> new DoorBlock(DDWoods.ANCIENT_OAK_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<TrapDoorBlock> ANCIENT_OAK_TRAPDOOR = registerBlockItem("ancient_oak_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.ANCIENT_OAK_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    public static final DeferredBlock<UntintedParticleLeavesBlock> ANCIENT_OAK_LEAVES = registerBlockItem("ancient_oak_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x2e5d38), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<SaplingBlock> ANCIENT_OAK_SAPLING = registerBlockItem("ancient_oak_sapling",
            properties -> new SaplingBlock(DDTreeGrowers.ANCIENT_OAK, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final DeferredBlock<FlowerPotBlock> POTTED_ANCIENT_OAK_SAPLING = registerBlockItem("potted_ancient_oak_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ANCIENT_OAK_SAPLING, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));



    // Charred
    public static final DeferredBlock<DDWoodLogBlock> CHARRED_LOG = registerBlockItem("charred_log",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> STRIPPED_CHARRED_LOG = registerBlockItem("stripped_charred_log",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> CHARRED_WOOD = registerBlockItem("charred_wood",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<DDWoodLogBlock> STRIPPED_CHARRED_WOOD = registerBlockItem("stripped_charred_wood",
            properties -> new DDWoodLogBlock(properties, 0, 0),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<Block> CHARRED_PLANKS = registerBlockItem("charred_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<StairBlock> CHARRED_STAIRS = registerBlockItem("charred_stairs",
            properties -> new StairBlock(CHARRED_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(CHARRED_PLANKS.get()));

    public static final DeferredBlock<SlabBlock> CHARRED_SLAB = registerBlockItem("charred_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<PressurePlateBlock> CHARRED_PRESSURE_PLATE = registerBlockItem("charred_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.CHARRED_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<ButtonBlock> CHARRED_BUTTON = registerBlockItem("charred_button",
            properties -> new ButtonBlock(DDWoods.CHARRED_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<FenceBlock> CHARRED_FENCE = registerBlockItem("charred_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<FenceGateBlock> CHARRED_FENCE_GATE = registerBlockItem("charred_fence_gate",
            properties -> new FenceGateBlock(DDWoods.CHARRED_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<DoorBlock> CHARRED_DOOR = registerBlockItem("charred_door",
            properties -> new DoorBlock(DDWoods.CHARRED_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<TrapDoorBlock> CHARRED_TRAPDOOR = registerBlockItem("charred_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.CHARRED_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));



    // Eucalyptus
    public static final DeferredBlock<DDWoodLogBlock> EUCALYPTUS_LOG = registerBlockItem("eucalyptus_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> STRIPPED_EUCALYPTUS_LOG = registerBlockItem("stripped_eucalyptus_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> EUCALYPTUS_WOOD = registerBlockItem("eucalyptus_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<DDWoodLogBlock> STRIPPED_EUCALYPTUS_WOOD = registerBlockItem("stripped_eucalyptus_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<Block> EUCALYPTUS_PLANKS = registerBlockItem("eucalyptus_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<StairBlock> EUCALYPTUS_STAIRS = registerBlockItem("eucalyptus_stairs",
            properties -> new StairBlock(EUCALYPTUS_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(EUCALYPTUS_PLANKS.get()));

    public static final DeferredBlock<SlabBlock> EUCALYPTUS_SLAB = registerBlockItem("eucalyptus_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<PressurePlateBlock> EUCALYPTUS_PRESSURE_PLATE = registerBlockItem("eucalyptus_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.EUCALYPTUS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<ButtonBlock> EUCALYPTUS_BUTTON = registerBlockItem("eucalyptus_button",
            properties -> new ButtonBlock(DDWoods.EUCALYPTUS_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<FenceBlock> EUCALYPTUS_FENCE = registerBlockItem("eucalyptus_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<FenceGateBlock> EUCALYPTUS_FENCE_GATE = registerBlockItem("eucalyptus_fence_gate",
            properties -> new FenceGateBlock(DDWoods.EUCALYPTUS_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<DoorBlock> EUCALYPTUS_DOOR = registerBlockItem("eucalyptus_door",
            properties -> new DoorBlock(DDWoods.EUCALYPTUS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<TrapDoorBlock> EUCALYPTUS_TRAPDOOR = registerBlockItem("eucalyptus_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.EUCALYPTUS_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    public static final DeferredBlock<UntintedParticleLeavesBlock> EUCALYPTUS_LEAVES = registerBlockItem("eucalyptus_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x2e5d38), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<SaplingBlock> EUCALYPTUS_SAPLING = registerBlockItem("eucalyptus_sapling",
            properties -> new SaplingBlock(DDTreeGrowers.EUCALYPTUS, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final DeferredBlock<FlowerPotBlock> POTTED_EUCALYPTUS_SAPLING = registerBlockItem("potted_eucalyptus_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, EUCALYPTUS_SAPLING, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));



    // Sequoia
    public static final DeferredBlock<DDWoodLogBlock> SEQUOIA_LOG = registerBlockItem("sequoia_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> STRIPPED_SEQUOIA_LOG = registerBlockItem("stripped_sequoia_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<DDWoodLogBlock> SEQUOIA_WOOD = registerBlockItem("sequoia_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<DDWoodLogBlock> STRIPPED_SEQUOIA_WOOD = registerBlockItem("stripped_sequoia_wood", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<Block> SEQUOIA_PLANKS = registerBlockItem("sequoia_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    public static final DeferredBlock<StairBlock> SEQUOIA_STAIRS = registerBlockItem("sequoia_stairs",
            properties -> new StairBlock(SEQUOIA_PLANKS.get().defaultBlockState(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(SEQUOIA_PLANKS.get()));

    public static final DeferredBlock<SlabBlock> SEQUOIA_SLAB = registerBlockItem("sequoia_slab", SlabBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<PressurePlateBlock> SEQUOIA_PRESSURE_PLATE = registerBlockItem("sequoia_pressure_plate",
            properties -> new PressurePlateBlock(DDWoods.SEQUOIA_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<ButtonBlock> SEQUOIA_BUTTON = registerBlockItem("sequoia_button",
            properties -> new ButtonBlock(DDWoods.SEQUOIA_WOOD_SET, 30, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<FenceBlock> SEQUOIA_FENCE = registerBlockItem("sequoia_fence", FenceBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<FenceGateBlock> SEQUOIA_FENCE_GATE = registerBlockItem("sequoia_fence_gate",
            properties -> new FenceGateBlock(DDWoods.SEQUOIA_WOOD_TYPE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<DoorBlock> SEQUOIA_DOOR = registerBlockItem("sequoia_door",
            properties -> new DoorBlock(DDWoods.SEQUOIA_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<TrapDoorBlock> SEQUOIA_TRAPDOOR = registerBlockItem("sequoia_trapdoor",
            properties -> new TrapDoorBlock(DDWoods.SEQUOIA_WOOD_SET, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    public static final DeferredBlock<UntintedParticleLeavesBlock> SEQUOIA_LEAVES = registerBlockItem("sequoia_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01F, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x2e5d38), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<SaplingBlock> SEQUOIA_SAPLING = registerBlockItem("sequoia_sapling",
            properties -> new SaplingBlock(DDTreeGrowers.SEQUOIA, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final DeferredBlock<FlowerPotBlock> POTTED_SEQUOIA_SAPLING = registerBlockItem("potted_sequoia_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, SEQUOIA_SAPLING, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT));



    // Fertile
    public static final DeferredBlock<FertileSoilBlock> FERTILE_SOIL = registerBlockItem("fertile_soil", FertileSoilBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK));




    // *** HELPER METHODS ***
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block,
                                                           Supplier<BlockBehaviour.Properties> properties) {
        return BLOCKS.register(name, () -> block.apply(properties.get().setId(ResourceKey.create(Registries.BLOCK, DistantDreams.prefix(name)))));
    }

    public static <T extends Block> DeferredBlock<T> registerBlockItem(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return registerBlockItem(name, block, properties, Item.Properties::new);
    }

    public static <T extends Block> DeferredBlock<T> registerBlockItem(String name, Function<BlockBehaviour.Properties, T> block,
                                                                       Supplier<BlockBehaviour.Properties> properties, Supplier<Item.Properties> itemProperties) {
        DeferredBlock<T> toReturn = registerBlock(name, block, properties);
        DDItems.register(name, itemProps -> new BlockItem(toReturn.get(), itemProps.useBlockDescriptionPrefix()), itemProperties);
        return toReturn;
    }
    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
