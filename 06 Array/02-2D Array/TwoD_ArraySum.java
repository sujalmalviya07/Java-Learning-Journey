public class TwoD_ArraySum {
    public static void main(String[] args){
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int count =0;
        int i=0;
        while (i< arr.length){
            int j=0;
            while (j<arr[i].length){
               count+=arr[i][j];

                j++;

            }

            i++;
        }
        System.out.println(count);


    }
}
