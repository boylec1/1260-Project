import javax.swing.*;
import java.util.*;

public class Consumable
{

    // Field
    private String name = "";
    private String effect = "";
    private double damage;
    private int healing = 0;
    public ArrayList<String> consumablePack = new ArrayList<>();



    public void addConsumableBattery()
    {
        consumablePack.add("Battery Pack");
    }

    public void removeConsumableBattery()
    {
        consumablePack.remove("Battery Pack");
    }

    public void addConsumableCPU()
    {
        consumablePack.add("CPU Upgrade");
    }

    public void removeConsumableCPU()
    {
        consumablePack.remove("CPU Upgrade");
    }

    public void addConsumableHammer()
    {
        consumablePack.add("Hammer");
    }

    public void removeConsumableHammer()
    {
        consumablePack.remove("Hammer");
    }

    public void displayConsumables()
    {
        System.out.println("Consumables you have: ");
        for(String consumables : consumablePack)
        {
            System.out.println(consumables);
        }
    }


    public void consumableMenu(Deck playerDeck, EnemyDeck enemyDeck, int enemyHP, int playerHealth, Consumable consumable)
    {

    }

}