import java.util.*;

import characters.CharacterMaker;
import core.*;
import core.HomeGrounds.HomeGround;
import gameutils.Console;

public class Main {
    public static void main (String[] args) {

        PlayerManager PM = PlayerManager.getInstance();

        Player player1 = PM.newPlayer("whitewolf", "Geralt of Rivia");
        Player player2 = PM.newPlayer("evilwizard", "Stregobor");
        // player1.buyCharacter("Archer", 1);
        // player1.battleSomeone();
        player1.buyCharacter("Archer", 4);
        player1.buyCharacter("Healer", 4);
        player1.buyCharacter("Mage", 5);
        player1.buyCharacter("Mythical Creature", 4);

        player2.buyCharacter("Archer", 5);
        player2.buyCharacter("Healer", 5);
        player2.buyCharacter("Knight", 5);
        player2.buyCharacter("Mage", 3);



        player1.setHomeGround(HomeGround.HILLCREST);
        player2.setHomeGround(HomeGround.MARSHLAND);
        System.out.println(Combat.battle(player1, player2));
        player1.printArmyInfo();
        player2.printArmyInfo();
        //GameItem legolas = CharacterMaker.newCharacter("Archer",1);
        Console.printState(player2);
        //legolas.printInfo();
    }
}