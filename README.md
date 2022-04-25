# 1260-Project
Repository for our group project files

Main Branch is current as of 4/25 10:22 AM. 

Consumables have been added and work.

JOptionPane is now standard across the files for dialogue; combat and deck building use console (intentional).

Minions and Minion cutscenes added. Currently have a few scattered into the DirectionChoice.java flow, but they're meant to be random. 

Names in Card.java have been standardized at 5 characters so we can have the consistent card shape in the console while not needing a base card name. For some reason that wasn't working, so I just expanded the 5-character names list and got rid of the rest. 

Events are randomized so you either get a random item or fight a random minion.

Consumables have been changed so a player is only asked when they actually have consumables. Max number of consumables allowed increased. Additional consumables have been written in.

Cutscenes have all been made static, method calls for them have been updated and Cutscene object creations have been removed (not needed anymore).

Roguelike moved to it's own separate branch so we have two versions of the game.
