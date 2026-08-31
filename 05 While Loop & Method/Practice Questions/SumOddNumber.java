import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int num = sc.nextInt();
        int i=1;
        int count = 0;
        while (i<=num){
             count +=i;

            i+=2;


        }
        System.out.println(count);


    }
}
