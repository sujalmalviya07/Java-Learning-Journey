import java.util.Scanner;

public class ArrayLengthAndLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length is  ");
        int [] arr = new int[5];
        System.out.println(arr.length);
        System.out.println("Enter Your Number ");
        for(int i=0; i<arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Output is ");
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
