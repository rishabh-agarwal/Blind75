package BinarySearch;

import java.util.Arrays;

/**
 * Leetcode: 153
 **/
public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(nums[r]>nums[l]) return nums[l];

            if(nums[r]<nums[l] && nums[mid]>nums[r])
                l = mid+1;
            else
                l = mid;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,6,1,2}));
        System.out.println(findMin(new int[]{1,2,3,4,5,6}));
    }
}
// 1,2,3,4
// 4,1,2,3
// 3,4,1,2
// 2,3,4,1