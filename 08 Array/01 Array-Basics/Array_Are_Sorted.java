
public class Array_Are_Sorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 2, 4, 5};
        int[] arr3 = {1, 3, 2, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};

        System.out.println("Normal Sorted:");
        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // true
        System.out.println(isSorted(arr3)); // false
        System.out.println(isSorted(arr4)); // false

        System.out.println("\nStrictly Increasing:");
        System.out.println(isStrictlyIncreasing(arr1)); // true
        System.out.println(isStrictlyIncreasing(arr2)); // false
        System.out.println(isStrictlyIncreasing(arr3)); // false
        System.out.println(isStrictlyIncreasing(arr4)); // false

        System.out.println("\nSorted Either Way:");
        System.out.println(isSortedEitherWay(arr1)); // true
        System.out.println(isSortedEitherWay(arr2)); // true
        System.out.println(isSortedEitherWay(arr3)); // false
        System.out.println(isSortedEitherWay(arr4)); // true
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isSortedEitherWay(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }

            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        return ascending || descending;
    }
}
