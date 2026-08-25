import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("......Simple interest calculator...... ");

        System.out.print("Enter Your Principal Amount : ");
        int principal = sc.nextInt();

        System.out.print("Enter Rate of Interest  : ");
        int interest = sc.nextInt();

        System.out.print("For How Much Time : " );
        int time = sc.nextInt();

        int simpleInterest = (principal*interest*time)/100;
        int amount =principal+simpleInterest;

        System.out.println("Payback Amount is : " + amount);
    }
}
