package characters.subcategories.healers;

import characters.Healer;

public class Healer3 extends Healer {
    
    @Override
    public String getName() {
        return "Alchemist";
    }
    
    @Override
    protected void initStats() {
        price = 150;
        atk = 13;
        def = 13;
        hp = 13;
        spd = 13;
    }
    
}