/* Programmer: Julius
 * Date: 10/18/18
 */

import java.io.*;

public class PrimeNumber{
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int checker = 0, x;
		String ans = "";
		do{
			System.out.println("Enter a prime number: ");
			x = Integer.parseInt(input.readLine());
			if(x == 0 || x == 1)
			{
				checker = 1;
				break; // this code stops the loop from executing
			}else{
				for(int i = 2; i < x; i++){
					if(x%i == 0){
						checker = 1; // this line initializes the value of checker into 1, in which it will stop the loop because the checker should have a value of 0 to continue.
					}
				}
				if (checker != 1){
					ans += x +  " "; // this line of code saves the values of prime numbers everytime the user inputs a prime number.
				}
			}
		}while(checker == 0);
		System.out.println("You entered non-prime number the program ends now!");
		System.out.println("list of prime number you entered : " + ans);
	}
}
