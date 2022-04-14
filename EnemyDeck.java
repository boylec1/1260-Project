public class EnemyDeck
{
    private ArrayList<Card> cards = new ArrayList<>();
    private int deckCapacity;
    private boolean[] isCardDealt;
    private int numberOfCards = 0;

    public void Deck()
    {
        for(int i = 0; i < 10; i++)
        {
            Card newCard = new Card();
            cards.add(newCard);
        }
        this.deckCapacity = cards.size();
        this.isCardDealt = new boolean[cards.size()];
    }

    public void enemyDeck(int manualDeckCapacity)
    {
        for(int i = 0; i < manualDeckCapacity; i++)
        {
            Card newCard = new Card();
            cards.add(newCard);
        }
        this.deckCapacity = cards.size();
        this.isCardDealt = new boolean[cards.size()];
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
    public void shuffleCards()
    {
        Collections.shuffle(cards);
    }
   
}
