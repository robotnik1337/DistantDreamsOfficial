package net.whereabouts.DistantDreams.tags;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.whereabouts.DistantDreams.DistantDreams;

public class DDTags {
    public static class Blocks {
        public static final TagKey<Block> ANCIENT_OAK_LOGS = createTag("ancient_oak_logs");
        public static final TagKey<Block> CHARRED_LOGS = createTag("charred_logs");
        public static final TagKey<Block> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");
        public static final TagKey<Block> SEQUOIA_LOGS = createTag("sequoia_logs");
        public static final TagKey<Block> PETRIFIED_LOGS = createTag("petrified_logs");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ANCIENT_OAK_LOGS = createTag("ancient_oak_logs");
        public static final TagKey<Item> CHARRED_LOGS = createTag("charred_logs");
        public static final TagKey<Item> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");
        public static final TagKey<Item> SEQUOIA_LOGS = createTag("sequoia_logs");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, name));
        }
    }
}
