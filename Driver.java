public class Driver
{
    public static void main(String[] args)
    {
        boolean goFirst = false;

        CoinFlip flip1 = new CoinFlip(goFirst);

        System.out.println(flip1.toString());
    }
}
