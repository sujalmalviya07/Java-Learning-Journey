import java.util.Scanner;

public class LeatCommonDivision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int num1 =  sc.nextInt();
        System.out.println("Enter Your Number ");
        int num2 =  sc.nextInt();

        int i =1;
        while (true){
            int multiple1=num1*i;

            int j=1;
            while (true){
                int multiple2 = num2*j;
                if(multiple1==multiple2){
                    System.out.println("LCM " + multiple1);
                    return;
                }
                if(multiple2>multiple1){
                    break;
                }
                j++;
            }
            i++;
        }

    }
}