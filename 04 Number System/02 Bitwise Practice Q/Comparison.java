import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number ");
        int num = sc.nextInt();

        System.out.print("Enter Your Second Number ");
        int num2 = sc.nextInt();

        int andOperation =  num&num2;
        System.out.println("AND Operation :" +andOperation);

        int orOperation =  num|num2;
        System.out.println("OR Operation :" +orOperation);

        int xorOperation =  num^num2;
        System.out.println("XOR Operation :" +xorOperation);

        if(num>num2){
            System.out.println(num+" is Greater then "+num2);
        }
        else if(num2>num){
            System.out.println(num2+" is Greater then "+num);
        }
        else {
            System.out.println("Number is Equal");
        }


    }
}
