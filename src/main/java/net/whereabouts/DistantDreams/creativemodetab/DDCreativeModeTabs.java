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
                    .title(Component.translatable("itemGroup.distantdreams"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(DDBlocks.ANCIENT_OAK_PLANKS.get().asItem());

                        output.accept(DDBlocks.EUCALYPTUS_LOG.get());
                        output.accept(DDBlocks.EUCALYPTUS_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get());
                        output.accept(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
                        output.accept(DDBlocks.EUCALYPTUS_PLANKS.get());
                        output.accept(DDBlocks.EUCALYPTUS_STAIRS.get());
                        output.accept(DDBlocks.EUCALYPTUS_SLAB.get());
                        output.accept(DDBlocks.EUCALYPTUS_FENCE.get());
                        output.accept(DDBlocks.EUCALYPTUS_FENCE_GATE.get());
                        output.accept(DDBlocks.EUCALYPTUS_DOOR.get());
                        output.accept(DDBlocks.EUCALYPTUS_TRAPDOOR.get());
                        output.accept(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.EUCALYPTUS_BUTTON.get());
                        output.accept(DDBlocks.EUCALYPTUS_LEAVES.get());
                        output.accept(DDBlocks.EUCALYPTUS_SAPLING.get());

                        output.accept(DDBlocks.SEQUOIA_LOG.get());
                        output.accept(DDBlocks.SEQUOIA_WOOD.get());
                        output.accept(DDBlocks.STRIPPED_SEQUOIA_LOG.get());
                        output.accept(DDBlocks.STRIPPED_SEQUOIA_WOOD.get());
                        output.accept(DDBlocks.SEQUOIA_PLANKS.get());
                        output.accept(DDBlocks.SEQUOIA_STAIRS.get());
                        output.accept(DDBlocks.SEQUOIA_SLAB.get());
                        output.accept(DDBlocks.SEQUOIA_FENCE.get());
                        output.accept(DDBlocks.SEQUOIA_FENCE_GATE.get());
                        output.accept(DDBlocks.SEQUOIA_DOOR.get());
                        output.accept(DDBlocks.SEQUOIA_TRAPDOOR.get());
                        output.accept(DDBlocks.SEQUOIA_PRESSURE_PLATE.get());
                        output.accept(DDBlocks.SEQUOIA_BUTTON.get());
                        output.accept(DDBlocks.SEQUOIA_LEAVES.get());
                        output.accept(DDBlocks.SEQUOIA_SAPLING.get());

                        output.accept(DDItems.MUSIC_DISC_HYPNAGOGIA.get());

                    }).build()
    );

    public static void register (IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
