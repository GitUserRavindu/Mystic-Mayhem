package characters.subcategories.mythicalcreatures;

import characters.MythicalCreature;

public class MythicalCreature1 extends MythicalCreature {

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
