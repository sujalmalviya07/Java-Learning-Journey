import java.util.Scanner;

public class Array_Max_Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Size ");
        int n = sc.nextInt();

        int arr[]= new  int[n];

        System.out.println("Enter Your Array Element ");

        for (int i=0 ; i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        int max= arr[0];
        int frequency=1;

        for(int i=1;i< arr.length; i++){

            if(arr[i]>max){
                max=arr[i];
                frequency=1;
            }
            else if(arr[i]==max){
                frequency++;
            }
        }
        System.out.println(max);
        System.out.println(frequency);
    }
}