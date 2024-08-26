package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode: 3
 **/
public class LongestSubstringWithoutDuplicate {
    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int max = 0;

        for(int i=0; i<arr.length; i++){
            int j=i;
            Set<Character> set = new HashSet<>();
            int curr = 0;
            while(j<arr.length){
                if(set.contains(arr[j])){
                    break;
                }
                else{
                    set.add(arr[j]);
                    curr++;
                    j++;
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
