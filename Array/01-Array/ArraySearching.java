import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Searching ..\n");
        int [] arr = { 12,34,56,76,32,34,21,23};
        System.out.println("Enter Your Number, You Want to search ....");
        int num = sc.nextInt();
        boolean ifFound = ifFound(arr, num);
        if(ifFound){
            System.out.println("Your Number is Found In Array ");
        }
        else {
            System.out.println("Your Number is Found In Array ");
        }


    }
    public static boolean ifFound(int[]arr, int num){
        int i = 0;
        while (i< arr.length){
            if(arr[i]==num){
                return true;
            }
            i++;
        }
        return false;
    }
}

