package characters;

import equipment.*;

public abstract class Character {
    private String category, name;
    private short price;
    private byte atk, def, hp, spd;

    private Armor armor;
    private Artefact artefact;

    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }

}