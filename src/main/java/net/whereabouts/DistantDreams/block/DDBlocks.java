package net.whereabouts.DistantDreams.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.custom.DDWoodLogBlock;
import net.whereabouts.DistantDreams.item.DDItems;

import java.util.function.Function;
import java.util.function.Supplier;

public class DDBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DistantDreams.MOD_ID);

    // Ancient Oak
    public static final DeferredBlock<Block> ANCIENT_OAK_PLANKS = registerBlockItem(
            "ancient_oak_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS)
    );

    // Eucalyptus

    // Sequoia
    public static final DeferredBlock<DDWoodLogBlock> SEQUOIA_LOG = registerBlockItem(
            "sequoia_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
    );

    public static final DeferredBlock<DDWoodLogBlock> STRIPPED_SEQUOIA_LOG = registerBlockItem(
            "stripped_sequoia_log", DDWoodLogBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)
    );



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
