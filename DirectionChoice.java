import java.util.*;

public class DirectionChoice
{
    public void directionChoice0()
    {
        // Choice of opening castle door or turning around and leaving
        Scanner kb = new Scanner(System.in);
        // Choice of opening castle door or turning around and leaving
        System.out.println("\nAs the Bot Lord's castle looms before you, you have a decision to make: enter, " +
                "or leave?");

        String choice = kb.nextLine();

        while(!choice.equalsIgnoreCase("enter") && !choice.equalsIgnoreCase("leave"))
        {
            System.out.println("That is not a valid choice. Time waits for no one; choose your fate.");
            choice = kb.nextLine();
        }

        if(choice.equalsIgnoreCase("enter"))
        {
            System.out.println("You steel yourself and push forward through the door of the castle. You" +
                    " resolve that the Bot Lord will see his end this day.");
            DirectionChoice initialDirection = new DirectionChoice();
            initialDirection.directionChoice1();
        }
        else
        {
            System.out.println("Your shoulders slump in resignation and fear. You turn toward " +
                    "the wasteland to meet a slow end. The Bot Lord will continue unopposed.\n");
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }
    public void directionChoice1()
    {
        // After entering the castle describe the hallways going
        // left and right and then ask player which direction to go
    }

    public void directionChoice2()
    {
        // Describe hallways going left and right and then ask player which direction to go
    }

    public void directionChoice3()
    {
        // Choice of going up the stairs past the defeated boss or look around the office
    }

    public void directionChoice4()
    {
        // Choice of going straight down long hallway, left down another hallway, or right towards a room
        // Left choice leads back to starting choice of left, straight, or right
    }

    public void directionChoice5()
    {
        // "Choice" of opening the final door to the boss
        // Not an actual choice because you have to fight the boss
    }
}
