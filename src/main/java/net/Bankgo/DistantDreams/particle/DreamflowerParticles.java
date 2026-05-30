package net.Bankgo.DistantDreams.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DreamflowerParticles extends TextureSheetParticle {
    protected DreamflowerParticles(ClientLevel pLevel, double pX, double pY, double pZ,
                                   SpriteSet pSpriteSet, double pXSpeed, double pYSpeed, double pZSpeed) {
        super(pLevel, pX, pY, pZ, pXSpeed, pYSpeed, pZSpeed);

        this.friction = 0.0f;
        this.lifetime = 40;
        this.setSpriteFromAge(pSpriteSet);
        this.scale(2.5F);
        this.gravity = -0.015F;
        this.friction = 0.96F;
    }

    @Override
    public void tick() {
        super.tick();
        this.xd += (this.random.nextFloat() - 0.5F) * 0.004D;
        this.zd += (this.random.nextFloat() - 0.5F) * 0.004D;
        if (this.age > this.lifetime - 10) { this.alpha = ((float) (this.lifetime - this.age)) / 10.0F; }
    }

    @Override
    public int getLightColor(float pPartialTick) { return 15728880; }

    @Override
    public @NotNull ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Override
        public @Nullable Particle createParticle(@NotNull SimpleParticleType pType, @NotNull ClientLevel pLevel, double pX, double pY,
                                                 double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
            return new DreamflowerParticles(pLevel, pX, pY, pZ, this.spriteSet, pXSpeed, pYSpeed, pZSpeed);
        }
    }
}
