package com.fingersome.dungeonmastery.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.block.BlockBackpack;
import com.fingersome.dungeonmastery.block.BlockList;
import com.fingersome.dungeonmastery.client.gui.GuiCharacterInventory;
import com.fingersome.dungeonmastery.item.ItemList;
import com.fingersome.dungeonmastery.renderer.RendererBlockBackpack;
import com.fingersome.dungeonmastery.renderer.RendererCampfire;
import com.fingersome.dungeonmastery.renderer.RendererCorpseGrave;
import com.fingersome.dungeonmastery.renderer.RendererCorpseSkeleton;
import com.fingersome.dungeonmastery.renderer.RendererItemGreatsword;
import com.fingersome.dungeonmastery.tileentity.TileEntityBackpack;
import com.fingersome.dungeonmastery.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmastery.tileentity.TileEntityCorpseGrave;
import com.fingersome.dungeonmastery.tileentity.TileEntityCorpseSkeleton;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy
{
		
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (world instanceof WorldClient) 
		{
			switch (ID) 
			{
				case DungeonMastery.GuiCharacterInventory: return new GuiCharacterInventory(player);
			}
		}
		return null;
	}

	@Override
	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}
	
	public void registerProxies() 
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCampfire.class, new RendererCampfire());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCorpseGrave.class, new RendererCorpseGrave());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCorpseSkeleton.class, new RendererCorpseSkeleton());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBackpack.class, new RendererBlockBackpack());
		
	}
	
	public void registerItemRenderers()
	{
		
	}
	
}
