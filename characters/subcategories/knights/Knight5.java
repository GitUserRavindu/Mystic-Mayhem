package characters.subcategories.knights;

import characters.Knight;

public class Knight5 extends Knight {

    @Override
    public String getName() {
        return "Swiftblade";
    }

    @Override
    protected void initStats() {
        price = 250;
        atk = 18;
        def = 20;
        hp = 17;
        spd = 13;
    }

}
