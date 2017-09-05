package com.betterbot.api.pub;

import com.betterbot.api.pub.Unit;

/**
 *
 * @author Orea
 */
public interface RotationSolver {
    public void combat(Unit u); // called when the bot is already in combat and trying to kill the unit
    public void pull(Unit u); // called when the bot is not in combat and is trying to pull the unit
    public boolean combatEnd(Unit u); // return true if the bot should still wait before walking (Ex the solver is drinking)
    public int getPullDistance(Unit u); // get the max distance the bot can be before pulling the unit
    public void approaching(Unit u); // called when the bot is approeaching the target (feel free to cast spells here)
}
