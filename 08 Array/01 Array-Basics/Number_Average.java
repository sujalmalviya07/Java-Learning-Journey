import java.util.Scanner;

public class Number_Average {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count=0;

        System.out.println("Enter Your Array Size ");
        int n = sc.nextInt();

        int []arr = new int[n];


        System.out.println("Enter Your Array Elements ");

        for(int i=0 ; i< arr.length; i++){
            arr[i]=sc.nextInt();

        }

        double sum=0;
        for(int j= 0 ; j< arr.length; j++){
            sum=sum+arr[j];

        }

        double average =  sum/ args.length;
        for(int i=0 ; i< arr.length; i++){
            if(arr[i]<average){
                count++;
            }

        }

        System.out.println(count);
    }
}
