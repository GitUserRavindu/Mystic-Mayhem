package gameutils;

import core.Player;

public class Console {
    
    private Console() {}  // Cannot be Instantiated

    public static void printState(Player player) {
        System.out.println(
            "Selected Player: " + player.getName() + " (" + player.getUsername() + ")" + "\n" +
            "Coins: " + player.getCoins() +
            "XP: 4" +
            "Army: Shooter (Archer), Templar (Knight), Saint (Healer)" +
            "Home Ground: None" +

            "Select Action" +
            "1: Look for an opponent to battle" + 
            "2: Purchase character" +
            "3: Purchase equipment" +
            "4: Sell character" +
            "5: Set Home Ground" +
            "6: Inspect Army" +
            "7: Help" +

            "0: Change Player"
        );
    }

}
