public class Searching_Number {
    public static void main(String[] args){
        int[] arr = {14, 7, 25, 3, 19};
        int  x =linearSearch(arr, 25);
        int y =linearSearch(arr, 100);
        System.out.println(x);
        System.out.println(y);
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
