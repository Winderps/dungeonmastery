package com.fingersome.dungeonmastery.lib;

import com.fingersome.dungeonmastery.item.ItemList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CreativeTabCrafting extends CreativeTabs
{

    public CreativeTabCrafting(int id, String name)
    {
        super(id, name);
    }

	@Override
	public Item getTabIconItem() 
	{
		return ItemList.ItemIngotCopper;
	}
}