import java.util.Arrays;

/**
 * Leetcode: 49
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        if(Arrays.equals(s_arr, t_arr))
            return true;
        else
            return false;
    }
}
