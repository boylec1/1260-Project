import java.util.Scanner;
import javax.swing.*;

public class Cutscene
{
    private String name;

    // Intro cutscene describing the setting and the goal of the player as well as the exterior of the castle
    public void cutscene1()
    {
        JOptionPane.showMessageDialog(null,"\n" +
                "It is the year 3000— a time where there is no blue in the sky or green on the ground. \n"+
                "A time where the Earth is no longer suitable for living creatures.\n" +
                "All that remains in this world is a society of sentient machines ruled by the iron grip of the Bot " +
                "Lord.\n No one has ever seen the Bot Lord, but all have seen his evil army that constantly " +
                "suppresses the good bots of this world.", "Really a bummer...", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "You awake from the pitch black of a deep slumber " +
                "to a flash of light.\n A loading screen appears in your vision", "Real-time UI overlay!"
                , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "----------Reboot Complete----------\n\n\n"+
                "Enter your name to access your mission", "Finally, someone showed up..."
                , JOptionPane.INFORMATION_MESSAGE);
    }

    public void enterName()
    {
        this.name = JOptionPane.showInputDialog("Enter your name to access your mission.");

        JOptionPane.showMessageDialog(null, "Good morning, "+ this.name +".\n"+
                "You have been created to be the savior of all bots.\n" +
                "Your mission is to defeat the Bot Lord.\n" +
                "You will find him in the top level of his castle\n", "Nice to meet you, " + this.name + "!"
                , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"The loading screen dissolves, and a scene morphs " +
                "from the darkness.", "Good luck!", JOptionPane.INFORMATION_MESSAGE);
    }

    // Describing the castle interior after defeating the first boss
    public void cutscene2()
    {
        JOptionPane.showMessageDialog(null,"\n" +
                "Having defeated the foe blocking your path, you journey forth.\n" +
                "Pushing open the large wooden doors to the castle, you intrepidly step inside.\n", "Phew, " +
                "that looked tough.", JOptionPane.INFORMATION_MESSAGE);
    }

    // Describes entering the kitchen as well as intro to the kitchen boss
    public void cutscene3()
    {
        JOptionPane.showMessageDialog(null, "\n" +
                "As you near the door at the end of the hall, you begin to smell the scent of fresh-baked cookies  \n" +
                "Intrigued, you push open the door and enter a large room adorned with marble counter-tops and dozens" +
                " of state of the art appliance bots.\n The Bot Lord obviously spared no expenses when it came to " +
                "his kitchen.\n\n", "Matching chrome, too!", JOptionPane.INFORMATION_MESSAGE);
    }

    // Describes the office as well as the office boss
    public void cutscene4()
    {
        JOptionPane.showMessageDialog(null, "The door creaks open to a scene of utter despair:" +
                " a clean, well-lit office space.\n You see row upon ordered-row of small desks made of faux wood," +
                " paired with small but ergonomic mesh chairs.\n Countless screens sit upon the desks, casting their " +
                "evil blue-tinted glows across the room.\n Fluorescent lighting bears down pon the space with a fury."
                , "You can just feel the monotony.", JOptionPane.INFORMATION_MESSAGE);
    }

    // Description of going upstairs and hallway
    public void cutscene5()
    {
        JOptionPane.showMessageDialog(null,"\n" +
                "After defeating the infamous Will, the computers suddenly started splitting apart.\n" +
                "The splitting of the computers reveal a dark and mysterious hallway.\n" +
                "As you travel down the hallway, a sudden flash of red light reveals a winding stairway.\n" +
                "Approaching the stairway, there is a low, growling sound coming from the top.\n" +
                "Walking upstairs, there is another hallway and the growling is getting louder.", "What a monster!"
                , JOptionPane.INFORMATION_MESSAGE);
    }

    // Description of hallway leading to "Serverus" boss
    public void cutscene6()
    {
        JOptionPane.showMessageDialog(null, "You continue your trek down the dark and eerie" +
                " hallway.\n You know that evil awaits as you slowly close in on the lair of Serverus.\n" +
                "You enter the dark and beaten cage of Serverus as he circles you, waiting to strike.","Scary!"
                , JOptionPane.INFORMATION_MESSAGE);
    }

    // Description of final boss room and final boss
    public void cutscene7()
    {
        JOptionPane.showMessageDialog(null, "As you continue past, your steps become heavy. " +
                "Your very shoes feel made of lead.\n After pausing to consider, you realize there is no magic or " +
                "technology doing this; it is simply fear.\n A fear born of knowing just what lays beyond the door " +
                "in front of you, the only path forward.", "Don't let it get to you!", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"You enter a large room filled with every kind of " +
                "tech known to you.\n The room is only lit by the lights of screens and buttons, and in the dim light" +
                " you see what you have come to defeat.\n", "This is it...", JOptionPane.WARNING_MESSAGE);
    }

    // Description of Doorman
    public static void cutsceneDoorman()
    {
        JOptionPane.showMessageDialog(null, "You spot a shadowy figure and halt in your tracks." +
                " As you approach you see a robotic doorman come into view.\nHe turns and spots you, lens eyes " +
                "widening and says, \"You there! Halt!\"", "The Doorman", JOptionPane.PLAIN_MESSAGE);
    }

