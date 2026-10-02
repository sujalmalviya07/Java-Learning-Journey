import java.util.Scanner;

public class methods {
     public static void greetings(){
         System.out.println("hello,how are you");
     }

     static  int  work(){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter Your lucky number  :");
         return sc.nextInt();

     }

    static void main(String[] args) {
        greetings();
        work();

    }
}
