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

        System.exit(0); // =======================================================================================

        direction.directionChoice1(); // Hallway choice: left or right

        // Possible Event
        // Boss fight

        System.out.println(cutscenes.cutscene3()); // Describes entering the kitchen

        // Boss fight

        direction.directionChoice2(); // Hallway choice: left or right

        // Possible Event

        System.out.println(cutscenes.cutscene4()); // Describes the office

        // Boss fight

        direction.directionChoice3(); // Office choice: Up the stairs, or look around

        // Possible Event

        System.out.println(cutscenes.cutscene5()); // Description of going upstairs and hallway
        direction.directionChoice4(); // Hallway choice: left, forward, or right

        // Possible Event

        System.out.println(cutscenes.cutscene6()); // Description of hallway leading to "Serverus"
        direction.directionChoice5(); // "Choice" of opening door to final boss
        System.out.println(cutscenes.cutscene7()); // Description of final boss room

        // Final boss fight

        System.out.println(cutscenes.endCutscene1()); // End of game



        //boolean goFirst = false;
        //CoinFlip flip1 = new CoinFlip(goFirst);
        //System.out.println(flip1.toString());
    }
}
