import javax.swing.*;
import java.util.Random;
public class Event
{

    private boolean randomEvent;

    public Event()
    {
        Random rand = new Random();
        this.randomEvent = rand.nextBoolean();

        //Randomizes event
        if (randomEvent == true)
        {
            int randomConsumable= rand.nextInt(5)+1;
            Consumable consumable = new Consumable();

            JOptionPane.showMessageDialog(null,"You spot something on the ground and decide to" +
                            " pick it up!", "Event"
                    , JOptionPane.WARNING_MESSAGE);

                switch(randomConsumable){
                    case 1:
                        JOptionPane.showMessageDialog(null,"It seems to be a hammer!"
                                , "Event", JOptionPane.WARNING_MESSAGE);

                        consumable.addConsumableHammer();

                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"It seems to be a battery pack!"
                                , "Event", JOptionPane.WARNING_MESSAGE);

                        consumable.addConsumableBattery();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"It seems to be an upgrade!"
                                , "Event", JOptionPane.WARNING_MESSAGE);

                        consumable.addConsumableCPU();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"It seems to be a ________!"
                                , "Event", JOptionPane.WARNING_MESSAGE);
                        break;
            }

            JOptionPane.showMessageDialog(null,"You put it in your backpack", "Event"
                    , JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int randomMinion= rand.nextInt(6)+1;
            Consumable consumable = new Consumable();
            Cutscene cutscene = new Cutscene();
            Enemy enemy = new Enemy();
            switch (randomMinion)
            {
                case 1:
                    cutscene.cutsceneDoormanMinion();
                    enemy.doormanMinion();
                    break;
                case 2:
                    cutscene.cutsceneChefMinion();
                    break;
                case 3:
                    cutscene.cutsceneOfficeMinion();
                    break;
                case 4:
                    cutscene.cutsceneFilezillaMinion();
                    break;
                case 5:
                    cutscene.cutsceneServerusMinion();
                    break;
            }
        }

    }
}
