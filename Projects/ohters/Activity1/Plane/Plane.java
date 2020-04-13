/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plane;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Plane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AirPlane plane = new AirPlane();
        int row, col;
        while (true) {
            System.out.println("Enter ticket type: ");
            System.out.println("[1] First Class");
            System.out.println("[2] Business Class");
            System.out.println("[3] Economy Class");
            int planeClass = in.nextInt();
            if (planeClass == 1) {
                System.out.println("Enter row[1-3]");
                row = in.nextInt();
                while (row > 3 || row < 0) {
                    System.out.println("Invalid row!");
                    System.out.print("Again: ");
                    row = in.nextInt();
                    if (row <= 3 && row >= 1) {
                        break;
                    }
                }
                System.out.println("Enter column[1-6]");
                col = in.nextInt();
                if (col > 6) {
                    System.out.println("Invalid seat");
                    break;
                }
                plane.reserve(row - 1, col - 1);
                plane.print();
            } else if (planeClass == 2) {
                System.out.println("Enter row[4-8]");
                row = in.nextInt();
                while (row > 8 || row < 4) {
                    System.out.println("Invalid row!");
                    System.out.print("Try Again: ");
                    row = in.nextInt();
                    if (row <= 8 && row >= 4) {
                        break;
                    }
                }
                System.out.println("Enter column[1-6]");
                col = in.nextInt();
                if (col > 6) {
                    System.out.println("Invalid");
                    break;
                }
                plane.reserve(row - 1, col - 1);
                plane.print();
            } else if (planeClass == 3) {
                System.out.println("Enter row[9-13]");
                row = in.nextInt();
                while (row > 13 || row < 9) {
                    System.out.println("Invalid row!");
                    System.out.print("Again: ");
                    row = in.nextInt();
                    if (row <= 13 && row >= 9) {
                        break;
                    }
                }
                System.out.println("Enter column[1-6]");
                col = in.nextInt();
                if (col > 6) {
                    System.out.println("Invalid seat");
                    break;
                }
                plane.reserve(row - 1, col - 1);
                plane.print();
            }
            System.out.println("Do you want to try again?");
            char flag = in.next().charAt(0);
            if (flag == 'n') {
                break;
            }

        }
    }
}
