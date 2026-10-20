public class Array_Insert {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] num = new int[arr.length + 1];

        // Step 1: Pehle 2 elements copy karo
        for (int i = 0; i < 2; i++) {
            num[i] = arr[i];
        }

        // Step 2: 25 ko index 2 par insert karo
        num[2] = 25;

        // Step 3: Baaki elements ko ek position aage copy karo
        for (int i = 2; i < arr.length; i++) {
            num[i + 1] = arr[i];
        }

        // Step 4: Output print karo
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}