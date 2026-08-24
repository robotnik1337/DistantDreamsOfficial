package net.Bankgo.DistantDreams.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class ModCraftingMenu extends CraftingMenu {
    private final ContainerLevelAccess access;
    private final Block validBlock;

    public ModCraftingMenu(int pContainerId, Inventory pPlayerInventory, ContainerLevelAccess access, Block pValidBlock) {
        super(pContainerId, pPlayerInventory, access);
        this.access = access;
        this.validBlock = pValidBlock;
    }


    @Override
    public boolean stillValid(@NotNull Player pPlayer) {
        return AbstractContainerMenu.stillValid(this.access, pPlayer, this.validBlock);
    }
}
