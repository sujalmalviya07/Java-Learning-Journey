public class Minimum_Array {
    public static void main(String[] args){
        int[] arr = {12, 5, 5, 8, 3};
        System.out.println(isMinimum(arr));
    }
    static int isMinimum(int [] arr){
        int min = arr[0];
        for(int i=0; i< arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }



        return min;
    }
}
