//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        int x = 0;
        for(int i = 0; i<nums.length; i++){
            x = target-nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(x == nums[j]) 
                {   
                    res[0] = i; res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}