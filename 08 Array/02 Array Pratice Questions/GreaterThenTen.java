public class GreaterThenTen {
    public static void main(String[] args){
        int[] arr = {4, 15, 8, 22, 10, 17, 3};
        int count=0;

        for(int i =0; i < arr.length; i++){
            if(arr[i]>10){
                count++;
            }
        }
        System.out.println(count);
    }
}
