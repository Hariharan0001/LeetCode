class Solution {
    public int[] findErrorNums(int[] nums) {
        long sum1 = 0;
        long sum2 = 0;
        long n = nums.length;
        long sumn = (n*(n+1))/2;
        long sumsqrn = (n*(n+1)*(2*n+1))/6; 
        for(int x:nums){
            sum1 += x;
            sum2 += x*x;
        }
        int dif1 = (int)(sum1 - sumn);
        int dif2 = (int)(sum2 - sumsqrn);
        int tot = dif2/dif1;
        int dup = (tot+dif1)/2;
        int mising = tot - dup;
        return new int[]{dup,mising};
    }
}