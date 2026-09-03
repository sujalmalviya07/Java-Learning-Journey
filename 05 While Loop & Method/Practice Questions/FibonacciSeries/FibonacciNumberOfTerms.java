import java.util.Scanner;

public class FibonacciNumberOfTerms {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter For Fibonacci Series :");
        int num = sc.nextInt();

        int a=0;
        int b=1;
        int i=1;

        while (i<=num){
            System.out.print(a+" ");

            int c = a+b;
            a=b;
            b=c;

            i++;
        }

    }
}
