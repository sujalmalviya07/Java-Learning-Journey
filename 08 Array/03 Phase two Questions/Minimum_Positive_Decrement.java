public class Minimum_Positive_Decrement {
    public static void main(String[] args){
        int[] scores = {8, 3, 6, 2, 10, 5};
        System.out.println(minImprovement(scores));
    }
    public static int minImprovement(int[]scores){
        int minImprovement=Integer.MAX_VALUE;

        for(int i=0; i< scores.length-1;i++){
            for(int j=0+i; j< scores.length; j++){
                int improvement = scores[j]-scores[i];

                if(improvement>0){
                    if(improvement<minImprovement){
                        minImprovement=improvement;
                    }
                }
            }
        }
        if(minImprovement==Integer.MAX_VALUE) return 0;
        return minImprovement;
    }
}