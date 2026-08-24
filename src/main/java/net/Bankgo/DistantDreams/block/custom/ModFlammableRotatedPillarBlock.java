package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {

    private final int flammability;
    private final int fireSpreadSpeed;

    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
        this.flammability = 5;
        this.fireSpreadSpeed = 5;
    }

    public ModFlammableRotatedPillarBlock(Properties pProperties, int flammability, int fireSpreadSpeed) {
        super(pProperties);
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
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {

            if (state.is(ModBlocks.ANCIENT_OAK_LOG.get())) {
                return ModBlocks.STRIPPED_ANCIENT_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.ANCIENT_OAK_WOOD.get())) {
                return ModBlocks.STRIPPED_ANCIENT_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.CHARRED_LOG.get())) {
                return ModBlocks.STRIPPED_CHARRED_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.CHARRED_WOOD.get())) {
                return ModBlocks.STRIPPED_CHARRED_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.EUCALYPTUS_LOG.get())) {
                return ModBlocks.STRIPPED_EUCALYPTUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.EUCALYPTUS_WOOD.get())) {
                return ModBlocks.STRIPPED_EUCALYPTUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.SEQUOIA_LOG.get())) {
                return ModBlocks.STRIPPED_SEQUOIA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.SEQUOIA_WOOD.get())) {
                return ModBlocks.STRIPPED_SEQUOIA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
