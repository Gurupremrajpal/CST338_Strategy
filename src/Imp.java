/*
 *author: Guruprem Rajpal
 *date: 20 Mar 2021
 *Description: Strategy
 */
import java.util.HashMap;

public class Imp extends Monster{
    public Imp(int maxHP, int xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);
    }

    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }
}
