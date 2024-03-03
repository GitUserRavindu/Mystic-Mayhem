package characters.subcategories.mages;

import characters.Mage;

public class Mage1 extends Mage {

    @Override
    public String getName() {
        return "Warlock";
    }

    @Override
    protected void initStats() {
        price = 100;
        atk = 12;
        def = 7;
        hp = 10;
        spd = 12;
    }

}
