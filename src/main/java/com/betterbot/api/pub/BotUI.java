package com.betterbot.api.pub;

import java.awt.Point;
import javax.swing.JComponent;

/**
 * This class is used to interact with the bot UI, and to add new components to it
 * @author Orea
 */
public interface BotUI {
    
    /**
     * Add a paint to the specified layer
     * 
     * @param p the paint to add
     * @param layer the layer to add the paint to
     */
    public void addPaint(Paint p, int layer);
    
    /**
     * Add a window to the overlay
     * 
     * @param title the title of the window
     * @param panel the window
     */
    public void addWindow(String title, JComponent panel);
    
    /**
     * Add a tab to the main bot window
     * 
     * @param title the tab title
     * @param panel the tab
     */
    public void addTab(String title, JComponent panel);
    
    /**
     * Remove a tab from the main bot window
     * 
     * @param panel the tab to remove
     */
    public void removeTab(JComponent panel);
    
    /**
     * Remove a window from the overlay
     * 
     * @param panel the window to remove
     */
    public void removeWindow(JComponent panel);
    
    /**
     * Remove a paint from the specified layer
     * 
     * @param p the paint to remove
     * @param layer the layer to remove from
     */
    public void removePaint(Paint p, int layer);
    
    /**
     * Translate the specified world coordiantes into 2D on-screen for rendering
     * 
     * @param x the x coordiante
     * @param y the y coordiante
     * @param z the z coordiante
     * @return the 2D on-screen point
     */
    public Point translate(float x, float y, float z);
    
    /**
     * Translate the specified vector into 2D on-screen for rendering
     * 
     * @param v the vector to translate
     * @return the 2D on-screen point
     */
    public Point translate(Vector3f v);
    
    /**
     * Draws a string in the BetterBot font
     * 
     * @param s the text to draw
     * @param x the x coordinate to start drawing
     * @param y the y coordinate to start drawing
     */
    public void drawBitmapString(String s, int x, int y);
    
    /**
     * Draws a string in the BetterBot font
     * 
     * @param s the text to draw
     * @param x the x coordinate to start drawing
     * @param y the y coordinate to start drawing
     * @param alpha the transparency (0-255)
     */
    public void drawBitmapString(String s, int x, int y, int alpha);
    
    /**
     * Close the main UI windows
     */    
    public void closeMainWindow();
    
    /**
     * Set a marker point on the screen (for world objects e.g.)
     * 
     * @param text the description of the marker
     * @param x the x coordiante
     * @param y the y coordiante
     * @param z the z coordiante
     */
    public void setMarker(String text, float x, float y, float z);
    
    /**
     * Remove all set markers
     */
    public void clearMarker();
    
}
