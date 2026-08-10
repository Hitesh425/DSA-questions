class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0,j=nums.length-1; i<j; ){
            if (nums[i]+nums[j]==target) return new int[] {i+1,j+1};
            else if (nums[i]+nums[j]<target) i++;
            else if (nums[i]+nums[j]>target) j--;
        }
        return new int[] {};
    }
}