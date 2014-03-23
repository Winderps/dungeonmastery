package com.fingersome.dungeonmasterycore.block;

import com.fingersome.dungeonmasterycore.lib.References;
import com.fingersome.dungeonmasterycore.DungeonMasteryCore;

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
    
    public static void preInit(FMLPreInitializationEvent e)
    {
        if (!isInitialized)
        {
        	blockLimboSand = new BlockLimboSand().setBlockName("blockLimboSand").setCreativeTab(DungeonMasteryCore.coreTab).setBlockTextureName(References.MOD_ID + ":" + "blockLimboSand");
    		blockLimboStone = new BlockLimboStone().setBlockName("blockLimboStone").setCreativeTab(DungeonMasteryCore.coreTab).setBlockTextureName(References.MOD_ID + ":" + "blockLimboStone");
    		//blockWorldTeleporter = new BlockWorldTeleporter().setBlockName("blockWorldTeleporter").setBlockTextureName(CoreReference.MOD_ID + ":" + "blockWorldTeleporter");
    		blockWorldStone = new BlockWorldStone().setBlockName("blockWorldStone").setCreativeTab(DungeonMasteryCore.coreTab).setBlockTextureName(References.MOD_ID + ":" + "blockWorldStone");
    		blockCorpseSkeleton = new BlockCorpseSkeleton().setBlockName("blockCorpseSkeleton").setCreativeTab(DungeonMasteryCore.coreTab);
    		blockCorpseGrave = new BlockCorpseGrave().setBlockName("blockCorpseGrave").setCreativeTab(DungeonMasteryCore.coreTab);
    		blockCampfire = new BlockCampfire().setLightLevel(0.7F).setBlockName("blockCampfire").setCreativeTab(DungeonMasteryCore.coreTab);
    		blockBackpack = new BlockBackpack().setBlockName("blockBackpack");
    		
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