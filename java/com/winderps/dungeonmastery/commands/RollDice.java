package com.winderps.dungeonmastery.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IChatComponent;

public class RollDice implements ICommand
{
	private List aliases;
	public RollDice()
	{
		this.aliases = new ArrayList();
	    this.aliases.add("roll");
	    this.aliases.add("r");
	}
	
	@Override
	public String getCommandName()
	{
		return "roll";
	}
	
	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
	    return "roll (x)d(y)[+z] - rolls x dice of y size with mod z.";
	}
	
	@Override
	public List getCommandAliases()
	{
	    return this.aliases;
	}
	
	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{
		EntityPlayer player = null;
		if (icommandsender instanceof EntityPlayer){
			player = (EntityPlayer)icommandsender;
		}
		if(astring.length == 0)
		{
			ChatHandler.sendToPlayer("Invalid Message", player);
			return;
		}
		ChatHandler.sendToAll(player.getDisplayName() + " rolled a " + getRoll(astring[0],player) + " on "+astring[0], player.getEntityWorld());
		System.out.println("Test!");
	}
	public static String getRoll(String rolltext, EntityPlayer p){ // I suck at commenting
		String[] split = rolltext.split("d"); // separate number of dice from dice size
		int num = Integer.parseInt(split[0]); // assign number of dice to this variable
		int size = Integer.parseInt(split[1].split("\\+")[0]); // assign size of dice to this one
		int mod = 0; // default for modifier is 0
		if (rolltext.contains("+")){ // is there a mod specified?
			mod = Integer.parseInt(split[1].split("\\+")[1]); // if so, assign it to our mod variable
		}
		String result = ""; // set up result -- mainly because I'm tired of eclipse telling me I'm not returning anything.
		int total = 0; // set up total 
		int critCount = 0; // counter for number of crits
		for (int i=0;i<num;i++) { //actually roll the dice
			int roll = p.getRNG().nextInt(size)+1;
			total += roll + mod;
			if (roll == size+mod) { //did they roll max?
				critCount++; // increment crit count
			}
		}
		result = String.valueOf(total)+" - ("+String.valueOf(critCount)+" crits)";
		return result;
	}
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
	{
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender icommandsender,
			String[] astring)
	{
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] astring, int i)
	{
		return false;
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}
}
