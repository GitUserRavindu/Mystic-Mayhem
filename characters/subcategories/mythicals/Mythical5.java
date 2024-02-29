package characters.subcategories.mythicals;

import characters.Mythical;

public class Mythical5 extends Mythical {

    @Override
    public String getName() {
        return "Pegasus";
    }

    @Override
    protected void initStats() {
        price = 340;
        atk = 14;
        def = 18;
        hp = 20;
        spd = 20;
    }

}
