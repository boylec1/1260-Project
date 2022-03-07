import java.util.Scanner;
public class Cutscene
{
    private String name;
    // Intro cutscene describing the setting and the goal of the player as well as the exterior of the castle
    public String cutscene1()
    {
        String  output= "\n" +
                "It is the year 3000— a time where there is no blue in the sky or green on the ground. \n"+
                "A time where the Earth is no longer suitable for living creatures.\n" +
                "All that remains in this world is a society of sentient machines ruled by the iron grip of the Bot Lord.\n"+
                "No one has ever seen the Bot Lord, but all have seen his evil army that constantly suppresses the good bots of this world.\n"+
                "\n\n"+
                "You awake from the pitch black of a deep slumber to a flash of light.\n"+
                "A loading screen appears in your vision that reads:\n"+
                "\n\n"+
                "----------Reboot Complete----------\n\n\n"+
                "Enter your name to access your mission: \n\n";

        return output;
    }

    public String enterName()
    {
        Scanner kb = new Scanner(System.in);
        this.name= kb.nextLine();

        String  output = "\n" +
                "Good morning,"+ this.name +". \n"+
                "You have been created to be the savior of all bots.\n" +
                "Your mission is to defeat the Bot Lord.\n" +
                "You will find him in the top level of his castle\n"+
                "Good luck, " +this.name+ ".\n"+
                "\n\n"+
                "The loading screen dissolves, and a scene morphs from the darkness"+
                "\n\n-----------------------------------";

        return output;
    }

    // Describing the castle interior after defeating the first boss
    public String cutscene2()
    {
        String  output = "\n" +
                "Having defeated the foe blocking your path, you journey forth. Pushing open the large wooden doors " +
                " to the castle, you intrepidly step inside.";
        return output;
    }

    // Describes entering the kitchen as well as intro to the kitchen boss
    public String cutscene3()
    {
        return "";
    }

    // Describes the office as well as the office boss
    public String cutscene4()
    {
        return "";
    }

    // Description of going upstairs and hallway
    public String cutscene5()
    {
        return "";
    }

    // Description of hallway leading to "Serverus" boss
    public String cutscene6()
    {
        return "";
    }

    // Description of final boss room and final boss
    public String cutscene7()
    {
        return "";
    }

    // Description of Filezilla boss
    public String specialCutscene1()
    {
        return "";
    }

    // Going left three times in hallway leads to consumable event
    public String specialCutscene2()
    {
        return "";
    }

    // End cutscene, "you've defeated the boss and saved the world yayy!!"
    public String endCutscene1()
    {
        return "";
    }
}
