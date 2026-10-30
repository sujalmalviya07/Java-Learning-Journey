public class Daily_Quiz_Increment {
    public static void main(String[] args){

        int[] scores = {8, 3, 6, 2, 10, 1};
        int [] arr = { 1,2,3,2,1};
        System.out.println(maxImprovement(scores));
        System.out.println(maxImprovement(arr));
    }
    static int maxImprovement(int[] scores){
        int minScore=scores[0];
        int maxImprovement=0;
        for(int i =1 ; i< scores.length; i++){
            int improvement= scores[i]-minScore;
            if(improvement>maxImprovement){
                maxImprovement=improvement;
            }
            if(minScore>scores[i]){
                minScore=scores[i];
            }
        }
        return maxImprovement;
    }
}