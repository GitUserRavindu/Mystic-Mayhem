package characters;

public class Mage extends Character {

    public Mage (String name) {
        this.name = name;
        switch (name) {
            case "Warlock":
                price = 100;
                atk = 12; def = 7; hp = 10; spd = 12;
                break;
            case "Illusionist":
                price = 120;
                atk = 13; def = 8; hp = 12; spd = 14;
                break;
            case "Enchanter":
                price = 160;
                atk = 16; def = 10; hp = 13; spd = 16;
                break;
            case "Conjurer":
                price = 195;
                atk = 18; def = 15; hp = 14; spd = 12;
                break;
            case "Eldritch":
                price = 270;
                atk = 19; def = 17; hp = 18; spd = 14;
                break;
        }
    }

    @Override
    public String getCategory () {
        return "Mage";
    }
    
}
