public class Occurrences_Element {
    public static void main(String[] args){
        int count=0;
        int target = 2;
        int [] arr = { 1, 2, 3, 2, 4, 2};
        for(int i =0; i< arr.length;i++){
            if(target==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
