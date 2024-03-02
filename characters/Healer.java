package characters;

import characters.interfaces.IHealer;

public abstract class Healer extends Character implements IHealer {

    @Override
    public String getCategory () {
        return "Healer";
    }

    public void heal(Character character) {
        character.getAttack();
    }
}
