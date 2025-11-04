package net.Bankgo.DistantDreams.event;

import net.Bankgo.DistantDreams.DistantDreams;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DistantDreams.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {
    @SubscribeEvent
    public static void eventTest1(BlockEvent.FarmlandTrampleEvent event) {
        if (event.getEntity() instanceof Player player) {
            player.sendSystemMessage(Component.literal(player.getName().getString() + " DESTROYER OF FARM!"));
        }
    }
}
