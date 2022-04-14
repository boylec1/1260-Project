public class Driver
{
    public static void main(String[] args)
    {
        Cutscene cutscenes = new Cutscene();
        DirectionChoice direction = new DirectionChoice();
        Enemy enemy = new Enemy();

        cutscenes.cutscene1(); // Intro cutscene
        cutscenes.enterName(); // Enter name
        Deck playerDeck = new Deck();
        direction.directionChoice0(playerDeck); // Choice of entering castle or turning around

        // Boss fight

        System.out.println(cutscenes.cutscene2()); // Entering castle

        direction.directionChoice1(playerDeck); // Hallway choice: left or right

        // Possible Event
        // Boss fight
        System.exit(0); // =======================================================================================



        // Boss fight

        direction.directionChoice2(playerDeck); // Hallway choice: left or right

        // Possible Event

        cutscenes.cutscene4(); // Describes the office

        // Boss fight

        direction.directionChoice3(playerDeck); // Office choice: Up the stairs, or look around

        // Possible Event

        cutscenes.cutscene5(); // Description of going upstairs and hallway
        direction.directionChoice4(playerDeck); // Hallway choice: left, forward, or right

        // Possible Event

        cutscenes.cutscene6(); // Description of hallway leading to "Serverus"
        direction.directionChoice5(playerDeck); // "Choice" of opening door to final boss
        cutscenes.cutscene7(); // Description of final boss room

        // Final boss fight

        cutscenes.endCutscene1(); // End of game

    }
}
