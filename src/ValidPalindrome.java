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
        String originalString = inputString;
        System.out.println(originalString);
        String correctedString = originalString.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(correctedString);
        char[] reverseOperation = correctedString.toCharArray();

//        List<Character> lst = new ArrayList<>();
//        for(int i=reverseOperation.length -1;i>=0;i--){
//            lst.add(reverseOperation[i]);
//         }

        char[] ch= new char[correctedString.length()];
        for(int i=0;i<correctedString.length();i++){
            for(int j=reverseOperation.length -1;j>=0;j--){
                ch[i]=reverseOperation[j];
                break;
            }
        }

        System.out.println(ch);
//        String str = new String(lst);


//        System.out.println("List"+lst);
         return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
//        ValidPalindrome.isPalindrome("Interview!@Kickstart23");
        ValidPalindrome.isPalindrome(input);

    }
}
