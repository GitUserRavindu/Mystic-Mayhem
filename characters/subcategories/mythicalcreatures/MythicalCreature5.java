package characters.subcategories.mythicalcreatures;

import characters.MythicalCreature;

public class MythicalCreature5 extends MythicalCreature {

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
