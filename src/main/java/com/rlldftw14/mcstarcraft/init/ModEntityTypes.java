package com.rlldftw14.mcstarcraft.init;

import com.rlldftw14.mcstarcraft.MCStarCraft;
import com.rlldftw14.mcstarcraft.entities.ZergEggEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<> (ForgeRegistries.ENTITIES, MCStarCraft.MOD_ID);
	
	public static final RegistryObject<EntityType<ZergEggEntity>> ZERG_EGG_ENTITY = ENTITY_TYPES
			.register("zerg_egg", 
					() -> EntityType.Builder.<ZergEggEntity>create(ZergEggEntity::new, EntityClassification.CREATURE)
					.size(0.9f, 1.3f)
					.build(new ResourceLocation(MCStarCraft.MOD_ID, "zerg_egg").toString()));
}
