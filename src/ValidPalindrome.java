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
        String correctedString = originalString.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();//"^" this is a not operator.
//        System.out.println(correctedString);
        char[] reverseOperation = correctedString.toCharArray();

        List<Character> beforeReverseOperation = new ArrayList<>();
        for (char c : reverseOperation){
            beforeReverseOperation.add(c);
        }

        List<Character> afterReverseOperation = new ArrayList<>();
        for(int i=reverseOperation.length -1;i>=0;i--){
             afterReverseOperation.add(reverseOperation[i]);
         }

        System.out.println(beforeReverseOperation);
        System.out.println(afterReverseOperation);

//        boolean status=true;
//        Break: //This is a labeled break.
//        for(int i=reverseOperation.length -1;i>=0;i--){
//            for(int j=reverseOperation.length -1;j>=0;j--){
//                if(beforeReverseOperation.get(i).equals(afterReverseOperation.get(j))){
//                    status = true;
//                }else {
//                    status = false;
//                    break Break;
//                }
//            }
//        }

        boolean status = true;
        for (int i = 0; i < beforeReverseOperation.size(); i++) {
            if (!beforeReverseOperation.get(i).equals(afterReverseOperation.get(i))) {
                status = false;
                break;
            }
        }
        return status;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(ValidPalindrome.isPalindrome(input));

    }
}
