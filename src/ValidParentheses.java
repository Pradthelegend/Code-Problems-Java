/*
You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
Explanation: The brackets are not closed in the correct order.


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String inputString) {

        Stack<Character> stack = new Stack<>();

        for(char c : inputString.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            } else if (c == ']' || c == ')' || c == '}') {
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                        (c == ']' && top == '[') ||
                        (c == '}' && top == '{')) {
                    stack.pop(); // matched, remove from stack
                } else {
                    // Mismatch → invalid string
                    return false; // mismatch
                }
            }
        }
        // If stack is empty → all brackets were matched correctly
        return stack.isEmpty();

    }

    public static void main(String[] args) {

        System.out.println(isValid("[]"));        // true
        System.out.println(isValid("([{}])"));    // true
        System.out.println(isValid("[(])"));      // false
        System.out.println(isValid("[({})]"));    // true

    }
}
