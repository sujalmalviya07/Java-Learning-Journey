import java.util.Scanner;
// Create a program that determines if a given year is leap year

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Year : ");
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println(year + " is Leap Year ");
        }
        else if(year%400==0){
            System.out.println(year + " is Leap Year");
        }
        else {
            System.out.println(year+" is Not Leap Year");
        }


    }
}
