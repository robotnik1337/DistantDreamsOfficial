package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.item.ModItems;
import net.Bankgo.DistantDreams.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, String modid, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, modid, registries);
    }

    @Override
    protected void start(HolderLookup.@NotNull Provider registries) {
        this.add("copper_beetroot_from_zombie",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie"))
                                .and(LootItemRandomChanceCondition.randomChance(1.0F)).build()
                }, ModItems.COPPER_BEETROOT_1.get()));
    }
}
