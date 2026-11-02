public class Maximum_Minimum {
    public static void main(String[] args){
        int [] arr ={45, 25, 21, 67, 32};
        int maximum=arr[0];
        int minimum =arr[0];

        for(int i =1; i< arr.length; i++){
            if(maximum<arr[i]){
                maximum=arr[i];
            }
            if(minimum>arr[i]){
                minimum=arr[i];
            }
        }
        System.out.println("Maximum : "+ maximum + " Minimum : "+ minimum);
    }
}
