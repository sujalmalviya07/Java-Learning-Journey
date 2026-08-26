import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perform Bitwise NOT Operator ");

        System.out.print("Enter Your Number : ");
        int number = sc.nextInt();

        int result = ~number;


        System.out.println("After Not Operation , Result is : " + result);
    }
}
