package net.whereabouts.DistantDreams.worldgen.biome;

import net.minecraft.resources.Identifier;
import net.whereabouts.DistantDreams.DistantDreams;
import terrablender.api.Regions;

public class DDTerrablender {
    public static void registerBiomes() {
        Regions.register(new DDOverworldRegion(Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "overworld"), 10));
    }
}
