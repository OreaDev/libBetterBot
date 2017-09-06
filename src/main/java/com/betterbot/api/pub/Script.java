package com.betterbot.api.pub;

/**
 * This is the base script class, extend this to make your scripts.
 * @author Orea
 */
public abstract class Script {
    public BetterBot bot;
    
    /**
     * @param bot the instance of BetterBot used to work with the game
     */
    public Script(BetterBot bot){
        this.bot = bot;
    }
    
    /**
     * Called when the script should start
     */
    public abstract void start();
    
    /**
     * Called when the script should stop
     */
    public abstract void stop();
    
    /**
     * Called constantly, until 0 is returned
     * 
     * @return the amount of miliseconds to wait until running again, or 0 to stop 
     */
    public abstract int poll();
}
