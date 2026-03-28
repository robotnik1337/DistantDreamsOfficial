package net.Bankgo.DistantDreams.worldgen.biome;

import net.Bankgo.DistantDreams.DistantDreams;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, "overworld"), 10));
    }
}
