package com.fingersome.dungeonmasterycore;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.fingersome.dungeonmasterycore.block.BlockBackpack;
import com.fingersome.dungeonmasterycore.block.BlockCampfire;
import com.fingersome.dungeonmasterycore.block.BlockCorpseGrave;
import com.fingersome.dungeonmasterycore.block.BlockCorpseSkeleton;
import com.fingersome.dungeonmasterycore.block.BlockLimboSand;
import com.fingersome.dungeonmasterycore.block.BlockLimboStone;
import com.fingersome.dungeonmasterycore.block.BlockList;
import com.fingersome.dungeonmasterycore.block.BlockWorldStone;
import com.fingersome.dungeonmasterycore.block.BlockWorldTeleporter;
import com.fingersome.dungeonmasterycore.client.gui.GuiHandler;
import com.fingersome.dungeonmasterycore.command.CommandTest;
import com.fingersome.dungeonmasterycore.item.ItemList;
import com.fingersome.dungeonmasterycore.item.ItemWandDM;
import com.fingersome.dungeonmasterycore.item.ItemWandDebugging;
import com.fingersome.dungeonmasterycore.item.ItemWandLimbo;
import com.fingersome.dungeonmasterycore.lib.References;
import com.fingersome.dungeonmasterycore.proxy.CommonProxy;
import com.fingersome.dungeonmasterycore.renderer.RendererItemBackpack;
import com.fingersome.dungeonmasterycore.renderer.RendererItemBastardsword;
import com.fingersome.dungeonmasterycore.renderer.RendererItemDagger;
import com.fingersome.dungeonmasterycore.renderer.RendererItemGreatsword;
import com.fingersome.dungeonmasterycore.renderer.RendererItemLongsword;
import com.fingersome.dungeonmasterycore.renderer.RendererItemRapier;
import com.fingersome.dungeonmasterycore.renderer.RendererItemScimitar;
import com.fingersome.dungeonmasterycore.renderer.RendererItemShortsword;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityBackpack;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseGrave;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseSkeleton;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)

public class DungeonMasteryCore
{

	@Instance
	public static DungeonMasteryCore instance;
	
	@SidedProxy (clientSide="com.fingersome.dungeonmasterycore.proxy.ClientProxy", serverSide="com.fingersome.dungeonmasterycore.proxy.ServerProxy")
	public static CommonProxy proxy;

	public static final int dimensionIdLimbo = 2;
	public static final int dimensionIdUnderdark = 3;
	
	public static CreativeTabs coreTab = new CreativeTabs("dungeonmasterycoretab")
	{
		public Item getTabIconItem() 
		{
			return ItemList.itemWandDM;
		}		
	};
	

	public File modDir;

	public static final Logger logger = LogManager.getLogger("DungeonMasteryCore");
	
	public static final int GuiCharacterInventory = 6;
	
	 @EventHandler
     public void serverStart(FMLServerStartingEvent event)
     {
		 MinecraftServer server = MinecraftServer.getServer();
         // Get's the current server instance
		 
		 ICommandManager command = server.getCommandManager();
		// Get's the Command manager for the server, but it's in a form we cannot use.
		 
		 ServerCommandManager manager = (ServerCommandManager) command;
		// Turns the useless to us ICommandManager into a now useful ServerCommandManager
		 
		 manager.registerCommand(new CommandTest());
		// Registers the command
     }

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		event.getModMetadata().version = References.VERSION;
		modDir = event.getModConfigurationDirectory();		

		try 
		{
			Config.initialize(event.getSuggestedConfigurationFile());
		} catch (Exception exception) {
			DungeonMasteryCore.logger.error("BAUBLES has a problem loading it's configuration");
		} finally {
			if (Config.config!=null) Config.save();
		}


		/////////////////////

		Config.save();
		
		ItemList.preInit(event);
		BlockList.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
  		
  		GameRegistry.registerTileEntity(TileEntityCampfire.class, "Campfire");
		GameRegistry.registerTileEntity(TileEntityCorpseGrave.class, "Grave");
		GameRegistry.registerTileEntity(TileEntityCorpseSkeleton.class, "Corpse");
		GameRegistry.registerTileEntity(TileEntityBackpack.class, "Backpack");
		
		
		proxy.registerProxies();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		
		MinecraftForgeClient.registerItemRenderer(ItemList.itemBlockBackpack, new RendererItemBackpack());
		MinecraftForgeClient.registerItemRenderer(ItemList.itemWeaponDagger, new RendererItemDagger());
		MinecraftForgeClient.registerItemRenderer(ItemList.itemWeaponShortsword, new RendererItemShortsword());
		MinecraftForgeClient.registerItemRenderer(ItemList.itemWeaponLongsword, new RendererItemLongsword());
		MinecraftForgeClient.registerItemRenderer(ItemList.itemWeaponBastardsword, new RendererItemBastardsword());
		MinecraftForgeClient.registerItemRenderer(ItemList.itemWeaponGreatsword, new RendererItemGreatsword());
		MinecraftForgeClient.registerItemRenderer(ItemList.itemWeaponRapier, new RendererItemRapier());
		MinecraftForgeClient.registerItemRenderer(ItemList.itemWeaponScimitar, new RendererItemScimitar());

	}
	
	@EventHandler
	public void load(FMLPostInitializationEvent event)
	{
		new GuiHandler();
	}
	

}
