public class Card
{
    private int cardAttack;
    private int cardDefence;
    private String cardAttribute;
    private String cardName;

    public Card(int cardAttack, int cardDefence, String cardAttribute, String cardName)
    {
        this.cardAttack = cardAttack;
        this.cardDefence = cardDefence;
        this.cardAction = cardAttribute;
        this.cardName = cardName;
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
