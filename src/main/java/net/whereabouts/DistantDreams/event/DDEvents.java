package net.whereabouts.DistantDreams.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.entity.DDEntities;
import net.whereabouts.DistantDreams.entity.custom.EotragusEntity;

@EventBusSubscriber(modid = DistantDreams.MOD_ID)
public class DDEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(DDEntities.EOTRAGUS.get(), EotragusEntity.setAttributes().build());
    }
}
