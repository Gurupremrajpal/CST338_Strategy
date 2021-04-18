package Abilities;
/*
 *author: Guruprem Rajpal
 *date: 22 Mar 2021
 *Description: Strategy
 */

import Monsters.Monster;

public class MeleeAttack implements Attack{
    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;

    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStrength() - target.getDefense();
    }
}
