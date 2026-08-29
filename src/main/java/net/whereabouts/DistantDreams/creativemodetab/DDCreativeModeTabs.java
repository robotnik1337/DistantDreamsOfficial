package net.whereabouts.DistantDreams.creativemodetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.item.DDItems;

import java.util.function.Supplier;

public class DDCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DistantDreams.MOD_ID);

    public static final Supplier<CreativeModeTab> DISTANT_DREAMS_TAB = CREATIVE_MODE_TABS.register(
            "distant_dreams_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(DDItems.MUSIC_DISC_HYPNAGOGIA.get()))
                    .title(Component.translatable("creativetab.distantdreams.distant_dreams"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(DDBlocks.ANCIENT_OAK_PLANKS.get().asItem());
                        output.accept(DDItems.MUSIC_DISC_HYPNAGOGIA.get());

                    }).build()
    );

    public static void register (IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
