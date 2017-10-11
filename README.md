# libBetterBot
BetterBot public library sources and builds

# Functional overview

## Main
Provides the functionality to „Report a problem“.

### Report a Problem
1.	Choose a good title
2.	Describe the problem as detailed as possible
3.	Send the report
4.	Open up an issue at Github (github.com/OreaDev/libBetterBot) with “Open Issue Tracker”, post the issue on the forum (forum.betterbot.org) or post your Report ID on discord (Discord invite: https://discordapp.com/invite/B4fQ3Aj)

## Performance
Configuration of performance related options. Throttle of the CPU, choose max FPS and select a pathfinding server

## Customization
Configuration of the ingame overlay. Size of the drawn lines, position of the object descriptions, keyboard layout (WIP), keybindings, level calculator. (FOV = Field of view -> Should be something like "position" I suppose)

## Developer
Options and functions for development purpose. Latency overview, pathing functions, starting the script server and more.

## Object Debug
Function to list up all currently loaded objects, NPCs, players, etc. and get detailed information about them.

## Test Scripts
### Grinder
Grinding script. Choose which enemies to fight with “BBMapper” and get a rotation profile as a JAR from the forum to run it. For detailed information follow this guide https://forum.betterbot.org/t/how-to-grind-a-guide-to-the-test-grinder/1017/2 (The “Tools (WIP)” button is for developing purpose at the moment).

### PVP Test
PvP related options to see a list of players that target the bot, team and enemy health bars and a message if a stealth enemy is targeting the bot.

### NodeWalk Test
Needs to be removed -> No functionality.

### Fisherman’s Friend
A fishing script. Set up a proper keybind and cast fishing once. The bot will take over and fish.

### NPC Finder
Currently part of the Grinder script Tools.

### Gatherer
A gathering script for ore and flowers. Create a list of what you want to farm and set up a route which the bot should take.

At this point you need to record a route yourself with the “Open Route Recorder” option.
-	Start: Start or resume recording
-	Stop: Stop or pause recording
-	Cut path: Remove the last bit of the recorded path
-	Save: Save the recorded route with the given name

Moreover you can set the script to “Grind Mode”. This will start the Grinder script and collect ores and flower while grinding.

### Adv. Object Debugger
Adds more details to each world object.

### Quest-o-Matic
A questing script. At this point it will complete the quests which are in the quest log and turn them in once all are done. You need to install the “TurnIn” addon, and setup a rotation profile in the “Combat Settings” tab.

## Colors
This tab will allow custom colors for lines and more (will become part of the "Customization" tab). No working functions yet.

## Dev Console
The console shows the current log and allows to perform custom commands (mostly for development/debugging purpose).
