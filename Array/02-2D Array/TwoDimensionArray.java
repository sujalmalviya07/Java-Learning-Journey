public class TwoDimensionArray {
    public static void main(String[] args){
        int [][] arr = {{32,34,22} ,{23,23,34}};
        int i=0;
        while (i< arr.length){
            int j=0;
            while (j<arr[i].length){
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
