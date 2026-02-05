package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.SoulFireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.redstone.Orientation;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class AncientOakBlock extends ModFlammableRotatedPillarBlock {

    public AncientOakBlock(Properties pProperties) {
        super(pProperties.explosionResistance(10));
    }

    @Override
    protected void neighborChanged(@NonNull BlockState pState, @NonNull Level pLevel, @NonNull BlockPos pPos, @NonNull Block pNeighborBlock, @Nullable Orientation pOrientation, boolean pMovedByPiston) {
        if (pNeighborBlock instanceof FireBlock || pNeighborBlock instanceof SoulFireBlock) {
            charBlock(pLevel, pPos);
        }
    }

    // TODO: all ancient oak blocks that are caught on fire MUST be deleted
    // TODO: fix ancient oak leaces not able to be lit on fire

    private void charBlock(Level level, BlockPos pos) {
        if (level.isClientSide()) {
            for (int i = 0; i < 5; i++) {
                level.addParticle(ParticleTypes.LARGE_SMOKE,
                        pos.getX() + 0.5 + (level.random.nextDouble() - 0.5),
                        pos.getY() + 1.1,
                        pos.getZ() + 0.5 + (level.random.nextDouble() - 0.5),
                        0.0D, 0.1D, 0.0D);
            }
        } else {
            Block blockToReplace = level.getBlockState(pos).getBlock();
            BlockState charredBlock = getCharredBlock(blockToReplace);

            level.setBlock(pos, charredBlock, 3);
            level.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 0.5F, 1.0F);
            if (blockToReplace instanceof FireBlock || blockToReplace instanceof SoulFireBlock) { level.removeBlock(pos, false); }
        }
    }

    private static BlockState getCharredBlock(Block blockToReplace) {
        BlockState charredBlock = null;

        if (blockToReplace == ModBlocks.ANCIENT_OAK_LOG.get()) {
            charredBlock = ModBlocks.CHARRED_LOG.get().defaultBlockState();
        } else if (blockToReplace == ModBlocks.ANCIENT_OAK_WOOD.get()) {
            charredBlock = ModBlocks.CHARRED_WOOD.get().defaultBlockState();
        } else if (blockToReplace == ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get()) {
            charredBlock = ModBlocks.STRIPPED_CHARRED_LOG.get().defaultBlockState();
        } else if (blockToReplace == ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get()) {
            charredBlock = ModBlocks.STRIPPED_CHARRED_WOOD.get().defaultBlockState();
        }
        return charredBlock;
    }
}
