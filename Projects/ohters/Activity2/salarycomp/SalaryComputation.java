/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycomp;

import java.text.DecimalFormat;

/**
 *
 * @author m304user
 */
public class SalaryComputation {

    public static void main(String[] args) {
          DecimalFormat df = new DecimalFormat("#.##");
        SimpleEmployee emp1 = new SimpleEmployee();
        emp1.setName("John");
        emp1.setWeeklyGross(30121.112);
        emp1.setClassification(classify(emp1.getBonusRate() + emp1.getFixedSalary()));
        System.out.println("*****SNOW ENTERPRISES*****");
        System.out.println("Employee name: " + emp1.getName());
        System.out.println("Gross Salary: " + emp1.getWeeklyGross());
        System.out.println("Bonus: " + emp1.getBonusRate());
        System.out.println("Net Weekly Salary : " + df.format(netweekly( emp1.getBonusRate() + emp1.getFixedSalary())) + 
                           "\nClassification: " + emp1.getClassification());
        
        System.out.println("");
        
        SimpleEmployee emp2 = new SimpleEmployee();
        emp2.setName("Jake");
        emp2.setWeeklyGross(10821.37);
        emp2.setClassification(classify(emp2.getBonusRate() + emp2.getFixedSalary()));
        System.out.println("*****SNOW ENTERPRISES*****");
        System.out.println("Employee name: " + emp2.getName());
        System.out.println("Gross Salary: " + emp2.getWeeklyGross());
        System.out.println("Bonus: " + emp2.getBonusRate());
        System.out.println("Net Weekly Salary : " + df.format(netweekly( emp2.getBonusRate() + emp2.getFixedSalary())) + 
                            "\nClassification: " + emp2.getClassification());
    }

    public static double netweekly(double bonus) {
        classify(bonus);
        return bonus;
    }

    public static String classify(double sales) {
        String classi = "";
        int s[] = {1500, 2000, 2500, 3000, 3500, 4000,99999999};
        String arr[] = {"A","B","C","D","E","F"};
        for (int i = 0; i < s.length-1; i++) {
            if(sales >= s[i] && sales <= s[i+1]-1){
                classi += arr[i];
            }
        }
        return classi;
    }
}
