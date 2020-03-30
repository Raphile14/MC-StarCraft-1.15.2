package com.rlldftw14.mcstarcraft.init;

import com.rlldftw14.mcstarcraft.MCStarCraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MCStarCraft.MOD_ID)
@Mod.EventBusSubscriber(modid = MCStarCraft.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final Block zerg_creep = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		// Zerg Blocks
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(1f, 15.0f).sound(SoundType.GROUND)).setRegistryName("zerg_creep"));
		// Terran Blocks
		
		// Protoss Blocks
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		// Zerg Blocks
		event.getRegistry().register(new BlockItem(zerg_creep, new Item.Properties().group(MCStarCraft.zergItemGroup).maxStackSize(64)).setRegistryName("zerg_creep"));
		// Terran Blocks
		
		// Protoss Blocks
	}
}
