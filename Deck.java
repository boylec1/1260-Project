public class Deck
{
    private ArrayList<Card> cards;
    private int deckCapacity;
    private boolean[] isCardDealt;
    private int numberOfCards = 0;

    public Deck()
    {
        // default constructor
    }

    public Deck(int deckCapacity)
    {
        // Deck constructor sets deckCapacity to parameter
        this.deckCapacity = deckCapacity;
    }

    //getter for cards
    public ArrayList<Card> getCards()
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
        cards.add(card);
    }

    public void dealCard(int index)
    {
        //returns card at index if true
        isCardDealt[index] = true;
    }

    public void returnToDeck(int index)
    {
        // sets isCardDealt at an index to false
        isCardDealt[index] = false;
    }

    public void shuffleCards( Card cards)
    {
        //randomly shuffles cards in deck
    }

    public String toString()
    {
        // returns string output for deck

        for(int i = 0; i < cards.size(); i++)
        {
            System.out.println(cards.get(i));
            if(isCardDealt[i] == true)
            {
                System.out.println("This card has been played.");
            }
            else
            {
                System.out.println("This card is available to play.");
            }
            System.out.println();
        }

        return "";
    }
}
