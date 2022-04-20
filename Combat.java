import javax.swing.*;
import java.util.*;

public class Combat {

    // Fields
    private int playerHealth = 10;
    private int enemyHealth = 10;
    private int turnCount = 1;

    private int attackInput;
    private int defenseInput;
    private String attackAttribute;
    private String defenseAttribute;

    private Object[] options = {"What have I got?", "Nah, let's get this over with."};

    public Combat(Deck playerDeck, EnemyDeck enemyDeck, int enemyHP, int playerHP)
    {
        boolean winCondition = false;
        this.playerHealth = playerHP;
        this.enemyHealth = enemyHP;
        //consumable
        int result = JOptionPane.showOptionDialog(null, "Would You like to use an item?",
                "~Backpack~Backpack~", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, null);
        if(result == JOptionPane.YES_OPTION)
        {
            Consumable consumable = new Consumable();
        }
        // display current health
        JOptionPane.showMessageDialog(null, currentHealth(), "Fight to the death!"
                , JOptionPane.INFORMATION_MESSAGE);

        // shuffles both decks
        JOptionPane.showMessageDialog(null, "Decks Shuffled", "Fight to the death!"
                , JOptionPane.INFORMATION_MESSAGE);

        playerDeck.shuffleCards();
        enemyDeck.shuffleCards();


        // combat loop
        do {
            // Turn counter
            System.out.println("\n==============");
            System.out.println("|   Turn " + this.turnCount + "   |");
            System.out.println("==============");

            // insert options here
            // i.e. option to use consumables

            // deals top card of each deck
            JOptionPane.showMessageDialog(null, "Deal!", "Turn " + this.turnCount
                    , JOptionPane.INFORMATION_MESSAGE);

            System.out.println("\nDeal!\n");

            System.out.print("Your card:\n");
            Card topCard = playerDeck.getTopCard();
            System.out.print("Enemy card:\n");
            Card enemyTopCard = enemyDeck.getTopCard();

            // win condition if no more cards
            if (topCard == null || enemyTopCard == null)
            {
                if (enemyHealth < playerHealth)
                {
                    Cutscene.youWin();
                    break;
                }
                else if (playerHealth == enemyHealth)
                {
                    Cutscene.youWin();
                    break;
                }
                else if (playerHealth < enemyHealth)
                {
                    Cutscene.gameOver();
                }
            }

            int cardAttack = topCard.getCardAttack();
            int cardDefense = topCard.getCardDefense();
            int enemyCardAttack = enemyTopCard.getCardAttack();
            int enemyCardDefense = enemyTopCard.getCardDefense();

            int playerDamage, enemyDamage;

            // Player damage calculations
            if(topCard.getCardAttribute().trim().equals("Virus") && !enemyTopCard.getCardAttribute().trim().equals("Antivirus"))
            {
                playerDamage = (cardAttack * 2) - enemyCardDefense;
            }
            else if(topCard.getCardAttribute().trim().equals("Software"))
            {
                playerDamage = (cardAttack + 1) - enemyCardDefense;
            }
            else if(enemyTopCard.getCardAttribute().trim().equals("Hardware"))
            {
                playerDamage = cardAttack - (enemyCardDefense + 1);
            }
            else
            {
                playerDamage = cardAttack - enemyCardDefense;
            }

            // Enemy damage calculations
            if(enemyTopCard.getCardAttribute().trim().equals("Virus") && !topCard.getCardAttribute().trim().equals("Antivirus"))
            {
                enemyDamage = (enemyCardAttack * 2) - cardDefense;
            }
            else if(enemyTopCard.getCardAttribute().trim().equals("Software"))
            {
                enemyDamage = (enemyCardAttack + 1) - cardDefense;
            }
            else if(topCard.getCardAttribute().trim().equals("Hardware"))
            {
                enemyDamage = enemyCardAttack - (cardDefense + 1);
            }
            else
            {
                enemyDamage = enemyCardAttack - cardDefense;
            }

            //int enemyDamage = enemyCardAttack - cardDefense;

            // no negative values
            if (playerDamage < 0)
            {
                playerDamage = 0;
            }
            if (enemyDamage < 0)
            {
                enemyDamage = 0;
            }


            enemyHealth -= playerDamage;
            playerHealth -= enemyDamage;

            JOptionPane.showMessageDialog(null, "You took " + enemyDamage + " damage!\n" +
                    "The enemy took " + playerDamage + " damage!\n", "Turn " + this.turnCount
                    , JOptionPane.INFORMATION_MESSAGE);

            // display current health
            JOptionPane.showMessageDialog(null, currentHealth(), "Turn " + this.turnCount
                    , JOptionPane.INFORMATION_MESSAGE);

            if (enemyHealth <= 0 || playerHealth <= 0)
            {
                winCondition = true;
            }

            this.turnCount++;

        }
        while (!winCondition);

        System.out.println("\n\n===============\nBattle End\n\n");

        if (enemyHealth <= 0)
        {
            Cutscene.youWin();
            setNewPlayerHealth();
        }
        else if(playerHealth <= 0)
        {
            Cutscene.gameOver();
        }
    }

    public String currentHealth()
    {
        String output = "";

        if (playerHealth < 0)
        {
            playerHealth = 0;
        }
        if (enemyHealth < 0)
        {
            enemyHealth = 0;
        }
        System.out.println("Player health is : " + playerHealth);
        System.out.println("Enemy health is : " + enemyHealth);
        output += "Player health is: " + playerHealth;
        output += "\nEnemy health is: " + enemyHealth;

        return output;
    }

    public int setNewPlayerHealth()
    {
        return this.playerHealth;
    }

}