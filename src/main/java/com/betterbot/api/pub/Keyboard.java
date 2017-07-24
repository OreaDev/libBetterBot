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
     * @param key_event the KeyEvent to press
     */
    public void press(int key_event);
    
    /**
     * Release the specified key.
     *  Example input:
     *    KeyEvent.VK_SHIFT for the shift key
     * @param key_event the KeyEvent to release
     */
    public void release(int key_event);
    
    public static interface KeyListener {
        public abstract void pressed(int key, char ckey);
        public abstract void released(int key, char ckey);
    }
    public void registerKeyListener(KeyListener listener);
    
}
