package com.betterbot.api.pub;

/**
 * This class is used to register custom commands in the dev console.
 * @author Orea
 */
public interface Command {
    
    /**
     * This is the command processor interface, use it to implement the logic of your custom command
     */
    public static interface Processor {
        
        /**
         * Called when the command is run in the dev console
         * 
         * @param argv the arguments
         */
        public abstract void process(String argv);
        
        /**
         * @return the help page string
         */
        public abstract String getHelp();
        
        /**
         * @return the command usage
         */
        public abstract String getUsage();
    }
    
    /**
     * Registers a command in the dev console
     * 
     * @param command the command name
     * @param proc the command processor
     */
    public void registerCommand(String command, Processor proc);
    
}
