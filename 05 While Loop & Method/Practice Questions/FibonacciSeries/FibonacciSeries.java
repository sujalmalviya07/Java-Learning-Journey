import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        int a =0;
        int b=1;
        int c = 0;

        while (a<=num){                 // eg.  input 4
            System.out.print(a+" ");   // print    0 1 1 2 3
             c=a+b;                  // c=0+1=1   c=1+1=2  c=1+2=3 c=2+3=5  c=3+5=8
            a=b;                     // a=1       a=1      a=2     a=3      a=5
            b=c;                     // b=1       b=2      b=3     b=5     stop...........


        }



        }
    }
