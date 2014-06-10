package com.fingersome.dungeonmastery.lib;

import com.fingersome.dungeonmastery.item.ItemList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CreativeTabDM extends CreativeTabs
{

    public CreativeTabDM(int id, String name)
    {
        super(id, name);
    }

	@Override
	public Item getTabIconItem() 
	{
		return ItemList.ItemJournalQuest;
	}
}