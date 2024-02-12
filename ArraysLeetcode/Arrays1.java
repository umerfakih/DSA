package ArraysLeetcode;

public class Arrays1 {
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            System.out.println(find(nums, 9));
        }

        static int[] find(int[] nums, int target){
            int[] ans = {-1 , -1};
            if(nums[0] + nums[1] == target){
                ans[0] = 0;
                ans[1] = 1;
                return ans;
            }
            for(int i = 0; i < nums.length - 1 ; i++ ){
               for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
               }
            }
            return ans;
            
        }


}
