package net.Bankgo.DistantDreams.worldgen.biome.surface;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource FERTILE_DIRT = makeStateRule(ModBlocks.FERTILE_DIRT.get());
    private static final SurfaceRules.RuleSource FERTILE_SOIL = makeStateRule(ModBlocks.FERTILE_SOIL.get());

    public static SurfaceRules.RuleSource makeRules() {
        /* two-part sequence for generating fertile soil & dirt on the surface of sequoia forests. the first part
         * creates the top layer of fertile soil, and the second part creates the fertile dirt layer underneath.
         */
        SurfaceRules.RuleSource fertileSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(
                        // abovePreliminarySurface() prevents the following rules from occurring in caves, etc.
                        SurfaceRules.abovePreliminarySurface(),
                        SurfaceRules.ifTrue(
                                /* stoneDepthChecK() limits rules to only being near the surface, noise caves, etc.
                                 * addSurfaceDepth is false because we only want the top layer to be changed for this
                                 * part of the rule. cave surface is set to floor because we want this rule to affect
                                 * ground layer of the biome.
                                 */
                                SurfaceRules.stoneDepthCheck(0, false, CaveSurface.FLOOR),
                                // short sequence to separate surface layer above water & underwater.
                                SurfaceRules.sequence(
                                        SurfaceRules.ifTrue(
                                                // waterBlockCheck() ensures that is NO water where this rule attempts
                                                // to generate the desired block.
                                                SurfaceRules.waterBlockCheck(0, 0),
                                                FERTILE_SOIL // generate fertile soil if above water.
                                        ),
                                        DIRT // generate regular dirt if not above water.
                                )
                        )
                ),
                SurfaceRules.ifTrue(
                        // since addSurfaceDepth is set to true here, the rule adds the surface depth to the blocks
                        // replaced (0-4 blocks), or the distance from the top layer to the stone layer.
                        SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR),
                        FERTILE_DIRT
                )

        );

        return SurfaceRules.sequence(
                // only run this sequence if we are in the sequoia forest.
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SEQUOIA_FOREST), fertileSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
