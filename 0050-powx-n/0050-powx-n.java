class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if (exp<0){
            return 1.0/power(x,-exp);
        }
        return power(x,n);
    }
    public double power(double x, long n){
        if (n==0) return 1.0;
        double half = power(x,n/2);
        if (n%2==0) return half*half;
        return half*half*x;
    }
}