package com.betterbot.api.pub;

import java.awt.Graphics2D;

/**
 * This interface is used to paint to the ingame UI
 * @author Orea
 */
public interface Paint {
    
    /**
     * Called each frame
     * 
     * @param g the Graphics2D instance used for painting
     */
    abstract void paint(Graphics2D g);
}