    public static void cutsceneHeadChef()
    {
        JOptionPane.showMessageDialog(null, "The room falls silent as the chef and appliance " +
                "bots stop their work to look at you.\n The short, stocky bot that is sitting in the back of the " +
                "room munching on fresh micro-chips notices you after a few seconds of silence.\n He drops his food " +
                "and, as he turns to face you, you can see the text on his over sized chef's hat reading \"HEAD " +
                "CHEF\".\n\n \"You're not supposed to be here!!\"", "The Head Chef"
                , JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cutsceneOfficeManager()
    {
        JOptionPane.showMessageDialog(null, "Standing in front of an open door to a private " +
                "office is a large bot.\n Its polo shirt has pockets with pens sticking out, and its khakis are " +
                "well-pleated.\n\n It rushes forward shouting and waving TPS reports at you."
                , "No overtime, no overtime!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cutsceneServerus()
    {
        JOptionPane.showMessageDialog(null, "Serverus, the data dog, a watchful protector of " +
                "the BotLord grimaces at the sight of an overly optimistic challenger.\n" +
                " If you wish to achieve victory over the BotLord, you must first defeat Serverus."
                , "Yes, it has three heads.", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cutsceneFilezilla()
    {
        JOptionPane.showMessageDialog(null, "A large figure looms over you, and as you get a " +
                "closer look you see a large amalgamation of computers and screens\n" +
                ", all connected into the central point which you assume is the router.\n" +
                "It's large screens comes to life as it roars in a broken and glitched cry of rage."
                , "So evil...", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void cutsceneFinalBoss()
    {
        JOptionPane.showMessageDialog(null, "OH NO! It's the Bot Lord! Whatever shall you d..." +
                "oh. Probably play some cards. Right. Carry on, then."
                , "FINAL BOSS TIME!", JOptionPane.INFORMATION_MESSAGE);
    }

    // Going left three times in hallway leads to consumable event
    public void specialCutscene1()
    {
        JOptionPane.showMessageDialog(null, "In going left exactly three times, you start " +
                "feeling very lucky. You find an item!!"
                , "Left three times? Are you okay?", JOptionPane.PLAIN_MESSAGE);
    }

    // End cutscene, "you've defeated the boss and saved the world yayy!!"
    public void cutsceneEnd()
    {
        JOptionPane.showMessageDialog(null, "As the dust clears away, you see that you have " +
                "defeated the boss.\n You feel a sense of accomplishment wash over you as you know your journey " +
                "is over.\n YOU WIN!!!!!!!!!"
                , "What? They did it? EHEM, I mean, yeah, we knew you could do it!", JOptionPane.WARNING_MESSAGE);
    }

    // Battle Start
    public static void battleStart()
    {
        JOptionPane.showMessageDialog(null,"Battle Start", "Go get'em!"
                , JOptionPane.INFORMATION_MESSAGE);
    }

    // Battle Win
    public static void youWin()
    {
        JOptionPane.showMessageDialog(null,"You are victorious!", "We knew you could do it."
                , JOptionPane.PLAIN_MESSAGE);
    }

    // Game Over
    public static void gameOver()
    {
        JOptionPane.showMessageDialog(null, "You sway in place, weakness flooding your limbs.\n" +
                        "The room begins to blur and darken. As your life force fades, you think only of who may be\n" +
                        " the one to stop the Bot Lord. Your hope for the next is the last thing to leave you."
                , "We'll never forget you...whatever your name was. Hey, go fire up the next one!"
                , JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "GAME OVER!", "Buh-bye."
                , JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

    // FORGE YOUR DESTINY
    public static void enterCastle()
    {
        JOptionPane.showMessageDialog(null, "\nYou steel yourself and push forward through" +
                        " the door of the castle. You resolve that the Bot Lord will see his end this day."
                , "Huzzah!", JOptionPane.PLAIN_MESSAGE);
    }

    // Leave Option
    public static void coward()
    {
        JOptionPane.showMessageDialog(null, "\nYour shoulders slump in resignation and fear."+
                "You turn toward the wasteland to meet a slow end.\n " +
                "The Bot Lord will continue unopposed.\n", "BOO!", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"GAME OVER!", "Coward!"
                , JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

    // Fight an enemy
    public static void fightEnemy()
    {
        JOptionPane.showMessageDialog(null, "Fight Enemy", "Time to fight!"
                , JOptionPane.PLAIN_MESSAGE);
    }

    // Find consumable event
    public static void findConsumable()
    {
        JOptionPane.showMessageDialog(null,"After a brief search through the room\n" +
                "you turn over some broken furniture and find an item!", "It's shiny!", JOptionPane.PLAIN_MESSAGE);
    }

    public static void cutsceneDoormanMinion()
    {
        JOptionPane.showMessageDialog(null, "PLACEHOLDER DESCRIPTION"
                , "The Doorman's Minion", JOptionPane.PLAIN_MESSAGE);
    }

    public static void cutsceneChefMinion()
    {
        JOptionPane.showMessageDialog(null, "PLACEHOLDER DESCRIPTION"
                , "The Head Chef's Minion", JOptionPane.PLAIN_MESSAGE);
    }

    public static void cutsceneOfficeMinion()
    {
        JOptionPane.showMessageDialog(null, "PLACEHOLDER DESCRIPTION"
                , "The Office Manager's Minion", JOptionPane.PLAIN_MESSAGE);
    }

    public static void cutsceneFilezillaMinion()
    {
        JOptionPane.showMessageDialog(null, "PLACEHOLDER DESCRIPTION"
                , "Filezilla's Minion", JOptionPane.PLAIN_MESSAGE);
    }

    public static void cutsceneServerusMinion()
    {
        JOptionPane.showMessageDialog(null, "PLACEHOLDER DESCRIPTION"
                , "Serverus' Minion", JOptionPane.PLAIN_MESSAGE);
    }
}
