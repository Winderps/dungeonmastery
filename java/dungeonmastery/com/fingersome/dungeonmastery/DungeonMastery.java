package com.fingersome.dungeonmastery;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.fingersome.dungeonmastery.config.ConfigHandler;
import com.fingersome.dungeonmastery.proxy.CommonProxy;
import com.fingersome.dungeonmastery.lib.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class DungeonMastery 
{

	@Instance(Reference.MOD_ID)
	public static DungeonMastery instance;

	@SidedProxy(clientSide = "com.fingersome.dungeonmastery.proxy.ClientProxy", 
				serverSide = "com.fingersome.dungeonmastery.proxy.CommonProxy")
	
	public static CommonProxy proxy;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		System.out.println(ConfigHandler.DEBUG_TEXT_VALUE);
		
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) 
	{
	
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) 
	{
	
	}
}
