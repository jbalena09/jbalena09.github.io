import java.util.ArrayList;
import java.util.Scanner;


public class Queue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList list = new ArrayList();

        System.out.print("Enter the size of the Stack: ");
        int queue = sc.nextInt();

        int i = -1;
        int front = -1, rear = -1;

        while (true) {

            System.out.print("Options "
                    + "(1) Enque |"
                    + "(2) Deque | "
                    + "(3) Exit | : ");
            int op = sc.nextInt();

            if (op == 1) {
                if (i != queue - 1) {
                    System.out.print("Enqueue: ");
                    list.add(sc.next());
                    i++;
                    System.out.println("STACK: " + list.toString());
                    if( list.size() == queue+1){
                        System.out.println("Rear: " + rear);
                    }else{
                        System.out.println("Rear: " + i);
                        System.out.println("Rear is not empty");
                    }
                } else {
                    System.out.println("Rear: " + rear);
                    System.out.println("The Queue is full!");
                }
            } else if (op == 2) {
                if (i >= 0) {
                    list.remove(0);
                    i--;
                    System.out.println("Dequeue: " + list.toString());
                    System.out.println("Front:" + i);
                } else {
                    System.out.println("Front: " + front);
                    System.out.println("The Queue is empty!");
                }
            } else if (op == 3) {
                System.exit(0);
            }

        }
    }

}