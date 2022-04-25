import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class Card
{
    private int cardAttack;
    private int cardDefense;
    private int fallenHeroes = 0;
    private String cardAttribute;
    private String cardName;

    public Card(int cardAttack, int cardDefense, String cardAttribute, String cardName)
    {
        this.cardAttack = cardAttack;
        this.cardDefense = cardDefense;
        this.cardAttribute = cardAttribute;
        this.cardName = cardName;
    }
    
    public Card()
    {
        Random generator = new Random();
        try
        {
            File readFile = new File("Nexthero.txt");
            if(readFile.exists()) {
                Scanner inputFile = new Scanner(readFile);
                ArrayList<String> attempts = new ArrayList<>();

                while (inputFile.hasNext()) {
                    attempts.add(inputFile.nextLine());
                }
                this.fallenHeroes = attempts.size();
            }

            this.cardAttack = (generator.nextInt(5) + 1) + fallenHeroes; // + the IO reader line count
            this.cardDefense = (generator.nextInt(5) + 1) + fallenHeroes; // + the IO reader line count
            this.cardAttribute = randomAttribute(generator.nextInt(5)+1);
            this.cardName = randomName();

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public String randomAttribute(int thePick)
    {

        String theAttribute = "";

        switch(thePick){
            case 1:
                theAttribute = "Virus    ";
                break;
            case 2:
                theAttribute = "Antivirus";
                break;
            case 3:
                theAttribute = "Data     ";
                break;
            case 4:
                theAttribute = "Software ";
                break;
            case 5:
                theAttribute = "Hardware ";
                break;
        }

        return theAttribute;
    }

    public String randomName()
    {
        Random generator = new Random();

        String[] names = { "Sarah", "Steve", "Nancy", "Shane", "Tommy", "Talan", "Quinn", "Allan", "Rocco", "Jared",
                "Nigel", "Silas", "Chase", "Ryder", "Ayaan", "Clark", "Lamar", "Lydia", "Macey", "Mylee", "Sanai",
                "Ellen", "Elyse", "Avery", "Joyce", "Noemi", "Kiana", "Tania", "Amari", "Dixie", "Mindy", "Jacky",
                "Marco", "Rufus", "Ramon", "Erick", "Robby", "Josey", "Wayne", "Irvin", "Holly", "Daryl", "Alice",
                "Renee", "Simon", "Jimmy", "Myron", "Sammy", "Sally", "Cesar", "Patty", "Isaac", "Kenny", "Tomas",
                "Hilda", "Chris", "Brent", "Wanda", "Lucia", "Lewis", "Nicky", "Felix", "Verna", "Merle", "Jamie",
                "Elias", "Clyde", "Mario", "Tonya", "Sandy", "Jorge", "Frank", "Julia", "Jaime", "Leona", "Casey",
                "Billy", "Molly", "Paula", "Traci", "Marie", "Sonja", "Byron", "Tammy", "Wilma", "Clint", "Brian",
                "Kelly", "David", "Elain", "Glenn", "Janis", "Viola", "Alvin", "Kerry", "Linda", "Pablo", "Perry",
                "Diana", "Barry"};

        String[] descriptors = {
                " the Destroyer               ", " the Breaker                 ", ", World-Ender                ",
                ", Habitual Sneezer           ", ", Mean Person                ", " the Litterer                ",
                " the Unyielding              ", ", Tested                     ", ", Wanderer                   ",
                " the Reckless                ", " the Worthy                  ", ", the Unwritten              ",
                ", Unrealized                 ", " the Somber                  ", " the Fearless                ",
                " the Graceful                ", ", Gentle Breeze              ", " the Terrible                ",
                ", Silent Wind                ", " the Eager                   ", " the Drunk                   ",
                ", Cynical One                ", " the Wretched                ", " the Borrower                ",
                " the Great                   ", " the Swanky                  ", " the Rabid                   ",
                ", Luckiest of All            ", " the Ancient                 ", " the Merciful                ",
                " the Spectacular             ", ", Erratic One                ", ", Wielder of Power           ",
                ", Sandwich-Wielder           ", " the Good                    ", " the Okay                    ",
                " the Bad                     ", " the Certain                 ", ", Adventurous One            ",
                ", Old-fashioned              ", " the Lacking                 ", ", Not So Lacking             ",
                " the Awesome                 "};

        String theName = names[generator.nextInt(names.length)] + descriptors[generator.nextInt(descriptors.length)];

        return theName;
    }

    public int getCardAttack()
    {
        return cardAttack;
    }

    public int getCardDefense()
    {
        return cardDefense;
    }

    public String getCardAttribute()
    {
        return cardAttribute;
    }

    public String getCardName()
    {
        return cardName;
    }

    public void setCardAttack(int attackValue)
    {
        this.cardAttack += attackValue;
    }

    public int getFallenHeroes() {
        return fallenHeroes;
    }

    public String toString()
    {
        String aCard = "";
        aCard += "========================================================\n";
        aCard += "|| Card Name:\t\t" + cardName + "||\n"; // need to be able to generate names, if we're going to have names
        aCard += "|| Attack Value:\t" + cardAttack + "\t\t\t\t\t\t\t\t  ||\n";
        aCard += "|| Defense Value:\t" + cardDefense + "\t\t\t\t\t\t\t\t  ||\n";
        aCard += "|| Special Action:\t" + cardAttribute + "\t\t\t\t\t\t  ||\n";
        aCard += "========================================================\n";

        return aCard;
    }
}
