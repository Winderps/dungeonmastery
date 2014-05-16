package com.fingersome.dungeonmasterycore.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import com.fingersome.dungeonmasterycore.DungeonMasteryCore;
import com.fingersome.dungeonmasterycore.block.BlockBackpack;
import com.fingersome.dungeonmasterycore.block.BlockList;
import com.fingersome.dungeonmasterycore.client.gui.GuiCharacterInventory;
import com.fingersome.dungeonmasterycore.item.ItemList;
import com.fingersome.dungeonmasterycore.renderer.RendererBlockBackpack;
import com.fingersome.dungeonmasterycore.renderer.RendererCampfire;
import com.fingersome.dungeonmasterycore.renderer.RendererCorpseGrave;
import com.fingersome.dungeonmasterycore.renderer.RendererCorpseSkeleton;
import com.fingersome.dungeonmasterycore.renderer.RendererItemGreatsword;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityBackpack;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseGrave;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseSkeleton;

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
				case DungeonMasteryCore.GuiCharacterInventory: return new GuiCharacterInventory(player);
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
