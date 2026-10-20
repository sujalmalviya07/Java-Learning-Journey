public class Maximum_Minimum {
    public static void main(String[] args){
        int [] arr = {7, 4, 12, 9};
        int x =  findRange(arr);
        System.out.println(x);
    }

    static int findRange(int[] arr) {
        int min =arr[0];
        int max =arr[0];                    // Time \(O(n)\), extra space \(O(1)\)
        for(int i=1; i<arr.length; i++){

            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }
        return  max -min;

    }
}
