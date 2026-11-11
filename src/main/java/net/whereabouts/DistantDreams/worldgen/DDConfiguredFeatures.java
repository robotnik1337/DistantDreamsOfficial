package net.whereabouts.DistantDreams.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.worldgen.tree.custom.SequoiaFoliagePlacer;
import net.whereabouts.DistantDreams.worldgen.tree.custom.SequoiaTrunkPlacer;
import org.jetbrains.annotations.NotNull;

public class DDConfiguredFeatures {
    public static final ResourceKey<@NotNull ConfiguredFeature<?, ?>> ANCIENT_ACACIA_KEY = registerKey("ancient_acacia");
    public static final ResourceKey<@NotNull ConfiguredFeature<?, ?>> ANCIENT_BIRCH_KEY = registerKey("ancient_birch");
    public static final ResourceKey<@NotNull ConfiguredFeature<?, ?>> ANCIENT_MANGROVE_KEY = registerKey("ancient_mangrove");
    public static final ResourceKey<@NotNull ConfiguredFeature<?, ?>> ANCIENT_OAK_KEY = registerKey("ancient_oak");

    public static final ResourceKey<@NotNull ConfiguredFeature<?, ?>> EUCALYPTUS_KEY = registerKey("eucalyptus");
    public static final ResourceKey<@NotNull ConfiguredFeature<?, ?>> SEQUOIA_KEY = registerKey("sequoia");

    public static void bootstrap(BootstrapContext<@NotNull ConfiguredFeature<?, ?>> context) {

        register(context, ANCIENT_ACACIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DDBlocks.ANCIENT_ACACIA_LOG.get()),
                new ForkingTrunkPlacer(7, 6, 3),

                BlockStateProvider.simple(DDBlocks.ANCIENT_ACACIA_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );

        register(context, ANCIENT_BIRCH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DDBlocks.ANCIENT_BIRCH_LOG.get()),
                new StraightTrunkPlacer(5, 4, 1),

                BlockStateProvider.simple(DDBlocks.ANCIENT_BIRCH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );

//        register(context, ANCIENT_MANGROVE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
//                BlockStateProvider.simple(DDBlocks.ANCIENT_MANGROVE_LOG.get()),
//                new UpwardsBranchingTrunkPlacer(5, 4, 1, 1, 1, 1,Blocks.MUD),
//
 //                BlockStateProvider.simple(DDBlocks.ANCIENT_MANGROVE_LEAVES_LEAVES.get()),
 //               new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),

   //             new TwoLayersFeatureSize(1, 0, 2)).build()
     //   );

        register(context, ANCIENT_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DDBlocks.ANCIENT_OAK_LOG.get()),
                new StraightTrunkPlacer(4, 2, 1),

                BlockStateProvider.simple(DDBlocks.ANCIENT_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );

        register(context, SEQUOIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DDBlocks.SEQUOIA_LOG.get()),
                new SequoiaTrunkPlacer(32, 8, 24),

                BlockStateProvider.simple(DDBlocks.SEQUOIA_LEAVES.get()),
                new SequoiaFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );
    }

    public static ResourceKey<@NotNull ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<@NotNull FC>> void register(
            BootstrapContext<@NotNull ConfiguredFeature<?, ?>> context, ResourceKey<@NotNull ConfiguredFeature<?, ?>> key,
            F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
