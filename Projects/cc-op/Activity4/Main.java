
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        Character player1 = new Character("Player", 15, 15, 55);
        Character player2 = new Character("Computer", 10, 15, 10);
        int counter = 1;
        int choice = 0;
        int compChoice = 0;

        while (true) {
            int x = player1.attack();
            int y = player2.attack();
            if (player1.getCurrentLife() > 0 && player2.getCurrentLife() > 0) {
                System.out.println("\nRound " + counter);
                System.out.println("---------");
                if (counter == 1) {
                    player1.wound(y);
                    player2.wound(x);
                    System.out.println(player1.getName() + " attacks " + player2.getName() + " for " + x + " dmg");
                    System.out.println(player2.getName() + " attacks " + player1.getName() + " for " + y + " dmg");
                } else {
                    System.out.println(player1.getName() + ": " + player1.getCurrentLife());
                    System.out.println(player2.getName() + ": " + player2.getCurrentLife());
                    System.out.print("Attack(1) or Heal(2): ");
                    choice = in.nextInt();
                    //Player Attack
                    if (choice == 1) {
                        player2.wound(x);
                        System.out.println(player1.getName() + " attacks " + player2.getName() + " for " + x + " dmg");
                        compChoice = rd.nextInt(2) + 1;
                        //Computer Attack
                        if (compChoice == 1) {
                            player1.wound(y);
                            if (player2.getCurrentLife() > 0) {
                                System.out.println(player2.getName() + " chose to attack you!");
                                System.out.println(player2.getName() + " attacks " + player1.getName() + " for " + y + " dmg");
                            }
                            //Computer Heals
                        } else if (compChoice == 2) {
                            if (player2.getCurrentLife() > 0) {
                                System.out.println("The " + player2.getName() + " chose to heal");
                                System.out.println("Computer healed: " + player2.heal(rd.nextInt(2) + 1) + " hp");
                            }
                        }
                        //Player Heals
                    } else if (choice == 2) {
                        int z = player1.heal(rd.nextInt(2) + 1);
                        if (z != 0) {
                            System.out.println("Player healed: " + z + "hp");
                        } else {
                            System.out.println("Health at 100% you just healed: 0hp");
                        }
                        compChoice = rd.nextInt(2) + 1;
                        //Computer Attacks
                        if (compChoice == 1) {
                            player1.wound(y);
                            if (player2.getCurrentLife() > 0) {
                                System.out.println(player2.getName() + " chose to attack you!");
                                System.out.println(player2.getName() + " attacks " + player1.getName() + " for " + y + " dmg");
                            }
                            //Computer Heals
                        } else if (compChoice == 2) {
                            if (player2.getCurrentLife() > 0) {
                                System.out.println("The " + player2.getName() + " chose to heal");
                                System.out.println("Computer healed: " + player2.heal(rd.nextInt(2) + 1) + "hp");
                            }
                        }
                    } else {
                        System.out.print("Invalid option. Try again: ");
                        choice = in.nextInt();
                    }
                }
                counter++;
                //Computer Wins
            } else if (player1.getCurrentLife() <= 0) {
                System.out.println(player2.getName() + " wins!");
                break;
                //Player Wins
            } else if (player2.getCurrentLife() <= 0) {
                System.out.println(player1.getName() + " wins!");
                break;
            }
            compChoice = 0;
        }
    }
}
