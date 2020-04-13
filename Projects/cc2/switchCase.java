/* Programmer: Julius
 * Date: 10/01/18
 */

import java.util.Scanner;

	public class switchCase{
 	public static void main(String[] args){
 		Scanner input = new Scanner(System.in);
		System.out.print("Input number from 1 - 7: ");
		int day = input.nextInt();
		switch(day)
		{
			case 1: System.out.println("That day is a Monday!");
					break;
			case 2: System.out.println("That day is a Tuesday!");
					break;
			case 3: System.out.println("That day is a Wednesday!");
					break;
			case 4: System.out.println("That day is a Thursday!");
 					break;
			case 5: System.out.println("That day is a Friday!");
 					break;
			case 6: System.out.println("That day is a Saturday!");
 					break;
			case 7: System.out.println("That day is a Sunday!");
					break;
			default: System.out.println("Invalid input try again");
		}
 		System.out.println("Have a nice day.");
 	}
}