import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Your sum is : " + sum);
    }
}
