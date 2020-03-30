package com.rlldftw14.mcstarcraft.init;

import com.rlldftw14.mcstarcraft.MCStarCraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModZergBlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MCStarCraft.MOD_ID);
		
	// Zerg Blocks
	public static final RegistryObject<Block> ZERG_CREEP = BLOCKS.register("zerg_creep", ()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(1f, 15.0f).sound(SoundType.CORAL)));
	
}
