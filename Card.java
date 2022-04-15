import java.util.Random;

public class Card
{
    private int cardAttack;
    private int cardDefense;
    private String cardAttribute;
    private String cardName;  
    
    public Card()
    {
        Random generator = new Random();
        
        this.cardAttack = generator.nextInt(5) + 1;
        this.cardDefense = generator.nextInt(5) + 1;
        this.cardAttribute = randomAttribute(generator.nextInt(5)+1);
        this.cardName = randomName();
    }
    
    public Card(int cardAttack, int cardDefense, String cardAttribute, String cardName)
    {
        this.cardAttack = cardAttack;
        this.cardDefense = cardDefense;
        this.cardAttribute = cardAttribute;
        this.cardName = cardName;
    }
    
    // This is a placeholder. I know we have the Enum for these, but I don't yet know how to randomize from Enums.
    public String randomAttribute(int thePick)
    {

        String theAttribute = "";

        switch(thePick){
            case 1:
                theAttribute = "Virus";
                break;
            case 2:
                theAttribute = "Antivirus";
                break;
            case 3:
                theAttribute = "Data";
                break;
            case 4:
                theAttribute = "Software";
                break;
            case 5:
                theAttribute = "Hardware";
                break;
        }

        return theAttribute;
    }
    
    // this is a placeholder. Might use Enums for this instead, but I still need to figure out how to randomize from them.
    public String randomName()
    {
        Random generator = new Random();
        
        String[] names = { "Jessica", "Dave", "Sarah", "Steve", "Nancy", "Ron", "Shane", "Adam", "Reginal", "Finley",
                "Luca", "Tommy", "Jaydan", "Talan", "Quinn", "Carlos", "Allan", "Cale", "Elijah", "Carter", "Oliver",
                "Rocco", "Jared", "Nigel", "Izayah", "Dashawn", "Ashton", "Dane", "Silas", "Landon", "Malaki", "Hudson",
                "Chase", "Harley", "Tristen", "Nathanial", "Sergio", "Troy", "Roderick", "Noe", "Cristian", "Ryder",
                "Kingston", "Ayaan", "Damian", "Beckett", "Cody", "Gregory", "Chad", "Alfred", "Ben", "Clark", "Lamar",
                "Krystal", "Marisa", "Sarahi", "Jayleen", "Lydia", "Macey", "Ada", "Britney", "Mylee", "Addison",
                "Sanai", "Kassandra", "Esther", "Janiya", "Hannah", "Alejandra", "Cora", "Amiyah", "Kiersten",
                "Madelyn", "Isabell", "Brianna", "Ashlynn", "Dakota", "Cadence", "Madelynn", "Riya", "Haleigh", "Ellen",
                "Elyse", "Anne", "Avery", "Joyce", "Bailey", "Noemi", "Maddison", "Kiana", "Natalia", "Kamila",
                "Shannon", "Tania", "Summer", "Amari", "Leticia", "London", "Dixie"};

        String[] descriptors = { " the Destroyer", " the Breaker", ", World-Ender", ", Habitual Sneezer",
                ", Mean Person", " the Litterer", " the Unyielding", ", Tested", ", Wanderer", " the Reckless",
                " the Worthy", ", the Unwritten", ", Unrealized", " the Somber", " the Fearless", " the Graceful",
                ", Gentle Breeze", " the Terrible", ", Silent Wind", " the Eager", " the Drunk", ", Cynical One",
                " the Wretched", ", Who Never Returns What They Borrow", " the Great", " the Swanky", " the Rabid",
                ", Luckiest of All", " the Ancient", " the Merciful", " the Spectacular", ", Erratic One",
                ", Wielder of Power", ", Wielder of Sandwiches", " the Good", " the Okay", " the Bad", " the Certain",
                ", Adventurous One", ", Old-fashioned", " the Lacking", ", Not So Lacking", " the Awesome"};

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

    public String toString() 
    {
        String aCard = "";
        aCard += "Card Name:\t\t" + cardName + "\n"; 
        aCard += "Attack Value:\t" + cardAttack + "\n";
        aCard += "Defense Value:\t" + cardDefense + "\n";
        aCard += "Special Action:\t" + cardAttribute + "\n";

        return aCard;
    }
}
