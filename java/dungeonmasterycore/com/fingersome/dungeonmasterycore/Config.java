package com.fingersome.dungeonmasterycore;

import java.io.File;

import com.fingersome.dungeonmasterycore.item.ItemList;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;


public class Config 
{

	public static Configuration config;

	public static void initialize(File file)
    {
		config = new Configuration(file);
        config.load();
        
		config.save();
    }


	public static void save()
    {
        config.save();
    }	
	
}