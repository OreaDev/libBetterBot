package com.betterbot.api.pub;

/**
 * This class is used to control the keyboard.
 * 
 * @author Orea
 */
public interface Keyboard {
    
    /**
     * Type the specified character.
     * 
     * @param c the character to type
     */
    public void type(char c);
    
    /**
     * Type the specified String.
     * 
     * @param s the string to type
     */
    public void type(String s);
    
    /**
     * Press the specified key
     * 
     * @param c the character to press
     */
    public void press(char c);
    
    /**
     * Release the specified key
     * 
     * @param c the character to release
     */
    public void release(char c);
    
    /**
     * Press the specified key.
     *  Example input:
     *    KeyEvent.VK_SHIFT for the shift key
     *    
     * @param key_event the KeyEvent to press
     */
    public void press(int key_event);
    
    /**
     * Release the specified key.
     *  Example input:
     *    KeyEvent.VK_SHIFT for the shift key
     *    
     * @param key_event the KeyEvent to release
     */
    public void release(int key_event);
    
    /**
     * This class is used to listen for a specified key press or release
     */
    public static interface KeyListener {
      
        /**
         * This method is called on a key press
         * 
         * @param key the jnativehook key ID
         * @param ckey the jnativehook key as char
         */
        public abstract void pressed(int key, char ckey);
        
        /**
         * This method is called on a key release
         * 
         * @param key the jnativehook key ID
         * @param ckey the jnativehook key as char
         */
        public abstract void released(int key, char ckey);
    }
    
    /**
     * Register a KeyListener to a keyboard.
     *  Create a KeyListener with "new KeyListener(){ //implement "pressed" and "released" here }
     */
    public void registerKeyListener(KeyListener listener);
    
    /**
     * Check if the bot is currently pressing the specified key
     * @param key the key to check
     * @return true if the key is being pressed by the bot
     */
    public boolean isKeyDown(char key);
    
}
