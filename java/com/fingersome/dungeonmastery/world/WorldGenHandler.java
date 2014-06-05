package com.fingersome.dungeonmastery.world;

import java.util.Random;

import com.fingersome.dungeonmastery.block.BlockInfo;
import com.fingersome.dungeonmastery.block.BlockList;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler implements IWorldGenerator
{
	private WorldGenerator modOverworldGen;
	private WorldGenerator modLimboGen;
	
	private WorldGenerator copperGen;
	private WorldGenerator tinGen;
	private WorldGenerator ironGen;
	private WorldGenerator silverGen;
	private WorldGenerator goldGen;
	private WorldGenerator platinumGen;
	
	
	public WorldGenHandler()
	{
		//GameRegistry.registerWorldGenerator(this, 0);
	}
		
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		
		
	}

}
