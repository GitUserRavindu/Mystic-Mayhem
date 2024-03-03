package characters.subcategories.mages;

import characters.Mage;

public class Mage5 extends Mage {

    @Override
    public String getName() {
        return "Eldritch";
    }

    @Override
    protected void initStats() {
        price = 270;
        atk = 19;
        def = 17;
        hp = 18;
        spd = 14;
    }

}
