package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.particle.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;

public class DreamflowerBlock extends FlowerBlock implements SimpleWaterloggedBlock {
    private final DreamflowerBlock.Type type;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public DreamflowerBlock(DreamflowerBlock.Type pType, BlockBehaviour.Properties pProperties) {
        super(pType.effect, pType.effectDuration, pProperties);
        this.type = pType;
        this.registerDefaultState(this.getStateDefinition().any().setValue(WATERLOGGED, false));
    }

    public DreamflowerBlock(boolean pIsOpen, BlockBehaviour.Properties pProperties) {
        super(Type.fromBoolean(pIsOpen).effect, Type.fromBoolean(pIsOpen).effectDuration, pProperties);
        this.type = Type.fromBoolean(pIsOpen);
    }

    @Override
    public void animateTick(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull RandomSource pRandom) {
        if (this.type.isOpen) {
            if (pRandom.nextInt(10) == 0) {
                double x = (double) pPos.getX() + 0.5D + (pRandom.nextDouble() - 0.5D) * 0.5D;
                double y = (double) pPos.getY() + 1D;
                double z = (double) pPos.getZ() + 0.5D + (pRandom.nextDouble() - 0.5D) * 0.5D;

                pLevel.addParticle(ModParticles.DREAMFLOWER_PARTICLES.get(), x, y, z, 0.0D, 0.01D, 0.0D);
            }
        }
    }

    @Override
    protected void tick(@NotNull BlockState pState, @NotNull ServerLevel pLevel, @NotNull BlockPos pPos, @NotNull RandomSource pRandom) {
        this.tryChangingState(pState, pLevel, pPos);
        super.tick(pState, pLevel, pPos, pRandom);
    }

    @Override
    protected void randomTick(@NotNull BlockState pState, @NotNull ServerLevel pLevel, @NotNull BlockPos pPos, @NotNull RandomSource pRandom) {
        this.tryChangingState(pState, pLevel, pPos);
        super.randomTick(pState, pLevel, pPos, pRandom);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
        boolean isWater = fluidstate.getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(WATERLOGGED, isWater);
    }


    @Override
    protected void onPlace(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull BlockState pOldState, boolean pMovedByPiston) {
        super.onPlace(pState, pLevel, pPos, pOldState, pMovedByPiston);

        if (!pLevel.isClientSide()) { pLevel.scheduleTick(pPos, this, 40 + pLevel.getRandom().nextInt(61)); }
    }

    private boolean tryChangingState(BlockState pState, ServerLevel pLevel, BlockPos pPos) {
        if (this.type.isOpen != isFlowerWet(pState, pLevel, pPos)) {
            Type dreamflowerBlock$type = this.type.transform();
            BlockState newDreamflowerState = dreamflowerBlock$type.state();
            if (newDreamflowerState.hasProperty(WATERLOGGED)) {
                newDreamflowerState = newDreamflowerState.setValue(WATERLOGGED, pState.getValue(WATERLOGGED));
            }
            pLevel.setBlock(pPos, newDreamflowerState, 3);
        }
        return true;
    }

    private static boolean isFlowerWet(BlockState pState, ServerLevel pLevel, BlockPos pPos) {
        if (pState.getValue(WATERLOGGED) || pLevel.isRainingAt(pPos)) {
            return true;
        } else {
            BlockPos aboveFlower = pPos.offset(-1, -1, -1);
            BlockPos belowFlower = pPos.offset(-1, 1, 1);
            for (BlockPos nearbyPos : BlockPos.betweenClosed(aboveFlower, belowFlower)) {
                if (pLevel.getFluidState(nearbyPos).is(FluidTags.WATER)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(WATERLOGGED);
    }

    @Override
    protected @NotNull FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    @Override
    protected @NotNull BlockState updateShape(BlockState pState, @NotNull LevelReader pLevel,
                                              @NotNull ScheduledTickAccess pScheduledTickAccess, @NotNull BlockPos pPos,
                                              @NotNull Direction pDirection, @NotNull BlockPos pNeighborPos,
                                              @NotNull BlockState pNeighborState, @NotNull RandomSource pRandom) {
        if (pState.getValue(WATERLOGGED)) {
            pScheduledTickAccess.scheduleTick(pPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        pScheduledTickAccess.scheduleTick(pPos, this, 60 + pRandom.nextInt(40));
        return super.updateShape(pState, pLevel, pScheduledTickAccess, pPos, pDirection, pNeighborPos, pNeighborState, pRandom);
    }


    public enum Type {
        OPEN(true, MobEffects.INSTANT_DAMAGE, 5.0F, 0x5A6D9F),
        CLOSED(false, MobEffects.INSTANT_DAMAGE, 2.0F, 0x375E96);

        final boolean isOpen;
        final Holder<MobEffect> effect;
        final float effectDuration;
        final int particleColor;

        Type(final boolean pIsOpen, Holder<MobEffect> pEffect, float pEffectDuration, int pParticleColor) {
            this.isOpen = pIsOpen;
            this.effect = pEffect;
            this.effectDuration = pEffectDuration;
            this.particleColor = pParticleColor;
        }

        public static DreamflowerBlock.Type fromBoolean(boolean pOpen) { return pOpen ? OPEN : CLOSED; }

        public Block block() { return this.isOpen ? ModBlocks.OPEN_DREAMFLOWER.get() : ModBlocks.CLOSED_DREAMFLOWER.get(); }
        public BlockState state() { return this.block().defaultBlockState(); }
        public DreamflowerBlock.Type transform() { return fromBoolean(!this.isOpen); }
        public boolean emitSounds() { return this.isOpen; }
    }

}
