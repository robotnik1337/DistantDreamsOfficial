package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.menu.ModCraftingMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class ModCraftingTableBlock extends CraftingTableBlock {

    public ModCraftingTableBlock(Properties p_52225_) {
        super(p_52225_);
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos,
                                                        Player pPlayer, BlockHitResult pHitResult) {
        if (!pLevel.isClientSide) {
            pPlayer.openMenu(new SimpleMenuProvider(
                    (id, inventory, player) -> new ModCraftingMenu(
                            id, inventory, ContainerLevelAccess.create(pLevel, pPos), this
                    ),
                    Component.translatable("container.crafting")
            ));
            pPlayer.awardStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }
}
