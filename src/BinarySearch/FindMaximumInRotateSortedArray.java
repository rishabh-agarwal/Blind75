package BinarySearch;

/**
 * Leetcode: No Associated question | self practice
 **/
public class FindMaximumInRotateSortedArray {
    public static int findMax(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(nums[r] >= nums[l])
                return nums[r];

            if(nums[mid]>nums[r])
                r = mid+1;
            else
                l = mid;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{3,4,5,6,1,2}));
        System.out.println(findMax(new int[]{1,2,3,4,5,6}));
    }
}
