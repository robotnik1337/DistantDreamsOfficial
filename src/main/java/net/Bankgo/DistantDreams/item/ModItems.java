package net.Bankgo.DistantDreams.item;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.sound.ModSounds;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.stream.Stream;

public class  ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DistantDreams.MODID);

    // Music Disc Hypnagogia
    public static final RegistryObject<Item> MUSIC_DISC_HYPNAGOGIA = ITEMS.register("music_disc_hypnagogia",
            () -> new Item(new Item.Properties().setId(ITEMS.key("music_disc_hypnagogia")).jukeboxPlayable(ModSounds.HYPNAGOGIA_KEY).stacksTo(1).rarity(Rarity.RARE)));


    // ########## FOOD ##########
    public static final RegistryObject<Item> COPPER_BEETROOT_1 = ITEMS.register("copper_beetroot_1",
            () -> new Item(new Item.Properties().setId(ITEMS.key("copper_beetroot_1"))
                    .food(ModFoodProperties.COPPER_BEETROOT_1, ModConsumables.COPPER_BEETROOT_1)
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> BROTH_OF_STYX = ITEMS.register("broth_of_styx",
            () -> new Item(new Item.Properties().setId(ITEMS.key("broth_of_styx"))
                    .food(Foods.SUSPICIOUS_STEW, ModConsumables.BROTH_OF_STYX)
                    .stacksTo(1)
                    .usingConvertsTo(Items.BOWL))
            {
                @Override
                public @NonNull ItemStack finishUsingItem(@NonNull ItemStack pStack, @NonNull Level pLevel, @NonNull LivingEntity pLivingEntity) {
                    ItemStack result = super.finishUsingItem(pStack, pLevel, pLivingEntity);
                    if (!pLevel.isClientSide()) { pLivingEntity.setHealth(1.0F); }
                    return result;
                }
            });



    public static void register(BusGroup busGroup) {
        ITEMS.register(busGroup);
    }

    public static Stream<Item> getAllItems() {
        var itemRegistries = List.of(ITEMS);
        Stream<Item> out = Stream.empty();
        for (DeferredRegister<Item> registry : itemRegistries) {
            out = Stream.concat(out, registry.getEntries().stream().map(RegistryObject::get));
        }
        return out;
    }
}

//    public static final RegistryObject<Item> DREAMCATCHER = ITEMS.register("dreamcatcher",
//            () -> new Item(new Item.Properties().setId(ITEMS.key("dreamcatcher"))));