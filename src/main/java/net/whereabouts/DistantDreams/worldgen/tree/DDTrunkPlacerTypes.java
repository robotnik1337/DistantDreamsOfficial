package net.whereabouts.DistantDreams.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.worldgen.tree.custom.SequoiaTrunkPlacer;

import java.util.function.Supplier;

public class DDTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, DistantDreams.MOD_ID);

    public static final Supplier<TrunkPlacerType<SequoiaTrunkPlacer>> SEQUOIA_TRUNK_PLACER =
            TRUNK_PLACERS.register("sequoia_trunk_placer", () -> new TrunkPlacerType<>(SequoiaTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}
