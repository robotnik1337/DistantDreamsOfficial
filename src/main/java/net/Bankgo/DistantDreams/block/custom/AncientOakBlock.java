package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class AncientOakBlock extends ModFlammableRotatedPillarBlock {

    public AncientOakBlock(Properties pProperties) {
        super(pProperties.explosionResistance(10), 20, 0);
    }

    @Override
    protected void neighborChanged(@NonNull BlockState pState, @NonNull Level pLevel, @NonNull BlockPos pPos, @NonNull Block pNeighborBlock, @Nullable Orientation pOrientation, boolean pMovedByPiston) {
        if (pNeighborBlock.defaultBlockState().is(BlockTags.FIRE)) {
            pLevel.scheduleTick(pPos, pState.getBlock(), 1);
        }
        super.neighborChanged(pState, pLevel, pPos, pNeighborBlock, pOrientation, pMovedByPiston);
    }


    @Override
    protected void tick(@NonNull BlockState pState, @NonNull ServerLevel pLevel, @NonNull BlockPos pPos, @NonNull RandomSource pRandom) {
        charBlock(pLevel, pPos);
        super.tick(pState, pLevel, pPos, pRandom);
    }


    public void charBlock(Level level, BlockPos pos) {
        if (!level.isClientSide()) {
            if (level instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.SMOKE, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                        5, 0.2, 0.2, 0.2, 0.05
                );
            }

            BlockState blockState = level.getBlockState(pos);
            BlockState charredBlock = getCharredBlock(blockState.getBlock(), blockState.getValue(AXIS));

            level.setBlock(pos, charredBlock, 3);
            level.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 0.25F, 1.0F);
        }
    }

    private static BlockState getCharredBlock(Block blockToChar, Direction.Axis originalAxis) {
        BlockState charredBlock = null;

        if (blockToChar == ModBlocks.ANCIENT_OAK_LOG.get()) {
            charredBlock = ModBlocks.CHARRED_LOG.get().defaultBlockState().setValue(AXIS, originalAxis);
        } else if (blockToChar == ModBlocks.ANCIENT_OAK_WOOD.get()) {
            charredBlock = ModBlocks.CHARRED_WOOD.get().defaultBlockState().setValue(AXIS, originalAxis);
        } else if (blockToChar == ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get()) {
            charredBlock = ModBlocks.STRIPPED_CHARRED_LOG.get().defaultBlockState().setValue(AXIS, originalAxis);
        } else if (blockToChar == ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get()) {
            charredBlock = ModBlocks.STRIPPED_CHARRED_WOOD.get().defaultBlockState().setValue(AXIS, originalAxis);
        }
        return charredBlock;
    }
}
