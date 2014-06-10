package com.fingersome.dungeonmastery.lib;

import com.fingersome.dungeonmastery.block.BlockList;
import com.fingersome.dungeonmastery.item.ItemList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CreativeTabBuilding extends CreativeTabs
{

    public CreativeTabBuilding(int id, String name)
    {
        super(id, name);
    }

	@Override
	public Item getTabIconItem() 
	{
		return ItemList.ItemWandBuild;
	}
}