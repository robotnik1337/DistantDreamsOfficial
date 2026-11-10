package net.whereabouts.DistantDreams.worldgen.dimension;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseSettings;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.worldgen.biome.surface.DDSurfaceRules;

import java.util.List;

public class DDNoiseGeneratorSettings {
    public static final ResourceKey<NoiseGeneratorSettings> DISTANT_REALM =
            ResourceKey.create(Registries.NOISE_SETTINGS, Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "distant_realm"));

    public static void bootstrap(BootstrapContext<NoiseGeneratorSettings> context) {
        context.register(DISTANT_REALM, new NoiseGeneratorSettings(
                new NoiseSettings(-64, 384, 1, 2),
                DDBlocks.DISTANT_STONE.get().defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                DDNoiseRouter.overworldLikeNoise(context, false, true),
                DDSurfaceRules.makeDistantRealmRules(),
                List.of(),
                63,
                false,
                true,
                true,
                false
        ));
    }
}
