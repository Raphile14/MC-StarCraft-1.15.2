package com.rlldftw14.mcstarcraft.events;

import com.rlldftw14.mcstarcraft.MCStarCraft;

import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MCStarCraft.MOD_ID, bus = Bus.FORGE)
public class CreepSpreadEvent {
	@SubscribeEvent
	public static void CreepSpreadEvent(BlockEvent.EntityPlaceEvent event) {
		
	}
}
