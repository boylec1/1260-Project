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


    public Consumable()
    {
        Random generator = new Random();

        this.name = randomName(generator.nextInt(4)+1);
        if (name.equals("Battery Pack"))
        {
            this.healing = generator.nextInt(5) + 1;
            this.effect = "Healing";
        }
        else if (name.equals("CPU Upgrade"))
        {
            this.damage = generator.nextInt(5)+1;
            this.effect = "Extra Damage";
        }
        else if(name.equals("Hammer"))
        {
            this.effect = "Smashes your enemies to pieces";
        }
        else
        {

        }
    }

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

    public String randomName(int thePick)
    {

        String theName = "";

        switch(thePick){
            case 1:
                theName = "Battery Pack";
                break;
            case 2:
                theName = "CPU Upgrade";
                break;
            case 3:
                theName = "Hammer";
                break;
            case 4:
                theName = "";
                break;
        }

        return theName;
    }

    public void consumableMenu(Deck playerDeck, EnemyDeck enemyDeck, int enemyHP, int playerHealth, Consumable consumable)
    {

    }

}