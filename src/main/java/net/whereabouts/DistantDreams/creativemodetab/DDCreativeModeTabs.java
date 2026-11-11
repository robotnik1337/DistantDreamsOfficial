package net.whereabouts.DistantDreams.creativemodetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.item.DDItems;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class DDCreativeModeTabs {
    public static final DeferredRegister<@NotNull CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DistantDreams.MOD_ID);

    public static final Supplier<CreativeModeTab> DISTANT_DREAMS_TAB = CREATIVE_MODE_TABS.register(
            "distant_dreams_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(DDItems.MUSIC_DISC_HYPNAGOGIA.get()))
                    .title(Component.translatable("itemGroup.distantdreams"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(DDBlocks.ANCIENT_ACACIA_LOG.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_ACACIA_LOG.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_ACACIA_WOOD.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_PLANKS.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_STAIRS.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_SLAB.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_FENCE.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_FENCE_GATE.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_DOOR.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_TRAPDOOR.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_BUTTON.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_LEAVES.get());
                        output.accept(DDBlocks.ANCIENT_ACACIA_SAPLING.get());

                        output.accept(DDBlocks.ANCIENT_BIRCH_LOG.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_BIRCH_LOG.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_BIRCH_WOOD.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_PLANKS.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_STAIRS.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_SLAB.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_FENCE.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_FENCE_GATE.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_DOOR.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_TRAPDOOR.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_BUTTON.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_LEAVES.get());
                        output.accept(DDBlocks.ANCIENT_BIRCH_SAPLING.get());

                        output.accept(DDBlocks.ANCIENT_MANGROVE_LOG.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_MANGROVE_LOG.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_MANGROVE_WOOD.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_PLANKS.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_STAIRS.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_SLAB.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_FENCE.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_FENCE_GATE.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_DOOR.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_TRAPDOOR.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_BUTTON.get());
                        output.accept(DDBlocks.ANCIENT_MANGROVE_LEAVES.get());

                        output.accept(DDBlocks.ANCIENT_OAK_LOG.get());
                        output.accept(DDBlocks.ANCIENT_OAK_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get());
                        output.accept(DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get());
                        output.accept(DDBlocks.ANCIENT_OAK_PLANKS.get());
                        output.accept(DDBlocks.ANCIENT_OAK_STAIRS.get());
                        output.accept(DDBlocks.ANCIENT_OAK_SLAB.get());
                        output.accept(DDBlocks.ANCIENT_OAK_FENCE.get());
                        output.accept(DDBlocks.ANCIENT_OAK_FENCE_GATE.get());
                        output.accept(DDBlocks.ANCIENT_OAK_DOOR.get());
                        output.accept(DDBlocks.ANCIENT_OAK_TRAPDOOR.get());
                        output.accept(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.ANCIENT_OAK_BUTTON.get());
                        output.accept(DDBlocks.ANCIENT_OAK_LEAVES.get());
                        output.accept(DDBlocks.ANCIENT_OAK_SAPLING.get());

                        output.accept(DDBlocks.CHARRED_LOG.get());
                        output.accept(DDBlocks.CHARRED_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_CHARRED_LOG.get());
                        output.accept(DDBlocks.STRIPPED_CHARRED_WOOD.get());
                        output.accept(DDBlocks.CHARRED_PLANKS.get());
                        output.accept(DDBlocks.CHARRED_STAIRS.get());
                        output.accept(DDBlocks.CHARRED_SLAB.get());
                        output.accept(DDBlocks.CHARRED_FENCE.get());
                        output.accept(DDBlocks.CHARRED_FENCE_GATE.get());
                        output.accept(DDBlocks.CHARRED_DOOR.get());
                        output.accept(DDBlocks.CHARRED_TRAPDOOR.get());
                        output.accept(DDBlocks.CHARRED_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.CHARRED_BUTTON.get());

                        output.accept(DDBlocks.EUCALYPTUS_LOG.get());
                        output.accept(DDBlocks.EUCALYPTUS_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get());
                        output.accept(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
                        output.accept(DDBlocks.EUCALYPTUS_PLANKS.get());
                        output.accept(DDBlocks.EUCALYPTUS_STAIRS.get());
                        output.accept(DDBlocks.EUCALYPTUS_SLAB.get());
                        output.accept(DDBlocks.EUCALYPTUS_FENCE.get());
                        output.accept(DDBlocks.EUCALYPTUS_FENCE_GATE.get());
                        output.accept(DDBlocks.EUCALYPTUS_DOOR.get());
                        output.accept(DDBlocks.EUCALYPTUS_TRAPDOOR.get());
                        output.accept(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.EUCALYPTUS_BUTTON.get());
                        output.accept(DDBlocks.EUCALYPTUS_LEAVES.get());
                        output.accept(DDBlocks.EUCALYPTUS_SAPLING.get());

                        output.accept(DDBlocks.SEQUOIA_LOG.get());
                        output.accept(DDBlocks.SEQUOIA_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_SEQUOIA_LOG.get());
                        output.accept(DDBlocks.STRIPPED_SEQUOIA_WOOD.get());
                        output.accept(DDBlocks.SEQUOIA_PLANKS.get());
                        output.accept(DDBlocks.SEQUOIA_STAIRS.get());
                        output.accept(DDBlocks.SEQUOIA_SLAB.get());
                        output.accept(DDBlocks.SEQUOIA_FENCE.get());
                        output.accept(DDBlocks.SEQUOIA_FENCE_GATE.get());
                        output.accept(DDBlocks.SEQUOIA_DOOR.get());
                        output.accept(DDBlocks.SEQUOIA_TRAPDOOR.get());
                        output.accept(DDBlocks.SEQUOIA_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.SEQUOIA_BUTTON.get());
                        output.accept(DDBlocks.SEQUOIA_LEAVES.get());
                        output.accept(DDBlocks.SEQUOIA_SAPLING.get());

                        output.accept(DDBlocks.DENDRANTHOS_LOG.get());
                        output.accept(DDBlocks.DENDRANTHOS_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_DENDRANTHOS_LOG.get());
                        output.accept(DDBlocks.STRIPPED_DENDRANTHOS_WOOD.get());
                        output.accept(DDBlocks.DENDRANTHOS_PLANKS.get());
                        output.accept(DDBlocks.DENDRANTHOS_STAIRS.get());
                        output.accept(DDBlocks.DENDRANTHOS_SLAB.get());
                        output.accept(DDBlocks.DENDRANTHOS_FENCE.get());
                        output.accept(DDBlocks.DENDRANTHOS_FENCE_GATE.get());
                        output.accept(DDBlocks.DENDRANTHOS_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.DENDRANTHOS_DOOR.get());
                        output.accept(DDBlocks.DENDRANTHOS_TRAPDOOR.get());
                        output.accept(DDBlocks.DENDRANTHOS_ANTHER.get());
                        output.accept(DDBlocks.DENDRANTHOS_PETALS.get());

                        output.accept(DDBlocks.DENDRYMYCOS_LOG.get());
                        output.accept(DDBlocks.DENDRYMYCOS_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_DENDRYMYCOS_LOG.get());
                        output.accept(DDBlocks.STRIPPED_DENDRYMYCOS_WOOD.get());
                        output.accept(DDBlocks.DENDRYMYCOS_PLANKS.get());
                        output.accept(DDBlocks.DENDRYMYCOS_STAIRS.get());
                        output.accept(DDBlocks.DENDRYMYCOS_SLAB.get());
                        output.accept(DDBlocks.DENDRYMYCOS_FENCE.get());
                        output.accept(DDBlocks.DENDRYMYCOS_FENCE_GATE.get());
                        output.accept(DDBlocks.DENDRYMYCOS_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.DENDRYMYCOS_DOOR.get());
                        output.accept(DDBlocks.DENDRYMYCOS_TRAPDOOR.get());
                        output.accept(DDBlocks.DENDRYMYCOS_CAP_BLUE.get());
                        output.accept(DDBlocks.DENDRYMYCOS_CAP_GREEN.get());

                        output.accept(DDBlocks.FERTILE_SOIL.get());

                        output.accept(DDBlocks.DISTANT_GRASS.get());
                        output.accept(DDBlocks.DISTANT_DIRT.get());

                        output.accept(DDBlocks.DISTANT_STONE.get());
                        output.accept(DDBlocks.DISTANT_STONE_STAIRS.get());
                        output.accept(DDBlocks.DISTANT_STONE_SLAB.get());
                        output.accept(DDBlocks.DISTANT_STONE_WALL.get());
                        output.accept(DDBlocks.DISTANT_COBBLE.get());
                        output.accept(DDBlocks.DISTANT_COBBLE_STAIRS.get());
                        output.accept(DDBlocks.DISTANT_COBBLE_SLAB.get());
                        output.accept(DDBlocks.DISTANT_COBBLE_WALL.get());
                        output.accept(DDBlocks.DISTANT_STONE_POLISHED.get());
                        output.accept(DDBlocks.DISTANT_STONE_POLISHED_STAIRS.get());
                        output.accept(DDBlocks.DISTANT_STONE_POLISHED_SLAB.get());
                        output.accept(DDBlocks.DISTANT_STONE_POLISHED_WALL.get());
                        output.accept(DDBlocks.DISTANT_STONE_BRICKS.get());
                        output.accept(DDBlocks.DISTANT_STONE_BRICK_STAIRS.get());
                        output.accept(DDBlocks.DISTANT_STONE_BRICK_SLAB.get());
                        output.accept(DDBlocks.DISTANT_STONE_BRICK_WALL.get());
                        output.accept(DDBlocks.MOSSY_DISTANT_STONE_BRICKS.get());
                        output.accept(DDBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get());
                        output.accept(DDBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get());
                        output.accept(DDBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get());
                        output.accept(DDBlocks.CRACKED_DISTANT_STONE_BRICKS.get());

                        output.accept(DDBlocks.LIMESTONE_POWDER.get());
                        output.accept(DDBlocks.LIMESTONE.get());
                        output.accept(DDBlocks.LIMESTONE_STAIRS.get());
                        output.accept(DDBlocks.LIMESTONE_SLAB.get());
                        output.accept(DDBlocks.LIMESTONE_WALL.get());
                        output.accept(DDBlocks.POLISHED_LIMESTONE.get());
                        output.accept(DDBlocks.POLISHED_LIMESTONE_STAIRS.get());
                        output.accept(DDBlocks.POLISHED_LIMESTONE_SLAB.get());
                        output.accept(DDBlocks.POLISHED_LIMESTONE_WALL.get());
                        output.accept(DDBlocks.LIMESTONE_BRICKS.get());
                        output.accept(DDBlocks.LIMESTONE_BRICK_STAIRS.get());
                        output.accept(DDBlocks.LIMESTONE_BRICK_SLAB.get());
                        output.accept(DDBlocks.LIMESTONE_BRICK_WALL.get());
                        output.accept(DDBlocks.MOSSY_LIMESTONE_BRICKS.get());
                        output.accept(DDBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get());
                        output.accept(DDBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get());
                        output.accept(DDBlocks.MOSSY_LIMESTONE_BRICK_WALL.get());
                        output.accept(DDBlocks.LIMESTONE_PILLAR.get());
                        output.accept(DDBlocks.CRACKED_LIMESTONE_BRICKS.get());

                        output.accept(DDBlocks.DISTANT_SAND.get());
                        output.accept(DDBlocks.DISTANT_SANDSTONE.get());
                        output.accept(DDBlocks.SMOOTH_DISTANT_SANDSTONE.get());
                        output.accept(DDBlocks.SMOOTH_DISTANT_SANDSTONE_STAIRS.get());
                        output.accept(DDBlocks.SMOOTH_DISTANT_SANDSTONE_SLAB.get());
                        output.accept(DDBlocks.SMOOTH_DISTANT_SANDSTONE_WALL.get());
                        output.accept(DDBlocks.DISTANT_SANDSTONE_BRICKS.get());
                        output.accept(DDBlocks.DISTANT_SANDSTONE_BRICK_STAIRS.get());
                        output.accept(DDBlocks.DISTANT_SANDSTONE_BRICK_SLAB.get());
                        output.accept(DDBlocks.DISTANT_SANDSTONE_BRICK_WALL.get());

                        output.accept(DDBlocks.ISLATE.get());
                        output.accept(DDBlocks.ISLATE_STAIRS.get());
                        output.accept(DDBlocks.ISLATE_SLAB.get());
                        output.accept(DDBlocks.ISLATE_WALL.get());
                        output.accept(DDBlocks.ISLATE_COBBLED.get());
                        output.accept(DDBlocks.ISLATE_COBBLED_STAIRS.get());
                        output.accept(DDBlocks.ISLATE_COBBLED_SLAB.get());
                        output.accept(DDBlocks.ISLATE_COBBLED_WALL.get());
                        output.accept(DDBlocks.ISLATE_POLISHED.get());
                        output.accept(DDBlocks.ISLATE_POLISHED_STAIRS.get());
                        output.accept(DDBlocks.ISLATE_POLISHED_SLAB.get());
                        output.accept(DDBlocks.ISLATE_POLISHED_WALL.get());
                        output.accept(DDBlocks.ISLATE_BRICKS.get());
                        output.accept(DDBlocks.ISLATE_BRICK_STAIRS.get());
                        output.accept(DDBlocks.ISLATE_BRICK_SLAB.get());
                        output.accept(DDBlocks.ISLATE_BRICK_WALL.get());

                        output.accept(DDBlocks.PEAT.get());
                        output.accept(DDBlocks.PEAT_STAIRS.get());
                        output.accept(DDBlocks.PEAT_SLAB.get());
                        output.accept(DDBlocks.PEAT_WALL.get());
                        output.accept(DDBlocks.PACKED_PEAT.get());
                        output.accept(DDBlocks.PACKED_PEAT_STAIRS.get());
                        output.accept(DDBlocks.PACKED_PEAT_SLAB.get());
                        output.accept(DDBlocks.PACKED_PEAT_WALL.get());
                        output.accept(DDBlocks.PEAT_BRICKS.get());
                        output.accept(DDBlocks.PEAT_BRICK_STAIRS.get());
                        output.accept(DDBlocks.PEAT_BRICK_SLAB.get());
                        output.accept(DDBlocks.PEAT_BRICK_WALL.get());
                        output.accept(DDBlocks.CHISELED_PEAT.get());

                        output.accept(DDBlocks.RHYOLITE.get());
                        output.accept(DDBlocks.RHYOLITE_STAIRS.get());
                        output.accept(DDBlocks.RHYOLITE_SLAB.get());
                        output.accept(DDBlocks.RHYOLITE_WALL.get());
                        output.accept(DDBlocks.RHYOLITE_BRICKS.get());
                        output.accept(DDBlocks.RHYOLITE_BRICK_STAIRS.get());
                        output.accept(DDBlocks.RHYOLITE_BRICK_SLAB.get());
                        output.accept(DDBlocks.RHYOLITE_BRICK_WALL.get());
                        output.accept(DDBlocks.RHYOLITE_TILES.get());
                        output.accept(DDBlocks.RHYOLITE_TILE_STAIRS.get());
                        output.accept(DDBlocks.RHYOLITE_TILE_SLAB.get());
                        output.accept(DDBlocks.RHYOLITE_TILE_WALL.get());

                        output.accept(DDItems.MUSIC_DISC_HYPNAGOGIA.get());

                    }).build()
    );

    public static void register (IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
