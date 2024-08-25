/**
 * Leetcode: 238
 */
public class ProductOfArrayDiscludingSelf {
    public int[] productExceptSelf(int[] nums) {
        int totalSum = nums[0];
        for(int i=1; i<nums.length; i++)
            totalSum *= nums[i];

        int[] res = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0) {
                res[i] = totalSum / nums[i];
            }else{

            }
        }
        return res;
    }
}
