package net.whereabouts.DistantDreams.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DDPlacedFeatures {
    public static final ResourceKey<@NotNull PlacedFeature> ANCIENT_ACACIA_PLACED_KEY = registerKey("ancient_acacia_placed");
    public static final ResourceKey<@NotNull PlacedFeature> ANCIENT_BIRCH_PLACED_KEY = registerKey("ancient_birch_placed");
    public static final ResourceKey<@NotNull PlacedFeature> ANCIENT_OAK_PLACED_KEY = registerKey("ancient_oak_placed");

    public static final ResourceKey<@NotNull PlacedFeature> SEQUOIA_PLACED_KEY = registerKey("sequoia_placed");

    public static void bootstrap(BootstrapContext<@NotNull PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ANCIENT_ACACIA_PLACED_KEY, configuredFeatures.getOrThrow(DDConfiguredFeatures.ANCIENT_ACACIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.01f, 1),
                        DDBlocks.ANCIENT_ACACIA_SAPLING.get()));

        register(context, ANCIENT_BIRCH_PLACED_KEY, configuredFeatures.getOrThrow(DDConfiguredFeatures.ANCIENT_BIRCH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.01f, 1),
                        DDBlocks.ANCIENT_BIRCH_SAPLING.get()));

        register(context, ANCIENT_OAK_PLACED_KEY, configuredFeatures.getOrThrow(DDConfiguredFeatures.ANCIENT_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.2f, 1),
                        DDBlocks.ANCIENT_OAK_SAPLING.get()));

       // register(context, ANCIENT_MANGROVE_PLACED_KEY, configuredFeatures.getOrThrow(DDConfiguredFeatures.ANCIENT_MANGROVE_KEY),
      //          VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.01f, 1),
       //                 DDBlocks.ANCIENT_MANGROVE_SAPLING.get()));


        register(context, SEQUOIA_PLACED_KEY, configuredFeatures.getOrThrow(DDConfiguredFeatures.SEQUOIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        DDBlocks.SEQUOIA_SAPLING.get()));
    }

    private static ResourceKey<@NotNull PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, name));
    }

    private static void register(BootstrapContext<@NotNull PlacedFeature> context, ResourceKey<@NotNull PlacedFeature> key,
                                 Holder<@NotNull ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
