public class Whether_Array_Sorted {
    public static void main(String[] args){
        int[] arr = {2, 6, 4, 8, 10};
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {5, 5, 5, 5, 5};
        int[] arr3 = {5, 5, 3, 5};
        System.out.println(isSorted(arr3));
        System.out.println(isSorted(arr1));
        System.out.println(isEqual(arr2));
        System.out.println(isEqual(arr3));
    }
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    static boolean isEqual(int [] arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
