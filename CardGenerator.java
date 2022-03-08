import java.util.*;

public class CardGenerator {

    // Fields
    private int cardAttack;
    private int cardDefense;
    private String cardAttribute;
    private String cardName;

    public CardGenerator(int cardAttack, int cardDefense, String cardAttribute, String cardName)
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
