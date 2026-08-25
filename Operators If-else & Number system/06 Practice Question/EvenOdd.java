//Create a program tha determines if a number is odd or even

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Your Number is Even or Odd");

        System.out.println("Enter Your Number : ");
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println("Number is Even ");
        }
        else {
            System.out.println("Number is Odd ");
        }
    }
}
