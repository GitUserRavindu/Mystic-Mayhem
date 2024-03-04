package characters.subcategories.knights;

import characters.Knight;

public class Knight2 extends Knight {

    @Override
    public String getName() {
        return "Cavalier";
    }

    @Override
    protected void initStats() {
        price = 110;
        atk = 10;
        def = 12;
        hp = 7;
        spd = 10;
    }

}
