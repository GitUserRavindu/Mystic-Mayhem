package characters.subcategories.mages;

import characters.Mage;

public class Mage3 extends Mage {

    @Override
    public String getName() {
        return "Enchanter";
    }

    @Override
    protected void initStats() {
        price = 160;
        atk = 16;
        def = 10;
        hp = 13;
        spd = 16;
    }

}
