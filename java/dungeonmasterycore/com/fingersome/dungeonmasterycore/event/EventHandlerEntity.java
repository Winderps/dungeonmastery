package com.fingersome.dungeonmasterycore.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import com.fingersome.dungeonmasterycore.api.IBauble;
import com.fingersome.dungeonmasterycore.container.InventoryCharacter;
import com.fingersome.dungeonmasterycore.lib.PlayerHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerEntity  
{

	PlayerHandler playerhandler = new PlayerHandler();
	
	@SubscribeEvent
	public void playerTick(PlayerEvent.LivingUpdateEvent event) 
	{
		
		//player events
		if (event.entity instanceof EntityPlayer) 
		{
			EntityPlayer player = (EntityPlayer)event.entity;
			
			InventoryCharacter character = playerhandler.getInventoryCharacter(player);
			for (int a=0;a<character.getSizeInventory();a++) 
			{
				if (character.getStackInSlot(a)!=null && character.getStackInSlot(a).getItem() instanceof IBauble) {
					((IBauble)character.getStackInSlot(a).getItem()).onWornTick(character.getStackInSlot(a), player);
				}
			}
			
		}
		
	}
	
	@SubscribeEvent
	public void playerDeath(LivingDeathEvent event)
	{
		if (event.entity instanceof EntityPlayer && !event.entity.worldObj.isRemote) {
			EntityPlayer player = (EntityPlayer)event.entity;
			playerhandler.getInventoryCharacter(player).dropItems(player);
		}
	}
		
		
}