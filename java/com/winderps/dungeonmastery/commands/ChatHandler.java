package com.winderps.dungeonmastery.commands;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ChatHandler {

	public static void sendToPlayer(String par1Message, EntityPlayer par2Player){
		if(par1Message.length() > 0){
			par2Player.addChatMessage(new ChatComponentTranslation(par1Message));
		}
	}
	
	public static void sendToAll(String par1Message, World w) {
		List<Entity> l = w.getLoadedEntityList();
		for (Entity e : l) {
			if (e instanceof EntityPlayer) {
				((EntityPlayer) e).addChatMessage(new ChatComponentTranslation(par1Message));
			}
		}
	}
	
}
