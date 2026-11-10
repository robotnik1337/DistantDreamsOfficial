package net.whereabouts.DistantDreams.block.wood;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.whereabouts.DistantDreams.DistantDreams;

public class DDWoods {
    public static final BlockSetType ANCIENT_OAK_WOOD_SET = new BlockSetType(DistantDreams.prefix("ancient_oak").toString());
    public static final BlockSetType ANCIENT_BIRCH_WOOD_SET = new BlockSetType(DistantDreams.prefix("ancient_birch").toString());
    public static final BlockSetType ANCIENT_ACACIA_WOOD_SET = new BlockSetType(DistantDreams.prefix("ancient_acacia").toString());
    public static final BlockSetType ANCIENT_MANGROVE_WOOD_SET = new BlockSetType(DistantDreams.prefix("ancient_mangrove").toString());
    public static final BlockSetType CHARRED_WOOD_SET = new BlockSetType(DistantDreams.prefix("charred").toString());
    public static final BlockSetType PETRIFIED_WOOD_SET = new BlockSetType(DistantDreams.prefix("petrified").toString());
    public static final BlockSetType EUCALYPTUS_WOOD_SET = new BlockSetType(DistantDreams.prefix("eucalyptus").toString());
    public static final BlockSetType SEQUOIA_WOOD_SET = new BlockSetType(DistantDreams.prefix("sequoia").toString());
    public static final BlockSetType DENDRANTHOS_WOOD_SET = new BlockSetType(DistantDreams.prefix("dendranthos").toString());
    public static final BlockSetType DENDRYMYCOS_WOOD_SET = new BlockSetType(DistantDreams.prefix("dendrymycos").toString());

    public static final WoodType ANCIENT_OAK_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("ancient_oak").toString(), ANCIENT_OAK_WOOD_SET));
    public static final WoodType ANCIENT_BIRCH_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("ancient_acacia").toString(), ANCIENT_ACACIA_WOOD_SET));
    public static final WoodType ANCIENT_ACACIA_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("ancient_birch").toString(), ANCIENT_BIRCH_WOOD_SET));
    public static final WoodType ANCIENT_MANGROVE_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("ancient_mangrove").toString(), ANCIENT_MANGROVE_WOOD_SET));
    public static final WoodType CHARRED_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("charred").toString(), CHARRED_WOOD_SET));
    public static final WoodType PETRIFIED_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("petrified").toString(), PETRIFIED_WOOD_SET));
    public static final WoodType EUCALYPTUS_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("eucalyptus").toString(), EUCALYPTUS_WOOD_SET));
    public static final WoodType SEQUOIA_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("sequoia").toString(), SEQUOIA_WOOD_SET));
    public static final WoodType DENDRANTHOS_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("dendranthos").toString(), DENDRANTHOS_WOOD_SET));
    public static final WoodType DENDRYMYCOS_WOOD_TYPE = WoodType.register(new WoodType(DistantDreams.prefix("dendrymycos").toString(), DENDRYMYCOS_WOOD_SET));
}
