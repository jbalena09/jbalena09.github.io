/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Mage extends Character {

    private int manapoints;

    public Mage(String n, int s, int d) {
        super(n, s, d, 25, 2);
        this.manapoints = 20;
    }

    public int fireball() {
        int x = this.getIntelligence() + super.dice.roll();
        int damage = 0;
        if (this.manapoints <= 0) {
            damage = 0;
        } else {
            damage = x;
        }
        this.manapoints = this.manapoints - 5;
        return damage;
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

}
