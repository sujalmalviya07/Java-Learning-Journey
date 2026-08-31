import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int num = sc.nextInt();
        int i =1;
        int count =1;
        while (i<=num){
            count *=i;
            i++;
        }
        System.out.println( "Your Factorial Number is : "+count);
    }
}
