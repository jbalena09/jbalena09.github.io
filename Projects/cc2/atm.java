import java.util.Scanner;
public class atm {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        char ask;
        double with, money = 0;
        while(true){
            System.out.println("---------------------");
            System.out.print("Welcome to the ATMachine!\n"
               + "What do you like to do?\n"
               + "1. Withdraw\n"
               + "2. Deposite\n"
               + "3. Show balance\n"
               + "---------------------\n"
               + "Enter your choice: ");
            x = input.nextInt();
            switch(x){
                case 1: money -= Withdraw(money);
                	   System.out.println("Your new balance is: " + money);
                        break;
                case 2: money += Deposite(money);
                		System.out.println("Your new balance is: " + money);
                        break;
                case 3: System.out.println("Your money: " + money);
                        break;
                default: System.out.println("Invalid Option!");
                        break;
            }
            System.out.print("Do you want to try again? Y/N: ");
            ask = input.next().charAt(0);
            if(Character.toUpperCase(ask) == 'N'){
                System.out.println("Thank you for using ATMachine");
                break;
            }
        }
    }

    public static double Deposite(double money){
        double dep;
        if(money == 9999999){
			System.out.print("You cannot deposite anymore the maximum money that the atm can hold is \"9999999\" \n");
        	return 0;
        }else{
	        System.out.println("The maximum money you can deposite is up to \"9999999\" only!");
	        System.out.print("How much do you like to deposite: ");
	        dep = input.nextDouble();
	        if (dep > 9999999){
	            System.out.println("Error! You cannot deposite that amout of money!");
	            dep = 0;
	        }else{
	            System.out.println("You have successfully deposited your money.");
	        }
	        return dep;
        }
    }

    public static double Withdraw(double money){
        double with;
        System.out.println("The maximum money you can Witdhraw is up to \"9999999\" only!");
        System.out.print("How much do you like to withdraw: ");
        with = input.nextDouble();
        if (with > 9999999){
            System.out.println("Error! You cannot withdraw that amout of money!");
            with = 0;
        }  else if (with > money){
            with = 0;
            System.out.println("You don't have that amount of money!");
        }else{
            System.out.println("You have successfully withdrawed your money.");
        }
        return with;
    }
}