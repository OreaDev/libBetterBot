/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
         * @param argv the arguments
         */
        public abstract void process(String argv);
        
        /**
         * Get the command help page string
         * @return the help page string
         */
        public abstract String getHelp();
        
        /**
         * Get the command usage
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
