package characters.subcategories.knights;

import characters.Knight;

public class Knight1 extends Knight {

    @Override
    public String getName() {
        return "Squire";
    }

    @Override
    protected void initStats() {
        price = 85;
        atk = 8;
        def = 9;
        hp = 7;
        spd = 8;
    }

}
