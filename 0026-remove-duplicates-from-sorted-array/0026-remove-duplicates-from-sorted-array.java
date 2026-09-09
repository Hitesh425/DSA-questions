class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for (int i=0, j=1; j<nums.length; j++){
            if (nums[i]==nums[j]) continue;
            else{
                i++;
                nums[i]=nums[j];
                k=i;
            }
        }
        return k+1;
    }
}