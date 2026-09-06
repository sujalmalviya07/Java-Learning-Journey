import java.util.Scanner;

public class TwoD_ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[3][4];
        int i=0;
        while (i<arr.length){
            int j=0;
            while (j< arr[i].length){
                System.out.println("Enter Your Number ");
                arr[i][j]=sc.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("Output is ");
        i=0;
        while (i< arr.length){
            int j=0;
            while (j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
