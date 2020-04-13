
/* Programmer: Julius
 * Date: 11/12/18
 */


import java.util.Scanner;

public class Arrays{
	public static void main(String[] args){
		int eSum = 0, oSum = 0 , ctr = 0, ctr2 = 0, size = 0;
		boolean checker = true, again = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		size = sc.nextInt();
		int num[] =  new int [size];

		for(ctr = 0; ctr < size; ctr++){
			System.out.print("Input Array[" + ctr + "]: ");
			num[ctr] = sc.nextInt();
		}
		System.out.print("Elements are:");
		for( ctr = 0; ctr < size; ctr++){
			if(ctr == 0 ){
				System.out.print(" " + num[ctr] + ",");
			}else if(ctr == (size-1)){
				System.out.println(num[ctr]);
			}else{
				System.out.print(num[ctr] + ",");
			}
		}
		while(again){
			System.out.println("What do you want to do after the elements?\n"
				+ "1] List all even numbers\n"
				+ "2] List all odd numbers\n"
				+ "3] List all numbers greater than 5\n"
				+ "4] List all prime numbers\n"
				+ "5] Display the sum of all odd numbers\n"
				+ "6] Display the sum of all even numbers\n"
				+ "7] Sort in ascending order \n"
				+ "8] Sort in descending order\n"
				+ "9] Exit program");
			System.out.print("Enter your choice: ");
			int x = sc.nextInt();
			switch(x){
				case 1:	System.out.print("Even numbers:");
						for(ctr = 0; ctr < size; ctr++){
							if(num[ctr] % 2 == 0){
								System.out.print(" " + num[ctr]);
							}
						}
						break;

				case 2:	System.out.print("Odd numbers:");
						for(ctr = 0; ctr < size; ctr++){
							if (num[ctr] % 2 != 0){
								System.out.print(" " + num[ctr]);
							}
						}
						break;

				case 3: System.out.print("Numbers greater than 5:");
						for(ctr = 0; ctr < size; ctr++){
							if(num[ctr] > 5){
								System.out.print(" " + num[ctr]);
							}
						}
						break;

				case 4: System.out.print("Prime numbers:");
						for(ctr = 0; ctr < size; ctr++){
							checker = true;
							if (num[ctr] == 0 || num[ctr ] == 1){
								checker = false;
							}else{
								for(ctr2 = 2; ctr2 < num[ctr]; ctr2++){
									if(num[ctr] % ctr2 == 0 ){
										checker = false;
										break;
									}
								}
							}
							if(checker){
									System.out.print(" " +num[ctr]);
							}
						}
						break;

				case 5: System.out.print("Sum of odd numbers: ");
						for(ctr = 0; ctr < size; ctr++){
							if (num[ctr] % 2!= 0){
								oSum = oSum + num[ctr];
							}
						}
						System.out.print(oSum);
						break;

				case 6: System.out.print("Sum of even numbers: ");
						for(ctr = 0; ctr < size; ctr++){
							if (num[ctr]% 2 == 0){
								eSum = eSum + num[ctr];
							}
						}
						System.out.print(eSum);
						break;

				case 7: System.out.print("Numbers in ascending order:");
						for(ctr = 0; ctr < size; ctr++){
							for(ctr2 = ctr + 1; ctr2 < size; ctr2++){
								if (num[ctr] > num[ctr2]){
									num[ctr] = num[ctr] + num [ctr2];
									num[ctr2] = num[ctr] - num[ctr2];
									num[ctr] = num[ctr] - num[ctr2];
								}
							}
						}
						for(ctr = 0; ctr < size; ctr++){
								System.out.print(" " + num[ctr]);
						}
						break;

				case 8: System.out.print("Numbers in descending order:");
						for(ctr = 0; ctr < size; ctr++){
							for(ctr2 = ctr + 1; ctr2 < size; ctr2++){
								if (num[ctr] < num[ctr2]){
									num[ctr] = num[ctr] + num [ctr2];
									num[ctr2] = num[ctr] - num[ctr2];
									num[ctr] = num[ctr] - num[ctr2];
								}
							}
						}
						for(ctr = 0; ctr < size; ctr++){
								System.out.print(" " + num[ctr]);
							}
						break;
				case 9: System.out.print("Program Successfully ended!");
						break;

				default: System.out.print("Invalid option!!(1-9 only)!");
						break;
			}
			System.out.print("\nDo you want to try again?(y/n): ");
			char ask = Character.toUpperCase(sc.next().charAt(0));
			if(ask == 'N'){
				again = false;
				System.out.print("Program Successfully ended!");
				break;
			}
		}
	}
}