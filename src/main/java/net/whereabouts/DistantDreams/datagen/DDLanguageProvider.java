package net.whereabouts.DistantDreams.datagen;

import net.neoforged.neoforge.common.data.LanguageProvider;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.item.DDItems;
import net.minecraft.data.PackOutput;

public class DDLanguageProvider extends LanguageProvider {

    public DDLanguageProvider(PackOutput output, String locale) {
        super(output, DistantDreams.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        // *** BLOCKS ***

        // Ancient Oak Woodset
//        add(DDBlocks.ANCIENT_OAK_LOG.get(), "Ancient Oak Log");
//        add(DDBlocks.ANCIENT_OAK_WOOD.get(), "Ancient Oak Wood");
//        add(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get(), "Stripped Ancient Oak Log");
//        add(DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get(), "Stripped Ancient Oak Wood");
        addBlock(DDBlocks.ANCIENT_OAK_PLANKS, "Ancient Oak Planks");
//        add(DDBlocks.ANCIENT_OAK_LEAVES.get(), "Ancient Oak Leaves");
//        add(DDBlocks.ANCIENT_OAK_SAPLING.get(), "Ancient Oak Sapling");
//        add(DDBlocks.ANCIENT_OAK_STAIRS.get(), "Ancient Oak Stairs");
//        add(DDBlocks.ANCIENT_OAK_SLAB.get(), "Ancient Oak Slab");
//        add(DDBlocks.ANCIENT_OAK_FENCE.get(), "Ancient Oak Fence");
//        add(DDBlocks.ANCIENT_OAK_FENCE_GATE.get(), "Ancient Oak Fence Gate");
//        add(DDBlocks.ANCIENT_OAK_DOOR.get(), "Ancient Oak Door");
//        add(DDBlocks.ANCIENT_OAK_TRAPDOOR.get(), "Ancient Oak Trapdoor");
//        add(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get(), "Ancient Oak Pressure Plate");
//        add(DDBlocks.ANCIENT_OAK_BUTTON.get(), "Ancient Oak Button");
//
        // Charred Woodset
//        add(DDBlocks.CHARRED_LOG.get(), "Charred Log");
//        add(DDBlocks.CHARRED_WOOD.get(), "Charred Wood");
//        add(DDBlocks.STRIPPED_CHARRED_LOG.get(), "Stripped Charred Log");
//        add(DDBlocks.STRIPPED_CHARRED_WOOD.get(), "Stripped Charred Wood");
//        add(DDBlocks.CHARRED_PLANKS.get(), "Charred Planks");
//        add(DDBlocks.CHARRED_STAIRS.get(), "Charred Stairs");
//        add(DDBlocks.CHARRED_SLAB.get(), "Charred Slab");
//        add(DDBlocks.CHARRED_FENCE.get(), "Charred Fence");
//        add(DDBlocks.CHARRED_FENCE_GATE.get(), "Charred Fence Gate");
//        add(DDBlocks.CHARRED_DOOR.get(), "Charred Door");
//        add(DDBlocks.CHARRED_TRAPDOOR.get(), "Charred Trapdoor");
//        add(DDBlocks.CHARRED_PRESSURE_PLATE.get(), "Charred Pressure Plate");
//        add(DDBlocks.CHARRED_BUTTON.get(), "Charred Button");
//        add(DDBlocks.CHARRED_CRAFTING_TABLE.get(), "Charred Crafting Table");
//
//        // Petrified Woodset
//        add(DDBlocks.PETRIFIED_LOG.get(), "Petrified Log");
//        add(DDBlocks.PETRIFIED_WOOD.get(), "Petrified Wood");
//        add(DDBlocks.PETRIFIED_PLANKS.get(), "Petrified Planks");
//        add(DDBlocks.PETRIFIED_STAIRS.get(), "Petrified Stairs");
//        add(DDBlocks.PETRIFIED_SLAB.get(), "Petrified Slab");
//        add(DDBlocks.PETRIFIED_FENCE.get(), "Petrified Fence");
//        add(DDBlocks.PETRIFIED_FENCE_GATE.get(), "Petrified Fence Gate");
//        add(DDBlocks.PETRIFIED_PRESSURE_PLATE.get(), "Petrified Pressure Plate");
//        add(DDBlocks.PETRIFIED_BUTTON.get(), "Petrified Button");
//
//        // Eucalyptus Woodset
//        add(DDBlocks.EUCALYPTUS_LOG.get(), "Eucalyptus Log");
//        add(DDBlocks.EUCALYPTUS_WOOD.get(), "Eucalyptus Wood");
//        add(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get(), "Stripped Eucalyptus Log");
//        add(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), "Stripped Eucalyptus Wood");
//        add(DDBlocks.EUCALYPTUS_PLANKS.get(), "Eucalyptus Planks");
//        add(DDBlocks.EUCALYPTUS_LEAVES.get(), "Eucalyptus Leaves");
//        add(DDBlocks.EUCALYPTUS_SAPLING.get(), "Eucalyptus Sapling");
//        add(DDBlocks.EUCALYPTUS_STAIRS.get(), "Eucalyptus Stairs");
//        add(DDBlocks.EUCALYPTUS_SLAB.get(), "Eucalyptus Slab");
//        add(DDBlocks.EUCALYPTUS_FENCE.get(), "Eucalyptus Fence");
//        add(DDBlocks.EUCALYPTUS_FENCE_GATE.get(), "Eucalyptus Fence Gate");
//        add(DDBlocks.EUCALYPTUS_DOOR.get(), "Eucalyptus Door");
//        add(DDBlocks.EUCALYPTUS_TRAPDOOR.get(), "Eucalyptus Trapdoor");
//        add(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), "Eucalyptus Pressure Plate");
//        add(DDBlocks.EUCALYPTUS_BUTTON.get(), "Eucalyptus Button");
//
        // Sequoia Woodset
        add(DDBlocks.SEQUOIA_LOG.get(), "Sequoia Log");
//        add(DDBlocks.SEQUOIA_WOOD.get(), "Sequoia Wood");
        add(DDBlocks.STRIPPED_SEQUOIA_LOG.get(), "Stripped Sequoia Log");
//        add(DDBlocks.STRIPPED_SEQUOIA_WOOD.get(), "Stripped Sequoia Wood");
//        add(DDBlocks.SEQUOIA_PLANKS.get(), "Sequoia Planks");
//        add(DDBlocks.SEQUOIA_LEAVES.get(), "Sequoia Leaves");
//        add(DDBlocks.SEQUOIA_SAPLING.get(), "Sequoia Sapling");
//        add(DDBlocks.SEQUOIA_STAIRS.get(), "Sequoia Stairs");
//        add(DDBlocks.SEQUOIA_SLAB.get(), "Sequoia Slab");
//        add(DDBlocks.SEQUOIA_FENCE.get(), "Sequoia Fence");
//        add(DDBlocks.SEQUOIA_FENCE_GATE.get(), "Sequoia Fence Gate");
//        add(DDBlocks.SEQUOIA_DOOR.get(), "Sequoia Door");
//        add(DDBlocks.SEQUOIA_TRAPDOOR.get(), "Sequoia Trapdoor");
//        add(DDBlocks.SEQUOIA_PRESSURE_PLATE.get(), "Sequoia Pressure Plate");
//        add(DDBlocks.SEQUOIA_BUTTON.get(), "Sequoia Button");
//
//        // Limestone
//        add(DDBlocks.LIMESTONE.get(), "Limestone");
//        add(DDBlocks.LIMESTONE_STAIRS.get(), "Limestone Stairs");
//        add(DDBlocks.LIMESTONE_SLAB.get(), "Limestone Slab");
//        add(DDBlocks.LIMESTONE_WALL.get(), "Limestone Wall");
//        add(DDBlocks.LIMESTONE_PRESSURE_PLATE.get(), "Limestone Pressure Plate");
//        add(DDBlocks.LIMESTONE_BUTTON.get(), "Limestone Button");
//
//        add(DDBlocks.LIMESTONE_BRICKS.get(), "Limestone Bricks");
//        add(DDBlocks.LIMESTONE_BRICK_STAIRS.get(), "Limestone Brick Stairs");
//        add(DDBlocks.LIMESTONE_BRICK_SLAB.get(), "Limestone Brick Slab");
//        add(DDBlocks.LIMESTONE_BRICK_WALL.get(), "Limestone Brick Wall");
//
//        add(DDBlocks.MOSSY_LIMESTONE_BRICKS.get(), "Mossy Limestone Bricks");
//        add(DDBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get(), "Mossy Limestone Brick Stairs");
//        add(DDBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get(), "Mossy Limestone Brick Slab");
//        add(DDBlocks.MOSSY_LIMESTONE_BRICK_WALL.get(), "Mossy Limestone Brick Wall");
//
//        add(DDBlocks.POLISHED_LIMESTONE.get(), "Polished Limestone");
//        add(DDBlocks.POLISHED_LIMESTONE_STAIRS.get(), "Polished Limestone Stairs");
//        add(DDBlocks.POLISHED_LIMESTONE_SLAB.get(), "Polished Limestone Slab");
//        add(DDBlocks.POLISHED_LIMESTONE_WALL.get(), "Polished Limestone Wall");
//
//        add(DDBlocks.LIMESTONE_POWDER.get(), "Limestone Powder");
//        add(DDBlocks.CRACKED_LIMESTONE_BRICKS.get(), "Cracked Limestone Bricks");
//        add(DDBlocks.LIMESTONE_PILLAR.get(), "Limestone Pillar");
//
//        // Distant Stone
//        add(DDBlocks.DISTANT_STONE.get(), "Distant Stone");
//        add(DDBlocks.DISTANT_STONE_STAIRS.get(), "Distant Stone Stairs");
//        add(DDBlocks.DISTANT_STONE_SLAB.get(), "Distant Stone Slab");
//        add(DDBlocks.DISTANT_STONE_WALL.get(), "Distant Stone Wall");
//        add(DDBlocks.DISTANT_STONE_PRESSURE_PLATE.get(), "Distant Stone Pressure Plate");
//        add(DDBlocks.DISTANT_STONE_BUTTON.get(), "Distant Stone Button");
//
//        add(DDBlocks.DISTANT_STONE_BRICKS.get(), "Distant Stone Bricks");
//        add(DDBlocks.DISTANT_STONE_BRICK_STAIRS.get(), "Distant Stone Brick Stairs");
//        add(DDBlocks.DISTANT_STONE_BRICK_SLAB.get(), "Distant Stone Brick Slab");
//        add(DDBlocks.DISTANT_STONE_BRICK_WALL.get(), "Distant Stone Brick Wall");
//
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICKS.get(), "Mossy Distant Stone Bricks");
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get(), "Mossy Distant Stone Brick Stairs");
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get(), "Mossy Distant Stone Brick Slab");
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get(), "Mossy Distant Stone Brick Wall");
//
//        add(DDBlocks.POLISHED_DISTANT_STONE.get(), "Polished Distant Stone");
//        add(DDBlocks.POLISHED_DISTANT_STONE_STAIRS.get(), "Polished Distant Stone Stairs");
//        add(DDBlocks.POLISHED_DISTANT_STONE_SLAB.get(), "Polished Distant Stone Slab");
//        add(DDBlocks.POLISHED_DISTANT_STONE_WALL.get(), "Polished Distant Stone Wall");
//
//        add(DDBlocks.CRACKED_DISTANT_STONE_BRICKS.get(), "Cracked Distant Stone Bricks");
//
//        // Soil
//        add(DDBlocks.FERTILE_SOIL.get(), "Fertile Soil");
//        add(DDBlocks.FERTILE_PLOT.get(), "Fertile Plot");
//
//        // Peat
//        add(DDBlocks.PEAT.get(),"Peat");
//        add(DDBlocks.PEAT_WALL.get(),"Peat Wall");
//        add(DDBlocks.PEAT_SLAB.get(),"Peat Slab");
//        add(DDBlocks.PEAT_STAIRS.get(),"Peat Stairs");
//
//        add(DDBlocks.PACKED_PEAT.get(),"Packed Peat");
//        add(DDBlocks.PACKED_PEAT_SLAB.get(),"Packed Peat Slab");
//        add(DDBlocks.PACKED_PEAT_STAIRS.get(),"Packed Peat Stairs");
//        add(DDBlocks.PACKED_PEAT_WALL.get(),"Packed Peat Wall");
//
//        add(DDBlocks.PEAT_BRICKS.get(),"Peat Bricks");
//        add(DDBlocks.PEAT_BRICK_WALL.get(),"Peat Brick Wall");
//        add(DDBlocks.PEAT_BRICK_SLAB.get(),"Peat Brick Slab");
//        add(DDBlocks.PEAT_BRICK_STAIRS.get(),"Peat Brick Stairs");
//
//        // ########## ITEMS ##########
//
//        // Ancient Oak Woodset
//        add(DDBlocks.ANCIENT_OAK_LOG.get().asItem(), "Ancient Oak Log");
//        add(DDBlocks.ANCIENT_OAK_WOOD.get().asItem(), "Ancient Oak Wood");
//        add(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get().asItem(), "Stripped Ancient Oak Log");
//        add(DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get().asItem(), "Stripped Ancient Oak Wood");
//        add(DDBlocks.ANCIENT_OAK_PLANKS.get().asItem(), "Ancient Oak Planks");
//        add(DDBlocks.ANCIENT_OAK_LEAVES.get().asItem(), "Ancient Oak Leaves");
//        add(DDBlocks.ANCIENT_OAK_SAPLING.get().asItem(), "Ancient Oak Sapling");
//        add(DDBlocks.ANCIENT_OAK_STAIRS.get().asItem(), "Ancient Oak Stairs");
//        add(DDBlocks.ANCIENT_OAK_SLAB.get().asItem(), "Ancient Oak Slab");
//        add(DDBlocks.ANCIENT_OAK_FENCE.get().asItem(), "Ancient Oak Fence");
//        add(DDBlocks.ANCIENT_OAK_FENCE_GATE.get().asItem(), "Ancient Oak Fence Gate");
//        add(DDBlocks.ANCIENT_OAK_DOOR.get().asItem(), "Ancient Oak Door");
//        add(DDBlocks.ANCIENT_OAK_TRAPDOOR.get().asItem(), "Ancient Oak Trapdoor");
//        add(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get().asItem(), "Ancient Oak Pressure Plate");
//        add(DDBlocks.ANCIENT_OAK_BUTTON.get().asItem(), "Ancient Oak Button");
//
//        // Charred Woodset
//        add(DDBlocks.CHARRED_LOG.get().asItem(), "Charred Log");
//        add(DDBlocks.CHARRED_WOOD.get().asItem(), "Charred Wood");
//        add(DDBlocks.STRIPPED_CHARRED_LOG.get().asItem(), "Stripped Charred Log");
//        add(DDBlocks.STRIPPED_CHARRED_WOOD.get().asItem(), "Stripped Charred Wood");
//        add(DDBlocks.CHARRED_PLANKS.get().asItem(), "Charred Planks");
//        add(DDBlocks.CHARRED_STAIRS.get().asItem(), "Charred Stairs");
//        add(DDBlocks.CHARRED_SLAB.get().asItem(), "Charred Slab");
//        add(DDBlocks.CHARRED_FENCE.get().asItem(), "Charred Fence");
//        add(DDBlocks.CHARRED_FENCE_GATE.get().asItem(), "Charred Fence Gate");
//        add(DDBlocks.CHARRED_DOOR.get().asItem(), "Charred Door");
//        add(DDBlocks.CHARRED_TRAPDOOR.get().asItem(), "Charred Trapdoor");
//        add(DDBlocks.CHARRED_PRESSURE_PLATE.get().asItem(), "Charred Pressure Plate");
//        add(DDBlocks.CHARRED_BUTTON.get().asItem(), "Charred Button");
//        add(DDBlocks.CHARRED_CRAFTING_TABLE.get().asItem(), "Charred Crafting Table");
//
//        // Petrified Woodset
//        add(DDBlocks.PETRIFIED_LOG.get().asItem(), "Petrified Log");
//        add(DDBlocks.PETRIFIED_WOOD.get().asItem(), "Petrified Wood");
//        add(DDBlocks.PETRIFIED_PLANKS.get().asItem(), "Petrified Planks");
//        add(DDBlocks.PETRIFIED_STAIRS.get().asItem(), "Petrified Stairs");
//        add(DDBlocks.PETRIFIED_SLAB.get().asItem(), "Petrified Slab");
//        add(DDBlocks.PETRIFIED_FENCE.get().asItem(), "Petrified Fence");
//        add(DDBlocks.PETRIFIED_FENCE_GATE.get().asItem(), "Petrified Fence Gate");
//        add(DDBlocks.PETRIFIED_PRESSURE_PLATE.get().asItem(), "Petrified Pressure Plate");
//        add(DDBlocks.PETRIFIED_BUTTON.get().asItem(), "Petrified Button");
//
//        // Eucalyptus Woodset
//        add(DDBlocks.EUCALYPTUS_LOG.get().asItem(), "Eucalyptus Log");
//        add(DDBlocks.EUCALYPTUS_WOOD.get().asItem(), "Eucalyptus Wood");
//        add(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get().asItem(), "Stripped Eucalyptus Log");
//        add(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get().asItem(), "Stripped Eucalyptus Wood");
//        add(DDBlocks.EUCALYPTUS_PLANKS.get().asItem(), "Eucalyptus Planks");
//        add(DDBlocks.EUCALYPTUS_LEAVES.get().asItem(), "Eucalyptus Leaves");
//        add(DDBlocks.EUCALYPTUS_SAPLING.get().asItem(), "Eucalyptus Sapling");
//        add(DDBlocks.EUCALYPTUS_STAIRS.get().asItem(), "Eucalyptus Stairs");
//        add(DDBlocks.EUCALYPTUS_SLAB.get().asItem(), "Eucalyptus Slab");
//        add(DDBlocks.EUCALYPTUS_FENCE.get().asItem(), "Eucalyptus Fence");
//        add(DDBlocks.EUCALYPTUS_FENCE_GATE.get().asItem(), "Eucalyptus Fence Gate");
//        add(DDBlocks.EUCALYPTUS_DOOR.get().asItem(), "Eucalyptus Door");
//        add(DDBlocks.EUCALYPTUS_TRAPDOOR.get().asItem(), "Eucalyptus Trapdoor");
//        add(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get().asItem(), "Eucalyptus Pressure Plate");
//        add(DDBlocks.EUCALYPTUS_BUTTON.get().asItem(), "Eucalyptus Button");
//
//        // Sequoia Woodset
//        add(DDBlocks.SEQUOIA_LOG.get().asItem(), "Sequoia Log");
//        add(DDBlocks.SEQUOIA_WOOD.get().asItem(), "Sequoia Wood");
//        add(DDBlocks.STRIPPED_SEQUOIA_LOG.get().asItem(), "Stripped Sequoia Log");
//        add(DDBlocks.STRIPPED_SEQUOIA_WOOD.get().asItem(), "Stripped Sequoia Wood");
//        add(DDBlocks.SEQUOIA_PLANKS.get().asItem(), "Sequoia Planks");
//        add(DDBlocks.SEQUOIA_LEAVES.get().asItem(), "Sequoia Leaves");
//        add(DDBlocks.SEQUOIA_SAPLING.get().asItem(), "Sequoia Sapling");
//        add(DDBlocks.SEQUOIA_STAIRS.get().asItem(), "Sequoia Stairs");
//        add(DDBlocks.SEQUOIA_SLAB.get().asItem(), "Sequoia Slab");
//        add(DDBlocks.SEQUOIA_FENCE.get().asItem(), "Sequoia Fence");
//        add(DDBlocks.SEQUOIA_FENCE_GATE.get().asItem(), "Sequoia Fence Gate");
//        add(DDBlocks.SEQUOIA_DOOR.get().asItem(), "Sequoia Door");
//        add(DDBlocks.SEQUOIA_TRAPDOOR.get().asItem(), "Sequoia Trapdoor");
//        add(DDBlocks.SEQUOIA_PRESSURE_PLATE.get().asItem(), "Sequoia Pressure Plate");
//        add(DDBlocks.SEQUOIA_BUTTON.get().asItem(), "Sequoia Button");
//
//        // Limestone
//        add(DDBlocks.LIMESTONE.get().asItem(), "Limestone");
//        add(DDBlocks.LIMESTONE_STAIRS.get().asItem(), "Limestone Stairs");
//        add(DDBlocks.LIMESTONE_SLAB.get().asItem(), "Limestone Slab");
//        add(DDBlocks.LIMESTONE_WALL.get().asItem(), "Limestone Wall");
//        add(DDBlocks.LIMESTONE_PRESSURE_PLATE.get().asItem(), "Limestone Pressure Plate");
//        add(DDBlocks.LIMESTONE_BUTTON.get().asItem(), "Limestone Button");
//
//        add(DDBlocks.LIMESTONE_BRICKS.get().asItem(), "Limestone Bricks");
//        add(DDBlocks.LIMESTONE_BRICK_STAIRS.get().asItem(), "Limestone Brick Stairs");
//        add(DDBlocks.LIMESTONE_BRICK_SLAB.get().asItem(), "Limestone Brick Slab");
//        add(DDBlocks.LIMESTONE_BRICK_WALL.get().asItem(), "Limestone Brick Wall");
//
//        add(DDBlocks.MOSSY_LIMESTONE_BRICKS.get().asItem(), "Mossy Limestone Bricks");
//        add(DDBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get().asItem(), "Mossy Limestone Brick Stairs");
//        add(DDBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get().asItem(), "Mossy Limestone Brick Slab");
//        add(DDBlocks.MOSSY_LIMESTONE_BRICK_WALL.get().asItem(), "Mossy Limestone Brick Wall");
//
//        add(DDBlocks.POLISHED_LIMESTONE.get().asItem(), "Polished Limestone");
//        add(DDBlocks.POLISHED_LIMESTONE_STAIRS.get().asItem(), "Polished Limestone Stairs");
//        add(DDBlocks.POLISHED_LIMESTONE_SLAB.get().asItem(), "Polished Limestone Slab");
//        add(DDBlocks.POLISHED_LIMESTONE_WALL.get().asItem(), "Polished Limestone Wall");
//
//        add(DDBlocks.LIMESTONE_POWDER.get().asItem(), "Limestone Powder");
//        add(DDBlocks.CRACKED_LIMESTONE_BRICKS.get().asItem(), "Cracked Limestone Bricks");
//        add(DDBlocks.LIMESTONE_PILLAR.get().asItem(), "Limestone Pillar");
//
//        // Distant Stone
//        add(DDBlocks.DISTANT_STONE.get().asItem(), "Distant Stone");
//        add(DDBlocks.DISTANT_STONE_STAIRS.get().asItem(), "Distant Stone Stairs");
//        add(DDBlocks.DISTANT_STONE_SLAB.get().asItem(), "Distant Stone Slab");
//        add(DDBlocks.DISTANT_STONE_WALL.get().asItem(), "Distant Stone Wall");
//        add(DDBlocks.DISTANT_STONE_PRESSURE_PLATE.get().asItem(), "Distant Stone Pressure Plate");
//        add(DDBlocks.DISTANT_STONE_BUTTON.get().asItem(), "Distant Stone Button");
//
//        add(DDBlocks.DISTANT_STONE_BRICKS.get().asItem(), "Distant Stone Bricks");
//        add(DDBlocks.DISTANT_STONE_BRICK_STAIRS.get().asItem(), "Distant Stone Brick Stairs");
//        add(DDBlocks.DISTANT_STONE_BRICK_SLAB.get().asItem(), "Distant Stone Brick Slab");
//        add(DDBlocks.DISTANT_STONE_BRICK_WALL.get().asItem(), "Distant Stone Brick Wall");
//
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICKS.get().asItem(), "Mossy Distant Stone Bricks");
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get().asItem(), "Mossy Distant Stone Brick Stairs");
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get().asItem(), "Mossy Distant Stone Brick Slab");
//        add(DDBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get().asItem(), "Mossy Distant Stone Brick Wall");
//
//        add(DDBlocks.POLISHED_DISTANT_STONE.get().asItem(), "Polished Distant Stone");
//        add(DDBlocks.POLISHED_DISTANT_STONE_STAIRS.get().asItem(), "Polished Distant Stone Stairs");
//        add(DDBlocks.POLISHED_DISTANT_STONE_SLAB.get().asItem(), "Polished Distant Stone Slab");
//        add(DDBlocks.POLISHED_DISTANT_STONE_WALL.get().asItem(), "Polished Distant Stone Wall");
//
//        add(DDBlocks.CRACKED_DISTANT_STONE_BRICKS.get().asItem(), "Cracked Distant Stone Bricks");
//
//        // Soil
//        add(DDBlocks.FERTILE_SOIL.get().asItem(), "Fertile Soil");
//        add(DDBlocks.FERTILE_PLOT.get().asItem(), "Fertile Plot");
//
//        //Peat
//        add(DDBlocks.PEAT.get().asItem(),"Peat");
//        add(DDBlocks.PEAT_WALL.get().asItem(),"Peat Wall");
//        add(DDBlocks.PEAT_SLAB.get().asItem(),"Peat Slab");
//        add(DDBlocks.PEAT_STAIRS.get().asItem(),"Peat Stairs");
//
//        add(DDBlocks.PACKED_PEAT.get().asItem(),"Packed Peat");
//        add(DDBlocks.PACKED_PEAT_WALL.get().asItem(),"Packed Peat Wall");
//        add(DDBlocks.PACKED_PEAT_SLAB.get().asItem(),"Packed Peat Slab");
//        add(DDBlocks.PACKED_PEAT_STAIRS.get().asItem(),"Packed Peat Stairs");
//
//        add(DDBlocks.PEAT_BRICKS.get().asItem(),"Peat Bricks");
//        add(DDBlocks.PEAT_BRICK_WALL.get().asItem(),"Peat Brick Wall");
//        add(DDBlocks.PEAT_BRICK_SLAB.get().asItem(),"Peat Brick Slab");
//        add(DDBlocks.PEAT_BRICK_STAIRS.get().asItem(),"Peat Brick Stairs");
//
//        // Dreamflower
//        add(DDBlocks.OPEN_DREAMFLOWER.get().asItem(), "Open Dreamflower");
//        add(DDBlocks.CLOSED_DREAMFLOWER.get().asItem(), "Closed Dreamflower");


        // ########## ITEMS ############
        addItem(DDItems.MUSIC_DISC_HYPNAGOGIA, "Music Disc");
        add("item.distantdreams.music_disc_hypnagogia.desc", "TheAnonymousGhoul - Hypnagogia");
//        add(DDItems.COPPER_BEETROOT_1.get(),"Copper Beetroot");
//        add(DDItems.BROTH_OF_STYX.get(), "Broth of Styx");


        // ########## MISCELLANEOUS ##########
        add("itemGroup.distantdreams", "Distant Dreams");
        add("biome.distantdreams.sequoia_forest", "Sequoia Forest");



    }
}