/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Thief extends Character implements Summon {

    private int stamina;
    private int evadeDamage = 0;
    
    public Thief(String n, int s, int i) {
        super(n, s, 25, i, 3);
        stamina = 20;
    }

    public int evade() {
        int x = this.dexterity - super.dice.roll();
        int evade = 0;
        if (stamina <= 5) {
            evade = 0;
        } else {
            evade = x + this.evadeDamage;
        }
        stamina -= 6;
        return evade;
    }

    @Override
    public void wound(int damage) {
        int x = (this.currentlife + this.armor) - damage;
        if (x > 0) {
            this.currentlife = x;
        } else if (x <= 0) {
            this.currentlife = 0;
        }
    }

    @Override
    public int summonpet() {
        return dice.roll() + 1;
    }

    @Override
    public void petability() {
        int x = summonpet();
        // summon successful and evade + 5;
        if (x % 2 == 1) {
            System.out.println(super.getName() + " summons a Hound Dog! Evade reduces additional 5 damage permanently!");
            this.evadeDamage += 5;
        } else {
            System.out.println(super.getName() + " fails to summon pet!");
        }
    }
}
