package net.whereabouts.DistantDreams.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.rootplacers.RootPlacerType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.worldgen.tree.custom.SequoiaRootPlacer;

import java.util.function.Supplier;

public class DDRootPlacerTypes {
    public static final DeferredRegister<RootPlacerType<?>> ROOT_PLACERS =
            DeferredRegister.create(Registries.ROOT_PLACER_TYPE, DistantDreams.MOD_ID);

    public static final Supplier<RootPlacerType<SequoiaRootPlacer>> SEQUOIA_ROOT_PLACER =
            ROOT_PLACERS.register("sequoia_root_placer", () -> new RootPlacerType<>(SequoiaRootPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        ROOT_PLACERS.register(eventBus);
    }
}
