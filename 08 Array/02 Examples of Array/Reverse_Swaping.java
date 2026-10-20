public class Reverse_Swaping {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8};

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int tem=arr[right];
            arr[right]=arr[left];
            arr[left]=tem;
            left++;
            right--;



        }
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
