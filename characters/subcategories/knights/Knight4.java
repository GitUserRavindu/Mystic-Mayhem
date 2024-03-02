package characters.subcategories.knights;

import characters.Knight;

public class Knight4 extends Knight {

    @Override
    public String getName() {
        return "Zoro";
    }

    @Override
    protected void initStats() {
        price = 180;
        atk = 17;
        def = 16;
        hp = 13;
        spd = 14;
    }

}
