import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();

        if(num < 2) {
            System.out.println("Number is not prime");
            return;
        }

        for(int i = 2; i < num; i++) {

            if(num % i == 0) {
                System.out.println("Number is not prime");
                return;
            }
        }

        System.out.println("Number is prime");
    }
    public static void prime(){



                Scanner sc = new Scanner(System.in);

                System.out.print("Enter Your Number: ");
                int num = sc.nextInt();

                boolean isPrime = true;

                if(num < 2) {
                    isPrime = false;
                }

                for(int i = 2; i < num; i++) {

                    if(num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) {
                    System.out.println("Number is prime");
                } else {
                    System.out.println("Number is not prime");
                }
            }

}