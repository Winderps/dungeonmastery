package com.fingersome.dungeonmasterycore.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.fingersome.dungeonmasterycore.block.BlockBackpack;
import com.fingersome.dungeonmasterycore.block.BlockList;
import com.fingersome.dungeonmasterycore.item.ItemBlockBackpack;
import com.fingersome.dungeonmasterycore.item.ItemList;
import com.fingersome.dungeonmasterycore.renderer.ItemRendererBackpack;
import com.fingersome.dungeonmasterycore.renderer.RendererBackpack;
import com.fingersome.dungeonmasterycore.renderer.RendererCampfire;
import com.fingersome.dungeonmasterycore.renderer.RendererCorpseGrave;
import com.fingersome.dungeonmasterycore.renderer.RendererCorpseSkeleton;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityBackpack;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseGrave;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseSkeleton;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
		
	public void registerProxies() 
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCampfire.class, new RendererCampfire());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCorpseGrave.class, new RendererCorpseGrave());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCorpseSkeleton.class, new RendererCorpseSkeleton());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBackpack.class, new RendererBackpack());
		
	}
	
	public void registerItemRenderers()
	{
		MinecraftForgeClient.registerItemRenderer(ItemList.itemBlockBackpack, new ItemRendererBackpack());
	}
	
}
