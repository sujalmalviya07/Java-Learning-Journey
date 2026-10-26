public class Count_Positive {
    public static void main(String[] args){
        int[] arr = {-2, 5, 0, 8, -3, 4, -1};
        int count=0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
