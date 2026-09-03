package net.whereabouts.DistantDreams.worldgen;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.whereabouts.DistantDreams.DistantDreams;
import org.jetbrains.annotations.NotNull;

public class DDBiomeModifiers {
    public static void bootstrap(BootstrapContext<@NotNull BiomeModifier> context) {}

    private static ResourceKey<@NotNull BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, name));
    }
}
