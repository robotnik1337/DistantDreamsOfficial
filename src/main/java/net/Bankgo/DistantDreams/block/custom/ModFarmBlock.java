package net.Bankgo.DistantDreams.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModFarmBlock extends FarmBlock {
    public ModFarmBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(@NotNull BlockState pState,
                           @NotNull ServerLevel pLevel,
                           @NotNull BlockPos pPos,
                           @NotNull RandomSource pRandom) {
        super.randomTick(pState, pLevel, pPos, pRandom);
        // Double the speed of crops
        BlockPos abovePos = pPos.above();
        BlockState aboveState = pLevel.getBlockState(abovePos);
        // Give the crop above an extra chance to grow
        if (aboveState.getBlock() instanceof net.minecraft.world.level.block.CropBlock){
            aboveState.randomTick(pLevel, abovePos, pRandom);
        }
    }

    @Override
    public boolean canSustainPlant(@NotNull BlockState state,
                                   @NotNull BlockGetter level,
                                   @NotNull BlockPos pos,
                                   @NotNull Direction face,
                                   net.minecraftforge.common.@NotNull IPlantable plantable) {
        // allow stems (or any plant) to grow on this block
        return true;
    }
}
