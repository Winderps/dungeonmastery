package com.fingersome.dungeonmastery.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{

	private static final String DUNGONMASTERY_CATAGORY = "Dungeon Mastery";
	public static int EXAMPLE_VALUE;
	private static final String EXAMPLE_NAME = "example";
	private static final int EXAMPLE_DEFAULT = 5;
	public static String DEBUG_TEXT_VALUE;
	private static final String DEBUG_TEXT_NAME = "Debug text";
	private static final String DEBUG_TEXT_DEFAULT = "Debugging successfull!";

	public static void init(File file)
	{
		Configuration config = new Configuration(file);

		config.load();

		EXAMPLE_VALUE = config.get(DUNGONMASTERY_CATAGORY, EXAMPLE_NAME, EXAMPLE_DEFAULT).getInt();
		DEBUG_TEXT_VALUE = config.get(DUNGONMASTERY_CATAGORY, DEBUG_TEXT_NAME, DEBUG_TEXT_DEFAULT).getString();

		config.save();

	}

}
