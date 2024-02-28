package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import gameutils.Utils;

public class PlayerManager {
    private static PlayerManager instance;    // Singleton design pattern
    private HashMap<String, Player> playerList;
    private ArrayList<String> usernameList;   // Maintained to efficiently find a random player for battle

    private PlayerManager () {
        playerList = new HashMap<>();
    }
    
    public static PlayerManager getInstance() {
        if (instance == null) instance = new PlayerManager();
        return instance;
    }

    public Player newPlayer() {
        String username = Utils.readString("Enter Username: ");

        while (playerList.containsKey(username)) {   // Username has to be unique
            username = Utils.readString("User ID Taken, Please Try Again: ");
        }

        String name = Utils.readString("Enter Name: ");

        Player newPlayer = new Player(username, name);
        playerList.put(username, newPlayer);          // Adds the new player to the List
        usernameList.add(username);

        return newPlayer;
    }

    public Player getPlayer(String username) {
        if (!playerList.containsKey(username)) {
            System.out.println("Player does not Exist");
        }
        return playerList.get(username);
    }

    public Player getPlayer() {
        String username = Utils.readString("Enter Username: ");
        while (!playerList.containsKey(username)) {
            username = Utils.readString("Player does not Exist, Please Try Again: ");
        }
        return getPlayer(username);
    }

    public void deletePlayer(String username) {
        if (!playerList.containsKey(username)) {
            System.out.println("Player does not Exist");
            return;
        }
        playerList.remove(username);
        usernameList.remove(username);
        System.out.println("Player " + username + " successfully deleted.");
    }

    public void battleSomeone(Player player) {

        if (playerList.size() < 2) {
            System.out.println("You're the only player .-.");
            return;
        }

        String playerChoice;
        Player opponent;
        do {
            System.out.println("Looking for opponent...");
            opponent = getRandomOpponent (player);
            Utils.waitSeconds(1);
            opponent.printStats();
            playerChoice = Utils.readString("Enter 'F' to battle, 'N' to look for another opponent, or anything else to exit: ");
            Utils.waitSeconds(1);
        } while (playerChoice.toUpperCase().equals("N"));

        if (playerChoice.toUpperCase().equals("F")) {
            initiateBattle(player, opponent);
            return;
        }
        return;
    }

    
    private Player getRandomOpponent(Player player) {
        String opponentUsername;
        do {
            opponentUsername = usernameList.get(new Random().nextInt(usernameList.size()));
        } while (!opponentUsername.equals(player.getUsername()));
        return playerList.get(opponentUsername);
    }

    private void initiateBattle(Player player, Player opponent) {

    }





}
