package characters.subcategories.archers;

import characters.Archer;

public class Archer1 extends Archer {

    @Override
    public String getName() {
        return "Shooter";
    }

    @Override
    protected void initStats() {
        price = 80;
        atk = 11;
        def = 4;
        hp = 6;
        spd = 9;
    }

}
