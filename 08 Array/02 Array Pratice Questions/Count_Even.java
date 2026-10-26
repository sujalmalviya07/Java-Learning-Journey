public class Count_Even {
    public static void main(String[] args){
        int[] arr = {2, 7, 10, 13, 16, 21, 24};
        int count =0;

            for(int i =0; i< arr.length;i++){

                if(arr[i]%2==0){
                    count++;
                }
            }
        System.out.println(count);
    }
}
