import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER : ");
        int number = sc.nextInt();
        int i=2;
        while(i<number) {

            if (number % i == 0) {
                System.out.println("Number is not prime");
                return;
            }
            i++;
        }
        System.out.println("Number is prime");





    }
}
