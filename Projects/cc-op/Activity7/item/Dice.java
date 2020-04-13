package item;


import java.util.Random;
/**
 * The class dice that works like a
 * true dice.
 */
public class Dice {

    private Random r;
    /**
    *  The constructor instantiate variable
    *  r as an object from the Random Class.
    */
    public Dice() {
        r = new Random();

    }
    /**
     * The roll method returns a random value from 1 - 6 like a dice.
     */
    public int roll() {
        return r.nextInt(6) + 1;
    }
}
