package com.betterbot.api.pub;

/**
 * This is a class used to work with 3D coordinates.
 * @author Orea
 */
public class Vector3f {
    
    public float x,y,z;
    Unit player;
    
    public Vector3f(Unit player, float x, float y, float z) {
        this.x=x;this.y=y;this.z=z;
        this.player = player;
    }
    
    public float getX() {
        return x;
    }
    public float getY(){
        return y;
    }
    public float getZ(){
        return z;
    }
    
    /**
     * Returns the vector's distance to the player
     * 
     * @return the vector's distance to the player
     */
    public float distance(){
        return this.dist();
    }
    
    public float dist(){
        return dist(player.getVector());
    }
    
    public float dist(Vector3f v){
        if(v == null) return -1;
        float dx = Math.abs(x-v.x), dy = Math.abs(y-v.y), dz = Math.abs(z-v.z);
        return (float) Math.sqrt(dx*dx+dy*dy/*+dz*dz*/);
    }
    
    /**
     * Returns the vector's distance to the object
     * 
     * @param obj the object
     * @return the distance to obj
     */
    public float distance(GameObject obj){
        return this.dist(obj.getVector());
    }
    
    @Override
    public String toString() {
        return ("Vector3f(") + x + (", ") + y + (", ") + z + (")");
    }
}