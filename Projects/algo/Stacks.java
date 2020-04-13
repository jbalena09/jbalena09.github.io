import java.util.ArrayList;
import java.util.Scanner;


public class Stacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList list = new ArrayList();

        System.out.print("Enter the size of the Stack: ");
        int stack = sc.nextInt();

        int top = -1;

        while (true) {

            System.out.print("Options "
                    + "(1) Push |"
                    + "(2) Pop | "
                    + "(3) Exit | : ");
            int op = sc.nextInt();

            if (op == 1) {
                if (top != stack - 1) {
                    System.out.print("Push: ");
                    list.add(sc.next());
                    top++;
                    System.out.println("STACK: " + list.toString());
                    System.out.println("TOP:" + (top));
                } else {
                    System.out.println("The Stack is full!");
                }
            } else if (op == 2) {
                if (top >= 0) {
                    list.remove(top);
                    top--;
                    System.out.println("STACK: " + list.toString());
                    System.out.println("TOP:" + top);
                } else {
                    System.out.println("The Stack is empty!");
                }
            } else if (op == 3) {
                System.exit(0);
            }

        }
    }

}