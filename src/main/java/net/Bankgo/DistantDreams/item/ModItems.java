package net.Bankgo.DistantDreams.item;

import net.Bankgo.DistantDreams.DistantDreams;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Registry for mod items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DistantDreams.MODID);

    // Eucalyptus Sapling
    public static final RegistryObject<Item> EUCALYPTUS_SAPLING = ITEMS.register("eucalyptus_sapling",
            () -> new Item(new Item.Properties()));

    // Sequoia Sapling
    public static final RegistryObject<Item> SEQUOIA_SAPLING = ITEMS.register("sequoia_sapling",
            () -> new Item(new Item.Properties()));

    // Dreamcatcher
    public static final RegistryObject<Item> DREAMCATCHER = ITEMS.register("dreamcatcher",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
