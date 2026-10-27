public class Equal_Number {
    public static void main(String[] args){
        int[] arr = {4, 2, 7, 2, 9, 2, 5};
        int min= arr[0];
        int count=0;

        for(int i =1; i< arr.length; i++){
            if(min>arr[i]){
                min=arr[i];

            }
        }
        for(int i=0;i<arr.length;i++){
            if (min==arr[i]){
                count++;
            }
        }
        System.out.println(min);
        System.out.println(count);

    }
}
