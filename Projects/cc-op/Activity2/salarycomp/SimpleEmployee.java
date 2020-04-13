/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycomp;


public class SimpleEmployee {

    private String name;
    private double fixedsalary;
    private double setweeklygross;
    private String classification;
    private double bonus;
    
    
    SimpleEmployee(){
        this.fixedsalary = 1500;
        this.bonus = 0.085;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWeeklyGross(double weeklysales) {
        this.setweeklygross = weeklysales;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getName() {
        return this.name;
    }

    public double getWeeklyGross() {
        return this.setweeklygross;
    }

    public double getFixedSalary() {
        return this.fixedsalary;
    }

    public String getClassification() {
        return this.classification;
    }

    double getBonusRate() {
       return this.setweeklygross * this.bonus;
    }
}
