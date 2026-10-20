public class Last_Occurrence {
    public static void main(String[] args){
        int[] arr = {8, 3, 8, 6, 8};
        int target = 6;

        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                lastIndex = i;
            }
        }

        System.out.println(lastIndex);
    }

}
