//Create a program tha determines the greatest of the three number

import java.util.Scanner;

public class GreatestThreeNumber {
    public  static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Greatest Number \n");

        System.out.print("Enter First number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third number : ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("\nGreatest Number is  : " + num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("\nGreatest Number is  : " + num2);
        }
        else {
            System.out.println("\nGreatest Number is  : " + num3);
        }



    }
}
