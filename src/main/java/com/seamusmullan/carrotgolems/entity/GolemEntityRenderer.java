package com.seamusmullan.carrotgolems.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.resources.ResourceLocation;

public class GolemEntityRenderer extends WolfRenderer {

    public static final ResourceLocation GOLEM_TEXTURE = new ResourceLocation("arrowgolems:textures/entity/golem.png");
    public GolemEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    public ResourceLocation getTextureLocation(GolemEntity p_114482_) {
        return GOLEM_TEXTURE;
    }
}

