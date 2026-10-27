public class Third_Distinct {
    public static void main(String[] args) {

        int[] nums = {5, 5, 10, 3, 8};

        System.out.println(thirdMax(nums));
    }
        static int thirdMax(int [] nums){
            long first = Long.MIN_VALUE;
            long second = Long.MIN_VALUE;
            long third = Long.MIN_VALUE;

            for(int num : nums){

                if(num==first || num==second || num==third){
                    continue;
                }
                if(first<num){
                    third=second;
                    second=first;
                    first=num;
                }
                else if(num>second){
                    third=second;
                    second=num;
                }
                else if(num>third){
                    third=num;
                }

            }
            if(third==Long.MAX_VALUE){

                return  (int) first;

            }
            return (int ) third;
        }
}