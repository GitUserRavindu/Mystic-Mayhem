package characters.subcategories.healers;

import characters.Healer;

public class Healer4 extends Healer {
    
    @Override
    public String getName() {
        return "Saint";
    }
    
    @Override
    protected void initStats() {
        price = 200;
        atk = 16;
        def = 14;
        hp = 17;
        spd = 9;
    }
    
}