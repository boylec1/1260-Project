public class Deck
{
    private Card[] cards;
    private int deckCapacity;
    private boolean[] isCardDealt;
    private int numberOfCards;

    public Deck()
    {
        // default constructor
    }

    public Deck(int deckCapacity)
    {
        // Deck constructor sets deckCapacity to parameter
    }

    //getter for cards
    public Card[] getCards()
    {
        return this.cards;
    }

    //getter for deckCapacity
    public int getDeckCapacity()
    {
        return this.deckCapacity;
    }

    //getter for isCardDealt
    public boolean[] getIsCardDealt()
    {
        return this.isCardDealt;
    }

    //getter for numberOfCards
    public int getNumberOfCards()
    {
        return this.numberOfCards;
    }

    public void add(Card card)
    {
        //adds a card to the number of cards in the deck
    }

    public Card deal(int index)
    {
        //returns card at index if true
        return this.cards[index];
    }

    public void returnToDeck(int index)
    {
        // sets isCardDealt at an index to false
    }

    public void shuffleCards( Card cards)
    {
        //randomly shuffles cards in deck
    }

    public String toString()
    {
        // returns string output for deck
        return "";
    }
}
