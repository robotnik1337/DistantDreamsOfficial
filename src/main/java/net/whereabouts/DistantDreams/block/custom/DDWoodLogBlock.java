package net.whereabouts.DistantDreams.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import net.whereabouts.DistantDreams.block.DDBlocks;
import org.jspecify.annotations.Nullable;

public class DDWoodLogBlock extends RotatedPillarBlock {
    private final int flammability;
    private final int fireSpreadSpeed;

    public DDWoodLogBlock(Properties properties) {
        super(properties);
        this.flammability = 5;
        this.fireSpreadSpeed = 5;
    }

    public DDWoodLogBlock(Properties properties, int flammability, int fireSpreadSpeed) {
        super(properties);
        this.flammability = flammability;
        this.fireSpreadSpeed = fireSpreadSpeed;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return flammability != 0; }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return flammability; }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return fireSpreadSpeed; }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(DDBlocks.SEQUOIA_LOG.get())) { return DDBlocks.STRIPPED_SEQUOIA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS)); }
            if (state.is(DDBlocks.SEQUOIA_WOOD.get())) { return DDBlocks.STRIPPED_SEQUOIA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS)); }
        }
        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
