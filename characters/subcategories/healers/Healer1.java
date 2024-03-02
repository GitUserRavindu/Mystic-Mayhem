package characters.subcategories.healers;

import characters.Healer;

public class Healer1 extends Healer {
    
    @Override
    public String getName() {
        return "Soother";
    }
    
    @Override
    protected void initStats() {
        price = 95;
        atk = 10;
        def = 8;
        hp = 9;
        spd = 6;
    }
    
}