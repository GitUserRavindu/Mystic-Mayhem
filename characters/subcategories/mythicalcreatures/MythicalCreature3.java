package characters.subcategories.mythicalcreatures;

import characters.MythicalCreature;

public class MythicalCreature3 extends MythicalCreature {

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
