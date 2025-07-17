/*
Two Sum
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input:
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
 */

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TwoSum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter : ");
        int size = sc.nextInt();

        int nums[] = new int[size];
        for(int i =0;i<size;i++){
            System.out.println("Enter the Element : ");
            nums[i] = sc.nextInt();
        }

        int target;
        System.out.println("Enetr the target value : ");
        target = sc.nextInt();
        System.out.println(target);

        List<Integer> lst = new ArrayList<>();

        for(int i : nums){
            lst.add(i);
        }

        System.out.println(lst);

//        for (int i=0;i<nums.length;i++) {
//            for(int j=0;j<nums.length;j++){
//                if (nums[i] + nums[j + 1] == target) {
//                    System.out.println(nums[i] + " " + nums[j]);
//                }
//            }
//        }

        for (int i=0;i<nums.length;i++) {
            for(int j : nums){
                if(nums[i]+j==target && nums[i] !=j){
                    System.out.println("[" + lst.indexOf(nums[i]) + " " + lst.indexOf(j) + "]");
                }
                 break;
            }
        }



//        Predicate<Integer> p1 = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                for (int i=0;i<nums.length;i++){
//                    if(nums[i] + nums[i+1]==target){
//                        System.out.println(nums[i] + " "+ nums[i+1]);
//                    }else {
//                        System.out.println("No Match");
//                    }
//                }
//                return false;
//            }
//        };
//
//        int result = lst.stream()
//                .filter(p1)
//                .reduce(0,(c,e) -> {
//                    if(c+e==target){
//                        return lst.indexOf(c);
//
//                    }
//                    return 1;
//                });
//
//
//        System.out.println("Result " + result);

    }
}
