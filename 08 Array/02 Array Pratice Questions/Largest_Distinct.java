public class Largest_Distinct {
    public static void main(String[] args){
        int[] arr1 = {10, 5, 20, 88, 20, 11};
        secondLargest(arr1);
        int[] arr = {10, 5, 20, 8, 20, 15};
        int max=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(max<arr[i]){
                second=max;
                max=arr[i];
            }
            if(max>arr[i] && arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
    static  void secondLargest(int [] arr){
        int max =arr[0];
        int second = 0;
        boolean isFound=false;

        for(int i=1;i< arr.length;i++){
            if(max<arr[i]){
                second=max;
                max=arr[i];
                isFound=true;
            }
            else if(max>arr[i]){
                if(!isFound || arr[i]>second){
                    second=arr[i];
                    isFound=true;
                }
            }
        }
        if(isFound){
            System.out.println("Second Largest "+second);
        }
        else System.out.println("Second largest not found ");
    }
}
