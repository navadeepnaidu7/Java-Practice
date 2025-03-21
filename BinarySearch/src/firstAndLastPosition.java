//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//for this code we will do binary search multiple times after finding the mid

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int s = search(nums, target, true);
        int e = search(nums, target, false);

        ans[0] = s;
        ans[1] = e;
        return ans;
    }

    int search(int[] nums, int target, boolean forStartIndex){
        int start = 0; 
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if( target < nums[mid]){
                end = mid - 1;
            } else{
                ans = mid;
                // searches less than the mid and greater than mid possible positions
                if(forStartIndex == true){ // this basically means are you seraching for other positions of target less than the mid returned?  
                    end = mid - 1;
                } else { // this basically means are you seraching for other positions of target greater than the mid returned?
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}