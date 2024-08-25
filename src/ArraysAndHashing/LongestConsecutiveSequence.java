package ArraysAndHashing;

import java.util.Arrays;

/**
 * Leetcode: 128
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        int maxSeq = 0;
        int currSeq = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]==nums[i]){
                continue;
            }
            else if(nums[i+1]-nums[i]==1){
                currSeq ++;
            }else{
                currSeq = 0;
            }
            maxSeq = Math.max(currSeq, maxSeq);
        }

        return maxSeq+1;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{2, 20, 4, 10, 3, 4, 5}));
    }
}
