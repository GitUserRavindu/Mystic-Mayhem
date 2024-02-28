package core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import characters.*;
import characters.Character;
import equipment.Equipment;

public class Player {
    private static HashMap<String, Player> playerList = new HashMap<>();

    private final String username;
    private String name;
    private float coins;
    private byte XP;
    private Map<String, Character> army;  // Maybe Army can be its own object
    // private Map<Equipment, Integer> inventory;

    public Player () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username: ");
        
        String temp_username = scanner.nextLine();
        while (playerList.containsKey(temp_username)) {   // Username has to be unique
            System.out.println("User ID Taken, Please Try Again: ");
            temp_username = scanner.nextLine();
        }
        
        username = temp_username;
        playerList.put(username, this);          // Adds the new player to the List

        System.out.println("Enter Name: ");
        name = scanner.nextLine();
        scanner.close();

        coins = 500;
    }

    public static Player getPlayer (String username) {
        if (!playerList.containsKey(username)) {
            System.out.println("Player does not Exist");
        }
        return playerList.get(username);
    }

    public static Player getPlayer () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        while (!playerList.containsKey(username)) {
            System.out.println("Player does not Exist, Please Try Again: ");
            username = scanner.nextLine();
        }
        scanner.close();
        return playerList.get(username);
    }

    public boolean addCharacter(Character character) {
        if (army.containsKey(character.getCategory())) {
            System.out.println("You already have " + character.getCategory() + " " + character.getName() + " in your Army");
            return false; // Indicate failure
        } else {
            army.put(character.getCategory(), character);
            return true; // Indicate success
        }
    }
    
    public void buyCharacter(String category, String name) {

    }




    public void getOpponent() {
        
    }

}