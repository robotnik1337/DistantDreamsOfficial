package net.whereabouts.DistantDreams.entity.client;

import com.geckolib.constant.DefaultAnimations;
import com.geckolib.renderer.GeoEntityRenderer;
import com.geckolib.renderer.base.BoneSnapshots;
import com.geckolib.renderer.base.GeoRenderState;
import com.geckolib.renderer.base.RenderPassInfo;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.whereabouts.DistantDreams.entity.custom.EotragusEntity;

public class EotragusRenderer<R extends LivingEntityRenderState & GeoRenderState> extends GeoEntityRenderer<EotragusEntity, R> {
    public EotragusRenderer(EntityRendererProvider.Context context) {
        super(context, new EotragusModel());
    }

    @Override
    public void adjustModelBonesForRender(RenderPassInfo<R> renderPassInfo, BoneSnapshots snapshots) {
        DefaultAnimations.hardcodedHeadRotation(renderPassInfo, snapshots, "EoHead");
    }
}
