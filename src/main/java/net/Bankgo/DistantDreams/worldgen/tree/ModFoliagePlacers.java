package net.Bankgo.DistantDreams.worldgen.tree;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.worldgen.tree.custom.SequoiaFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, DistantDreams.MODID);

    public static final RegistryObject<FoliagePlacerType<SequoiaFoliagePlacer>> SEQUOIA_FOLIAGE_PLACER =
//            RecordCodecBuilder.mapCodec(instance -> (instance).and);
            FOLIAGE_PLACERS.register("sequoia_foliage_placer", () -> new FoliagePlacerType<>(SequoiaFoliagePlacer.CODEC));

    public static void register(BusGroup busGroup) {
        FOLIAGE_PLACERS.register(busGroup);
    }
}
