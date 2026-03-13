package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.NotNull;

public class FertileSoilBlock extends GrassBlock {
    public FertileSoilBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public BlockState getToolModifiedState(BlockState state,
                                           UseOnContext ctx,
                                           ToolAction action,
                                           boolean simulate) {
        // We only care about hoes performing the TILL action
        if (action == ToolActions.HOE_TILL) {
            // Only allow if the space above is air (matches vanilla farmland rule)
            BlockPos pos = ctx.getClickedPos();
            if (ctx.getLevel().getBlockState(pos.above()).isAir()) {
                // Play the till sound once Forge replaces the block (simulate == false)
                if (!simulate) {
                    ctx.getLevel().playSound(null, pos,
                            SoundEvents.HOE_TILL,
                            ctx.getLevel().isClientSide ? net.minecraft.sounds.SoundSource.AMBIENT
                                    : net.minecraft.sounds.SoundSource.BLOCKS,
                            1.0F, 1.0F);
                }
                return ModBlocks.FERTILE_DIRT.get().defaultBlockState();
            }
        }
        // Any other tool action → let vanilla/other mods handle it
        return super.getToolModifiedState(state, ctx, action, simulate);
    }

    @Override
    protected void randomTick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        if (!canSurvive(level, pos)) {
            level.setBlockAndUpdate(pos, ModBlocks.FERTILE_DIRT.get().defaultBlockState());
            return;
        }

        if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
            for (int i = 0; i < 4; i++) {
                BlockPos targetPos = pos.offset(
                        random.nextInt(3) - 1,
                        random.nextInt(5) - 3,
                        random.nextInt(3) - 1
                );
                if (level.getBlockState(targetPos).is(ModBlocks.FERTILE_DIRT.get()) || level.getBlockState(targetPos).is(Blocks.DIRT)) {
                    if (canSurvive(level, targetPos)) {
                        level.setBlockAndUpdate(pos, ModBlocks.FERTILE_SOIL.get().defaultBlockState());
                    }
                }
            }
        }
    }

    private boolean canSurvive(ServerLevel level, BlockPos pos) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);
        return !aboveState.isSolidRender();
    }
}
