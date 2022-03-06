public class Driver
{
    public static void main(String[] args)
    {
        Cutscene cutscenes = new Cutscene();
        String name = "";
        System.out.println(cutscenes.cutscene1(name));

        boolean goFirst = false;
        CoinFlip flip1 = new CoinFlip(goFirst);
        System.out.println(flip1.toString());
    }
}
