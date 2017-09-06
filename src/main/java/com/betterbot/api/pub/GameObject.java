package com.betterbot.api.pub;

import java.awt.Point;

/**
 * This is the base GameObject class, all wow "things" are considered objects including players and NPCs.
 * It has various functions to get information about the object and to interact with it. * 
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
     * 
     * @return the on-screen vector
     */
    public Point getRenderVector();    
    
    /**
     * @return true if the object is on screen, false otherwise
     */
    public boolean isOnScreen();
    
    /**
     * @return the object's name
     */
    public String getName();
    
    /**
     * @return the object's GUID
     */
    public long getGUID();
    
    /**
     * @return the object's parent GUID
     */
    public long getParentGUID();
    
    /**
     * @return the distance to the player
     */
    public float getDistance();
    
    /**
     * Left clicks the object.
     * 
     * @return true if the click was successful, false otherwise
     */
    public boolean leftClick();
    
    /**
     * Right clicks the object.
     * 
     * @return true if the click was successful, false otherwise
     */
    public boolean rightClick();
    
    /**
     * Shift-right clicks the object.
     * 
     * @return true if the click was successful, false otherwise
     */
    public boolean shiftRightClick();

    /**
     * Returns the type ID of this object.
     *  3 = NPC
     *  4 = Player
     *  5 = World Object
     *  
     * @return the type ID
     */
    public int getType();
    
    
    /**
     * Add a watcher to this object
     * 
     * @param watchable the thing to watch
     * @param watcher the watcher
     */
    public void addWatcher(Watcher.Watchable watchable, Watcher watcher);
    
    /**
     * Remove a watcher
     * 
     * @param watcher the watcher to remove
     */
    public void removeWatcher(Watcher watcher);
    
    /**
     * Get this object's Unique Memory ID
     * 
     * @return the object's UMID or 0 if the object is no longer valid
     */
    public long getUMID();
    
    /**
     * Moves the camera until the object is on screen
     */
    public void cameraTo();
    
    /**
     * Get the memory address of this object (WARNING! If you do this your scripts probably won't work cross-expansion!)
     * 
     * @return the memory address of this object
     */
    public int getPointer();
    
    /**
     * Get the memory address of this object's extra fields (WARNING! If you do this your scripts probably won't work cross-expansion!)
     * 
     * @return the memory address of this object's extra fields
     */
    public int getFieldPointer();
    
    /**
     * Attempt to mouse over the object
     * 
     * @return true if the mouse over was successful, false otherwise
     */
    public boolean mouseOver();
    
    /**
     * @return true if the object is valid (loaded), false otherwise
     */
    public boolean isValid();
    
    /**
     * @return the time in milliseconds since the spawn of the object
     */
    public long getAge();
    
    /**
     * Get if a object is busy or in use. If a chest is opened by a player the quest is busy e.g.
     * 
     * @return 0 if the object is not busy, something else otherwise
     */
    public int getBusyStatus();
    
}
