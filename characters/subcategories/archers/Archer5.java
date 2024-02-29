package characters.subcategories.archers;

import characters.Archer;

public class Archer5 extends Archer {

    @Override
    public String getName() {
        return "Saggitarius";
    }

    @Override
    protected void initStats() {
        price = 230;
        atk = 18;
        def = 7;
        hp = 12;
        spd = 17;
    }

}
