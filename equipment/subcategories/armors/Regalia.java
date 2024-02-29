package equipment.subcategories.armors;

import equipment.Armor;

public class Regalia extends Armor {
    
    @Override
    public String getName() {
        return "Regalia";
    }

    @Override
    protected void initStats() {
        price = 150;
        atk = 0;
        def = 1;
        hp = 0;
        spd = 0;
    }

}
