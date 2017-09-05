package com.betterbot.api.pub;

import java.util.ArrayList;

/**
 *
 * @author Orea
 */
public interface Inventory {
    public int getFreeSlots();
    public int getUsedSlots();
    public int getTotalSlots();
    public ArrayList<Item> getItems();
    public ArrayList<Item> getEquipment();
    public int getItemCount(int ... ids);
}
