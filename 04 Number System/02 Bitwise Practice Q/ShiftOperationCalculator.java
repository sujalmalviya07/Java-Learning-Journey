import java.util.Scanner;

public class ShiftOperationCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number ");
        int num = sc.nextInt();

        System.out.println(num+" << 1 = " +(num<<1));
        System.out.println(num+" >> 1 = " +(num>>1));
        System.out.println(num+" << 2 = " +(num<<2));
        System.out.println(num+" >> 2 = " +(num>>2));





    }
}
