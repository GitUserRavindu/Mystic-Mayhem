package characters.subcategories.mythicals;

import characters.Mythical;

public class Mythical4 extends Mythical {

    @Override
    public String getName() {
        return "Phoenix";
    }

    @Override
    protected void initStats() {
        price = 275;
        atk = 17;
        def = 13;
        hp = 17;
        spd = 19;
    }

}
