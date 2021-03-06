package leetcode;

public class Solution33 {

    //在循环有序数组中，用二分查找等于给定值的元素
    public int search(int[] nums, int target) {
        if(nums == null) return -1;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < nums[r]) {
                if(nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
            }
            else {
                if(nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }


}
