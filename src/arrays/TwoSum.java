package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = {0,1,3,7,5};

        System.out.println(Arrays.toString(twoSum.twoSum(nums,8)));
    }
}
