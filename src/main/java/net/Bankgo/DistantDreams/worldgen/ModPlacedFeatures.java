package net.Bankgo.DistantDreams.worldgen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ANCIENT_OAK_PLACED_KEY = registerKey("ancient_oak_placed");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_PLACED_KEY = registerKey("eucalyptus_placed");
    public static final ResourceKey<PlacedFeature> SEQUOIA_PLACED_KEY = registerKey("sequoia_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ANCIENT_OAK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.EUCALYPTUS_SAPLING.get()));

        register(context, EUCALYPTUS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EUCALYPTUS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.EUCALYPTUS_SAPLING.get()));

        register(context, SEQUOIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SEQUOIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.SEQUOIA_SAPLING.get()));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
