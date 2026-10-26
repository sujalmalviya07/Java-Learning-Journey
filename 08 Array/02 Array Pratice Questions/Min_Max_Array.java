public class Min_Max_Array {
    public static void main(String[] args){
        int[] arr = {14, 3, 27, 8, 19};
        int min=arr[0];
        int max =arr[0];

        for(int i=0;i< arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
    }
}
