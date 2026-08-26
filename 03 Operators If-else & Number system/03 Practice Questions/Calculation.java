import java.util.Scanner;

public class Calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number A : ");
        float a = sc.nextFloat();

        System.out.print("Enter Number B : ");
        float b = sc.nextFloat();

        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));

    }
}
