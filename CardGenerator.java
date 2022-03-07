import java.util.*;

public class CardGenerator {

    // Fields
    private int cardAttack;
    private int cardDefense;
    private String defenseAttribute;
    private String cardName;

    public CardGenerator(int cardAttack, int cardDefense)
    {
        this.cardAttack = cardAttack;
        this.cardDefense = cardDefense;
        this.defenseAttribute.equals(defenseAttribute);
        this.cardName.equals(cardName);
    }

    public void randomStats()
    {
        Random generator = new Random();
        // Values are just fill-ins, we'll decided on actual values later when the game gets more built.
        this.cardAttack = generator.nextInt(5) + 1;
        this.cardDefense = generator.nextInt(5) + 1;
    }
    
    public void randomAttribute()
    {
        // this is where we decide on attributes, will pull from a separate file of attributes randomly
    }

    public void randomName()
    {
        // this is where we decide on names, will pull from a separate file of names randomly
        // something like a few dozen names/titles, numbered, use number generator to pull one
        // and assign it
    }

}
