package com.fingersome.dungeonmasterycore.container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import com.fingersome.dungeonmasterycore.api.BaubleType;
import com.fingersome.dungeonmasterycore.api.IBauble;

public class SlotCharacter extends Slot
{
	
	BaubleType type;

    public SlotCharacter(IInventory par2IInventory, BaubleType type, int par3, int par4, int par5)
    {
        super(par2IInventory, par3, par4, par5);
        this.type = type;
    }
    

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    @Override
    public boolean isItemValid(ItemStack stack)
    {
        return stack!=null && stack.getItem() !=null &&
        	   stack.getItem() instanceof IBauble &&
        	   ((IBauble)stack.getItem()).getBaubleType(stack)==this.type;
    }
    
    @Override
    public int getSlotStackLimit()
    {
        return 1;
    }
    
}