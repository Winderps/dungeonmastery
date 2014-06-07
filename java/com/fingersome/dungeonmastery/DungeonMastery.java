package com.fingersome.dungeonmastery;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.fingersome.dungeonmastery.block.BlockList;
import com.fingersome.dungeonmastery.client.gui.GuiHandler;
import com.fingersome.dungeonmastery.config.ConfigHandler;
import com.fingersome.dungeonmastery.item.ItemList;
import com.fingersome.dungeonmastery.lib.ModInfo;
import com.fingersome.dungeonmastery.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class DungeonMastery 
{

	@Instance(ModInfo.MOD_ID)
	public static DungeonMastery instance;

	@SidedProxy(clientSide = "com.fingersome.dungeonmastery.proxy.ClientProxy", 
				serverSide = "com.fingersome.dungeonmastery.proxy.CommonProxy")     
	
	public static CommonProxy proxy;
	public static ItemList items;
	public static BlockList blocks;

	
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
		
		new GuiHandler();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) 
	{
	
	}
	
	@EventHandler
	public void ServerStart(FMLServerStartingEvent event)
	{
		
	}
}
