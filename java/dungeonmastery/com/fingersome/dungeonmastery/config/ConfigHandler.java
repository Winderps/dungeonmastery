package com.fingersome.dungeonmastery.config;

import java.io.File;

import com.fingersome.dungeonmastery.item.ItemInfo;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{

	public static final String DUNGEON_MASTERY_CATAGORY = "Dungeon Mastery";
	
	public static void init(File file)
	{
		Configuration config = new Configuration(file);

		config.load();

		

		config.save();

	}

}
