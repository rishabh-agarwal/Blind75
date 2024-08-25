package TwoPointer;

import java.util.*;

/**
 * Leetcode: 15
**/
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        if(len==0)
            return new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();


        for(int i=0; i<len; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int numberNeeded = 0-nums[i];
            int l = i+1;
            int r = len-1;

            while(l<r) {
                if (nums[l] + nums[r] == numberNeeded) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (nums[l] + nums[r] < numberNeeded)
                    l++;
                else if (nums[l] + nums[r] > numberNeeded)
                    r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-2,-1,0,1,2}));
    }
}

