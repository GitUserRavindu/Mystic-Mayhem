package characters;

import equipment.*;

public abstract class Character {
    String name;
    short price;
    byte atk, def, hp, spd;

    Armor armor;
    Artefact artefact;
}