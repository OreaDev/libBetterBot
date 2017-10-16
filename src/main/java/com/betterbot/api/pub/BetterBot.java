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
     * Returns the Database instance, used for querying useful game related information
     * 
     * @return the instance of Database
     */
    public Database getDatabase();
    
    
    /**
     * Returns the currently loaded GUIDs. 
     *  These are used to reference all the currently loaded objects, npcs, players, items, bags and eqipment
     *  You can supply one of them to getObject/getUnit/getItem to get the relevant GameObject instance for that GUID
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
    
    /**
     * @param guid the GUID of an item
     * @return the item or null if the guid is faulty
     */    
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
     * @return the player
     */
    public Unit getPlayer();
    
    /**
     * Get the dev console command registry.
     *  Use this to add custom commands to the dev console
     *  
     * @return the command registry
     */
    public Command getCommandRegistry();
    
    /**
     * @return the bot ui manager
     */
    public BotUI getBotUI();
    
    /**
     * Add an object watcher.
     *  Watcher will fire whenever a new object is added (Watchable.OBJECT_ADDED) 
     * 
     * @param w the watcher
     */
    public void addObjectWatcher(Watcher w);
    
    /**
     * Remove an object watcher.
     * 
     * @param w the watcher to remove
     */
    public void removeObjectWatcher(Watcher w);
    
    /**
     * Sleep an amount of milliseconds, between min and max
     * 
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
     * 
     * @param spells the spell IDs to check
     * @return true if any of the spells are on CD, false if none is on CD
     */
    public boolean anyOnCD(int ... spells);
    
    /**
     * @return the current global cooldown in milliseconds
     */
    public int getGCD();
    
    /**
     * @return the current map ID
     */
    public int getCurrentMapID();
    
    /**
     * Get the movement handler instance.
     *  Use this to walk across the world
     * 
     * @return the movement handler instance
     */
    public Movement getMovement();
    
    /**
     * Get all units that are attacking the player
     * 
     * @return a list of units that are attacking the player
     */
    public List<Unit> getAttackers();
    
    /**
     * Get an instance of the player's inventory
     * 
     * @return the inventory of the player
     */
    public Inventory getInventory();
    
    /**
     * @return a 3D vector to the player's corpse
     */
    public Vector3f getCorpseLocation();
    
    /**
     * @deprecated A char command can be run with "type" of the keyboard class
     */
    @Deprecated
    public void runChatCommand(String command);
    
    /**
     * @return true if the player is dead or a ghost
     */
    public boolean isDeadOrGhost();
    
    /**
     * Get a random value between two given values
     * 
     * @param min the minimum random value
     * @param max the maximum random value
     * @return a random value between min and max
     */
    public int random(int min, int max);
    
    /**
     * Check if an object is still loaded
     * 
     * @param guid the GUID of the object
     * @return true if the object is still valid (loaded), false otherwise
     */
    public boolean hasObject(long guid);
    
    /**
     * Get the last UI error message of the wow-client. Like "spell not ready"
     * 
     * @return the message text or null if the stack is empty
     */
    public String getUIError();
    
    public static interface UIErrorListener {
        /**
         * Called whenever a UIError happens
         * @param message the error
         */
        public void error(String message);
    }
    
    /**
     * Register a listener that fires whenever a UIError happens 
     *
     * @param listener the listener instance to register
     */
    public void registerUIErrorListener(UIErrorListener listener);
    
    /**
     * Un-registers a UIErrorListener
     * 
     * @param listener the listener instance to un-register
     */
    public void unregisterUIErrorListener(UIErrorListener listener);
    
    /**
     * Get the current game tooltip contents
     * 
     * @returns the current tooltip contents, lines separated by \n
     */
    public String getTooltip();
    
    /**
     * Get the player's current combo points (Rogue/druid)
     * 
     * @returns the number of combopoints the current target has
     */
    public int getComboPoints();
    
    /**
     * Attempt to buy the specified item from the current vendor
     * 
     * @param itemName the name of the item to buy
     * @param times the amount of times to buy the item
     * @return if the bot was able to buy the items
     */
    public boolean buyItem(String itemName, int times);
    
    /**
     * Attempt to open the vendor window by clicking the specified unit
     *   This method will also walk through dialogue options like "I would like to browse your goods"
     * 
     * @param vendor the vendor to open
     * @return if the bot was able to open the vendor window
     */
    public boolean openVendor(Unit vendor);
    
    /**
     * Get the game version
     * 
     *  5875 = vanilla, 8606 = TBC  
     * 
     * @return the game version
     */
    public int getGameVersion();
    
    
}
