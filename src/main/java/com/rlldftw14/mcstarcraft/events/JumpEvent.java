package com.rlldftw14.mcstarcraft.events;

import com.rlldftw14.mcstarcraft.MCStarCraft;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MCStarCraft.MOD_ID, bus = Bus.FORGE)
public class JumpEvent {
	@SubscribeEvent
	public static void JumpEvent(LivingJumpEvent event) {
//		MCStarCraft.LOGGER.info("JumpEvent Fired");
		LivingEntity livingEntity = event.getEntityLiving();
//		livingEntity.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 600, 255));
		if (livingEntity.isGlowing()) {
			livingEntity.setGlowing(false);
		}		
		else if (!livingEntity.isGlowing()) {
			livingEntity.setGlowing(true);
		}
	}
}
