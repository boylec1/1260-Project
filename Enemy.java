public class Enemy
{
    // First enemy
    public void boss1(Deck playerDeck, PlayerStats playerHealth)
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
        Combat combat = new Combat(playerDeck, bossOne, doormanHealth, playerHP);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss2(Deck playerDeck, PlayerStats playerHealth)
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
        Combat combat = new Combat(playerDeck, bossTwo, chefHealth, playerHP);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss3(Deck playerDeck, PlayerStats playerHealth)
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
        Combat combat = new Combat(playerDeck, bossThree, officeBotHealth, playerHP);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss4(Deck playerDeck, PlayerStats playerHealth)
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
        Combat combat = new Combat(playerDeck, bossFour, ServerusHealth, playerHP);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void boss5(Deck playerDeck, PlayerStats playerHealth)
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
        Combat combat = new Combat(playerDeck, bossFive, fileZillaHealth, playerHP);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }

    public void finalBoss(Deck playerDeck, PlayerStats playerHealth)
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
        Combat combat = new Combat(playerDeck, finalBoss, finalBossHealth, playerHP);

        // Cleanup
        playerHealth.newHealth(combat.setNewPlayerHealth());
    }
}