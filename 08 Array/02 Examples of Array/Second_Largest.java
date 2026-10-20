public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 24, 10, 2, 1};

        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr) {
        int max = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }




        return secondLargest;
    }
}