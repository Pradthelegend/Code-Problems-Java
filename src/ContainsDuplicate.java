import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

    public static boolean arry(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,6,7,7,8};
        System.out.println(arry(numbers));
    }
}

