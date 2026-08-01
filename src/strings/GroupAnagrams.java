package strings;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] s){
        Map<String, List<String>> map = new HashMap<>();

        for (String strings : s){
            char[] c = strings.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);

            if (map.containsKey(sortedString)){
                map.get(sortedString).add(strings);
            }else {
                map.put(sortedString,new ArrayList<>());
                map.get(sortedString).add(strings);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] s = {"eat","tea","tan","ate","nat","bat"};
//        String[] s = {"prad","prad","prad","prad","nat","bat"};

        System.out.println(groupAnagrams(s));
    }
}
