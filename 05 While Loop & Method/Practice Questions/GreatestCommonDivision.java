import java.util.Scanner;

public class GreatestCommonDivision {

    public static int readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        return sc.nextInt();

    }
    public static void main(String[] args){
        int num1 = readNumber();
        int num2 = readNumber();

        int i =2;

        while (true){

            if(num1%i==0&&num2%i==0){
                System.out.println("GCD is " + i);
                return;
            }
            i++;
        }


    }
}
