package characters;

import core.GameItem;
import equipment.*;

public abstract class Character extends GameItem {

    // See category classes (Archer, Healer, ...) for category-specific methods
    // subcategories contain name and base stats for each type of character, no changes outside of this has to be made there

    protected Armor armor;
    protected Artefact artefact;

    public static enum CharacterCategory {
        ARCHER("Warrior"),
        MAGE("Mage");
    
        private final String name;
    
        CharacterCategory(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    }

    public void reset() {
        initStats();
        addEquipStats(armor);
        addEquipStats(artefact);
    }

    public void giveEquip(Equipment item) {
        switch (item.getCategory()) {
            case "Armor":
                this.armor = (Armor) item;
                break;
            case "Artefact":
                this.artefact = (Artefact) item;
                break;
            default:
                break;
        }
        this.addEquipStats(item);
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