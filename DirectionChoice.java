import java.util.*;
import javax.swing.*;

public class DirectionChoice
{
    Cutscene cutscenes = new Cutscene();//can use cutscenes describing decision
    private Object[] options1 = { "Enter", "Leave"};
    private Object[] options2 = { "Left", "Right"};
    private Object[] options3 = { "Look Around", "Up the Stairs" };
    private Object[] options4 = { "Left", "Straight", "Right"};
    private Object[] options5 = { "Accept the Challenge", "Flee for your Life"};


    public void directionChoice0(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("As the Bot Lord's castle looms before you, you have a decision to make: enter" +
                " or leave?\n"));
        int result = JOptionPane.showOptionDialog(null, panel, "The choice looms...",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options1, null);

        if(result == JOptionPane.YES_OPTION)
        {
            // Boss Battle
            Cutscene.enterCastle();
            Enemy enemy = new Enemy();
            enemy.boss1(playerDeck, playerHealth, consumable);
            cutscenes.cutscene2();
        }
        else
        {
            // "Leave" option
            Cutscene.coward();
        }
    }
    public void directionChoice1(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Before you lies a great hallway lit only by the sparse crackling torches placed " +
                "few and far between.\n Will you travel down the hallways left path, or the right path?\n"));
        int result = JOptionPane.showOptionDialog(null, panel, "The choice looms...",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options2, null);

        if(result == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"You walk down the path to the left."
                    , "Ooh, they're going left.", JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,"You spot something on the ground and decide to" +
                    " pick it up!", "Event"
                    , JOptionPane.WARNING_MESSAGE);

            // Event
            consumable.addConsumableBattery();

            JOptionPane.showMessageDialog(null,"It seems to be a battery pack!"
                    , "Event", JOptionPane.WARNING_MESSAGE);

            JOptionPane.showMessageDialog(null, "You exit the room and continue down the hallway."
                    , "Onward!", JOptionPane.PLAIN_MESSAGE);

            // Or minion battle
            Enemy minion = new Enemy();
            minion.chefMinion(playerDeck, playerHealth, consumable);

            // Boss Battle
            cutscenes.cutscene3();
            Enemy enemy = new Enemy(); //You fight kitchen boss anyway but at least you got an item first
            enemy.boss2(playerDeck, playerHealth, consumable); //kitchen boss
        }
        else
        {
            // Boss Battle
            JOptionPane.showMessageDialog(null, "You walk down the path to the right."
                    , "To the right!", JOptionPane.PLAIN_MESSAGE);
            Enemy enemy = new Enemy();
            enemy.boss2(playerDeck, playerHealth, consumable); //kitchen boss
        }
    }

    public void directionChoice2(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Continuing on, you come to a \"T\" in the way. There are darkened hallways to " +
                "the left\n and the right of you. Where will you go, the left hall or the right hall?"));
        int result = JOptionPane.showOptionDialog(null, panel, "The choice looms...",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options2, null);

        if(result == JOptionPane.YES_OPTION)
        {
            // Event
            JOptionPane.showMessageDialog(null,"You spot something on the ground and decide to" +
                            " pick it up!", "Event"
                    , JOptionPane.WARNING_MESSAGE);

            consumable.addConsumableHammer();

            JOptionPane.showMessageDialog(null,"It seems to be a hammer!"
                    , "Event", JOptionPane.WARNING_MESSAGE);

            JOptionPane.showMessageDialog(null, "You exit the room and continue down the hallway."
                    , "The other way!", JOptionPane.PLAIN_MESSAGE);

            // Minion Battle
            Enemy minion = new Enemy();
            minion.officeMinion(playerDeck, playerHealth, consumable);

            // Boss Battle
            cutscenes.cutscene4();
            Enemy enemy = new Enemy();
            enemy.boss3(playerDeck, playerHealth, consumable);
        }
        else
        {
            // Boss Battle
            JOptionPane.showMessageDialog(null, "Fight Enemy", "Time to fight!"
                    , JOptionPane.PLAIN_MESSAGE);
            Enemy enemy = new Enemy();
            enemy.boss3(playerDeck, playerHealth, consumable);
        }
    }

    public void directionChoice3(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("With the boss sparking and ruined, peace settles into the room\n. What will you do" +
                ", look around or go up the stairs?"));
        int result = JOptionPane.showOptionDialog(null, panel, "The choice looms...",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options3, null);

        if(result == JOptionPane.YES_OPTION)
        {
            // Event
            JOptionPane.showMessageDialog(null,"You spot something on the ground and decide to" +
                            " pick it up!", "Event"
                    , JOptionPane.WARNING_MESSAGE);

            consumable.addConsumableCPU();

            JOptionPane.showMessageDialog(null,"It seems to be a CPU Upgrade!"
                    , "Event", JOptionPane.WARNING_MESSAGE);

            JOptionPane.showMessageDialog(null, "The room examined, you turn to up the stairs " +
                    "from before.", "Back on track!", JOptionPane.PLAIN_MESSAGE);

            // Minion Battle
            Enemy minion = new Enemy();
            minion.serverusMinion(playerDeck, playerHealth, consumable);

            // Boss Battle
            cutscenes.cutscene5();
            Enemy enemy = new Enemy();
            enemy.boss4(playerDeck, playerHealth, consumable);
        }
        else
        {
            // Boss Battle
            JOptionPane.showMessageDialog(null, "Fight Enemy", "Time to fight!"
                    , JOptionPane.PLAIN_MESSAGE);
            Enemy enemy = new Enemy();
            enemy.boss4(playerDeck, playerHealth, consumable);
        }
    }

    public void directionChoice4(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("After exiting the stairway, you find yourself riddled with choices\n. You can turn" +
                " down a hallway to the left, you can continue straight, or you can move towards a room to your " +
                "right.\n Which will you choose?"));
        int result = JOptionPane.showOptionDialog(null, panel, "The choice looms...",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options4, null);

        if(result == JOptionPane.YES_OPTION)
        {
            // Event
            JOptionPane.showMessageDialog(null,"Event", "PLACEHOLDER"
                    , JOptionPane.PLAIN_MESSAGE); // Possible event

            JOptionPane.showMessageDialog(null, "The room examined, you turn to up the stairs " +
                    "from before.", "Back on track!", JOptionPane.PLAIN_MESSAGE);


            // Boss Battle
            cutscenes.cutscene6();
            Enemy enemy = new Enemy();
            enemy.boss5(playerDeck, playerHealth, consumable);
        }
        else if(result == JOptionPane.NO_OPTION)
        {
            // Minion Battle
            Enemy minion = new Enemy();
            minion.filezillaMinion(playerDeck, playerHealth, consumable);

            // Boss Battle
            JOptionPane.showMessageDialog(null, "Fight Enemy", "Time to fight!"
                    , JOptionPane.PLAIN_MESSAGE);
            cutscenes.cutscene6();
            Enemy enemy = new Enemy();
            enemy.boss5(playerDeck, playerHealth, consumable);
        }
        else
        {
            // Boss Battle
            JOptionPane.showMessageDialog(null, "Fight Enemy", "Time to fight!"
                    , JOptionPane.PLAIN_MESSAGE);
            cutscenes.cutscene6();
            Enemy enemy = new Enemy();
            enemy.boss5(playerDeck, playerHealth, consumable);
        }
    }

    public void directionChoice5(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("You know that the Bot Lord resides behind this door. Your last challenge awaits.\n" +
                "The hopes of the world await. Will you accept this challenge, or will you cower and flee your duty?"));
        int result = JOptionPane.showOptionDialog(null, panel, "The choice looms...",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options5, null);

        if(result == JOptionPane.YES_OPTION)
        {
            // Final Boss Battle
            JOptionPane.showMessageDialog(null, "Final Boss Fight", "It's the boss!"
                    , JOptionPane.PLAIN_MESSAGE);
            cutscenes.cutscene7();
            Enemy enemy = new Enemy();
            enemy.finalBoss(playerDeck, playerHealth, consumable);
            cutscenes.cutsceneEnd();
        }
        else
        {
            // "Flee" option
            Cutscene.coward();
        }
    }
}
