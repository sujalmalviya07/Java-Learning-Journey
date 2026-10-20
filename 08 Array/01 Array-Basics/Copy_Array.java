public class Copy_Array {
    static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int [] result = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            result[i]=arr[i];

        }
        for(int i =0; i< result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
