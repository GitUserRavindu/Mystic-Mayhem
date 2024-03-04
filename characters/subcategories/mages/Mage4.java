package characters.subcategories.mages;

import characters.Mage;

public class Mage4 extends Mage {

    @Override
    public String getName() {
        return "Conjurer";
    }

    @Override
    protected void initStats() {
        price = 195;
        atk = 18;
        def = 15;
        hp = 14;
        spd = 12;
    }

}
