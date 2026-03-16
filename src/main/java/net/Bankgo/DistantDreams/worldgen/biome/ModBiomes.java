package net.Bankgo.DistantDreams.worldgen.biome;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.sound.ModSounds;
import net.Bankgo.DistantDreams.worldgen.ModPlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModBiomes {
    public static final ResourceKey<Biome> SEQUOIA_FOREST = ResourceKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, "sequoia_forest"));

    public static void bootstrap(BootstrapContext<Biome> context) {
        context.register(SEQUOIA_FOREST, sequoiaForest(context));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    private static Biome sequoiaForest(BootstrapContext<Biome> context) {
        // OVERALL TO-DO FOR THE SEQUOIA FOREST
        // TODO: change parameters in sequoia forest section of ModOverworldRegion.java to be more closely aligned with old growth taiga
        // TODO: remove line of code in ModBiomes.java that spawns mossy cobblestone
        // TODO: change values in ModPlacedFeatures.java to increase frequency of ferns in sequoia forest
        /* TODO: fix dirt being placed in caves underneath the sequoia forest (may have to add deepslate rules like the
            guide did to fix this issue.
         */
        // TODO: add more vegetation to sequoia forest
        /* TODO: find out how to get trees to grow with specific amounts of saplings, then make sequoia only generate
                 with 1x1, 2x2, or 3x3 square placements of saplings
         */
        // TODO: stop dirt from placing under sequoia trees, then make it so that tree placements cannot hang over any cliffs

        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        spawnBuilder.addSpawn(MobCategory.CREATURE, 5, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 4, 5));

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addMossyStoneBlock(biomeBuilder);
        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
        BiomeDefaultFeatures.addFerns(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addExtraGold(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);

        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder, true);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.SEQUOIA_PLACED_KEY);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x2d84a6)
                        .waterFogColor(0x3f6471)
                        .skyColor(0x30c9d6)
                        .grassColorOverride(0x39863d)
                        .foliageColorOverride(0x2e5d38)
                        .fogColor(0xa1d8dd)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(ModSounds.HYPNAGOGIA.getHolder().get())).build())
                .build();

    }
}
