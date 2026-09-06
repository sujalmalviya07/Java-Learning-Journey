public class TwoDimensionExample {
    public static void main(String[] args){
        int [][] arr = {{39,32,33},{32,21,12},{17,36,21}};
        int i = 0;
        while (i<arr.length){
            int j =0;
            while (j<arr.length){
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
