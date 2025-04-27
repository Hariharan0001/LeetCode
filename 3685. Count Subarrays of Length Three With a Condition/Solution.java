class Solution {
    public int countSubarrays(int[] nums) {
       int ans = 0;
       int i = 0;
       while(i<nums.length-2){
        if((nums[i]+nums[i+2])*2==nums[i+1]) ans++;
        i++;
       } 
       return ans;
    }
}