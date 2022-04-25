import javax.swing.*;
import java.util.*;

public class Combat {

    // Fields
    private int playerHealth;
    private int enemyHealth;

    private Object[] options = {"What have I got?", "Nah, let's get this over with."};

    public Combat(Deck playerDeck, EnemyDeck enemyDeck, int enemyHP, int playerHP, Consumable consumable)
    {
        boolean winCondition = false;
        this.playerHealth = playerHP;
        this.enemyHealth = enemyHP;

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
            int turnCount = 1;
            System.out.println("|   Turn " + turnCount + "   |");
            System.out.println("==============");

            // consumable options

            ArrayList<String> arrayList = consumable.consumablePack;

            Object[] option = new Object[arrayList.size()];
            arrayList.toArray(option);

            if(option.length != 0)
            {
                int result = JOptionPane.showOptionDialog(null, "Would You like to use an item?",
                        "Query", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options, null);
                if(option.length > 3) {
                    if (result == JOptionPane.YES_OPTION) {
                        String results = (String) JOptionPane.showInputDialog(null, "Please choose an item", "~Backpack~Backpack~",
                                JOptionPane.QUESTION_MESSAGE, null, option, option[0]);

                        switch (results) {
                            case "Battery Pack" -> {
                                JOptionPane.showMessageDialog(null, "The battery pack once fully charged" +
                                                ", dims with a fading light as the energy flows within you.",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "You've restored 10 HP!",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                playerHealth += 10;
                                setNewPlayerHealth();
                                consumable.removeConsumableBattery();
                            }
                            case "CPU Upgrade" -> {
                                JOptionPane.showMessageDialog(null, "You use the CPU Upgrade... \n" +
                                                "It definitely did something!! Probably...",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, ";)",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                consumable.removeConsumableCPU();
                            }
                            case "Hammer" -> {
                                JOptionPane.showMessageDialog(null, "You firmly grip your trusty hammer" +
                                                " with both hands and S M A S H your enemy to pieces!",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Well, not actually, but you do " +
                                                "inflict 10 damage...",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                enemyHealth -= 10;
                                consumable.removeConsumableHammer();
                            }
                            case "Cookie" -> {
                                JOptionPane.showMessageDialog(null, "The cookie asks you to " +
                                                "lend it some money. \nYou know it's a bad idea given its gambling addition, but you \"enable\" it anyways.",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "The cookie, in its excitement, decides to let you have a little bite." +
                                                " \nYou take a nibble and feel your health increase as the cookie runs away... +5 HP",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                playerHealth += 5;
                                setNewPlayerHealth();
                                consumable.removeConsumableCookie();
                            }
                            case "Java" -> {
                                JOptionPane.showMessageDialog(null, "You look at the cup of " +
                                                "coffee in your hand. \nYou almost decide to take a sip, but hesitate at the bad idea.",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "You chuck it at the enemy instead, " +
                                                "and the steaming drink \nseeps into their inner mechanisms lowering their health by 5.",
                                        "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                enemyHealth -= 5;
                                consumable.removeConsumableJavaCoffee();
                            }
                        }
                    }
                }
                else
                {
                    if(result == JOptionPane.YES_OPTION) {
                        int results = JOptionPane.showOptionDialog(null, "Please choose an item", "~Backpack~Backpack~",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, null);

                        if (results == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "You use the item!",
                                    "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);

                            switch (consumable.consumablePack.get(0).trim()) {
                                case "Battery Pack" -> {
                                    JOptionPane.showMessageDialog(null, "The battery pack once fully charged" +
                                                    ", dims with a fading light as the energy flows within you.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "You've restored 10 HP!",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    playerHealth += 10;
                                    setNewPlayerHealth();
                                    consumable.removeConsumableBattery();
                                }
                                case "CPU Upgrade" -> {
                                    JOptionPane.showMessageDialog(null, "You use the CPU Upgrade... \n" +
                                                    "It definitely did something!! Probably...",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, ";)",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    consumable.removeConsumableCPU();
                                }
                                case "Hammer" -> {
                                    JOptionPane.showMessageDialog(null, "You firmly grip your trusty hammer" +
                                                    " with both hands and S M A S H your enemy to pieces!",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "Well, not actually, but you do " +
                                                    "inflict 10 damage...",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    enemyHealth -= 10;
                                    consumable.removeConsumableHammer();
                                }
                                case "Cookie" -> {
                                    JOptionPane.showMessageDialog(null, "The cookie asks you to " +
                                                    "lend it some money. \nYou know it's a bad idea given its gambling addition, but you \"enable\" it anyways.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "The cookie, in its excitement, decides to let you have a little bite." +
                                                    " \nYou take a nibble and feel your health increase as the cookie runs away... +5 HP",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    playerHealth += 5;
                                    setNewPlayerHealth();
                                    consumable.removeConsumableCookie();
                                }
                                case "Java" -> {
                                    JOptionPane.showMessageDialog(null, "You look at the cup of " +
                                                    "coffee in your hand. \nYou almost decide to take a sip, but hesitate at the bad idea.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "You chuck it at the enemy instead, " +
                                                    "and the steaming drink \nseeps into their inner mechanisms lowering their health by 5.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    enemyHealth -= 5;
                                    consumable.removeConsumableJavaCoffee();
                                }
                            }
                        }
                        else if(results == JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null,"You use the item!",
                                    "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);

                            switch (consumable.consumablePack.get(1).trim()) {
                                case "Battery Pack" -> {
                                    JOptionPane.showMessageDialog(null, "The battery pack once fully charged" +
                                                    ", dims with a fading light as the energy flows within you.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "You've restored 10 HP!",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    playerHealth += 10;
                                    setNewPlayerHealth();
                                    consumable.removeConsumableBattery();
                                }
                                case "CPU Upgrade" -> {
                                    JOptionPane.showMessageDialog(null, "You use the CPU Upgrade... \n" +
                                                    "It definitely did something!! Probably...",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, ";)",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    consumable.removeConsumableCPU();
                                }
                                case "Hammer" -> {
                                    JOptionPane.showMessageDialog(null, "You firmly grip your trusty hammer" +
                                                    " with both hands and S M A S H your enemy to pieces!",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "Well, not actually, but you do " +
                                                    "inflict 10 damage...",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    enemyHealth -= 10;
                                    consumable.removeConsumableHammer();
                                }
                                case "Cookie" -> {
                                    JOptionPane.showMessageDialog(null, "The cookie asks you to " +
                                                    "lend it some money. \nYou know it's a bad idea given its gambling addition, but you \"enable\" it anyways.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "The cookie, in its excitement, decides to let you have a little bite." +
                                                    " \nYou take a nibble and feel your health increase as the cookie runs away... +5 HP",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    playerHealth += 5;
                                    setNewPlayerHealth();
                                    consumable.removeConsumableCookie();
                                }
                                case "Java" -> {
                                    JOptionPane.showMessageDialog(null, "You look at the cup of " +
                                                    "coffee in your hand. \nYou almost decide to take a sip, but hesitate at the bad idea.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "You chuck it at the enemy instead, " +
                                                    "and the steaming drink \nseeps into their inner mechanisms lowering their health by 5.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    enemyHealth -= 5;
                                    consumable.removeConsumableJavaCoffee();
                                }
                            }
                        }
                        else if(results == JOptionPane.CANCEL_OPTION) {
                            JOptionPane.showMessageDialog(null, "You use the item!",
                                    "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);

                            switch (consumable.consumablePack.get(2).trim()) {
                                case "Battery Pack" -> {
                                    JOptionPane.showMessageDialog(null, "The battery pack once fully charged" +
                                                    ", dims with a fading light as the energy flows within you.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "You've restored 10 HP!",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    playerHealth += 10;
                                    setNewPlayerHealth();
                                    consumable.removeConsumableBattery();
                                }
                                case "CPU Upgrade" -> {
                                    JOptionPane.showMessageDialog(null, "You use the CPU Upgrade... \n" +
                                                    "It definitely did something!! Probably...",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, ";)",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    consumable.removeConsumableCPU();
                                }
                                case "Hammer" -> {
                                    JOptionPane.showMessageDialog(null, "You firmly grip your trusty hammer" +
                                                    " with both hands and S M A S H your enemy to pieces!",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "Well, not actually, but you do " +
                                                    "inflict 10 damage...",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    enemyHealth -= 10;
                                    consumable.removeConsumableHammer();
                                }
                                case "Cookie" -> {
                                    JOptionPane.showMessageDialog(null, "The cookie asks you to " +
                                                    "lend it some money. \nYou know it's a bad idea given its gambling addition, but you \"enable\" it anyways.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "The cookie, in its excitement, decides to let you have a little bite." +
                                                    " \nYou take a nibble and feel your health increase as the cookie runs away... +5 HP",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    playerHealth += 5;
                                    setNewPlayerHealth();
                                    consumable.removeConsumableCookie();
                                }
                                case "Java" -> {
                                    JOptionPane.showMessageDialog(null, "You look at the cup of " +
                                                    "coffee in your hand. \nYou almost decide to take a sip, but hesitate at the bad idea.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "You chuck it at the enemy instead, " +
                                                    "and the steaming drink \nseeps into their inner mechanisms lowering their health by 5.",
                                            "~Backpack~Backpack~", JOptionPane.INFORMATION_MESSAGE);
                                    enemyHealth -= 5;
                                    consumable.removeConsumableJavaCoffee();
                                }
                            }
                        }
                    }
                }
            }

            // deals top card of each deck
            JOptionPane.showMessageDialog(null, "Deal!", "Turn " + turnCount
                    , JOptionPane.INFORMATION_MESSAGE);

            System.out.println("\nDeal!\n");

            System.out.print("Your card:\n");
            Card topCard = playerDeck.getTopCard();
            System.out.print("Enemy card:\n");
            EnemyCard enemyTopCard = enemyDeck.getTopCard();

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
            int enemyCardAttack = enemyTopCard.getEnemyCardAttack();
            int enemyCardDefense = enemyTopCard.getEnemyCardDefense();

            int playerDamage, enemyDamage;

            // Player damage calculations
            if(topCard.getCardAttribute().trim().equals("Virus") && !enemyTopCard.getEnemyCardAttribute().trim().equals("Antivirus"))
            {
                playerDamage = (cardAttack * 2) - enemyCardDefense;
            }
            else if(topCard.getCardAttribute().trim().equals("Software"))
            {
                playerDamage = (cardAttack + 1) - enemyCardDefense;
            }
            else if(enemyTopCard.getEnemyCardAttribute().trim().equals("Hardware"))
            {
                playerDamage = cardAttack - (enemyCardDefense + 1);
            }
            else
            {
                playerDamage = cardAttack - enemyCardDefense;
            }

            // Enemy damage calculations
            if(enemyTopCard.getEnemyCardAttribute().trim().equals("Virus") && !topCard.getCardAttribute().trim().equals("Antivirus"))
            {
                enemyDamage = (enemyCardAttack * 2) - cardDefense;
            }
            else if(enemyTopCard.getEnemyCardAttribute().trim().equals("Software"))
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
                            "The enemy took " + playerDamage + " damage!\n", "Turn " + turnCount
                    , JOptionPane.INFORMATION_MESSAGE);

            // display current health
            JOptionPane.showMessageDialog(null, currentHealth(), "Turn " + turnCount
                    , JOptionPane.INFORMATION_MESSAGE);

            if (enemyHealth <= 0 || playerHealth <= 0)
            {
                winCondition = true;
            }

            turnCount++;

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





