package characters.subcategories.mythicals;

import characters.Mythical;

public class Mythical3 extends Mythical {

    @Override
    public String getName() {
        return "Hydra";
    }

    @Override
    protected void initStats() {
        price = 205;
        atk = 12;
        def = 16;
        hp = 15;
        spd = 11;
    }

}
