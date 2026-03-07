package net.Bankgo.DistantDreams.worldgen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.worldgen.biome.ModBiomes;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_EUCALYPTUS_TREE = registerKey("add_tree_eucalyptus");
    public static final ResourceKey<BiomeModifier> ADD_SEQUOIA_TREE = registerKey("add_tree_sequoia");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_EUCALYPTUS_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SAVANNA), biomes.getOrThrow(Biomes.SAVANNA_PLATEAU), biomes.getOrThrow(Biomes.WINDSWEPT_SAVANNA)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.EUCALYPTUS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        context.register(ADD_SEQUOIA_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SEQUOIA_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID, name));
    }
}
