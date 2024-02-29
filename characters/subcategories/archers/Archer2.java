package characters.subcategories.archers;

import characters.Archer;

public class Archer2 extends Archer {

    @Override
    public String getName() {
        return "Ranger";
    }

    @Override
    protected void initStats() {
        price = 115;
        atk = 14;
        def = 5;
        hp = 8;
        spd = 10;
    }

}
