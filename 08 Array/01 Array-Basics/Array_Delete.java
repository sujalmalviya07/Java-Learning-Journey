public class Array_Delete {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int [] result = new int[arr.length-1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != 1) {
                result[j] = arr[i];
                j++;
            }
        }
        for(int  i=0; i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}