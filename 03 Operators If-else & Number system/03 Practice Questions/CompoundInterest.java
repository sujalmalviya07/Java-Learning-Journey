import java.io.FilterOutputStream;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("......Compound Interest Calculator ......");
        System.out.print("Enter Your Principal Amount : ");
        int principal = sc.nextInt();

        System.out.print("Enter Rate of Interest  : ");
        int rate = sc.nextInt();

        System.out.print("For How Much Time : " );
        int time = sc.nextInt();

        double amount =  principal * Math.pow(1 + rate / 100.0, time);


        System.out.println("Payback Amount : " +  amount);
    }
}
