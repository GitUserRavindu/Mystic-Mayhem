package core;

import java.util.HashMap;

import utils.Utils;

public class PlayerManager {
    private static PlayerManager instance;  // Singleton design pattern
    private PlayerManager () {
    }
    
    public static PlayerManager getInstance() {
        if (instance == null) instance = new PlayerManager();
        return instance;
    }

    private static HashMap<String, Player> playerList = new HashMap<>();

    public static Player newPlayer () {
        String username = Utils.readString("Enter Username: ");

        while (playerList.containsKey(username)) {   // Username has to be unique
            username = Utils.readString("User ID Taken, Please Try Again: ");
        }

        String name = Utils.readString("Enter Name: ");

        Player newPlayer = new Player(username, name);
        playerList.put(username, newPlayer);          // Adds the new player to the List

        return newPlayer;
    }

    public static Player getPlayer (String username) {
        if (!playerList.containsKey(username)) {
            System.out.println("Player does not Exist");
        }
        return playerList.get(username);
    }

    public static Player getPlayer () {
        String username = Utils.readString("Enter Username: ");
        while (!playerList.containsKey(username)) {
            username = Utils.readString("Player does not Exist, Please Try Again: ");
        }
        return getPlayer(username);
    }
}
