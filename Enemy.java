public class Enemy
{
    // First enemy
    public void boss1(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneDoorman();
        Cutscene.battleStart();

        // Setup
        EnemyDeck bossOne = new EnemyDeck();
        EnemyStats doorman = new EnemyStats();
        int doormanHealth = doorman.doorman();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, bossOne, doormanHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss2(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneHeadChef();
        Cutscene.battleStart();

        // Setup
        EnemyDeck bossTwo = new EnemyDeck();
        EnemyStats chef = new EnemyStats();
        int chefHealth = chef.headChef();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, bossTwo, chefHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss3(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneOfficeManager();
        Cutscene.battleStart();

        // Setup
        EnemyDeck bossThree = new EnemyDeck();
        EnemyStats officeBot = new EnemyStats();
        int officeBotHealth = officeBot.officeManager();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, bossThree, officeBotHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss4(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneServerus();
        Cutscene.battleStart();

        // Setup
        EnemyDeck bossFour = new EnemyDeck();
        EnemyStats ServerusBoss = new EnemyStats();
        int ServerusHealth = ServerusBoss.Serverus();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, bossFour, ServerusHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss5(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneFilezilla();
        Cutscene.battleStart();

        // Setup
        EnemyDeck bossFive = new EnemyDeck();
        EnemyStats fileZilla = new EnemyStats();
        int fileZillaHealth = fileZilla.fileZilla();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, bossFive, fileZillaHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void finalBoss(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneFinalBoss();
        Cutscene.battleStart();

        // Setup
        EnemyDeck finalBoss = new EnemyDeck();
        EnemyStats finalBossStats = new EnemyStats();
        int finalBossHealth = finalBossStats.finalBoss();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, finalBoss, finalBossHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    // Minion encounters
    public void doormanMinion(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneDoormanMinion();
        Cutscene.battleStart();

        // Setup
        EnemyDeck doormanMinion = new EnemyDeck();
        EnemyStats doormanMinionStats = new EnemyStats();
        int doormanMinionHealth = doormanMinionStats.getHealth();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, doormanMinion, doormanMinionHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void chefMinion(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneChefMinion();
        Cutscene.battleStart();

        // Setup
        EnemyDeck chefMinion = new EnemyDeck();
        EnemyStats chefMinionStats = new EnemyStats();
        int chefMinionHealth = chefMinionStats.getHealth();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, chefMinion, chefMinionHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void officeMinion(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneOfficeMinion();
        Cutscene.battleStart();

        // Setup
        EnemyDeck officeMinion = new EnemyDeck();
        EnemyStats officeMinionStats = new EnemyStats();
        int officeMinionHealth = officeMinionStats.getHealth();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, officeMinion, officeMinionHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void serverusMinion(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneServerusMinion();
        Cutscene.battleStart();

        // Setup
        EnemyDeck serverusMinion = new EnemyDeck();
        EnemyStats serverusMinionStats = new EnemyStats();
        int serverusMinionHealth = serverusMinionStats.getHealth();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, serverusMinion, serverusMinionHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void filezillaMinion(Deck playerDeck, PlayerStats playerHealth, Consumable consumable)
    {
        // Stage-setting
        Cutscene.cutsceneFilezillaMinion();
        Cutscene.battleStart();

        // Setup
        EnemyDeck filezillaMinion = new EnemyDeck();
        EnemyStats filezillaMinionStats = new EnemyStats();
        int filezillaMinionHealth = filezillaMinionStats.getHealth();
        int playerHP = playerHealth.getHealth();

        // Combat
        Combat combat = new Combat(playerDeck, filezillaMinion, filezillaMinionHealth, playerHP, consumable);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }
}