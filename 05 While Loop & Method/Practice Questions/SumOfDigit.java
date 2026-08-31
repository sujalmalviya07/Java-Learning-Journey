import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        int num = sc.nextInt();

        int count=0;
        while (num>0){
             count = count+num%10;
             num/=10;

        }
        System.out.println(count);
    }
}
