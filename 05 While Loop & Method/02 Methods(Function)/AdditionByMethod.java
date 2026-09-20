import java.util.Scanner;

public class AdditionByMethod {
    public static int numberRead(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
          return sc.nextInt();


    }
    public static void main(String[] args)
    {
        int first = numberRead();
        int second = numberRead();
        int third = numberRead();
        int fourth = numberRead();

        int sum = first+second+third+fourth;
        System.out.println("Sum is " + sum);
    }
}
