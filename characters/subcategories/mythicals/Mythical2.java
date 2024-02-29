package characters.subcategories.mythicals;

import characters.Mythical;

public class Mythical2 extends Mythical {

    @Override
    public String getName() {
        return "Basilisk";
    }

    @Override
    protected void initStats() {
        price = 165;
        atk = 15;
        def = 11;
        hp = 10;
        spd = 12;
    }

}
