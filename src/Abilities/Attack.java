package Abilities;
/*
 *author: Guruprem Rajpal
 *date: 22 Mar 2021
 *Description: Strategy
 */

import Monsters.Monster;

public interface Attack extends Ability {

    Integer attack(Monster target);

}
