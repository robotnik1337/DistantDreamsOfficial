package net.whereabouts.DistantDreams.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.entity.custom.EotragusEntity;

public class DDEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.createEntities(DistantDreams.MOD_ID);

    public static final ResourceKey<EntityType<?>> EOTRAGUS_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "eotragus"));

    public static final DeferredHolder<EntityType<?>, EntityType<EotragusEntity>> EOTRAGUS =
            ENTITY_TYPES.register("eotragus",
                    () -> EntityType.Builder.of(EotragusEntity::new, MobCategory.CREATURE)
                            .sized(1.5f, 1.75f)
                            .build(EOTRAGUS_KEY));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
