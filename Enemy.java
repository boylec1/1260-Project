public class Enemy
{
    public void boss0()
    {
        //secret boss
    }
    // First enemy
    public void boss1(Deck playerDeck)
    {
        System.out.println( "You spot a shadowy figure and halt in your tracks. As you approach you see a " +
                            "robotic doorman come into view. \nHe turns and spots you, lens eyes widening and says, \n\n" +
                            "\"You there! Halt!\"");

        System.out.println("\n\nBattle Start" + "\n===============\n");

        EnemyDeck bossOne = new EnemyDeck();
        Combat combat = new Combat(playerDeck, bossOne);
    }
    
    public void boss2(Deck playerDeck)
    {
        // Kitchen Boss
        System.out.println( "The room falls silent as the chef and appliance bots stop their work to look at you.\n" +
                            "The short, stocky bot that is sitting in the back of the room munching on fresh micro-chips notices you after a few seconds of silence.\n" +
                            "He drops his food and, as he turns to face you, you can see the text on his over sized chef's hat reading \"HEAD CHEF\".\n\n" +
                            "\"You're not supposed to be here!!\"");

        System.out.println("\n\nBattle Start" + "\n===============\n");

        EnemyDeck bossTwo = new EnemyDeck();
        Combat combat = new Combat(playerDeck, bossTwo);
    }
    
    public void boss3(Deck playerDeck)
    {
        System.out.println("Standing in front of an open door to a private office is a large bot." +
                "\nIts polo shirt has pockets with pens sticking out, and its khakis are well-pleated." +
                "\n\nIt rushes forward shouting and waving TPS reports at you.");

        System.out.println("\n\nBattle Start" + "\n===============\n");

        EnemyDeck bossThree = new EnemyDeck();
        Combat combat = new Combat(playerDeck, bossThree);
    }
    
    public void boss4(Deck playerDeck)
    {
        System.out.println();// Serverus Boss Description

        System.out.println("\n\nBattle Start" + "\n===============\n");

        EnemyDeck bossFour = new EnemyDeck();
        Combat combat = new Combat(playerDeck, bossFour);
    }
    
    public void boss5(Deck playerDeck)
    {
        System.out.println();// Final Boss Description

        System.out.println("\n\nBattle Start" + "\n===============\n");

        EnemyDeck bossFive = new EnemyDeck();
        Combat combat = new Combat(playerDeck, bossFive);
    }

    public void finalBoss(Deck playerDeck)
    {
        System.out.println();// Final Boss Description

        System.out.println("\n\nBattle Start" + "\n===============\n");

        EnemyDeck finalBoss = new EnemyDeck();
        Combat combat = new Combat(playerDeck, finalBoss);
    }
}
