package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.lib.References;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


public class BlockList
{

public static Block blockLimboSand;
public static Block blockLimboStone;
public static Block blockWorldStone;
public static Block blockWorldTeleporter;
public static Block blockCorpseSkeleton;
public static Block blockCorpseGrave;
public static Block blockCampfire;
public static Block blockBackpack;
    
    private static boolean isInitialized = false;
    
    public static void preInit(FMLPreInitializationEvent event)
    {
        if (!isInitialized)
        {
        	blockLimboSand = new BlockLimboSand().setBlockName("blockLimboSand").setCreativeTab(DungeonMastery.coreTab).setBlockTextureName(References.MOD_ID + ":" + "blockLimboSand");
    		blockLimboStone = new BlockLimboStone().setBlockName("blockLimboStone").setCreativeTab(DungeonMastery.coreTab).setBlockTextureName(References.MOD_ID + ":" + "blockLimboStone");
    		//blockWorldTeleporter = new BlockWorldTeleporter().setBlockName("blockWorldTeleporter").setBlockTextureName(CoreReference.MOD_ID + ":" + "blockWorldTeleporter");
    		blockWorldStone = new BlockWorldStone().setBlockName("blockWorldStone").setCreativeTab(DungeonMastery.coreTab).setBlockTextureName(References.MOD_ID + ":" + "blockWorldStone");
    		blockCorpseSkeleton = new BlockCorpseSkeleton().setBlockName("blockCorpseSkeleton").setCreativeTab(DungeonMastery.coreTab);
    		blockCorpseGrave = new BlockCorpseGrave().setBlockName("blockCorpseGrave").setCreativeTab(DungeonMastery.coreTab);
    		blockCampfire = new BlockCampfire().setLightLevel(0.7F).setBlockName("blockCampfire").setCreativeTab(DungeonMastery.coreTab);
    		blockBackpack = new BlockBackpack().setBlockName("blockBackpack").setCreativeTab(DungeonMastery.coreTab);
    		
    		GameRegistry.registerBlock(blockLimboSand, "blockLimboSand");
    		GameRegistry.registerBlock(blockLimboStone, "blockLimboStone");
    		GameRegistry.registerBlock(blockWorldStone, "blockWorldStone");
    		//GameRegistry.registerBlock(blockWorldTeleporter, "blockWorldTeleporter");
    		GameRegistry.registerBlock(blockCorpseSkeleton, "blockCorpseSkeleton");
    		GameRegistry.registerBlock(blockCorpseGrave, "blockCorpseGrave");
    		GameRegistry.registerBlock(blockCampfire, "blockCampfire");
    		GameRegistry.registerBlock(blockBackpack, "blockBackpack");
            
            isInitialized = true;
        }
    }
}