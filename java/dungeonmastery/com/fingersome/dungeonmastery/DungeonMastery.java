package com.fingersome.dungeonmastery;

import com.fingersome.dungeonmastery.block.Blocks;
import com.fingersome.dungeonmastery.config.ConfigHandler;
import com.fingersome.dungeonmastery.item.Items;
import com.fingersome.dungeonmastery.lib.ModInfo;
import com.fingersome.dungeonmastery.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class DungeonMastery 
{

	@Instance(ModInfo.MOD_ID)
	public static DungeonMastery instance;

	@SidedProxy(clientSide = "com.fingersome.dungeonmastery.proxy.ClientProxy", 
				serverSide = "com.fingersome.dungeonmastery.proxy.CommonProxy")
	
	public static CommonProxy proxy;
	public static Items items;
	public static Blocks blocks;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		items.Init();
		blocks.Init();
		
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) 
	{

		blocks.RegisterTileEntities();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) 
	{
	
	}
}
