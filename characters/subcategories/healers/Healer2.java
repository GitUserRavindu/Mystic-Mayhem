package characters.subcategories.healers;

import characters.Healer;

public class Healer2 extends Healer {
    
    @Override
    public String getName() {
        return "Medic";
    }
    
    @Override
    protected void initStats() {
        price = 125;
        atk = 12;
        def = 9;
        hp = 10;
        spd = 7;
    }
    
}