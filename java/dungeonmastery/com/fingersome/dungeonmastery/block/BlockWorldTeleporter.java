package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.DungeonMastery;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;

public class BlockWorldTeleporter 
{

	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{
		if(entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP)
		{
			EntityPlayerMP player = (EntityPlayerMP) entity;
			FMLCommonHandler.instance().getMinecraftServerInstance();
			MinecraftServer server = MinecraftServer.getServer();
		
			if(player.timeUntilPortal > 0)
			{
			player.timeUntilPortal = 10;	
			}
			else if(player.dimension != 0)
			{
			player.timeUntilPortal = 10;
			player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterLimbo(server.worldServerForDimension(0)));
			}
		}
	}
	
	public boolean tryToCreatePortal(World world, int x, int y, int z)
	{
		byte b = 0;
		byte b1 = 0;
		
		if(world.getBlock(x-1, y, z) == BlockList.blockWorldStone || world.getBlock(x+1, y, z) == BlockList.blockWorldStone)
		{
			b = 1;
		}
		
		if(world.getBlock(x, y, z-1) == BlockList.blockWorldStone || world.getBlock(x, y, z+1) == BlockList.blockWorldStone)
		{
			b1 = 1;
		}
		
		if(b == b1)
		{
			return false;
		}
		else
		{
			if(world.isAirBlock(x-b, y, z-b1))
			{
				x-=b;
				z-=z;
			}
			
			for(int i = -1; i<=2; i++)
			{
				for(int j = -1; j<=3; j++)
				{
					boolean flag = (i == -1 || i == 2 || j == -1 || j == 3); 
					
					if(i != -1 && i !=2 || j!=-1 && j!=3)
					{
						Block k = world.getBlock(x + (b*i), y + j, z + (b1*i));
					}
					
				}
			}
		}
		return false;
		
	}

	public Block setBlockName(String string) 
	{
		return null;
	
	}

}

