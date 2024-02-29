package core;

import java.util.Map;

import characters.Character;

public class Army {
    
    private Map<String, Character> characters;

    public void addCharacter(Character character) {
        characters.put(character.getCategory(), character);
    }

    public void display() {
        System.out.println("Okay");
    }

    public void displayDetailed() {

    }
}
