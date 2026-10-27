public class Positive_Numbers_Reverse {
    public static void main(String[] args){
        int[] arr = {-3, 8, 2, -5, 10, 0, 7};
        for(int i=arr.length-1;i>=0 ;i--){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
