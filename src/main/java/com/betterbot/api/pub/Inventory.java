package com.betterbot.api.pub;

import java.util.ArrayList;

/**
 * This is the Inventory class.
 * It has various methods to get information about the player's inventory. * 
 * @author Orea
 */
public interface Inventory {
  
    /**
     * @return the amount of free slots
     */
    public int getFreeSlots();
    
    /**
     * @return the amount of used slots
     */
    public int getUsedSlots();
    
    /**
     * @return the total amount of inventory slots
     */
    public int getTotalSlots();
    
    /**
     * @return a list of all items that are in the inventory
     */
    public ArrayList<Item> getItems();
    
    /**
     * @return a list of all the items the player has eqipped
     */
    public ArrayList<Item> getEquipment();
    
    /**
     * Get the amount of one item in the inventory or the sum of multiple items
     * 
     * @param ids one or more item IDs
     * @return the counted value of all IDs given
     */
    public int getItemCount(int ... ids);
}
