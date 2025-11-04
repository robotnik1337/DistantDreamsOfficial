package net.Bankgo.DistantDreams.item;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Registry for mod items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DistantDreams.MODID);

    // Music Disc Hypnagogia
    public static final RegistryObject<Item> MUSIC_DISC_HYPNAGOGIA = ITEMS.register("music_disc_hypnagogia",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HYPNAGOGIA_KEY).stacksTo(1).rarity(Rarity.RARE)));

    // Dreamcatcher
    public static final RegistryObject<Item> DREAMCATCHER = ITEMS.register("dreamcatcher",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
