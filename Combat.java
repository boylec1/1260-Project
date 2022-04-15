public class Combat {

    // Fields
    private int playerHealth = 10;
    private int enemyHealth = 10;

    private int attackInput;
    private int defenseInput;
    private String attackAttribute;
    private String defenseAttribute;

    //Turn turn = new Turn();

    //boolean goFirst = false;
    //CoinFlip flip1 = new CoinFlip(goFirst);
    //System.out.println(flip1.toString());

    public Combat(Deck playerDeck, EnemyDeck enemyDeck)
    {
        boolean winCondition = false;

        // display current health
        currentHealth();

        // shuffles both decks
        System.out.println("\nDeck Shuffled\n");
        playerDeck.shuffleCards();
        enemyDeck.shuffleCards();

        do {
            // insert turn counter here

            // insert options here
            // i.e. option to use consumables

            // deals top card of each deck
            System.out.println("\nDeal!\n\n");
            System.out.println("Your card:\n");
            Card topCard = playerDeck.getTopCard();
            System.out.println("Enemy card:\n");
            Card enemyTopCard = enemyDeck.getTopCard();

            if (topCard == null || enemyTopCard == null)
            {
                if (enemyHealth < playerHealth)
                {
                    System.out.println("\n\nCongratulations! You won!");
                    break;
                }
                else if (playerHealth == enemyHealth)
                {
                    System.out.println("\n\nCongratulations! You won!");
                    break;
                }
                else if (playerHealth < enemyHealth)
                {
                    System.out.println("\n\nYou Lose!\nGame Over");
                    System.exit(0);
                }
            }

            int cardAttack = topCard.getCardAttack();
            int cardDefense = topCard.getCardDefense();
            int enemyCardAttack = enemyTopCard.getCardAttack();
            int enemyCardDefense = enemyTopCard.getCardDefense();

            // damage calculations
            int playerDamage = cardAttack - enemyCardDefense;
            int enemyDamage = enemyCardAttack - cardDefense;

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

            System.out.println("\nYou took " + enemyDamage + " damage!\n");
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
            System.out.println("\n\nCongratulations! You won!");
        }
        else if(playerHealth <= 0)
        {
            System.out.println("\n\nYou Lose!\nGame Over");
            System.exit(0);
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

}
