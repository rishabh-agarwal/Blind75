package Stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Leetcode: 20
 **/
public class ValidParentheses {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);

            if(map.containsKey(currChar)){
                stack.push(currChar);
            }else{
                if(stack.empty())
                    return false;
                else if(map.get(stack.peek()).equals(currChar)){
                    stack.pop();
                }
                else return false;
            }
        }

        if(stack.empty())
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isValid("[]"));
    }
}
