package com.betterbot.api.pub;

import java.awt.Point;

/**
 * This class is used to represent in-game UIFrames.
 *  These include any UI element in the base game and that are added by addons.
 *  it has various functions to get information about the frame, and to interact with the frame
 * @author Orea
 */
public interface Frame {
    
    /**
     * Returns the position of this frame.
     *  the top left most pixel of the frame
     * 
     * @return the frame position
     */
    public Point getPos();
    
    /**
     * Returns the size of this frame.
     * 
     * @return the frame size
     */
    public Point getSize();
    
    /**
     * Returns if this frame is currently being shown
     * 
     * @return true if the frame is visible, false if not
     */
    public boolean isShowing();
    
    /**
     * Left clicks this frame.
     * 
     */
    public void leftClick();
    
    /**
     * Right clicks this frame.
     * 
     */
    public void rightClick();
    
    /**
     * Get the contents of this frame
     * @return the contents
     */
    public String getContents();
}
