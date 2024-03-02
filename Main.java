import java.util.*;

import characters.*;
import core.*;
import gameutils.Console;

public class Main {
    public static void main (String[] args) {

        PlayerManager PM = PlayerManager.getInstance();

        Player player1 = PM.newPlayer("whitewolf", "Geralt of Rivia");
        Player player2 = PM.newPlayer("evilwizard", "Stregobor");
        player1.buyCharacter("Archer", 1);
        // player1.battleSomeone();
        Console.printState(player1);
    }
}