/*
 *author: Guruprem Rajpal
 *date: 20 Mar 2021
 *Description: Strategy
 */
import java.util.HashMap;
import java.util.Objects;

public class Monster {

    private int hp;
    private int xp;
    private int maxHP;
    private HashMap<String, Integer> items;

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
