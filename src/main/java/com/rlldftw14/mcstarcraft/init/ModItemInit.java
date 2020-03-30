package com.rlldftw14.mcstarcraft.init;

import com.rlldftw14.mcstarcraft.MCStarCraft;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemInit {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MCStarCraft.MOD_ID);
	
		// Zerg Items
		public static final RegistryObject<Item> zerg_larva_egg = ITEMS.register("zerg_larva_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_egg_egg = ITEMS.register("zerg_egg_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_drone_egg = ITEMS.register("zerg_drone_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_overlord_egg = ITEMS.register("zerg_overlord_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_zergling_egg = ITEMS.register("zerg_zergling_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_queen_egg = ITEMS.register("zerg_queen_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_overseer_egg = ITEMS.register("zerg_overseer_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_roach_egg = ITEMS.register("zerg_roach_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_ravager_egg = ITEMS.register("zerg_ravager_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_baneling_egg = ITEMS.register("zerg_baneling_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_infestor_egg = ITEMS.register("zerg_infestor_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_swarm_host_egg = ITEMS.register("zerg_swarm_host_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_hydralisk_egg = ITEMS.register("zerg_hydralisk_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_mutalisk_egg = ITEMS.register("zerg_mutalisk_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_corruptor_egg = ITEMS.register("zerg_corruptor_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_viper_egg = ITEMS.register("zerg_viper_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_lurker_egg = ITEMS.register("zerg_lurker_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_ultralisk_egg = ITEMS.register("zerg_ultralisk_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
		public static final RegistryObject<Item> zerg_broodlord_egg = ITEMS.register("zerg_broodlord_egg", ()-> new Item(new Item.Properties().group(MCStarCraft.zergItemGroup)));
}
