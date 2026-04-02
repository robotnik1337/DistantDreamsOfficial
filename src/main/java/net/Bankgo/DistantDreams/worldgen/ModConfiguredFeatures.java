package net.Bankgo.DistantDreams.worldgen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.worldgen.tree.custom.SequoiaFoliagePlacer;
import net.Bankgo.DistantDreams.worldgen.tree.custom.SequoiaTrunkPlacer;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_OAK_KEY = registerKey("ancient_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EUCALYPTUS_KEY = registerKey("eucalyptus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA_KEY = registerKey("sequoia");

    public static final ResourceKey<ConfiguredFeature<?, ?>> FERN_KEY = registerKey("fern");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA_FLOWERS_KEY = registerKey("sequoia_flowers");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, ANCIENT_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ANCIENT_OAK_LOG.get()),
                new DarkOakTrunkPlacer(6, 2, 1),

                BlockStateProvider.simple(ModBlocks.ANCIENT_OAK_LEAVES.get()),
                new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );

        register(context, EUCALYPTUS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.EUCALYPTUS_LOG.get()),
                new FancyTrunkPlacer(16, 1, 4),

                BlockStateProvider.simple(ModBlocks.EUCALYPTUS_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2)),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );


        register(context, SEQUOIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.SEQUOIA_LOG.get()),
                new SequoiaTrunkPlacer(32, 8, 24),

            BlockStateProvider.simple(ModBlocks.SEQUOIA_LEAVES.get()),
                new SequoiaFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );


        register(context, FERN_KEY, Feature.RANDOM_PATCH,
                grassPatch(
                        new WeightedStateProvider(
                                WeightedList.<BlockState>builder()
                                        .add(Blocks.SHORT_GRASS.defaultBlockState(), 10)
                                        .add(Blocks.FERN.defaultBlockState(), 3)
                                        .add(Blocks.LARGE_FERN.defaultBlockState(), 1)
                        ), 32
                )
        );

        register(context, SEQUOIA_FLOWERS_KEY, Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.FLOWER, grassPatch(BlockStateProvider.simple(Blocks.ROSE_BUSH), 16)
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.FLOWER, grassPatch(BlockStateProvider.simple(Blocks.LILAC), 16)
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.FLOWER,
                                        grassPatch(
                                                new WeightedStateProvider(
                                                        WeightedList.<BlockState>builder()
                                                                .add(Blocks.CORNFLOWER.defaultBlockState(), 1)
                                                                .add(Blocks.ORANGE_TULIP.defaultBlockState(), 1)
                                                ),
                                                32
                                        )
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.FLOWER, grassPatch(BlockStateProvider.simple(Blocks.AZURE_BLUET), 32)
                                )
                        )
                )
        );

    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider pStateProvider, int pTries) {
        return FeatureUtils.simpleRandomPatchConfiguration(pTries, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(pStateProvider)));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
