/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Knight extends Character {

    private int durability;

    public Knight(String n, int d, int i) {
        super(n, 25, d, i, 5);
        this.durability = 20;
    }

    public int block() {
        if (this.durability == 0) {
            return 0;
        }
        durability -= 10;
        return 1;
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
