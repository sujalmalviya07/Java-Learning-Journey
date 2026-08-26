import java.util.Scanner;

// Create a program that categorize a person into different age groups
public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        {
            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();


             if(age>=60  ){
                System.out.println("Your Are Senior ");
            }
            else if(age<60 && age>=20){
                System.out.println("Your Are Adult ");
            }
            else if(age<20 && age>=13){
                System.out.println("Your Are teen ");
            }
            else {
                 System.out.println("Your Are Child");
             }
        }
    }
}
