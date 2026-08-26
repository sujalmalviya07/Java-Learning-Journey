import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Unary Operator.. ");
        System.out.println("Negative \"-\" operation :");

        System.out.print("Number : ");
        int number = sc.nextInt();
        int result = -number;
        System.out.print("Result : " + result);

        System.out.println();

        System.out.print("\nPre increment : " );
        int x = sc.nextInt();
        System.out.println("Result of Pre increment  : " + (++x));

        System.out.print("\nPree Decrement : " );
        int y = sc.nextInt();
        System.out.println("Result of Post Decrement  : " + (--y));

        System.out.print("\nPost increment : ");
        int x1 = sc.nextInt();
        x1++;
        System.out.println("Result of Post Increment : "+ x1);



        System.out.print("\nPost Decrement  : ");
        int y2 = sc.nextInt();
        y2++;
        System.out.println("Result of Post Decrement : "+ y2);











    }
}
