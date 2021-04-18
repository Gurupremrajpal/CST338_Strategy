package Monsters;
/*
 *author: Guruprem Rajpal
 *date: 20 Mar 2021
 *Description: Strategy
 */
import Abilities.RangedAttack;

import java.util.HashMap;

public class Kobold extends Monster{
    public Kobold(int maxHP, int xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);
        //These should be stored in a HashMap
        // that way we can use an iterator
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new RangedAttack(this);
        //this should use a data structure
        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}
