import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Perform Bitwise XOR Operation");

        System.out.print("Enter Your First : ");
        int first = sc.nextInt();

        System.out.print("Enter Your Second : ");
        int second = sc.nextInt();

        int result = first ^ second;
        System.out.println("After XOR Operation , Result is : " + result);
    }
}
