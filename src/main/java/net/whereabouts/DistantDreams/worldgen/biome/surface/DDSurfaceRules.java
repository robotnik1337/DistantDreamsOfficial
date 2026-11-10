package net.whereabouts.DistantDreams.worldgen.biome.surface;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.worldgen.biome.DDBiomes;

public class DDSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);

    private static final SurfaceRules.RuleSource FERTILE_SOIL = makeStateRule(DDBlocks.FERTILE_SOIL.get());

    private static final SurfaceRules.RuleSource DISTANT_GRASS = makeStateRule(DDBlocks.DISTANT_GRASS.get());
    private static final SurfaceRules.RuleSource DISTANT_DIRT = makeStateRule(DDBlocks.DISTANT_DIRT.get());
    private static final SurfaceRules.RuleSource DISTANT_STONE = makeStateRule(DDBlocks.DISTANT_STONE.get());

    public static SurfaceRules.RuleSource makeOverworldRules() {
        SurfaceRules.RuleSource fertileSurface = grassDirtStoneSurfaceRules(FERTILE_SOIL, DIRT, DISTANT_STONE);

        return SurfaceRules.sequence(
                // only run this sequence if we are in the sequoia forest.
                SurfaceRules.ifTrue(SurfaceRules.isBiome(DDBiomes.SEQUOIA_FOREST), fertileSurface)

        );
    }

    public static SurfaceRules.RuleSource makeDistantRealmRules() {
        SurfaceRules.RuleSource distantRealmSurface = grassDirtStoneSurfaceRules(DISTANT_GRASS, DISTANT_DIRT, DISTANT_STONE);
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(DDBiomes.DISTANT_FOREST), distantRealmSurface),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(DDBiomes.TIMEWORN_MEADOWS), distantRealmSurface)
        );
    }

    private static SurfaceRules.RuleSource grassDirtStoneSurfaceRules(SurfaceRules.RuleSource grass,
                                                                      SurfaceRules.RuleSource dirt,
                                                                      SurfaceRules.RuleSource stone) {
        /* two-part sequence for generating fertile soil & dirt on the surface of sequoia forests. the first part
         * creates the top layer of fertile soil, and the second part creates the fertile dirt layer underneath.
         */
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(
                        // abovePreliminarySurface() prevents the following rules from occurring in caves, etc.
                        SurfaceRules.abovePreliminarySurface(),
                        SurfaceRules.sequence(
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
                                                        SurfaceRules.waterBlockCheck(-1, 0),
                                                        grass // generate fertile soil if above water.
                                                ), dirt
                                                // generate regular dirt if not above water.
                                        )
                                ),
                                SurfaceRules.ifTrue(
                                        // since addSurfaceDepth is set to true here, the rule adds the surface depth to the blocks
                                        // replaced (0-4 blocks), or the distance from the top layer to the stone layer.
                                        SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR),
                                        dirt
                                )
                        )
                )
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
