package net.Bankgo.DistantDreams.worldgen.tree;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower EUCALYPTUS = new TreeGrower(DistantDreams.MODID + ":eucalyptus",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EUCALYPTUS_KEY), Optional.empty());

    public static final TreeGrower SEQUOIA = new TreeGrower(DistantDreams.MODID + ":sequoia",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SEQUOIA_KEY), Optional.empty());
}
