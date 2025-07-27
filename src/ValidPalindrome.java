import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*
Given a string s, return true if it is a palindrome, otherwise return false.
A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:
Input: s = "Was it a car or a cat I saw?"
Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String inputString){
        String originalString = inputString.toUpperCase();
        System.out.println(originalString);
        String correctedString = originalString.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
//        System.out.println(correctedString);
        char[] reverseOperation = correctedString.toCharArray();

        List<Character> beforeReverseOperation = new ArrayList<>();
        for (char c : reverseOperation){
            beforeReverseOperation.add(c);
        }


        List<Character> lst = new ArrayList<>();
        for(int i=reverseOperation.length -1;i>=0;i--){
            lst.add(reverseOperation[i]);
         }



         System.out.println(beforeReverseOperation);
        System.out.println(lst);

        boolean status=true;
        Break: //This is a labeled break.
        for(int i=reverseOperation.length -1;i>=0;i--){
            for(int j=reverseOperation.length -1;j>=0;j--){
                if(beforeReverseOperation.get(i)==lst.get(j)){
                    status = true;
                }else {
                    status = false;
                    break Break;
                }
            }
        }

         return status;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
//        ValidPalindrome.isPalindrome("Interview!@Kickstart23");
        System.out.println(ValidPalindrome.isPalindrome(input));

    }
}
