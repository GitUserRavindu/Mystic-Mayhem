package characters;

import equipment.*;

public abstract class Character {
    
    protected String name;
    protected short price;
    protected byte atk, def, hp, spd;

    protected Armor armor;
    protected Artefact artefact;

    public String getName() {
        return name;
    }

    abstract String getCategory();

}