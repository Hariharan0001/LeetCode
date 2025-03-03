class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxval = 0;
        int i=0,j=0;
        int n = nums.length;
        while(j<n){
            if(nums[j]!=0){
                maxval = Math.max(maxval,j-i+1);
                j++;
            }
            else{
                j++;
                i=j;
            }
        }
        return maxval;
    }
}