class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int k=nums.length-1;
        for (int i=0,j=nums.length-1; i<=j;){
            if (Math.abs(nums[i])>=Math.abs(nums[j])){
                arr[k--] = nums[i]*nums[i];
                i++;
            }
            else if (Math.abs(nums[i])<Math.abs(nums[j])){
                arr[k--] = nums[j]*nums[j];
                j--;
            }
        }
        return arr;
    }
}