package net.Bankgo.DistantDreams.item;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DistantDreams.MODID);

    public static final RegistryObject<CreativeModeTab> DISTANT_DREAMS_TAB = CREATIVE_MODE_TABS.register(
            "distant_dreams_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.EUCALYPTUS_PLANKS.get()))
                    .title(Component.translatable("creativetab.distantdreams.distant_dreams_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.EUCALYPTUS_LOG.get());
                        output.accept(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get());
                        output.accept(ModBlocks.EUCALYPTUS_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
                        output.accept(ModBlocks.EUCALYPTUS_PLANKS.get());
                        output.accept(ModBlocks.EUCALYPTUS_STAIRS.get());
                        output.accept(ModBlocks.EUCALYPTUS_SLAB.get());
                        output.accept(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.EUCALYPTUS_BUTTON.get());
                        output.accept(ModBlocks.EUCALYPTUS_FENCE.get());
                        output.accept(ModBlocks.EUCALYPTUS_FENCE_GATE.get());
                        output.accept(ModBlocks.EUCALYPTUS_DOOR.get());
                        output.accept(ModBlocks.EUCALYPTUS_TRAPDOOR.get());
                        output.accept(ModBlocks.EUCALYPTUS_LEAVES.get());
                        output.accept(ModItems.EUCALYPTUS_SAPLING.get());
                        output.accept(ModBlocks.SEQUOIA_LOG.get());
                        output.accept(ModBlocks.STRIPPED_SEQUOIA_LOG.get());
                        output.accept(ModBlocks.SEQUOIA_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_SEQUOIA_WOOD.get());
                        output.accept(ModBlocks.SEQUOIA_PLANKS.get());
                        output.accept(ModBlocks.SEQUOIA_STAIRS.get());
                        output.accept(ModBlocks.SEQUOIA_SLAB.get());
                        output.accept(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.SEQUOIA_BUTTON.get());
                        output.accept(ModBlocks.SEQUOIA_FENCE.get());
                        output.accept(ModBlocks.SEQUOIA_FENCE_GATE.get());
                        output.accept(ModBlocks.SEQUOIA_DOOR.get());
                        output.accept(ModBlocks.SEQUOIA_TRAPDOOR.get());
                        output.accept(ModBlocks.SEQUOIA_LEAVES.get());
                        output.accept(ModItems.SEQUOIA_SAPLING.get());
                        output.accept(ModBlocks.FERTILE_SOIL.get());
                        output.accept(ModBlocks.FERTILE_PLOT.get());
                        output.accept(ModItems.DREAMCATCHER.get());

                        output.accept(ModBlocks.DISTANT_STONE.get());
                        output.accept(ModBlocks.DISTANT_STONE_STAIRS.get());
                        output.accept(ModBlocks.DISTANT_STONE_SLAB.get());
                        output.accept(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.DISTANT_STONE_BUTTON.get());
                        output.accept(ModBlocks.DISTANT_STONE_WALL.get());
                        output.accept(ModBlocks.POLISHED_DISTANT_STONE.get());
                        output.accept(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get());
                        output.accept(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get());
                        output.accept(ModBlocks.POLISHED_DISTANT_STONE_WALL.get());
                        output.accept(ModBlocks.DISTANT_STONE_BRICKS.get());
                        output.accept(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.DISTANT_STONE_BRICK_SLAB.get());
                        output.accept(ModBlocks.DISTANT_STONE_BRICK_WALL.get());
                        output.accept(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get());
                        output.accept(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get());
                        output.accept(ModBlocks.LIMESTONE.get());
                        output.accept(ModBlocks.LIMESTONE_STAIRS.get());
                        output.accept(ModBlocks.LIMESTONE_SLAB.get());
                        output.accept(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.LIMESTONE_BUTTON.get());
                        output.accept(ModBlocks.LIMESTONE_WALL.get());
                        output.accept(ModBlocks.POLISHED_LIMESTONE.get());
                        output.accept(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
                        output.accept(ModBlocks.POLISHED_LIMESTONE_SLAB.get());
                        output.accept(ModBlocks.POLISHED_LIMESTONE_WALL.get());
                        output.accept(ModBlocks.LIMESTONE_BRICKS.get());
                        output.accept(ModBlocks.LIMESTONE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.LIMESTONE_BRICK_SLAB.get());
                        output.accept(ModBlocks.LIMESTONE_BRICK_WALL.get());
                        output.accept(ModBlocks.LIMESTONE_PILLAR.get());
                        output.accept(ModBlocks.LIMESTONE_POWDER.get());
                        output.accept(ModBlocks.CRACKED_LIMESTONE_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_LIMESTONE_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get());
                        output.accept(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
