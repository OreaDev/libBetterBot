package com.betterbot.api.pub;

import java.util.List;

/**
 * This class is used for NPCs and Players.
 * It has various functions to get information about the unit, and to interact with the unit.
 * @author Orea
 */
public interface Unit extends GameObject {
    
    /**
     * @return true if alliance, false if horde
     */
    public boolean getFaction();
    
    /**
     * @return the unit's current health 
     */
    public int getHealth();
    
    /**
     * @return the unit's max health 
     */
    public int getHealthMax();
    
    /**
     * @return the unit's health float (0.0-1.0)
     */
    public float getHealthFloat();
    
    /**
     * @return the unit's current mana value
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
     * Get the GUID of the unit's current target
     * 
     * @return the unit's target or 0 if there is none
     */
    public long getTarget();
    
    /**
     * @return true if the unit is in combat, false otherwise
     */
    public boolean inCombat();
    
    /**
     * @return true if the unit is targeted by someone that is not the bot, false otherwise
     */
    public boolean isTargettedByOthers();
    
    /**
     * @return true if the unit is targeted by the bot, false otherwise
     */
    public boolean isTargettedByMe();
    
    /**
     * @return true if the unit is casting, false otherwise
     */
    public boolean isCasting();
    
    /**
     * Attempt to target the unit
     * 
     * @return true if the target was successful
     */
    public boolean target();
    
    /**
     * Gets the unit's current auras
     * 
     * @return a list containing the unit's aura IDs
     */
    public List<Integer> getAuras();
    
    /**
     * @return the unit's combat level
     */
    public int getLevel();
    
    /**
     * @return true if the unit is lootable, false otherwise
     */
    public boolean isLootable();

    /**
     * @return true if the unit is skinable, false otherwise
     */
    public boolean isSkinable();
    
    /**
     * @return the unit's pet or null if there is none
     */
    public Unit getPet();
    
    /**
     * @return the flags containing specific information about the unit (is looting, is PvP flagged, is silenced, ...)
     */
    public int getFlags();
    
    /**
     * @return the flags containing more specific information about the unit (is targeted by a player, basic stats, ...)
     */
    public int getDynamicFlags();

    /**
     * Check if this unit has the given aura(s)
     * 
     * @param auras the aura IDs to check
     * @return true if the unit has at least one of the given auras, false if no aura matches
     */
    public boolean hasAura(int ... auras);
    
    /**
     * @return true if this unit is a pet
     */
    public boolean isPet();
    
    /**
     * @return true if this unit is dead
     */
    public boolean isDead();

    /**
     * @return the unit's current rage value
     */
    public int getRage();

    /**
     * @return the unit's current energy value
     */
    public int getEnergy();

    /**
     * @return the unit's maximal rage
     */
    public int getRageMax();

    /**
     * @return the unit's maximal energy
     */
    public int getEnergyMax();
    
}
