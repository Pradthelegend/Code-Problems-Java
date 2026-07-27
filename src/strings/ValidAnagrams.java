package strings;

import java.util.HashMap;
import java.util.Map;

//Given two strings s and t, return true if t is an anagram of s, otherwise return false.
public class ValidAnagrams {

    public static boolean validAnagrams(String t, String s){

        if (t.length() != s.length()) return false;

        Map<Character,Integer> map = new HashMap<>();

        for (char c :t.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        for (char c1 :s.toCharArray()){
            if (!map.containsKey(c1)){
                return false;
            }
            map.put(c1, map.get(c1) -1);
            if (map.get(c1) == 0) map.remove(c1);
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(validAnagrams("pradd","pradd"));
    }
}
