package net.Bankgo.DistantDreams.worldgen.biome.surface;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource FERTILE_DIRT = makeStateRule(ModBlocks.FERTILE_DIRT.get());
    private static final SurfaceRules.RuleSource FERTILE_SOIL = makeStateRule(ModBlocks.FERTILE_SOIL.get());
//    private static final SurfaceRules.RuleSource RAW_SAPPHIRE = makeStateRule(ModBlocks.FERTILE_SOIL.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, FERTILE_SOIL));

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SEQUOIA_FOREST), grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
