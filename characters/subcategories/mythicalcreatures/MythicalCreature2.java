package characters.subcategories.mythicalcreatures;

import characters.MythicalCreature;

public class MythicalCreature2 extends MythicalCreature {

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
