public class EnemyStats extends PlayerStats{

    private int health;

    public EnemyStats()
    {
        // Base health
        this.health = 5;
    }

    public int doorman()
    {
        this.health = 10;
        return this.health;
    }

    public int headChef()
    {
        this.health = 11;
        return this.health;
    }

    public int officeManager()
    {
        this.health = 12;
        return this.health;
    }

    public int Serverus()
    {
        this.health = 13;
        return this.health;
    }

    public int fileZilla()
    {
        this.health = 14;
        return this.health;
    }

    public int finalBoss()
    {
        this.health = 15;
        return this.health;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
