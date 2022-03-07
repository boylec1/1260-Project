public class Driver
{
    public static void main(String[] args)
    {
        Cutscene cutscenes = new Cutscene();
        DirectionChoice direction = new DirectionChoice();

        System.out.println(cutscenes.cutscene1());
        System.out.println(cutscenes.enterName());
        direction.directionChoice0();

        // event / boss fight

        System.out.println(cutscenes.cutscene2());

        boolean goFirst = false;
        CoinFlip flip1 = new CoinFlip(goFirst);
        System.out.println(flip1.toString());
    }
}
