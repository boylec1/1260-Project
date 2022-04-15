import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private ArrayList<Card> cards = new ArrayList<>();
    private int deckCapacity;
    private boolean[] isCardDealt;
    private int numberOfCards = 0;
    private int currentCard;

    public Deck()
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

    public Deck(int manualDeckCapacity)
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

    public String toString()
    {
        // returns string output for deck

        for(int i = 0; i < cards.size(); i++)
        {
            System.out.println("Card Number:\t" + (i));
            System.out.println(cards.get(i));
            if(isCardDealt[i])
            {
                System.out.println("This card has been played.");
            }
            else
            {
                System.out.println("This card is available to play.");
            }
            System.out.println("======================");
        }

        return "";
    }
}
