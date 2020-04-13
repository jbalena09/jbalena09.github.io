/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ShowStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(181152612);
        student.setCredits(3);
        student.setPoints(12);
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Credits: " + student.getCredits());
        System.out.println("Student Points: " + student.getPoints());
        System.out.println("Student Average: " + student.average());

    }
}
