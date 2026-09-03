package net.whereabouts.DistantDreams.worldgen.tree.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.whereabouts.DistantDreams.worldgen.tree.DDFoliagePlacers;
import org.jetbrains.annotations.NotNull;

public class SequoiaFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<SequoiaFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec((RecordCodecBuilder.Instance<SequoiaFoliagePlacer> sequoiaFoliagePlacerInstance) ->
            foliagePlacerParts(sequoiaFoliagePlacerInstance).apply(sequoiaFoliagePlacerInstance, SequoiaFoliagePlacer::new));

    public SequoiaFoliagePlacer(IntProvider radius, IntProvider offset) {
        super(radius, offset);
    }

    @Override
    protected @NotNull FoliagePlacerType<?> type() {
        return DDFoliagePlacers.SEQUOIA_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(@NotNull WorldGenLevel worldGenLevel, @NotNull FoliageSetter foliageSetter, @NotNull RandomSource randomSource, @NotNull TreeConfiguration treeConfiguration, int i, FoliageAttachment foliageAttachment, int i1, int i2, int i3) {
        this.placeLeavesRow(worldGenLevel, foliageSetter, randomSource, treeConfiguration, foliageAttachment.pos().above(), 1, 0, false);
        tryPlaceLeaf(worldGenLevel, foliageSetter, randomSource, treeConfiguration, foliageAttachment.pos().above(2));
        tryPlaceLeaf(worldGenLevel, foliageSetter, randomSource, treeConfiguration, foliageAttachment.pos().above(2).north());
        tryPlaceLeaf(worldGenLevel, foliageSetter, randomSource, treeConfiguration, foliageAttachment.pos().above(2).east());
        tryPlaceLeaf(worldGenLevel, foliageSetter, randomSource, treeConfiguration, foliageAttachment.pos().above(2).south());
        tryPlaceLeaf(worldGenLevel, foliageSetter, randomSource, treeConfiguration, foliageAttachment.pos().above(2).west());
    }

    @Override
    public int foliageHeight(@NotNull RandomSource randomSource, int i, @NotNull TreeConfiguration treeConfiguration) { return 0; }

    @Override
    protected boolean shouldSkipLocation(@NotNull RandomSource randomSource, int i, int i1, int i2, int i3, boolean b) { return false; }

}
