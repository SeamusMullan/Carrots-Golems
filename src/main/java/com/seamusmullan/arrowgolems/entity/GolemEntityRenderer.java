package com.seamusmullan.arrowgolems.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.client.renderer.entity.layers.WolfCollarLayer;

public class GolemEntityRenderer extends WolfRenderer {

    public GolemEntityRenderer(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
        this.addLayer(new WolfCollarLayer(this));
    }
}

