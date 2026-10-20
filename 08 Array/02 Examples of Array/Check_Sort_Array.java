public class Check_Sort_Array {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 2, 4, 7};
        int[] nums2 = {1, 3, 2, 4, 7};
        int[] arr1 = {1, 2, 2, 4, 7};
        int[] arr2 = {1, 3, 2, 4, 7};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
        System.out.println(isArraySorted(nums1));
        System.out.println(isArraySorted(nums2));
    }
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    static boolean isArraySorted(int [] nums){
        boolean sorted = true;

        for(int i=0; i< nums.length-1; i++){

            if(nums[i]>nums[i+1]){
                sorted=false;
            }
        }
        return sorted;
    }
}
