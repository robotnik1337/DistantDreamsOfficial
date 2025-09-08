package net.Bankgo.DistantDreams.worldgen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> EUCALYPTUS_KEY = registerKey("eucalyptus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIA_KEY = registerKey("sequoia");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, EUCALYPTUS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.EUCALYPTUS_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 3),

                BlockStateProvider.simple(ModBlocks.EUCALYPTUS_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );

        register(context, SEQUOIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.SEQUOIA_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 3),

            BlockStateProvider.simple(ModBlocks.SEQUOIA_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
