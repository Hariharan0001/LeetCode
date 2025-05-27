class Solution {
    public long lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    public long gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public int nthMagicalNumber(int n, int a, int b) {
        long low = Math.min(a,b);
        long high = (long) 1e18;
        long mid;
        long lcm_val = lcm(a,b);
        long count;
        long mod = 1000000007;
        while(low<=high){
            mid = low + (high-low)/2;
            count = mid/a + mid/b - mid/lcm_val;
            if(count>=n){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return (int) (low % mod);
    }
}