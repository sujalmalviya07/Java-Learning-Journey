public class CheckSorted {
    public static boolean isSorted(int[] arr) {
        // A single element or empty array is always sorted
        if (arr.length <= 1) return true;

        // Check if any element is greater than the next one
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Found an out-of-order element
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 5, 8, 12, 15};
        int[] unsortedArr = {2, 8, 5, 12, 15};

        System.out.println("Is sortedArr sorted? " + isSorted(sortedArr));     // True
        System.out.println("Is unsortedArr sorted? " + isSorted(unsortedArr)); // False
    }
}
