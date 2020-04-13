/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Mage extends Character implements Summon{

    private int manapoints;
    private int fireballDamage = 0;

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
            damage = x + this.fireballDamage;
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

    @Override
    public int summonpet() {
        return dice.roll()-1;
    }

    @Override
    public void petability() {
        int x = summonpet();
        // summon successful and fireball damage + 5;
        if (x % 2 == 0){
            System.out.println(super.getName() + " summons a Phoenix! Fireball damage is permanently increased by 5!");
            this.fireballDamage =+ 5;
            
        }else{
            System.out.println(super.getName() + " fails to summon pet!");
        }
        
    }

}
