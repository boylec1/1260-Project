import javax.swing.*;

public class Combat {

    // Fields
    private int playerHealth = 10;
    private int enemyHealth = 10;
    private int turnCount = 1;

    private int attackInput;
    private int defenseInput;
    private String attackAttribute;
    private String defenseAttribute;

    //Turn turn = new Turn();

    //boolean goFirst = false;
    //CoinFlip flip1 = new CoinFlip(goFirst);
    //System.out.println(flip1.toString());

    public Combat(Deck playerDeck, EnemyDeck enemyDeck, int enemyHP, int playerHP)
    {
        boolean winCondition = false;
        this.playerHealth = playerHP;
        this.enemyHealth = enemyHP;
        // display current health

        System.out.println("============");
        System.out.println("|  Battle  |");
        System.out.println("|  Begin   |");
        System.out.println("============");
        currentHealth();

        // shuffles both decks
        System.out.println("\nDeck Shuffled\n");
        playerDeck.shuffleCards();
        enemyDeck.shuffleCards();

        do {
            // insert turn counter here
            System.out.println("\n==============");
            System.out.println("|   Turn " + this.turnCount + "   |");
            System.out.println("==============");
            this.turnCount++;

            // insert options here
            // i.e. option to use consumables

            // deals top card of each deck
            System.out.println("\nDeal!\n");
            System.out.print("Your card:\n");
            Card topCard = playerDeck.getTopCard();
            System.out.print("Enemy card:\n");
            Card enemyTopCard = enemyDeck.getTopCard();

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

            System.out.println("\nYou took " + enemyDamage + " damage!");
            System.out.println("The enemy took " + playerDamage + " damage!\n");

            // display current health
            currentHealth();

            if (enemyHealth <= 0 || playerHealth <= 0)
            {
                winCondition = true;
            }

        }
        while (!winCondition);

        System.out.println("\n\n===============\nBattle End");

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

    public void currentHealth()
    {
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
    }

    public int setNewPlayerHealth()
    {
        return this.playerHealth;
    }

}