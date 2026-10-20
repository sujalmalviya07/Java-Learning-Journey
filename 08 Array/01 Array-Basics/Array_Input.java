import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Your Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j=0 ; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
