package characters;

import core.GameItem;
import equipment.*;

public abstract class Character extends GameItem {

    protected Armor armor;
    protected Artefact artefact;

    public abstract String getCategory();

}