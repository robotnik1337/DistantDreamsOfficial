package net.Bankgo.DistantDreams.worldgen.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.Bankgo.DistantDreams.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class SequoiaTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<SequoiaTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(sequoiaTrunkPlacerInstance ->
            trunkPlacerParts(sequoiaTrunkPlacerInstance).apply(sequoiaTrunkPlacerInstance, SequoiaTrunkPlacer::new));

     public SequoiaTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() { return ModTrunkPlacerTypes.SEQUOIA_TRUNK_PLACER.get(); }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {

         boolean layerOnePlaced = false;
         boolean layerTwoPlaced = false;
         boolean layerThreePlaced = false;

         // TODO: turn the dirt into what we actually want to be placed under the sequoia tree (fertile soil, distant dirt, something else?)
        // Place dirt around the sapling in a circle.
        BlockPos blockpos = pPos.below();
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos, pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.east().east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().east().east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().south(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().south().east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().south().east().east(), pConfig);
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for (int i = 0; i < pFreeTreeHeight; i++) {
            this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 0, i, 0);
            if (i < pFreeTreeHeight - 1) {
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 1, i, 0);
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 2, i, 0);
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 0, i, 1);
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 1, i, 1);
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 2, i, 1);
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 0, i, 2);
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 1, i, 2);
                this.placeLogIfFreeWithOffset(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos, pConfig, pPos, 2, i, 2);
            }
        }

        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(pFreeTreeHeight), 0, true));
    }

    private void placeBranch(int freeTreeHeight, int currentTreeHeight) {
        // if the current height is not within the range we can place branches, quit immediately.
        if (currentTreeHeight < 0 || currentTreeHeight > 25) return;

        int branchLength = 0;

        // three separate cases for layers 1-3
        if (freeTreeHeight - currentTreeHeight >= 16 && freeTreeHeight - currentTreeHeight <= 25) {
            return;
        } else if (freeTreeHeight - currentTreeHeight >= 6 && freeTreeHeight - currentTreeHeight <= 15) {
            return;
        } else if (freeTreeHeight - currentTreeHeight >= 0 && freeTreeHeight - currentTreeHeight <= 5) {
            return;
        }


     }

     private void attemptBranchPlacement(int pFreeTreeHeight, int currentLoopLevel) {
         // reverse tree height calculation so that 0 is the top of the tree and pFreeTreeHeight is the bottom.
         int currentTreeHeight = pFreeTreeHeight - currentLoopLevel;
         // if the current height is not within the range we can place branches, quit immediately.
         if (currentTreeHeight < 0 || currentTreeHeight > 25) return;

         int branchLength = currentTreeHeight >= 16 ? 3 : currentTreeHeight >= 6 ? 2 : 1;
         int branchesSpawned = 0;

         for (int i = 0; i < branchLength; i++) {

         }
     }

    private void placeLogIfFreeWithOffset(
            LevelSimulatedReader pLevel,
            BiConsumer<BlockPos, BlockState> pBlockSetter,
            RandomSource pRandom,
            BlockPos.MutableBlockPos pPos,
            TreeConfiguration pConfig,
            BlockPos pOffsetPos,
            int pOffsetX,
            int pOffsetY,
            int pOffsetZ
    ) {
        pPos.setWithOffset(pOffsetPos, pOffsetX, pOffsetY, pOffsetZ);
        this.placeLogIfFree(pLevel, pBlockSetter, pRandom, pPos, pConfig);
    }
}
