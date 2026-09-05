package net.whereabouts.DistantDreams.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.attribute.AmbientSounds;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.worldgen.DDPlacedFeatures;

public class DDBiomes {
    public static final ResourceKey<Biome> SEQUOIA_FOREST = ResourceKey.create(Registries.BIOME,
            Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "sequoia_forest"));

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
        // ! OVERALL TO-DO FOR THE SEQUOIA FOREST
        /* TODO: find out how to get trees to grow with specific amounts of saplings, then make sequoia only generate
            with 1x1, 2x2, or 3x3 square placements of saplings
         */
        // TODO: stop dirt from placing under sequoia trees, then make it so that tree placements cannot hang over any cliffs

        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        spawnBuilder.addSpawn(MobCategory.CREATURE, 5, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 4, 5));
        spawnBuilder.addSpawn(MobCategory.CREATURE, 5, new MobSpawnSettings.SpawnerData(EntityType.FOX, 2, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, 5, new MobSpawnSettings.SpawnerData(EntityType.SALMON, 4, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, 5, new MobSpawnSettings.SpawnerData(EntityType.GLOW_SQUID, 2, 4));

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
//        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES)
        BiomeDefaultFeatures.addBirchForestFlowers(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);

        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder, true);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DDPlacedFeatures.SEQUOIA_PLACED_KEY);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.WATER_FOG_COLOR, 0x2d84a6)
                        .set(EnvironmentAttributes.SKY_COLOR, 0x6cb4ce)
                        .set(EnvironmentAttributes.FOG_COLOR, 0xa1d8dd)
                        .set(EnvironmentAttributes.AMBIENT_SOUNDS, AmbientSounds.LEGACY_CAVE_SETTINGS)
                        .build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x2d84a6)
                        .grassColorOverride(0x39863d)
                        .foliageColorOverride(0x2e5d38)
                        .build())
//                        .backgroundMusic(Musics.createGameMusic(ModSounds.HYPNAGOGIA.getHolder().get())).build())
                .build();

    }
}
