package com.betterbot.api.pub;

/**
 * This class represents an item(stack) in the user's inventory or an equiment slot.
 * @author Orea
 */
public interface Item {
  
    /**
     * @return the item ID
     */
    public int getItemID();
    
    /**
     * @return the durability of an item. 1 if the item is indestructible
     */
    public float getDurability();
    
    /**
     * @return the number of items in the stack
     */
    public int getStackCount();
}
