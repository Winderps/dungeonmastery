package com.fingersome.dungeonmastery.lib;

import com.fingersome.dungeonmastery.item.ItemWandDM;

import net.minecraft.entity.player.EntityPlayer;

public class PlayerStats extends PlayerInfo
{

	public void SetPlayerGameRole(EntityPlayer player)
	{
		if (PLAYER_IS_DM == true)
		{System.out.println("You're already the DM!");}
		else
		{player.setInvisible(true);/**&& player.setGameType() && player.setCurrentItemOrArmor(0, null);**/}
		
	}
	
	public void CalculateMoralAlignment()
	{	
		if (STAT_TRAIT_ALIGNMENT_MORAL_NUMERIC > 0)
		{STAT_TRAIT_ALIGNMENT_MORAL = "Good";}
		
		else if (STAT_TRAIT_ALIGNMENT_MORAL_NUMERIC < 0)
		{STAT_TRAIT_ALIGNMENT_MORAL = "Evil";}
	
		else
		{STAT_TRAIT_ALIGNMENT_MORAL = "Neutral";}
	}
	
	public void CalculateLegalAlignment()
	{	
		if (STAT_TRAIT_ALIGNMENT_LEGAL_NUMERIC > 0)
		{STAT_TRAIT_ALIGNMENT_LEGAL = "Lawful";}
		
		else if (STAT_TRAIT_ALIGNMENT_LEGAL_NUMERIC < 0)
		{STAT_TRAIT_ALIGNMENT_LEGAL = "Chaotic";}
	
		else
		{STAT_TRAIT_ALIGNMENT_LEGAL = "Neutral";}
	}
	
}
