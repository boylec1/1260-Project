import java.util.*;

public class Consumable
{
    // Field
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

    public void addConsumableCookie()
    {
        consumablePack.add("Cookie");
    }

    public void removeConsumableCookie()
    {
        consumablePack.remove("Cookie");
    }

    public void addConsumableJavaCoffee()
    {
        consumablePack.add("Java");
    }

    public void removeConsumableJavaCoffee()
    {
        consumablePack.remove("Java");
    }

    public void displayConsumables()
    {
        System.out.println("Consumables you have: ");
        for(String consumables : consumablePack)
        {
            System.out.println(consumables);
        }
    }
}