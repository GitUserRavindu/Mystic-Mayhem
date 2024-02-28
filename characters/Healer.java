package characters;

public class Healer extends Character {

    public Healer (String name) {
        this.name = name;
        switch (name) {
            case "Soother":
                price = 95;
                atk = 10; def = 8; hp = 9; spd = 6;
                break;
            case "Medic":
                price = 125;
                atk = 12; def = 9; hp = 10; spd = 7;
                break;
            case "Alchemist":
                price = 150;
                atk = 13; def = 13; hp = 13; spd = 13;
                break;
            case "Saint":
                price = 200;
                atk = 16; def = 14; hp = 17; spd = 9;
                break;
            case "Lightbringer":
                price = 260;
                atk = 17; def = 15; hp = 19; spd = 12;
                break;
        }
    }

    @Override
    public String getCategory () {
        return "Healer";
    }
}
