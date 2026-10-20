public class Frequency_Counting {
    public static void main(String[] args){
        int[] arr = {5, 2, 5, 8, 5, 2, 8};
        System.out.println(countOccurrences(arr, 2));
        System.out.println(countOccurrences(arr, 10));
    }
    static int countOccurrences(int[] arr, int target) {
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(target==arr[i]){
                count++;
            }
        }
        return count;
    }
}
