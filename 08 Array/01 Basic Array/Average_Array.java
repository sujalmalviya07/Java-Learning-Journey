public class Average_Array {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        System.out.println(average(arr));

    }
    static double average(int [] arr){
        double sum =0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        double average = sum/ arr.length;
        return average;
    }

}
