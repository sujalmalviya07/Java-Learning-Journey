public class Sum_Array {
    public static void main(String[] args){
        int[] arr = {4, 6, 8};
        System.out.println(sumOfArray(arr));
    }

    static int  sumOfArray(int[] arr ){
        int sum=0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];

        }
        return sum;
    }
}
