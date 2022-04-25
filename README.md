# 1260-Project
Repository for our group project files

Main Branch is current as of 4/24 8:38 PM. 

Consumables have been added and work.

JOptionPane is now standard across the files for dialogue; combat and deck building use console (intentional).

Minions and Minion cutscenes added. Currently have a few scattered into the DirectionChoice.java flow, but they're meant to be random. 

Names in Card.java have been standardized at 5 characters so we can have the consistent card shape in the console while not needing a base card name. For some reason that wasn't working, so I just expanded the 5-character names list and got rid of the rest. 

Events are randomized so you either get a random item or fight a random minion

Player cards will now power up based on previous failed attempts. Each prior attempt that ended in a player reduced to zero HP (i.e. Cutscene.coward doesn't count) adds 1 to the attack and defense value of the cards generated for the player. Appropriate flavor text has also been added ("Name" is saved in the text file when a player loses, and a popup shows how many powerups a player is getting during deck creation).

Because of this, I also created a new class, EnemyCard, for the enemy cards. This way they do not also scale with the failed attempts during card creation.

While this is cool, I noticed that it scales FAST. Because of this, I also changed the enemy card attack/defense generation to make them a bit beefier. The consequence of this is that early runs are more likely to fail (and like, REALLY fail), but after about 3-4 runs, the player begins to catch up and take over. This can obviously be tweaked, but I think nearly ensuring failure for the first 1-2 runs isn't so bad with the addition of this mechanic.

Another possible idea I had was to also scale the enemy cards off failed attempts, but at a different rate. So maybe the enemy cards scale at half the rate player cards do. This would be instead of the scalar I gave them (or maybe just knock the scalar down a bit and do this). 
