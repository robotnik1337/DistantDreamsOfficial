package net.whereabouts.DistantDreams.entity.client;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import net.minecraft.resources.Identifier;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.entity.custom.EotragusEntity;

public class EotragusModel extends GeoModel<EotragusEntity> {
    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "eotragus");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "textures/entity/eotragus_a.png");
    }

    @Override
    public Identifier getAnimationResource(EotragusEntity animatable) {
        return Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "eotragus");
    }
}
