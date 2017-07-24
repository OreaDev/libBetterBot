/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
