package com.fingersome.dungeonmastery.lib;

import com.fingersome.dungeonmastery.item.ItemWandZones;

import net.minecraft.entity.player.EntityPlayer;

public class PlayerCharacter extends PlayerInfo
{
	public PlayerCharacter()
	{
		
	}
	
	public void onJoinNewWorld()
	{
		
	}
	
	public void setDMGameRole(EntityPlayer player)
	{
		if (PLAYER_IS_DM == true)
		{System.out.println("You're already the DM!");}
		/**
		 * else if (player.isathing)
		 * {do the thing}
		 * 
		 **/
		else
		{player.setInvisible(true);/**&& player.setGameType() && player.setCurrentItemOrArmor(0, null);**/}
	}
	
	public void setCharacterGameRole(EntityPlayer player)
	{
		if(PLAYER_IS_CHARACTER == true)
		{System.out.println("You are already a Character!");}
		/**
		 * else if (player.isathing)
		 * {do the thing}
		 * 
		 * else
		 * {}
		 **/
	}
	
	public void calculateMoralAlignment()
	{	
		if (STAT_TRAIT_ALIGNMENT_MORAL_NUMERIC > 0)
		{STAT_TRAIT_ALIGNMENT_MORAL = "Good";}
		
		else if (STAT_TRAIT_ALIGNMENT_MORAL_NUMERIC < 0)
		{STAT_TRAIT_ALIGNMENT_MORAL = "Evil";}
	
		else
		{STAT_TRAIT_ALIGNMENT_MORAL = "Neutral";}
	}
	
	public void calculateLegalAlignment()
	{	
		if (STAT_TRAIT_ALIGNMENT_LEGAL_NUMERIC > 0)
		{STAT_TRAIT_ALIGNMENT_LEGAL = "Lawful";}
		
		else if (STAT_TRAIT_ALIGNMENT_LEGAL_NUMERIC < 0)
		{STAT_TRAIT_ALIGNMENT_LEGAL = "Chaotic";}
	
		else
		{STAT_TRAIT_ALIGNMENT_LEGAL = "Neutral";}
	}
	
}
