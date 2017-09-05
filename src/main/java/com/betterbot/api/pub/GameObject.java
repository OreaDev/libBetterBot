package com.betterbot.api.pub;

import java.awt.Point;

/**
 * This is the base GameObject class, all wow "things" are considered objects including players and NPCs.
 * it has various functions to get information about the object, and to interact with the object.
 * 
 * @author Orea
 */
public interface GameObject {
    
    /**
     * Returns the object's vector.
     *  This is the 3D world coordinate representing the object's current position in the game
     *  
     * @return the object's vector
     */
    public Vector3f getVector();
    
    /**
     * Returns the object's 2D on-screen vector
     * @return the on-screen vector
     */
    public Point getRenderVector();
    
    
    /**
     * Check if the object is on screen
     * @return true if the object is on screen
     */
    public boolean isOnScreen();
    
    /**
     * Returns the object's name.
     * 
     * @return the object's name
     */
    public String getName();
    
    /**
     * Returns the object's GUID.
     * 
     * @return the object's GUID
     */
    public long getGUID();
    
    /**
     * Return the parent GUID (object's owner)
     * @return the object's parent GUID
     */
    public long getParentGUID();
    
    /**
     * Returns the object's distance to the player.
     * 
     * @return the distance to the player
     */
    public float getDistance();
    
    /**
     * Left clicks the object.
     * 
     * @return if the click was successful
     */
    public boolean leftClick();
    
    /**
     * Right clicks the object.
     * 
     * @return if the click was successful
     */
    public boolean rightClick();
    
    /**
     * Shift-right clicks the object.
     * 
     * @return if the click was successful
     */
    public boolean shiftRightClick();

    /**
     * Returns the type id of this object.
     *  3 = NPC
     *  4 = Player
     *  5 = World Object
     * @return the type id
     */
    public int getType();
    
    
    /**
     * Add a watcher to this object
     * @param watchable the thing to watch
     * @param watcher the watcher
     */
    public void addWatcher(Watcher.Watchable watchable, Watcher watcher);
    
    /**
     * Remove a watcher
     * @param watcher watcher to remove
     */
    public void removeWatcher(Watcher watcher);
    
    /**
     * Get this object's Unique Memory ID.
     * @return the object's UMID, or zero if the object is no longer valid
     */
    public long getUMID();
    
    /**
     * Moves the camera until the object is on screen
     */
    public void cameraTo();
    
    /**
     * Get the memory address of this object (WARNING! If you do this your scripts probably won't work cross-expansion!)
     * @return the memory address of this object
     */
    public int getPointer();
    
    /**
     * Get the memory address of this object's extra fields (WARNING! If you do this your scripts probably won't work cross-expansion!)
     * @return the memory address of this object's extra fields
     */
    public int getFieldPointer();
    
    /**
     * Attempt to mouse over the object
     * @return if the mouse over was successful
     */
    public boolean mouseOver();
    
    /**
     * Check if the object is still valid (loaded)
     * @return true if the object is valid
     */
    public boolean isValid();
    
    public long getAge();
    
    public int getBusyStatus();
    
}