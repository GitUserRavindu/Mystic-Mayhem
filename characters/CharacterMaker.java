package characters;

import characters.subcategories.archers.*;
import characters.subcategories.knights.*;

public final class CharacterMaker {    // Factory design pattern

    private CharacterMaker() {}  // Cannot be Instantiated

    public static Character newCharacter(String category, int tier) {
        switch (category) {
            case "Archer" :
                return newArcher(tier);
            case "Knight" :
                return newKnight(tier);
            default:
                throw new IllegalArgumentException("Unknown Character Type");
        }
    }

    private static Archer newArcher(int tier) {
        switch (tier) {
            case 1:
                return new Archer1();
            case 2:
                return new Archer2();
            case 3:
                return new Archer3();
            case 4:
                return new Archer4();
            case 5:
                return new Archer5();
            default:
                throw new IllegalArgumentException("Unknown Tier");
        }
    }
    private static Knight newKnight(int tier) {
        switch (tier) {
            case 1:
                return new Knight1();
            case 2:
                return new Knight2();
            case 3:
                return new Knight3();
            case 4:
                return new Knight4();
            case 5:
                return new Knight5();
            default:
                throw new IllegalArgumentException("Unknown Tier");
        }
    }
    /*

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
*/
}
