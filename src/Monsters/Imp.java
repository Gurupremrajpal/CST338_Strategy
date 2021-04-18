package Monsters;
/*
 *author: Guruprem Rajpal
 *date: 20 Mar 2021
 *Description: Strategy
 */
import Abilities.MeleeAttack;

import java.util.HashMap;

public class Imp extends Monster{
    public Imp(int maxHP, int xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);
        //These should be stored in a HashMap
        // that way we can use an iterator
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        //this should use a data structure
        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Imp has : " + super.toString();
    }
}
