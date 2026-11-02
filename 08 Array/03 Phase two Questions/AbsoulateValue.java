public class AbsoulateValue {
    public static void main(String[] args){
        int[] nums = {3, 2, 1, 5, 4};
        int k = 2;
        System.out.println(countKDifference(nums,k));

    }

        public  static int countKDifference(int[] nums, int k) {
            int count=0;

            for(int i=0 ; i<nums.length-1;i++){
                for(int j =i+1; j<nums.length; j++){
                    int value=nums[i]-nums[j];

                    if(Math.abs(value)==k){
                        count++;
                    }
                }

            }
            if(count==0){
                return 0;
            }
            return count;
        }
    }


