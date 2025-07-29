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

public class ValidParentheses {

    public static boolean isValid(String inputString) {

         String originalString = inputString;
//        if(originalString.contains("[a-zA-Z0-9]")){
//            return status;
//        }
        char[] originalToChar = originalString.toCharArray();

        List<Character> orignalLst = new ArrayList<>();
        for (char c : originalToChar){
            orignalLst.add(c);
        }
        System.out.println(orignalLst);

        List<Character> reverseLst = new ArrayList<>();

        for(int i=originalToChar.length -1;i>=0;i--){
            reverseLst.add(originalToChar[i]);
        }

        System.out.println(reverseLst);

        boolean status = false;
        for(int i=0;i<originalString.length();i++){
            for(int j = originalToChar.length -1; j>=0; j--){
                if (orignalLst.get(i).equals(reverseLst.get(j))){
                    status = true;
                }
            }
        }


        return status;
    }

    public static void main(String[] args) {

        System.out.println(ValidParentheses.isValid("[({})]0"));
    }
}
