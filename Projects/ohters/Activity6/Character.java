
/**
 * The Character class models a character for a roleplaying game. A character
 * has a name and 3 stats: strength, dexterity, and intelligence, as well as
 * maximum allowed life points and the current value.
 */
public abstract class Character  {

    /**
     * static variables
     */
    static Dice dice = new Dice();

    /**
     * instance variables
     */
    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int maxlife;
    protected int currentlife;
    protected int armor;

    /**
     * Constructor takes 4 parameters: n,s,d,i and assigns them to instance
     * variables name, strength, dexterity, intelligence. Also uses the dice
     * instance to assign a random number to maxlife. currentlife is initialized
     * to maxlife
     */
    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxlife = s * 5;
        this.armor = 0;
        this.currentlife = this.maxlife;
    }

    public Character(String n, int s, int d, int i, int a) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxlife = s * 5;
        this.armor = a;
        this.currentlife = this.maxlife;
    }

    /**
     * Returns a random die roll using the roll method in the Dice.java,
     * *modified by the character's strength
     */
    public int attack() {
        int x = this.dice.roll() + this.dexterity;
        return x;
    }

    /**
     * Decreases currentlife by the damage parameter
     */
    public void wound(int damage) {
        int x = this.currentlife - damage;
        if (x > 0) {
            this.currentlife = x;
        } else if (x <= 0) {
            this.currentlife = 0;
        }
    }

    /**
     * Increases currentlife by the heal parameter. currentlife cannot be
     * greater than maxlife
     */
    public int heal(int heal) {
        int x = this.intelligence + heal;
        this.currentlife += x;
        if (currentlife < maxlife) {
            return x;
        } else if (currentlife > maxlife) {
            this.currentlife = this.maxlife;
            return x;
        } else {
            this.currentlife = this.maxlife;
            return 0;
        }
    }

    /**
     * Returns name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns strength
     */
    public int getStrength() {
        return this.strength;
    }

    /**
     * Returns dexterity
     */
    public int getDexterity() {
        return this.dexterity;
    }

    /**
     * Returns intelligence
     */
    public int getIntelligence() {
        return this.intelligence;
    }

    /**
     * Returns currentlife
     */
    public int getCurrentLife() {
        return this.currentlife;
    }

    /**
     * Returns maxlife
     */
    public int getMaxLife() {
        return this.maxlife;
    }
    
    public abstract int summonpet();
}
