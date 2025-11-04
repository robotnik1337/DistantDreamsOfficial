package net.Bankgo.DistantDreams.worldgen.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.Bankgo.DistantDreams.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;


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
         // TODO (much later): turn the dirt into what we actually want to be placed under the sequoia tree (fertile soil, distant dirt, something else?)

        // Place dirt around the sapling in a circle.
        BlockPos blockpos = pPos.below();
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos, pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.north(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.north().east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().east(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.south().west(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.west(), pConfig);
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos.north().west(), pConfig);

        List<FoliagePlacer.FoliageAttachment> attachments = new java.util.ArrayList<>();

        for (int i = 0; i < pFreeTreeHeight; i++) {

            // circular trunk generation.
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).north(), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).north().east(), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).east(), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).south().east(), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).south(), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).south().west(), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).west(), pConfig);
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).north().west(), pConfig);

            // generate a branch for one side of the tree based on height of the current level. grab the tip of the branch to add a foliage attachment to.
            BlockPos branchTipPosition = generateBranch(i, pLevel, pBlockSetter, pRandom, pConfig, pPos, pFreeTreeHeight);
            if (branchTipPosition != BlockPos.ZERO) {
                attachments.add(new FoliagePlacer.FoliageAttachment(branchTipPosition, 0, false));
            }
//            generateBranch(i, pLevel, pBlockSetter, pRandom, pConfig, pPos, pFreeTreeHeight);
//            generateBranch(i, pLevel, pBlockSetter, pRandom, pConfig, pPos, pFreeTreeHeight);
//            generateBranch(i, pLevel, pBlockSetter, pRandom, pConfig, pPos, pFreeTreeHeight);
        }

        attachments.add(new FoliagePlacer.FoliageAttachment(pPos.above(pFreeTreeHeight - 1), 1, true));
        return ImmutableList.copyOf(attachments);
//        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(pFreeTreeHeight), 0, true));
    }

     private BlockPos generateBranch(int currentLoopLevel, LevelSimulatedReader pLevel,
                                 BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom,
                                 TreeConfiguration pConfig,
                                 BlockPos pPos, int pFreeTreeHeight) {
         // reverse tree height calculation so that 0 is the top of the tree and pFreeTreeHeight is the bottom .
         // if the current height is not within the range we can place branches, quit immediately.
         int currentTreeHeight = pFreeTreeHeight - currentLoopLevel;
         if (currentTreeHeight < 0 || currentTreeHeight > 25) return BlockPos.ZERO;

         // from the top of the tree to 6 blocks down, the branches should be one block in length.
         // from 7 to 16 blocks down, they should be two blocks in length.
         // from 17 to 25 blocks down, they should be three blocks in length.
         int branchLength = currentTreeHeight >= 16 ? 3 : currentTreeHeight >= 6 ? 2 : 1;

         // pick which side of the tree the branch will extrude from based on the current height.
         Direction branchStartingDirection = currentLoopLevel % 4 == 0 ? Direction.NORTH :
                 currentLoopLevel % 4 == 1 ? Direction.EAST : currentLoopLevel % 4 == 2 ? Direction.SOUTH : Direction.WEST;
         BlockPos currentBranchPosition = pPos.above(currentLoopLevel).relative(branchStartingDirection, 1);
         Direction.Axis branchDirectionAxis = branchStartingDirection == Direction.NORTH || branchStartingDirection == Direction.SOUTH ? Direction.Axis.Z : Direction.Axis.X;

         for (int i = 0; i < branchLength; i++) {
             // move the current branch position forward by 1 block for the next log to be placed.
             currentBranchPosition = currentBranchPosition.relative(branchStartingDirection, 1);

             if (i == 0) {
                 pBlockSetter.accept(currentBranchPosition, ((BlockState) Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos)
                         .setValue(RotatedPillarBlock.AXIS, branchDirectionAxis))));
             } else {
                 if (pRandom.nextBoolean()) { currentBranchPosition = currentBranchPosition.above(); }
                 currentBranchPosition = currentBranchPosition.relative(branchStartingDirection.getClockWise(), pRandom.nextIntBetweenInclusive(-1, 1));
                 pBlockSetter.accept(currentBranchPosition,
                         ((BlockState) Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, branchDirectionAxis))));

             }
         }
         // store the current branch position to add to the list of foliage attachment locations, then return that position.
         return currentBranchPosition;
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
