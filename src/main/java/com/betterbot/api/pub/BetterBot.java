package com.betterbot.api.pub;
import java.util.List;
/**
 * This is the base BetterBot class.
 * An instance of it is handed to scripts, use this to get access to everything you need to make your script work.
 * @author Orea
 */
public interface BetterBot {
    
    /**
     * Returns the Mouse instance, used for controlling the mouse and getting mouse related data
     * 
     * @return the instance of Mouse
     */
    public Mouse getMouse();
    
    /**
     * Returns the Keyboard instance, used for controlling the keyboard and getting keyboard related data
     * 
     * @return the instance of Keyboard
     */
    public Keyboard getKeyboard();
    
    /**
     * Returns the currently loaded GUIDs. 
     *  These are used to reference all the currently loaded objects, npcs, players, etc.
     *  You can supply one of them to getObject/getUnit to get the relevant GameObject instance for that GUID
     * 
     * @return the set of GUIDs
     */
    public Iterable<Long> getCurrentGUIDs();
    
    /**
     * Returns the GameObject instance for the specified GUID. 
     *  This contains all information relative to the object, and also some helper functions
     *  GameObjects are any type of object. WorldObjects, NPCs and Players
     * 
     * @param guid the GUID to use to find the object
     * @return the GameObject, or null if it is not loaded.
     */
    public GameObject getAny(long guid);
    
    
    /**
     * Returns the Unit instance for the specified GUID. 
     *  This contains all information relative to the unit, and also some helper functions
     *  Both NPCs and players are Units
     * 
     * @param guid the GUID to use to find the unit
     * @return the Unit, or null if it is not loaded.
     */
    public Unit getUnit(long guid);
    
    
    /**
     * Returns the Frame with the specified name.
     *  This contains all information relative to the Frame, and also some helper functions
     * 
     * @param name the name of the Frmae
     * @return the Frame, or null if it is not loaded.
     */
    public Frame getFrame(String name);
    
    public Item getItem(long guid);
    
    /**
     * Returns the currently loaded GameObjects.
     *  This means all the NPCs, Players, and Objects that the server has told the client about
     * 
     * @param filter (optional) only return objects that match any of the specified strings 
     * @return the set of GameObjects
     */
    public List<GameObject> getAny(String ... filter);
    
    /**
     * Returns the currently loaded NPCs.
     *  
     * @param filter (optional) only return NPCs that match any of the specified strings
     * @return the set of NPCs
     */
    public List<Unit> getNPCs(String ... filter);
    
    /**
     * Returns the currently loaded players.
     *  
     * @param filter (optional) only return players that match any of the specified strings
     * @return the set of players
     */
    public List<Unit> getPlayers(String ... filter);
    
    /**
     * Returns the currently loaded world objects.
     *  
     * @param filter (optional) only return players that match any of the specified strings
     * @return the set of world objects
     */
    public List<GameObject> getWorldObjects(String ... filter);
    
    /**
     * Returns the player.
     *  
     * @return the player
     */
    public Unit getPlayer();
    
    /**
     * Get the dev console command registry.
     *  Use this to add custom commands to the dev console
     * @return the command registry
     */
    public Command getCommandRegistry();
    
    /**
     * Returns the bot UI manager
     * @return the bot ui manager
     */
    public BotUI getBotUI();
    
    /**
     * Add an object watcher.
     * Watcher will fire whenever a new object is added (Watchable.OBJECT_ADDED)
     * @param w the watcher
     */
    public void addObjectWatcher(Watcher w);
    
    /**
     * Remove an object watcher.
     * @param w the watcher to remove
     */
    public void removeObjectWatcher(Watcher w);
    
    
    /**
     * Sleep an amount of milliseconds, between min and max
     * @param min the minimum amount of milliseconds to sleep
     * @param max the maximum amount of milliseconds to sleep
     */
    public void sleep(int min, int max);
    
    
    /**
     * Makes sure the game has focus
     */
    public void focusGame();
    
    /**
     * Check if any of the spell IDs are currently on cooldown
     * @param spells the spell IDs to check
     * @return true if any of the spells are on CD
     */
    public boolean anyOnCD(int ... spells);
    
    /**
     * Get the current global cooldown in milliseconds
     * @return the current global cooldown in milliseconds
     */
    public int getGCD();
    
    /**
     * Get the current map ID
     * @return the current map ID
     */
    public int getCurrentMapID();
    
    
    /**
     * Get the movement handler instance. Use this to walk across the world
     * @return the movement handler instance
     */
    public Movement getMovement();
    
    /**
     * Get any units that are attacking the player
     * @return a list of units that are attacking the player
     */
    public List<Unit> getAttackers();
    
    public Inventory getInventory();
    
    
    public Vector3f getCorpseLocation();
    public void runChatCommand(String command);
    
    public boolean isDeadOrGhost();
    
    public int random(int min, int max);
    
    public boolean hasObject(long guid);
    
    public String getUIError();
    
}
