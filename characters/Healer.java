package characters;

import characters.interfaces.IHealer;

public abstract class Healer extends Character implements IHealer {

    @Override
    public String getCategory () {
        return "Healer";
    }
    
    @Override
    public void heal(Character target) {
        double healing = 0.5*getAttack();
        target.addHealth(-healing);
    }

    @Override
    public void attack(Character character) {
        throw new IllegalArgumentException("Healer cannot Attack");
    }
}
