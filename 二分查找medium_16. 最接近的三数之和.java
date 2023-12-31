//https://leetcode-cn.com/problems/3sum-closest/
/**
[i][start][end][]
[i][start][][end]
[i][][start][end]
[][i][start][end]
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int start=i+1, end=nums.length-1;
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(target-sum) < Math.abs(target-ans)){
                    ans = sum;
                }
                if(sum > target) {
                    end--;
                }else if(sum < target) {
                    start ++;
                }else{
                    return ans;
                }
            }
        }
        
        return ans;
    }
}