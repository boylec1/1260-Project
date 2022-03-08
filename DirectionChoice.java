import java.util.*;

public class DirectionChoice
{
    public void directionChoice0()
    {
        // Choice of opening castle door or turning around and leaving
        Scanner kb = new Scanner(System.in);
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
            Enemy enemy = new Enemy();
            enemy.boss1();
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
        Scanner kb = new Scanner(System.in);
        System.out.println("Before you lies a great hallway lit only by the sparse crackling torches placed " +
                "few and far between. Will you travel down the hallways left path, or the right path?");

        String choice = kb.nextLine();

        while(!choice.equalsIgnoreCase("left") && !choice.equalsIgnoreCase("right"))
        {
            System.out.println("That is not a valid choice. Time waits for no one; choose your fate.");
            choice = kb.nextLine();
        }

        if(choice.equalsIgnoreCase("left"))
        {
            System.out.println("Event");
            //Event event = new Event();
            //event.event1();
        }
        else
        {
            System.out.println("Fight Enemy");
            //Enemy enemy = new Enemy();
            //enemy.boss2();
        }
    }

    public void directionChoice2()
    {
        // Describe hallways going left and right and then ask player which direction to go
        Scanner kb = new Scanner(System.in);
        System.out.println("");

        String choice = kb.nextLine();

        while(!choice.equalsIgnoreCase("left") && !choice.equalsIgnoreCase("right"))
        {
            System.out.println("That is not a valid choice. Time waits for no one; choose your fate.");
            choice = kb.nextLine();
        }

        if(choice.equalsIgnoreCase("right"))
        {
            System.out.println("Event");
            //Event event = new Event();
            //event.event2();
        }
        else
        {
            System.out.println("Fight Enemy");
            //Enemy enemy = new Enemy();
            //enemy.boss3();
        }
    }

    public void directionChoice3()
    {
        // Choice of going up the stairs past the defeated boss or look around the office
        Scanner kb = new Scanner(System.in);
        System.out.println("");

        String choice = kb.nextLine();

        while(!choice.equalsIgnoreCase("up") && !choice.equalsIgnoreCase("look around"))
        {
            System.out.println("That is not a valid choice. Time waits for no one; choose your fate.");
            choice = kb.nextLine();
        }

        if(choice.equalsIgnoreCase("look around"))
        {
            System.out.println("Event");
            //Event event = new Event();
            //event.event3();
        }
        else
        {
            System.out.println("Fight Enemy");
            //Enemy enemy = new Enemy();
            //enemy.boss4();
        }
    }

    public void directionChoice4()
    {
        // Choice of going straight down long hallway, left down another hallway, or right towards a room
        // Left choice leads back to starting choice of left, straight, or right
        Scanner kb = new Scanner(System.in);
        System.out.println("");

        String choice = kb.nextLine();

        while(!choice.equalsIgnoreCase("left") && !choice.equalsIgnoreCase("right") &&
                !choice.equalsIgnoreCase("straight"))
        {
            System.out.println("That is not a valid choice. Time waits for no one; choose your fate.");
            choice = kb.nextLine();
        }

        if(choice.equalsIgnoreCase("left"))
        {
            System.out.println("Special Event");
            //Event event = new Event();
            //event.specialEvent1();
        }
        else if (choice.equalsIgnoreCase("right"))
        {
            System.out.println("Event");
            //event.event4();
        }
        else
        {
            System.out.println("Fight Enemy");
            //Enemy enemy = new Enemy();
            //enemy.boss5();
        }
    }

    public void directionChoice5()
    {
        // "Choice" of opening the final door to the boss
        // Not an actual choice because you have to fight the boss
        Scanner kb = new Scanner(System.in);
        System.out.println("");

        String choice = kb.nextLine();

        while(!choice.equalsIgnoreCase("enter") && !choice.equalsIgnoreCase("leave"))
        {
            System.out.println("That is not a valid choice. Time waits for no one; choose your fate.");
            choice = kb.nextLine();
        }

        if(choice.equalsIgnoreCase("enter"))
        {
            System.out.println("Final Boss Fight");
            //Enemy enemy = new Enemy();
            //enemy.finalBoss1();
        }
        else
        {
            System.out.println("You turn around, body trembling with fear as you trudge away from the final door. " +
                    "You disappear into the wasteland never to be seen again. The Bot Lord will continue unopposed.\n");
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }
}
