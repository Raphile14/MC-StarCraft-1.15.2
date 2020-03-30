package com.rlldftw14.mcstarcraft.client.entity.render;

import com.rlldftw14.mcstarcraft.MCStarCraft;
import com.rlldftw14.mcstarcraft.client.entity.models.ZergEggModel;
import com.rlldftw14.mcstarcraft.entities.ZergEggEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ZergEggRender extends MobRenderer<ZergEggEntity, ZergEggModel<ZergEggEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(MCStarCraft.MOD_ID, "textures/entity/model_zerg_egg.png");
	
	public ZergEggRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ZergEggModel<ZergEggEntity>(), 0.5f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(ZergEggEntity entity) {
		return TEXTURE;
	}
}
