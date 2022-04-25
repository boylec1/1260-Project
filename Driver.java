public class Driver
{
    public static void main(String[] args)
    {
        Cutscene cutscenes = new Cutscene();
        DirectionChoice direction = new DirectionChoice();
        Enemy enemy = new Enemy();
        Consumable consumable = new Consumable();

        cutscenes.cutscene1(); // Intro cutscene
        cutscenes.enterName(); // Enter name
        Deck playerDeck = new Deck();
        PlayerStats playerHealth = new PlayerStats();

        cutscenes.getBackpack(playerDeck, playerHealth, consumable); // Receive pack with 3 items.

        direction.directionChoice0(playerDeck, playerHealth, consumable); // Choice of entering castle or turning around
        direction.directionChoice1(playerDeck, playerHealth, consumable); // Hallway choice: left or right
        direction.directionChoice2(playerDeck, playerHealth, consumable); // Hallway choice: left or right
        direction.directionChoice3(playerDeck, playerHealth, consumable); // Office choice: Up the stairs, or look around
        direction.directionChoice4(playerDeck, playerHealth, consumable); // Hallway choice: left, forward, or right
        direction.directionChoice5(playerDeck, playerHealth, consumable); // "Choice" of opening door to final boss
    }
}













































