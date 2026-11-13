package net.whereabouts.DistantDreams.entity.client;

import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import net.whereabouts.DistantDreams.DistantDreams;
import net.whereabouts.DistantDreams.entity.custom.EotragusEntity;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.Nullable;

public class EotragusRenderer extends GeoEntityRenderer<EotragusEntity, LivingEntityRenderState> {
    public EotragusRenderer(EntityRendererProvider.Context context) {
        super(context, new EotragusModel());
    }
//    public EotragusRenderer(EntityRendererProvider.Context context, EntityType<EotragusEntity> entityType) {
//        super(context, entityType);
//    }
//
//
//    @Override
//    public Identifier getTextureLocation(R renderState) {
//        return Identifier.fromNamespaceAndPath(DistantDreams.MOD_ID, "textures/entity/eotragus_a.png");
//    }
//
//    @Override
//    public EntityRenderState createRenderState(T animatable, @Nullable Void relatedObject) {
//        return new EntityRenderState();
//    }
//
//    @ApiStatus.Internal
//    @Override
//    public void submit(R renderState, PoseStack poseStack, SubmitNodeCollector renderTasks, CameraRenderState cameraState) {
//        super.submit(renderState, poseStack, renderTasks, cameraState);
//    }
}
