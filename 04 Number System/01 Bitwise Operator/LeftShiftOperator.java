import java.util.Scanner;

public class LeftShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perform Bitwise Left Shift Operator ");

        System.out.print("Enter Your First : ");
        int first = sc.nextInt();

        System.out.print("Enter Your Second : ");
        int second = sc.nextInt();

        int result = first << second;
        System.out.println("After Left Shift Operation , Result is : " + result);
    }
}