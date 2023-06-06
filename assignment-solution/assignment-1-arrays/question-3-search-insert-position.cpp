// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1

// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

 

// Constraints:

//     1 <= nums.length <= 104
//     -104 <= nums[i] <= 104
//     nums contains distinct values sorted in ascending order.
//     -104 <= target <= 104



#include<bits/stdc++.h>
using namespace std;

int searchInsert(vector<int>& nums, int target) {
        int left=0;
        int right=nums.size();
        int mid;
        if(target>nums[right-1]){
            return right;
        }
        while(left<=right){
        mid=(left+right)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target<nums[mid]){
            right=mid-1;
        }else{
            left=mid+1;
        }
        }
        return left;
    }


int main(){
  vector<int> nums;
  int target;
  cin>>target;
  int a;
  while(cin>>a)
  { 
    nums.push_back(a);
  }
  int ans = searchInsert(nums,target);
  cout<<ans;
  return 0;
}