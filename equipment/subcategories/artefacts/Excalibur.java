package equipment.subcategories.artefacts;

import equipment.Artefact;

public class Excalibur extends Artefact {
    
    @Override
    public String getName() {
        return "Excalibur";
    }

    @Override
    protected void initStats() {
        price = 150;
        atk = 2;
        def = 0;
        hp = 0;
        spd = 0;
    }

}
