package TwoPointer;

/**
 * Leetcode: 125
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        char[] s_arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: s_arr){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        String originalString = sb.toString();
        String reverseString = sb.reverse().toString();

        return originalString.equalsIgnoreCase(reverseString) ? true: false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("tab a cat"));
    }
}
