package equipment.subcategories.artefacts;

import equipment.Artefact;

public class Crystal extends Artefact {
    
    @Override
    public String getName() {
        return "Crystal";
    }

    @Override
    protected void initStats() {
        price = 210;
        atk = 2;
        def = 1;
        hp = -1;
        spd = -1;
    }

}
