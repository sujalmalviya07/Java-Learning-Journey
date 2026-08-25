// Create a program that if a number is positive ,negative or zero
import java.util.Scanner;

public class NumberNature {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Number Nature System ");

        System.out.println("Enter Your Number ");
        int num =sc.nextInt();

        if(num<0){
            System.out.println("Number Is Negative :");
        }
        else if (num>0){
            System.out.println("Number Is Positive");
        }
        else {
            System.out.println("Number Is Zero");
        }

    }

}
