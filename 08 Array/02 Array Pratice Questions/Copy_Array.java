public class Copy_Array {
    public static  void main(String[] args){
        int[] arr = {5, 10, 15, 20};
        int[] copy = new int[arr.length];

        for(int i=0; i< arr.length;i++){
            copy[i]=arr[i];
        }

        for(int num : copy){
            System.out.print(num+" ");
        }
    }
}
