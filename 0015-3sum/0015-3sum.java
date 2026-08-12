class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(nums);
        for (int n=0; n<nums.length; n++){
            if (n>0 && nums[n]==nums[n-1]) continue;
            for (int i=n+1,j=nums.length-1; i<j; ){
                if (nums[i]+nums[j]==-nums[n]){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[n]);
                    lst.add(l);
                    i++;
                    j--;
                    while(i<j && nums[i]==nums[i-1]){
                        i++;
                    }
                    while(i<j && nums[j]==nums[j+1]){
                        j--;
                    }
                }
                else if (nums[i]+nums[j]>-nums[n]) j--;
                else i++;
            }
        }
        return lst;
    }
}