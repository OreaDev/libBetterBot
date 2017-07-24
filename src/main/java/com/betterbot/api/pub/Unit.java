package com.betterbot.api.pub;

import java.util.List;

/**
 * This class is used for NPCs and Players.
 * it has various functions to get information about the unit, and to interact with the unit.
 * 
 * @author Orea
 */
public interface Unit extends GameObject {
    
    /**
     * Get the unit's faction
     * 
     * @return true if alliance, false if horde
     */
    public boolean getFaction();
    
    /**
     * Get the unit's current health value
     * 
     * @return the unit's health 
     */
    public int getHealth();
    
    /**
     * Get the unit's max health value
     * 
     * @return the unit's max health 
     */
    public int getHealthMax();
    
    /**
     * Get the unit's current health float.
     *  Multiply by 100 to get percentage.
     * 
     * @return the unit's health float, between 0 and 1
     */
    public float getHealthFloat();
    
    /**
     * @return the unit's mana
     */
    public int getMana();
    
    /**
     * @return the unit's max mana
     */
    public int getManaMax();
    
    /**
     * @return the unit's mana float (0.0-1.0)
     */
    public float getManaFloat();
    
    /**
     * Get the GUID of the unit's current target.
     * 
     * @return the unit's target, or 0 if no target
     */
    public long getTarget();
    
    /**
     * Returns if the unit is in combat
     * 
     * @return if the unit is in combat
     */
    public boolean inCombat();
    
    /**
     * Returns if the unit is targeted by someone that is not the bot
     * 
     * @return if the unit is targeted by someone that is not the bot
     */
    public boolean isTargettedByOthers();
    
    /**
     * Returns if the unit is targeted by the bot
     * 
     * @return if the unit is targeted by the bot
     */
    public boolean isTargettedByMe();
    
    /**
     * Returns if the unit is casting
     * 
     * @return if the unit is casting
     */
    public boolean isCasting();
    
    /**
     * Attempt to target the unit
     * 
     * @return if the target was successful
     */
    public boolean target();
    
    /**
     * Gets the unit's current auras
     * @return a list containing the unit's auras
     */
    public List<Integer> getAuras();
    
    /**
     * Get the unit's combat level
     * @return the unit's combat level
     */
    public int getLevel();
    
    /**
     * Check if this unit has loot
     * @return if the unit is still lootable
     */
    public boolean isLootable();
    
    public boolean isSkinable();
    
    /**
     * Get this unit's pet, if there is one
     * @return the unit's pet
     */
    public Unit getPet();
    
    public int getFlags();
    public int getDynamicFlags();
    public boolean hasAura(int ... auras);
    public boolean isPet();
    
    public boolean isDead();
    
    public int getRage();
    public int getEnergy();
    public int getRageMax();
    public int getEnergyMax();
    
}
