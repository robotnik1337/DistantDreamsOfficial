package net.Bankgo.DistantDreams.worldgen.biome.surface;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource FERTILE_SOIL = makeStateRule(ModBlocks.FERTILE_SOIL.get());
//    private static final SurfaceRules.RuleSource RAW_SAPPHIRE = makeStateRule(ModBlocks.FERTILE_SOIL.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SEQUOIA_FOREST),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, FERTILE_SOIL)),
//                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, FERTILE_SOIL)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
