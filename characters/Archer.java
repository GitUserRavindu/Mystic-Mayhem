package characters;

public class Archer extends Character {

    public Archer (String name) {
        this.name = name;
        switch (name) {
            case "Shooter":
                price = 80;
                atk = 11; def = 4; hp = 6; spd = 9;
                break;
            case "Ranger":
                price = 115;
                atk = 14; def = 5; hp = 8; spd = 10;
                break;
            case "Sunfire":
                price = 160;
                atk = 15; def = 5; hp = 7; spd = 14;
                break;
            case "Zing":
                price = 200;
                atk = 16; def = 9; hp = 11; spd = 14;
                break;
            case "Saggitarius":
                price = 230;
                atk = 18; def = 7; hp = 12; spd = 17;
                break;
        }
    }

    @Override
    public String getCategory () {
        return "Archer";
    }
}