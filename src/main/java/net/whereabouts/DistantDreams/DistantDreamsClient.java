package net.whereabouts.DistantDreams;

import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.BlockPos;
import net.minecraft.util.ARGB;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.entity.DDEntities;
import net.whereabouts.DistantDreams.entity.client.EotragusRenderer;

import java.util.List;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = DistantDreams.MOD_ID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = DistantDreams.MOD_ID, value = Dist.CLIENT)
public class DistantDreamsClient {
    public DistantDreamsClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        DistantDreams.LOGGER.info("HELLO FROM CLIENT SETUP");
        DistantDreams.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

        EntityRenderers.register(DDEntities.EOTRAGUS.get(), EotragusRenderer::new);
    }

    @SubscribeEvent
    static void registerBlockTints(RegisterColorHandlersEvent.BlockTintSources event) {
        event.register(
                List.of(new BlockTintSource() {
                    @Override
                    public int color(BlockState state) { return ARGB.opaque(GrassColor.getDefaultColor()); }

                    @Override
                    public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) { return ARGB.opaque(BiomeColors.getAverageGrassColor(level, pos)); }
                }),
                DDBlocks.DISTANT_GRASS.get()
        );
    }
}
