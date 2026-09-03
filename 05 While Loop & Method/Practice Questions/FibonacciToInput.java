import java.util.Scanner;

public class FibonacciToInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series");
        System.out.println("ENTER YOUR NUMBER ");
        int num = sc.nextInt();

        int a=0;
        int b=1;
        int i=1;
        while (i<=num){
            System.out.println(a+" ");
            b=a+b;
            a=b-a;
            i++;
        }
    }
}
