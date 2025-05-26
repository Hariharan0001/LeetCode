class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int mid = n/2;
        int l = 0;
        int r = n-1;
        while(l<r){
            
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }
            if(arr[mid]<arr[mid+1]){
                l = mid+1;
                mid = l + ((r-l)/2);
            }
            else{
                r = mid;
                mid = l + ((r-l)/2);
            }
        }  
        return -1;
    }
}