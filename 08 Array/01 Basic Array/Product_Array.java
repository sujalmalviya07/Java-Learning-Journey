public class Product_Array {
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 5};
        System.out.println(productOfArray(arr));

    }
    static int productOfArray(int [] arr){
        int product =1;
        for(int i=0; i< arr.length; i++){
            product*=arr[i];
        }
        return  product;
    }
}
