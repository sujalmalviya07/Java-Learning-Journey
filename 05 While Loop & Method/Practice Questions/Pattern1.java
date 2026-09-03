import java.util.Scanner;

public class Pattern1 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int num = sc.nextInt();
        int i =1;
        while (i<=num){
            int j = 1;

            while (j<=i){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}