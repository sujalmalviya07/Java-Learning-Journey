import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Your Number ");
        int num = sc.nextInt();
        int i=0;

        while(i<=10){
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        }


    }
}
