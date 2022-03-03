import java.util.Random;
public class CoinFlip
{
    private Random rand = new Random();
    private boolean goFirst;

    //Here is the constructor that gives a random boolean value to goFirst
    public CoinFlip(boolean goFirst)
    {
       Random rand = new Random();
       this.goFirst = rand.nextBoolean();
    }

    @Override
    public String toString()
    {
        String output = "";
        //This display heads or tails instead of true or false
        if (goFirst == true)
        {
            output = "Heads";
        }
        else
        {
            output = "Tails";
        }
        return "Coin Flip Result: " + output;
    }
}
