package characters.subcategories.healers;

import characters.Healer;

public class Healer5 extends Healer {
    
    @Override
    public String getName() {
        return "Lightbringer";
    }
    
    @Override
    protected void initStats() {
        price = 260;
        atk = 17;
        def = 15;
        hp = 19;
        spd = 12;
    }
    
}