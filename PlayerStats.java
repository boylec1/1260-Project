public class PlayerStats {

    // Field
    private int health;

    public PlayerStats()
    {
        this.health = 50; // number is a placeholder just getting something here
    }

    public int getHealth() {
        return health;
    }

    public void newHealth(int newHealthTotal)
    {
        this.health = newHealthTotal;

        if(this.health <= 0)
        {
            Cutscene.gameOver();
        }
    }
}
