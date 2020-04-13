/* Programmer: Julius
 * Date: 10/29/18
 */

import java.util.Scanner;
public class TenQuizScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int score[] = new int [10];
		int i, sum = 0, num = 0, per = 0;
		double avg;

		for(i = 0; i < 10; i++){
			System.out.print("Input score " + (i+1) + " = ");
			try{
				score[i] = input.nextInt();
			}catch(Exception e){
				System.out.println("Error!");
				System.exit(0);
			}
		}

		for(i = 0; i < 10; i++){
			System.out.println("score " + (i+1) + " = " + score[i]);
		}

		for (i = 0; i < 10; i ++){
			sum = sum + score[i];
		}

		avg = (double)sum / 10;

		System.out.println("Sum of all numbers is = " + sum + " over 100");
		System.out.println("Avg of all scores is = " + avg);

		System.out.println("\nRecorded scores less than or equal to 5 but greater than 0");

		System.out.print("Score = [");
		for(i = 0; i < 10; i++){
			if(score[i] <= 5 && score[i] > 0){
				System.out.print(" " + score[i]);
			}
		}
		System.out.print(" ]");


		for(i = 0; i < 10; i++){
			if(score[i] == 10){
				per ++;
			}
		}
		System.out.println("\nNumber of students with perfect score: " + per);
	}
}