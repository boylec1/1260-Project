import java.util.Scanner;
public class Cutscene
{
    private String name;
    // Intro cutscene describing the setting and the goal of the player as well as the exterior of the castle
    public void cutscene1()
    {
        System.out.println( "\n" +
                "It is the year 3000— a time where there is no blue in the sky or green on the ground. \n"+
                "A time where the Earth is no longer suitable for living creatures.\n" +
                "All that remains in this world is a society of sentient machines ruled by the iron grip of the Bot Lord.\n"+
                "No one has ever seen the Bot Lord, but all have seen his evil army that constantly suppresses the good bots of this world.\n"+
                "\n\n"+
                "You awake from the pitch black of a deep slumber to a flash of light.\n"+
                "A loading screen appears in your vision that reads:\n"+
                "\n\n"+
                "----------Reboot Complete----------\n\n\n"+
                "Enter your name to access your mission: \n");
    }

    public void enterName()
    {
        Scanner kb = new Scanner(System.in);
        this.name= kb.nextLine();

        System.out.println( "\n" +
                "Good morning,"+ this.name +". \n"+
                "You have been created to be the savior of all bots.\n" +
                "Your mission is to defeat the Bot Lord.\n" +
                "You will find him in the top level of his castle\n"+
                "Good luck, " +this.name+ ".\n"+
                "-----------------------------------\n\n"+
                "The loading screen dissolves, and a scene morphs from the darkness."+
                "\n");
    }

    // Describing the castle interior after defeating the first boss
    public String cutscene2()
    {
        String  output = "\n" +
                "Having defeated the foe blocking your path, you journey forth.\n" +
                "Pushing open the large wooden doors to the castle, you intrepidly step inside.\n";
        return output;
    }

    // Describes entering the kitchen as well as intro to the kitchen boss
    public void cutscene3()
    {
        System.out.println("\n" +
                "As you near the door at the end of the hall,  you begin to smell the scent of fresh-baked cookies  \n" +
                "Intrigued, you push open the door and enter a large room adorned with marble counter-tops and dozens of state of the art appliance bots.\n" +
                "The Bot Lord obviously spared no expenses when it came to his kitchen.\n\n");
    }

    // Describes the office as well as the office boss
    public void cutscene4()
    {
        System.out.println( "\n" +
                "The door creaks open to a scene of utter despair: a clean, well-lit office space. \n" +
                "You see row upon ordered-row of small desks made of faux wood, paired with small but ergonomic mesh chairs. \n" +
                "Countless screens sit upon the desks, casting their evil blue-tinted glows across the room. \n" +
                "Fluorescent lighting bears down upon the space with a fury.");

    }

    // Description of going upstairs and hallway
    public void cutscene5()
    {
        System.out.println("");;
    }

    // Description of hallway leading to "Serverus" boss
    public void cutscene6()
    {
        System.out.println("\n" +
                "You continue your trek down the dark and eerie hallway. \n" +
                "You know that evil awaits as you slowly close in on Serverus. \n" +
                "Serverus, the data dog, a watchful protector of the BotLord grimaces at the sight of an overly optimistic challenger. \n" +
                "You enter the dark and beaten cage of serverus as he circles you waiting to strike. \n" +
                "If you wish to achieve victory over the BotLord, you must first defeat Serverus.");
    }

    // Description of final boss room and final boss
    public void cutscene7()
    {
        System.out.println("You enter a large room filled with every kind of tech known to you.\n" + 
                "The room is only lit by the lights of screens and buttons, and in the dim light you see what you have come to defeat.\n" + 
                "DESCRIPTION OF FINAL BOSS CAUSE IDK WHO IT IS<3");
    }

    // Description of Filezilla boss
    public void specialCutscene1()
    {
        System.out.println("A large figure looms over you, and as you get a closer look you see a large amalgamation of computers and screens, all connected into the central point which you assume is the router.\n" +
                "It's large screens comes to life as it roars in a broken and glitched cry of rage.");
    }

    // Going left three times in hallway leads to consumable event
    public void specialCutscene2()
    {
        System.out.println("In going left exactly three times, you start feeling very lucky. You find an item!!");
    }

    // End cutscene, "you've defeated the boss and saved the world yayy!!"
    public void endCutscene1()
    {
        System.out.println("As the dust clears away, you see that you have defeated the boss\n" + "And you feel a sense of accomplishment wash over you as you know your journey is over\n" +
                "YOU WIN!!!!!!!!!");
    }

    // Game Over
    public static void gameOver()
    {
        System.out.println("You sway in place, weakness flooding your limbs. The room begins" +
                " to blur and darken. As your life force fades, you think only of who may be" +
                " the one to stop the Bot Lord. Your hope for the next is the last thing to " +
                " leave you.");

        System.out.println("=================================");
        System.out.println("===========GAME OVER=============");
        System.out.println("=================================");
        System.exit(0);
    }
}
