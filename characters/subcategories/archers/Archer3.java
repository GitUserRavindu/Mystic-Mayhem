package characters.subcategories.archers;

import characters.Archer;

public class Archer3 extends Archer {

    @Override
    public String getName() {
        return "Sunfire";
    }

    @Override
    protected void initStats() {
        price = 160;
        atk = 15;
        def = 5;
        hp = 7;
        spd = 14;
    }

}
