/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betterbot.api.pub;

/**
 * This class is used to trigger events when certain things change in the game.
 * @author Orea
 */
public interface Watcher<T> {
    
    /**
     * Watchable entries
     */
    public static enum Watchable {
        /**
         * Unit's health value, type: Integer
         */
        UNIT_HEALTH, 
        
        /**
         * Unit's max health value, type: Integer
         */
        UNIT_HEALTH_MAX,
        
        /**
         * Unit's target, type: Long
         */
        UNIT_TARGET,
        
        /**
         * The spell the Unit is currently casting, type: Integer.
         */
        UNIT_CASTING,
        
//        /**
//         * Unit's combat status.
//         */
//        UNIT_COMBAT,
        
        /**
         * World object's in-use state
         * This is triggered when a fishing bobber bobs, when a chest opens, when a quest object is being looted etc, type: Integer
         */
        WORLDOBJECT_BUSY,
        
        /**
         * New object has been loaded into the game, type: GameObject
         */
        OBJECT_ADDED
    }
    
    /**
     * Fired when the desired Watchable changes.
     * @param newValue the new value 
     */
    public void changed(T newValue);
}
