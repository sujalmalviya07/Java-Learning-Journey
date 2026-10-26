public class Count_Negative {
    public static void main(String[] args){
        int[] arr = {5, -2, -8, 0, 7, -1, 4};
        int count =0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]<0){
                count++;

            }
        }
        System.out.println(count);
    }
}
