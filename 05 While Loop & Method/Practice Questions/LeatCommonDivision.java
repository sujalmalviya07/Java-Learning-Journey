import java.util.Scanner;

public class LeatCommonDivision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Number ");
        int num2 = sc.nextInt();
        int i=1;
        int sum=0;
        int sum1 =0;

        while (i<=10){
          sum=i*num1;
          sum1=i*num2;
          if(i%sum==0 && i%sum1==0){

          }
            i++;
        }
        System.out.println(i);
    }
}
