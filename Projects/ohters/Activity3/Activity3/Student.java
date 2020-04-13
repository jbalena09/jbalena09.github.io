/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student {

    private int id;
    private int credits;
    private int points;

    Student() {

    }
    
    //mutators
    public void setId(int ID) {
        this.id = ID;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    //accessors
    public Integer getId() {
        return this.id;
    }

    public Integer getCredits() {
        return this.credits;
    }

    public Integer getPoints() {
        return this.points;
    }
    
    //computation
    public double average() {
        return (double) points / credits;
    }

}
