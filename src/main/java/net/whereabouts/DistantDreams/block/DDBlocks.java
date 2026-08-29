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
import net.whereabouts.DistantDreams.item.DDItems;

import java.util.function.Function;
import java.util.function.Supplier;

public class DDBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DistantDreams.MOD_ID);

    public static final DeferredBlock<Block> ANCIENT_OAK_PLANKS = registerBlockItem(
            "ancient_oak_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS)
    );



    // *** HELPER METHODS ***
//    private static BlockBehaviour.Properties setIdProperty(String blockName, BlockBehaviour.Properties currentProperties) {
//        return currentProperties.setId(ResourceKey.create(
//                Registries.BLOCK,
//                DistantDreams.prefix(blockName)
//        ));
//    }

//    private static <T extends Block> void register(String name, DeferredBlock<T> block) {
//        DDItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
//    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block,
                                                           Supplier<BlockBehaviour.Properties> properties) {
        return BLOCKS.register(name, () -> block.apply(properties.get().setId(ResourceKey.create(Registries.BLOCK, DistantDreams.prefix(name)))));
    }

//    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block,
//                                                                    Supplier<BlockBehaviour.Properties> properties) {
//        DeferredBlock<T> toReturn = BLOCKS.register(name, () -> block.apply(properties.get().setId(ResourceKey.create(Registries.BLOCK, DistantDreams.prefix(name)))));
//        registerBlockItem(name, toReturn);
//        return toReturn;
//    }

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
