package core;

import java.util.HashMap;

import characters.Character;

public class Army {
    
    private HashMap<String, Character> characters;

    public Army() {
        characters = new HashMap<>();
    }

    public void addCharacter(Character character) {
        characters.put(character.getCategory(), character);
    }

    public String getInfoString() {
        return "T";
    }


    public void display() {
        System.out.println("Okay");
    }

    public void displayDetailed() {

    }
}
