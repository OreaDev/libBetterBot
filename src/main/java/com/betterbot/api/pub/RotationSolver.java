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
     * Called when a fight ended a the bot is not in combat anymore
     * 
     * @param u the last unit the bot killed
     * @return true if the bot should wait before walking, false if the bot should move on
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
}
