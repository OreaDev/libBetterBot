package com.betterbot.api.pub;

import java.util.ArrayList;

/**
 *
 * @author Orea
 */
public interface Database {
    
    public static enum Type {
        UNIT, 
        OBJECT
    }
    
    public static class FlightMaster {
        public Vector3f location; 
        public String name;
    }
    
    public ArrayList<Vector3f> getSpawns(Type t, int ... ids);
    public ArrayList<Vector3f> getSpawns(Type t, String ... names);
    
    
    
    
    
    /* not yet implemented */
    public int getID(Type t, String name);
    public String getName(Type t, int id);
    /* not yet implemented */
    
    public FlightMaster getNearestFlightMaster();
    
    /**
    * Get the internal DBC taxi ID for the given target name
    *
    * @return the flight ID (used by Movement.enableFlightPaths)
    */
    public int getFlightIDForName(String name);
    
}
