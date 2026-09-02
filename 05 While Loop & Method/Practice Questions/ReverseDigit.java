import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int rev = 0;

        while (num > 0) {
            int digit = num % 10;       // 123%10=3    12%10=2        1%10=1          |
            rev = rev * 10 + digit;     // 0*10+3=3   3*10+2=32    32*10+1=321        |----> eg. 123 ->321
            num = num / 10;             // 123/10=12     12/10=1       1/10=0   stop  |

        }

        System.out.println("Reverse = " + rev);
    }
}