package core;

import java.util.HashMap;

import characters.Character;

public class Army {
    
    private HashMap<String, Character> armyCharacters;

    public Army() {
        armyCharacters = new HashMap<>();
    }

    public boolean hasCharacter(String category) {
        if (armyCharacters.containsKey(category)) {
            return true;
        }
        return false;
    }

    public String getCharacterName(String category) {
        return armyCharacters.get(category).getName();
    }

    public void addCharacter(Character character) {
        armyCharacters.put(character.getCategory(), character);
    }

    public void printSimpleInfo() {
        for (String category : Character.getCharacterOrder()) {
            if (armyCharacters.containsKey(category)) {
                System.out.println(category + ": " + armyCharacters.get(category).getName());
            }
        }
    }

    public String getInfoString() {
        return "T";
    }


    public void display() {
        System.out.println("Okay");
    }

    public void displayDetailed() {

    }

    public void battleArmy(Army army) {

    }

}
