package net.Bankgo.DistantDreams.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ModLeavesBlock extends UntintedParticleLeavesBlock {
    public ModLeavesBlock(float p_397840_, ParticleOptions p_396382_, Properties p_394856_) {
        super(p_397840_, p_396382_, p_394856_);
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 60; }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 30; }
}
