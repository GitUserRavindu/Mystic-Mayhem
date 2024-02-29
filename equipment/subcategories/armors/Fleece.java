package equipment.subcategories.armors;

import equipment.Armor;

public class Fleece extends Armor {
    
    @Override
    public String getName() {
        return "Fleece";
    }

    @Override
    protected void initStats() {
        price = 150;
        atk = 0;
        def = 2;
        hp = 1;
        spd = -1;
    }

}
