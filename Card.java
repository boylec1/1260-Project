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
        String[] names = { "Jessica", "Dave", "Sarah", "Steve", "Nancy", "Ron" };
        String[] descriptors = { " the Destroyer", " the Breaker", ", World-Ender", ", Habitual Sneezer", ", Mean Person", " the Litterer" };

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
