public class Duplicate_Array {
   public static void main(String[] args) {
       int[] arr = {2, 2, 2, 4, 4, 7, 9, 9};
       System.out.println(countDistinct(arr));
    }
    static  int countDistinct (int []arr){
        if (arr.length == 0) {
            return 0;
        }

        int count=1;
       for(int i =1 ; i< arr.length; i++){
           if(arr[i]!=arr[i-1]){
               count++;
           }
       }
        return count;

    }
}
