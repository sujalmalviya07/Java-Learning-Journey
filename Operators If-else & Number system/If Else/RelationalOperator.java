import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Age Identifier ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Your are Adult ");
        }
        else{
            System.out.println("Yur Are Minor");
        }


    }
}
