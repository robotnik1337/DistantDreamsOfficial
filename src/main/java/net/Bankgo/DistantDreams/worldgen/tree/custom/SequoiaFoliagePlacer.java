package net.Bankgo.DistantDreams.worldgen.tree.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.Bankgo.DistantDreams.worldgen.tree.ModFoliagePlacers;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class SequoiaFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<SequoiaFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec((RecordCodecBuilder.Instance<SequoiaFoliagePlacer> sequoiaFoliagePlacerInstance) ->
            foliagePlacerParts(sequoiaFoliagePlacerInstance).apply(sequoiaFoliagePlacerInstance, SequoiaFoliagePlacer::new));

//    private final int height;

    public SequoiaFoliagePlacer(IntProvider pRadius, IntProvider pOffset) {
        super(pRadius, pOffset);
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacers.SEQUOIA_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig, int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        this.placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(), 1, 0, false);
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(2));
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(2).north());
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(2).east());
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(2).south());
        tryPlaceLeaf(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos().above(2).west());
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return 0;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        return false;
    }
}
