import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Searching Program");
        int[] arr = {12, 233, 12, 34, 21, 123, 1};
        int num = sc.nextInt();
        boolean isFound=isFound(arr,num);
        if(isFound){
            System.out.println("Number is Found in Array list");
        }
        else {
            System.out.println("Number is Not Found in Array list");
        }

    }
    public static boolean isFound(int [] arr,int num){
        int i=0;
        while (i< arr.length){
            if(arr[i]==num){
                return true;
            }
            i++;

        }


        return false;

    }


}

