package core;

public class Player {
    private final String username;
    private String name;
    private float coins;
    private byte XP;
    private Army army;

    protected Player (String username, String name) {
        this.username = username;
        this.name = name;
        coins = 500;
        XP = 0;
        army = new Army();
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
        System.out.println(XP);
        army.display();
    }

    public void battleSomeone() {
        PlayerManager.getInstance().battleSomeone(this);
    }

    public void setHomeGround () {

    }



/*
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
*/

}