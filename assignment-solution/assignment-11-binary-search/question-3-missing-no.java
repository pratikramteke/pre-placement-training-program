class Solution {
    public int missingNumber(int[] nums) {
     Arrays.sort(nums);
     int s=0;
     int e=nums.length - 1;
     while(s<=e){
         int mid=(s+e)/2;
         if(nums[mid]==mid){
            s=mid+1;
         }
        else{
        e=mid-1;
        }
     }
     return s;   
    }
}