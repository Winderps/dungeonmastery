package com.fingersome.dungeonmasterycore.command;

import com.fingersome.dungeonmasterycore.lib.Dice;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;


public class CommandTest extends CommandBase
{

	@Override
	public String getCommandName()
	{
	return "roll";
	// Name of the command "roll" will be called by "/roll"
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
	return "rolls a dice, and adds a modifer of 1";
	// Message to show when the user uses "/help test"
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{
		if(icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) icommandsender; 
			// Turn the sender into a player entity
			
			Dice.roll(20, 1); 
			// Rolls a d20 with a modifier of 1
		}
	}
}