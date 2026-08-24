package net.Bankgo.DistantDreams.event;

import net.Bankgo.DistantDreams.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = "distantdreams", value = Dist.CLIENT)
public class ClientEventTooltipHandler {
    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent event) {
        if (event.getItemStack().is(ModItems.BROTH_OF_STYX.get())) {
            List<MobEffectInstance> effects = List.of(
                    new MobEffectInstance(MobEffects.RESISTANCE, 600, 4),
                    new MobEffectInstance(MobEffects.POISON, 700)
            );

            // Automatically formats the text, colors, levels, and durations
            PotionContents.addPotionTooltip(effects, event.getToolTip()::add, 1.0F, 20);
        }

    }
}
