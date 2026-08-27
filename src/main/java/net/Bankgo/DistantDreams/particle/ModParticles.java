package net.Bankgo.DistantDreams.particle;

import net.Bankgo.DistantDreams.DistantDreams;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DistantDreams.MODID);

    public static final RegistryObject<SimpleParticleType> DREAMFLOWER_PARTICLES =
            PARTICLE_TYPES.register("dreamflower_particles", () -> new SimpleParticleType(true));

    public static void register(BusGroup busGroup) { PARTICLE_TYPES.register(busGroup); }
}
