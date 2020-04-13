
/* Programmer: Julius
 * Date: 10/18/18
 */


import java.util.Scanner;

public class InputCharacter {
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a character: "); // this outputs a message in the console/output asking user to enter a character.
       try{
            char c = input.next(".").charAt(0); // This line accepts a character only and stores it on "char c".
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                if(c >= 'A' && c <= 'Z' ){ // This line checks where the entered value is an uppercase.
                	System.out.printf("%c is an uppercase letter.\n",c);
                	}else{
					System.out.printf("%c is a lowercase letter.\n",c);
                	}
            }else if (c >= '0' && c <= '9'){
                System.out.printf("%c is a digit.\n",c);
            }else{
                System.out.printf("%c is a special symbol.\n",c);
            }
       }catch (Exception e){
           System.out.println("Enter only 1 character");
       }
    }
}
