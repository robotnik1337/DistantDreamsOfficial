package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.Bankgo.DistantDreams.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DistantDreams.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.EUCALYPTUS_SAPLING.get());
        basicItem(ModItems.SEQUOIA_SAPLING.get());

        // Button Item
        buttonItem(ModBlocks.EUCALYPTUS_BUTTON, ModBlocks.EUCALYPTUS_PLANKS);
        buttonItem(ModBlocks.SEQUOIA_BUTTON, ModBlocks.SEQUOIA_PLANKS);
        buttonItem(ModBlocks.DISTANT_STONE_BUTTON, ModBlocks.DISTANT_STONE);
        buttonItem(ModBlocks.LIMESTONE_BUTTON, ModBlocks.LIMESTONE);

        // Fence Item
        fenceItem(ModBlocks.EUCALYPTUS_FENCE, ModBlocks.EUCALYPTUS_PLANKS);
        fenceItem(ModBlocks.SEQUOIA_FENCE, ModBlocks.SEQUOIA_PLANKS);

        // Door Item
        simpleBlockItem(ModBlocks.EUCALYPTUS_DOOR);
        simpleBlockItem(ModBlocks.SEQUOIA_DOOR);

        // Wall Item
        wallItem(ModBlocks.DISTANT_STONE_WALL, ModBlocks.DISTANT_STONE);
        wallItem(ModBlocks.POLISHED_DISTANT_STONE_WALL, ModBlocks.POLISHED_DISTANT_STONE);
        wallItem(ModBlocks.DISTANT_STONE_BRICK_WALL, ModBlocks.DISTANT_STONE_BRICKS);
        wallItem(ModBlocks.LIMESTONE_WALL, ModBlocks.LIMESTONE);
        wallItem(ModBlocks.POLISHED_LIMESTONE_WALL, ModBlocks.POLISHED_LIMESTONE);
        wallItem(ModBlocks.LIMESTONE_BRICK_WALL, ModBlocks.LIMESTONE_BRICKS);
        wallItem(ModBlocks.MOSSY_DISTANT_STONE_BRICK_WALL, ModBlocks.MOSSY_DISTANT_STONE_BRICKS);
        wallItem(ModBlocks.MOSSY_LIMESTONE_BRICK_WALL, ModBlocks.MOSSY_LIMESTONE_BRICKS);
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block.get())).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID,
                        "block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(baseBlock.get())).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block.get())).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID,
                        "block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(baseBlock.get())).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block.get())).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID,
                        "block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(baseBlock.get())).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(DistantDreams.MODID,"item/" + item.getId().getPath()));
    }
}
