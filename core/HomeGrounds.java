package core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import characters.Character;

public class HomeGrounds {
    
    public enum HomeGround{
        HILLCREST("Hillcrest", "Highlanders"),
        MARSHLAND("Marshland", "Marshlanders"),
        DESERT("Desert", "Sunchildren"),
        ARCANE("Arcane", "Mystics");

        private String name;
        private String affinityName;

        HomeGround(String name, String affinityName) {
            this.name = name;
            this.affinityName = affinityName;
        }

        public String getName() {
            return name;
        }

        public String getAffinityName() {
            return affinityName;
        }
    }

    private static HashMap<HomeGround, HashSet<String>> affinity = new HashMap<>();

    static {
        affinity.put(HomeGround.HILLCREST, new HashSet<>());
        affinity.put(HomeGround.MARSHLAND, new HashSet<>());
        affinity.put(HomeGround.DESERT, new HashSet<>());
        affinity.put(HomeGround.ARCANE, new HashSet<>());

        // Archers
        affinity.get(HomeGround.HILLCREST).add("Shooter");
        affinity.get(HomeGround.HILLCREST).add("Ranger");
        affinity.get(HomeGround.DESERT).add("Sunfire");
        affinity.get(HomeGround.DESERT).add("Zing");
        affinity.get(HomeGround.ARCANE).add("Saggitarius");
        
        // Knights
        affinity.get(HomeGround.MARSHLAND).add("Squire");
        affinity.get(HomeGround.HILLCREST).add("Cavalier");
        affinity.get(HomeGround.HILLCREST).add("Templar");
        affinity.get(HomeGround.HILLCREST).add("Swiftblade");
        affinity.get(HomeGround.MARSHLAND).add("Zoro");
        
        // Mages
        affinity.get(HomeGround.MARSHLAND).add("Warlock");
        affinity.get(HomeGround.ARCANE).add("Illusionist");
        affinity.get(HomeGround.HILLCREST).add("Enchanter");
        affinity.get(HomeGround.HILLCREST).add("Conjurer");
        affinity.get(HomeGround.ARCANE).add("Eldritch");
        
        // Healers
        affinity.get(HomeGround.DESERT).add("Soother");
        affinity.get(HomeGround.HILLCREST).add("Medic");
        affinity.get(HomeGround.ARCANE).add("Alchemist");
        affinity.get(HomeGround.ARCANE).add("Saint");
        affinity.get(HomeGround.DESERT).add("Lightbringer");
        
        // Mythical Creatures
        affinity.get(HomeGround.DESERT).add("Dragon");
        affinity.get(HomeGround.MARSHLAND).add("Basilisk");
        affinity.get(HomeGround.MARSHLAND).add("Hydra");
        affinity.get(HomeGround.DESERT).add("Phoenix");
        affinity.get(HomeGround.ARCANE).add("Pegasus");
    }

    public static boolean isHomeGround(HomeGround homeGround, String name) {
        return affinity.get(homeGround).contains(name);
    }

    public static void updateCharacterStats(Character character, HomeGround homeGround) {
        String name = character.getName();
        switch (homeGround) {
            case HILLCREST:
                if (isHomeGround(HomeGround.HILLCREST, name)) {
                    character.addAttack(1);
                    character.addDefense(1);}
                if (isHomeGround(HomeGround.MARSHLAND, name)) character.addSpeed(-1);
                if (isHomeGround(HomeGround.DESERT, name)) character.addSpeed(-1);
                break;
            case MARSHLAND:
                if (isHomeGround(HomeGround.MARSHLAND, name)) character.addDefense(2);
                if (isHomeGround(HomeGround.DESERT, name)) character.addAttack(-1);
                if (isHomeGround(HomeGround.ARCANE, name)) character.addSpeed(-1);
                break;
            case DESERT:
                if (isHomeGround(HomeGround.DESERT, name)) character.addAttack(1);
                if (isHomeGround(HomeGround.MARSHLAND, name)) character.addHealth(-1);
                break;
            case ARCANE:
                if (isHomeGround(HomeGround.ARCANE, name)) character.addAttack(2);
                if (isHomeGround(HomeGround.HILLCREST, name) || isHomeGround(HomeGround.MARSHLAND, name)) {
                    character.addSpeed(-1);
                    character.addDefense(-1);}
                break;
            default:
                break;
        }
    }

    public static HomeGround getHomeGround(Character character) {
        String name = character.getName();
        if (isHomeGround(HomeGround.HILLCREST, name)) return HomeGround.HILLCREST;
        if (isHomeGround(HomeGround.MARSHLAND, name)) return HomeGround.MARSHLAND;
        if (isHomeGround(HomeGround.DESERT, name)) return HomeGround.DESERT;
        if (isHomeGround(HomeGround.ARCANE, name)) return HomeGround.ARCANE;
        return null;
    }

    public static void homeGroundBonus(HomeGround homeGround, PriorityQueue<Character> attackerSPD, PriorityQueue<Character> attackerHP, Character attacker, PriorityQueue<Character> defenderSPD, PriorityQueue<Character> defenderHP) {
        if (!(getHomeGround(attacker) == homeGround)) return;
        
        switch (getHomeGround(attacker)) {
            case HILLCREST:
                System.out.println("Highlander - Bonus Turn:");
                attacker.addAttack(-attacker.getAttack()*0.8); // Attacks at 0.2 x Normal Attack
                Combat.battleMove(attackerSPD, attackerHP, attacker, defenderSPD, defenderHP);
                attacker.addAttack(attacker.getAttack()*5);  // Return to Normal
                break;
            case ARCANE:
                System.out.println("Mystic - HP Increase:");
                attacker.addHealth(attacker.getHealth()*0.1);
                System.out.println("Heal Message");
                Combat.addToQueues(attackerSPD, attackerHP, attacker);
            default:
                break;
        }
    }

}