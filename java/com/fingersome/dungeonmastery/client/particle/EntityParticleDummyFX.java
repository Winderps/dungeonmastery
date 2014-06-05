package com.fingersome.dungeonmastery.client.particle;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class EntityParticleDummyFX extends EntityFX
{

	public EntityParticleDummyFX(World world, double x, double y, double z, double motionX, double motionY, double motionZ) 
	{
		super(world, x, y, z, motionX, motionY, motionZ);
		
		/*
		 * register icon for particle method goes here.
		 * just as soon as I figure out what that method is ._.
		 * 
		 */
		
		particleScale 	= 2;
		particleAlpha 	= 0.5F;
		particleBlue 	= 0;
		particleGreen 	= 0;
		particleRed		= 0;
		particleAge		= rand.nextInt();
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		particleScale = 1 - (float)particleAge / particleMaxAge *2;
	}
	
	@Override
	public int getFXLayer()
	{
		return 1;
		
	}
	
	

}
