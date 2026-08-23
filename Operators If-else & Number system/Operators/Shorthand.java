import java.util.Scanner;

public class Shorthand {
    public  static void main(String[] args){
        System.out.println("Shorthand method ...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        num+=3;
        System.out.println(num);
        System.out.println("Enter your number: ");
        int num2 = sc.nextInt();
        num2+=num;
        System.out.println(num2);
        System.out.println("Enter your number: ");
        int num3 = sc.nextInt();
        num3+=num2;
        System.out.println(num3);
    }
}
