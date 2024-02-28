package core;

public abstract class GameItem {

    protected String name;
    protected short price;
    protected byte atk, def, hp, spd;

    // Getters

    public String getName() {
        return name;
    }
    public short getPrice() {
        return price;
    }
    public byte getAttack() {
        return atk;
    }
    public byte getDefense() {
        return def;
    }
    public byte getHealth() {
        return hp;
    }
    public byte getSpeed() {
        return spd;
    }

    // Setters
    
    protected void setPrice(short price) {
        this.price = price;
    }
    protected void setAttack(byte atk) {
        this.atk = atk;
    }
    protected void setDefense(byte def) {
        this.def = def;
    }
    protected void setHealth(byte hp) {
        this.hp = hp;
    }
    protected void setSpeed(byte spd) {
        this.spd = spd;
    }
    protected void setTraits(byte atk, byte def, byte hp, byte spd) {
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.spd = spd;
    }

    // Modify Values

    public void addPrice(short change) {
        price += change;
    }
    public void addAttack(byte change) {
        atk += change;
    }
    public void addDefense(byte change) {
        def += change;
    }
    public void addHealth(byte change) {
        hp += change;
    }
    public void addSpeed(byte change) {
        spd += change;
    }
    
}