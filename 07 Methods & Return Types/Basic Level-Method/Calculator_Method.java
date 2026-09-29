public class Calculator_Method {

    public static void main(String[] args) {

        int number1 = 20;
        int number2 = 5;

        int sum = add(number1, number2);
        int difference = subtract(number1, number2);
        int product = multiply(number1, number2);
        int quotient = divide(number1, number2);

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + difference);
        System.out.println("Multiplication = " + product);
        System.out.println("Division = " + quotient);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}