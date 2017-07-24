package jinny;

/**
 * Java's Incredibly Nice Native Yielder.
 *  This class is used to read memory from the game
 * @author Orea
 */
public class Jinny
{
    /**
     * Change the target process (Don't mess with this unless you know what you're doing!)
     *
     * @param p0 the process window name
     */
    public static native void setWindow(final String p0);
    
    /**
     * Read 1 integer (32 bits) from the specified address
     * @param p0 the address to read from
     * @return the integer found at p0
     */
    public static native int readInt(final int p0);
    
    /**
     * Read 1 byte (8 bits) from the specified address.
     * 
     * @param p0 the address to read from
     * @return the byte found at p0
     */
    public static native byte readByte(final int p0);
    
    /**
     * Read 1 long (64 bits) from the specified address.
     * 
     * @param p0 the address to read from
     * @return the long found at p0
     */
    public static native long readLong(final int p0);
    
    /**
     * Read 1 floating point (32 bits) from the specified address.
     * 
     * @param p0 the address to read from
     * @return the floating point found at p0
     */
    public static native float readFloat(final int p0);
    
    /**
     * Read 1 double (64 bits) from the specified address.
     * 
     * @param p0 the address to read from
     * @return the double found at p0
     */
    public static native double readDouble(final int p0);
    
    /**
     * Read 1 short (16 bits) from the specified address.
     * 
     * @param p0 the address to read from
     * @return the short found at p0
     */
    public static native short readShort(final int p0);
    
    /**
     * Read a string from the specified adress, up to the specified length
     * 
     * @param p0 the address to read from
     * @param p1 the maximum string length
     * @return the string
     */
    public static native String readString(final int p0, final int p1);
    
    /**
     * Get the window's position (Don't mess with this unless you know what you're doing!)
     * 
     * @return the window's position
     */
    public static native long getWindowPos();
}
