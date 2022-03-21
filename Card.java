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
    
    public void randomStats()
    {
        Random generator = new Random();
        
        this.cardAttack = generator.nextInt(5) + 1;
        this.cardDefense = generator.nextInt(5) + 1;
        
        // this is where we decide on attributes, will pull from a separate file of attributes randomly
        
        // this is where we decide on names, will pull from a separate file of names randomly
    }

    public String toString() 
    {
        String aCard = "";
        aCard += "Card Name: " + cardName; // need to be able to generate names, if we're going to have names
        aCard += "Attack Value: " + cardAttack;
        aCard += "Defense Value: " + cardDefense;
        aCard += "Special Action: " + cardAttribute;

        return aCard;
    }
}
