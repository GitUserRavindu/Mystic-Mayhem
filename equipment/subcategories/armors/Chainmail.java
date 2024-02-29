package equipment.subcategories.armors;

import equipment.Armor;

public class Chainmail extends Armor {
    
    @Override
    public String getName() {
        return "Chainmail";
    }

    @Override
    protected void initStats() {
        price = 70;
        atk = 0;
        def = 1;
        hp = 0;
        spd = -1;
    }

}
