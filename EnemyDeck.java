import java.util.ArrayList;
import java.util.Collections;

public class EnemyDeck
{
    private ArrayList<Card> cards = new ArrayList<>();
    private int deckCapacity;
    private boolean[] isCardDealt;
    private int numberOfCards = 0;
    private int currentCard;

    public EnemyDeck()
    {
        for(int i = 0; i < 10; i++)
            {
                Card newCard = new Card();
                cards.add(newCard);
            }
        this.deckCapacity = cards.size();
        this.isCardDealt = new boolean[cards.size()];
        currentCard = 0;
    }

    public EnemyDeck(int manualDeckCapacity)
    {
        for(int i = 0; i < manualDeckCapacity; i++)
        {
            Card newCard = new Card();
            cards.add(newCard);
        }
        this.deckCapacity = cards.size();
        this.isCardDealt = new boolean[cards.size()];
        currentCard = 0;
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

    public Card getTopCard() {
        if (currentCard < deckCapacity)
        {
            isCardDealt[currentCard] = true;
            System.out.println(cards.get(currentCard));
            return (cards.get(currentCard++));
        }
        else
        {
            System.out.println("Out of cards\n");
            return null;
        }
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
        currentCard = 0;
    }
   
}
