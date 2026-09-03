import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        int original=num;
        int sum=0;

        while (num>0){
            int digit = num%10;
            sum= sum+digit*digit*digit;
            num/=10;
        }
        System.out.println("Result is " + sum);
        if(original==sum){
            System.out.println("Your Number is Armstrong Number ");
        }
        else {
            System.out.println("Number is Not Armstrong Number ");
        }
    }
}
