package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

public class FertilePlotBlock extends FarmBlock {
    public FertilePlotBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(@NotNull BlockState pState, @NotNull ServerLevel pLevel, @NotNull BlockPos pPos, @NotNull RandomSource pRandom) {
        super.randomTick(pState, pLevel, pPos, pRandom);

        BlockState aboveState = pLevel.getBlockState(pPos.above());
        if (aboveState.is(BlockTags.CROPS)) { aboveState.randomTick(pLevel, pPos.above(), pRandom); }
    }

    @Override
    public void fallOn(@NotNull Level pLevel, @NotNull BlockState pState, @NotNull BlockPos pPos, @NotNull Entity pEntity, double pFallDistance) {
        BlockState blockstate = pushEntitiesUp(pState, ModBlocks.FERTILE_SOIL.get().defaultBlockState(), pLevel, pPos);
        pLevel.setBlockAndUpdate(pPos, blockstate);
        pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(pEntity, blockstate));
    }

    @Override
    public boolean canSustainPlant(@NotNull BlockState state,
                                   @NotNull BlockGetter level,
                                   @NotNull BlockPos pos,
                                   @NotNull Direction face,
                                   net.minecraftforge.common.@NotNull IPlantable plantable) { return true; }
}
