import java.util.Scanner;

public class FibonacciSeriesLogic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series");
        System.out.println("ENTER YOUR NUM");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        while (a <= num) {                  // eg. 4
            System.out.print(a + " ");      //  0 1 1 2 3
            b=a+b;                          // b=0+1=1   b=1+1=2  b=1+2=3  b=2+3=5 b=3+5=8
            a=b-a;                          // a=1-0=1   a=2-1=1  a=3-1=2  b=5-2=3 a=8-3=5 stop .....

        }
    }
}