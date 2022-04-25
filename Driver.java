public class Driver
{
    public static void main(String[] args)
    {
        DirectionChoice direction = new DirectionChoice();
        Consumable consumable = new Consumable();

        Cutscene.cutscene1(); // Intro cutscene
        Cutscene.enterName(); // Enter name
        Deck playerDeck = new Deck();
        PlayerStats playerHealth = new PlayerStats();

        direction.directionChoice0(playerDeck, playerHealth, consumable); // Choice of entering castle or turning around
        direction.directionChoice1(playerDeck, playerHealth, consumable); // Hallway choice: left or right
        direction.directionChoice2(playerDeck, playerHealth, consumable); // Hallway choice: left or right
        direction.directionChoice3(playerDeck, playerHealth, consumable); // Office choice: Up the stairs, or look around
        direction.directionChoice4(playerDeck, playerHealth, consumable); // Hallway choice: left, forward, or right
        direction.directionChoice5(playerDeck, playerHealth, consumable); // "Choice" of opening door to final boss
    }
}













































