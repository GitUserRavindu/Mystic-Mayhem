package characters;

import core.GameItem;
import equipment.*;

public abstract class Character extends GameItem {

    // See category classes (Archer, Healer, ...) for category-specific methods
    // subcategories contain name and base stats for each type of character, no changes outside of this has to be made there

    protected Armor armor;
    protected Artefact artefact;

    protected Character() {                 // This constructor is used for every sub-category
        initStats();
    }
    
    public abstract String getCategory();   // Overriden for each category

    public void reset() {
        initStats();
        addEquipStats(armor);
        addEquipStats(artefact);
    }

    public void giveEquip(Equipment item) {

    }


    private void addEquipStats(Equipment item) {
        if (item==null) {
            return;
        }
        price += item.getPrice()*0.2;
        atk += item.getAttack();
        def += item.getDefense();
        hp += item.getHealth();
        spd += item.getSpeed();
    }
}