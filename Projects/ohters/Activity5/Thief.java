/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Thief extends Character {

    private int stamina;

    public Thief(String n, int s, int i) {
        super(n, s, 25, i, 3);
        stamina = 20;
    }

    public int evade() {
        int x = this.dexterity - super.dice.roll();
        int evade = 0;
        if (stamina <= 5){
            evade = 0;
        }else{
            evade = x;
        }
        stamina -=6;
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
}
