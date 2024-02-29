package gameutils;

import core.Player;

public class Console {
    
    private Console() {}  // Cannot be Instantiated

    public static void printState(Player player) {
        System.out.println(
            "Selected Player: " + player.getName() + " (" + player.getUsername() + ")" + "\n" +
            "Coins: " + player.getCoins() + "\n" +
            "XP: 4" + "\n" +
            "Army: Shooter (Archer), Templar (Knight), Saint (Healer)" + "\n" +
            "Home Ground: None"            + "\n\n" +

            "Select Action"                + "\n" +
            "1: Look for an opponent to battle" + "\n" +
            "2: Purchase character"        + "\n" +
            "3: Purchase equipment"        + "\n" +
            "4: Sell character"            + "\n" +
            "5: Set Home Ground"           + "\n" +
            "6: Inspect Army"              + "\n" +
            "7: Help"                      + "\n\n" +

            "0: Change Player"
        );
    }

}
