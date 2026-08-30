package net.whereabouts.DistantDreams;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.whereabouts.DistantDreams.datagen.DDBlockLootTableProvider;
import net.whereabouts.DistantDreams.datagen.DDBlockTagsProvider;
import net.whereabouts.DistantDreams.datagen.DDLanguageProvider;
import net.whereabouts.DistantDreams.datagen.DDModelProvider;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = DistantDreams.MOD_ID)
public class DistantDreamsDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        dataGenerator.addProvider(true, new DDModelProvider(packOutput));
        dataGenerator.addProvider(true, new DDLanguageProvider(packOutput, "en_us"));
        dataGenerator.addProvider(true, new DDBlockTagsProvider(packOutput, lookupProvider));
        dataGenerator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(DDBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
    }
}
