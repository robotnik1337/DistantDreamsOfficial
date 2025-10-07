package net.Bankgo.DistantDreams.util;

import net.Bankgo.DistantDreams.DistantDreams;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");
        public static final TagKey<Block> SEQUOIA_LOGS = createTag("sequoia_logs");
        public static final TagKey<Block> CHARRED_LOGS = createTag("charred_logs");

        public static final TagKey<Block> CHARRED_PLANKS = createTag("charred_planks");
        public static final TagKey<Block> CHARRED_STAIRS = createTag("charred_stairs");
        public static final TagKey<Block> CHARRED_SLAB = createTag("charred_slab");
        public static final TagKey<Block> CHARRED_PRESSURE_PLATE = createTag("charred_pressure_plate");
        public static final TagKey<Block> CHARRED_BUTTON = createTag("charred_button");
        public static final TagKey<Block> CHARRED_FENCE = createTag("charred_fence");
        public static final TagKey<Block> CHARRED_FENCE_GATE = createTag("charred_fence_gate");
        public static final TagKey<Block> CHARRED_DOOR = createTag("charred_door");
        public static final TagKey<Block> CHARRED_TRAPDOOR = createTag("charred_trapdoor");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");
        public static final TagKey<Item> SEQUOIA_LOGS = createTag("sequoia_logs");
        public static final TagKey<Item> CHARRED_LOGS = createTag("charred_logs");
        // TODO: add the rest of the charred wood block tags here.

        public static final TagKey<Item> CHARRED_PLANKS = createTag("charred_planks");
        public static final TagKey<Item> CHARRED_STAIRS = createTag("charred_stairs");
        public static final TagKey<Item> CHARRED_SLAB = createTag("charred_slab");
        public static final TagKey<Item> CHARRED_PRESSURE_PLATE = createTag("charred_pressure_plate");
        public static final TagKey<Item> CHARRED_BUTTON = createTag("charred_button");
        public static final TagKey<Item> CHARRED_FENCE = createTag("charred_fence");
        public static final TagKey<Item> CHARRED_FENCE_GATE = createTag("charred_fence_gate");
        public static final TagKey<Item> CHARRED_DOOR = createTag("charred_door");
        public static final TagKey<Item> CHARRED_TRAPDOOR = createTag("charred_trapdoor");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, name));
        }
    }
}
