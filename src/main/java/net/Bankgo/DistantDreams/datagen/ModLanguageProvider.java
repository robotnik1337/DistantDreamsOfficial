package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, DistantDreams.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        // ########## BLOCKS ##########

        // Ancient Oak Woodset
        add(ModBlocks.ANCIENT_OAK_LOG.get(), "Ancient Oak Log");
        add(ModBlocks.ANCIENT_OAK_WOOD.get(), "Ancient Oak Wood");
        add(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get(), "Stripped Ancient Oak Log");
        add(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get(), "Stripped Ancient Oak Wood");
        add(ModBlocks.ANCIENT_OAK_PLANKS.get(), "Ancient Oak Planks");
        add(ModBlocks.ANCIENT_OAK_LEAVES.get(), "Ancient Oak Leaves");
        add(ModBlocks.ANCIENT_OAK_SAPLING.get(), "Ancient Oak Sapling");
        add(ModBlocks.ANCIENT_OAK_STAIRS.get(), "Ancient Oak Stairs");
        add(ModBlocks.ANCIENT_OAK_SLAB.get(), "Ancient Oak Slab");
        add(ModBlocks.ANCIENT_OAK_FENCE.get(), "Ancient Oak Fence");
        add(ModBlocks.ANCIENT_OAK_FENCE_GATE.get(), "Ancient Oak Fence Gate");
        add(ModBlocks.ANCIENT_OAK_DOOR.get(), "Ancient Oak Door");
        add(ModBlocks.ANCIENT_OAK_TRAPDOOR.get(), "Ancient Oak Trapdoor");
        add(ModBlocks.ANCIENT_OAK_PRESSURE_PLATE.get(), "Ancient Oak Pressure Plate");
        add(ModBlocks.ANCIENT_OAK_BUTTON.get(), "Ancient Oak Button");

        // Charred Woodset
        add(ModBlocks.CHARRED_LOG.get(), "Charred Log");
        add(ModBlocks.CHARRED_WOOD.get(), "Charred Wood");
        add(ModBlocks.STRIPPED_CHARRED_LOG.get(), "Stripped Charred Log");
        add(ModBlocks.STRIPPED_CHARRED_WOOD.get(), "Stripped Charred Wood");
        add(ModBlocks.CHARRED_PLANKS.get(), "Charred Planks");
        add(ModBlocks.CHARRED_STAIRS.get(), "Charred Stairs");
        add(ModBlocks.CHARRED_SLAB.get(), "Charred Slab");
        add(ModBlocks.CHARRED_FENCE.get(), "Charred Fence");
        add(ModBlocks.CHARRED_FENCE_GATE.get(), "Charred Fence Gate");
        add(ModBlocks.CHARRED_DOOR.get(), "Charred Door");
        add(ModBlocks.CHARRED_TRAPDOOR.get(), "Charred Trapdoor");
        add(ModBlocks.CHARRED_PRESSURE_PLATE.get(), "Charred Pressure Plate");
        add(ModBlocks.CHARRED_BUTTON.get(), "Charred Button");
        add(ModBlocks.CHARRED_CRAFTING_TABLE.get(), "Charred Crafting Table");

        // Petrified Woodset
        add(ModBlocks.PETRIFIED_LOG.get(), "Petrified Log");
        add(ModBlocks.PETRIFIED_WOOD.get(), "Petrified Wood");
        add(ModBlocks.PETRIFIED_PLANKS.get(), "Petrified Planks");
        add(ModBlocks.PETRIFIED_STAIRS.get(), "Petrified Stairs");
        add(ModBlocks.PETRIFIED_SLAB.get(), "Petrified Slab");
        add(ModBlocks.PETRIFIED_FENCE.get(), "Petrified Fence");
        add(ModBlocks.PETRIFIED_FENCE_GATE.get(), "Petrified Fence Gate");
        add(ModBlocks.PETRIFIED_PRESSURE_PLATE.get(), "Petrified Pressure Plate");
        add(ModBlocks.PETRIFIED_BUTTON.get(), "Petrified Button");

        // Eucalyptus Woodset
        add(ModBlocks.EUCALYPTUS_LOG.get(), "Eucalyptus Log");
        add(ModBlocks.EUCALYPTUS_WOOD.get(), "Eucalyptus Wood");
        add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get(), "Stripped Eucalyptus Log");
        add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), "Stripped Eucalyptus Wood");
        add(ModBlocks.EUCALYPTUS_PLANKS.get(), "Eucalyptus Planks");
        add(ModBlocks.EUCALYPTUS_LEAVES.get(), "Eucalyptus Leaves");
        add(ModBlocks.EUCALYPTUS_SAPLING.get(), "Eucalyptus Sapling");
        add(ModBlocks.EUCALYPTUS_STAIRS.get(), "Eucalyptus Stairs");
        add(ModBlocks.EUCALYPTUS_SLAB.get(), "Eucalyptus Slab");
        add(ModBlocks.EUCALYPTUS_FENCE.get(), "Eucalyptus Fence");
        add(ModBlocks.EUCALYPTUS_FENCE_GATE.get(), "Eucalyptus Fence Gate");
        add(ModBlocks.EUCALYPTUS_DOOR.get(), "Eucalyptus Door");
        add(ModBlocks.EUCALYPTUS_TRAPDOOR.get(), "Eucalyptus Trapdoor");
        add(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), "Eucalyptus Pressure Plate");
        add(ModBlocks.EUCALYPTUS_BUTTON.get(), "Eucalyptus Button");

        // Sequoia Woodset
        add(ModBlocks.SEQUOIA_LOG.get(), "Sequoia Log");
        add(ModBlocks.SEQUOIA_WOOD.get(), "Sequoia Wood");
        add(ModBlocks.STRIPPED_SEQUOIA_LOG.get(), "Stripped Sequoia Log");
        add(ModBlocks.STRIPPED_SEQUOIA_WOOD.get(), "Stripped Sequoia Wood");
        add(ModBlocks.SEQUOIA_PLANKS.get(), "Sequoia Planks");
        add(ModBlocks.SEQUOIA_LEAVES.get(), "Sequoia Leaves");
        add(ModBlocks.SEQUOIA_SAPLING.get(), "Sequoia Sapling");
        add(ModBlocks.SEQUOIA_STAIRS.get(), "Sequoia Stairs");
        add(ModBlocks.SEQUOIA_SLAB.get(), "Sequoia Slab");
        add(ModBlocks.SEQUOIA_FENCE.get(), "Sequoia Fence");
        add(ModBlocks.SEQUOIA_FENCE_GATE.get(), "Sequoia Fence Gate");
        add(ModBlocks.SEQUOIA_DOOR.get(), "Sequoia Door");
        add(ModBlocks.SEQUOIA_TRAPDOOR.get(), "Sequoia Trapdoor");
        add(ModBlocks.SEQUOIA_PRESSURE_PLATE.get(), "Sequoia Pressure Plate");
        add(ModBlocks.SEQUOIA_BUTTON.get(), "Sequoia Button");

        // Limestone
        add(ModBlocks.LIMESTONE.get(), "Limestone");
        add(ModBlocks.LIMESTONE_STAIRS.get(), "Limestone Stairs");
        add(ModBlocks.LIMESTONE_SLAB.get(), "Limestone Slab");
        add(ModBlocks.LIMESTONE_WALL.get(), "Limestone Wall");
        add(ModBlocks.LIMESTONE_PRESSURE_PLATE.get(), "Limestone Pressure Plate");
        add(ModBlocks.LIMESTONE_BUTTON.get(), "Limestone Button");

        add(ModBlocks.LIMESTONE_BRICKS.get(), "Limestone Bricks");
        add(ModBlocks.LIMESTONE_BRICK_STAIRS.get(), "Limestone Brick Stairs");
        add(ModBlocks.LIMESTONE_BRICK_SLAB.get(), "Limestone Brick Slab");
        add(ModBlocks.LIMESTONE_BRICK_WALL.get(), "Limestone Brick Wall");

        add(ModBlocks.MOSSY_LIMESTONE_BRICKS.get(), "Mossy Limestone Bricks");
        add(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get(), "Mossy Limestone Brick Stairs");
        add(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get(), "Mossy Limestone Brick Slab");
        add(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get(), "Mossy Limestone Brick Wall");

        add(ModBlocks.POLISHED_LIMESTONE.get(), "Polished Limestone");
        add(ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), "Polished Limestone Stairs");
        add(ModBlocks.POLISHED_LIMESTONE_SLAB.get(), "Polished Limestone Slab");
        add(ModBlocks.POLISHED_LIMESTONE_WALL.get(), "Polished Limestone Wall");

        add(ModBlocks.LIMESTONE_POWDER.get(), "Limestone Powder");
        add(ModBlocks.CRACKED_LIMESTONE_BRICKS.get(), "Cracked Limestone Bricks");
        add(ModBlocks.LIMESTONE_PILLAR.get(), "Limestone Pillar");

        // Distant Stone
        add(ModBlocks.DISTANT_STONE.get(), "Distant Stone");
        add(ModBlocks.DISTANT_STONE_STAIRS.get(), "Distant Stone Stairs");
        add(ModBlocks.DISTANT_STONE_SLAB.get(), "Distant Stone Slab");
        add(ModBlocks.DISTANT_STONE_WALL.get(), "Distant Stone Wall");
        add(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get(), "Distant Stone Pressure Plate");
        add(ModBlocks.DISTANT_STONE_BUTTON.get(), "Distant Stone Button");

        add(ModBlocks.DISTANT_STONE_BRICKS.get(), "Distant Stone Bricks");
        add(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get(), "Distant Stone Brick Stairs");
        add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get(), "Distant Stone Brick Slab");
        add(ModBlocks.DISTANT_STONE_BRICK_WALL.get(), "Distant Stone Brick Wall");

        add(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get(), "Mossy Distant Stone Bricks");
        add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get(), "Mossy Distant Stone Brick Stairs");
        add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get(), "Mossy Distant Stone Brick Slab");
        add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get(), "Mossy Distant Stone Brick Wall");

        add(ModBlocks.POLISHED_DISTANT_STONE.get(), "Polished Distant Stone");
        add(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get(), "Polished Distant Stone Stairs");
        add(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get(), "Polished Distant Stone Slab");
        add(ModBlocks.POLISHED_DISTANT_STONE_WALL.get(), "Polished Distant Stone Wall");

        add(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get(), "Cracked Distant Stone Bricks");

        // Soil
        add(ModBlocks.FERTILE_SOIL.get(), "Fertile Soil");
        add(ModBlocks.FERTILE_PLOT.get(), "Fertile Plot");

        // Peat
        add(ModBlocks.PEAT.get(),"Peat");
        add(ModBlocks.PEAT_WALL.get(),"Peat Wall");
        add(ModBlocks.PEAT_SLAB.get(),"Peat Slab");
        add(ModBlocks.PEAT_STAIRS.get(),"Peat Stairs");

        add(ModBlocks.PACKED_PEAT.get(),"Packed Peat");
        add(ModBlocks.PACKED_PEAT_SLAB.get(),"Packed Peat Slab");
        add(ModBlocks.PACKED_PEAT_STAIRS.get(),"Packed Peat Stairs");
        add(ModBlocks.PACKED_PEAT_WALL.get(),"Packed Peat Wall");

        add(ModBlocks.PEAT_BRICKS.get(),"Peat Bricks");
        add(ModBlocks.PEAT_BRICK_WALL.get(),"Peat Brick Wall");
        add(ModBlocks.PEAT_BRICK_SLAB.get(),"Peat Brick Slab");
        add(ModBlocks.PEAT_BRICK_STAIRS.get(),"Peat Brick Stairs");

        // ########## ITEMS ##########

        // Ancient Oak Woodset
        add(ModBlocks.ANCIENT_OAK_LOG.get().asItem(), "Ancient Oak Log");
        add(ModBlocks.ANCIENT_OAK_WOOD.get().asItem(), "Ancient Oak Wood");
        add(ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get().asItem(), "Stripped Ancient Oak Log");
        add(ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get().asItem(), "Stripped Ancient Oak Wood");
        add(ModBlocks.ANCIENT_OAK_PLANKS.get().asItem(), "Ancient Oak Planks");
        add(ModBlocks.ANCIENT_OAK_LEAVES.get().asItem(), "Ancient Oak Leaves");
        add(ModBlocks.ANCIENT_OAK_SAPLING.get().asItem(), "Ancient Oak Sapling");
        add(ModBlocks.ANCIENT_OAK_STAIRS.get().asItem(), "Ancient Oak Stairs");
        add(ModBlocks.ANCIENT_OAK_SLAB.get().asItem(), "Ancient Oak Slab");
        add(ModBlocks.ANCIENT_OAK_FENCE.get().asItem(), "Ancient Oak Fence");
        add(ModBlocks.ANCIENT_OAK_FENCE_GATE.get().asItem(), "Ancient Oak Fence Gate");
        add(ModBlocks.ANCIENT_OAK_DOOR.get().asItem(), "Ancient Oak Door");
        add(ModBlocks.ANCIENT_OAK_TRAPDOOR.get().asItem(), "Ancient Oak Trapdoor");
        add(ModBlocks.ANCIENT_OAK_PRESSURE_PLATE.get().asItem(), "Ancient Oak Pressure Plate");
        add(ModBlocks.ANCIENT_OAK_BUTTON.get().asItem(), "Ancient Oak Button");

        // Charred Woodset
        add(ModBlocks.CHARRED_LOG.get().asItem(), "Charred Log");
        add(ModBlocks.CHARRED_WOOD.get().asItem(), "Charred Wood");
        add(ModBlocks.STRIPPED_CHARRED_LOG.get().asItem(), "Stripped Charred Log");
        add(ModBlocks.STRIPPED_CHARRED_WOOD.get().asItem(), "Stripped Charred Wood");
        add(ModBlocks.CHARRED_PLANKS.get().asItem(), "Charred Planks");
        add(ModBlocks.CHARRED_STAIRS.get().asItem(), "Charred Stairs");
        add(ModBlocks.CHARRED_SLAB.get().asItem(), "Charred Slab");
        add(ModBlocks.CHARRED_FENCE.get().asItem(), "Charred Fence");
        add(ModBlocks.CHARRED_FENCE_GATE.get().asItem(), "Charred Fence Gate");
        add(ModBlocks.CHARRED_DOOR.get().asItem(), "Charred Door");
        add(ModBlocks.CHARRED_TRAPDOOR.get().asItem(), "Charred Trapdoor");
        add(ModBlocks.CHARRED_PRESSURE_PLATE.get().asItem(), "Charred Pressure Plate");
        add(ModBlocks.CHARRED_BUTTON.get().asItem(), "Charred Button");
        add(ModBlocks.CHARRED_CRAFTING_TABLE.get().asItem(), "Charred Crafting Table");

        // Petrified Woodset
        add(ModBlocks.PETRIFIED_LOG.get().asItem(), "Petrified Log");
        add(ModBlocks.PETRIFIED_WOOD.get().asItem(), "Petrified Wood");
        add(ModBlocks.PETRIFIED_PLANKS.get().asItem(), "Petrified Planks");
        add(ModBlocks.PETRIFIED_STAIRS.get().asItem(), "Petrified Stairs");
        add(ModBlocks.PETRIFIED_SLAB.get().asItem(), "Petrified Slab");
        add(ModBlocks.PETRIFIED_FENCE.get().asItem(), "Petrified Fence");
        add(ModBlocks.PETRIFIED_FENCE_GATE.get().asItem(), "Petrified Fence Gate");
        add(ModBlocks.PETRIFIED_PRESSURE_PLATE.get().asItem(), "Petrified Pressure Plate");
        add(ModBlocks.PETRIFIED_BUTTON.get().asItem(), "Petrified Button");

        // Eucalyptus Woodset
        add(ModBlocks.EUCALYPTUS_LOG.get().asItem(), "Eucalyptus Log");
        add(ModBlocks.EUCALYPTUS_WOOD.get().asItem(), "Eucalyptus Wood");
        add(ModBlocks.STRIPPED_EUCALYPTUS_LOG.get().asItem(), "Stripped Eucalyptus Log");
        add(ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get().asItem(), "Stripped Eucalyptus Wood");
        add(ModBlocks.EUCALYPTUS_PLANKS.get().asItem(), "Eucalyptus Planks");
        add(ModBlocks.EUCALYPTUS_LEAVES.get().asItem(), "Eucalyptus Leaves");
        add(ModBlocks.EUCALYPTUS_SAPLING.get().asItem(), "Eucalyptus Sapling");
        add(ModBlocks.EUCALYPTUS_STAIRS.get().asItem(), "Eucalyptus Stairs");
        add(ModBlocks.EUCALYPTUS_SLAB.get().asItem(), "Eucalyptus Slab");
        add(ModBlocks.EUCALYPTUS_FENCE.get().asItem(), "Eucalyptus Fence");
        add(ModBlocks.EUCALYPTUS_FENCE_GATE.get().asItem(), "Eucalyptus Fence Gate");
        add(ModBlocks.EUCALYPTUS_DOOR.get().asItem(), "Eucalyptus Door");
        add(ModBlocks.EUCALYPTUS_TRAPDOOR.get().asItem(), "Eucalyptus Trapdoor");
        add(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get().asItem(), "Eucalyptus Pressure Plate");
        add(ModBlocks.EUCALYPTUS_BUTTON.get().asItem(), "Eucalyptus Button");

        // Sequoia Woodset
        add(ModBlocks.SEQUOIA_LOG.get().asItem(), "Sequoia Log");
        add(ModBlocks.SEQUOIA_WOOD.get().asItem(), "Sequoia Wood");
        add(ModBlocks.STRIPPED_SEQUOIA_LOG.get().asItem(), "Stripped Sequoia Log");
        add(ModBlocks.STRIPPED_SEQUOIA_WOOD.get().asItem(), "Stripped Sequoia Wood");
        add(ModBlocks.SEQUOIA_PLANKS.get().asItem(), "Sequoia Planks");
        add(ModBlocks.SEQUOIA_LEAVES.get().asItem(), "Sequoia Leaves");
        add(ModBlocks.SEQUOIA_SAPLING.get().asItem(), "Sequoia Sapling");
        add(ModBlocks.SEQUOIA_STAIRS.get().asItem(), "Sequoia Stairs");
        add(ModBlocks.SEQUOIA_SLAB.get().asItem(), "Sequoia Slab");
        add(ModBlocks.SEQUOIA_FENCE.get().asItem(), "Sequoia Fence");
        add(ModBlocks.SEQUOIA_FENCE_GATE.get().asItem(), "Sequoia Fence Gate");
        add(ModBlocks.SEQUOIA_DOOR.get().asItem(), "Sequoia Door");
        add(ModBlocks.SEQUOIA_TRAPDOOR.get().asItem(), "Sequoia Trapdoor");
        add(ModBlocks.SEQUOIA_PRESSURE_PLATE.get().asItem(), "Sequoia Pressure Plate");
        add(ModBlocks.SEQUOIA_BUTTON.get().asItem(), "Sequoia Button");

        // Limestone
        add(ModBlocks.LIMESTONE.get().asItem(), "Limestone");
        add(ModBlocks.LIMESTONE_STAIRS.get().asItem(), "Limestone Stairs");
        add(ModBlocks.LIMESTONE_SLAB.get().asItem(), "Limestone Slab");
        add(ModBlocks.LIMESTONE_WALL.get().asItem(), "Limestone Wall");
        add(ModBlocks.LIMESTONE_PRESSURE_PLATE.get().asItem(), "Limestone Pressure Plate");
        add(ModBlocks.LIMESTONE_BUTTON.get().asItem(), "Limestone Button");

        add(ModBlocks.LIMESTONE_BRICKS.get().asItem(), "Limestone Bricks");
        add(ModBlocks.LIMESTONE_BRICK_STAIRS.get().asItem(), "Limestone Brick Stairs");
        add(ModBlocks.LIMESTONE_BRICK_SLAB.get().asItem(), "Limestone Brick Slab");
        add(ModBlocks.LIMESTONE_BRICK_WALL.get().asItem(), "Limestone Brick Wall");

        add(ModBlocks.MOSSY_LIMESTONE_BRICKS.get().asItem(), "Mossy Limestone Bricks");
        add(ModBlocks.MOSSY_LIMESTONE_BRICK_STAIRS.get().asItem(), "Mossy Limestone Brick Stairs");
        add(ModBlocks.MOSSY_LIMESTONE_BRICK_SLAB.get().asItem(), "Mossy Limestone Brick Slab");
        add(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL.get().asItem(), "Mossy Limestone Brick Wall");

        add(ModBlocks.POLISHED_LIMESTONE.get().asItem(), "Polished Limestone");
        add(ModBlocks.POLISHED_LIMESTONE_STAIRS.get().asItem(), "Polished Limestone Stairs");
        add(ModBlocks.POLISHED_LIMESTONE_SLAB.get().asItem(), "Polished Limestone Slab");
        add(ModBlocks.POLISHED_LIMESTONE_WALL.get().asItem(), "Polished Limestone Wall");

        add(ModBlocks.LIMESTONE_POWDER.get().asItem(), "Limestone Powder");
        add(ModBlocks.CRACKED_LIMESTONE_BRICKS.get().asItem(), "Cracked Limestone Bricks");
        add(ModBlocks.LIMESTONE_PILLAR.get().asItem(), "Limestone Pillar");

        // Distant Stone
        add(ModBlocks.DISTANT_STONE.get().asItem(), "Distant Stone");
        add(ModBlocks.DISTANT_STONE_STAIRS.get().asItem(), "Distant Stone Stairs");
        add(ModBlocks.DISTANT_STONE_SLAB.get().asItem(), "Distant Stone Slab");
        add(ModBlocks.DISTANT_STONE_WALL.get().asItem(), "Distant Stone Wall");
        add(ModBlocks.DISTANT_STONE_PRESSURE_PLATE.get().asItem(), "Distant Stone Pressure Plate");
        add(ModBlocks.DISTANT_STONE_BUTTON.get().asItem(), "Distant Stone Button");

        add(ModBlocks.DISTANT_STONE_BRICKS.get().asItem(), "Distant Stone Bricks");
        add(ModBlocks.DISTANT_STONE_BRICK_STAIRS.get().asItem(), "Distant Stone Brick Stairs");
        add(ModBlocks.DISTANT_STONE_BRICK_SLAB.get().asItem(), "Distant Stone Brick Slab");
        add(ModBlocks.DISTANT_STONE_BRICK_WALL.get().asItem(), "Distant Stone Brick Wall");

        add(ModBlocks.MOSSY_DISTANT_STONE_BRICKS.get().asItem(), "Mossy Distant Stone Bricks");
        add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_STAIRS.get().asItem(), "Mossy Distant Stone Brick Stairs");
        add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_SLAB.get().asItem(), "Mossy Distant Stone Brick Slab");
        add(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL.get().asItem(), "Mossy Distant Stone Brick Wall");

        add(ModBlocks.POLISHED_DISTANT_STONE.get().asItem(), "Polished Distant Stone");
        add(ModBlocks.POLISHED_DISTANT_STONE_STAIRS.get().asItem(), "Polished Distant Stone Stairs");
        add(ModBlocks.POLISHED_DISTANT_STONE_SLAB.get().asItem(), "Polished Distant Stone Slab");
        add(ModBlocks.POLISHED_DISTANT_STONE_WALL.get().asItem(), "Polished Distant Stone Wall");

        add(ModBlocks.CRACKED_DISTANT_STONE_BRICKS.get().asItem(), "Cracked Distant Stone Bricks");

        // Soil
        add(ModBlocks.FERTILE_SOIL.get().asItem(), "Fertile Soil");
        add(ModBlocks.FERTILE_PLOT.get().asItem(), "Fertile Plot");

        //Peat
        add(ModBlocks.PEAT.get().asItem(),"Peat");
        add(ModBlocks.PEAT_WALL.get().asItem(),"Peat Wall");
        add(ModBlocks.PEAT_SLAB.get().asItem(),"Peat Slab");
        add(ModBlocks.PEAT_STAIRS.get().asItem(),"Peat Stairs");

        add(ModBlocks.PACKED_PEAT.get().asItem(),"Packed Peat");
        add(ModBlocks.PACKED_PEAT_WALL.get().asItem(),"Packed Peat Wall");
        add(ModBlocks.PACKED_PEAT_SLAB.get().asItem(),"Packed Peat Slab");
        add(ModBlocks.PACKED_PEAT_STAIRS.get().asItem(),"Packed Peat Stairs");

        add(ModBlocks.PEAT_BRICKS.get().asItem(),"Peat Bricks");
        add(ModBlocks.PEAT_BRICK_WALL.get().asItem(),"Peat Brick Wall");
        add(ModBlocks.PEAT_BRICK_SLAB.get().asItem(),"Peat Brick Slab");
        add(ModBlocks.PEAT_BRICK_STAIRS.get().asItem(),"Peat Brick Stairs");

        // Dreamflower
        add(ModBlocks.OPEN_DREAMFLOWER.get().asItem(), "Open Dreamflower");
        add(ModBlocks.CLOSED_DREAMFLOWER.get().asItem(), "Closed Dreamflower");


        // ########## ITEMS ############
        add(ModItems.MUSIC_DISC_HYPNAGOGIA.get(), "Music Disc");
        add("item.distantdreams.music_disc_hypnagogia.desc", "TheAnonymousGhoul - Hypnagogia");
        add(ModItems.COPPER_BEETROOT_1.get(),"Copper Beetroot");
        add(ModItems.BROTH_OF_STYX.get(), "Broth of Styx");


        // ########## MISCELLANEOUS ##########
        add("creativetab.distantdreams.distant_dreams_tab", "Distant Dreams");
        add("biome.distantdreams.sequoia_forest", "Sequoia Forest");



    }
}