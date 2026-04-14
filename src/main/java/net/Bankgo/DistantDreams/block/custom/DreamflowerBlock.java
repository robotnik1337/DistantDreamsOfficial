package net.Bankgo.DistantDreams.block.custom;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class DreamflowerBlock extends FlowerBlock {
    private final DreamflowerBlock.Type type;

    public DreamflowerBlock(DreamflowerBlock.Type pType, BlockBehaviour.Properties pProperties) {
        super(pType.effect, pType.effectDuration, pProperties);
        this.type = pType;
    }

    public DreamflowerBlock(boolean pIsOpen, BlockBehaviour.Properties pProperties) {
        super(Type.fromBoolean(pIsOpen).effect, Type.fromBoolean(pIsOpen).effectDuration, pProperties);
        this.type = Type.fromBoolean(pIsOpen);
    }

    public enum Type {
        OPEN(true, MobEffects.INSTANT_DAMAGE, 5.0F, 0x5A6D9F),
        CLOSED(false, MobEffects.INSTANT_DAMAGE, 2.0F, 0x375E96);

        final boolean isOpen;
        final Holder<MobEffect> effect;
        final float effectDuration;
        final int particleColor;

        Type(final boolean pIsOpen, Holder<MobEffect> pEffect, float pEffectDuration, int pParticleColor) {
            this.isOpen = pIsOpen;
            this.effect = pEffect;
            this.effectDuration = pEffectDuration;
            this.particleColor = pParticleColor;
        }

        public static DreamflowerBlock.Type fromBoolean(boolean pOpen) { return pOpen ? OPEN : CLOSED; }

        public Block block() { return this.isOpen ? ModBlocks.OPEN_DREAMFLOWER.get() : ModBlocks.CLOSED_DREAMFLOWER.get(); }
        public BlockState state() { return this.block().defaultBlockState(); }
        public DreamflowerBlock.Type transform() { return fromBoolean(!this.isOpen); }
        public boolean emitSounds() { return this.isOpen; }
    }

}
