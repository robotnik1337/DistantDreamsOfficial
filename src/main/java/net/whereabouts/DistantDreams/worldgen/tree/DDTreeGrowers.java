package net.whereabouts.DistantDreams.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.worldgen.DDConfiguredFeatures;

import java.util.Optional;

public class DDTreeGrowers {
    public static final TreeGrower ANCIENT_OAK = new TreeGrower(DistantDreams.MOD_ID + "ANCIENT_OAK",
            Optional.empty(), Optional.of(DDConfiguredFeatures.ANCIENT_OAK_KEY), Optional.empty());

    public static final TreeGrower EUCALYPTUS = new TreeGrower(DistantDreams.MOD_ID + "eucalyptus",
                Optional.empty(), Optional.of(DDConfiguredFeatures.EUCALYPTUS_KEY), Optional.empty());

    public static final TreeGrower SEQUOIA = new TreeGrower(DistantDreams.MOD_ID + "sequoia",
            Optional.empty(), Optional.of(DDConfiguredFeatures.SEQUOIA_KEY), Optional.empty());
}
