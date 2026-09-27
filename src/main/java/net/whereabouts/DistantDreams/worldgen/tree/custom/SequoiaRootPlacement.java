package net.whereabouts.DistantDreams.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryCodecs;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public record SequoiaRootPlacement( int maxRootWidth, int maxRootLength, float randomSkewChance) {
    public static final Codec<SequoiaRootPlacement> CODEC = RecordCodecBuilder.create((i) -> i.group(Codec.intRange(1, 12).fieldOf("max_root_width").forGetter((p) -> p.maxRootWidth), Codec.intRange(1, 64).fieldOf("max_root_length").forGetter((p) -> p.maxRootLength), Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter((p) -> p.randomSkewChance)).apply(i, SequoiaRootPlacement::new));
}
