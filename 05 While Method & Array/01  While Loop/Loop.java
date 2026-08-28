import java.util.Scanner;
import java.util.SequencedCollection;

public class Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Your Number ");
        int num = sc.nextInt();

        while (num<=10){
            System.out.println(num);
            num++;
        }

    }
}
