package core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import characters.*;
import characters.Character;
import equipment.Equipment;
import gameutils.Utils;

public class Player {
    private final String username;
    private String name;
    private float coins;
    private byte XP;
    private Map<String, Character> army;  // Maybe Army can be its own object
    // private Map<Equipment, Integer> inventory;

    protected Player (String username, String name) {
        this.username = username;
        this.name = name;
        coins = 500;
        XP = 0;
    }


    // Getters

    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public float getCoins() {
        return coins;
    }

    public void printStats () {

    }

    public void battleSomeone() {
        PlayerManager.getInstance().battleSomeone(this);
    }

    public void setHomeGround () {

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


}