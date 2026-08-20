package net.Bankgo.DistantDreams.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModConsumables extends Consumables {
    public static final Consumable COPPER_BEETROOT_1 = defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE,4800)))
            .build();

    public static final Consumable BROTH_OF_STYX = defaultFood()
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(MobEffects.RESISTANCE, 600, 4),
                                    new MobEffectInstance(MobEffects.POISON, 700)
                            )
                    )
            ).build();

}
