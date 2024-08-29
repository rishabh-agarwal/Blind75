package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode: 76
 **/
public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        Map<Character, Integer> req = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();
        String minSubstring = "";
        //Contains the character with the count required for min substring
        for(Character c: t.toCharArray()){
            req.put(c, req.getOrDefault(c, 0)+1);
        }

        for(int l=0; l<s.length(); l++){
            have.clear();
            for(int r=l; r<s.length(); r++){
                char currChar = s.charAt(r);
                if(req.containsKey(currChar)){
                    have.put(currChar, have.getOrDefault(currChar, 0)+1);
                }
                if(hasSufficientCharacters(req, have)) {
                    String currSubstring = s.substring(l, r+1);
                    if(minSubstring.isEmpty() || currSubstring.length()< minSubstring.length())
                        minSubstring=currSubstring;
                    if(have.containsKey(s.charAt(l)))
                        have.put(s.charAt(l), have.get(s.charAt(l))-1);
                    break;
                }
            }
        }

        return minSubstring;
    }

    public static boolean hasSufficientCharacters(Map<Character, Integer> req, Map<Character, Integer> have) {
        for (Map.Entry<Character, Integer> entry : req.entrySet()) {
            char key = entry.getKey();
            int requiredValue = entry.getValue();

            if (!have.containsKey(key) || have.get(key) < requiredValue) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("OUZODYXAZV", "XYZ"));
        System.out.println(minWindow("aaaaaaaaaaaabbbbbcdd", "abcdd")); // abbbbbcdd
    }
}