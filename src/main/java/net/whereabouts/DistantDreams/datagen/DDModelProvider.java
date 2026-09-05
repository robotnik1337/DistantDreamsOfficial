package net.whereabouts.DistantDreams.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.block.dispatch.Variant;
import net.minecraft.data.PackOutput;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.block.DDBlocks;
import net.whereabouts.DistantDreams.item.DDItems;
import org.jspecify.annotations.NonNull;

public class DDModelProvider extends ModelProvider {
    public DDModelProvider(PackOutput output) {
        super(output, DistantDreams.MOD_ID);
    }

    @Override
    protected void registerModels(@NonNull BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // *** BLOCKS ***

        // Ancient Oak
        blockModels.woodProvider(DDBlocks.ANCIENT_OAK_LOG.get()).logWithHorizontal(DDBlocks.ANCIENT_OAK_LOG.get()).wood(DDBlocks.ANCIENT_OAK_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_ANCIENT_OAK_LOG.get()).wood(DDBlocks.STRIPPED_ANCIENT_OAK_WOOD.get());
        blockModels.family(DDBlocks.ANCIENT_OAK_PLANKS.get())
                .fence(DDBlocks.ANCIENT_OAK_FENCE.get())
                .fenceGate(DDBlocks.ANCIENT_OAK_FENCE_GATE.get())
                .stairs(DDBlocks.ANCIENT_OAK_STAIRS.get())
                .slab(DDBlocks.ANCIENT_OAK_SLAB.get())
                .button(DDBlocks.ANCIENT_OAK_BUTTON.get())
                .pressurePlate(DDBlocks.ANCIENT_OAK_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.ANCIENT_OAK_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.ANCIENT_OAK_TRAPDOOR.get());
        blockModels.createTrivialBlock(DDBlocks.ANCIENT_OAK_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createPlantWithDefaultItem(DDBlocks.ANCIENT_OAK_SAPLING.get(), DDBlocks.POTTED_ANCIENT_OAK_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        // Charred
        blockModels.woodProvider(DDBlocks.CHARRED_LOG.get()).logWithHorizontal(DDBlocks.CHARRED_LOG.get()).wood(DDBlocks.CHARRED_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_CHARRED_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_CHARRED_LOG.get()).wood(DDBlocks.STRIPPED_CHARRED_WOOD.get());
        blockModels.family(DDBlocks.CHARRED_PLANKS.get())
                .fence(DDBlocks.CHARRED_FENCE.get())
                .fenceGate(DDBlocks.CHARRED_FENCE_GATE.get())
                .stairs(DDBlocks.CHARRED_STAIRS.get())
                .slab(DDBlocks.CHARRED_SLAB.get())
                .button(DDBlocks.CHARRED_BUTTON.get())
                .pressurePlate(DDBlocks.CHARRED_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.CHARRED_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.CHARRED_TRAPDOOR.get());

        // Eucalyptus
        blockModels.woodProvider(DDBlocks.EUCALYPTUS_LOG.get()).logWithHorizontal(DDBlocks.EUCALYPTUS_LOG.get()).wood(DDBlocks.EUCALYPTUS_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_EUCALYPTUS_LOG.get()).wood(DDBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        blockModels.family(DDBlocks.EUCALYPTUS_PLANKS.get())
                .fence(DDBlocks.EUCALYPTUS_FENCE.get())
                .fenceGate(DDBlocks.EUCALYPTUS_FENCE_GATE.get())
                .stairs(DDBlocks.EUCALYPTUS_STAIRS.get())
                .slab(DDBlocks.EUCALYPTUS_SLAB.get())
                .button(DDBlocks.EUCALYPTUS_BUTTON.get())
                .pressurePlate(DDBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.EUCALYPTUS_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.EUCALYPTUS_TRAPDOOR.get());
        blockModels.createTrivialBlock(DDBlocks.EUCALYPTUS_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createPlantWithDefaultItem(DDBlocks.EUCALYPTUS_SAPLING.get(), DDBlocks.POTTED_EUCALYPTUS_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        // Sequoia
        blockModels.woodProvider(DDBlocks.SEQUOIA_LOG.get()).logWithHorizontal(DDBlocks.SEQUOIA_LOG.get()).wood(DDBlocks.SEQUOIA_WOOD.get());
        blockModels.woodProvider(DDBlocks.STRIPPED_SEQUOIA_LOG.get()).logWithHorizontal(DDBlocks.STRIPPED_SEQUOIA_LOG.get()).wood(DDBlocks.STRIPPED_SEQUOIA_WOOD.get());
        blockModels.family(DDBlocks.SEQUOIA_PLANKS.get())
                .fence(DDBlocks.SEQUOIA_FENCE.get())
                .fenceGate(DDBlocks.SEQUOIA_FENCE_GATE.get())
                .stairs(DDBlocks.SEQUOIA_STAIRS.get())
                .slab(DDBlocks.SEQUOIA_SLAB.get())
                .button(DDBlocks.SEQUOIA_BUTTON.get())
                .pressurePlate(DDBlocks.SEQUOIA_PRESSURE_PLATE.get());
        blockModels.createDoor(DDBlocks.SEQUOIA_DOOR.get());
        blockModels.createTrapdoor(DDBlocks.SEQUOIA_TRAPDOOR.get());
        blockModels.createTrivialBlock(DDBlocks.SEQUOIA_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createPlantWithDefaultItem(DDBlocks.SEQUOIA_SAPLING.get(), DDBlocks.POTTED_SEQUOIA_SAPLING.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        // Fertile
        TextureMapping fertileSoilTextureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(DDBlocks.FERTILE_SOIL.get(), "_bottom"))
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(DDBlocks.FERTILE_SOIL.get(), "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(DDBlocks.FERTILE_SOIL.get(), "_side"));
        Variant plainFertileSoilVariant = BlockModelGenerators.plainModel(ModelTemplates.CUBE_BOTTOM_TOP.create(DDBlocks.FERTILE_SOIL.get(), fertileSoilTextureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(DDBlocks.FERTILE_SOIL.get(), BlockModelGenerators.createRotatedVariants(plainFertileSoilVariant)));



        // *** ITEMS ***
        itemModels.generateFlatItem(DDItems.MUSIC_DISC_HYPNAGOGIA.get(), ModelTemplates.FLAT_ITEM);
    }
}
