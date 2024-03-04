package characters.subcategories.mythicalcreatures;

import characters.MythicalCreature;

public class MythicalCreature4 extends MythicalCreature {

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
