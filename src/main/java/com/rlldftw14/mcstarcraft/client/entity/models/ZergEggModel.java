package com.rlldftw14.mcstarcraft.client.entity.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.rlldftw14.mcstarcraft.entities.ZergEggEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class ZergEggModel<T extends ZergEggEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer bone_body;
	private final ModelRenderer bone_head;
	private final ModelRenderer bone_top;
	private final ModelRenderer bone_top2;
	private final ModelRenderer bone_north_side;
	private final ModelRenderer bone_south_side;
	private final ModelRenderer bone_east_side;
	private final ModelRenderer bone_west_side;

	public ZergEggModel() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone_body = new ModelRenderer(this);
		bone_body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone_body);
//		bone_body.cubeList.add(new ModelBox(bone_body, 0, 0, -14.0F, -5.0F, -14.0F, 28, 5, 28, 0.0F, false));
		bone_body.setTextureOffset(0, 0).addBox(-14.0F, -5.0F, -14.0F, 28, 5, 28, 0.0F, false);

		bone_head = new ModelRenderer(this);
		bone_head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone_head);
//		bone_head.cubeList.add(new ModelBox(bone_head, 0, 0, -10.0F, -25.0F, -10.0F, 20, 20, 20, 0.0F, false));
		bone_head.setTextureOffset(0, 0).addBox(-10.0F, -25.0F, -10.0F, 20, 20, 20, 0.0F, false);

		bone_top = new ModelRenderer(this);
		bone_top.setRotationPoint(0.0F, -7.0F, 0.0F);
		body.addChild(bone_top);
//		bone_top.cubeList.add(new ModelBox(bone_top, 0, 0, -9.0F, -20.0F, -8.0F, 17, 3, 16, 0.0F, false));
		bone_top.setTextureOffset(0, 0).addBox(-9.0F, -20.0F, -8.0F, 17, 3, 16, 0.0F, false);

		bone_top2 = new ModelRenderer(this);
		bone_top2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone_top2);
//		bone_top2.cubeList.add(new ModelBox(bone_top2, 0, 0, -5.0F, -29.0F, -5.0F, 9, 2, 10, 0.0F, false));
		bone_top2.setTextureOffset(0, 0).addBox(-5.0F, -29.0F, -5.0F, 9, 2, 10, 0.0F, false);

		bone_north_side = new ModelRenderer(this);
		bone_north_side.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone_north_side);
//		bone_north_side.cubeList.add(new ModelBox(bone_north_side, 0, 0, -8.0F, -23.0F, -12.0F, 16, 16, 2, 0.0F, false));
		bone_north_side.setTextureOffset(0, 0).addBox(-8.0F, -23.0F, -12.0F, 16, 16, 2, 0.0F, false);
//		bone_north_side.cubeList.add(new ModelBox(bone_north_side, 0, 0, -6.0F, -20.0F, -14.0F, 12, 10, 2, 0.0F, false));
		bone_north_side.setTextureOffset(0, 0).addBox(-6.0F, -20.0F, -14.0F, 12, 10, 2, 0.0F, false);

		bone_south_side = new ModelRenderer(this);
		bone_south_side.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone_south_side);
//		bone_south_side.cubeList.add(new ModelBox(bone_south_side, 0, 0, -8.0F, -23.0F, 10.0F, 16, 16, 2, 0.0F, false));
		bone_south_side.setTextureOffset(0, 0).addBox(-8.0F, -23.0F, 10.0F, 16, 16, 2, 0.0F, false);
//		bone_south_side.cubeList.add(new ModelBox(bone_south_side, 0, 0, -6.0F, -20.0F, 12.0F, 12, 10, 2, 0.0F, false));
		bone_south_side.setTextureOffset(0, 0).addBox(-6.0F, -20.0F, 12.0F, 12, 10, 2, 0.0F, false);

		bone_east_side = new ModelRenderer(this);
		bone_east_side.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone_east_side);
//		bone_east_side.cubeList.add(new ModelBox(bone_east_side, 0, 0, -12.0F, -23.0F, -8.0F, 2, 16, 16, 0.0F, false));
		bone_east_side.setTextureOffset(0, 0).addBox(-12.0F, -23.0F, -8.0F, 2, 16, 16, 0.0F, false);
//		bone_east_side.cubeList.add(new ModelBox(bone_east_side, 0, 97, -14.0F, -20.0F, -6.0F, 2, 10, 12, 0.0F, false));
		bone_east_side.setTextureOffset(0, 97).addBox(-14.0F, -20.0F, -6.0F, 2, 10, 12, 0.0F, false);

		bone_west_side = new ModelRenderer(this);
		bone_west_side.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone_west_side);
//		bone_west_side.cubeList.add(new ModelBox(bone_west_side, 0, 0, 10.0F, -23.0F, -8.0F, 2, 16, 16, 0.0F, false));
		bone_west_side.setTextureOffset(0, 0).addBox(10.0F, -23.0F, -8.0F, 2, 16, 16, 0.0F, false);
//		bone_west_side.cubeList.add(new ModelBox(bone_west_side, 0, 0, 12.0F, -20.0F, -6.0F, 2, 10, 12, 0.0F, false));
		bone_west_side.setTextureOffset(0, 0).addBox(12.0F, -20.0F, -6.0F, 2, 10, 12, 0.0F, false);
	}
	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
		
	}
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {		
	}	
		
	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
	}
}