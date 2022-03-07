public class Driver
{
    public static void main(String[] args)
    {
        Cutscene cutscenes = new Cutscene();
        DirectionChoice direction = new DirectionChoice();
        Enemy enemy = new Enemy();

        System.out.println(cutscenes.cutscene1()); // Intro cutscene
        System.out.println(cutscenes.enterName()); // Enter name
        direction.directionChoice0(); // Choice of entering castle or turning around

        // Boss fight
        System.out.println(cutscenes.cutscene2()); // Entering castle
        direction.directionChoice1(); // Hallway choice: left or right

        // event / boss fight





        boolean goFirst = false;
        CoinFlip flip1 = new CoinFlip(goFirst);
        System.out.println(flip1.toString());
    }
}
