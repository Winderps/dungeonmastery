package com.fingersome.dungeonmastery.client.particle;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class EntityParticleDummyFX extends EntityFX
{

	public EntityParticleDummyFX(World world, double x, double y, double z, double motionX, double motionY, double motionZ) 
	{
		super(world, x, y, z, motionX, motionY, motionZ);
	}
	
	//register icon for particle code... when I figure out what the method is ._.
	
	@Override
	public int getFXLayer() 
	{
		return 1;
	}

}
