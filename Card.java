import java.util.Random;
public class Card
{
    private int cardAttack;
    private int cardDefense;
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
        
        this.cardAttack = generator.nextInt(5) + 1;
        this.cardDefense = generator.nextInt(5) + 1;
        this.cardAttribute = randomAttribute(generator.nextInt(5)+1);
        this.cardName = randomName();
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
        String theName = "Jake the Snake                    ";
        int theLuck = generator.nextInt(4);

        String[] names4 = { "Dave", "Adam", "Luca", "Cale", "Dane", "Troy", "Cody", "Chad", "Cora", "Riya", "Anne"};

        String[] names5 = { "Sarah", "Steve", "Nancy", "Shane", "Tommy", "Talan", "Quinn", "Allan", "Rocco", "Jared",
                "Nigel", "Silas", "Chase", "Ryder", "Ayaan", "Clark", "Lamar", "Lydia", "Macey", "Mylee", "Sanai",
                "Ellen", "Elyse", "Avery", "Joyce", "Noemi", "Kiana", "Tania", "Amari", "Dixie"};

        String[] names6 = { "Finley", "Jaydan", "Carlos", "Elijah", "Carter", "Oliver", "Izayah", "Ashton", "Landon",
                "Malaki", "Hudson", "Harley", "Sergio", "Damian", "Alfred", "Marisa", "Sarahi", "Esther", "Janiya",
                "Hannah", "Amiyah", "Dakota", "Bailey", "Kamila", "Summer", "London"};

        String[] names7 = { "Jessica", "Dashawn", "Tristen", "Beckett", "Gregory", "Krystal", "Jayleen", "Britney",
                "Addison", "Madelyn", "Isabell", "Brianna", "Ashlynn", "Cadence", "Haleigh", "Natalia", "Shannon",
                "Leticia"};

        String[] descriptors4 = {
                " the Destroyer                ", " the Breaker                  ", ", World-Ender                 ",
                ", Habitual Sneezer            ", ", Mean Person                 ", " the Litterer                 ",
                " the Unyielding               ", ", Tested                      ", ", Wanderer                    ",
                " the Reckless                 ", " the Worthy                   ", ", the Unwritten               ",
                ", Unrealized                  ", " the Somber                   ", " the Fearless                 ",
                " the Graceful                 ", ", Gentle Breeze               ", " the Terrible                 ",
                ", Silent Wind                 ", " the Eager                    ", " the Drunk                    ",
                ", Cynical One                 ", " the Wretched                 ", " the Borrower                 ",
                " the Great                    ", " the Swanky                   ", " the Rabid                    ",
                ", Luckiest of All             ", " the Ancient                  ", " the Merciful                 ",
                " the Spectacular              ", ", Erratic One                 ", ", Wielder of Power            ",
                ", Sandwich-Wielder            ", " the Good                     ", " the Okay                     ",
                " the Bad                      ", " the Certain                  ", ", Adventurous One             ",
                ", Old-fashioned               ", " the Lacking                  ", ", Not So Lacking              ",
                " the Awesome                  "};

        String[] descriptors5 = {
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

        String[] descriptors6 = {
                " the Destroyer              ", " the Breaker                ", ", World-Ender               ",
                ", Habitual Sneezer          ", ", Mean Person               ", " the Litterer               ",
                " the Unyielding             ", ", Tested                    ", ", Wanderer                  ",
                " the Reckless               ", " the Worthy                 ", ", the Unwritten             ",
                ", Unrealized                ", " the Somber                 ", " the Fearless               ",
                " the Graceful               ", ", Gentle Breeze             ", " the Terrible               ",
                ", Silent Wind               ", " the Eager                  ", " the Drunk                  ",
                ", Cynical One               ", " the Wretched               ", " the Borrower               ",
                " the Great                  ", " the Swanky                 ", " the Rabid                  ",
                ", Luckiest of All           ", " the Ancient                ", " the Merciful               ",
                " the Spectacular            ", ", Erratic One               ", ", Wielder of Power          ",
                ", Sandwich-Wielder          ", " the Good                   ", " the Okay                   ",
                " the Bad                    ", " the Certain                ", ", Adventurous One           ",
                ", Old-fashioned             ", " the Lacking                ", ", Not So Lacking            ",
                " the Awesome                "};

        String[] descriptors7 = {
                " the Destroyer             ", " the Breaker               ", ", World-Ender              ",
                ", Habitual Sneezer         ", ", Mean Person              ", " the Litterer              ",
                " the Unyielding            ", ", Tested                   ", ", Wanderer                 ",
                " the Reckless              ", " the Worthy                ", ", the Unwritten            ",
                ", Unrealized               ", " the Somber                ", " the Fearless              ",
                " the Graceful              ", ", Gentle Breeze            ", " the Terrible              ",
                ", Silent Wind              ", " the Eager                 ", " the Drunk                 ",
                ", Cynical One              ", " the Wretched              ", " the Borrower              ",
                " the Great                 ", " the Swanky                ", " the Rabid                 ",
                ", Luckiest of All          ", " the Ancient               ", " the Merciful              ",
                " the Spectacular           ", ", Erratic One              ", ", Wielder of Power         ",
                ", Sandwich-Wielder         ", " the Good                  ", " the Okay                  ",
                " the Bad                   ", " the Certain               ", ", Adventurous One          ",
                ", Old-fashioned            ", " the Lacking               ", ", Not So Lacking           ",
                " the Awesome               "};

        switch(theLuck) {
            case 1:
                theName = names4[generator.nextInt(names4.length)] + descriptors4[generator.nextInt(descriptors4.length)];
            case 2:
                theName = names5[generator.nextInt(names5.length)] + descriptors5[generator.nextInt(descriptors5.length)];
            case 3:
                theName = names6[generator.nextInt(names6.length)] + descriptors6[generator.nextInt(descriptors6.length)];
            case 4:
                theName = names7[generator.nextInt(names7.length)] + descriptors7[generator.nextInt(descriptors7.length)];
        }

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
        aCard += "========================================================\n";
        aCard += "|| Card Name:\t\t" + cardName + "||\n"; // need to be able to generate names, if we're going to have names
        aCard += "|| Attack Value:\t" + cardAttack + "\t\t\t\t\t\t\t\t  ||\n";
        aCard += "|| Defense Value:\t" + cardDefense + "\t\t\t\t\t\t\t\t  ||\n";
        aCard += "|| Special Action:\t" + cardAttribute + "\t\t\t\t\t\t  ||\n";
        aCard += "========================================================\n";

        return aCard;
    }
}
