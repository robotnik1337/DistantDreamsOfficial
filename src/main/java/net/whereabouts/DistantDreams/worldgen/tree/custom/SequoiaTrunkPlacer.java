package net.whereabouts.DistantDreams.worldgen.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.whereabouts.DistantDreams.worldgen.tree.DDTrunkPlacerTypes;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class SequoiaTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<SequoiaTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            trunkPlacerParts(instance).apply(instance, SequoiaTrunkPlacer::new));

    public SequoiaTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() { return DDTrunkPlacerTypes.SEQUOIA_TRUNK_PLACER.get(); }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(WorldGenLevel worldGenLevel, BiConsumer<BlockPos, BlockState> biConsumer, RandomSource randomSource, int treeHeight, BlockPos blockPos, TreeConfiguration treeConfiguration) {
        // TODO (much later): turn the dirt into what we actually want to be placed under the sequoia tree (fertile soil, distant dirt, something else?)

        // Place dirt around the sapling in a circle.
        BlockPos blockpos = blockPos.below();
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos, treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.north(), treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.north().east(), treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.east(), treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.south().east(), treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.south(), treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.south().west(), treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.west(), treeConfiguration);
        placeBelowTrunkBlock(worldGenLevel, biConsumer, randomSource, blockpos.north().west(), treeConfiguration);

        List<FoliagePlacer.FoliageAttachment> attachments = new java.util.ArrayList<>();

        for (int currentHeight = 0; currentHeight < treeHeight; currentHeight++) {

            // circular trunk generation.
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).north(), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).north().east(), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).east(), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).south().east(), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).south(), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).south().west(), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).west(), treeConfiguration);
            placeLog(worldGenLevel, biConsumer, randomSource, blockPos.above(currentHeight).north().west(), treeConfiguration);

            // generate a branch for one side of the tree based on height of the current level. grab the tip of the branch to add a foliage attachment to.
            BlockPos branchTipPosition1 = generateBranch(currentHeight, worldGenLevel, biConsumer, randomSource, treeConfiguration, blockPos, treeHeight, currentHeight % 2 == 0 ? Direction.NORTH : Direction.WEST);
            BlockPos branchTipPosition2 = generateBranch(currentHeight, worldGenLevel, biConsumer, randomSource, treeConfiguration, blockPos, treeHeight, currentHeight % 2 == 0 ? Direction.SOUTH : Direction.EAST);
            if (branchTipPosition1 != BlockPos.ZERO) {
                attachments.add(new FoliagePlacer.FoliageAttachment(branchTipPosition1, 0, false));
            }

            if (branchTipPosition2 != BlockPos.ZERO) {
                attachments.add(new FoliagePlacer.FoliageAttachment(branchTipPosition2, 0, false));
            }
        }

        attachments.add(new FoliagePlacer.FoliageAttachment(blockPos.above(treeHeight - 1), 1, true));
        return ImmutableList.copyOf(attachments);
    }

    private BlockPos generateBranch(int currentLoopLevel, WorldGenLevel worldGenLevel, BiConsumer<BlockPos, BlockState> biConsumer,
                                    RandomSource randomSource, TreeConfiguration treeConfiguration, BlockPos blockPos, int treeHeight,
                                    Direction pDirection) {
        // reverse tree height calculation so that 0 is the top of the tree and treeHeight is the bottom .
        // if the current height is not within the range we can place branches, quit immediately.
        int currentTreeHeight = treeHeight - currentLoopLevel;
        if (currentTreeHeight < 0 || currentTreeHeight > 25) return BlockPos.ZERO;

        // from the top of the tree to 6 blocks down, the branches should be one block in length.
        // from 7 to 16 blocks down, they should be two blocks in length.
        // from 17 to 25 blocks down, they should be three blocks in length.
        int branchLength = currentTreeHeight >= 16 ? 3 : currentTreeHeight >= 6 ? 2 : 1;


        // create a new BlockPos that is offset to the outside of the tree to start placing branches.
        // also, use the direction that the branch is heading in to determine what rotation of the log to use.
        BlockPos currentBranchPosition = blockPos.above(currentLoopLevel).relative(pDirection, 1)
                .relative(pDirection.getClockWise(), randomSource.nextIntBetweenInclusive(-1, 1));
        Direction.Axis branchDirectionAxis = pDirection == Direction.NORTH || pDirection == Direction.SOUTH ? Direction.Axis.Z : Direction.Axis.X;

        for (int i = 0; i < branchLength; i++) {
            // move the current branch position forward by 1 block for the next log to be placed.
            currentBranchPosition = currentBranchPosition.relative(pDirection, 1);

            if (i == 0) {
                // don't make offset adjustments if this is the first log on the branch (may change later).
                biConsumer.accept(currentBranchPosition, ((BlockState) Function.identity().apply(treeConfiguration.trunkProvider.getState(worldGenLevel, randomSource, blockPos)
                        .setValue(RotatedPillarBlock.AXIS, branchDirectionAxis))));
            } else {
                // otherwise, offset the next branch either above or on the same level as the previous branch, then
                // offset along the clockwise axis of the current branch direction.
                if (randomSource.nextBoolean()) { currentBranchPosition = currentBranchPosition.above(); }
                currentBranchPosition = currentBranchPosition.relative(pDirection.getClockWise(), randomSource.nextIntBetweenInclusive(-1, 1));
                biConsumer.accept(currentBranchPosition,
                        ((BlockState) Function.identity().apply(treeConfiguration.trunkProvider.getState(worldGenLevel, randomSource, blockPos).setValue(RotatedPillarBlock.AXIS, branchDirectionAxis))));

            }
        }
        // store the current branch position to add to the list of foliage attachment locations, then return that position.
        return currentBranchPosition;
    }

//    private void placeLogIfFreeWithOffset(
//            WorldGenLevel worldGenLevel,
//            BiConsumer<BlockPos, BlockState> biConsumer,
//            RandomSource randomSource,
//            BlockPos.MutableBlockPos blockPos,
//            TreeConfiguration treeConfiguration,
//            BlockPos offsetBlockPosition,
//            int pOffsetX,
//            int pOffsetY,
//            int pOffsetZ
//    ) {
//        blockPos.setWithOffset(offsetBlockPosition, pOffsetX, pOffsetY, pOffsetZ);
//        this.placeLogIfFree(worldGenLevel, biConsumer, randomSource, blockPos, treeConfiguration);
//    }

}
