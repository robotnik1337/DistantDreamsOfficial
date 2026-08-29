package net.whereabouts.DistantDreams.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;

import java.util.function.Function;
import java.util.function.Supplier;

public class DDItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DistantDreams.MOD_ID);

    public static final DeferredItem<Item> MUSIC_DISC_HYPNAGOGIA = ITEMS.registerSimpleItem("music_disc_hypnagogia");


    public static <T extends Item> DeferredItem<T> register(String name, Function<Item.Properties, T> item, Supplier<Item.Properties> properties) {
        return ITEMS.register(name, () -> item.apply(properties.get().setId(ResourceKey.create(Registries.ITEM, DistantDreams.prefix(name)))));
    }
    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
