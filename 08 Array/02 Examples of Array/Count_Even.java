public class Count_Even {
    public static void main(String[] args){
        int[] arr = {3, 8, 12, 5, 7, 10};
        System.out.println(countEven(arr));

    }
    static int countEven(int[] arr) {
        int count=0;
        for (int i =0 ;i< arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
