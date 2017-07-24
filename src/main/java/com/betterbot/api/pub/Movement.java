package com.betterbot.api.pub;

import java.util.List;

/**
 * This class is used to control movement of the player, including turning, path walking and pathfinding.
 * @author Orea
 */
public interface Movement {
    
    
    /**
     * Calculate paths between the nodes, stich the paths together and then walk along the result
     * @param nodes the nodes to path and walk between
     * @param dist the minimum distance before stopping
     */
    public void walkNodes(List<Vector3f> nodes, float dist);
    
    /**
     * Walk along the specified path
     * @param path the path to walk
     * @param dist the min distance
     */
    public void walkPath(List<Vector3f> path, float dist);
    
    public List<Vector3f> getPath(Vector3f from, Vector3f to);
    

    /**
     * Walk to the specified vector, within "dist."
     * 
     * @param target the vector to walk to
     * @param dist the minimum distance before stopping
     */
    public void walkTo(Vector3f target, float dist);
    
    
    public void nodeWalkTo(Vector3f target, float dist);
    public void enableFlightPaths(int map, int ... ids);
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
        * Return if the current path walk should be canceled.
        * 
        * @return if the path walk should be canceled
        */
        public boolean shouldCancel();
        
       /**
        * Runs if the path walk was canceled.
        * 
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
    
    public void cancel();
    
    public boolean isMoving();
    
}
