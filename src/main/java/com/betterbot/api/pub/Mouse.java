package com.betterbot.api.pub;

import java.awt.Point;

/**
 * This class is used to control the mouse.
 * 
 * @author Orea
 */
public interface Mouse {
    /**
     * Mouse over the specified object.
     * 
     * @param obj the object to mouse over 
     */
    public void mouseOver(GameObject obj);
    
    /**
     * Clicks the left mouse button.
     */
    public void leftClick();
    
    /**
     * Clicks the right mouse button.
     */
    public void rightClick();
    
    /**
     * Shift-right clicks the mouse
     */
    public void shiftRightClick();
    
    /**
     * Press the specified mouse button
     *  Example input: 
     *     MouseEvent.BUTTON1_MASK for left mouse button
     * @param mouse_event the event ID
     */
    public void press(int mouse_event);
    
    /**
     * Release the specified mouse button
     *  Example input: 
     *     MouseEvent.BUTTON1_MASK for left mouse button
     * @param mouse_event the event ID
     */
    public void release(int mouse_event);
    
    /**
     * Move the mouse to the specified coordinates.
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void moveTo(int x, int y);
    
    /**
     * Get the current mouse position
     * 
     * @return the mouse's current position
     */
    public Point getPos();

    public long getMouseoverGUID();
}
