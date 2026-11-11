package net.whereabouts.DistantDreams.worldgen.dimension;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.NoiseRouter;
import net.minecraft.world.level.levelgen.NoiseRouterData;

public class DDNoiseRouter extends NoiseRouterData {
   public static NoiseRouter overworldLikeNoise(BootstrapContext<?> context, boolean isAmplified, boolean largeBiomes) {
       return NoiseRouterData.overworld(context.lookup(Registries.DENSITY_FUNCTION), context.lookup(Registries.NOISE), largeBiomes, isAmplified);
   }
}
