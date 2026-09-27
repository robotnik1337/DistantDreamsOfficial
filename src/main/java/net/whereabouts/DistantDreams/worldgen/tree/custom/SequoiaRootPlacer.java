package net.whereabouts.DistantDreams.worldgen.tree.custom;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.rootplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class SequoiaRootPlacer extends RootPlacer {
    public SequoiaRootPlacer(IntProvider trunkOffsetY, BlockStateProvider rootProvider, Optional<AboveRootPlacement> aboveRootPlacement, SequoiaRootPlacement sequoiaRootPlacement) {
        super(trunkOffsetY, rootProvider, aboveRootPlacement);
        this.sequoiaRootPlacement = sequoiaRootPlacement;
    }
    public static final int ROOT_WIDTH_LIMIT = 8;
    public static final int ROOT_LENGTH_LIMIT = 15;
    public static final MapCodec<SequoiaRootPlacer> CODEC = RecordCodecBuilder.mapCodec((i) -> rootPlacerParts(i).and(SequoiaRootPlacement.CODEC.fieldOf("sequoia_root_placement").forGetter((c) -> c.sequoiaRootPlacement)).apply(i, (IntProvider trunkOffsetY1, BlockStateProvider rootProvider1, Optional<AboveRootPlacement> aboveRootPlacement1, SequoiaRootPlacement aboveRootPlacement2) -> new SequoiaRootPlacer(trunkOffsetY1, rootProvider1, aboveRootPlacement1, aboveRootPlacement2)));
    private final SequoiaRootPlacement sequoiaRootPlacement;

    @Override
    protected RootPlacerType<?> type() {
        return null;
    }

    @Override
    public boolean placeRoots(WorldGenLevel level, BiConsumer<BlockPos, BlockState> rootSetter, RandomSource random, BlockPos origin, BlockPos trunkOrigin, TreeConfiguration config) {
        List<BlockPos> rootPositions = Lists.newArrayList();
        BlockPos.MutableBlockPos columnPos = origin.mutable();

        while(columnPos.getY() < trunkOrigin.getY()) {
            if (!this.canPlaceRoot(level, columnPos)) {
                return false;
            }

            columnPos.move(Direction.UP);
        }

        rootPositions.add(trunkOrigin.below());

        for(Direction dir : Direction.Plane.HORIZONTAL) {
            BlockPos pos = trunkOrigin.relative(dir);
            List<BlockPos> positionsInDirection = Lists.newArrayList();
            if (!this.simulateRoots(level, random, pos, dir, trunkOrigin, positionsInDirection, 0)) {
                return false;
            }

            rootPositions.addAll(positionsInDirection);
            rootPositions.add(trunkOrigin.relative(dir));
        }

        for(BlockPos rootPos : rootPositions) {
            this.placeRoot(level, rootSetter, random, rootPos, config);
        }

        return false;
    }

    private boolean simulateRoots(LevelSimulatedReader level, RandomSource random, BlockPos rootPos, Direction dir, BlockPos rootOrigin, List<BlockPos> rootPositions, int layer) {
        int maxRootLength =10;
        if (layer != maxRootLength && rootPositions.size() <= maxRootLength) {
            for(BlockPos pos : this.potentialRootPositions(rootPos, dir, random, rootOrigin)) {
                if (this.canPlaceRoot(level, pos)) {
                    rootPositions.add(pos);
                    if (!this.simulateRoots(level, random, pos, dir, rootOrigin, rootPositions, layer + 1)) {
                        return false;
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }

    protected List<BlockPos> potentialRootPositions(BlockPos pos, Direction prevDir, RandomSource random, BlockPos rootOrigin) {
        BlockPos below = pos.below();
        BlockPos nextTo = pos.relative(prevDir);
        int width = pos.distManhattan(rootOrigin);
        int maxRootWidth =7;
        float randomSkewChance = 0.3f;
        if (width > maxRootWidth - 3 && width <= maxRootWidth) {
            return random.nextFloat() < randomSkewChance ? List.of(below, nextTo.below()) : List.of(below);
        } else if (width > maxRootWidth) {
            return List.of(below);
        } else if (random.nextFloat() < randomSkewChance) {
            return List.of(below);
        } else {
            return random.nextBoolean() ? List.of(nextTo) : List.of(below);
        }
    }
}