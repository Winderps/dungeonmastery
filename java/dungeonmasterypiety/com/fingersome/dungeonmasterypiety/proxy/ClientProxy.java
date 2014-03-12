package com.fingersome.dungeonmasterypiety.proxy;

import com.fingersome.dungeonmasterycore.renderer.RendererAltar;
import com.fingersome.dungeonmasterycore.renderer.RendererCampfire;
import com.fingersome.dungeonmasterycore.renderer.RendererCorpseGrave;
import com.fingersome.dungeonmasterycore.renderer.RendererCorpseSkeleton;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityAltar;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseGrave;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseSkeleton;
import com.fingersome.dungeonmasterypiety.renderer.RendererAltarBoccob;
import com.fingersome.dungeonmasterypiety.tileentity.TileEntityAltarBoccob;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	public void registerProxies() 
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarBoccob.class, new RendererAltarBoccob());
	}
	
}
