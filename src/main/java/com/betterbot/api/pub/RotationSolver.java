package com.betterbot.api.pub;

import com.betterbot.api.pub.Unit;

/**
 * This class is to provide the basic methods for a rotation profile.
 * Each profile will include at least these methods which will be called by the bot to fight a unit. * 
 * @author Orea
 */
public interface RotationSolver {
  
    /**
     * Called when the bot is in combat and trying to kill a unit
     * 
     * @param u the unit to fight
     */
    public void combat(Unit u);
    
    /**
     * Called when the bot is not in combat and is trying to pull a unit
     * 
     * @param u the unit to pull
     */
    public void pull(Unit u);
    
    /**
     * Called when a fight ends and the bot is not in combat anymore
     * 
     * @param u the last unit the bot killed
     * @return true if combatEnd should be called again before continuing, false if the bot should continue
     */
    public boolean combatEnd(Unit u);
    
    /**
     * Called to get the maximum pull distance
     * 
     * @param u the unit to pull
     * @return the maximum distance the bot can be before pulling
     */
    public int getPullDistance(Unit u);
    
    /**
     * Called when the bot is approaching the unit till it reaches the pull distance. Feel free to cast spells here
     * 
     * @param u the unit that the bot is approaching
     */
    public void approaching(Unit u);
  
    /**
     * Called to check if the bot should walk to a special vendor
     *
     * @return the target vendor, or null
     */
    public Database.Vendor getVendor(); 
  
    /**
     * Called when the bot is at a vendor
     *
     * @param vendor the Vendor the bot is currently interacting with
     * @return if the bot should continue waiting at the vendor
     */
    public boolean atVendor(Database.Vendor vendor);
  
    /**
     * Called after the bot resurrects
     * 
     * @return if the bot should keep waiting and calling afterResurrect();
     */
    public boolean afterResurrect();
  
    /**
     * Called when the bot is about to interact with an object or NPC
     * 
     * @return if the bot should continue waiting
     */
    public boolean beforeInteract();
  
}
