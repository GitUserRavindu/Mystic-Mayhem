package equipment.subcategories.artefacts;

import equipment.Artefact;

public class Amulet extends Artefact {
    
    @Override
    public String getName() {
        return "Amulet";
    }

    @Override
    protected void initStats() {
        price = 200;
        atk = 1;
        def = -1;
        hp = 1;
        spd = 1;
    }
    
}
