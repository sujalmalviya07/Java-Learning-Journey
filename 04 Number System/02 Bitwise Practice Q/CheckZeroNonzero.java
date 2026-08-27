import java.util.Scanner;

public class CheckZeroNonzero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Second Number ");
        int num2 = sc.nextInt();

        int andOperation = num1&num2;
        int orOperation = num1|num2;
        int xorOperation = num1^num2;

        System.out.println("AND = " +andOperation);
        System.out.println("OR = " +orOperation);
        System.out.println("XOR = " +xorOperation);


        if (andOperation == 0) {
            System.out.println("AND Result is Zero");
        } else {
            System.out.println("AND Result is Non-Zero");
        }

        if (xorOperation == 0) {
            System.out.println("XOR Result is Zero");
        } else {
            System.out.println("XOR Result is Non-Zero");
        }
        if (orOperation == 0) {
            System.out.println("OR Result is Zero");
        } else {
            System.out.println("OR Result is Non-Zero");
        }



    }
}
