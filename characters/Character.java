package characters;

import core.GameItem;
import equipment.*;

public abstract class Character extends GameItem {

    // See category classes (Archer, Healer, ...) for category-specific methods
    // subcategories contain base names and stats for each type of character
    
    protected static short basePrice;   // Should be the same types as Game Item
    protected static float baseHp;
    protected static byte baseAtk, baseDef, baseSpd;

    protected Armor armor;
    protected Artefact artefact;


    protected Character() {
        price = basePrice;
    }
    
    public abstract String getCategory();


    public void reset() {
        
    }

    protected static void setBaseStats(int price, int atk, int def, int hp, int spd) {   // USed in static initializer blocks for characters
        basePrice = (short) price;
        baseAtk = (byte) atk;
        baseDef = (byte) def;
        baseHp = (float) hp;
        baseSpd = (byte) spd;
    }

}