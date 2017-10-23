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
  
    /**
     * Get the amount of one item in the inventory or the sum of multiple items
     * 
     * @param names one or more item names
     * @return the counted value of all items
     */
    public int getItemCount(String ... names);
  
    /**
     * Attempt to click on an inventory item
     * @param name the name of the item
     * @return if the bot was able to click the item (left click)
     */
    public boolean clickItem(String name);
  
    /**
     * Attempt to right click on an inventory item
     * @param name the name of the item
     * @return if the bot was able to click the item (left click)
     */
    public boolean rightClickItem(String name);
  
    /**
     * Get the bag/slot ID for the specified item
     * 
     * @param id the item id
     * @return Point representing a bag slot containing the item, or null. (x=bag, y=slot)
     */
    public Point getItemBagSlot(int id);
    
    /**
     * Get the bag/slot ID for the specified item
     * 
     * @param name the item name
     * @return Point representing a bag slot containing the item, or null. (x=bag, y=slot)
     */
    public Point getItemBagSlot(String name);
  
}
