package com.fingersome.dungeonmastery.lib;

import com.fingersome.dungeonmastery.item.ItemList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CreativeTabCharacter extends CreativeTabs
{

    public CreativeTabCharacter(int id, String name)
    {
        super(id, name);
    }

	@Override
	public Item getTabIconItem() 
	{
		return ItemList.ItemWispSoul;
	}
}