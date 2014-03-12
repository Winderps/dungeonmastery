package com.fingersome.dungeonmasterpiety;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.fingersome.dungeonmasterycore.block.BlockAltar;
import com.fingersome.dungeonmasterycore.block.BlockBreakableBarrel;
import com.fingersome.dungeonmasterycore.block.BlockBreakableCrate;
import com.fingersome.dungeonmasterycore.block.BlockBreakablePot;
import com.fingersome.dungeonmasterycore.block.BlockCampfire;
import com.fingersome.dungeonmasterycore.block.BlockCorpseGrave;
import com.fingersome.dungeonmasterycore.block.BlockCorpseSkeleton;
import com.fingersome.dungeonmasterycore.block.BlockLimboSand;
import com.fingersome.dungeonmasterycore.block.BlockLimboStone;
import com.fingersome.dungeonmasterycore.gui.GuiHandler;
import com.fingersome.dungeonmasterycore.item.ItemWandDM;
import com.fingersome.dungeonmasterycore.item.ItemWandDebugging;
import com.fingersome.dungeonmasterycore.proxy.CommonProxy;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityAltar;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseGrave;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseSkeleton;
import com.fingersome.dungeonmasterypiety.block.blockAltarBoccob;
import com.fingersome.dungeonmasterypiety.tileentity.TileEntityAltarBoccob;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = PietyReference.MOD_ID, name = PietyReference.MOD_NAME, version = PietyReference.VERSION)

public class DungeonMasteryPiety
{

	@Instance
	public static DungeonMasteryPiety instance;
	
	@SidedProxy (clientSide="com.fingersome.dungeonmasterypiety.proxy.ClientProxy", serverSide="com.fingersome.dungeonmasterypiety.proxy.ServerProxy")
	public static CommonProxy proxy;
	
public static Item itemHolySymbolBoccob;	
public static Block blockAltarBoccob;
	
	public static CreativeTabs pietyTab = new CreativeTabs("dungeonmasterypietytab")
	{
		public Item getTabIconItem() 
		{
			return DungeonMasteryPiety.itemHolySymbolBoccob;
		}		
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		itemHolySymbolBoccob = new Item().setUnlocalizedName("itemHolySymbolBoccob").setCreativeTab(pietyTab).setTextureName(PietyReference.MOD_ID + ":" + "itemHolySymbolBoccob");
	
		GameRegistry.registerItem(itemHolySymbolBoccob, "itemHolySymbolBoccob");

		blockAltarBoccob = new blockAltarBoccob().setBlockName("blockAltarBoccob").setCreativeTab(pietyTab);

		GameRegistry.registerBlock(blockAltarBoccob, "blockAltarBoccob");

	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		proxy.registerProxies();
		
	}
	
	@EventHandler
	public void init(FMLPostInitializationEvent e)
	{

	}
	
	@EventHandler
	public void load(FMLPostInitializationEvent e)
	{
		
	}
	

	
}
