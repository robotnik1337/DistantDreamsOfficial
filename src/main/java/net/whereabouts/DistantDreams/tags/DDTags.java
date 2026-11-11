package net.whereabouts.DistantDreams.tags;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.whereabouts.DistantDreams.DistantDreams;
import org.jetbrains.annotations.NotNull;

public class DDTags {
    public static class Blocks {
        public static final TagKey<@NotNull Block> ANCIENT_ACACIA_LOGS = createTag("ancient_acacia_logs");
        public static final TagKey<@NotNull Block> ANCIENT_BIRCH_LOGS = createTag("ancient_birch_logs");
        public static final TagKey<@NotNull Block> ANCIENT_MANGROVE_LOGS = createTag("ancient_mangrove_logs");
        public static final TagKey<@NotNull Block> ANCIENT_OAK_LOGS = createTag("ancient_oak_logs");
        public static final TagKey<@NotNull Block> CHARRED_LOGS = createTag("charred_logs");
        public static final TagKey<@NotNull Block> DENDRANTHOS_LOGS =  createTag("dendranthos_logs");
        public static final TagKey<@NotNull Block> DENDRYMYCOS_LOGS =  createTag("dendrymycos_logs");
        public static final TagKey<@NotNull Block> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");
        public static final TagKey<@NotNull Block> SEQUOIA_LOGS = createTag("sequoia_logs");
        public static final TagKey<@NotNull Block> PETRIFIED_LOGS = createTag("petrified_logs");
        public static final TagKey<@NotNull Block> DD_LOGS = createTag("dd_logs");


        private static TagKey<@NotNull Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<@NotNull Item> ANCIENT_ACACIA_LOGS = createTag("ancient_acacia_logs");
        public static final TagKey<@NotNull Item> ANCIENT_BIRCH_LOGS = createTag("ancient_birch_logs");
        public static final TagKey<@NotNull Item> ANCIENT_MANGROVE_LOGS = createTag("ancient_mangrove_logs");
        public static final TagKey<@NotNull Item> ANCIENT_OAK_LOGS = createTag("ancient_oak_logs");
        public static final TagKey<@NotNull Item> CHARRED_LOGS = createTag("charred_logs");
        public static final TagKey<@NotNull Item> DENDRANTHOS_LOGS = createTag("dendranthos_logs");
        public static final TagKey<@NotNull Item> DENDRYMYCOS_LOGS = createTag("dendrymycos_logs");
        public static final TagKey<@NotNull Item> EUCALYPTUS_LOGS = createTag("eucalyptus_logs");
        public static final TagKey<@NotNull Item> SEQUOIA_LOGS = createTag("sequoia_logs");
        public static final TagKey<@NotNull Item> PETRIFIED_LOGS = createTag("petrified_logs");

        private static TagKey<@NotNull Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, name));
        }
    }
}
