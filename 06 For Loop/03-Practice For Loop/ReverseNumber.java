import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        int digit = 0;
        int count = 0;
        for(;num>0;num/=10){
             digit=num%10;
             count=count*10+digit;


        }
        System.out.println(count);
    }
}
