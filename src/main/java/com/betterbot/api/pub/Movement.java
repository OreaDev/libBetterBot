package com.betterbot.api.pub;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to control movement of the player, including turning, path walking and pathfinding.
 * @author Orea
 */
public interface Movement {    
    
    /**
     * Calculate paths between the nodes, stich the paths together and then walk along the result
     * 
     * @param nodes the nodes to path and walk between
     * @param dist the minimum distance before stopping
     */
    public void walkNodes(List<Vector3f> nodes, float dist);
    
    /**
     * Walk along the specified path
     * 
     * @param path the path to walk
     * @param dist the minimum distance
     */
    public void walkPath(List<Vector3f> path, float dist);
    
    /**
     * Get the path from one point to another
     * 
     * @param from the startposition
     * @param to the position to path to
     * @return a list of 3D vectors representing the path
     */
    public List<Vector3f> getPath(Vector3f from, Vector3f to);    

    /**
     * Walk to the specified vector, within "dist"
     * 
     * @param target the vector to walk to
     * @param dist the minimum distance before stopping
     */
    public void walkTo(Vector3f target, float dist);    
    
    /**
     * Walk to the specified path, within "dist" and use flightpaths and boats
     * 
     * @param target the destination to travel to
     * @param dist the minimum distance
     */
    public void nodeWalkTo(Vector3f target, float dist);
    
    /**
     * @deprecated The bot will handle this in a further version
     */
    @Deprecated
    public void enableFlightPaths(int map, int ... ids);
    
    /**
     * @deprecated The bot will handle this in a further version
     */
    @Deprecated
    public void initNodeGraph();
    
    /**
     * Walk to the specified object, within "dist."
     * 
     * @param target the object to walk to
     * @param dist the minimum distance before stopping
     */
    public void walkTo(GameObject target, float dist);
    
    /**
     * Turn to the specified vector, with the specified tolerance
     * 
     * @param target the vector to turn to
     * @param tol the tolerance (in degrees) 
     */
    public void turnTo(Vector3f target, float tol);
    
    /**
     * Turn to the specified object, with the specified tolerance
     * 
     * @param target the object to turn to
     * @param tol the tolerance (in degrees) 
     */
    public void turnTo(GameObject target, float tol);
    
    /**
     * Sets the path walk cancellation condition.
     *  This is used to determine when the path walk should be canceled
     * 
     * @param condition the Check instance to use
     */
    public void setCancelCondition(Check condition);
    
    public static interface Check {
        
       /**
        * @return true if the path walk should be canceled, false otherwise
        */
        public boolean shouldCancel();
        
       /**
        * Runs if the path walk was canceled.
        */
        public void cancelled();
    }
    
    public static Check NEVER = new Check() {
        @Override
        public boolean shouldCancel() {
            return false;
        }

        @Override
        public void cancelled() {
        }
    };
    
    /**
     * Cancel the current movement
     */
    public void cancel();
    
    /**
     * @return true if the bot is moving, false otherwise
     */
    public boolean isMoving();
    
    /**
     * Get a path to get some distance between a unit and the bot.
     *  It is called for hunters if their pet has aggro
     * 
     * @return a list of 3D vectors representing the path
     */
    public ArrayList<Vector3f> getBacktrackPath();
    
    /**
     * Get the angle (in degree) of a target compared to the bot.
     * 
     * @return -180 to 0 for a target on the lefthand of the bot and 0 to +180 for a target on the righthand
     */
    public float getTurnAngle(Vector3f target);
    
    /**
     * Set if the bot should walk backwards
     * 
     * @param walkBackwards if the bot should walk backwards
     */
    public void setWalkBackwards(boolean walkBackwards);
    
}
