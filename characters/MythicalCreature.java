package characters;

public class MythicalCreature extends Character{

    public MythicalCreature (String name) {
        this.name = name;
        switch (name) {
            case "Dragon":
                price = 120;
                atk = 12; def = 14; hp = 15; spd = 8;
                break;
            case "Basilisk":
                price = 165;
                atk = 15; def = 11; hp = 10; spd = 12;
                break;
            case "Hydra":
                price = 205;
                atk = 12; def = 16; hp = 15; spd = 11;
                break;
            case "Phoenix":
                price = 275;
                atk = 17; def = 13; hp = 17; spd = 19;
                break;
            case "Pegasus":
                price = 340;
                atk = 14; def = 18; hp = 20; spd = 20;
                break;
        }
    }

    @Override
    public String getCategory () {
        return "Mythical Creature";
    }
    
}
