package net.Bankgo.DistantDreams;

import com.mojang.logging.LogUtils;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.item.ModCreativeModeTabs;
import net.Bankgo.DistantDreams.item.ModItems;
import net.Bankgo.DistantDreams.loot.ModLootModifiers;
import net.Bankgo.DistantDreams.particle.DreamflowerParticles;
import net.Bankgo.DistantDreams.particle.ModParticles;
import net.Bankgo.DistantDreams.sound.ModSounds;
import net.Bankgo.DistantDreams.worldgen.biome.ModTerrablender;
import net.Bankgo.DistantDreams.worldgen.biome.surface.ModSurfaceRules;
import net.Bankgo.DistantDreams.worldgen.tree.ModFoliagePlacers;
import net.Bankgo.DistantDreams.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DistantDreams.MODID)
public class DistantDreams
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "distantdreams";

    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public DistantDreams(FMLJavaModLoadingContext context)
    {
        var modBusGroup = context.getModBusGroup();
        FMLCommonSetupEvent.getBus(modBusGroup).addListener(DistantDreams::commonSetup);

        ModCreativeModeTabs.register(modBusGroup);
        ModItems.register(modBusGroup);
        ModBlocks.register(modBusGroup);
        ModTrunkPlacerTypes.register(modBusGroup);
        ModSounds.register(modBusGroup);
        ModFoliagePlacers.register(modBusGroup);
        ModParticles.register(modBusGroup);
        ModLootModifiers.register(modBusGroup);
        ModTerrablender.registerBiomes();

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    @SubscribeEvent
    private static void commonSetup(final FMLCommonSetupEvent event) {
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MODID, ModSurfaceRules.makeRules());
    }

    // Add the example block item to the building blocks tab
    @SubscribeEvent
    private void addCreative(BuildCreativeModeTabContentsEvent event) {}

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}

        @SubscribeEvent
        public static void registerParticleProvider(RegisterParticleProvidersEvent event) {
            event.registerSpriteSet(ModParticles.DREAMFLOWER_PARTICLES.get(), DreamflowerParticles.Provider::new);
        }
    }
}
