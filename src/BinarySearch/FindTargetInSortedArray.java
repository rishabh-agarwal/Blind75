package BinarySearch;

/**
 * Leetcode: 33
 **/
public class FindTargetInSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int midPoint = left+right/2;
            if(nums[midPoint]==target){
                return midPoint;
            }

            if(nums[midPoint]>target)
                left = midPoint;
            else
                right = midPoint;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3,4,5,6,1,2}, 1));
        System.out.println(search(new int[]{3,5,6,0,1,2}, 4));
    }
}
