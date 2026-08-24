package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class ModSoilBlock extends Block {
    public ModSoilBlock(Properties properties) {
        super(properties);
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
                // Return the block we want to become – Fertile Plot farmland
                return ModBlocks.FERTILE_PLOT.get().defaultBlockState();
            }
        }
        // Any other tool action → let vanilla/other mods handle it
        return super.getToolModifiedState(state, ctx, action, simulate);
    }
}
