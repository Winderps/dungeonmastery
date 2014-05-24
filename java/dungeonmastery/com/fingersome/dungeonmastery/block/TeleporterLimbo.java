package com.fingersome.dungeonmastery.block;

import java.util.Random;

import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TeleporterLimbo extends Teleporter 
{
	
	private final WorldServer worldServerInstance;
	private final Random random;

	public TeleporterLimbo(WorldServer worldserver) 
	{
		super(worldserver);
		this.worldServerInstance = worldserver;
		this.random = new Random(worldserver.getSeed());
	}

}
