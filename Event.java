import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
public class Event
{

    private boolean randomEvent;

    public Event(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        Random rand = new Random();
        this.randomEvent = rand.nextBoolean();

        //Randomizes event
        if (randomEvent == true)
        {

            JOptionPane.showMessageDialog(null,"You spot something on the ground and decide to" +
                            " pick it up!", "Ooooh what's that?"
                    , JOptionPane.WARNING_MESSAGE);

            ArrayList<String> pack = consumable.consumablePack;

            int randomConsumable= rand.nextInt(5)+1;

                switch(randomConsumable){
                    case 1:
                        JOptionPane.showMessageDialog(null,"It seems to be a hammer!"
                                , "Ooooh what's that?", JOptionPane.WARNING_MESSAGE);
                        if (pack.size()==3)
                        {
                            JOptionPane.showMessageDialog(null,"You try to put it in your backpack but\n"+
                                                "sadly find it is only big enough fit three items.\n"+
                                                "You leave it behind and continue on."
                                        , "Well that is unfortunate...", JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"You put it in your backpack and continue on."
                                    , "Score!", JOptionPane.WARNING_MESSAGE);
                            consumable.addConsumableHammer();
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"It seems to be a battery pack!"
                                , "Ooooh what's that?", JOptionPane.WARNING_MESSAGE);
                        if (pack.size()==3)
                        {
                            JOptionPane.showMessageDialog(null,"You try to put it in your backpack but\n"+
                                            "sadly find it is only big enough fit three items.\n"+
                                            "You leave it behind and continue on."
                                    , "Well that is unfortunate...", JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"You put it in your backpack and continue on."
                                    , "Score!", JOptionPane.WARNING_MESSAGE);
                            consumable.addConsumableBattery();
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"It seems to be an upgrade!"
                                , "Ooooh what's that?", JOptionPane.WARNING_MESSAGE);
                        if (pack.size()==3)
                        {
                            JOptionPane.showMessageDialog(null,"You try to put it in your backpack but\n"+
                                            "sadly find it is only big enough fit three items.\n"+
                                            "You leave it behind and continue on."
                                    , "Well that is unfortunate...", JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"You put it in your backpack and continue on."
                                    , "Score!", JOptionPane.WARNING_MESSAGE);
                            consumable.addConsumableCPU();
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"It seems to be a ________!"
                                , "Ooooh what's that?", JOptionPane.WARNING_MESSAGE);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"It seems to be a _________!"
                                , "Ooooh what's that?", JOptionPane.WARNING_MESSAGE);
                        break;
            }

        }
        else
        {
            int randomMinion= rand.nextInt(5)+1;
            Cutscene cutscene = new Cutscene();
            Enemy enemy = new Enemy();
            switch (randomMinion)
            {
                case 1:
                    cutscene.cutsceneDoormanMinion();
                    enemy.doormanMinion(playerDeck, playerHealth,consumable);
                    break;
                case 2:
                    cutscene.cutsceneChefMinion();
                    enemy.chefMinion(playerDeck, playerHealth,consumable);
                    break;
                case 3:
                    cutscene.cutsceneOfficeMinion();
                    enemy.officeMinion(playerDeck, playerHealth,consumable);
                    break;
                case 4:
                    cutscene.cutsceneFilezillaMinion();
                    enemy.filezillaMinion(playerDeck, playerHealth,consumable);
                    break;
                case 5:
                    cutscene.cutsceneServerusMinion();
                    enemy.serverusMinion(playerDeck, playerHealth,consumable);
                    break;
            }
        }
    }
}
