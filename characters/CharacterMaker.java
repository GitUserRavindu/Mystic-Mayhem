package characters;

import characters.subcategories.archers.*;
import characters.subcategories.knights.*;
import characters.subcategories.mages.*;
import characters.subcategories.healers.*;
import characters.subcategories.mythicalcreatures.*;

public final class CharacterMaker {    // Factory design pattern

    private CharacterMaker() {}  // Cannot be Instantiated

    public static Character newCharacter(String category, int tier) {
        switch (category) {
            case "Archer" :
                return newArcher(tier);
            case "Knight" :
                return newKnight(tier);
            case "Mage" :
                return newHealer(tier);
            case "Healer" :
                return newHealer(tier);
            case "Mythical Creature" :
                return newHealer(tier);
            default:
                throw new IllegalArgumentException("Invalid Category");
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
                throw new IllegalArgumentException("Invalid Tier");
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
                throw new IllegalArgumentException("Invalid Tier");
        }
    }

    public static Mage newMage(int tier) {
        switch (tier) {
            case 1:
                return new Mage1();
            case 2:
                return new Mage2();
            case 3:
                return new Mage3();
            case 4:
                return new Mage4();
            case 5:
                return new Mage5();
            default:
                throw new IllegalArgumentException("Invalid Tier");
        }
    }
    
    public static Healer newHealer(int tier) {
        switch (tier) {
            case 1:
                return new Healer1();
            case 2:
                return new Healer2();
            case 3:
                return new Healer3();
            case 4:
                return new Healer4();
            case 5:
                return new Healer5();
            default:
                throw new IllegalArgumentException("Invalid Tier");
        }
    }
    
    public static MythicalCreature newMythicalCreature(int tier) {
        switch (tier) {
            case 1:
                return new MythicalCreature1();
            case 2:
                return new MythicalCreature2();
            case 3:
                return new MythicalCreature3();
            case 4:
                return new MythicalCreature4();
            case 5:
                return new MythicalCreature5();
            default:
                throw new IllegalArgumentException("Invalid Tier");
        }
    }
}
