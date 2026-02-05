package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class AncientOakBlock extends ModFlammableRotatedPillarBlock {

    public AncientOakBlock(Properties pProperties) {
        super(pProperties.explosionResistance(10).randomTicks(), 5, 5);
    }

//    @Override
//    protected void neighborChanged(@NonNull BlockState pState, @NonNull Level pLevel, @NonNull BlockPos pPos, @NonNull Block pNeighborBlock, @Nullable Orientation pOrientation, boolean pMovedByPiston) {
//        if (pNeighborBlock.defaultBlockState().is(BlockTags.FIRE)) { charBlock(pLevel, pPos); }
//    }

    @Override
    public boolean onCaughtFire(BlockState state, Level level, BlockPos pos, @org.jetbrains.annotations.Nullable Direction direction, @org.jetbrains.annotations.Nullable LivingEntity igniter) {
        charBlock(level, pos);
        return super.onCaughtFire(state, level, pos, direction, igniter);
    }

    // TODO: all ancient oak blocks that are caught on fire MUST be deleted
    // TODO: fix ancient oak leaves not able to be lit on fire

    private void charBlock(Level level, BlockPos pos) {
        if (!level.isClientSide()) {
            if (level instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.SMOKE, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                        5, 0.2, 0.2, 0.2, 0.05
                );
            }

            Block blockToReplace = level.getBlockState(pos).getBlock();
            BlockState charredBlock = getCharredBlock(blockToReplace);

            level.setBlock(pos, charredBlock, 3);
            level.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 0.25F, 1.0F);
        }
    }

    private static BlockState getCharredBlock(Block blockToChar) {
        BlockState charredBlock = null;

        if (blockToChar == ModBlocks.ANCIENT_OAK_LOG.get()) {
            charredBlock = ModBlocks.CHARRED_LOG.get().defaultBlockState();
        } else if (blockToChar == ModBlocks.ANCIENT_OAK_WOOD.get()) {
            charredBlock = ModBlocks.CHARRED_WOOD.get().defaultBlockState();
        } else if (blockToChar == ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get()) {
            charredBlock = ModBlocks.STRIPPED_CHARRED_LOG.get().defaultBlockState();
        } else if (blockToChar == ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get()) {
            charredBlock = ModBlocks.STRIPPED_CHARRED_WOOD.get().defaultBlockState();
        }
        return charredBlock;
    }
}
