public class Maximum_Array {
    public static void main(String[] args){
        int[] arr = {12, 25, 8, 40, 16};
        System.out.println(findMaximum(arr));

    }
    static int findMaximum(int [] arr){
        int max=arr[0];
        for (int i=1 ; i< arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
}
