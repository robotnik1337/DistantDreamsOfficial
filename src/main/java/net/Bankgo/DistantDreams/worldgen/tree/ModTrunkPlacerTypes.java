package net.Bankgo.DistantDreams.worldgen.tree;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.worldgen.tree.custom.SequoiaTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, DistantDreams.MODID);

    public static final RegistryObject<TrunkPlacerType<SequoiaTrunkPlacer>> SEQUOIA_TRUNK_PLACER =
            TRUNK_PLACER.register("sequoia_trunk_placer", () -> new TrunkPlacerType<>(SequoiaTrunkPlacer.CODEC));

    public static void register(BusGroup busGroup) {
        TRUNK_PLACER.register(busGroup);
    }
}
