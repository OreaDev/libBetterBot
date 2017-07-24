/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betterbot.api.pub;

import java.awt.Graphics2D;

/**
 * This interface is used to paint to the ingame UI
 * @author Orea
 */
public interface Paint {
    
    /**
     * Called each frame
     * @param g the Graphics2D instance used for painting
     */
    abstract void paint(Graphics2D g);
}
