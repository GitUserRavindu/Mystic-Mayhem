package characters.subcategories.archers;

import characters.Archer;

public class Archer4 extends Archer {

    @Override
    public String getName() {
        return "Zing";
    }

    @Override
    protected void initStats() {
        price = 200;
        atk = 16;
        def = 9;
        hp = 11;
        spd = 14;
    }

}
