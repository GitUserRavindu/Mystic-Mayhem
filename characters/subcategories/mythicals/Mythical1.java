package characters.subcategories.mythicals;

import characters.Mythical;

public class Mythical1 extends Mythical {

    @Override
    public String getName() {
        return "Dragon";
    }

    @Override
    protected void initStats() {
        price = 120;
        atk = 12;
        def = 14;
        hp = 15;
        spd = 8;
    }

}
