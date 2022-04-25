
import java.util.Random;

public class EnemyCard extends Card{

    private int enemyCardAttack;
    private int enemyCardDefense;
    private String enemyCardAttribute;
    private String enemyCardName;

    public EnemyCard(int cardAttack, int cardDefense, String cardAttribute, String cardName)
    {
        this.enemyCardAttack = cardAttack;
        this.enemyCardDefense = cardDefense;
        this.enemyCardAttribute = cardAttribute;
        this.enemyCardName = cardName;
    }

    public EnemyCard()
    {
        Random generator = new Random();

        this.enemyCardAttack = (generator.nextInt(8) + 3); // + the IO reader line count
        this.enemyCardDefense = (generator.nextInt(8) + 3); // + the IO reader line count
        this.enemyCardAttribute = randomEnemyAttribute(generator.nextInt(5)+1);
        this.enemyCardName = randomEnemyName();
    }

    public String randomEnemyAttribute(int thePick)
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

    public String randomEnemyName()
    {
        Random generator = new Random();

        String[] names = { "Sarah", "Steve", "Nancy", "Shane", "Tommy", "Talan", "Quinn", "Allan", "Rocco", "Jared",
                "Nigel", "Silas", "Chase", "Ryder", "Ayaan", "Clark", "Lamar", "Lydia", "Macey", "Mylee", "Sanai",
                "Ellen", "Elyse", "Avery", "Joyce", "Noemi", "Kiana", "Tania", "Amari", "Dixie", "Mindy", "Jacky",
                "Marco", "Rufus", "Ramon", "Erick", "Robby", "Josey", "Wayne", "Irvin", "Holly", "Daryl", "Alice",
                "Renee", "Simon", "Jimmy", "Myron", "Sammy", "Sally", "Cesar", "Patty", "Isaac", "Kenny", "Tomas",
                "Hilda", "Chris", "Brent", "Wanda", "Lucia", "Lewis", "Nicky", "Felix", "Verna", "Merle", "Jamie",
                "Elias", "Clyde", "Mario", "Tonya", "Sandy", "Jorge", "Frank", "Julia", "Jaime", "Leona", "Casey",
                "Billy", "Molly", "Paula", "Traci", "Marie", "Sonja", "Byron", "Tammy", "Wilma", "Clint",
                "Brian", "Kelly", "David", "Elain", "Glenn", "Janis", "Viola", "Alvin", "Kerry", "Linda", "Pablo",
                "Perry", "Diana", "Barry"};

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

    public int getEnemyCardAttack()
    {
        return enemyCardAttack;
    }

    public int getEnemyCardDefense()
    {
        return enemyCardDefense;
    }

    public String getEnemyCardAttribute()
    {
        return enemyCardAttribute;
    }

    public String getEnemyCardName()
    {
        return enemyCardName;
    }

    public void setEnemyCardAttack(int attackValue)
    {
        this.enemyCardAttack += attackValue;
    }

    public String toString()
    {
        String enCard = "";
        enCard += "========================================================\n";
        enCard += "|| Card Name:\t\t" + enemyCardName + "||\n"; // need to be able to generate names, if we're going to have names
        enCard += "|| Attack Value:\t" + enemyCardAttack + "\t\t\t\t\t\t\t\t  ||\n";
        enCard += "|| Defense Value:\t" + enemyCardDefense + "\t\t\t\t\t\t\t\t  ||\n";
        enCard += "|| Special Action:\t" + enemyCardAttribute + "\t\t\t\t\t\t  ||\n";
        enCard += "========================================================\n";

        return enCard;
    }
}
