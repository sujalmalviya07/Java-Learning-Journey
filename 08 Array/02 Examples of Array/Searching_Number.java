public class Searching_Number {
    public static void main(String[] args){
        int[] arr = {14, 7, 25, 3, 19};
        System.out.println(linearSearch(arr, 25));
    }
    static int linearSearch(int[] arr, int target){

        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return  -1;
    }
}
