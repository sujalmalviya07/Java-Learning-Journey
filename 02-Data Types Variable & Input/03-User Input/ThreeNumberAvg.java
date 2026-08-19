import java.util.Scanner;

public class ThreeNumberAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter your second number : ");
        float num2 = sc.nextFloat();

        System.out.print("Enter your third number : ");
        float num3 = sc.nextFloat();

        float average = (num1+num2+num3)/3;
        System.out.println("Average is : " + average);


    }
}
