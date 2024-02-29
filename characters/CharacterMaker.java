package characters;

import characters.subcategories.*;

public final class CharacterMaker {

    private CharacterMaker() {}  // Cannot be Instantiated

    public static Character newCharacter(String category, String name) {    // Factory design pattern
        switch (category) {
            case Archer.getCategory():
                return newArcher(name);
                break;
            case Knight.getCategory():
                return newKnight(name);
                break;
            case Mage.getCategory():
                return newMage(name);
                break;
            case Healer.getCategory():
                return newHealer(name);
                break;
            case Mythical.getCategory():
                return newMythical(name);
                break;
            default:
                throw new IllegalArgumentException("Unknown Character Type");
        }
    }

    public static Archer newArcher(String name) {
        switch (name) {
            case Archer1.getName():
                return new Archer1();
                break;
            case Archer2.getName():
                return new Archer2();
                break;
            case Archer3.getName():
                return new Archer3();
                break;
            case Archer4.getName():
                return new Archer4();
                break;
            case Archer5.getName():
                return new Archer5();
                break;
            default:
                throw new IllegalArgumentException("Unknown Name")
        }
    }

    public static Knight newKnight(String name) {
        switch (name) {
            case Knight1.getName():
                return new Knight1();
                break;
            case Knight2.getName():
                return new Knight2();
                break;
            case Knight3.getName():
                return new Knight3();
                break;
            case Knight4.getName():
                return new Knight4();
                break;
            case Knight5.getName():
                return new Knight5();
                break;
            default:
                throw new IllegalArgumentException("Unknown Name");
        }
    }

    public static Mage newMage(String name) {
        switch (name) {
            case Mage1.getName():
                return new Mage1();
                break;
            case Mage2.getName():
                return new Mage2();
                break;
            case Mage3.getName():
                return new Mage3();
                break;
            case Mage4.getName():
                return new Mage4();
                break;
            case Mage5.getName():
                return new Mage5();
                break;
            default:
                throw new IllegalArgumentException("Unknown Name");
        }
    }

    public static Healer newHealer(String name) {
        switch (name) {
            case Healer1.getName():
                return new Healer1();
                break;
            case Healer2.getName():
                return new Healer2();
                break;
            case Healer3.getName():
                return new Healer3();
                break;
            case Healer4.getName():
                return new Healer4();
                break;
            case Healer5.getName():
                return new Healer5();
                break;
            default:
                throw new IllegalArgumentException("Unknown Name");
        }
    }

    public static Mythical newMythical(String name) {
        switch (name) {
            case Mythical1.getName():
                return new Mythical1();
                break;
            case Mythical2.getName():
                return new Mythical2();
                break;
            case Mythical3.getName():
                return new Mythical3();
                break;
            case Mythical4.getName():
                return new Mythical4();
                break;
            case Mythical5.getName():
                return new Mythical5();
                break;
            default:
                throw new IllegalArgumentException("Unknown Name");
        }
    }
}
