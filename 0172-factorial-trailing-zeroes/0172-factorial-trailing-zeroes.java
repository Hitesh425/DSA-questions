class Solution {
    public int trailingZeroes(int n) {
        int m = 5;
        int total = 0;
        while(m<=n){
            total+=n/m;
            m*=5;
        }
        return total;
    }
}