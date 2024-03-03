package core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import characters.Character;
import characters.interfaces.IHealer;
import core.HomeGrounds.HomeGround;

public final class Combat {
    
    private Combat() {}  // Cannot be Instantiated
    
    public static String battle(Player challenger, Player opponent) {
        // Manage Order of HP and speed of both sides
        
        Army challengerArmy = challenger.getArmy();
        Army opponentArmy = opponent.getArmy();

        HomeGround homeGround = opponent.getHomeGround();

        PriorityQueue<Character> challengerSPD = new PriorityQueue<>(Comparator.comparingInt(Character::getSpeed).reversed());
        PriorityQueue<Character> challengerHP = new PriorityQueue<>(Comparator.comparingDouble(Character::getHealth));

        PriorityQueue<Character> opponentSPD = new PriorityQueue<>(Comparator.comparingInt(Character::getSpeed).reversed());
        PriorityQueue<Character> opponentHP = new PriorityQueue<>(Comparator.comparingDouble(Character::getHealth));

        for (Character character : challengerArmy.getCharacters()) {
            // Set home ground here
            HomeGrounds.updateCharacterStats(character, homeGround);
            addToQueues(challengerSPD, challengerHP, character);
        }
        for (Character character : opponentArmy.getCharacters()) {
            HomeGrounds.updateCharacterStats(character, homeGround);
            addToQueues(opponentSPD, opponentHP, character);
        }




        for (int i = 0; i < 10; ++i) {

            if (challengerSPD.isEmpty()) break;
            System.out.println("< Round " + (i+1) + " >");
            System.out.print(challenger.getName() + "'s Turn: ");

            Character attacker = challengerSPD.peek();
            battleMove(challengerSPD, challengerHP, attacker, opponentSPD, opponentHP);
            HomeGrounds.homeGroundBonus(homeGround, challengerSPD, challengerHP, attacker, opponentSPD, opponentHP);

            if (opponentSPD.isEmpty()) break;
            System.out.print(opponent.getName() + "'s Turn: ");
            
            attacker = opponentSPD.peek();
            battleMove(opponentSPD, opponentHP, attacker, challengerSPD, challengerHP);
            HomeGrounds.homeGroundBonus(homeGround, challengerSPD, challengerHP, attacker, opponentSPD, opponentHP);

        }

        challengerArmy.reset();
        opponentArmy.reset();

        if (opponentSPD.isEmpty()) return "Win!";
        if (challengerSPD.isEmpty()) return "Loss!";
        return "Draw";
    }

    public static void battleMove(PriorityQueue<Character> attackerSPD, PriorityQueue<Character> attackerHP, Character attacker, PriorityQueue<Character> defenderSPD, PriorityQueue<Character> defenderHP) {

        Character target;

        // Implement taking turns
        // If army is at full health, move to next in Queue and execute Home bonus

        if (attacker instanceof IHealer) {
            target = attackerHP.poll();

            List<Character> maxHP = new ArrayList<>();      // Skip characters that are at max HP
            while (target != null && target.atMaxHP()) {
                maxHP.add(target);
                target = attackerHP.poll();
            }
            for (Character character : maxHP) {
                attackerHP.add(character);
            }

            if (target != null) {
                ((IHealer)attacker).heal(target);
                updateQueues(attackerSPD, attackerHP, target);
                return;
            }
            /*
            Character healer = attackerSPD.poll();        // Move on to an attacker instead
            attacker = attackerSPD.peek();                // homeGroundBonus() implementation needs to be modified for this to work properly
            attackerSPD.add(healer);
            */
            System.out.println(attacker.getNameAndCategory() + " army is at full health.");
            return;
        }
        target = defenderHP.poll();
        attacker.attack(target);
        updateQueues(defenderSPD, defenderHP, target);
        
    }

    public static void updateQueues(PriorityQueue<Character> SPD, PriorityQueue<Character> HP, Character character) {
        if (character.getHealth() <= 0) {
            SPD.remove(character);
            return;
        }
        HP.add(character);
    }

    public static void addToQueues(PriorityQueue<Character> SPD, PriorityQueue<Character> HP, Character character) {
        SPD.add(character);
        HP.add(character);
    }

}