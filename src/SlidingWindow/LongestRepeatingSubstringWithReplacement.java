package SlidingWindow;

import java.util.*;

/**
 * Leetcode: 424
 **/
public class LongestRepeatingSubstringWithReplacement {
    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(currentChar));

            // If the current window size minus the frequency of the most frequent character is greater than k,
            // shrink the window from the left
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAA", 0)); //2
        System.out.println(characterReplacement("XYYX", 2)); //4
        System.out.println(characterReplacement("AABABBA", 1)); //4
    }

}
