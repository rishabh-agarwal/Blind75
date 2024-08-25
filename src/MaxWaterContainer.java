/**
 * Leetcode: 11
 **/
public class MaxWaterContainer {

    public static int maxArea(int[] heights) {
      int len = heights.length;
      int max = 0;
      int left = 0;
      int right = len-1;

      while(left<right){

          int curr = (right-left) * (Math.min(heights[left], heights[right]));
          max = Math.max(curr, max);

          if(heights[left] > heights[right])
              right--;
          else if (heights[left] < heights[right])
              left++;
          else {
              left++;
              right--;
          }
      }

      return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,7,2,5,4,7,3,6}));
        System.out.println(maxArea(new int[]{2,2,2}));
    }
}
