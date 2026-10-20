public class Array_Palindrome {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 1};

        System.out.println(  isPalindrome(arr1));
        System.out.println(Palindrome(arr2));

    }

    static boolean isPalindrome(int[] arr) {

        int right = arr.length - 1;

        for(int i =0 ;i<right;i++){
            if(arr[i]!=arr[right]){

                return false;
            }

            right--;
        }




            return true;
    }

    static boolean Palindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
