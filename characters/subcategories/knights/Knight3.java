package characters.subcategories.knights;

import characters.Knight;

public class Knight3 extends Knight {

    @Override
    public String getName() {
        return "Templar";
    }

    @Override
    protected void initStats() {
        price = 155;
        atk = 14;
        def = 16;
        hp = 12;
        spd = 12;
    }

}
