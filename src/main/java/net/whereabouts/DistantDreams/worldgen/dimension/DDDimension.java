package net.whereabouts.DistantDreams.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TimelineTags;
import net.minecraft.util.ARGB;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.clock.WorldClocks;
import net.minecraft.world.level.CardinalLighting;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.worldgen.biome.DDBiomes;

import java.util.List;
import java.util.Optional;

public class DDDimension {
    public static final ResourceKey<LevelStem> DDDIM_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "dddim"));
    public static final ResourceKey<Level> DDDIM_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "dddim"));
    public static final ResourceKey<DimensionType> DDDIM_TYPE_KEY = ResourceKey.create(Registries.DIMENSION_TYPE,
            Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "dddim_type"));

    public static void bootstrapType(BootstrapContext<DimensionType> context) {
        var timelines = context.lookup(Registries.TIMELINE);
        var clocks = context.lookup(Registries.WORLD_CLOCK);
        var blocks = context.lookup(Registries.BLOCK);

        context.register(DDDIM_TYPE_KEY, new DimensionType(
                false,
                true,
                false,
                false,
                1.0,
                -64,
                256,
                256,
                blocks.getOrThrow(BlockTags.INFINIBURN_OVERWORLD).key(),
                1.0f,
                new DimensionType.MonsterSettings(ConstantInt.of(0), 0),
                DimensionType.Skybox.OVERWORLD,
                CardinalLighting.Type.DEFAULT,
                EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, -6168523)
                        .set(EnvironmentAttributes.SKY_COLOR, 0xBFD8DB)
                        .set(EnvironmentAttributes.AMBIENT_LIGHT_COLOR, -4212331)
                        .set(EnvironmentAttributes.CLOUD_COLOR, 0xE1F9FC)
                        .build(),
                timelines.getOrThrow(TimelineTags.IN_OVERWORLD),
                Optional.of(clocks.getOrThrow(WorldClocks.OVERWORLD))));
    }

    public static void bootstrapStem(BootstrapContext<LevelStem> context) {
        var biomes = context.lookup(Registries.BIOME);
        var dimensionTypes = context.lookup(Registries.DIMENSION_TYPE);
        var noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator singleBiomeGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomes.getOrThrow(Biomes.FOREST)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        NoiseBasedChunkGenerator multiBiomeGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(0f, 0f, 0f, 0f, 0f, 0f, 0f), biomes.getOrThrow(Biomes.FOREST)),
                                Pair.of(Climate.parameters(0f, 0.5f, 0f, 0f, 0f, 1f, 0f), biomes.getOrThrow(DDBiomes.SEQUOIA_FOREST)),
                                Pair.of(Climate.parameters(0.1f, 0.1f, 0f, 0f, 0f, 0f, 0f), biomes.getOrThrow(DDBiomes.DISTANT_FOREST))
                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        context.register(DDDIM_KEY, new LevelStem(dimensionTypes.getOrThrow(DDDimension.DDDIM_TYPE_KEY), multiBiomeGenerator));
    }
}
