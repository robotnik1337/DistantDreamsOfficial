package net.whereabouts.DistantDreams.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

public class FertileSoilBlock extends GrassBlock {
    public FertileSoilBlock(Properties properties) {
        super(properties);
    }

//    @Override
//    public BlockState getToolModifiedState(BlockState state,
//                                           UseOnContext ctx,
//                                           ItemAbility action,
//                                           boolean simulate) {
//        // We only care about hoes performing the TILL action
//        if (action == ItemAbility.) {
//            // Only allow if the space above is air (matches vanilla farmland rule)
//            BlockPos pos = ctx.getClickedPos();
//            if (ctx.getLevel().getBlockState(pos.above()).isAir()) {
//                // Play the till sound once Forge replaces the block (simulate == false)
//                if (!simulate) {
//                    ctx.getLevel().playSound(null, pos,
//                            SoundEvents.HOE_TILL,
//                            ctx.getLevel().isClientSide ? net.minecraft.sounds.SoundSource.AMBIENT
//                                    : net.minecraft.sounds.SoundSource.BLOCKS,
//                            1.0F, 1.0F);
//                }
//                return Blocks.DIRT.defaultBlockState();
//            }
//        }
//        // Any other tool action → let vanilla/other mods handle it
//        return super.getToolModifiedState(state, ctx, action, simulate);
//    }
}
