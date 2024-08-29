package SlidingWindow;

import java.util.*;

/**
 * Leetcode: 424
 **/
public class LongestRepeatingSubstringWithReplacement {
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxLen = 0;
        int left = 0;

        for(int right=0; right<s.length(); right++){
            char currChar = s.charAt(right);
            map.put(currChar, map.getOrDefault(currChar, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(currChar));

            //max condition
            while((right-left+1) - maxFreq > k){
                map.put(s.charAt(left), map.get(currChar) - 1);
                left++;
            }

            maxLen = Math.max(right-left+1, maxFreq);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAA", 0)); //2
        System.out.println(characterReplacement("XYYX", 2)); //4
        System.out.println(characterReplacement("AABABBA", 1)); //4
    }

}
