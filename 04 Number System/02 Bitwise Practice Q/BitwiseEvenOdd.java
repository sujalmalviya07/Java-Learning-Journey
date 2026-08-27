import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitwise Even Odd Operation\n ");

        System.out.print("Enter Your Number ");
        int num = sc.nextInt();


        if((num&1)==0){
            System.out.println("Even Number ");
        }

        else {
            System.out.println("Odd Number");
        }

    }
}
