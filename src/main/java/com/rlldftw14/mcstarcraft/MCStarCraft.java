package com.rlldftw14.mcstarcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rlldftw14.mcstarcraft.init.ModZergBlockInit;
import com.rlldftw14.mcstarcraft.init.ModEntityTypes;
import com.rlldftw14.mcstarcraft.init.ModItemInit;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("mcstarcraft")
public class MCStarCraft
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mcstarcraft";
    public static MCStarCraft instance;   
    public static final ItemGroup zergItemGroup = new MCStarCraftItemGroup("zerg");
    public static final ItemGroup terranItemGroup = new MCStarCraftItemGroup("terran");
    public static final ItemGroup protossItemGroup = new MCStarCraftItemGroup("protoss");
    
    public MCStarCraft() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
    	
    	ModItemInit.ITEMS.register(modEventBus);
//    	ModZergBlockInit.BLOCKS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
    	instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }
    
//    @SubscribeEvent
//    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
//    	final IForgeRegistry<Item> registry = event.getRegistry();
//    	LOGGER.debug("Zerg Blocks Tried");
//    	
//    	// Zerg Blocks
//    	ModZergBlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
//    		final Item.Properties properties = new Item.Properties().group(zergItemGroup);
//    		final BlockItem blockItem = new BlockItem(block, properties);
//    		blockItem.setRegistryName(block.getRegistryName());
//    		registry.register(blockItem);
//    	});
//    	LOGGER.debug("Zerg Blocks Registered");
//    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        
    }      

}
