package characters;

public class Knight extends Character {

    public Knight (String name) {
        this.name = name;
        switch (name) {
            case "Squire":
                price = 85;
                atk = 8; def = 9; hp = 7; spd = 8;
                break;
            case "Cavalier":
                price = 110;
                atk = 10; def = 12; hp = 7; spd = 10;
                break;
            case "Templar":
                price = 155;
                atk = 14; def = 16; hp = 12; spd = 12;
                break;
            case "Zoro":
                price = 180;
                atk = 17; def = 16; hp = 13; spd = 14;
                break;
            case "Swiftblade":
                price = 250;
                atk = 18; def = 20; hp = 17; spd = 13;
                break;
        }
    }

    @Override
    public String getCategory () {
        return "Knight";
    }
}
