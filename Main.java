import java.util.*;
import characters.*;
import core.*;

public class Main {
    public static void main (String[] args) {

        PlayerManager PM = PlayerManager.getInstance();

        Player player1 = PM.newPlayer("whitewolf", "Geralt of Rivia");
        Player player2 = PM.newPlayer("evilwizard", "Stregobor");
        player1.battleSomeone();
    }
}