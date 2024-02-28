package core;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import characters.*;
import characters.Character;
import equipment.Equipment;

public class Player {
    private static HashSet<String> usernames = new HashSet<>();
    private final String username;
    private String name;
    private float coins;
    private byte XP;
    private Map<String, Character> army;  // Maybe Army can be its own object
    // private Map<Equipment, Integer> inventory;

    public Player () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User ID: ");
        String temp_username = scanner.nextLine();
        while (usernames.contains(temp_username)) {
            System.out.println("User ID Taken, Please Try Again: ");
            temp_username = scanner.nextLine();
        }     
        username = temp_username;
        usernames.add(username);

        System.out.println("Enter Name: ");
        name = scanner.nextLine();
        scanner.close();

        coins = 500;
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