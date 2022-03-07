public class Card
{
    private String cardName;
    private int cardAttack;
    private int cardDefence;
    private String cardAction;

    public Card(String cardName, int cardAttack, int cardDefence, String cardAction)
    {
        this.cardName = cardName;
        this.cardAttack = cardAttack;
        this.cardDefence = cardDefence;
        this.cardAction = cardAction;
    }

    public String toString() 
    {
        String aCard = "";
        aCard += "Card Name: " + cardName; // need to be able to generate names, if we're going to have names
        aCard += "Attack Value: " + cardAttack;
        aCard += "Defense Value: " + cardDefence;
        aCard += "Special Action: " + cardAction;

        return aCard;
    }
}
