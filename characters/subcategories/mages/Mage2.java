package characters.subcategories.mages;

import characters.Mage;

public class Mage2 extends Mage {

    @Override
    public String getName() {
        return "Illusionist";
    }

    @Override
    protected void initStats() {
        price = 120;
        atk = 13;
        def = 8;
        hp = 12;
        spd = 14;
    }

}
