package Monsters;
/*
 *author: Guruprem Rajpal
 *date: 20 Mar 2021
 *Description: Strategy
 */
import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class Monster {

    private int hp;
    private int xp;
    private int maxHP;
    private HashMap<String, Integer> items;
    Integer agility=10;
    Integer defense=10;
    Integer strength=10;
    Attack attack;

    public Integer getAgility() {
        return agility;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getStrength() {
        return strength;
    }

    public Attack getAttack() {
        return attack;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }

    Boolean takeDamage(Integer damage){
        if(damage>=0){
           hp=hp-damage;
            System.out.println("The creature was hit for "+damage+" damage");
        }
        if(hp<=0){
            hp=0;
            System.out.println("Oh no! the creature has perished");

        }
        System.out.println(this.toString());
        if(hp>=0) {
            return true;
        }
        else{
            return false;
        }

    }

    public Integer attackTarget(Monster target){
        if (hp<=0){
            attack.attack(target);
            target.takeDamage(0);
            return 0;
        }

        else {
            Integer integer = attack.attack(target);
            target.takeDamage(integer);
            return integer;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public int getMaxHP() {
        return maxHP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return getHp() == monster.getHp() && getXp() == monster.getXp() && getMaxHP() == monster.getMaxHP() && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    @Override
    public String toString() {
        return  "hp=" + hp + "/" +maxHP;
    }

    public Monster(int maxHP, int xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }
}
