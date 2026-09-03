package net.whereabouts.DistantDreams.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.worldgen.tree.custom.SequoiaFoliagePlacer;

import java.util.function.Supplier;

public class DDFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, DistantDreams.MOD_ID);

    public static final Supplier<FoliagePlacerType<SequoiaFoliagePlacer>> SEQUOIA_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("sequoia_foliage_placer", () -> new FoliagePlacerType<>(SequoiaFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
