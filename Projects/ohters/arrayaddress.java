
import java.util.ArrayList;
import java.util.Scanner;
//programmed by julius:)

public class Address {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> dimension = new ArrayList<Integer>();
        ArrayList<Integer> values = new ArrayList<Integer>();

        long answer = 1;
        long finalanswer = 0;
        long noElements = 1;

        //initializing array dimension and size
        System.out.println("******Array Adress Calculator******");
        System.out.print("Enter the array dimension: ");
        int dSize = in.nextInt();
//        while (true) {
//            if (dSize <= 1) {
//                System.out.println("Dimension should be greater than one");
//                System.out.print("Enter the array dimension: ");
//                dSize = in.nextInt();
//            } else {
//                break;
//            }
//        }
        System.out.println("Enter the size of every dimensions.");
        for (int i = 0; i < dSize; i++) {
            System.out.print("dimension [" + (i + 1) + "]: ");
            int size = in.nextInt();
            dimension.add(size);
        }

        //printing out array
        System.out.print("\nArray");
        for (int i = 0; i < dSize; i++) {
            System.out.print("[" + dimension.get(i) + "]");
        }

        //initializing the address to be found
        System.out.println("\nEnter the adress to find.");
        for (int i = 0; i < dSize; i++) {
            System.out.print("dimension [" + (i + 1) + "]: ");
            int size = in.nextInt();
            values.add(size);
        }

        //checker
        for (int i = 0; i < dSize; i++) {
            if (dimension.get(i) < values.get(i)) {
                System.out.println("Address should not be greater than initial array size!");
                System.exit(0);
            }
        }

        //alpha and esize
        System.out.println("");
        System.out.print("Enter the starting address(α): ");
        int sAddress = in.nextInt();
        System.out.print("Enter the eSize: ");
        int eSize = in.nextInt();

        //computation address
        for (int i = 0; i < dSize - 1; i++) {
            answer *= values.get(i);
            for (int j = i + 1; j < dSize; j++) {
                answer *= dimension.get(j);
            }
            finalanswer += answer;
            answer = 1;
        }
        finalanswer += values.get(dSize - 1);
        finalanswer *= eSize;
        finalanswer += sAddress;

        //computation # of elements
        for (int i = 0; i < dSize; i++) {
            noElements *= dimension.get(i);
        }
        
        int sum = 0;

        System.out.print("Sum of the record you are looking for: ");
        sum = in.nextInt();
        sum += finalanswer;

        //printing out array address to find
        System.out.println("");
        System.out.print("Array");
        for (int i = 0; i < dSize; i++) {
            System.out.print("[" + values.get(i) + "]");
        }

        //output
        System.out.println("\nTotal number of elements: " + noElements);
        System.out.println("The array address is: " + sum);
    }
}
