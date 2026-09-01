package net.whereabouts.DistantDreams.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import net.whereabouts.DistantDreams.block.DDBlocks;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

public class AncientOakBlock extends DDWoodLogBlock {

    public AncientOakBlock(Properties properties) {
        super(properties.explosionResistance(10), 20, 0);
    }

    @Override
    protected void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos,
                                   @NotNull Block block, @Nullable Orientation orientation, boolean movedByPiston) {
        if (!level.isClientSide() && level instanceof ServerLevel serverLevel) {
            // check in all 6 directions to see if the neighbor block is on fire.
            boolean isOnFire = false;
            for (Direction direction : Direction.values()) {
                if (serverLevel.getBlockState(pos.relative(direction)).is(BlockTags.FIRE)) {
                    isOnFire = true;
                    break;
                }
            }

            // if it is on fire, schedule a delayed tick for the block to burn for a short while, then char.
            if (isOnFire) {
                // check for pre-existing scheduled ticks.
                if (!serverLevel.getBlockTicks().hasScheduledTick(pos, this)) {
                    serverLevel.scheduleTick(pos, this, serverLevel.getRandom().nextInt(61));
                }
            }
        }
        super.neighborChanged(state, level, pos, block, orientation, movedByPiston);
    }

    @Override
    protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        // after ignition, check to see if there are any other blocks to set light on fire before charring
        // the current block.
        for (Direction direction : Direction.values()) {
            BlockPos neighborPos = pos.relative(direction);
            BlockState neighborState = level.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof AncientOakBlock) {
                lightNearbyBlock(level, neighborPos);
                int neighborDelay = 20 + random.nextInt(81);
                level.scheduleTick(neighborPos, neighborState.getBlock(), neighborDelay);
                level.scheduleTick(neighborPos, neighborState.getBlock(), 10);
            }
        }

        charBlock(level, pos);
        super.tick(state, level, pos, random);
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

        if (blockToChar == DDBlocks.ANCIENT_OAK_LOG.get()) {
            charredBlock = DDBlocks.CHARRED_LOG.get().defaultBlockState().setValue(AXIS, originalAxis);
        } else if (blockToChar == DDBlocks.ANCIENT_OAK_WOOD.get()) {
            charredBlock = DDBlocks.CHARRED_WOOD.get().defaultBlockState().setValue(AXIS, originalAxis);
        } else if (blockToChar == DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get()) {
            charredBlock = DDBlocks.STRIPPED_CHARRED_LOG.get().defaultBlockState().setValue(AXIS, originalAxis);
        } else if (blockToChar == DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get()) {
            charredBlock = DDBlocks.STRIPPED_CHARRED_WOOD.get().defaultBlockState().setValue(AXIS, originalAxis);
        }
        return charredBlock;
    }

    private void lightNearbyBlock(Level level, BlockPos neighborPosition) {
        for (Direction direction : Direction.values()) {
            BlockPos potentialFirePosition = neighborPosition.relative(direction);
            if (level.getBlockState(neighborPosition.relative(direction)).isAir()) {
                BlockState fireBlock = BaseFireBlock.getState(level, potentialFirePosition);
                if (fireBlock.canSurvive(level, potentialFirePosition)) {
                    level.setBlock(potentialFirePosition, fireBlock, 3);
                }
            }
        }
    }
}
