package net.Bankgo.DistantDreams.event;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DistantDreams.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {
    @SubscribeEvent
    public static void eventTest1(BlockEvent.FarmlandTrampleEvent event) {
        if (event.getEntity() instanceof Player player) {
            player.displayClientMessage(Component.literal(player.getName().getString() + " DESTROYER OF FARM!"), false);
        }
    }

    @SubscribeEvent
    public static void fireBlockPlaced(BlockEvent.EntityPlaceEvent event) {
        if (!event.getLevel().isClientSide()) {
            if (event.getState().is(BlockTags.FIRE)) {
                BlockPos firePosition = event.getPos();
                if (
                        event.getLevel().getBlockState(firePosition.above()).is(ModTags.Blocks.ANCIENT_OAK_LOGS) ||
                        event.getLevel().getBlockState(firePosition.below()).is(ModTags.Blocks.ANCIENT_OAK_LOGS) ||
                        event.getLevel().getBlockState(firePosition.north()).is(ModTags.Blocks.ANCIENT_OAK_LOGS) ||
                        event.getLevel().getBlockState(firePosition.south()).is(ModTags.Blocks.ANCIENT_OAK_LOGS) ||
                        event.getLevel().getBlockState(firePosition.east()).is(ModTags.Blocks.ANCIENT_OAK_LOGS) ||
                        event.getLevel().getBlockState(firePosition.west()).is(ModTags.Blocks.ANCIENT_OAK_LOGS)

                ) { event.getLevel().removeBlock(event.getPos(), false); }
            }
        }
    }
}
