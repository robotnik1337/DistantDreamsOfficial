package net.whereabouts.DistantDreams;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.whereabouts.DistantDreams.datagen.DDLanguageProvider;
import net.whereabouts.DistantDreams.datagen.DDModelProvider;

@EventBusSubscriber(modid = DistantDreams.MOD_ID)
public class DistantDreamsDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();

        generator.addProvider(true, new DDModelProvider(output));
        generator.addProvider(true, new DDLanguageProvider(output, "en_us"));
    }
}
