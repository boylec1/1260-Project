import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.*;

public class Deck
{
    private ArrayList<Card> cards = new ArrayList<>();
    private int deckCapacity;
    private boolean[] isCardDealt;
    private int numberOfCards = 0;
    private int currentCard;

    public Deck()
    {
        Object[] options = { "Card " + 1, "Card " + 2, "Card " + 3};
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Current deck size: " + cards.size() + "/10");
            System.out.println("Current deck: ");
            System.out.println(cards);

            Card card1 = new Card();
            System.out.println("Card Choice 1: ");
            System.out.println(card1);
            Card card2 = new Card();
            System.out.println("Card Choice 2: ");
            System.out.println(card2);
            Card card3 = new Card();
            System.out.println("Card Choice 3: ");
            System.out.println(card3);

            JPanel panel = new JPanel();
            panel.add(new JLabel("Please look at your console. Choose one of the three cards\n" +
                    " presented to add to your deck."));
            int result = JOptionPane.showOptionDialog(null, panel, "Pay attention! This is how you do things!",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);

            if(result == JOptionPane.YES_OPTION)
            {
                cards.add(card1);
                JOptionPane.showMessageDialog(null,"You have chosen Card Choice 1. You have "
                        + (10 - cards.size()) + " more selections to make.", "Card Added to Deck", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(result == JOptionPane.NO_OPTION)
            {
                cards.add(card2);
                JOptionPane.showMessageDialog(null,"You have chosen Card Choice 2. You have "
                        + (10 - cards.size()) + " more selections to make.", "Card Added to Deck", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(result == JOptionPane.CANCEL_OPTION)
            {
                cards.add(card3);
                JOptionPane.showMessageDialog(null,"You have chosen Card Choice 3. You have "
                        + (10 - cards.size()) + " more selections to make.", "Card Added to Deck", JOptionPane.INFORMATION_MESSAGE);
            }
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

    public void removeCard()
    {
        Collections.shuffle(cards);
        cards.remove(cards.size()-1);
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