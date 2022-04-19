# 1260-Project


The most recent build I've got (4/18/2022). Changes include:

Cutscene cleanup: I've gone through and added a bunch of cutscenes to take the place of dialog options elsewhere. Nothing has really been changed, just moved/consolidated to make it look cleaner. Lots of dialog in Enemy and DirectionChoice are now calls to Cutscene.java with their own methods.

Card choice: I've added a card chooser mechanic to the beginning of the game. Now instead of getting a completely random set of 10 cards, the player will choose 1 of 3 cards, 10 times. This gives our game some player agency, allows the player to have a hand in their own destiny. This (in my opinion) turns this from an interactive story to a card game.

Attributes have been quantified: Attributes now alter combat! Combat damage now takes them into affect. Viruses deal x2 damage EXCEPT against Antiviruses, Software provides a +1 attack, and Hardware provides a +1 defense. Data is currently set as base card value, no modifier. All of these values can change, I just kind of chose stuff to see if it worked.

Cutscenes have been put in the proper order. Had a few things out of order and it looked a little wonky, but it should all flow in the right order now.
