import java.util.Arrays;

public class ValidAnagrams {
    //Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
    //An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

    public static boolean anagram(String FirstWord, String SecondWord){

        if(FirstWord.length()==SecondWord.length()){

        }else {
            return false;
        }

        char[] FirstWordArray = FirstWord.toCharArray();
        char[] SecondWordArray = SecondWord.toCharArray();
        Arrays.sort(FirstWordArray);
        Arrays.sort(SecondWordArray);
        System.out.println(FirstWordArray);
        System.out.println(SecondWordArray);
        return Arrays.equals(FirstWordArray,SecondWordArray);

    }


    public static void main(String[] args){
        System.out.println(anagram("Car Race","Race Car"));
    }
}
